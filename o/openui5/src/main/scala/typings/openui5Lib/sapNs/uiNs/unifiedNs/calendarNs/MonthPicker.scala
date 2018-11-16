package typings
package openui5Lib.sapNs.uiNs.unifiedNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.unified.calendar.MonthPicker")
@js.native
class MonthPicker protected ()
  extends openui5Lib.sapNs.uiNs.coreNs.Control {
  /**
             * Constructor for a new MonthPicker.Accepts an object literal <code>mSettings</code> that defines
             * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
             * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
             * object.
             * @param sId id for the new control, generated automatically if no id is given
             * @param mSettings initial settings for the new control
            */
  def this(sId: java.lang.String) = this()
  /**
             * Constructor for a new MonthPicker.Accepts an object literal <code>mSettings</code> that defines
             * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
             * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
             * object.
             * @param sId id for the new control, generated automatically if no id is given
             * @param mSettings initial settings for the new control
            */
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
             * Attaches event handler <code>fnFunction</code> to the <code>pageChange</code> event of this
             * <code>sap.ui.unified.calendar.MonthPicker</code>.When called, the context of the event handler (its
             * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
             * to this <code>sap.ui.unified.calendar.MonthPicker</code> itself.If less than 12 months are displayed
             * the <code>pageChange</code> event is firedif the displayed months are changed by user navigation.
             * @since 1.38.0
             * @param oData An application-specific payload object that will be passed to the event handler along
             * with the event object when firing the event
             * @param fnFunction The function to be called when the event occurs
             * @param oListener Context object to call the event handler with. Defaults to this
             * <code>sap.ui.unified.calendar.MonthPicker</code> itself
             * @returns Reference to <code>this</code> in order to allow method chaining
            */
  def attachPageChange(oData: js.Any, fnFunction: js.Any): MonthPicker = js.native
  /**
             * Attaches event handler <code>fnFunction</code> to the <code>pageChange</code> event of this
             * <code>sap.ui.unified.calendar.MonthPicker</code>.When called, the context of the event handler (its
             * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
             * to this <code>sap.ui.unified.calendar.MonthPicker</code> itself.If less than 12 months are displayed
             * the <code>pageChange</code> event is firedif the displayed months are changed by user navigation.
             * @since 1.38.0
             * @param oData An application-specific payload object that will be passed to the event handler along
             * with the event object when firing the event
             * @param fnFunction The function to be called when the event occurs
             * @param oListener Context object to call the event handler with. Defaults to this
             * <code>sap.ui.unified.calendar.MonthPicker</code> itself
             * @returns Reference to <code>this</code> in order to allow method chaining
            */
  def attachPageChange(oData: js.Any, fnFunction: js.Any, oListener: js.Any): MonthPicker = js.native
  /**
             * Attaches event handler <code>fnFunction</code> to the <code>select</code> event of this
             * <code>sap.ui.unified.calendar.MonthPicker</code>.When called, the context of the event handler (its
             * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
             * to this <code>sap.ui.unified.calendar.MonthPicker</code> itself.Month selection changed
             * @param oData An application-specific payload object that will be passed to the event handler along
             * with the event object when firing the event
             * @param fnFunction The function to be called when the event occurs
             * @param oListener Context object to call the event handler with. Defaults to this
             * <code>sap.ui.unified.calendar.MonthPicker</code> itself
             * @returns Reference to <code>this</code> in order to allow method chaining
            */
  def attachSelect(oData: js.Any, fnFunction: js.Any): MonthPicker = js.native
  /**
             * Attaches event handler <code>fnFunction</code> to the <code>select</code> event of this
             * <code>sap.ui.unified.calendar.MonthPicker</code>.When called, the context of the event handler (its
             * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
             * to this <code>sap.ui.unified.calendar.MonthPicker</code> itself.Month selection changed
             * @param oData An application-specific payload object that will be passed to the event handler along
             * with the event object when firing the event
             * @param fnFunction The function to be called when the event occurs
             * @param oListener Context object to call the event handler with. Defaults to this
             * <code>sap.ui.unified.calendar.MonthPicker</code> itself
             * @returns Reference to <code>this</code> in order to allow method chaining
            */
  def attachSelect(oData: js.Any, fnFunction: js.Any, oListener: js.Any): MonthPicker = js.native
  /**
             * Detaches event handler <code>fnFunction</code> from the <code>pageChange</code> event of this
             * <code>sap.ui.unified.calendar.MonthPicker</code>.The passed function and listener object must match
             * the ones used for event registration.
             * @since 1.38.0
             * @param fnFunction The function to be called, when the event occurs
             * @param oListener Context object on which the given function had to be called
             * @returns Reference to <code>this</code> in order to allow method chaining
            */
  def detachPageChange(fnFunction: js.Any, oListener: js.Any): MonthPicker = js.native
  /**
             * Detaches event handler <code>fnFunction</code> from the <code>select</code> event of this
             * <code>sap.ui.unified.calendar.MonthPicker</code>.The passed function and listener object must match
             * the ones used for event registration.
             * @param fnFunction The function to be called, when the event occurs
             * @param oListener Context object on which the given function had to be called
             * @returns Reference to <code>this</code> in order to allow method chaining
            */
  def detachSelect(fnFunction: js.Any, oListener: js.Any): MonthPicker = js.native
  /**
             * Fires event <code>pageChange</code> to attached listeners.
             * @since 1.38.0
             * @param mArguments The arguments to pass along with the event
             * @returns Reference to <code>this</code> in order to allow method chaining
            */
  def firePageChange(mArguments: js.Any): MonthPicker = js.native
  /**
             * Fires event <code>select</code> to attached listeners.
             * @param mArguments The arguments to pass along with the event
             * @returns Reference to <code>this</code> in order to allow method chaining
            */
  def fireSelect(mArguments: js.Any): MonthPicker = js.native
  /**
             * Gets current value of property <code>columns</code>.number of months in each rowThe value must be
             * between 0 and 12 (0 means just to have all months in one row, independent of the number)Default
             * value is <code>3</code>.
             * @since 1.30.0
             * @returns Value of property <code>columns</code>
            */
  def getColumns(): scala.Double = js.native
  /**
             * Gets current value of property <code>month</code>.The month is initial focused and selectedThe value
             * must be between 0 and 11Default value is <code>0</code>.
             * @returns Value of property <code>month</code>
            */
  def getMonth(): scala.Double = js.native
  /**
             * Gets current value of property <code>months</code>.number of displayed monthsThe value must be
             * between 1 and 12Default value is <code>12</code>.
             * @since 1.30.0
             * @returns Value of property <code>months</code>
            */
  def getMonths(): scala.Double = js.native
  /**
             * Gets current value of property <code>primaryCalendarType</code>.If set, the calendar type is used
             * for display.If not set, the calendar type of the global configuration is used.
             * @since 1.34.0
             * @returns Value of property <code>primaryCalendarType</code>
            */
  def getPrimaryCalendarType(): openui5Lib.sapNs.uiNs.coreNs.CalendarType = js.native
  /**
             * displays the next page
             * @returns <code>this</code> to allow method chaining
            */
  def nextPage(): MonthPicker = js.native
  /**
             * displays the previous page
             * @returns <code>this</code> to allow method chaining
            */
  def previousPage(): MonthPicker = js.native
  /**
             * Sets a new value for property <code>columns</code>.number of months in each rowThe value must be
             * between 0 and 12 (0 means just to have all months in one row, independent of the number)When called
             * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
             * be restored.Default value is <code>3</code>.
             * @since 1.30.0
             * @param iColumns New value for property <code>columns</code>
             * @returns Reference to <code>this</code> in order to allow method chaining
            */
  def setColumns(iColumns: scala.Double): MonthPicker = js.native
  /**
             * sets a minimum an maximum month
             * @param iMin minimum month as integer (starting with 0)
             * @param iMax maximum month as integer (starting with 0)
             * @returns <code>this</code> to allow method chaining
            */
  def setMinMax(iMin: scala.Double): MonthPicker = js.native
  /**
             * sets a minimum an maximum month
             * @param iMin minimum month as integer (starting with 0)
             * @param iMax maximum month as integer (starting with 0)
             * @returns <code>this</code> to allow method chaining
            */
  def setMinMax(iMin: scala.Double, iMax: scala.Double): MonthPicker = js.native
  /**
             * Sets a new value for property <code>month</code>.The month is initial focused and selectedThe value
             * must be between 0 and 11When called with a value of <code>null</code> or <code>undefined</code>, the
             * default value of the property will be restored.Default value is <code>0</code>.
             * @param iMonth New value for property <code>month</code>
             * @returns Reference to <code>this</code> in order to allow method chaining
            */
  def setMonth(iMonth: scala.Double): MonthPicker = js.native
  /**
             * Sets a new value for property <code>months</code>.number of displayed monthsThe value must be
             * between 1 and 12When called with a value of <code>null</code> or <code>undefined</code>, the default
             * value of the property will be restored.Default value is <code>12</code>.
             * @since 1.30.0
             * @param iMonths New value for property <code>months</code>
             * @returns Reference to <code>this</code> in order to allow method chaining
            */
  def setMonths(iMonths: scala.Double): MonthPicker = js.native
  /**
             * Sets a new value for property <code>primaryCalendarType</code>.If set, the calendar type is used for
             * display.If not set, the calendar type of the global configuration is used.When called with a value
             * of <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
             * @since 1.34.0
             * @param sPrimaryCalendarType New value for property <code>primaryCalendarType</code>
             * @returns Reference to <code>this</code> in order to allow method chaining
            */
  def setPrimaryCalendarType(sPrimaryCalendarType: openui5Lib.sapNs.uiNs.coreNs.CalendarType): MonthPicker = js.native
}

