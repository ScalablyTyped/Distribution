package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.ObjectStatus")
@js.native
class ObjectStatus protected ()
  extends openui5Lib.sapNs.uiNs.coreNs.Control {
  /**
    * Constructor for a new ObjectStatus.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId ID for the new control, generated automatically if no ID is given
    * @param mSettings Initial settings for the new control
    */
  def this(sId: java.lang.String) = this()
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
    * Adds some ariaDescribedBy into the association <code>ariaDescribedBy</code>.
    * @param vAriaDescribedBy the ariaDescribedBy to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addAriaDescribedBy(vAriaDescribedBy: js.Any): ObjectStatus = js.native
  def addAriaDescribedBy(vAriaDescribedBy: openui5Lib.sapNs.uiNs.coreNs.Control): ObjectStatus = js.native
  /**
    * Returns array of IDs of the elements which are the current targets of the association
    * <code>ariaDescribedBy</code>.
    */
  def getAriaDescribedBy(): js.Array[_] = js.native
  /**
    * Gets current value of property <code>icon</code>.Icon URI. This may be either an icon font or image
    * path.
    * @returns Value of property <code>icon</code>
    */
  def getIcon(): js.Any = js.native
  /**
    * Gets current value of property <code>iconDensityAware</code>.By default, this is set to true but
    * then one or more requests are sent trying to get the density perfect version of image if this
    * version of image doesn't exist on the server.If bandwidth is key for the application, set this value
    * to false.Default value is <code>true</code>.
    * @returns Value of property <code>iconDensityAware</code>
    */
  def getIconDensityAware(): scala.Boolean = js.native
  /**
    * Gets current value of property <code>state</code>.Defines the text value state.Default value is
    * <code>None</code>.
    * @returns Value of property <code>state</code>
    */
  def getState(): openui5Lib.sapNs.uiNs.coreNs.ValueState = js.native
  /**
    * Gets current value of property <code>text</code>.Defines the ObjectStatus text.
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
    * Gets current value of property <code>title</code>.Defines the ObjectStatus title.
    * @returns Value of property <code>title</code>
    */
  def getTitle(): java.lang.String = js.native
  /**
    * Removes all the controls in the association named <code>ariaDescribedBy</code>.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllAriaDescribedBy(): js.Array[_] = js.native
  def removeAriaDescribedBy(vAriaDescribedBy: js.Any): js.Any = js.native
  def removeAriaDescribedBy(vAriaDescribedBy: openui5Lib.sapNs.uiNs.coreNs.Control): js.Any = js.native
  /**
    * Removes an ariaDescribedBy from the association named <code>ariaDescribedBy</code>.
    * @param vAriaDescribedBy The ariaDescribedBy to be removed or its index or ID
    * @returns The removed ariaDescribedBy or <code>null</code>
    */
  def removeAriaDescribedBy(vAriaDescribedBy: scala.Double): js.Any = js.native
  /**
    * Sets a new value for property <code>icon</code>.Icon URI. This may be either an icon font or image
    * path.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.
    * @param sIcon New value for property <code>icon</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIcon(sIcon: js.Any): ObjectStatus = js.native
  /**
    * Sets a new value for property <code>iconDensityAware</code>.By default, this is set to true but then
    * one or more requests are sent trying to get the density perfect version of image if this version of
    * image doesn't exist on the server.If bandwidth is key for the application, set this value to
    * false.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code>true</code>.
    * @param bIconDensityAware New value for property <code>iconDensityAware</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIconDensityAware(bIconDensityAware: scala.Boolean): ObjectStatus = js.native
  /**
    * Sets a new value for property <code>state</code>.Defines the text value state.When called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>None</code>.
    * @param sState New value for property <code>state</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setState(sState: openui5Lib.sapNs.uiNs.coreNs.ValueState): ObjectStatus = js.native
  /**
    * Sets the text.The default value is empty/undefined.
    * @param sText New value for property text
    * @returns this to allow method chaining
    */
  def setText(sText: java.lang.String): ObjectStatus = js.native
  /**
    * Sets a new value for property <code>textDirection</code>.Determines the direction of the text, not
    * including the title.Available options for the text direction are LTR (left-to-right) and RTL
    * (right-to-left). By default the control inherits the text direction from its parent control.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.Default value is <code>Inherit</code>.
    * @param sTextDirection New value for property <code>textDirection</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTextDirection(sTextDirection: openui5Lib.sapNs.uiNs.coreNs.TextDirection): ObjectStatus = js.native
  /**
    * Sets the title.The default value is empty/undefined.
    * @param sTitle New value for property title
    * @returns this to allow method chaining
    */
  def setTitle(sTitle: java.lang.String): ObjectStatus = js.native
}

