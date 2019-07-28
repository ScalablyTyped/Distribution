package typings.openui5.sapNs.uiNs.unifiedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.unified.DateTypeRange")
@js.native
class DateTypeRange protected () extends DateRange {
  /**
    * Constructor for a new DateTypeRange.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Gets current value of property <code>type</code>.Type of the date range.Default value is
    * <code>Type01</code>.
    * @returns Value of property <code>type</code>
    */
  def getType(): CalendarDayType = js.native
  /**
    * Sets a new value for property <code>type</code>.Type of the date range.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>Type01</code>.
    * @param sType New value for property <code>type</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setType(sType: CalendarDayType): DateTypeRange = js.native
}

