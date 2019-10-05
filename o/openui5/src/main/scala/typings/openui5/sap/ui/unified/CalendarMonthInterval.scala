package typings.openui5.sap.ui.unified

import org.scalablytyped.runtime.Instantiable2
import typings.openui5.sap.ui.core.Control
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.unified.CalendarMonthInterval")
@js.native
class CalendarMonthInterval protected () extends Control {
  /**
    * Constructor for a new <code>CalendarMonthInterval</code>.Accepts an object literal
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
  def addAriaLabelledBy(vAriaLabelledBy: js.Any): CalendarMonthInterval = js.native
  def addAriaLabelledBy(vAriaLabelledBy: Control): CalendarMonthInterval = js.native
  /**
    * Adds some selectedDate to the aggregation <code>selectedDates</code>.
    * @param oSelectedDate the selectedDate to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addSelectedDate(oSelectedDate: DateRange): CalendarMonthInterval = js.native
  /**
    * Adds some specialDate to the aggregation <code>specialDates</code>.
    * @param oSpecialDate the specialDate to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addSpecialDate(oSpecialDate: DateTypeRange): CalendarMonthInterval = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>cancel</code> event of this
    * <code>sap.ui.unified.CalendarMonthInterval</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.ui.unified.CalendarMonthInterval</code> itself.Month selection was cancelled
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.ui.unified.CalendarMonthInterval</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachCancel(oData: js.Any, fnFunction: js.Any): CalendarMonthInterval = js.native
  def attachCancel(oData: js.Any, fnFunction: js.Any, oListener: js.Any): CalendarMonthInterval = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>select</code> event of this
    * <code>sap.ui.unified.CalendarMonthInterval</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.ui.unified.CalendarMonthInterval</code> itself.Month selection changed
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.ui.unified.CalendarMonthInterval</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachSelect(oData: js.Any, fnFunction: js.Any): CalendarMonthInterval = js.native
  def attachSelect(oData: js.Any, fnFunction: js.Any, oListener: js.Any): CalendarMonthInterval = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>startDateChange</code> event of this
    * <code>sap.ui.unified.CalendarMonthInterval</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.ui.unified.CalendarMonthInterval</code> itself.<code>startDate</code> was changed
    * while navigation in <code>CalendarMonthInterval</code>
    * @since 1.34.0
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.ui.unified.CalendarMonthInterval</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachStartDateChange(oData: js.Any, fnFunction: js.Any): CalendarMonthInterval = js.native
  def attachStartDateChange(oData: js.Any, fnFunction: js.Any, oListener: js.Any): CalendarMonthInterval = js.native
  /**
    * Destroys all the selectedDates in the aggregation <code>selectedDates</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroySelectedDates(): CalendarMonthInterval = js.native
  /**
    * Destroys all the specialDates in the aggregation <code>specialDates</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroySpecialDates(): CalendarMonthInterval = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>cancel</code> event of this
    * <code>sap.ui.unified.CalendarMonthInterval</code>.The passed function and listener object must match
    * the ones used for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachCancel(fnFunction: js.Any, oListener: js.Any): CalendarMonthInterval = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>select</code> event of this
    * <code>sap.ui.unified.CalendarMonthInterval</code>.The passed function and listener object must match
    * the ones used for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachSelect(fnFunction: js.Any, oListener: js.Any): CalendarMonthInterval = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>startDateChange</code> event of this
    * <code>sap.ui.unified.CalendarMonthInterval</code>.The passed function and listener object must match
    * the ones used for event registration.
    * @since 1.34.0
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachStartDateChange(fnFunction: js.Any, oListener: js.Any): CalendarMonthInterval = js.native
  /**
    * Displays a month in the <code>CalendarMonthInterval</code> but doesn't set the focus.
    * @param oDate JavaScript date object for displayed date. (The month of this date will be displayed.)
    * @returns <code>this</code> to allow method chaining
    */
  def displayDate(oDate: js.Any): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar] = js.native
  /**
    * Fires event <code>cancel</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireCancel(mArguments: js.Any): CalendarMonthInterval = js.native
  /**
    * Fires event <code>select</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireSelect(mArguments: js.Any): CalendarMonthInterval = js.native
  /**
    * Fires event <code>startDateChange</code> to attached listeners.
    * @since 1.34.0
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireStartDateChange(mArguments: js.Any): CalendarMonthInterval = js.native
  /**
    * Sets the focused month of the <code>CalendarMonthInterval</code>.
    * @param oDate JavaScript date object for focused date. (The month of this date will be focused.)
    * @returns <code>this</code> to allow method chaining
    */
  def focusDate(oDate: js.Any): Instantiable2[/* sId */ String, js.UndefOr[/* mSettings */ js.Any], Calendar] = js.native
  /**
    * Returns array of IDs of the elements which are the current targets of the association
    * <code>ariaLabelledBy</code>.
    */
  def getAriaLabelledBy(): js.Array[_] = js.native
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
    * the Calendar. This must be a JavaScript date object.<b>Note:</b> If the <code>maxDate</code> is set
    * to be before the <code>minDate</code>,the <code>minDate</code> is set to the begin of the month of
    * the <code>maxDate</code>.
    * @since 1.38.0
    * @returns Value of property <code>maxDate</code>
    */
  def getMaxDate(): js.Any = js.native
  /**
    * Gets current value of property <code>minDate</code>.Minimum date that can be shown and selected in
    * the Calendar. This must be a JavaScript date object.<b>Note:</b> If the <code>minDate</code> is set
    * to be after the <code>maxDate</code>,the <code>maxDate</code> is set to the end of the month of the
    * <code>minDate</code>.
    * @since 1.38.0
    * @returns Value of property <code>minDate</code>
    */
  def getMinDate(): js.Any = js.native
  /**
    * Gets current value of property <code>months</code>.Number of months displayed<b>Note:</b> On phones,
    * the maximum number of months displayed in the row is always 6.Default value is <code>12</code>.
    * @returns Value of property <code>months</code>
    */
  def getMonths(): Double = js.native
  /**
    * Gets current value of property <code>pickerPopup</code>.If set, the yearPicker opens on a
    * popupDefault value is <code>false</code>.
    * @since 1.34.0
    * @returns Value of property <code>pickerPopup</code>
    */
  def getPickerPopup(): Boolean = js.native
  /**
    * Gets content of aggregation <code>selectedDates</code>.Date ranges for selected dates of the
    * <code>CalendarMonthInterval</code>.If <code>singleSelection</code> is set, only the first entry is
    * used.<b>Note:</b> Even if only one day is selected, the whole corresponding month is selected.
    */
  def getSelectedDates(): js.Array[DateRange] = js.native
  /**
    * Gets current value of property <code>singleSelection</code>.If set, only a single date or interval,
    * if <code>intervalSelection</code> is enabled, can be selected<b>Note:</b> Selection of multiple
    * intervals is not supported in the current version.Default value is <code>true</code>.
    * @returns Value of property <code>singleSelection</code>
    */
  def getSingleSelection(): Boolean = js.native
  /**
    * Gets content of aggregation <code>specialDates</code>.Date ranges with type to visualize special
    * months in the <code>CalendarMonthInterval</code>.If one day is assigned to more than one type, only
    * the first one will be used.<b>Note:</b> Even if only one day is set as a special day, the whole
    * corresponding month is displayed in this way.
    */
  def getSpecialDates(): js.Array[DateTypeRange] = js.native
  /**
    * Gets current value of property <code>startDate</code>.Start date of the Interval as JavaScript Date
    * object.The month of this Date will be the first month in the displayed row.
    * @returns Value of property <code>startDate</code>
    */
  def getStartDate(): js.Any = js.native
  /**
    * Gets current value of property <code>width</code>.Width of the <code>CalendarMonthInterval</code>.
    * The width of the single months depends on this width.
    * @returns Value of property <code>width</code>
    */
  def getWidth(): js.Any = js.native
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
  def insertSelectedDate(oSelectedDate: DateRange, iIndex: Double): CalendarMonthInterval = js.native
  /**
    * Inserts a specialDate into the aggregation <code>specialDates</code>.
    * @param oSpecialDate the specialDate to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the specialDate should be inserted at; for            
    * a negative value of <code>iIndex</code>, the specialDate is inserted at position 0; for a value     
    *        greater than the current size of the aggregation, the specialDate is inserted at            
    * the last position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertSpecialDate(oSpecialDate: DateTypeRange, iIndex: Double): CalendarMonthInterval = js.native
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
    * Sets a new value for property <code>intervalSelection</code>.If set, interval selection is
    * allowedWhen called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code>false</code>.
    * @param bIntervalSelection New value for property <code>intervalSelection</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIntervalSelection(bIntervalSelection: Boolean): CalendarMonthInterval = js.native
  /**
    * Sets the associated <code>legend</code>.
    * @since 1.38.5
    * @param oLegend ID of an element which becomes the new target of this legend association;
    * alternatively, an element instance may be given
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setLegend(oLegend: js.Any): CalendarMonthInterval = js.native
  def setLegend(oLegend: CalendarLegend): CalendarMonthInterval = js.native
  /**
    * Sets a new value for property <code>maxDate</code>.Maximum date that can be shown and selected in
    * the Calendar. This must be a JavaScript date object.<b>Note:</b> If the <code>maxDate</code> is set
    * to be before the <code>minDate</code>,the <code>minDate</code> is set to the begin of the month of
    * the <code>maxDate</code>.When called with a value of <code>null</code> or <code>undefined</code>,
    * the default value of the property will be restored.
    * @since 1.38.0
    * @param oMaxDate New value for property <code>maxDate</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMaxDate(oMaxDate: js.Any): CalendarMonthInterval = js.native
  /**
    * Sets a new value for property <code>minDate</code>.Minimum date that can be shown and selected in
    * the Calendar. This must be a JavaScript date object.<b>Note:</b> If the <code>minDate</code> is set
    * to be after the <code>maxDate</code>,the <code>maxDate</code> is set to the end of the month of the
    * <code>minDate</code>.When called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.
    * @since 1.38.0
    * @param oMinDate New value for property <code>minDate</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMinDate(oMinDate: js.Any): CalendarMonthInterval = js.native
  /**
    * Sets a new value for property <code>months</code>.Number of months displayed<b>Note:</b> On phones,
    * the maximum number of months displayed in the row is always 6.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>12</code>.
    * @param iMonths New value for property <code>months</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMonths(iMonths: Double): CalendarMonthInterval = js.native
  /**
    * Sets a new value for property <code>pickerPopup</code>.If set, the yearPicker opens on a popupWhen
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.Default value is <code>false</code>.
    * @since 1.34.0
    * @param bPickerPopup New value for property <code>pickerPopup</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setPickerPopup(bPickerPopup: Boolean): CalendarMonthInterval = js.native
  /**
    * Sets a new value for property <code>singleSelection</code>.If set, only a single date or interval,
    * if <code>intervalSelection</code> is enabled, can be selected<b>Note:</b> Selection of multiple
    * intervals is not supported in the current version.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>true</code>.
    * @param bSingleSelection New value for property <code>singleSelection</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setSingleSelection(bSingleSelection: Boolean): CalendarMonthInterval = js.native
  /**
    * Sets a new value for property <code>startDate</code>.Start date of the Interval as JavaScript Date
    * object.The month of this Date will be the first month in the displayed row.When called with a value
    * of <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @param oStartDate New value for property <code>startDate</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setStartDate(oStartDate: js.Any): CalendarMonthInterval = js.native
  /**
    * Sets a new value for property <code>width</code>.Width of the <code>CalendarMonthInterval</code>.
    * The width of the single months depends on this width.When called with a value of <code>null</code>
    * or <code>undefined</code>, the default value of the property will be restored.
    * @param sWidth New value for property <code>width</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setWidth(sWidth: js.Any): CalendarMonthInterval = js.native
}

