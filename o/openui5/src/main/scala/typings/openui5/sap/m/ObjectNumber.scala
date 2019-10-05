package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Control
import typings.openui5.sap.ui.core.TextAlign
import typings.openui5.sap.ui.core.TextDirection
import typings.openui5.sap.ui.core.ValueState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.ObjectNumber")
@js.native
class ObjectNumber protected () extends Control {
  /**
    * Constructor for a new ObjectNumber.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId ID for the new control, generated automatically if no ID is given
    * @param mSettings Initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Adds some ariaDescribedBy into the association <code>ariaDescribedBy</code>.
    * @param vAriaDescribedBy the ariaDescribedBy to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addAriaDescribedBy(vAriaDescribedBy: js.Any): ObjectNumber = js.native
  def addAriaDescribedBy(vAriaDescribedBy: Control): ObjectNumber = js.native
  /**
    * Returns array of IDs of the elements which are the current targets of the association
    * <code>ariaDescribedBy</code>.
    */
  def getAriaDescribedBy(): js.Array[_] = js.native
  /**
    * Gets current value of property <code>emphasized</code>.Indicates if the object number should appear
    * emphasized.Default value is <code>true</code>.
    * @returns Value of property <code>emphasized</code>
    */
  def getEmphasized(): Boolean = js.native
  /**
    * Gets current value of property <code>number</code>.Defines the number field.
    * @returns Value of property <code>number</code>
    */
  def getNumber(): String = js.native
  /**
    * Gets current value of property <code>numberUnit</code>.Defines the number units qualifier.
    * @returns Value of property <code>numberUnit</code>
    */
  def getNumberUnit(): String = js.native
  /**
    * Gets current value of property <code>state</code>.Determines the object number's value state.
    * Setting this state will cause the number to be rendered in state-specific colors (only blue-crystal
    * theme).Default value is <code>None</code>.
    * @returns Value of property <code>state</code>
    */
  def getState(): ValueState = js.native
  /**
    * Gets current value of property <code>textAlign</code>.Sets the horizontal alignment of the number
    * and unit.Default value is <code>Begin</code>.
    * @returns Value of property <code>textAlign</code>
    */
  def getTextAlign(): TextAlign = js.native
  /**
    * Gets current value of property <code>textDirection</code>.Available options for the number and unit
    * text direction are LTR(left-to-right) and RTL(right-to-left). By default, the control inherits the
    * text direction from its parent control.Default value is <code>Inherit</code>.
    * @returns Value of property <code>textDirection</code>
    */
  def getTextDirection(): TextDirection = js.native
  /**
    * Gets current value of property <code>unit</code>.Defines the number units qualifier. If numberUnit
    * and unit are both set, the unit value is used.
    * @since 1.16.1
    * @returns Value of property <code>unit</code>
    */
  def getUnit(): String = js.native
  /**
    * Removes all the controls in the association named <code>ariaDescribedBy</code>.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllAriaDescribedBy(): js.Array[_] = js.native
  def removeAriaDescribedBy(vAriaDescribedBy: js.Any): js.Any = js.native
  /**
    * Removes an ariaDescribedBy from the association named <code>ariaDescribedBy</code>.
    * @param vAriaDescribedBy The ariaDescribedBy to be removed or its index or ID
    * @returns The removed ariaDescribedBy or <code>null</code>
    */
  def removeAriaDescribedBy(vAriaDescribedBy: Double): js.Any = js.native
  def removeAriaDescribedBy(vAriaDescribedBy: Control): js.Any = js.native
  /**
    * Sets a new value for property <code>emphasized</code>.Indicates if the object number should appear
    * emphasized.When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.Default value is <code>true</code>.
    * @param bEmphasized New value for property <code>emphasized</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setEmphasized(bEmphasized: Boolean): ObjectNumber = js.native
  /**
    * Sets a new value for property <code>number</code>.Defines the number field.When called with a value
    * of <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @param sNumber New value for property <code>number</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setNumber(sNumber: String): ObjectNumber = js.native
  /**
    * Sets a new value for property <code>numberUnit</code>.Defines the number units qualifier.When called
    * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
    * be restored.
    * @param sNumberUnit New value for property <code>numberUnit</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setNumberUnit(sNumberUnit: String): ObjectNumber = js.native
  /**
    * Sets the ObjectNumber's value state.
    * @param sState The state to be set to
    * @returns this pointer for chaining
    */
  def setState(sState: ValueState): ObjectNumber = js.native
  /**
    * Sets the text alignment of the control without re-rendering the whole ObjectNumber.
    * @param sAlign The new value
    * @returns <code>this</code> pointer for chaining
    */
  def setTextAlign(sAlign: TextAlign): ObjectNumber = js.native
  /**
    * Sets a new value for property <code>textDirection</code>.Available options for the number and unit
    * text direction are LTR(left-to-right) and RTL(right-to-left). By default, the control inherits the
    * text direction from its parent control.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>Inherit</code>.
    * @param sTextDirection New value for property <code>textDirection</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTextDirection(sTextDirection: TextDirection): ObjectNumber = js.native
  /**
    * Sets a new value for property <code>unit</code>.Defines the number units qualifier. If numberUnit
    * and unit are both set, the unit value is used.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @since 1.16.1
    * @param sUnit New value for property <code>unit</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setUnit(sUnit: String): ObjectNumber = js.native
}

