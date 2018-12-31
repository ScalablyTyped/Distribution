package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.ObjectAttribute")
@js.native
class ObjectAttribute protected ()
  extends openui5Lib.sapNs.uiNs.coreNs.Control {
  /**
    * Constructor for a new ObjectAttribute.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId ID for the new control, generated automatically if no ID is given
    * @param mSettings Initial settings for the new control
    */
  def this(sId: java.lang.String) = this()
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>press</code> event of this
    * <code>sap.m.ObjectAttribute</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.ObjectAttribute</code> itself.Fires when the user clicks on active text.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.ObjectAttribute</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachPress(oData: js.Any, fnFunction: js.Any): ObjectAttribute = js.native
  def attachPress(oData: js.Any, fnFunction: js.Any, oListener: js.Any): ObjectAttribute = js.native
  /**
    * Destroys the customContent in the aggregation <code>customContent</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyCustomContent(): ObjectAttribute = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>press</code> event of this
    * <code>sap.m.ObjectAttribute</code>.The passed function and listener object must match the ones used
    * for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachPress(fnFunction: js.Any, oListener: js.Any): ObjectAttribute = js.native
  /**
    * Fires event <code>press</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>domRef</code> of type <code>string</code>DOM reference of the
    * ObjectAttribute's text to be used for positioning.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def firePress(mArguments: js.Any): ObjectAttribute = js.native
  /**
    * Gets current value of property <code>active</code>.Indicates if the ObjectAttribute text is
    * selectable for the user.
    * @returns Value of property <code>active</code>
    */
  def getActive(): scala.Boolean = js.native
  /**
    * Gets content of aggregation <code>customContent</code>.When the aggregation is set, it replaces the
    * text, active and textDirection properties. This also ignores the press event. The provided control
    * is displayed as an active link.<b>Note:</b> It will only allow sap.m.Text and sap.m.Link controls.
    */
  def getCustomContent(): openui5Lib.sapNs.uiNs.coreNs.Control = js.native
  /**
    * Defines to which DOM reference the Popup should be docked.
    * @returns The DOM reference that Popup should dock to
    */
  def getPopupAnchorDomRef(): js.Any = js.native
  /**
    * Gets current value of property <code>text</code>.Defines the ObjectAttribute text.
    * @returns Value of property <code>text</code>
    */
  def getText(): java.lang.String = js.native
  /**
    * Gets current value of property <code>textDirection</code>.Determines the direction of the text, not
    * including the title.Available options for the text direction are LTR (left-to-right) and RTL
    * (right-to-left). By default the control inherits the text direction from its parent control.Default
    * value is <code>Inherit</code>.
    * @returns Value of property <code>textDirection</code>
    */
  def getTextDirection(): openui5Lib.sapNs.uiNs.coreNs.TextDirection = js.native
  /**
    * Gets current value of property <code>title</code>.Defines the ObjectAttribute title.
    * @returns Value of property <code>title</code>
    */
  def getTitle(): java.lang.String = js.native
  /**
    * Sets a new value for property <code>active</code>.Indicates if the ObjectAttribute text is
    * selectable for the user.When called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.
    * @param bActive New value for property <code>active</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setActive(bActive: scala.Boolean): ObjectAttribute = js.native
  /**
    * Sets the aggregated <code>customContent</code>.
    * @param oCustomContent The customContent to set
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setCustomContent(oCustomContent: openui5Lib.sapNs.uiNs.coreNs.Control): ObjectAttribute = js.native
  /**
    * Sets a new value for property <code>text</code>.Defines the ObjectAttribute text.When called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.
    * @param sText New value for property <code>text</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setText(sText: java.lang.String): ObjectAttribute = js.native
  /**
    * Sets a new value for property <code>textDirection</code>.Determines the direction of the text, not
    * including the title.Available options for the text direction are LTR (left-to-right) and RTL
    * (right-to-left). By default the control inherits the text direction from its parent control.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.Default value is <code>Inherit</code>.
    * @param sTextDirection New value for property <code>textDirection</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTextDirection(sTextDirection: openui5Lib.sapNs.uiNs.coreNs.TextDirection): ObjectAttribute = js.native
  /**
    * Sets a new value for property <code>title</code>.Defines the ObjectAttribute title.When called with
    * a value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.
    * @param sTitle New value for property <code>title</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTitle(sTitle: java.lang.String): ObjectAttribute = js.native
}

