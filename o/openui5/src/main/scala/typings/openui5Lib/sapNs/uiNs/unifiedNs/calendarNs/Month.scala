package typings
package openui5Lib.sapNs.uiNs.unifiedNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.unified.calendar.Month")
@js.native
class Month protected ()
  extends openui5Lib.sapNs.uiNs.coreNs.Control {
  /**
    * Constructor for a new calendar/Month.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: java.lang.String) = this()
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
    * Adds some ariaLabelledBy into the association <code>ariaLabelledBy</code>.
    * @param vAriaLabelledBy the ariaLabelledBy to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addAriaLabelledBy(vAriaLabelledBy: js.Any): Month = js.native
  def addAriaLabelledBy(vAriaLabelledBy: openui5Lib.sapNs.uiNs.coreNs.Control): Month = js.native
  /**
    * Adds some disabledDate to the aggregation <code>disabledDates</code>.
    * @since 1.38.0
    * @param oDisabledDate the disabledDate to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addDisabledDate(oDisabledDate: openui5Lib.sapNs.uiNs.unifiedNs.DateRange): Month = js.native
  /**
    * Adds some selectedDate to the aggregation <code>selectedDates</code>.
    * @param oSelectedDate the selectedDate to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addSelectedDate(oSelectedDate: openui5Lib.sapNs.uiNs.unifiedNs.DateRange): Month = js.native
  /**
    * Adds some specialDate to the aggregation <code>specialDates</code>.
    * @param oSpecialDate the specialDate to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addSpecialDate(oSpecialDate: openui5Lib.sapNs.uiNs.unifiedNs.DateTypeRange): Month = js.native
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
  def checkDateFocusable(oDate: js.Any): scala.Boolean = js.native
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
  def getDisabledDates(): js.Array[openui5Lib.sapNs.uiNs.unifiedNs.DateRange] = js.native
  /**
    * Gets current value of property <code>firstDayOfWeek</code>.If set, the first day of the displayed
    * week is this day. Valid values are 0 to 6.If not a valid value is set, the default of the used
    * locale is used.Default value is <code>-1</code>.
    * @since 1.28.9
    * @returns Value of property <code>firstDayOfWeek</code>
    */
  def getFirstDayOfWeek(): scala.Double = js.native
  /**
    * Gets current value of property <code>intervalSelection</code>.If set, interval selection is
    * allowedDefault value is <code>false</code>.
    * @returns Value of property <code>intervalSelection</code>
    */
  def getIntervalSelection(): scala.Boolean = js.native
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
  def getNonWorkingDays(): scala.Double = js.native
  /**
    * Gets current value of property <code>primaryCalendarType</code>.If set, the calendar type is used
    * for display.If not set, the calendar type of the global configuration is used.
    * @since 1.34.0
    * @returns Value of property <code>primaryCalendarType</code>
    */
  def getPrimaryCalendarType(): openui5Lib.sapNs.uiNs.coreNs.CalendarType = js.native
  /**
    * Gets current value of property <code>secondaryCalendarType</code>.If set, the days are also
    * displayed in this calendar typeIf not set, the dates are only displayed in the primary calendar type
    * @since 1.34.0
    * @returns Value of property <code>secondaryCalendarType</code>
    */
  def getSecondaryCalendarType(): openui5Lib.sapNs.uiNs.coreNs.CalendarType = js.native
  /**
    * Gets content of aggregation <code>selectedDates</code>.Date Ranges for selected dates of the
    * DatePicker
    */
  def getSelectedDates(): js.Array[openui5Lib.sapNs.uiNs.unifiedNs.DateRange] = js.native
  /**
    * Gets current value of property <code>showHeader</code>.If set, a header with the month name is
    * shownDefault value is <code>false</code>.
    * @returns Value of property <code>showHeader</code>
    */
  def getShowHeader(): scala.Boolean = js.native
  /**
    * Gets current value of property <code>singleSelection</code>.If set, only a single date or interval,
    * if intervalSelection is enabled, can be selectedDefault value is <code>true</code>.
    * @returns Value of property <code>singleSelection</code>
    */
  def getSingleSelection(): scala.Boolean = js.native
  /**
    * Gets content of aggregation <code>specialDates</code>.Date Range with type to visualize special days
    * in the Calendar.If one day is assigned to more than one Type, only the first one will be used.
    */
  def getSpecialDates(): js.Array[openui5Lib.sapNs.uiNs.unifiedNs.DateTypeRange] = js.native
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
  def indexOfDisabledDate(oDisabledDate: openui5Lib.sapNs.uiNs.unifiedNs.DateRange): scala.Double = js.native
  /**
    * Checks for the provided <code>sap.ui.unified.DateRange</code> in the aggregation
    * <code>selectedDates</code>.and returns its index if found or -1 otherwise.
    * @param oSelectedDate The selectedDate whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfSelectedDate(oSelectedDate: openui5Lib.sapNs.uiNs.unifiedNs.DateRange): scala.Double = js.native
  /**
    * Checks for the provided <code>sap.ui.unified.DateTypeRange</code> in the aggregation
    * <code>specialDates</code>.and returns its index if found or -1 otherwise.
    * @param oSpecialDate The specialDate whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfSpecialDate(oSpecialDate: openui5Lib.sapNs.uiNs.unifiedNs.DateTypeRange): scala.Double = js.native
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
  def insertDisabledDate(oDisabledDate: openui5Lib.sapNs.uiNs.unifiedNs.DateRange, iIndex: scala.Double): Month = js.native
  /**
    * Inserts a selectedDate into the aggregation <code>selectedDates</code>.
    * @param oSelectedDate the selectedDate to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the selectedDate should be inserted at; for            
    * a negative value of <code>iIndex</code>, the selectedDate is inserted at position 0; for a value    
    *         greater than the current size of the aggregation, the selectedDate is inserted at           
    *  the last position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertSelectedDate(oSelectedDate: openui5Lib.sapNs.uiNs.unifiedNs.DateRange, iIndex: scala.Double): Month = js.native
  /**
    * Inserts a specialDate into the aggregation <code>specialDates</code>.
    * @param oSpecialDate the specialDate to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the specialDate should be inserted at; for            
    * a negative value of <code>iIndex</code>, the specialDate is inserted at position 0; for a value     
    *        greater than the current size of the aggregation, the specialDate is inserted at            
    * the last position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertSpecialDate(oSpecialDate: openui5Lib.sapNs.uiNs.unifiedNs.DateTypeRange, iIndex: scala.Double): Month = js.native
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
  def removeAllDisabledDates(): js.Array[openui5Lib.sapNs.uiNs.unifiedNs.DateRange] = js.native
  /**
    * Removes all the controls from the aggregation <code>selectedDates</code>.Additionally, it
    * unregisters them from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllSelectedDates(): js.Array[openui5Lib.sapNs.uiNs.unifiedNs.DateRange] = js.native
  /**
    * Removes all the controls from the aggregation <code>specialDates</code>.Additionally, it unregisters
    * them from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllSpecialDates(): js.Array[openui5Lib.sapNs.uiNs.unifiedNs.DateTypeRange] = js.native
  def removeAriaLabelledBy(vAriaLabelledBy: js.Any): js.Any = js.native
  def removeAriaLabelledBy(vAriaLabelledBy: openui5Lib.sapNs.uiNs.coreNs.Control): js.Any = js.native
  /**
    * Removes an ariaLabelledBy from the association named <code>ariaLabelledBy</code>.
    * @param vAriaLabelledBy The ariaLabelledBy to be removed or its index or ID
    * @returns The removed ariaLabelledBy or <code>null</code>
    */
  def removeAriaLabelledBy(vAriaLabelledBy: scala.Double): js.Any = js.native
  def removeDisabledDate(vDisabledDate: java.lang.String): openui5Lib.sapNs.uiNs.unifiedNs.DateRange = js.native
  def removeDisabledDate(vDisabledDate: openui5Lib.sapNs.uiNs.unifiedNs.DateRange): openui5Lib.sapNs.uiNs.unifiedNs.DateRange = js.native
  /**
    * Removes a disabledDate from the aggregation <code>disabledDates</code>.
    * @since 1.38.0
    * @param vDisabledDate The disabledDate to remove or its index or id
    * @returns The removed disabledDate or <code>null</code>
    */
  def removeDisabledDate(vDisabledDate: scala.Double): openui5Lib.sapNs.uiNs.unifiedNs.DateRange = js.native
  def removeSelectedDate(vSelectedDate: java.lang.String): openui5Lib.sapNs.uiNs.unifiedNs.DateRange = js.native
  def removeSelectedDate(vSelectedDate: openui5Lib.sapNs.uiNs.unifiedNs.DateRange): openui5Lib.sapNs.uiNs.unifiedNs.DateRange = js.native
  /**
    * Removes a selectedDate from the aggregation <code>selectedDates</code>.
    * @param vSelectedDate The selectedDate to remove or its index or id
    * @returns The removed selectedDate or <code>null</code>
    */
  def removeSelectedDate(vSelectedDate: scala.Double): openui5Lib.sapNs.uiNs.unifiedNs.DateRange = js.native
  def removeSpecialDate(vSpecialDate: java.lang.String): openui5Lib.sapNs.uiNs.unifiedNs.DateTypeRange = js.native
  def removeSpecialDate(vSpecialDate: openui5Lib.sapNs.uiNs.unifiedNs.DateTypeRange): openui5Lib.sapNs.uiNs.unifiedNs.DateTypeRange = js.native
  /**
    * Removes a specialDate from the aggregation <code>specialDates</code>.
    * @param vSpecialDate The specialDate to remove or its index or id
    * @returns The removed specialDate or <code>null</code>
    */
  def removeSpecialDate(vSpecialDate: scala.Double): openui5Lib.sapNs.uiNs.unifiedNs.DateTypeRange = js.native
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
  def setFirstDayOfWeek(iFirstDayOfWeek: scala.Double): scala.Unit = js.native
  /**
    * Sets a new value for property <code>intervalSelection</code>.If set, interval selection is
    * allowedWhen called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code>false</code>.
    * @param bIntervalSelection New value for property <code>intervalSelection</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIntervalSelection(bIntervalSelection: scala.Boolean): Month = js.native
  /**
    * Sets the associated <code>legend</code>.
    * @since 1.38.5
    * @param oLegend ID of an element which becomes the new target of this legend association;
    * alternatively, an element instance may be given
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setLegend(oLegend: js.Any): Month = js.native
  def setLegend(oLegend: openui5Lib.sapNs.uiNs.unifiedNs.CalendarLegend): Month = js.native
  /**
    * Sets a new value for property <code>nonWorkingDays</code>.If set, the provided weekdays are
    * displayed as non-working days.Valid values inside the array are 0 to 6.If not set, the weekend
    * defined in the locale settings is displayed as non-working days.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @since 1.28.9
    * @param sNonWorkingDays New value for property <code>nonWorkingDays</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setNonWorkingDays(sNonWorkingDays: scala.Double): Month = js.native
  /**
    * Sets a new value for property <code>primaryCalendarType</code>.If set, the calendar type is used for
    * display.If not set, the calendar type of the global configuration is used.When called with a value
    * of <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @since 1.34.0
    * @param sPrimaryCalendarType New value for property <code>primaryCalendarType</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setPrimaryCalendarType(sPrimaryCalendarType: openui5Lib.sapNs.uiNs.coreNs.CalendarType): Month = js.native
  /**
    * Sets a new value for property <code>secondaryCalendarType</code>.If set, the days are also displayed
    * in this calendar typeIf not set, the dates are only displayed in the primary calendar typeWhen
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.
    * @since 1.34.0
    * @param sSecondaryCalendarType New value for property <code>secondaryCalendarType</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setSecondaryCalendarType(sSecondaryCalendarType: openui5Lib.sapNs.uiNs.coreNs.CalendarType): Month = js.native
  /**
    * Sets a new value for property <code>showHeader</code>.If set, a header with the month name is
    * shownWhen called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code>false</code>.
    * @param bShowHeader New value for property <code>showHeader</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowHeader(bShowHeader: scala.Boolean): Month = js.native
  /**
    * Sets a new value for property <code>singleSelection</code>.If set, only a single date or interval,
    * if intervalSelection is enabled, can be selectedWhen called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>true</code>.
    * @param bSingleSelection New value for property <code>singleSelection</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setSingleSelection(bSingleSelection: scala.Boolean): Month = js.native
  /**
    * Sets a new value for property <code>width</code>.Width of MonthWhen called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @since 1.38.0
    * @param sWidth New value for property <code>width</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setWidth(sWidth: js.Any): Month = js.native
}

