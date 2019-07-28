package typings.openui5.sapNs.uiNs.coreNs.tmplNs

import typings.openui5.sapNs.uiNs.coreNs.Control
import typings.openui5.sapNs.uiNs.coreNs.mvcNs.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.tmpl.TemplateControl")
@js.native
class TemplateControl protected () extends Control {
  /**
    * Constructor for a new tmpl/TemplateControl.Accepts an object literal <code>mSettings</code> that
    * defines initialproperty values, aggregated and associated objects as well as event handlers.See
    * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
    * settings object.
    * @param sId id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>afterRendering</code> event of this
    * <code>sap.ui.core.tmpl.TemplateControl</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.ui.core.tmpl.TemplateControl</code> itself.Fired when the Template Control has
    * been (re-)rendered and its HTML is present in the DOM.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.ui.core.tmpl.TemplateControl</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachAfterRendering(oData: js.Any, fnFunction: js.Any): TemplateControl = js.native
  def attachAfterRendering(oData: js.Any, fnFunction: js.Any, oListener: js.Any): TemplateControl = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>beforeRendering</code> event of this
    * <code>sap.ui.core.tmpl.TemplateControl</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.ui.core.tmpl.TemplateControl</code> itself.Fired before this Template Control is
    * re-rendered. Use to unbind event handlers from HTML elements etc.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.ui.core.tmpl.TemplateControl</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachBeforeRendering(oData: js.Any, fnFunction: js.Any): TemplateControl = js.native
  def attachBeforeRendering(oData: js.Any, fnFunction: js.Any, oListener: js.Any): TemplateControl = js.native
  /**
    * Creates a pseudo binding for a aggregation to get notified once the propertychanges to invalidate
    * the control and trigger a re-rendering.
    * @param sPath the binding path
    * @returns the value of the path
    */
  def bindList(sPath: String): js.Any = js.native
  /**
    * Creates a pseudo binding for a property to get notified once the propertychanges to invalidate the
    * control and trigger a re-rendering.
    * @param sPath the binding path
    * @returns the value of the path
    */
  def bindProp(sPath: String): js.Any = js.native
  /**
    * compiles (creates and registers) a new control
    * @param mSettings the settings for the new control
    * @param sParentPath the parent path for the control
    * @param bDoNotAdd if true, then the control will not be         added to the _controls aggregation
    * @param oView undefined
    * @returns new control instance
    */
  def createControl(mSettings: js.Any, sParentPath: String, bDoNotAdd: Boolean, oView: View): Control = js.native
  /**
    * compiles (creates and registers) a new DOM element
    * @param mSettings the settings for the new DOM element
    * @param sParentPath the parent path for the DOM element
    * @param bDoNotAdd if true, then the control will not be         added to the _controls aggregation
    * @returns new DOM element instance
    */
  def createDOMElement(mSettings: js.Any): Control = js.native
  def createDOMElement(mSettings: js.Any, sParentPath: String): Control = js.native
  def createDOMElement(mSettings: js.Any, sParentPath: String, bDoNotAdd: Boolean): Control = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>afterRendering</code> event of this
    * <code>sap.ui.core.tmpl.TemplateControl</code>.The passed function and listener object must match the
    * ones used for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachAfterRendering(fnFunction: js.Any, oListener: js.Any): TemplateControl = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>beforeRendering</code> event of this
    * <code>sap.ui.core.tmpl.TemplateControl</code>.The passed function and listener object must match the
    * ones used for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachBeforeRendering(fnFunction: js.Any, oListener: js.Any): TemplateControl = js.native
  /**
    * Fires event <code>afterRendering</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireAfterRendering(mArguments: js.Any): TemplateControl = js.native
  /**
    * Fires event <code>beforeRendering</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireBeforeRendering(mArguments: js.Any): TemplateControl = js.native
  /**
    * Gets current value of property <code>context</code>.The context is a data object. It can be used for
    * default template expressions. A change of the context object leads to a re-rendering whereas a
    * change of a nested property of the context object doesn't. By default the context is an empty
    * object.
    * @returns Value of property <code>context</code>
    */
  def getContext(): js.Any = js.native
  /**
    * ID of the element which is the current target of the association <code>template</code>, or
    * <code>null</code>.
    */
  def getTemplate(): js.Any = js.native
  /**
    * Returns the instance specific renderer for an anonymous template control.
    * @returns the instance specific renderer function
    */
  def getTemplateRenderer(): js.Any = js.native
  /**
    * checks whether the control is inline or not
    * @returns flag, whether to control is inline or not
    */
  def isInline(): Boolean = js.native
  /**
    * Sets a new value for property <code>context</code>.The context is a data object. It can be used for
    * default template expressions. A change of the context object leads to a re-rendering whereas a
    * change of a nested property of the context object doesn't. By default the context is an empty
    * object.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.
    * @param oContext New value for property <code>context</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setContext(oContext: js.Any): TemplateControl = js.native
  /**
    * Sets the associated <code>template</code>.
    * @param oTemplate ID of an element which becomes the new target of this template association;
    * alternatively, an element instance may be given
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTemplate(oTemplate: js.Any): TemplateControl = js.native
  /**
    * Sets the instance specific renderer for an anonymous template control.
    * @param fnRenderer the instance specific renderer function
    * @returns <code>this</code> to allow method chaining
    */
  def setTemplateRenderer(fnRenderer: js.Any): js.Any = js.native
}

