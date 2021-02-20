package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Control
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Toolbar extends Control {
  
  /**
    * Adds some ariaLabelledBy into the association <code>ariaLabelledBy</code>.
    * @param vAriaLabelledBy the ariaLabelledBy to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addAriaLabelledBy(vAriaLabelledBy: js.Any): Toolbar = js.native
  def addAriaLabelledBy(vAriaLabelledBy: Control): Toolbar = js.native
  
  /**
    * Adds some content to the aggregation <code>content</code>.
    * @param oContent the content to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addContent(oContent: Control): Toolbar = js.native
  
  /**
    * Sets classes and tag according to the context in the page. Possible contexts are header, footer,
    * subheader
    */
  var applyTagAndContextClassFor: js.Any = js.native
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>press</code> event of this
    * <code>sap.m.Toolbar</code>.When called, the context of the event handler (its <code>this</code>)
    * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.Toolbar</code> itself.Fired when the user clicks on the toolbar, if the Active property
    * is set to "true".
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.Toolbar</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachPress(oData: js.Any, fnFunction: js.Any): Toolbar = js.native
  def attachPress(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Toolbar = js.native
  
  /**
    * Destroys all the content in the aggregation <code>content</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyContent(): Toolbar = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>press</code> event of this
    * <code>sap.m.Toolbar</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachPress(fnFunction: js.Any, oListener: js.Any): Toolbar = js.native
  
  /**
    * Fires event <code>press</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>srcControl</code> of type <code>sap.ui.core.Control</code>The toolbar item
    * that was pressed</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def firePress(mArguments: js.Any): Toolbar = js.native
  
  /**
    * Gets current value of property <code>active</code>.Indicates that the whole toolbar is clickable.
    * The Press event is fired only if Active is set to true.Note: This property should be used when there
    * are no interactive controls inside the toolbar and the toolbar itself is meant to be
    * interactive.Default value is <code>false</code>.
    * @returns Value of property <code>active</code>
    */
  def getActive(): Boolean = js.native
  
  /**
    * Returns the currently applied design property of the Toolbar.
    */
  def getActiveDesign(): ToolbarDesign = js.native
  
  /**
    * Returns array of IDs of the elements which are the current targets of the association
    * <code>ariaLabelledBy</code>.
    */
  def getAriaLabelledBy(): js.Array[_] = js.native
  
  /**
    * Gets content of aggregation <code>content</code>.The content of the toolbar.
    */
  def getContent(): js.Array[Control] = js.native
  
  /**
    * Gets current value of property <code>design</code>.Defines the toolbar design.Note: Design settings
    * are theme-dependent. They also determine the default height of the toolbar.Default value is
    * <code>Auto</code>.
    * @since 1.16.8
    * @returns Value of property <code>design</code>
    */
  def getDesign(): ToolbarDesign = js.native
  
  /**
    * Gets current value of property <code>enabled</code>.Sets the enabled property of all controls
    * defined in the content aggregation.Note: This property does not apply to the toolbar itself, but
    * rather to its items.Default value is <code>true</code>.
    * @returns Value of property <code>enabled</code>
    */
  def getEnabled(): Boolean = js.native
  
  /**
    * Gets the HTML tag of the root domref
    */
  var getHTMLTag: js.Any = js.native
  
  /**
    * Gets current value of property <code>height</code>.Defines the height of the control.Note: By
    * default, the Height property depends on the used theme and the Design property.Default value is
    * <code></code>.
    * @returns Value of property <code>height</code>
    */
  def getHeight(): js.Any = js.native
  
  /**
    * Returns the first sap.m.Title control id inside the toolbar for the accessibility
    * @since 1.28
    */
  def getTitleId(): String = js.native
  
  /**
    * Gets current value of property <code>width</code>.Defines the width of the control.By default,
    * Toolbar is a block element. If the the width is not explicitly set, the control will assume its
    * natural size.
    * @returns Value of property <code>width</code>
    */
  def getWidth(): js.Any = js.native
  
  /**
    * Checks for the provided <code>sap.ui.core.Control</code> in the aggregation <code>content</code>.and
    * returns its index if found or -1 otherwise.
    * @param oContent The content whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfContent(oContent: Control): Double = js.native
  
  /**
    * Inserts a content into the aggregation <code>content</code>.
    * @param oContent the content to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the content should be inserted at; for             a
    * negative value of <code>iIndex</code>, the content is inserted at position 0; for a value           
    *  greater than the current size of the aggregation, the content is inserted at             the last
    * position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertContent(oContent: Control, iIndex: Double): Toolbar = js.native
  
  /**
    * Returns if the bar is sensitive to the container context. Implementation of the IBar interface
    */
  var isContextSensitive: js.Any = js.native
  
  /**
    * Removes all the controls in the association named <code>ariaLabelledBy</code>.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllAriaLabelledBy(): js.Array[_] = js.native
  
  /**
    * Removes all the controls from the aggregation <code>content</code>.Additionally, it unregisters them
    * from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllContent(): js.Array[Control] = js.native
  
  def removeAriaLabelledBy(vAriaLabelledBy: js.Any): js.Any = js.native
  /**
    * Removes an ariaLabelledBy from the association named <code>ariaLabelledBy</code>.
    * @param vAriaLabelledBy The ariaLabelledBy to be removed or its index or ID
    * @returns The removed ariaLabelledBy or <code>null</code>
    */
  def removeAriaLabelledBy(vAriaLabelledBy: Double): js.Any = js.native
  def removeAriaLabelledBy(vAriaLabelledBy: Control): js.Any = js.native
  
  def removeContent(vContent: String): Control = js.native
  /**
    * Removes a content from the aggregation <code>content</code>.
    * @param vContent The content to remove or its index or id
    * @returns The removed content or <code>null</code>
    */
  def removeContent(vContent: Double): Control = js.native
  def removeContent(vContent: Control): Control = js.native
  
  /**
    * Sets a new value for property <code>active</code>.Indicates that the whole toolbar is clickable. The
    * Press event is fired only if Active is set to true.Note: This property should be used when there are
    * no interactive controls inside the toolbar and the toolbar itself is meant to be interactive.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.Default value is <code>false</code>.
    * @param bActive New value for property <code>active</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setActive(bActive: Boolean): Toolbar = js.native
  
  /**
    * Sets a new value for property <code>design</code>.Defines the toolbar design.Note: Design settings
    * are theme-dependent. They also determine the default height of the toolbar.When called with a value
    * of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>Auto</code>.
    * @since 1.16.8
    * @param sDesign New value for property <code>design</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setDesign(sDesign: ToolbarDesign): Toolbar = js.native
  
  /**
    * Sets a new value for property <code>enabled</code>.Sets the enabled property of all controls defined
    * in the content aggregation.Note: This property does not apply to the toolbar itself, but rather to
    * its items.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.Default value is <code>true</code>.
    * @param bEnabled New value for property <code>enabled</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setEnabled(bEnabled: Boolean): Toolbar = js.native
  
  /**
    * Sets the HTML tag of the root domref
    */
  var setHTMLTag: js.Any = js.native
  
  /**
    * Sets a new value for property <code>height</code>.Defines the height of the control.Note: By
    * default, the Height property depends on the used theme and the Design property.When called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code></code>.
    * @param sHeight New value for property <code>height</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setHeight(sHeight: js.Any): Toolbar = js.native
  
  /**
    * Sets a new value for property <code>width</code>.Defines the width of the control.By default,
    * Toolbar is a block element. If the the width is not explicitly set, the control will assume its
    * natural size.When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.
    * @param sWidth New value for property <code>width</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setWidth(sWidth: js.Any): Toolbar = js.native
}
