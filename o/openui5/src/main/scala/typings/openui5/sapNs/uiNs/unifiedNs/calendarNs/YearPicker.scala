package typings.openui5.sapNs.uiNs.unifiedNs.calendarNs

import typings.openui5.sapNs.uiNs.coreNs.CalendarType
import typings.openui5.sapNs.uiNs.coreNs.Control
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.unified.calendar.YearPicker")
@js.native
class YearPicker protected () extends Control {
  /**
    * Constructor for a new YearPicker.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>pageChange</code> event of this
    * <code>sap.ui.unified.calendar.YearPicker</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.ui.unified.calendar.YearPicker</code> itself.The <code>pageChange</code> event is
    * fired if the displayed years are changed by user navigation.
    * @since 1.38.0
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.ui.unified.calendar.YearPicker</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachPageChange(oData: js.Any, fnFunction: js.Any): YearPicker = js.native
  def attachPageChange(oData: js.Any, fnFunction: js.Any, oListener: js.Any): YearPicker = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>select</code> event of this
    * <code>sap.ui.unified.calendar.YearPicker</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.ui.unified.calendar.YearPicker</code> itself.Month selection changed
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.ui.unified.calendar.YearPicker</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachSelect(oData: js.Any, fnFunction: js.Any): YearPicker = js.native
  def attachSelect(oData: js.Any, fnFunction: js.Any, oListener: js.Any): YearPicker = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>pageChange</code> event of this
    * <code>sap.ui.unified.calendar.YearPicker</code>.The passed function and listener object must match
    * the ones used for event registration.
    * @since 1.38.0
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachPageChange(fnFunction: js.Any, oListener: js.Any): YearPicker = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>select</code> event of this
    * <code>sap.ui.unified.calendar.YearPicker</code>.The passed function and listener object must match
    * the ones used for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachSelect(fnFunction: js.Any, oListener: js.Any): YearPicker = js.native
  /**
    * Fires event <code>pageChange</code> to attached listeners.
    * @since 1.38.0
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def firePageChange(mArguments: js.Any): YearPicker = js.native
  /**
    * Fires event <code>select</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireSelect(mArguments: js.Any): YearPicker = js.native
  /**
    * Gets current value of property <code>columns</code>.number of years in each row0 means just to have
    * all years in one row, independent of the numberDefault value is <code>4</code>.
    * @since 1.30.0
    * @returns Value of property <code>columns</code>
    */
  def getColumns(): Double = js.native
  /**
    * Gets current value of property <code>date</code>.Date as JavaScript Date object. For this date a
    * <code>YearPicker</code> is rendered. If a Year is selected thedate is updated with the start date of
    * the selected year (depending on the calendar type).
    * @since 1.34.0
    * @returns Value of property <code>date</code>
    */
  def getDate(): js.Any = js.native
  /**
    * return the first date of the first rendered year<b>Note:</b> If the YearPicker is not rendered no
    * date is returned
    * @since 1.38.0
    * @returns JavaScript Date Object
    */
  def getFirstRenderedDate(): js.Any = js.native
  /**
    * Gets current value of property <code>primaryCalendarType</code>.If set, the calendar type is used
    * for display.If not set, the calendar type of the global configuration is used.
    * @since 1.34.0
    * @returns Value of property <code>primaryCalendarType</code>
    */
  def getPrimaryCalendarType(): CalendarType = js.native
  /**
    * Gets current value of property <code>year</code>.The year is initial focused and selectedThe value
    * must be between 0 and 9999Default value is <code>2000</code>.
    * @returns Value of property <code>year</code>
    */
  def getYear(): Double = js.native
  /**
    * Gets current value of property <code>years</code>.number of displayed yearsDefault value is
    * <code>20</code>.
    * @since 1.30.0
    * @returns Value of property <code>years</code>
    */
  def getYears(): Double = js.native
  /**
    * displays the next page
    * @returns <code>this</code> to allow method chaining
    */
  def nextPage(): YearPicker = js.native
  /**
    * displays the previous page
    * @returns <code>this</code> to allow method chaining
    */
  def previousPage(): YearPicker = js.native
  /**
    * Sets a new value for property <code>columns</code>.number of years in each row0 means just to have
    * all years in one row, independent of the numberWhen called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>4</code>.
    * @since 1.30.0
    * @param iColumns New value for property <code>columns</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setColumns(iColumns: Double): YearPicker = js.native
  /**
    * Sets a new value for property <code>date</code>.Date as JavaScript Date object. For this date a
    * <code>YearPicker</code> is rendered. If a Year is selected thedate is updated with the start date of
    * the selected year (depending on the calendar type).When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @since 1.34.0
    * @param oDate New value for property <code>date</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setDate(oDate: js.Any): YearPicker = js.native
  /**
    * Sets a new value for property <code>primaryCalendarType</code>.If set, the calendar type is used for
    * display.If not set, the calendar type of the global configuration is used.When called with a value
    * of <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @since 1.34.0
    * @param sPrimaryCalendarType New value for property <code>primaryCalendarType</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setPrimaryCalendarType(sPrimaryCalendarType: CalendarType): YearPicker = js.native
  /**
    * Sets a new value for property <code>year</code>.The year is initial focused and selectedThe value
    * must be between 0 and 9999When called with a value of <code>null</code> or <code>undefined</code>,
    * the default value of the property will be restored.Default value is <code>2000</code>.
    * @param iYear New value for property <code>year</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setYear(iYear: Double): YearPicker = js.native
  /**
    * Sets a new value for property <code>years</code>.number of displayed yearsWhen called with a value
    * of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>20</code>.
    * @since 1.30.0
    * @param iYears New value for property <code>years</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setYears(iYears: Double): YearPicker = js.native
}

