package typings.openui5.sap.ui.unified

import org.scalablytyped.runtime.Instantiable2
import typings.openui5.sap.ui.core.CalendarType
import typings.openui5.sap.ui.core.Control
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.unified.Calendar")
@js.native
class Calendar_ protected () extends Control {
  /**
    * Constructor for a new Calendar.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Adds some ariaLabelledBy into the association <code>ariaLabelledBy</code>.
    * @since 1.28.0
    * @param vAriaLabelledBy the ariaLabelledBy to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addAriaLabelledBy(vAriaLabelledBy: js.Any): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar_] = js.native
  def addAriaLabelledBy(vAriaLabelledBy: Control): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar_] = js.native
  /**
    * Adds some disabledDate to the aggregation <code>disabledDates</code>.
    * @since 1.38.0
    * @param oDisabledDate the disabledDate to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addDisabledDate(oDisabledDate: DateRange): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar_] = js.native
  /**
    * Adds some selectedDate to the aggregation <code>selectedDates</code>.
    * @param oSelectedDate the selectedDate to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addSelectedDate(oSelectedDate: DateRange): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar_] = js.native
  /**
    * Adds some specialDate to the aggregation <code>specialDates</code>.
    * @since 1.24.0
    * @param oSpecialDate the specialDate to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addSpecialDate(oSpecialDate: DateTypeRange): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar_] = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>cancel</code> event of this
    * <code>sap.ui.unified.Calendar</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.ui.unified.Calendar</code> itself.Date selection was cancelled
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.ui.unified.Calendar</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachCancel(oData: js.Any, fnFunction: js.Any): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar_] = js.native
  def attachCancel(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar_] = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>select</code> event of this
    * <code>sap.ui.unified.Calendar</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.ui.unified.Calendar</code> itself.Date selection changed
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.ui.unified.Calendar</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachSelect(oData: js.Any, fnFunction: js.Any): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar_] = js.native
  def attachSelect(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar_] = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>startDateChange</code> event of this
    * <code>sap.ui.unified.Calendar</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.ui.unified.Calendar</code> itself.<code>startDate</code> was changed while
    * navigation in <code>Calendar</code>Use <code>getStartDate</code> function to determine the current
    * start date
    * @since 1.34.0
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.ui.unified.Calendar</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachStartDateChange(oData: js.Any, fnFunction: js.Any): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar_] = js.native
  def attachStartDateChange(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar_] = js.native
  /**
    * Destroys all the disabledDates in the aggregation <code>disabledDates</code>.
    * @since 1.38.0
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyDisabledDates(): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar_] = js.native
  /**
    * Destroys all the selectedDates in the aggregation <code>selectedDates</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroySelectedDates(): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar_] = js.native
  /**
    * Destroys all the specialDates in the aggregation <code>specialDates</code>.
    * @since 1.24.0
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroySpecialDates(): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar_] = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>cancel</code> event of this
    * <code>sap.ui.unified.Calendar</code>.The passed function and listener object must match the ones
    * used for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachCancel(fnFunction: js.Any, oListener: js.Any): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar_] = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>select</code> event of this
    * <code>sap.ui.unified.Calendar</code>.The passed function and listener object must match the ones
    * used for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachSelect(fnFunction: js.Any, oListener: js.Any): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar_] = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>startDateChange</code> event of this
    * <code>sap.ui.unified.Calendar</code>.The passed function and listener object must match the ones
    * used for event registration.
    * @since 1.34.0
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachStartDateChange(fnFunction: js.Any, oListener: js.Any): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar_] = js.native
  /**
    * Displays a date in the calendar but don't set the focus.
    * @since 1.28.0
    * @param oDate JavaScript date object for focused date.
    * @returns <code>this</code> to allow method chaining
    */
  def displayDate(oDate: js.Any): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar_] = js.native
  /**
    * Fires event <code>cancel</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireCancel(mArguments: js.Any): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar_] = js.native
  /**
    * Fires event <code>select</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireSelect(mArguments: js.Any): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar_] = js.native
  /**
    * Fires event <code>startDateChange</code> to attached listeners.
    * @since 1.34.0
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireStartDateChange(mArguments: js.Any): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar_] = js.native
  /**
    * Sets the focused date of the calendar.
    * @param oDate JavaScript date object for focused date.
    * @returns <code>this</code> to allow method chaining
    */
  def focusDate(oDate: js.Any): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar_] = js.native
  /**
    * Returns array of IDs of the elements which are the current targets of the association
    * <code>ariaLabelledBy</code>.
    * @since 1.28.0
    */
  def getAriaLabelledBy(): js.Array[_] = js.native
  /**
    * Gets content of aggregation <code>disabledDates</code>.Date Ranges for disabled dates
    * @since 1.38.0
    */
  def getDisabledDates(): js.Array[DateRange] = js.native
  /**
    * Gets current value of property <code>firstDayOfWeek</code>.If set, the first day of the displayed
    * week is this day. Valid values are 0 to 6.If not a valid value is set, the default of the used
    * locale is used.Default value is <code>-1</code>.
    * @since 1.28.9
    * @returns Value of property <code>firstDayOfWeek</code>
    */
  def getFirstDayOfWeek(): Double = js.native
  /**
    * Gets current value of property <code>intervalSelection</code>.If set, interval selection is
    * allowedDefault value is <code>false</code>.
    * @returns Value of property <code>intervalSelection</code>
    */
  def getIntervalSelection(): Boolean = js.native
  /**
    * ID of the element which is the current target of the association <code>legend</code>, or
    * <code>null</code>.
    * @since 1.38.5
    */
  def getLegend(): js.Any = js.native
  /**
    * Gets current value of property <code>maxDate</code>.Maximum date that can be shown and selected in
    * the Calendar. This must be a JavaScript date object.<b>Note:</b> if the date is inside of a month
    * the complete month is displayed,but dates outside the valid range can not be selected.<b>Note:</b>
    * If the <code>maxDate</code> is set to be before the <code>minDate</code>,the <code>minDate</code> is
    * set to the begin of the month of the <code>maxDate</code>.
    * @since 1.38.0
    * @returns Value of property <code>maxDate</code>
    */
  def getMaxDate(): js.Any = js.native
  /**
    * Gets current value of property <code>minDate</code>.Minimum date that can be shown and selected in
    * the Calendar. This must be a JavaScript date object.<b>Note:</b> if the date is inside of a month
    * the complete month is displayed,but dates outside the valid range can not be selected.<b>Note:</b>
    * If the <code>minDate</code> is set to be after the <code>maxDate</code>,the <code>maxDate</code> is
    * set to the end of the month of the <code>minDate</code>.
    * @since 1.38.0
    * @returns Value of property <code>minDate</code>
    */
  def getMinDate(): js.Any = js.native
  /**
    * Gets current value of property <code>months</code>.number of months displayedon phones always only
    * one month is displayedDefault value is <code>1</code>.
    * @since 1.28.0
    * @returns Value of property <code>months</code>
    */
  def getMonths(): Double = js.native
  /**
    * Gets current value of property <code>nonWorkingDays</code>.If set, the provided weekdays are
    * displayed as non-working days.Valid values inside the array are 0 to 6.If not set, the weekend
    * defined in the locale settings is displayed as non-working days.
    * @since 1.28.9
    * @returns Value of property <code>nonWorkingDays</code>
    */
  def getNonWorkingDays(): Double = js.native
  /**
    * Gets current value of property <code>primaryCalendarType</code>.If set, the calendar type is used
    * for display.If not set, the calendar type of the global configuration is used.
    * @since 1.34.0
    * @returns Value of property <code>primaryCalendarType</code>
    */
  def getPrimaryCalendarType(): CalendarType = js.native
  /**
    * Gets current value of property <code>secondaryCalendarType</code>.If set, the days are also
    * displayed in this calendar typeIf not set, the dates are only displayed in the primary calendar type
    * @since 1.34.0
    * @returns Value of property <code>secondaryCalendarType</code>
    */
  def getSecondaryCalendarType(): CalendarType = js.native
  /**
    * Gets content of aggregation <code>selectedDates</code>.Date Ranges for selected dates of the
    * DatePicker
    */
  def getSelectedDates(): js.Array[DateRange] = js.native
  /**
    * Gets current value of property <code>singleSelection</code>.If set, only a single date or interval,
    * if intervalSelection is enabled, can be selectedDefault value is <code>true</code>.
    * @returns Value of property <code>singleSelection</code>
    */
  def getSingleSelection(): Boolean = js.native
  /**
    * Gets content of aggregation <code>specialDates</code>.Date Range with type to visualize special days
    * in the Calendar.If one day is assigned to more than one Type, only the first one will be used.
    * @since 1.24.0
    */
  def getSpecialDates(): js.Array[DateTypeRange] = js.native
  /**
    * Returns the first day of the displayed month.There might be some days of the previous month shown,
    * but they can not be focused.
    * @since 1.34.1
    * @returns JavaScript date object for start date.
    */
  def getStartDate(): js.Any = js.native
  /**
    * Gets current value of property <code>width</code>.Width of Calendar<b>Note:</b> There is a theme
    * depending minimum width, so the calendar can not be set smaller.
    * @since 1.38.0
    * @returns Value of property <code>width</code>
    */
  def getWidth(): js.Any = js.native
  /**
    * Checks for the provided <code>sap.ui.unified.DateRange</code> in the aggregation
    * <code>disabledDates</code>.and returns its index if found or -1 otherwise.
    * @since 1.38.0
    * @param oDisabledDate The disabledDate whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfDisabledDate(oDisabledDate: DateRange): Double = js.native
  /**
    * Checks for the provided <code>sap.ui.unified.DateRange</code> in the aggregation
    * <code>selectedDates</code>.and returns its index if found or -1 otherwise.
    * @param oSelectedDate The selectedDate whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfSelectedDate(oSelectedDate: DateRange): Double = js.native
  /**
    * Checks for the provided <code>sap.ui.unified.DateTypeRange</code> in the aggregation
    * <code>specialDates</code>.and returns its index if found or -1 otherwise.
    * @since 1.24.0
    * @param oSpecialDate The specialDate whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfSpecialDate(oSpecialDate: DateTypeRange): Double = js.native
  /**
    * Inserts a disabledDate into the aggregation <code>disabledDates</code>.
    * @since 1.38.0
    * @param oDisabledDate the disabledDate to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the disabledDate should be inserted at; for            
    * a negative value of <code>iIndex</code>, the disabledDate is inserted at position 0; for a value    
    *         greater than the current size of the aggregation, the disabledDate is inserted at           
    *  the last position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertDisabledDate(oDisabledDate: DateRange, iIndex: Double): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar_] = js.native
  /**
    * Inserts a selectedDate into the aggregation <code>selectedDates</code>.
    * @param oSelectedDate the selectedDate to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the selectedDate should be inserted at; for            
    * a negative value of <code>iIndex</code>, the selectedDate is inserted at position 0; for a value    
    *         greater than the current size of the aggregation, the selectedDate is inserted at           
    *  the last position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertSelectedDate(oSelectedDate: DateRange, iIndex: Double): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar_] = js.native
  /**
    * Inserts a specialDate into the aggregation <code>specialDates</code>.
    * @since 1.24.0
    * @param oSpecialDate the specialDate to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the specialDate should be inserted at; for            
    * a negative value of <code>iIndex</code>, the specialDate is inserted at position 0; for a value     
    *        greater than the current size of the aggregation, the specialDate is inserted at            
    * the last position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertSpecialDate(oSpecialDate: DateTypeRange, iIndex: Double): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar_] = js.native
  /**
    * Removes all the controls in the association named <code>ariaLabelledBy</code>.
    * @since 1.28.0
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllAriaLabelledBy(): js.Array[_] = js.native
  /**
    * Removes all the controls from the aggregation <code>disabledDates</code>.Additionally, it
    * unregisters them from the hosting UIArea.
    * @since 1.38.0
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllDisabledDates(): js.Array[DateRange] = js.native
  /**
    * Removes all the controls from the aggregation <code>selectedDates</code>.Additionally, it
    * unregisters them from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllSelectedDates(): js.Array[DateRange] = js.native
  /**
    * Removes all the controls from the aggregation <code>specialDates</code>.Additionally, it unregisters
    * them from the hosting UIArea.
    * @since 1.24.0
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllSpecialDates(): js.Array[DateTypeRange] = js.native
  def removeAriaLabelledBy(vAriaLabelledBy: js.Any): js.Any = js.native
  /**
    * Removes an ariaLabelledBy from the association named <code>ariaLabelledBy</code>.
    * @since 1.28.0
    * @param vAriaLabelledBy The ariaLabelledBy to be removed or its index or ID
    * @returns The removed ariaLabelledBy or <code>null</code>
    */
  def removeAriaLabelledBy(vAriaLabelledBy: Double): js.Any = js.native
  def removeAriaLabelledBy(vAriaLabelledBy: Control): js.Any = js.native
  def removeDisabledDate(vDisabledDate: String): DateRange = js.native
  /**
    * Removes a disabledDate from the aggregation <code>disabledDates</code>.
    * @since 1.38.0
    * @param vDisabledDate The disabledDate to remove or its index or id
    * @returns The removed disabledDate or <code>null</code>
    */
  def removeDisabledDate(vDisabledDate: Double): DateRange = js.native
  def removeDisabledDate(vDisabledDate: DateRange): DateRange = js.native
  def removeSelectedDate(vSelectedDate: String): DateRange = js.native
  /**
    * Removes a selectedDate from the aggregation <code>selectedDates</code>.
    * @param vSelectedDate The selectedDate to remove or its index or id
    * @returns The removed selectedDate or <code>null</code>
    */
  def removeSelectedDate(vSelectedDate: Double): DateRange = js.native
  def removeSelectedDate(vSelectedDate: DateRange): DateRange = js.native
  def removeSpecialDate(vSpecialDate: String): DateTypeRange = js.native
  /**
    * Removes a specialDate from the aggregation <code>specialDates</code>.
    * @since 1.24.0
    * @param vSpecialDate The specialDate to remove or its index or id
    * @returns The removed specialDate or <code>null</code>
    */
  def removeSpecialDate(vSpecialDate: Double): DateTypeRange = js.native
  def removeSpecialDate(vSpecialDate: DateTypeRange): DateTypeRange = js.native
  /**
    * Sets a new value for property <code>firstDayOfWeek</code>.If set, the first day of the displayed
    * week is this day. Valid values are 0 to 6.If not a valid value is set, the default of the used
    * locale is used.When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.Default value is <code>-1</code>.
    * @since 1.28.9
    * @param iFirstDayOfWeek New value for property <code>firstDayOfWeek</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setFirstDayOfWeek(iFirstDayOfWeek: Double): Unit = js.native
  /**
    * Sets a new value for property <code>intervalSelection</code>.If set, interval selection is
    * allowedWhen called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code>false</code>.
    * @param bIntervalSelection New value for property <code>intervalSelection</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIntervalSelection(bIntervalSelection: Boolean): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar_] = js.native
  /**
    * Sets the associated <code>legend</code>.
    * @since 1.38.5
    * @param oLegend ID of an element which becomes the new target of this legend association;
    * alternatively, an element instance may be given
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setLegend(oLegend: js.Any): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar_] = js.native
  def setLegend(oLegend: CalendarLegend): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar_] = js.native
  /**
    * Sets a new value for property <code>maxDate</code>.Maximum date that can be shown and selected in
    * the Calendar. This must be a JavaScript date object.<b>Note:</b> if the date is inside of a month
    * the complete month is displayed,but dates outside the valid range can not be selected.<b>Note:</b>
    * If the <code>maxDate</code> is set to be before the <code>minDate</code>,the <code>minDate</code> is
    * set to the begin of the month of the <code>maxDate</code>.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @since 1.38.0
    * @param oMaxDate New value for property <code>maxDate</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMaxDate(oMaxDate: js.Any): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar_] = js.native
  /**
    * Sets a new value for property <code>minDate</code>.Minimum date that can be shown and selected in
    * the Calendar. This must be a JavaScript date object.<b>Note:</b> if the date is inside of a month
    * the complete month is displayed,but dates outside the valid range can not be selected.<b>Note:</b>
    * If the <code>minDate</code> is set to be after the <code>maxDate</code>,the <code>maxDate</code> is
    * set to the end of the month of the <code>minDate</code>.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @since 1.38.0
    * @param oMinDate New value for property <code>minDate</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMinDate(oMinDate: js.Any): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar_] = js.native
  /**
    * Sets a new value for property <code>months</code>.number of months displayedon phones always only
    * one month is displayedWhen called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.Default value is <code>1</code>.
    * @since 1.28.0
    * @param iMonths New value for property <code>months</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMonths(iMonths: Double): Unit = js.native
  /**
    * Sets a new value for property <code>nonWorkingDays</code>.If set, the provided weekdays are
    * displayed as non-working days.Valid values inside the array are 0 to 6.If not set, the weekend
    * defined in the locale settings is displayed as non-working days.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @since 1.28.9
    * @param sNonWorkingDays New value for property <code>nonWorkingDays</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setNonWorkingDays(sNonWorkingDays: Double): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar_] = js.native
  /**
    * Sets a new value for property <code>primaryCalendarType</code>.If set, the calendar type is used for
    * display.If not set, the calendar type of the global configuration is used.When called with a value
    * of <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @since 1.34.0
    * @param sPrimaryCalendarType New value for property <code>primaryCalendarType</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setPrimaryCalendarType(sPrimaryCalendarType: CalendarType): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar_] = js.native
  /**
    * Sets a new value for property <code>secondaryCalendarType</code>.If set, the days are also displayed
    * in this calendar typeIf not set, the dates are only displayed in the primary calendar typeWhen
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.
    * @since 1.34.0
    * @param sSecondaryCalendarType New value for property <code>secondaryCalendarType</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setSecondaryCalendarType(sSecondaryCalendarType: CalendarType): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar_] = js.native
  /**
    * Sets a new value for property <code>singleSelection</code>.If set, only a single date or interval,
    * if intervalSelection is enabled, can be selectedWhen called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>true</code>.
    * @param bSingleSelection New value for property <code>singleSelection</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setSingleSelection(bSingleSelection: Boolean): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar_] = js.native
  /**
    * Sets a new value for property <code>width</code>.Width of Calendar<b>Note:</b> There is a theme
    * depending minimum width, so the calendar can not be set smaller.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @since 1.38.0
    * @param sWidth New value for property <code>width</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setWidth(sWidth: js.Any): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar_] = js.native
}

