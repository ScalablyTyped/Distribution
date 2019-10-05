package typings.openui5.sap.ui.unified

import typings.openui5.sap.ui.core.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.unified.DateRange")
@js.native
class DateRange protected () extends Element {
  /**
    * Constructor for a new DateRange.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Gets current value of property <code>endDate</code>.Start date for a date range. If empty only a
    * single date is presented by this DateRange element. This must be a JavaScript date object.
    * @returns Value of property <code>endDate</code>
    */
  def getEndDate(): js.Any = js.native
  /**
    * Gets current value of property <code>startDate</code>.Start date for a date range. This must be a
    * JavaScript date object.
    * @returns Value of property <code>startDate</code>
    */
  def getStartDate(): js.Any = js.native
  /**
    * Sets a new value for property <code>endDate</code>.Start date for a date range. If empty only a
    * single date is presented by this DateRange element. This must be a JavaScript date object.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.
    * @param oEndDate New value for property <code>endDate</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setEndDate(oEndDate: js.Any): DateRange = js.native
  /**
    * Sets a new value for property <code>startDate</code>.Start date for a date range. This must be a
    * JavaScript date object.When called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.
    * @param oStartDate New value for property <code>startDate</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setStartDate(oStartDate: js.Any): DateRange = js.native
}

