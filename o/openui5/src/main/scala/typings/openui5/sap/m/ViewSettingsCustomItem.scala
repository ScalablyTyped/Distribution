package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Control
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.ViewSettingsCustomItem")
@js.native
class ViewSettingsCustomItem protected () extends ViewSettingsItem {
  /**
    * Constructor for a new ViewSettingsCustomItem.Accepts an object literal <code>mSettings</code> that
    * defines initialproperty values, aggregated and associated objects as well as event handlers.See
    * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
    * settings object.
    * @param sId ID for the new control, generated automatically if no ID is given
    * @param mSettings Initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Destroys the customControl in the aggregation <code>customControl</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyCustomControl(): ViewSettingsCustomItem = js.native
  /**
    * Internally the control is handled as a managed object instead of an aggregationbecause this control
    * is sometimes aggregated in other controls like a popover or a dialog.
    * @returns oControl a control used for filtering purposes
    */
  def getCustomControl(): Control = js.native
  /**
    * Gets current value of property <code>filterCount</code>.The number of currently active filters for
    * this custom filter item. It will be displayed in the filter list of the ViewSettingsDialog to
    * represent the filter state of the custom control.Default value is <code>0</code>.
    * @returns Value of property <code>filterCount</code>
    */
  def getFilterCount(): Double = js.native
  /**
    * Internally the control is handled as a managed object instead of an aggregationas this control is
    * sometimes aggregated in other controls like a popover or a dialog.
    * @param oControl A control used for filtering purposes
    * @returns this pointer for chaining
    */
  def setCustomControl(oControl: Control): ViewSettingsCustomItem = js.native
  /**
    * Sets the filterCount without invalidating the control as it is never rendered directly.
    * @param iValue The new value for property filterCount
    * @returns this pointer for chaining
    */
  def setFilterCount(iValue: Double): ViewSettingsItem = js.native
}

