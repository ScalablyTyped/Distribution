package typings.openui5.sapNs.uiNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.HTML")
@js.native
class HTML protected () extends Control {
  /**
    * Constructor for a new HTML.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>afterRendering</code> event of this
    * <code>sap.ui.core.HTML</code>.When called, the context of the event handler (its <code>this</code>)
    * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.ui.core.HTML</code> itself.Fired after the HTML control has been rendered. Allows to
    * manipulate the resulting DOM.When the control doesn't have string content and no preserved DOM
    * existed for this control,then this event will fire, but there won't be a DOM node for this control.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.ui.core.HTML</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachAfterRendering(oData: js.Any, fnFunction: js.Any): HTML = js.native
  def attachAfterRendering(oData: js.Any, fnFunction: js.Any, oListener: js.Any): HTML = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>afterRendering</code> event of this
    * <code>sap.ui.core.HTML</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachAfterRendering(fnFunction: js.Any, oListener: js.Any): HTML = js.native
  /**
    * Fires event <code>afterRendering</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>isPreservedDOM</code> of type <code>boolean</code>Whether the current DOM
    * of the control has been preserved (true) or not (e.g.rendered from content property or it is an
    * empty HTML control).</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireAfterRendering(mArguments: js.Any): HTML = js.native
  /**
    * Gets current value of property <code>content</code>.HTML content to be displayed, defined as a
    * string.The content is converted to DOM nodes with a call to <code>new jQuery(content)</code>, so
    * anyrestrictions for the jQuery constructor apply to the content of the HTML control as well.Some of
    * these restrictions (there might be others!) are:<ul><li>the content must be enclosed in tags, pure
    * text is not supported. </li><li>if the content contains script tags, they will be executed but they
    * will not appear in the    resulting DOM tree. When the contained code tries to find the
    * corresponding script tag,    it will fail.</li></ul>Please consider to consult the jQuery
    * documentation as well.The HTML control currently doesn't prevent the usage of multiple root nodes in
    * its DOM content(e.g. <code>setContent("&lt;div/>&lt;div/>")</code>), but this is not a guaranteed
    * feature.The accepted content might be restricted to single root nodes in future versions.To notify
    * applications about this fact, a warning is written in the log when multiple root nodes are used.
    * @returns Value of property <code>content</code>
    */
  def getContent(): String = js.native
  /**
    * Gets current value of property <code>preferDOM</code>.Whether existing DOM content is preferred over
    * the given content string.There are two scenarios where this flag is relevant (when set to
    * true):<ul><li>for the initial rendering: when an HTML control is added to an UIArea for the first
    * time    and if the root node of that UIArea contained DOM content with the same id as the HTML   
    * control, then that content will be used for rendering instead of any specified string   
    * content</li><li>any follow-up rendering: when an HTML control is rendered for the second or any
    * later    time and the preferDOM flag is set, then the DOM from the first rendering is preserved   
    * and not replaced by the string content</li></ul>As preserving the existing DOM is the most common
    * use case of the HTML control, the default value is true.Default value is <code>true</code>.
    * @returns Value of property <code>preferDOM</code>
    */
  def getPreferDOM(): Boolean = js.native
  /**
    * Gets current value of property <code>sanitizeContent</code>.Whether to run the HTML sanitizer once
    * the content (HTML markup) is applied or not.To configure allowed URLs please use the whitelist API
    * via jQuery.sap.addUrlWhitelist.Default value is <code>false</code>.
    * @returns Value of property <code>sanitizeContent</code>
    */
  def getSanitizeContent(): Boolean = js.native
  /**
    * Sets a new value for property <code>content</code>.HTML content to be displayed, defined as a
    * string.The content is converted to DOM nodes with a call to <code>new jQuery(content)</code>, so
    * anyrestrictions for the jQuery constructor apply to the content of the HTML control as well.Some of
    * these restrictions (there might be others!) are:<ul><li>the content must be enclosed in tags, pure
    * text is not supported. </li><li>if the content contains script tags, they will be executed but they
    * will not appear in the    resulting DOM tree. When the contained code tries to find the
    * corresponding script tag,    it will fail.</li></ul>Please consider to consult the jQuery
    * documentation as well.The HTML control currently doesn't prevent the usage of multiple root nodes in
    * its DOM content(e.g. <code>setContent("&lt;div/>&lt;div/>")</code>), but this is not a guaranteed
    * feature.The accepted content might be restricted to single root nodes in future versions.To notify
    * applications about this fact, a warning is written in the log when multiple root nodes are used.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.
    * @param sContent New value for property <code>content</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setContent(sContent: String): HTML = js.native
  /**
    * Sets some new DOM content for this HTML control. The content will replace the existing contentafter
    * the next rendering. Properties are not modified, but preferDOM should be set to true.
    * @param oDom the new DOM content
    * @returns <code>this</code> to facilitate method chaining
    */
  def setDOMContent(oDom: Element): HTML = js.native
  /**
    * Sets a new value for property <code>preferDOM</code>.Whether existing DOM content is preferred over
    * the given content string.There are two scenarios where this flag is relevant (when set to
    * true):<ul><li>for the initial rendering: when an HTML control is added to an UIArea for the first
    * time    and if the root node of that UIArea contained DOM content with the same id as the HTML   
    * control, then that content will be used for rendering instead of any specified string   
    * content</li><li>any follow-up rendering: when an HTML control is rendered for the second or any
    * later    time and the preferDOM flag is set, then the DOM from the first rendering is preserved   
    * and not replaced by the string content</li></ul>As preserving the existing DOM is the most common
    * use case of the HTML control, the default value is true.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>true</code>.
    * @param bPreferDOM New value for property <code>preferDOM</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setPreferDOM(bPreferDOM: Boolean): HTML = js.native
  /**
    * Sets a new value for property <code>sanitizeContent</code>.Whether to run the HTML sanitizer once
    * the content (HTML markup) is applied or not.To configure allowed URLs please use the whitelist API
    * via jQuery.sap.addUrlWhitelist.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>false</code>.
    * @param bSanitizeContent New value for property <code>sanitizeContent</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setSanitizeContent(bSanitizeContent: Boolean): HTML = js.native
}

