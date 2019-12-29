package typings.openui5.sap.ui.unified

import org.scalablytyped.runtime.Instantiable2
import typings.openui5.sap.ui.core.CalendarType
import typings.openui5.sap.ui.core.Control
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.unified.Calendar")
@js.native
class Calendar protected () extends Control {
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
  def addAriaLabelledBy(vAriaLabelledBy: js.Any): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar] = js.native
  def addAriaLabelledBy(vAriaLabelledBy: Control): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar] = js.native
  /**
    * Adds some disabledDate to the aggregation <code>disabledDates</code>.
    * @since 1.38.0
    * @param oDisabledDate the disabledDate to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addDisabledDate(oDisabledDate: DateRange): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar] = js.native
  /**
    * Adds some selectedDate to the aggregation <code>selectedDates</code>.
    * @param oSelectedDate the selectedDate to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addSelectedDate(oSelectedDate: DateRange): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar] = js.native
  /**
    * Adds some specialDate to the aggregation <code>specialDates</code>.
    * @since 1.24.0
    * @param oSpecialDate the specialDate to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addSpecialDate(oSpecialDate: DateTypeRange): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar] = js.native
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
  def attachCancel(oData: js.Any, fnFunction: js.Any): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar] = js.native
  def attachCancel(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar] = js.native
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
  def attachSelect(oData: js.Any, fnFunction: js.Any): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar] = js.native
  def attachSelect(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar] = js.native
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
  def attachStartDateChange(oData: js.Any, fnFunction: js.Any): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar] = js.native
  def attachStartDateChange(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar] = js.native
  /**
    * Destroys all the disabledDates in the aggregation <code>disabledDates</code>.
    * @since 1.38.0
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyDisabledDates(): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar] = js.native
  /**
    * Destroys all the selectedDates in the aggregation <code>selectedDates</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroySelectedDates(): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar] = js.native
  /**
    * Destroys all the specialDates in the aggregation <code>specialDates</code>.
    * @since 1.24.0
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroySpecialDates(): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar] = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>cancel</code> event of this
    * <code>sap.ui.unified.Calendar</code>.The passed function and listener object must match the ones
    * used for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachCancel(fnFunction: js.Any, oListener: js.Any): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar] = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>select</code> event of this
    * <code>sap.ui.unified.Calendar</code>.The passed function and listener object must match the ones
    * used for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachSelect(fnFunction: js.Any, oListener: js.Any): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar] = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>startDateChange</code> event of this
    * <code>sap.ui.unified.Calendar</code>.The passed function and listener object must match the ones
    * used for event registration.
    * @since 1.34.0
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachStartDateChange(fnFunction: js.Any, oListener: js.Any): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar] = js.native
  /**
    * Displays a date in the calendar but don't set the focus.
    * @since 1.28.0
    * @param oDate JavaScript date object for focused date.
    * @returns <code>this</code> to allow method chaining
    */
  def displayDate(oDate: js.Any): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar] = js.native
  /**
    * Fires event <code>cancel</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireCancel(mArguments: js.Any): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar] = js.native
  /**
    * Fires event <code>select</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireSelect(mArguments: js.Any): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar] = js.native
  /**
    * Fires event <code>startDateChange</code> to attached listeners.
    * @since 1.34.0
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireStartDateChange(mArguments: js.Any): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar] = js.native
  /**
    * Sets the focused date of the calendar.
    * @param oDate JavaScript date object for focused date.
    * @returns <code>this</code> to allow method chaining
    */
  def focusDate(oDate: js.Any): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar] = js.native
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
  def insertDisabledDate(oDisabledDate: DateRange, iIndex: Double): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar] = js.native
  /**
    * Inserts a selectedDate into the aggregation <code>selectedDates</code>.
    * @param oSelectedDate the selectedDate to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the selectedDate should be inserted at; for            
    * a negative value of <code>iIndex</code>, the selectedDate is inserted at position 0; for a value    
    *         greater than the current size of the aggregation, the selectedDate is inserted at           
    *  the last position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertSelectedDate(oSelectedDate: DateRange, iIndex: Double): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar] = js.native
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
  def insertSpecialDate(oSpecialDate: DateTypeRange, iIndex: Double): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar] = js.native
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
  def setIntervalSelection(bIntervalSelection: Boolean): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar] = js.native
  /**
    * Sets the associated <code>legend</code>.
    * @since 1.38.5
    * @param oLegend ID of an element which becomes the new target of this legend association;
    * alternatively, an element instance may be given
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setLegend(oLegend: js.Any): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar] = js.native
  def setLegend(oLegend: CalendarLegend): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar] = js.native
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
  def setMaxDate(oMaxDate: js.Any): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar] = js.native
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
  def setMinDate(oMinDate: js.Any): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar] = js.native
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
  def setNonWorkingDays(sNonWorkingDays: Double): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar] = js.native
  /**
    * Sets a new value for property <code>primaryCalendarType</code>.If set, the calendar type is used for
    * display.If not set, the calendar type of the global configuration is used.When called with a value
    * of <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @since 1.34.0
    * @param sPrimaryCalendarType New value for property <code>primaryCalendarType</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setPrimaryCalendarType(sPrimaryCalendarType: CalendarType): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar] = js.native
  /**
    * Sets a new value for property <code>secondaryCalendarType</code>.If set, the days are also displayed
    * in this calendar typeIf not set, the dates are only displayed in the primary calendar typeWhen
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.
    * @since 1.34.0
    * @param sSecondaryCalendarType New value for property <code>secondaryCalendarType</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setSecondaryCalendarType(sSecondaryCalendarType: CalendarType): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar] = js.native
  /**
    * Sets a new value for property <code>singleSelection</code>.If set, only a single date or interval,
    * if intervalSelection is enabled, can be selectedWhen called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>true</code>.
    * @param bSingleSelection New value for property <code>singleSelection</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setSingleSelection(bSingleSelection: Boolean): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar] = js.native
  /**
    * Sets a new value for property <code>width</code>.Width of Calendar<b>Note:</b> There is a theme
    * depending minimum width, so the calendar can not be set smaller.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @since 1.38.0
    * @param sWidth New value for property <code>width</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setWidth(sWidth: js.Any): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar] = js.native
}

@JSGlobal("sap.ui.unified.calendar")
@js.native
object calendar extends js.Object {
  @js.native
  class DatesRow protected () extends Month {
    /**
      * Constructor for a new calendar/DatesRow.Accepts an object literal <code>mSettings</code> that
      * defines initialproperty values, aggregated and associated objects as well as event handlers.See
      * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
      * settings object.
      * @param sId id for the new control, generated automatically if no id is given
      * @param mSettings initial settings for the new control
      */
    def this(sId: String) = this()
    def this(sId: String, mSettings: js.Any) = this()
    /**
      * Gets current value of property <code>days</code>.number of days displayedDefault value is
      * <code>7</code>.
      * @returns Value of property <code>days</code>
      */
    def getDays(): Double = js.native
    /**
      * Gets current value of property <code>showDayNamesLine</code>.If set the day names are shown in a
      * separate line.If not set the day names are shown inside the single days.Default value is
      * <code>true</code>.
      * @since 1.34.0
      * @returns Value of property <code>showDayNamesLine</code>
      */
    def getShowDayNamesLine(): Boolean = js.native
    /**
      * Gets current value of property <code>startDate</code>.Start date of the rowIf in rendering phase the
      * date property is not in the range startDate + days,it is set to the start dateSo after setting the
      * start date the date should be set to be in the range of the start date
      * @returns Value of property <code>startDate</code>
      */
    def getStartDate(): js.Any = js.native
    /**
      * Sets a new value for property <code>days</code>.number of days displayedWhen called with a value of
      * <code>null</code> or <code>undefined</code>, the default value of the property will be
      * restored.Default value is <code>7</code>.
      * @param iDays New value for property <code>days</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setDays(iDays: Double): DatesRow = js.native
    /**
      * Sets a new value for property <code>showDayNamesLine</code>.If set the day names are shown in a
      * separate line.If not set the day names are shown inside the single days.When called with a value of
      * <code>null</code> or <code>undefined</code>, the default value of the property will be
      * restored.Default value is <code>true</code>.
      * @since 1.34.0
      * @param bShowDayNamesLine New value for property <code>showDayNamesLine</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setShowDayNamesLine(bShowDayNamesLine: Boolean): DatesRow = js.native
    /**
      * Sets a new value for property <code>startDate</code>.Start date of the rowIf in rendering phase the
      * date property is not in the range startDate + days,it is set to the start dateSo after setting the
      * start date the date should be set to be in the range of the start dateWhen called with a value of
      * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
      * @param oStartDate New value for property <code>startDate</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setStartDate(oStartDate: js.Any): DatesRow = js.native
  }
  
  @js.native
  class Header protected () extends Control {
    /**
      * Constructor for a new Header.Accepts an object literal <code>mSettings</code> that defines
      * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
      * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
      * object.
      * @param sId ID for the new control, generated automatically if no ID is given
      * @param mSettings Initial settings for the new control
      */
    def this(sId: String) = this()
    def this(sId: String, mSettings: js.Any) = this()
    /**
      * Attaches event handler <code>fnFunction</code> to the <code>pressButton0</code> event of this
      * <code>sap.ui.unified.calendar.Header</code>.When called, the context of the event handler (its
      * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
      * to this <code>sap.ui.unified.calendar.Header</code> itself.First button pressed (normally day)
      * @since 1.32.0
      * @param oData An application-specific payload object that will be passed to the event handler along
      * with the event object when firing the event
      * @param fnFunction The function to be called when the event occurs
      * @param oListener Context object to call the event handler with. Defaults to this
      * <code>sap.ui.unified.calendar.Header</code> itself
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def attachPressButton0(oData: js.Any, fnFunction: js.Any): Header = js.native
    def attachPressButton0(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Header = js.native
    /**
      * Attaches event handler <code>fnFunction</code> to the <code>pressButton1</code> event of this
      * <code>sap.ui.unified.calendar.Header</code>.When called, the context of the event handler (its
      * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
      * to this <code>sap.ui.unified.calendar.Header</code> itself.Second button pressed (normally month)
      * @param oData An application-specific payload object that will be passed to the event handler along
      * with the event object when firing the event
      * @param fnFunction The function to be called when the event occurs
      * @param oListener Context object to call the event handler with. Defaults to this
      * <code>sap.ui.unified.calendar.Header</code> itself
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def attachPressButton1(oData: js.Any, fnFunction: js.Any): Header = js.native
    def attachPressButton1(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Header = js.native
    /**
      * Attaches event handler <code>fnFunction</code> to the <code>pressButton2</code> event of this
      * <code>sap.ui.unified.calendar.Header</code>.When called, the context of the event handler (its
      * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
      * to this <code>sap.ui.unified.calendar.Header</code> itself.Third button pressed (normally year)
      * @param oData An application-specific payload object that will be passed to the event handler along
      * with the event object when firing the event
      * @param fnFunction The function to be called when the event occurs
      * @param oListener Context object to call the event handler with. Defaults to this
      * <code>sap.ui.unified.calendar.Header</code> itself
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def attachPressButton2(oData: js.Any, fnFunction: js.Any): Header = js.native
    def attachPressButton2(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Header = js.native
    /**
      * Attaches event handler <code>fnFunction</code> to the <code>pressNext</code> event of this
      * <code>sap.ui.unified.calendar.Header</code>.When called, the context of the event handler (its
      * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
      * to this <code>sap.ui.unified.calendar.Header</code> itself.Next button pressed
      * @param oData An application-specific payload object that will be passed to the event handler along
      * with the event object when firing the event
      * @param fnFunction The function to be called when the event occurs
      * @param oListener Context object to call the event handler with. Defaults to this
      * <code>sap.ui.unified.calendar.Header</code> itself
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def attachPressNext(oData: js.Any, fnFunction: js.Any): Header = js.native
    def attachPressNext(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Header = js.native
    /**
      * Attaches event handler <code>fnFunction</code> to the <code>pressPrevious</code> event of this
      * <code>sap.ui.unified.calendar.Header</code>.When called, the context of the event handler (its
      * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
      * to this <code>sap.ui.unified.calendar.Header</code> itself.Previous button pressed
      * @param oData An application-specific payload object that will be passed to the event handler along
      * with the event object when firing the event
      * @param fnFunction The function to be called when the event occurs
      * @param oListener Context object to call the event handler with. Defaults to this
      * <code>sap.ui.unified.calendar.Header</code> itself
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def attachPressPrevious(oData: js.Any, fnFunction: js.Any): Header = js.native
    def attachPressPrevious(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Header = js.native
    /**
      * Detaches event handler <code>fnFunction</code> from the <code>pressButton0</code> event of this
      * <code>sap.ui.unified.calendar.Header</code>.The passed function and listener object must match the
      * ones used for event registration.
      * @since 1.32.0
      * @param fnFunction The function to be called, when the event occurs
      * @param oListener Context object on which the given function had to be called
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def detachPressButton0(fnFunction: js.Any, oListener: js.Any): Header = js.native
    /**
      * Detaches event handler <code>fnFunction</code> from the <code>pressButton1</code> event of this
      * <code>sap.ui.unified.calendar.Header</code>.The passed function and listener object must match the
      * ones used for event registration.
      * @param fnFunction The function to be called, when the event occurs
      * @param oListener Context object on which the given function had to be called
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def detachPressButton1(fnFunction: js.Any, oListener: js.Any): Header = js.native
    /**
      * Detaches event handler <code>fnFunction</code> from the <code>pressButton2</code> event of this
      * <code>sap.ui.unified.calendar.Header</code>.The passed function and listener object must match the
      * ones used for event registration.
      * @param fnFunction The function to be called, when the event occurs
      * @param oListener Context object on which the given function had to be called
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def detachPressButton2(fnFunction: js.Any, oListener: js.Any): Header = js.native
    /**
      * Detaches event handler <code>fnFunction</code> from the <code>pressNext</code> event of this
      * <code>sap.ui.unified.calendar.Header</code>.The passed function and listener object must match the
      * ones used for event registration.
      * @param fnFunction The function to be called, when the event occurs
      * @param oListener Context object on which the given function had to be called
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def detachPressNext(fnFunction: js.Any, oListener: js.Any): Header = js.native
    /**
      * Detaches event handler <code>fnFunction</code> from the <code>pressPrevious</code> event of this
      * <code>sap.ui.unified.calendar.Header</code>.The passed function and listener object must match the
      * ones used for event registration.
      * @param fnFunction The function to be called, when the event occurs
      * @param oListener Context object on which the given function had to be called
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def detachPressPrevious(fnFunction: js.Any, oListener: js.Any): Header = js.native
    /**
      * Fires event <code>pressButton0</code> to attached listeners.
      * @since 1.32.0
      * @param mArguments The arguments to pass along with the event
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def firePressButton0(mArguments: js.Any): Header = js.native
    /**
      * Fires event <code>pressButton1</code> to attached listeners.
      * @param mArguments The arguments to pass along with the event
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def firePressButton1(mArguments: js.Any): Header = js.native
    /**
      * Fires event <code>pressButton2</code> to attached listeners.
      * @param mArguments The arguments to pass along with the event
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def firePressButton2(mArguments: js.Any): Header = js.native
    /**
      * Fires event <code>pressNext</code> to attached listeners.
      * @param mArguments The arguments to pass along with the event
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def firePressNext(mArguments: js.Any): Header = js.native
    /**
      * Fires event <code>pressPrevious</code> to attached listeners.
      * @param mArguments The arguments to pass along with the event
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def firePressPrevious(mArguments: js.Any): Header = js.native
    /**
      * Gets current value of property <code>additionalTextButton0</code>.Additional text of the first
      * button (normally day)
      * @since 1.34.0
      * @returns Value of property <code>additionalTextButton0</code>
      */
    def getAdditionalTextButton0(): String = js.native
    /**
      * Gets current value of property <code>additionalTextButton1</code>.Additional text of the second
      * button (normally month)
      * @since 1.34.0
      * @returns Value of property <code>additionalTextButton1</code>
      */
    def getAdditionalTextButton1(): String = js.native
    /**
      * Gets current value of property <code>additionalTextButton2</code>.Additional text of the third
      * button (normally year)
      * @since 1.34.0
      * @returns Value of property <code>additionalTextButton2</code>
      */
    def getAdditionalTextButton2(): String = js.native
    /**
      * Gets current value of property <code>ariaLabelButton0</code>.aria-label of the first button
      * (normally day)
      * @since 1.32.0
      * @returns Value of property <code>ariaLabelButton0</code>
      */
    def getAriaLabelButton0(): String = js.native
    /**
      * Gets current value of property <code>ariaLabelButton1</code>.aria-label of the second button
      * (normally month)
      * @returns Value of property <code>ariaLabelButton1</code>
      */
    def getAriaLabelButton1(): String = js.native
    /**
      * Gets current value of property <code>ariaLabelButton2</code>.aria-label of the third button
      * (normally year)
      * @returns Value of property <code>ariaLabelButton2</code>
      */
    def getAriaLabelButton2(): String = js.native
    /**
      * Gets current value of property <code>enabledNext</code>.Enables the Next buttonDefault value is
      * <code>true</code>.
      * @returns Value of property <code>enabledNext</code>
      */
    def getEnabledNext(): Boolean = js.native
    /**
      * Gets current value of property <code>enabledPrevious</code>.Enables the previous buttonDefault value
      * is <code>true</code>.
      * @returns Value of property <code>enabledPrevious</code>
      */
    def getEnabledPrevious(): Boolean = js.native
    /**
      * Gets current value of property <code>textButton0</code>.Text of the first button (normally day)
      * @since 1.32.0
      * @returns Value of property <code>textButton0</code>
      */
    def getTextButton0(): String = js.native
    /**
      * Gets current value of property <code>textButton1</code>.Text of the second button (normally month)
      * @returns Value of property <code>textButton1</code>
      */
    def getTextButton1(): String = js.native
    /**
      * Gets current value of property <code>textButton2</code>.Text of the third button (normally year)
      * @returns Value of property <code>textButton2</code>
      */
    def getTextButton2(): String = js.native
    /**
      * Gets current value of property <code>visibleButton0</code>.If set, the first button will be
      * displayed<b>Note:</b> The default is set to false to be compatible to older versionsDefault value is
      * <code>false</code>.
      * @since 1.32.0
      * @returns Value of property <code>visibleButton0</code>
      */
    def getVisibleButton0(): Boolean = js.native
    /**
      * Gets current value of property <code>visibleButton1</code>.If set, the second button will be
      * displayedDefault value is <code>true</code>.
      * @since 1.32.0
      * @returns Value of property <code>visibleButton1</code>
      */
    def getVisibleButton1(): Boolean = js.native
    /**
      * Gets current value of property <code>visibleButton2</code>.If set, the third button will be
      * displayedDefault value is <code>true</code>.
      * @since 1.32.0
      * @returns Value of property <code>visibleButton2</code>
      */
    def getVisibleButton2(): Boolean = js.native
    /**
      * Sets a new value for property <code>additionalTextButton0</code>.Additional text of the first button
      * (normally day)When called with a value of <code>null</code> or <code>undefined</code>, the default
      * value of the property will be restored.
      * @since 1.34.0
      * @param sAdditionalTextButton0 New value for property <code>additionalTextButton0</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setAdditionalTextButton0(sAdditionalTextButton0: String): Header = js.native
    /**
      * Sets a new value for property <code>additionalTextButton1</code>.Additional text of the second
      * button (normally month)When called with a value of <code>null</code> or <code>undefined</code>, the
      * default value of the property will be restored.
      * @since 1.34.0
      * @param sAdditionalTextButton1 New value for property <code>additionalTextButton1</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setAdditionalTextButton1(sAdditionalTextButton1: String): Header = js.native
    /**
      * Sets a new value for property <code>additionalTextButton2</code>.Additional text of the third button
      * (normally year)When called with a value of <code>null</code> or <code>undefined</code>, the default
      * value of the property will be restored.
      * @since 1.34.0
      * @param sAdditionalTextButton2 New value for property <code>additionalTextButton2</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setAdditionalTextButton2(sAdditionalTextButton2: String): Header = js.native
    /**
      * Sets a new value for property <code>ariaLabelButton0</code>.aria-label of the first button (normally
      * day)When called with a value of <code>null</code> or <code>undefined</code>, the default value of
      * the property will be restored.
      * @since 1.32.0
      * @param sAriaLabelButton0 New value for property <code>ariaLabelButton0</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setAriaLabelButton0(sAriaLabelButton0: String): Header = js.native
    /**
      * Sets a new value for property <code>ariaLabelButton1</code>.aria-label of the second button
      * (normally month)When called with a value of <code>null</code> or <code>undefined</code>, the default
      * value of the property will be restored.
      * @param sAriaLabelButton1 New value for property <code>ariaLabelButton1</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setAriaLabelButton1(sAriaLabelButton1: String): Header = js.native
    /**
      * Sets a new value for property <code>ariaLabelButton2</code>.aria-label of the third button (normally
      * year)When called with a value of <code>null</code> or <code>undefined</code>, the default value of
      * the property will be restored.
      * @param sAriaLabelButton2 New value for property <code>ariaLabelButton2</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setAriaLabelButton2(sAriaLabelButton2: String): Header = js.native
    /**
      * Sets a new value for property <code>enabledNext</code>.Enables the Next buttonWhen called with a
      * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
      * restored.Default value is <code>true</code>.
      * @param bEnabledNext New value for property <code>enabledNext</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setEnabledNext(bEnabledNext: Boolean): Header = js.native
    /**
      * Sets a new value for property <code>enabledPrevious</code>.Enables the previous buttonWhen called
      * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
      * be restored.Default value is <code>true</code>.
      * @param bEnabledPrevious New value for property <code>enabledPrevious</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setEnabledPrevious(bEnabledPrevious: Boolean): Header = js.native
    /**
      * Sets a new value for property <code>textButton0</code>.Text of the first button (normally day)When
      * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
      * property will be restored.
      * @since 1.32.0
      * @param sTextButton0 New value for property <code>textButton0</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setTextButton0(sTextButton0: String): Header = js.native
    /**
      * Sets a new value for property <code>textButton1</code>.Text of the second button (normally
      * month)When called with a value of <code>null</code> or <code>undefined</code>, the default value of
      * the property will be restored.
      * @param sTextButton1 New value for property <code>textButton1</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setTextButton1(sTextButton1: String): Header = js.native
    /**
      * Sets a new value for property <code>textButton2</code>.Text of the third button (normally year)When
      * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
      * property will be restored.
      * @param sTextButton2 New value for property <code>textButton2</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setTextButton2(sTextButton2: String): Header = js.native
    /**
      * Sets a new value for property <code>visibleButton0</code>.If set, the first button will be
      * displayed<b>Note:</b> The default is set to false to be compatible to older versionsWhen called with
      * a value of <code>null</code> or <code>undefined</code>, the default value of the property will be
      * restored.Default value is <code>false</code>.
      * @since 1.32.0
      * @param bVisibleButton0 New value for property <code>visibleButton0</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setVisibleButton0(bVisibleButton0: Boolean): Header = js.native
    /**
      * Sets a new value for property <code>visibleButton1</code>.If set, the second button will be
      * displayedWhen called with a value of <code>null</code> or <code>undefined</code>, the default value
      * of the property will be restored.Default value is <code>true</code>.
      * @since 1.32.0
      * @param bVisibleButton1 New value for property <code>visibleButton1</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setVisibleButton1(bVisibleButton1: Boolean): Header = js.native
    /**
      * Sets a new value for property <code>visibleButton2</code>.If set, the third button will be
      * displayedWhen called with a value of <code>null</code> or <code>undefined</code>, the default value
      * of the property will be restored.Default value is <code>true</code>.
      * @since 1.32.0
      * @param bVisibleButton2 New value for property <code>visibleButton2</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setVisibleButton2(bVisibleButton2: Boolean): Header = js.native
  }
  
  @js.native
  class Month protected () extends Control {
    /**
      * Constructor for a new calendar/Month.Accepts an object literal <code>mSettings</code> that defines
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
      * @param vAriaLabelledBy the ariaLabelledBy to add; if empty, nothing is inserted
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def addAriaLabelledBy(vAriaLabelledBy: js.Any): Month = js.native
    def addAriaLabelledBy(vAriaLabelledBy: Control): Month = js.native
    /**
      * Adds some disabledDate to the aggregation <code>disabledDates</code>.
      * @since 1.38.0
      * @param oDisabledDate the disabledDate to add; if empty, nothing is inserted
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def addDisabledDate(oDisabledDate: DateRange): Month = js.native
    /**
      * Adds some selectedDate to the aggregation <code>selectedDates</code>.
      * @param oSelectedDate the selectedDate to add; if empty, nothing is inserted
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def addSelectedDate(oSelectedDate: DateRange): Month = js.native
    /**
      * Adds some specialDate to the aggregation <code>specialDates</code>.
      * @param oSpecialDate the specialDate to add; if empty, nothing is inserted
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def addSpecialDate(oSpecialDate: DateTypeRange): Month = js.native
    /**
      * Attaches event handler <code>fnFunction</code> to the <code>focus</code> event of this
      * <code>sap.ui.unified.calendar.Month</code>.When called, the context of the event handler (its
      * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
      * to this <code>sap.ui.unified.calendar.Month</code> itself.Date focus changed
      * @param oData An application-specific payload object that will be passed to the event handler along
      * with the event object when firing the event
      * @param fnFunction The function to be called when the event occurs
      * @param oListener Context object to call the event handler with. Defaults to this
      * <code>sap.ui.unified.calendar.Month</code> itself
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def attachFocus(oData: js.Any, fnFunction: js.Any): Month = js.native
    def attachFocus(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Month = js.native
    /**
      * Attaches event handler <code>fnFunction</code> to the <code>select</code> event of this
      * <code>sap.ui.unified.calendar.Month</code>.When called, the context of the event handler (its
      * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
      * to this <code>sap.ui.unified.calendar.Month</code> itself.Date selection changed
      * @param oData An application-specific payload object that will be passed to the event handler along
      * with the event object when firing the event
      * @param fnFunction The function to be called when the event occurs
      * @param oListener Context object to call the event handler with. Defaults to this
      * <code>sap.ui.unified.calendar.Month</code> itself
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def attachSelect(oData: js.Any, fnFunction: js.Any): Month = js.native
    def attachSelect(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Month = js.native
    /**
      * checks if a date is focusable in the current rendered output.So if not rendered or in other month it
      * is not focusable.
      * @param oDate JavaScript date object for focused date.
      * @returns flag if focusable
      */
    def checkDateFocusable(oDate: js.Any): Boolean = js.native
    /**
      * Destroys all the disabledDates in the aggregation <code>disabledDates</code>.
      * @since 1.38.0
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def destroyDisabledDates(): Month = js.native
    /**
      * Destroys all the selectedDates in the aggregation <code>selectedDates</code>.
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def destroySelectedDates(): Month = js.native
    /**
      * Destroys all the specialDates in the aggregation <code>specialDates</code>.
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def destroySpecialDates(): Month = js.native
    /**
      * Detaches event handler <code>fnFunction</code> from the <code>focus</code> event of this
      * <code>sap.ui.unified.calendar.Month</code>.The passed function and listener object must match the
      * ones used for event registration.
      * @param fnFunction The function to be called, when the event occurs
      * @param oListener Context object on which the given function had to be called
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def detachFocus(fnFunction: js.Any, oListener: js.Any): Month = js.native
    /**
      * Detaches event handler <code>fnFunction</code> from the <code>select</code> event of this
      * <code>sap.ui.unified.calendar.Month</code>.The passed function and listener object must match the
      * ones used for event registration.
      * @param fnFunction The function to be called, when the event occurs
      * @param oListener Context object on which the given function had to be called
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def detachSelect(fnFunction: js.Any, oListener: js.Any): Month = js.native
    /**
      * displays the month of a given date without setting the focus
      * @param oDate JavaScript date object for focused date.
      * @returns <code>this</code> to allow method chaining
      */
    def displayDate(oDate: js.Any): Month = js.native
    /**
      * Fires event <code>focus</code> to attached listeners.Expects the following event
      * parameters:<ul><li><code>date</code> of type <code>object</code>focused
      * date</li><li><code>otherMonth</code> of type <code>boolean</code>focused date is in an other month
      * that the displayed one</li><li><code>restoreOldDate</code> of type <code>boolean</code>focused date
      * is set to the same as before (date in other month clicked)</li></ul>
      * @param mArguments The arguments to pass along with the event
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def fireFocus(mArguments: js.Any): Month = js.native
    /**
      * Fires event <code>select</code> to attached listeners.
      * @param mArguments The arguments to pass along with the event
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def fireSelect(mArguments: js.Any): Month = js.native
    /**
      * Returns array of IDs of the elements which are the current targets of the association
      * <code>ariaLabelledBy</code>.
      */
    def getAriaLabelledBy(): js.Array[_] = js.native
    /**
      * Gets current value of property <code>date</code>.the month including this date is rendered and this
      * date is initial focused (if no other focus set)
      * @returns Value of property <code>date</code>
      */
    def getDate(): js.Any = js.native
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
      * Gets current value of property <code>showHeader</code>.If set, a header with the month name is
      * shownDefault value is <code>false</code>.
      * @returns Value of property <code>showHeader</code>
      */
    def getShowHeader(): Boolean = js.native
    /**
      * Gets current value of property <code>singleSelection</code>.If set, only a single date or interval,
      * if intervalSelection is enabled, can be selectedDefault value is <code>true</code>.
      * @returns Value of property <code>singleSelection</code>
      */
    def getSingleSelection(): Boolean = js.native
    /**
      * Gets content of aggregation <code>specialDates</code>.Date Range with type to visualize special days
      * in the Calendar.If one day is assigned to more than one Type, only the first one will be used.
      */
    def getSpecialDates(): js.Array[DateTypeRange] = js.native
    /**
      * Gets current value of property <code>width</code>.Width of Month
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
    def insertDisabledDate(oDisabledDate: DateRange, iIndex: Double): Month = js.native
    /**
      * Inserts a selectedDate into the aggregation <code>selectedDates</code>.
      * @param oSelectedDate the selectedDate to insert; if empty, nothing is inserted
      * @param iIndex the <code>0</code>-based index the selectedDate should be inserted at; for            
      * a negative value of <code>iIndex</code>, the selectedDate is inserted at position 0; for a value    
      *         greater than the current size of the aggregation, the selectedDate is inserted at           
      *  the last position
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def insertSelectedDate(oSelectedDate: DateRange, iIndex: Double): Month = js.native
    /**
      * Inserts a specialDate into the aggregation <code>specialDates</code>.
      * @param oSpecialDate the specialDate to insert; if empty, nothing is inserted
      * @param iIndex the <code>0</code>-based index the specialDate should be inserted at; for            
      * a negative value of <code>iIndex</code>, the specialDate is inserted at position 0; for a value     
      *        greater than the current size of the aggregation, the specialDate is inserted at            
      * the last position
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def insertSpecialDate(oSpecialDate: DateTypeRange, iIndex: Double): Month = js.native
    /**
      * Removes all the controls in the association named <code>ariaLabelledBy</code>.
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
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllSpecialDates(): js.Array[DateTypeRange] = js.native
    def removeAriaLabelledBy(vAriaLabelledBy: js.Any): js.Any = js.native
    /**
      * Removes an ariaLabelledBy from the association named <code>ariaLabelledBy</code>.
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
      * @param vSpecialDate The specialDate to remove or its index or id
      * @returns The removed specialDate or <code>null</code>
      */
    def removeSpecialDate(vSpecialDate: Double): DateTypeRange = js.native
    def removeSpecialDate(vSpecialDate: DateTypeRange): DateTypeRange = js.native
    /**
      * Sets a new value for property <code>date</code>.the month including this date is rendered and this
      * date is initial focused (if no other focus set)When called with a value of <code>null</code> or
      * <code>undefined</code>, the default value of the property will be restored.
      * @param oDate New value for property <code>date</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setDate(oDate: js.Any): Month = js.native
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
    def setIntervalSelection(bIntervalSelection: Boolean): Month = js.native
    /**
      * Sets the associated <code>legend</code>.
      * @since 1.38.5
      * @param oLegend ID of an element which becomes the new target of this legend association;
      * alternatively, an element instance may be given
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setLegend(oLegend: js.Any): Month = js.native
    def setLegend(oLegend: CalendarLegend): Month = js.native
    /**
      * Sets a new value for property <code>nonWorkingDays</code>.If set, the provided weekdays are
      * displayed as non-working days.Valid values inside the array are 0 to 6.If not set, the weekend
      * defined in the locale settings is displayed as non-working days.When called with a value of
      * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
      * @since 1.28.9
      * @param sNonWorkingDays New value for property <code>nonWorkingDays</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setNonWorkingDays(sNonWorkingDays: Double): Month = js.native
    /**
      * Sets a new value for property <code>primaryCalendarType</code>.If set, the calendar type is used for
      * display.If not set, the calendar type of the global configuration is used.When called with a value
      * of <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
      * @since 1.34.0
      * @param sPrimaryCalendarType New value for property <code>primaryCalendarType</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setPrimaryCalendarType(sPrimaryCalendarType: CalendarType): Month = js.native
    /**
      * Sets a new value for property <code>secondaryCalendarType</code>.If set, the days are also displayed
      * in this calendar typeIf not set, the dates are only displayed in the primary calendar typeWhen
      * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
      * property will be restored.
      * @since 1.34.0
      * @param sSecondaryCalendarType New value for property <code>secondaryCalendarType</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setSecondaryCalendarType(sSecondaryCalendarType: CalendarType): Month = js.native
    /**
      * Sets a new value for property <code>showHeader</code>.If set, a header with the month name is
      * shownWhen called with a value of <code>null</code> or <code>undefined</code>, the default value of
      * the property will be restored.Default value is <code>false</code>.
      * @param bShowHeader New value for property <code>showHeader</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setShowHeader(bShowHeader: Boolean): Month = js.native
    /**
      * Sets a new value for property <code>singleSelection</code>.If set, only a single date or interval,
      * if intervalSelection is enabled, can be selectedWhen called with a value of <code>null</code> or
      * <code>undefined</code>, the default value of the property will be restored.Default value is
      * <code>true</code>.
      * @param bSingleSelection New value for property <code>singleSelection</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setSingleSelection(bSingleSelection: Boolean): Month = js.native
    /**
      * Sets a new value for property <code>width</code>.Width of MonthWhen called with a value of
      * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
      * @since 1.38.0
      * @param sWidth New value for property <code>width</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setWidth(sWidth: js.Any): Month = js.native
  }
  
  @js.native
  class MonthPicker protected () extends Control {
    /**
      * Constructor for a new MonthPicker.Accepts an object literal <code>mSettings</code> that defines
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
    def getColumns(): Double = js.native
    /**
      * Gets current value of property <code>month</code>.The month is initial focused and selectedThe value
      * must be between 0 and 11Default value is <code>0</code>.
      * @returns Value of property <code>month</code>
      */
    def getMonth(): Double = js.native
    /**
      * Gets current value of property <code>months</code>.number of displayed monthsThe value must be
      * between 1 and 12Default value is <code>12</code>.
      * @since 1.30.0
      * @returns Value of property <code>months</code>
      */
    def getMonths(): Double = js.native
    /**
      * Gets current value of property <code>primaryCalendarType</code>.If set, the calendar type is used
      * for display.If not set, the calendar type of the global configuration is used.
      * @since 1.34.0
      * @returns Value of property <code>primaryCalendarType</code>
      */
    def getPrimaryCalendarType(): CalendarType = js.native
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
    def setColumns(iColumns: Double): MonthPicker = js.native
    /**
      * sets a minimum an maximum month
      * @param iMin minimum month as integer (starting with 0)
      * @param iMax maximum month as integer (starting with 0)
      * @returns <code>this</code> to allow method chaining
      */
    def setMinMax(iMin: Double): MonthPicker = js.native
    def setMinMax(iMin: Double, iMax: Double): MonthPicker = js.native
    /**
      * Sets a new value for property <code>month</code>.The month is initial focused and selectedThe value
      * must be between 0 and 11When called with a value of <code>null</code> or <code>undefined</code>, the
      * default value of the property will be restored.Default value is <code>0</code>.
      * @param iMonth New value for property <code>month</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setMonth(iMonth: Double): MonthPicker = js.native
    /**
      * Sets a new value for property <code>months</code>.number of displayed monthsThe value must be
      * between 1 and 12When called with a value of <code>null</code> or <code>undefined</code>, the default
      * value of the property will be restored.Default value is <code>12</code>.
      * @since 1.30.0
      * @param iMonths New value for property <code>months</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setMonths(iMonths: Double): MonthPicker = js.native
    /**
      * Sets a new value for property <code>primaryCalendarType</code>.If set, the calendar type is used for
      * display.If not set, the calendar type of the global configuration is used.When called with a value
      * of <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
      * @since 1.34.0
      * @param sPrimaryCalendarType New value for property <code>primaryCalendarType</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setPrimaryCalendarType(sPrimaryCalendarType: CalendarType): MonthPicker = js.native
  }
  
  @js.native
  class MonthsRow protected () extends Control {
    /**
      * Constructor for a new <code>MonthsRow</code>.It shows a calendar with month granularity<b>Note:</b>
      * This is used inside the CalendarMonthInterval, not for standalone usage.Accepts an object literal
      * <code>mSettings</code> that defines initialproperty values, aggregated and associated objects as
      * well as event handlers.See {@link sap.ui.base.ManagedObject#constructor} for a general description
      * of the syntax of the settings object.
      * @param sId ID for the new control, generated automatically if no ID is given
      * @param mSettings Initial settings for the new control
      */
    def this(sId: String) = this()
    def this(sId: String, mSettings: js.Any) = this()
    /**
      * Adds some ariaLabelledBy into the association <code>ariaLabelledBy</code>.
      * @param vAriaLabelledBy the ariaLabelledBy to add; if empty, nothing is inserted
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def addAriaLabelledBy(vAriaLabelledBy: js.Any): MonthsRow = js.native
    def addAriaLabelledBy(vAriaLabelledBy: Control): MonthsRow = js.native
    /**
      * Adds some selectedDate to the aggregation <code>selectedDates</code>.
      * @param oSelectedDate the selectedDate to add; if empty, nothing is inserted
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def addSelectedDate(oSelectedDate: DateRange): MonthsRow = js.native
    /**
      * Adds some specialDate to the aggregation <code>specialDates</code>.
      * @param oSpecialDate the specialDate to add; if empty, nothing is inserted
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def addSpecialDate(oSpecialDate: DateTypeRange): MonthsRow = js.native
    /**
      * Attaches event handler <code>fnFunction</code> to the <code>focus</code> event of this
      * <code>sap.ui.unified.calendar.MonthsRow</code>.When called, the context of the event handler (its
      * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
      * to this <code>sap.ui.unified.calendar.MonthsRow</code> itself.Month focus changed
      * @param oData An application-specific payload object that will be passed to the event handler along
      * with the event object when firing the event
      * @param fnFunction The function to be called when the event occurs
      * @param oListener Context object to call the event handler with. Defaults to this
      * <code>sap.ui.unified.calendar.MonthsRow</code> itself
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def attachFocus(oData: js.Any, fnFunction: js.Any): MonthsRow = js.native
    def attachFocus(oData: js.Any, fnFunction: js.Any, oListener: js.Any): MonthsRow = js.native
    /**
      * Attaches event handler <code>fnFunction</code> to the <code>select</code> event of this
      * <code>sap.ui.unified.calendar.MonthsRow</code>.When called, the context of the event handler (its
      * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
      * to this <code>sap.ui.unified.calendar.MonthsRow</code> itself.Month selection changed
      * @param oData An application-specific payload object that will be passed to the event handler along
      * with the event object when firing the event
      * @param fnFunction The function to be called when the event occurs
      * @param oListener Context object to call the event handler with. Defaults to this
      * <code>sap.ui.unified.calendar.MonthsRow</code> itself
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def attachSelect(oData: js.Any, fnFunction: js.Any): MonthsRow = js.native
    def attachSelect(oData: js.Any, fnFunction: js.Any, oListener: js.Any): MonthsRow = js.native
    /**
      * Checks if a date is focusable in the current rendered output.This means that if it is not rendered,
      * it is not focusable.
      * @param oDate JavaScript Date object for focused date.
      * @returns flag if focusable
      */
    def checkDateFocusable(oDate: js.Any): Boolean = js.native
    /**
      * Destroys all the selectedDates in the aggregation <code>selectedDates</code>.
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def destroySelectedDates(): MonthsRow = js.native
    /**
      * Destroys all the specialDates in the aggregation <code>specialDates</code>.
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def destroySpecialDates(): MonthsRow = js.native
    /**
      * Detaches event handler <code>fnFunction</code> from the <code>focus</code> event of this
      * <code>sap.ui.unified.calendar.MonthsRow</code>.The passed function and listener object must match
      * the ones used for event registration.
      * @param fnFunction The function to be called, when the event occurs
      * @param oListener Context object on which the given function had to be called
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def detachFocus(fnFunction: js.Any, oListener: js.Any): MonthsRow = js.native
    /**
      * Detaches event handler <code>fnFunction</code> from the <code>select</code> event of this
      * <code>sap.ui.unified.calendar.MonthsRow</code>.The passed function and listener object must match
      * the ones used for event registration.
      * @param fnFunction The function to be called, when the event occurs
      * @param oListener Context object on which the given function had to be called
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def detachSelect(fnFunction: js.Any, oListener: js.Any): MonthsRow = js.native
    /**
      * Displays the month of a given date without setting the focus
      * @param oDate JavaScript Date object for focused date.
      * @returns <code>this</code> to allow method chaining
      */
    def displayDate(oDate: js.Any): MonthsRow = js.native
    /**
      * Fires event <code>focus</code> to attached listeners.Expects the following event
      * parameters:<ul><li><code>date</code> of type <code>object</code>First date, as JavaScript Date
      * object, of the month that is focused.</li><li><code>notVisible</code> of type <code>boolean</code>If
      * set, the focused date is not rendered yet. (This happens by navigating out of the visible
      * area.)</li></ul>
      * @param mArguments The arguments to pass along with the event
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def fireFocus(mArguments: js.Any): MonthsRow = js.native
    /**
      * Fires event <code>select</code> to attached listeners.
      * @param mArguments The arguments to pass along with the event
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def fireSelect(mArguments: js.Any): MonthsRow = js.native
    /**
      * Returns array of IDs of the elements which are the current targets of the association
      * <code>ariaLabelledBy</code>.
      */
    def getAriaLabelledBy(): js.Array[_] = js.native
    /**
      * Gets current value of property <code>date</code>.A date as JavaScript Date object. The month
      * including this date is rendered and this date is focused initially (if no other focus is set).If the
      * date property is not in the range <code>startDate</code> + <code>months</code> in the rendering
      * phase,it is set to the <code>startDate</code>.So after setting the <code>startDate</code> the date
      * should be set to be in the visible range.
      * @returns Value of property <code>date</code>
      */
    def getDate(): js.Any = js.native
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
      * Gets current value of property <code>months</code>.Number of months displayedDefault value is
      * <code>12</code>.
      * @returns Value of property <code>months</code>
      */
    def getMonths(): Double = js.native
    /**
      * Gets content of aggregation <code>selectedDates</code>.Date ranges for selected dates.If
      * <code>singleSelection</code> is set, only the first entry is used.<b>Note:</b> Even if only one day
      * is selected, the whole corresponding month is selected.
      */
    def getSelectedDates(): js.Array[DateRange] = js.native
    /**
      * Gets current value of property <code>showHeader</code>.If set, a header with the years is shown to
      * visualize what month belongs to what year.Default value is <code>false</code>.
      * @returns Value of property <code>showHeader</code>
      */
    def getShowHeader(): Boolean = js.native
    /**
      * Gets current value of property <code>singleSelection</code>.If set, only a single month or interval,
      * if intervalSelection is enabled, can be selected<b>Note:</b> Selection of multiple intervals is not
      * supported in the current version.Default value is <code>true</code>.
      * @returns Value of property <code>singleSelection</code>
      */
    def getSingleSelection(): Boolean = js.native
    /**
      * Gets content of aggregation <code>specialDates</code>.Date ranges with type to visualize special
      * months in the row.If one day is assigned to more than one type, only the first one will be
      * used.<b>Note:</b> Even if only one day is set as a special day, the whole corresponding month is
      * displayed in this way.
      */
    def getSpecialDates(): js.Array[DateTypeRange] = js.native
    /**
      * Gets current value of property <code>startDate</code>.Start date, as JavaScript Date object, of the
      * row. The month of this date is the first month of the displayed row.
      * @returns Value of property <code>startDate</code>
      */
    def getStartDate(): js.Any = js.native
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
      * @param oSpecialDate The specialDate whose index is looked for
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfSpecialDate(oSpecialDate: DateTypeRange): Double = js.native
    /**
      * Inserts a selectedDate into the aggregation <code>selectedDates</code>.
      * @param oSelectedDate the selectedDate to insert; if empty, nothing is inserted
      * @param iIndex the <code>0</code>-based index the selectedDate should be inserted at; for            
      * a negative value of <code>iIndex</code>, the selectedDate is inserted at position 0; for a value    
      *         greater than the current size of the aggregation, the selectedDate is inserted at           
      *  the last position
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def insertSelectedDate(oSelectedDate: DateRange, iIndex: Double): MonthsRow = js.native
    /**
      * Inserts a specialDate into the aggregation <code>specialDates</code>.
      * @param oSpecialDate the specialDate to insert; if empty, nothing is inserted
      * @param iIndex the <code>0</code>-based index the specialDate should be inserted at; for            
      * a negative value of <code>iIndex</code>, the specialDate is inserted at position 0; for a value     
      *        greater than the current size of the aggregation, the specialDate is inserted at            
      * the last position
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def insertSpecialDate(oSpecialDate: DateTypeRange, iIndex: Double): MonthsRow = js.native
    /**
      * Removes all the controls in the association named <code>ariaLabelledBy</code>.
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAriaLabelledBy(): js.Array[_] = js.native
    /**
      * Removes all the controls from the aggregation <code>selectedDates</code>.Additionally, it
      * unregisters them from the hosting UIArea.
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllSelectedDates(): js.Array[DateRange] = js.native
    /**
      * Removes all the controls from the aggregation <code>specialDates</code>.Additionally, it unregisters
      * them from the hosting UIArea.
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllSpecialDates(): js.Array[DateTypeRange] = js.native
    def removeAriaLabelledBy(vAriaLabelledBy: js.Any): js.Any = js.native
    /**
      * Removes an ariaLabelledBy from the association named <code>ariaLabelledBy</code>.
      * @param vAriaLabelledBy The ariaLabelledBy to be removed or its index or ID
      * @returns The removed ariaLabelledBy or <code>null</code>
      */
    def removeAriaLabelledBy(vAriaLabelledBy: Double): js.Any = js.native
    def removeAriaLabelledBy(vAriaLabelledBy: Control): js.Any = js.native
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
      * @param vSpecialDate The specialDate to remove or its index or id
      * @returns The removed specialDate or <code>null</code>
      */
    def removeSpecialDate(vSpecialDate: Double): DateTypeRange = js.native
    def removeSpecialDate(vSpecialDate: DateTypeRange): DateTypeRange = js.native
    /**
      * Sets a new value for property <code>date</code>.A date as JavaScript Date object. The month
      * including this date is rendered and this date is focused initially (if no other focus is set).If the
      * date property is not in the range <code>startDate</code> + <code>months</code> in the rendering
      * phase,it is set to the <code>startDate</code>.So after setting the <code>startDate</code> the date
      * should be set to be in the visible range.When called with a value of <code>null</code> or
      * <code>undefined</code>, the default value of the property will be restored.
      * @param oDate New value for property <code>date</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setDate(oDate: js.Any): MonthsRow = js.native
    /**
      * Sets a new value for property <code>intervalSelection</code>.If set, interval selection is
      * allowedWhen called with a value of <code>null</code> or <code>undefined</code>, the default value of
      * the property will be restored.Default value is <code>false</code>.
      * @param bIntervalSelection New value for property <code>intervalSelection</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setIntervalSelection(bIntervalSelection: Boolean): MonthsRow = js.native
    /**
      * Sets the associated <code>legend</code>.
      * @since 1.38.5
      * @param oLegend ID of an element which becomes the new target of this legend association;
      * alternatively, an element instance may be given
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setLegend(oLegend: js.Any): MonthsRow = js.native
    def setLegend(oLegend: CalendarLegend): MonthsRow = js.native
    /**
      * Sets a new value for property <code>months</code>.Number of months displayedWhen called with a value
      * of <code>null</code> or <code>undefined</code>, the default value of the property will be
      * restored.Default value is <code>12</code>.
      * @param iMonths New value for property <code>months</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setMonths(iMonths: Double): MonthsRow = js.native
    /**
      * Sets a new value for property <code>showHeader</code>.If set, a header with the years is shown to
      * visualize what month belongs to what year.When called with a value of <code>null</code> or
      * <code>undefined</code>, the default value of the property will be restored.Default value is
      * <code>false</code>.
      * @param bShowHeader New value for property <code>showHeader</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setShowHeader(bShowHeader: Boolean): MonthsRow = js.native
    /**
      * Sets a new value for property <code>singleSelection</code>.If set, only a single month or interval,
      * if intervalSelection is enabled, can be selected<b>Note:</b> Selection of multiple intervals is not
      * supported in the current version.When called with a value of <code>null</code> or
      * <code>undefined</code>, the default value of the property will be restored.Default value is
      * <code>true</code>.
      * @param bSingleSelection New value for property <code>singleSelection</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setSingleSelection(bSingleSelection: Boolean): MonthsRow = js.native
    /**
      * Sets a new value for property <code>startDate</code>.Start date, as JavaScript Date object, of the
      * row. The month of this date is the first month of the displayed row.When called with a value of
      * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
      * @param oStartDate New value for property <code>startDate</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setStartDate(oStartDate: js.Any): MonthsRow = js.native
  }
  
  @js.native
  class TimesRow protected () extends Control {
    /**
      * Constructor for a new <code>TimesRow</code>.It shows a calendar with time granularity (normally
      * hours)<b>Note:</b> This is used inside the CalendarTimeInterval, not for standalone usage.Accepts an
      * object literal <code>mSettings</code> that defines initialproperty values, aggregated and associated
      * objects as well as event handlers.See {@link sap.ui.base.ManagedObject#constructor} for a general
      * description of the syntax of the settings object.
      * @param sId ID for the new control, generated automatically if no ID is given
      * @param mSettings Initial settings for the new control
      */
    def this(sId: String) = this()
    def this(sId: String, mSettings: js.Any) = this()
    /**
      * Adds some ariaLabelledBy into the association <code>ariaLabelledBy</code>.
      * @param vAriaLabelledBy the ariaLabelledBy to add; if empty, nothing is inserted
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def addAriaLabelledBy(vAriaLabelledBy: js.Any): TimesRow = js.native
    def addAriaLabelledBy(vAriaLabelledBy: Control): TimesRow = js.native
    /**
      * Adds some selectedDate to the aggregation <code>selectedDates</code>.
      * @param oSelectedDate the selectedDate to add; if empty, nothing is inserted
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def addSelectedDate(oSelectedDate: DateRange): TimesRow = js.native
    /**
      * Adds some specialDate to the aggregation <code>specialDates</code>.
      * @param oSpecialDate the specialDate to add; if empty, nothing is inserted
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def addSpecialDate(oSpecialDate: DateTypeRange): TimesRow = js.native
    /**
      * Attaches event handler <code>fnFunction</code> to the <code>focus</code> event of this
      * <code>sap.ui.unified.calendar.TimesRow</code>.When called, the context of the event handler (its
      * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
      * to this <code>sap.ui.unified.calendar.TimesRow</code> itself.Time focus changed
      * @param oData An application-specific payload object that will be passed to the event handler along
      * with the event object when firing the event
      * @param fnFunction The function to be called when the event occurs
      * @param oListener Context object to call the event handler with. Defaults to this
      * <code>sap.ui.unified.calendar.TimesRow</code> itself
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def attachFocus(oData: js.Any, fnFunction: js.Any): TimesRow = js.native
    def attachFocus(oData: js.Any, fnFunction: js.Any, oListener: js.Any): TimesRow = js.native
    /**
      * Attaches event handler <code>fnFunction</code> to the <code>select</code> event of this
      * <code>sap.ui.unified.calendar.TimesRow</code>.When called, the context of the event handler (its
      * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
      * to this <code>sap.ui.unified.calendar.TimesRow</code> itself.Time selection changed
      * @param oData An application-specific payload object that will be passed to the event handler along
      * with the event object when firing the event
      * @param fnFunction The function to be called when the event occurs
      * @param oListener Context object to call the event handler with. Defaults to this
      * <code>sap.ui.unified.calendar.TimesRow</code> itself
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def attachSelect(oData: js.Any, fnFunction: js.Any): TimesRow = js.native
    def attachSelect(oData: js.Any, fnFunction: js.Any, oListener: js.Any): TimesRow = js.native
    /**
      * Checks if a date is focusable in the current rendered output.This means that if it is not rendered,
      * it is not focusable.
      * @param oDate JavaScript Date object for focused date.
      * @returns flag if focusable
      */
    def checkDateFocusable(oDate: js.Any): Boolean = js.native
    /**
      * Destroys all the selectedDates in the aggregation <code>selectedDates</code>.
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def destroySelectedDates(): TimesRow = js.native
    /**
      * Destroys all the specialDates in the aggregation <code>specialDates</code>.
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def destroySpecialDates(): TimesRow = js.native
    /**
      * Detaches event handler <code>fnFunction</code> from the <code>focus</code> event of this
      * <code>sap.ui.unified.calendar.TimesRow</code>.The passed function and listener object must match the
      * ones used for event registration.
      * @param fnFunction The function to be called, when the event occurs
      * @param oListener Context object on which the given function had to be called
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def detachFocus(fnFunction: js.Any, oListener: js.Any): TimesRow = js.native
    /**
      * Detaches event handler <code>fnFunction</code> from the <code>select</code> event of this
      * <code>sap.ui.unified.calendar.TimesRow</code>.The passed function and listener object must match the
      * ones used for event registration.
      * @param fnFunction The function to be called, when the event occurs
      * @param oListener Context object on which the given function had to be called
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def detachSelect(fnFunction: js.Any, oListener: js.Any): TimesRow = js.native
    /**
      * Displays the given date without setting the focus
      * @param oDate JavaScript Date object for focused date.
      * @returns <code>this</code> to allow method chaining
      */
    def displayDate(oDate: js.Any): TimesRow = js.native
    /**
      * Fires event <code>focus</code> to attached listeners.Expects the following event
      * parameters:<ul><li><code>date</code> of type <code>object</code>date, as JavaScript Date object, of
      * the focused time.</li><li><code>notVisible</code> of type <code>boolean</code>If set, the focused
      * date is not rendered yet. (This happens by navigating out of the visible area.)</li></ul>
      * @param mArguments The arguments to pass along with the event
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def fireFocus(mArguments: js.Any): TimesRow = js.native
    /**
      * Fires event <code>select</code> to attached listeners.
      * @param mArguments The arguments to pass along with the event
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def fireSelect(mArguments: js.Any): TimesRow = js.native
    /**
      * Returns array of IDs of the elements which are the current targets of the association
      * <code>ariaLabelledBy</code>.
      */
    def getAriaLabelledBy(): js.Array[_] = js.native
    /**
      * Gets current value of property <code>date</code>.A date as JavaScript Date object. The month
      * including this date is rendered and this date is focused initially (if no other focus is set).If the
      * date property is not in the range <code>startDate</code> + <code>items</code> in the rendering
      * phase,it is set to the <code>startDate</code>.So after setting the <code>startDate</code> the date
      * should be set to be in the visible range.
      * @returns Value of property <code>date</code>
      */
    def getDate(): js.Any = js.native
    /**
      * Gets current value of property <code>intervalMinutes</code>.Size of on time interval in minutes,
      * default is 60 minutes.<b>Note:</b> the start of the interval calculation is always
      * <code>startDat</code> at 00:00.A interval longer then 720 minutes is not allowed. Please use the
      * <code>DatesRow</code> instead.A day must be divisible by this interval size. One interval must not
      * include more than one day.Default value is <code>60</code>.
      * @returns Value of property <code>intervalMinutes</code>
      */
    def getIntervalMinutes(): Double = js.native
    /**
      * Gets current value of property <code>intervalSelection</code>.If set, interval selection is
      * allowedDefault value is <code>false</code>.
      * @returns Value of property <code>intervalSelection</code>
      */
    def getIntervalSelection(): Boolean = js.native
    /**
      * Gets current value of property <code>items</code>.Number of time items displayedDefault value is
      * <code>12</code>.
      * @returns Value of property <code>items</code>
      */
    def getItems(): Double = js.native
    /**
      * ID of the element which is the current target of the association <code>legend</code>, or
      * <code>null</code>.
      * @since 1.38.5
      */
    def getLegend(): js.Any = js.native
    /**
      * Gets content of aggregation <code>selectedDates</code>.Date ranges for selected dates.If
      * <code>singleSelection</code> is set, only the first entry is used.
      */
    def getSelectedDates(): js.Array[DateRange] = js.native
    /**
      * Gets current value of property <code>showHeader</code>.If set, a header with the years is shown to
      * visualize what month belongs to what year.Default value is <code>false</code>.
      * @returns Value of property <code>showHeader</code>
      */
    def getShowHeader(): Boolean = js.native
    /**
      * Gets current value of property <code>singleSelection</code>.If set, only a single month or interval,
      * if intervalSelection is enabled, can be selected<b>Note:</b> Selection of multiple intervals is not
      * supported in the current version.Default value is <code>true</code>.
      * @returns Value of property <code>singleSelection</code>
      */
    def getSingleSelection(): Boolean = js.native
    /**
      * Gets content of aggregation <code>specialDates</code>.Date ranges with type to visualize special
      * item in the row.If one day is assigned to more than one type, only the first one will be used.
      */
    def getSpecialDates(): js.Array[DateTypeRange] = js.native
    /**
      * Gets current value of property <code>startDate</code>.Start date, as JavaScript Date object, of the
      * row.
      * @returns Value of property <code>startDate</code>
      */
    def getStartDate(): js.Any = js.native
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
      * @param oSpecialDate The specialDate whose index is looked for
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfSpecialDate(oSpecialDate: DateTypeRange): Double = js.native
    /**
      * Inserts a selectedDate into the aggregation <code>selectedDates</code>.
      * @param oSelectedDate the selectedDate to insert; if empty, nothing is inserted
      * @param iIndex the <code>0</code>-based index the selectedDate should be inserted at; for            
      * a negative value of <code>iIndex</code>, the selectedDate is inserted at position 0; for a value    
      *         greater than the current size of the aggregation, the selectedDate is inserted at           
      *  the last position
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def insertSelectedDate(oSelectedDate: DateRange, iIndex: Double): TimesRow = js.native
    /**
      * Inserts a specialDate into the aggregation <code>specialDates</code>.
      * @param oSpecialDate the specialDate to insert; if empty, nothing is inserted
      * @param iIndex the <code>0</code>-based index the specialDate should be inserted at; for            
      * a negative value of <code>iIndex</code>, the specialDate is inserted at position 0; for a value     
      *        greater than the current size of the aggregation, the specialDate is inserted at            
      * the last position
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def insertSpecialDate(oSpecialDate: DateTypeRange, iIndex: Double): TimesRow = js.native
    /**
      * Removes all the controls in the association named <code>ariaLabelledBy</code>.
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAriaLabelledBy(): js.Array[_] = js.native
    /**
      * Removes all the controls from the aggregation <code>selectedDates</code>.Additionally, it
      * unregisters them from the hosting UIArea.
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllSelectedDates(): js.Array[DateRange] = js.native
    /**
      * Removes all the controls from the aggregation <code>specialDates</code>.Additionally, it unregisters
      * them from the hosting UIArea.
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllSpecialDates(): js.Array[DateTypeRange] = js.native
    def removeAriaLabelledBy(vAriaLabelledBy: js.Any): js.Any = js.native
    /**
      * Removes an ariaLabelledBy from the association named <code>ariaLabelledBy</code>.
      * @param vAriaLabelledBy The ariaLabelledBy to be removed or its index or ID
      * @returns The removed ariaLabelledBy or <code>null</code>
      */
    def removeAriaLabelledBy(vAriaLabelledBy: Double): js.Any = js.native
    def removeAriaLabelledBy(vAriaLabelledBy: Control): js.Any = js.native
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
      * @param vSpecialDate The specialDate to remove or its index or id
      * @returns The removed specialDate or <code>null</code>
      */
    def removeSpecialDate(vSpecialDate: Double): DateTypeRange = js.native
    def removeSpecialDate(vSpecialDate: DateTypeRange): DateTypeRange = js.native
    /**
      * Sets a new value for property <code>date</code>.A date as JavaScript Date object. The month
      * including this date is rendered and this date is focused initially (if no other focus is set).If the
      * date property is not in the range <code>startDate</code> + <code>items</code> in the rendering
      * phase,it is set to the <code>startDate</code>.So after setting the <code>startDate</code> the date
      * should be set to be in the visible range.When called with a value of <code>null</code> or
      * <code>undefined</code>, the default value of the property will be restored.
      * @param oDate New value for property <code>date</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setDate(oDate: js.Any): TimesRow = js.native
    /**
      * Sets a new value for property <code>intervalMinutes</code>.Size of on time interval in minutes,
      * default is 60 minutes.<b>Note:</b> the start of the interval calculation is always
      * <code>startDat</code> at 00:00.A interval longer then 720 minutes is not allowed. Please use the
      * <code>DatesRow</code> instead.A day must be divisible by this interval size. One interval must not
      * include more than one day.When called with a value of <code>null</code> or <code>undefined</code>,
      * the default value of the property will be restored.Default value is <code>60</code>.
      * @param iIntervalMinutes New value for property <code>intervalMinutes</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setIntervalMinutes(iIntervalMinutes: Double): TimesRow = js.native
    /**
      * Sets a new value for property <code>intervalSelection</code>.If set, interval selection is
      * allowedWhen called with a value of <code>null</code> or <code>undefined</code>, the default value of
      * the property will be restored.Default value is <code>false</code>.
      * @param bIntervalSelection New value for property <code>intervalSelection</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setIntervalSelection(bIntervalSelection: Boolean): TimesRow = js.native
    /**
      * Sets a new value for property <code>items</code>.Number of time items displayedWhen called with a
      * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
      * restored.Default value is <code>12</code>.
      * @param iItems New value for property <code>items</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setItems(iItems: Double): TimesRow = js.native
    /**
      * Sets the associated <code>legend</code>.
      * @since 1.38.5
      * @param oLegend ID of an element which becomes the new target of this legend association;
      * alternatively, an element instance may be given
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setLegend(oLegend: js.Any): TimesRow = js.native
    def setLegend(oLegend: CalendarLegend): TimesRow = js.native
    /**
      * Sets a new value for property <code>showHeader</code>.If set, a header with the years is shown to
      * visualize what month belongs to what year.When called with a value of <code>null</code> or
      * <code>undefined</code>, the default value of the property will be restored.Default value is
      * <code>false</code>.
      * @param bShowHeader New value for property <code>showHeader</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setShowHeader(bShowHeader: Boolean): TimesRow = js.native
    /**
      * Sets a new value for property <code>singleSelection</code>.If set, only a single month or interval,
      * if intervalSelection is enabled, can be selected<b>Note:</b> Selection of multiple intervals is not
      * supported in the current version.When called with a value of <code>null</code> or
      * <code>undefined</code>, the default value of the property will be restored.Default value is
      * <code>true</code>.
      * @param bSingleSelection New value for property <code>singleSelection</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setSingleSelection(bSingleSelection: Boolean): TimesRow = js.native
    /**
      * Sets a new value for property <code>startDate</code>.Start date, as JavaScript Date object, of the
      * row.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
      * the property will be restored.
      * @param oStartDate New value for property <code>startDate</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setStartDate(oStartDate: js.Any): TimesRow = js.native
  }
  
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
  
}

