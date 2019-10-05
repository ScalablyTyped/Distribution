package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Control
import typings.openui5.sap.ui.unified.CalendarAppointmentVisualization
import typings.openui5.sap.ui.unified.CalendarLegend
import typings.openui5.sap.ui.unified.DateTypeRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.PlanningCalendar")
@js.native
class PlanningCalendar protected () extends Control {
  /**
    * Constructor for a new <code>PlanningCalendar</code>.Accepts an object literal <code>mSettings</code>
    * that defines initialproperty values, aggregated and associated objects as well as event handlers.See
    * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
    * settings object.
    * @param sID ID for the new control, generated automatically if no ID is given
    * @param mSettings Initial settings for the new control
    */
  def this(sID: String) = this()
  def this(sID: String, mSettings: js.Any) = this()
  /**
    * Adds some ariaLabelledBy into the association <code>ariaLabelledBy</code>.
    * @since 1.40.0
    * @param vAriaLabelledBy the ariaLabelledBy to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addAriaLabelledBy(vAriaLabelledBy: js.Any): PlanningCalendar = js.native
  def addAriaLabelledBy(vAriaLabelledBy: Control): PlanningCalendar = js.native
  /**
    * Adds some row to the aggregation <code>rows</code>.
    * @param oRow the row to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addRow(oRow: PlanningCalendarRow): PlanningCalendar = js.native
  /**
    * Adds some specialDate to the aggregation <code>specialDates</code>.
    * @param oSpecialDate the specialDate to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addSpecialDate(oSpecialDate: DateTypeRange): PlanningCalendar = js.native
  /**
    * Adds some toolbarContent to the aggregation <code>toolbarContent</code>.
    * @param oToolbarContent the toolbarContent to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addToolbarContent(oToolbarContent: Control): PlanningCalendar = js.native
  /**
    * Adds some view to the aggregation <code>views</code>.
    * @param oView the view to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addView(oView: PlanningCalendarView): PlanningCalendar = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>appointmentSelect</code> event of this
    * <code>sap.m.PlanningCalendar</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.PlanningCalendar</code> itself.Fired if an appointment was selected
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.PlanningCalendar</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachAppointmentSelect(oData: js.Any, fnFunction: js.Any): PlanningCalendar = js.native
  def attachAppointmentSelect(oData: js.Any, fnFunction: js.Any, oListener: js.Any): PlanningCalendar = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>intervalSelect</code> event of this
    * <code>sap.m.PlanningCalendar</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.PlanningCalendar</code> itself.Fired if an interval was selected in the header
    * calendar or in the row
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.PlanningCalendar</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachIntervalSelect(oData: js.Any, fnFunction: js.Any): PlanningCalendar = js.native
  def attachIntervalSelect(oData: js.Any, fnFunction: js.Any, oListener: js.Any): PlanningCalendar = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>rowSelectionChange</code> event of this
    * <code>sap.m.PlanningCalendar</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.PlanningCalendar</code> itself.Fires when row selection is changed
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.PlanningCalendar</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachRowSelectionChange(oData: js.Any, fnFunction: js.Any): PlanningCalendar = js.native
  def attachRowSelectionChange(oData: js.Any, fnFunction: js.Any, oListener: js.Any): PlanningCalendar = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>startDateChange</code> event of this
    * <code>sap.m.PlanningCalendar</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.PlanningCalendar</code> itself.<code>startDate</code> was changed while
    * navigating in <code>PlanningCalendar</code>
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.PlanningCalendar</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachStartDateChange(oData: js.Any, fnFunction: js.Any): PlanningCalendar = js.native
  def attachStartDateChange(oData: js.Any, fnFunction: js.Any, oListener: js.Any): PlanningCalendar = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>viewChange</code> event of this
    * <code>sap.m.PlanningCalendar</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.PlanningCalendar</code> itself.<code>viewKey</code> was changed by user
    * interaction
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.PlanningCalendar</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachViewChange(oData: js.Any, fnFunction: js.Any): PlanningCalendar = js.native
  def attachViewChange(oData: js.Any, fnFunction: js.Any, oListener: js.Any): PlanningCalendar = js.native
  /**
    * Destroys all the rows in the aggregation <code>rows</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyRows(): PlanningCalendar = js.native
  /**
    * Destroys all the specialDates in the aggregation <code>specialDates</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroySpecialDates(): PlanningCalendar = js.native
  /**
    * Destroys all the toolbarContent in the aggregation <code>toolbarContent</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyToolbarContent(): PlanningCalendar = js.native
  /**
    * Destroys all the views in the aggregation <code>views</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyViews(): PlanningCalendar = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>appointmentSelect</code> event of this
    * <code>sap.m.PlanningCalendar</code>.The passed function and listener object must match the ones used
    * for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachAppointmentSelect(fnFunction: js.Any, oListener: js.Any): PlanningCalendar = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>intervalSelect</code> event of this
    * <code>sap.m.PlanningCalendar</code>.The passed function and listener object must match the ones used
    * for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachIntervalSelect(fnFunction: js.Any, oListener: js.Any): PlanningCalendar = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>rowSelectionChange</code> event of
    * this <code>sap.m.PlanningCalendar</code>.The passed function and listener object must match the ones
    * used for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachRowSelectionChange(fnFunction: js.Any, oListener: js.Any): PlanningCalendar = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>startDateChange</code> event of this
    * <code>sap.m.PlanningCalendar</code>.The passed function and listener object must match the ones used
    * for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachStartDateChange(fnFunction: js.Any, oListener: js.Any): PlanningCalendar = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>viewChange</code> event of this
    * <code>sap.m.PlanningCalendar</code>.The passed function and listener object must match the ones used
    * for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachViewChange(fnFunction: js.Any, oListener: js.Any): PlanningCalendar = js.native
  /**
    * Fires event <code>appointmentSelect</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>appointment</code> of type
    * <code>sap.ui.unified.CalendarAppointment</code>Selected
    * appointment</li><li><code>appointments</code> of type
    * <code>sap.ui.unified.CalendarAppointment[]</code>Selected appointments in case a group appointment
    * is selected</li><li><code>multiSelect</code> of type <code>boolean</code>If set, the appointment was
    * selected using multiple selection (e.g. Shift + single mouse click),meaning more than the current
    * appointment could be selected.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireAppointmentSelect(mArguments: js.Any): PlanningCalendar = js.native
  /**
    * Fires event <code>intervalSelect</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>startDate</code> of type <code>object</code>Start date of the selected
    * interval, as JavaScript date object.</li><li><code>endDate</code> of type
    * <code>object</code>Interval end date as JavaScript date object</li><li><code>subInterval</code> of
    * type <code>boolean</code>If set, the selected interval is a subinterval</li><li><code>row</code> of
    * type <code>sap.m.PlanningCalendarRow</code>Row of the selected interval</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireIntervalSelect(mArguments: js.Any): PlanningCalendar = js.native
  /**
    * Fires event <code>rowSelectionChange</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>rows</code> of type <code>sap.m.PlanningCalendarRow[]</code>Array of rows
    * whose selection has changed.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireRowSelectionChange(mArguments: js.Any): PlanningCalendar = js.native
  /**
    * Fires event <code>startDateChange</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireStartDateChange(mArguments: js.Any): PlanningCalendar = js.native
  /**
    * Fires event <code>viewChange</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireViewChange(mArguments: js.Any): PlanningCalendar = js.native
  /**
    * Gets current value of property <code>appointmentsReducedHeight</code>.If set the appointments
    * without text (only title) are rendered with a smaller height.<b>Note:</b> On phone devices this
    * property is ignored, appointments are always rendered in full heightto allow touching.Default value
    * is <code>false</code>.
    * @since 1.38.0
    * @returns Value of property <code>appointmentsReducedHeight</code>
    */
  def getAppointmentsReducedHeight(): Boolean = js.native
  /**
    * Gets current value of property <code>appointmentsVisualization</code>.Defines the visualization of
    * the <code>CalendarAppoinment</code><b>Note:</b> The real visualization depends on the used
    * theme.Default value is <code>Standard</code>.
    * @since 1.40.0
    * @returns Value of property <code>appointmentsVisualization</code>
    */
  def getAppointmentsVisualization(): CalendarAppointmentVisualization = js.native
  /**
    * Returns array of IDs of the elements which are the current targets of the association
    * <code>ariaLabelledBy</code>.
    * @since 1.40.0
    */
  def getAriaLabelledBy(): js.Array[_] = js.native
  /**
    * Gets current value of property <code>height</code>.Height of the <code>PlanningCalendar</code>
    * @returns Value of property <code>height</code>
    */
  def getHeight(): js.Any = js.native
  /**
    * ID of the element which is the current target of the association <code>legend</code>, or
    * <code>null</code>.
    * @since 1.40.0
    */
  def getLegend(): js.Any = js.native
  /**
    * Gets current value of property <code>maxDate</code>.Maximum date that can be shown and selected in
    * the <code>PlanningCalendar</code>. This must be a JavaScript date object.<b>Note:</b> If the
    * <code>maxDate</code> is set to be before the <code>minDate</code>,the <code>minDate</code> is set to
    * the begin of the month of the <code>maxDate</code>.
    * @since 1.38.0
    * @returns Value of property <code>maxDate</code>
    */
  def getMaxDate(): js.Any = js.native
  /**
    * Gets current value of property <code>minDate</code>.Minimum date that can be shown and selected in
    * the <code>PlanningCalendar</code>. This must be a JavaScript date object.<b>Note:</b> If the
    * <code>minDate</code> is set to be after the <code>maxDate</code>,the <code>maxDate</code> is set to
    * the end of the month of the <code>minDate</code>.
    * @since 1.38.0
    * @returns Value of property <code>minDate</code>
    */
  def getMinDate(): js.Any = js.native
  /**
    * Gets current value of property <code>noDataText</code>.This text is displayed when no rows are
    * assigned.
    * @returns Value of property <code>noDataText</code>
    */
  def getNoDataText(): String = js.native
  /**
    * Gets content of aggregation <code>rows</code>.rows of the <code>PlanningCalendar</code>
    */
  def getRows(): js.Array[PlanningCalendarRow] = js.native
  /**
    * Returns an array containing the selected rows. If no row is selected, an empty array is returned.
    * @returns selected rows
    */
  def getSelectedRows(): js.Array[PlanningCalendarRow] = js.native
  /**
    * Gets current value of property <code>showEmptyIntervalHeaders</code>.If set, interval headers are
    * shown even if no <code>intervalHeaders</code> are assigned to the visible time frame.If not set, no
    * interval headers are shown if no <code>intervalHeaders</code> are assigned.<b>Note:</b> This
    * property is only used if <code>showIntervalHeaders</code> is set to <code>true</code>.Default value
    * is <code>true</code>.
    * @since 1.38.0
    * @returns Value of property <code>showEmptyIntervalHeaders</code>
    */
  def getShowEmptyIntervalHeaders(): Boolean = js.native
  /**
    * Gets current value of property <code>showIntervalHeaders</code>.If set, interval headers are shown
    * like specified in <code>showEmptyIntervalHeaders</code>.If not set, no interval headers are shown
    * even if <code>intervalHeaders</code> are assigned.Default value is <code>true</code>.
    * @returns Value of property <code>showIntervalHeaders</code>
    */
  def getShowIntervalHeaders(): Boolean = js.native
  /**
    * Gets current value of property <code>showRowHeaders</code>.If set, headers of the
    * <code>PlanningCalendarRows</code> are shown. This means the column with the headers is shown.If not
    * set, the header column is not shown at all, even if header information is provided.Default value is
    * <code>true</code>.
    * @returns Value of property <code>showRowHeaders</code>
    */
  def getShowRowHeaders(): Boolean = js.native
  /**
    * Gets current value of property <code>singleSelection</code>.If set, only a single row can be
    * selectedDefault value is <code>true</code>.
    * @returns Value of property <code>singleSelection</code>
    */
  def getSingleSelection(): Boolean = js.native
  /**
    * Gets content of aggregation <code>specialDates</code>.Date range along with a type to visualize
    * special days in the header calendar.If one day is assigned to more than one type, only the first one
    * will be used.
    */
  def getSpecialDates(): js.Array[DateTypeRange] = js.native
  /**
    * Gets current value of property <code>startDate</code>.Start date of the row, as JavaScript date
    * object. As a default the current date is used.
    * @returns Value of property <code>startDate</code>
    */
  def getStartDate(): js.Any = js.native
  /**
    * Gets content of aggregation <code>toolbarContent</code>.The content of the toolbar.
    */
  def getToolbarContent(): js.Array[Control] = js.native
  /**
    * Gets current value of property <code>viewKey</code>.Key of the <code>PlanningCalendarView</code>
    * used for the output. The default value uses a default view.If you are using own views, the keys of
    * these views must be used instead.Default value is
    * <code>sap.ui.unified.CalendarIntervalType.Hour</code>.
    * @returns Value of property <code>viewKey</code>
    */
  def getViewKey(): String = js.native
  /**
    * Gets content of aggregation <code>views</code>.Views of the <code>PlanningCalendar</code>.If not
    * set, three default views are used to allow you to switch between hour, day and month granularity.The
    * default views have the keys defined in </code>sap.ui.unified.CalendarIntervalType</code>
    */
  def getViews(): js.Array[PlanningCalendarView] = js.native
  /**
    * Gets current value of property <code>width</code>.Width of the <code>PlanningCalendar</code>
    * @returns Value of property <code>width</code>
    */
  def getWidth(): js.Any = js.native
  /**
    * Checks for the provided <code>sap.m.PlanningCalendarRow</code> in the aggregation
    * <code>rows</code>.and returns its index if found or -1 otherwise.
    * @param oRow The row whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfRow(oRow: PlanningCalendarRow): Double = js.native
  /**
    * Checks for the provided <code>sap.ui.unified.DateTypeRange</code> in the aggregation
    * <code>specialDates</code>.and returns its index if found or -1 otherwise.
    * @param oSpecialDate The specialDate whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfSpecialDate(oSpecialDate: DateTypeRange): Double = js.native
  /**
    * Checks for the provided <code>sap.ui.core.Control</code> in the aggregation
    * <code>toolbarContent</code>.and returns its index if found or -1 otherwise.
    * @param oToolbarContent The toolbarContent whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfToolbarContent(oToolbarContent: Control): Double = js.native
  /**
    * Checks for the provided <code>sap.m.PlanningCalendarView</code> in the aggregation
    * <code>views</code>.and returns its index if found or -1 otherwise.
    * @param oView The view whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfView(oView: PlanningCalendarView): Double = js.native
  /**
    * Inserts a row into the aggregation <code>rows</code>.
    * @param oRow the row to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the row should be inserted at; for             a
    * negative value of <code>iIndex</code>, the row is inserted at position 0; for a value            
    * greater than the current size of the aggregation, the row is inserted at             the last
    * position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertRow(oRow: PlanningCalendarRow, iIndex: Double): PlanningCalendar = js.native
  /**
    * Inserts a specialDate into the aggregation <code>specialDates</code>.
    * @param oSpecialDate the specialDate to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the specialDate should be inserted at; for            
    * a negative value of <code>iIndex</code>, the specialDate is inserted at position 0; for a value     
    *        greater than the current size of the aggregation, the specialDate is inserted at            
    * the last position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertSpecialDate(oSpecialDate: DateTypeRange, iIndex: Double): PlanningCalendar = js.native
  /**
    * Inserts a toolbarContent into the aggregation <code>toolbarContent</code>.
    * @param oToolbarContent the toolbarContent to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the toolbarContent should be inserted at; for          
    *   a negative value of <code>iIndex</code>, the toolbarContent is inserted at position 0; for a value
    *             greater than the current size of the aggregation, the toolbarContent is inserted at     
    *        the last position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertToolbarContent(oToolbarContent: Control, iIndex: Double): PlanningCalendar = js.native
  /**
    * Inserts a view into the aggregation <code>views</code>.
    * @param oView the view to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the view should be inserted at; for             a
    * negative value of <code>iIndex</code>, the view is inserted at position 0; for a value            
    * greater than the current size of the aggregation, the view is inserted at             the last
    * position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertView(oView: PlanningCalendarView, iIndex: Double): PlanningCalendar = js.native
  /**
    * Removes all the controls in the association named <code>ariaLabelledBy</code>.
    * @since 1.40.0
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllAriaLabelledBy(): js.Array[_] = js.native
  /**
    * Removes all the controls from the aggregation <code>rows</code>.Additionally, it unregisters them
    * from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllRows(): js.Array[PlanningCalendarRow] = js.native
  /**
    * Removes all the controls from the aggregation <code>specialDates</code>.Additionally, it unregisters
    * them from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllSpecialDates(): js.Array[DateTypeRange] = js.native
  /**
    * Removes all the controls from the aggregation <code>toolbarContent</code>.Additionally, it
    * unregisters them from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllToolbarContent(): js.Array[Control] = js.native
  /**
    * Removes all the controls from the aggregation <code>views</code>.Additionally, it unregisters them
    * from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllViews(): js.Array[PlanningCalendarView] = js.native
  def removeAriaLabelledBy(vAriaLabelledBy: js.Any): js.Any = js.native
  /**
    * Removes an ariaLabelledBy from the association named <code>ariaLabelledBy</code>.
    * @since 1.40.0
    * @param vAriaLabelledBy The ariaLabelledBy to be removed or its index or ID
    * @returns The removed ariaLabelledBy or <code>null</code>
    */
  def removeAriaLabelledBy(vAriaLabelledBy: Double): js.Any = js.native
  def removeAriaLabelledBy(vAriaLabelledBy: Control): js.Any = js.native
  def removeRow(vRow: String): PlanningCalendarRow = js.native
  /**
    * Removes a row from the aggregation <code>rows</code>.
    * @param vRow The row to remove or its index or id
    * @returns The removed row or <code>null</code>
    */
  def removeRow(vRow: Double): PlanningCalendarRow = js.native
  def removeRow(vRow: PlanningCalendarRow): PlanningCalendarRow = js.native
  def removeSpecialDate(vSpecialDate: String): DateTypeRange = js.native
  /**
    * Removes a specialDate from the aggregation <code>specialDates</code>.
    * @param vSpecialDate The specialDate to remove or its index or id
    * @returns The removed specialDate or <code>null</code>
    */
  def removeSpecialDate(vSpecialDate: Double): DateTypeRange = js.native
  def removeSpecialDate(vSpecialDate: DateTypeRange): DateTypeRange = js.native
  def removeToolbarContent(vToolbarContent: String): Control = js.native
  /**
    * Removes a toolbarContent from the aggregation <code>toolbarContent</code>.
    * @param vToolbarContent The toolbarContent to remove or its index or id
    * @returns The removed toolbarContent or <code>null</code>
    */
  def removeToolbarContent(vToolbarContent: Double): Control = js.native
  def removeToolbarContent(vToolbarContent: Control): Control = js.native
  def removeView(vView: String): PlanningCalendarView = js.native
  /**
    * Removes a view from the aggregation <code>views</code>.
    * @param vView The view to remove or its index or id
    * @returns The removed view or <code>null</code>
    */
  def removeView(vView: Double): PlanningCalendarView = js.native
  def removeView(vView: PlanningCalendarView): PlanningCalendarView = js.native
  /**
    * Selects or deselects all <code>PlanningCalendarRows</code>.<b>Note:</b> Selection only works if
    * <code>singleSelection</code> is not set
    * @param bSelect Indicator showing whether <code>PlanningCalendarRows</code> should be selected or
    * deselected
    * @returns <code>this</code> to allow method chaining
    */
  def selectAllRows(bSelect: Boolean): PlanningCalendar = js.native
  /**
    * Sets a new value for property <code>appointmentsReducedHeight</code>.If set the appointments without
    * text (only title) are rendered with a smaller height.<b>Note:</b> On phone devices this property is
    * ignored, appointments are always rendered in full heightto allow touching.When called with a value
    * of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>false</code>.
    * @since 1.38.0
    * @param bAppointmentsReducedHeight New value for property <code>appointmentsReducedHeight</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setAppointmentsReducedHeight(bAppointmentsReducedHeight: Boolean): PlanningCalendar = js.native
  /**
    * Sets a new value for property <code>appointmentsVisualization</code>.Defines the visualization of
    * the <code>CalendarAppoinment</code><b>Note:</b> The real visualization depends on the used
    * theme.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code>Standard</code>.
    * @since 1.40.0
    * @param sAppointmentsVisualization New value for property <code>appointmentsVisualization</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setAppointmentsVisualization(sAppointmentsVisualization: CalendarAppointmentVisualization): PlanningCalendar = js.native
  /**
    * Sets a new value for property <code>height</code>.Height of the <code>PlanningCalendar</code>When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.
    * @param sHeight New value for property <code>height</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setHeight(sHeight: js.Any): PlanningCalendar = js.native
  /**
    * Sets the associated <code>legend</code>.
    * @since 1.40.0
    * @param oLegend ID of an element which becomes the new target of this legend association;
    * alternatively, an element instance may be given
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setLegend(oLegend: js.Any): PlanningCalendar = js.native
  def setLegend(oLegend: CalendarLegend): PlanningCalendar = js.native
  /**
    * Sets a new value for property <code>maxDate</code>.Maximum date that can be shown and selected in
    * the <code>PlanningCalendar</code>. This must be a JavaScript date object.<b>Note:</b> If the
    * <code>maxDate</code> is set to be before the <code>minDate</code>,the <code>minDate</code> is set to
    * the begin of the month of the <code>maxDate</code>.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @since 1.38.0
    * @param oMaxDate New value for property <code>maxDate</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMaxDate(oMaxDate: js.Any): PlanningCalendar = js.native
  /**
    * Sets a new value for property <code>minDate</code>.Minimum date that can be shown and selected in
    * the <code>PlanningCalendar</code>. This must be a JavaScript date object.<b>Note:</b> If the
    * <code>minDate</code> is set to be after the <code>maxDate</code>,the <code>maxDate</code> is set to
    * the end of the month of the <code>minDate</code>.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @since 1.38.0
    * @param oMinDate New value for property <code>minDate</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMinDate(oMinDate: js.Any): PlanningCalendar = js.native
  /**
    * Sets a new value for property <code>noDataText</code>.This text is displayed when no rows are
    * assigned.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.
    * @param sNoDataText New value for property <code>noDataText</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setNoDataText(sNoDataText: String): PlanningCalendar = js.native
  /**
    * Sets a new value for property <code>showEmptyIntervalHeaders</code>.If set, interval headers are
    * shown even if no <code>intervalHeaders</code> are assigned to the visible time frame.If not set, no
    * interval headers are shown if no <code>intervalHeaders</code> are assigned.<b>Note:</b> This
    * property is only used if <code>showIntervalHeaders</code> is set to <code>true</code>.When called
    * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
    * be restored.Default value is <code>true</code>.
    * @since 1.38.0
    * @param bShowEmptyIntervalHeaders New value for property <code>showEmptyIntervalHeaders</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowEmptyIntervalHeaders(bShowEmptyIntervalHeaders: Boolean): PlanningCalendar = js.native
  /**
    * Sets a new value for property <code>showIntervalHeaders</code>.If set, interval headers are shown
    * like specified in <code>showEmptyIntervalHeaders</code>.If not set, no interval headers are shown
    * even if <code>intervalHeaders</code> are assigned.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>true</code>.
    * @param bShowIntervalHeaders New value for property <code>showIntervalHeaders</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowIntervalHeaders(bShowIntervalHeaders: Boolean): PlanningCalendar = js.native
  /**
    * Sets a new value for property <code>showRowHeaders</code>.If set, headers of the
    * <code>PlanningCalendarRows</code> are shown. This means the column with the headers is shown.If not
    * set, the header column is not shown at all, even if header information is provided.When called with
    * a value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>true</code>.
    * @param bShowRowHeaders New value for property <code>showRowHeaders</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowRowHeaders(bShowRowHeaders: Boolean): PlanningCalendar = js.native
  /**
    * Sets a new value for property <code>singleSelection</code>.If set, only a single row can be
    * selectedWhen called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.Default value is <code>true</code>.
    * @param bSingleSelection New value for property <code>singleSelection</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setSingleSelection(bSingleSelection: Boolean): PlanningCalendar = js.native
  /**
    * Sets a new value for property <code>startDate</code>.Start date of the row, as JavaScript date
    * object. As a default the current date is used.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @param oStartDate New value for property <code>startDate</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setStartDate(oStartDate: js.Any): PlanningCalendar = js.native
  /**
    * Sets a new value for property <code>viewKey</code>.Key of the <code>PlanningCalendarView</code> used
    * for the output. The default value uses a default view.If you are using own views, the keys of these
    * views must be used instead.When called with a value of <code>null</code> or <code>undefined</code>,
    * the default value of the property will be restored.Default value is
    * <code>sap.ui.unified.CalendarIntervalType.Hour</code>.
    * @param sViewKey New value for property <code>viewKey</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setViewKey(sViewKey: String): PlanningCalendar = js.native
  /**
    * Sets a new value for property <code>width</code>.Width of the <code>PlanningCalendar</code>When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.
    * @param sWidth New value for property <code>width</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setWidth(sWidth: js.Any): PlanningCalendar = js.native
}

