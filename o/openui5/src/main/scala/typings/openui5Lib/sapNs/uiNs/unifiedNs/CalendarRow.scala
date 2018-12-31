package typings
package openui5Lib.sapNs.uiNs.unifiedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.unified.CalendarRow")
@js.native
class CalendarRow protected ()
  extends openui5Lib.sapNs.uiNs.coreNs.Control {
  /**
    * Constructor for a new <code>CalendarRow</code>.Accepts an object literal <code>mSettings</code> that
    * defines initialproperty values, aggregated and associated objects as well as event handlers.See
    * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
    * settings object.
    * @param sId ID for the new control, generated automatically if no ID is given
    * @param mSettings Initial settings for the new control
    */
  def this(sId: java.lang.String) = this()
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
    * Adds some appointment to the aggregation <code>appointments</code>.
    * @param oAppointment the appointment to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addAppointment(oAppointment: CalendarAppointment): CalendarRow = js.native
  /**
    * Adds some ariaLabelledBy into the association <code>ariaLabelledBy</code>.
    * @param vAriaLabelledBy the ariaLabelledBy to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addAriaLabelledBy(vAriaLabelledBy: js.Any): CalendarRow = js.native
  def addAriaLabelledBy(vAriaLabelledBy: openui5Lib.sapNs.uiNs.coreNs.Control): CalendarRow = js.native
  /**
    * Adds some intervalHeader to the aggregation <code>intervalHeaders</code>.
    * @param oIntervalHeader the intervalHeader to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addIntervalHeader(oIntervalHeader: CalendarAppointment): CalendarRow = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>intervalSelect</code> event of this
    * <code>sap.ui.unified.CalendarRow</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.ui.unified.CalendarRow</code> itself.Fired if an interval was selected
    * @since 1.38.0
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.ui.unified.CalendarRow</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachIntervalSelect(oData: js.Any, fnFunction: js.Any): CalendarRow = js.native
  def attachIntervalSelect(oData: js.Any, fnFunction: js.Any, oListener: js.Any): CalendarRow = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>leaveRow</code> event of this
    * <code>sap.ui.unified.CalendarRow</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.ui.unified.CalendarRow</code> itself.The <code>CalendarRow</code> should be left
    * while navigating. (Arrow up or arrow down.)The caller should determine the next control to be
    * focused
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.ui.unified.CalendarRow</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachLeaveRow(oData: js.Any, fnFunction: js.Any): CalendarRow = js.native
  def attachLeaveRow(oData: js.Any, fnFunction: js.Any, oListener: js.Any): CalendarRow = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>select</code> event of this
    * <code>sap.ui.unified.CalendarRow</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.ui.unified.CalendarRow</code> itself.Fired if an appointment was selected
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.ui.unified.CalendarRow</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachSelect(oData: js.Any, fnFunction: js.Any): CalendarRow = js.native
  def attachSelect(oData: js.Any, fnFunction: js.Any, oListener: js.Any): CalendarRow = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>startDateChange</code> event of this
    * <code>sap.ui.unified.CalendarRow</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.ui.unified.CalendarRow</code> itself.<code>startDate</code> was changed while
    * navigating in <code>CalendarRow</code>
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.ui.unified.CalendarRow</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachStartDateChange(oData: js.Any, fnFunction: js.Any): CalendarRow = js.native
  def attachStartDateChange(oData: js.Any, fnFunction: js.Any, oListener: js.Any): CalendarRow = js.native
  /**
    * Destroys all the appointments in the aggregation <code>appointments</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyAppointments(): CalendarRow = js.native
  /**
    * Destroys all the intervalHeaders in the aggregation <code>intervalHeaders</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyIntervalHeaders(): CalendarRow = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>intervalSelect</code> event of this
    * <code>sap.ui.unified.CalendarRow</code>.The passed function and listener object must match the ones
    * used for event registration.
    * @since 1.38.0
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachIntervalSelect(fnFunction: js.Any, oListener: js.Any): CalendarRow = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>leaveRow</code> event of this
    * <code>sap.ui.unified.CalendarRow</code>.The passed function and listener object must match the ones
    * used for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachLeaveRow(fnFunction: js.Any, oListener: js.Any): CalendarRow = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>select</code> event of this
    * <code>sap.ui.unified.CalendarRow</code>.The passed function and listener object must match the ones
    * used for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachSelect(fnFunction: js.Any, oListener: js.Any): CalendarRow = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>startDateChange</code> event of this
    * <code>sap.ui.unified.CalendarRow</code>.The passed function and listener object must match the ones
    * used for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachStartDateChange(fnFunction: js.Any, oListener: js.Any): CalendarRow = js.native
  /**
    * Fires event <code>intervalSelect</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>startDate</code> of type <code>object</code>Interval start date as
    * JavaScript date object</li><li><code>endDate</code> of type <code>object</code>Interval end date as
    * JavaScript date object</li><li><code>subInterval</code> of type <code>boolean</code>If set, the
    * selected interval is a subinterval</li></ul>
    * @since 1.38.0
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireIntervalSelect(mArguments: js.Any): CalendarRow = js.native
  /**
    * Fires event <code>leaveRow</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>type</code> of type <code>string</code>The type of the event that triggers
    * this <code>leaveRow</code></li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireLeaveRow(mArguments: js.Any): CalendarRow = js.native
  /**
    * Fires event <code>select</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>appointment</code> of type
    * <code>sap.ui.unified.CalendarAppointment</code>selected
    * appointment</li><li><code>appointments</code> of type
    * <code>sap.ui.unified.CalendarAppointment[]</code>selected appointments in case a group appointment
    * is selected</li><li><code>multiSelect</code> of type <code>boolean</code>If set, the appointment was
    * selected by multiple selection (e.g. shift + mouse click).So more than the current appointment could
    * be selected.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireSelect(mArguments: js.Any): CalendarRow = js.native
  /**
    * Fires event <code>startDateChange</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireStartDateChange(mArguments: js.Any): CalendarRow = js.native
  /**
    * Focus the given <code>CalendarAppointment</code> in the <code>CalendarRow</code>.
    * @param oAppointment Appointment to be focused.
    * @returns <code>this</code> to allow method chaining
    */
  def focusAppointment(oAppointment: CalendarAppointment): CalendarRow = js.native
  /**
    * Focus the <code>CalendarAppointment</code> in the <code>CalendarRow</code> that is nearest tothe
    * given date.
    * @param oDate Javascript Date object.
    * @returns <code>this</code> to allow method chaining
    */
  def focusNearestAppointment(oDate: js.Any): CalendarRow = js.native
  /**
    * Gets content of aggregation <code>appointments</code>.Appointments to be displayed in the row.
    * Appointments outside the visible time frame are not rendered.<b>Note:</b> For performance reasons,
    * only appointments in the visible time range or nearby should be assigned.
    */
  def getAppointments(): js.Array[CalendarAppointment] = js.native
  /**
    * Gets current value of property <code>appointmentsReducedHeight</code>.If set the appointments
    * without text (only title) are rendered with a smaller height.<b>Note:</b> On phone devices this
    * property is ignored, appointments are always rendered in full heightto allow touching.Default value
    * is <code>false</code>.
    * @since 1.38.0
    * @returns Value of property <code>appointmentsReducedHeight</code>
    */
  def getAppointmentsReducedHeight(): scala.Boolean = js.native
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
    */
  def getAriaLabelledBy(): js.Array[_] = js.native
  /**
    * Gets current value of property <code>checkResize</code>.If set, the <code>CalendarRow</code> checks
    * for resize by itself.If a lot of <code>CalendarRow</code> controls are used in one container control
    * (like <code>PlanningCalendar</code>).the resize checks should be done only by this container
    * control. Then the container control shouldcall <code>handleResize</code> of the
    * <code>CalendarRow</code> if a resize happens.Default value is <code>true</code>.
    * @returns Value of property <code>checkResize</code>
    */
  def getCheckResize(): scala.Boolean = js.native
  /**
    * Returns the focused <code>CalendarAppointment</code> of the <code>CalendarRow</code>.The focus must
    * not really be on the <code>CalendarAppointment</code>, it have just tobe the one that has the focus
    * when the <code>CalendarRow</code> was focused last time.
    * @returns Focused Appointment
    */
  def getFocusedAppointment(): CalendarAppointment = js.native
  /**
    * Gets current value of property <code>height</code>.Height of the row
    * @returns Value of property <code>height</code>
    */
  def getHeight(): js.Any = js.native
  /**
    * Gets content of aggregation <code>intervalHeaders</code>.Appointments to be displayed in the top of
    * the intervals. The <code>intervalHeaders</code> are used to visualizepublic holidays and similar
    * things.Appointments outside the visible time frame are not rendered.The <code>intervalHeaders</code>
    * always fill whole intervals. If they are shorter than one interval, they are not
    * displayed.<b>Note:</b> For performance reasons, only appointments in the visible time range or
    * nearby should be assigned.
    */
  def getIntervalHeaders(): js.Array[CalendarAppointment] = js.native
  /**
    * Gets current value of property <code>intervalType</code>.Type of the intervals of the row. The
    * default is one hour.Default value is <code>Hour</code>.
    * @returns Value of property <code>intervalType</code>
    */
  def getIntervalType(): CalendarIntervalType = js.native
  /**
    * Gets current value of property <code>intervals</code>.Number of displayed intervals. The size of the
    * intervals is defined with <code>intervalType</code>Default value is <code>12</code>.
    * @returns Value of property <code>intervals</code>
    */
  def getIntervals(): scala.Double = js.native
  /**
    * ID of the element which is the current target of the association <code>legend</code>, or
    * <code>null</code>.
    * @since 1.40.0
    */
  def getLegend(): js.Any = js.native
  /**
    * Gets current value of property <code>nonWorkingDays</code>.If set, the provided weekdays are
    * displayed as non-working days.Valid values inside the array are 0 to 6. (Other values will just be
    * ignored.)If not set, the weekend defined in the locale settings is displayed as non-working
    * days.<b>Note:</b> The non working days are only visualized if <code>intervalType</code> is set to
    * day.
    * @returns Value of property <code>nonWorkingDays</code>
    */
  def getNonWorkingDays(): scala.Double = js.native
  /**
    * Gets current value of property <code>nonWorkingHours</code>.If set, the provided hours are displayed
    * as non-working hours.Valid values inside the array are 0 to 23. (Other values will just be
    * ignored.)<b>Note:</b> The non working hours are only visualized if <code>intervalType</code> is set
    * to hour.
    * @returns Value of property <code>nonWorkingHours</code>
    */
  def getNonWorkingHours(): scala.Double = js.native
  /**
    * Gets current value of property <code>showEmptyIntervalHeaders</code>.If set, interval headers are
    * shown even if no <code>intervalHeaders</code> are assigned to the visible time frame.If not set, no
    * interval headers are shown if no <code>intervalHeaders</code> are assigned.<b>Note:</b> This
    * property is only used if <code>showIntervalHeaders</code> is set to true.Default value is
    * <code>true</code>.
    * @since 1.38.0
    * @returns Value of property <code>showEmptyIntervalHeaders</code>
    */
  def getShowEmptyIntervalHeaders(): scala.Boolean = js.native
  /**
    * Gets current value of property <code>showIntervalHeaders</code>.If set, interval headers are shown
    * like specified in <code>showEmptyIntervalHeaders</code>.If not set, no interval headers are shown
    * even if <code>intervalHeaders</code> are assigned.Default value is <code>true</code>.
    * @returns Value of property <code>showIntervalHeaders</code>
    */
  def getShowIntervalHeaders(): scala.Boolean = js.native
  /**
    * Gets current value of property <code>showSubIntervals</code>.If set, subintervals are shown.If the
    * interval type is <code>Hour</code>, quarter hours are shown.If the interval type is
    * <code>Day</code>, hours are shown.If the interval type is <code>Month</code>, days are shown.Default
    * value is <code>false</code>.
    * @returns Value of property <code>showSubIntervals</code>
    */
  def getShowSubIntervals(): scala.Boolean = js.native
  /**
    * Gets current value of property <code>startDate</code>.Start date, as JavaScript Date object, of the
    * row. As default, the current date is used.
    * @returns Value of property <code>startDate</code>
    */
  def getStartDate(): js.Any = js.native
  /**
    * Gets current value of property <code>updateCurrentTime</code>.If set the <code>CalendarRow</code>
    * triggers a periodic update to visualize the current time.If a lot of <code>CalendarRow</code>
    * controls are used in one container control (like <code>PlanningCalendar</code>)the periodic update
    * should be triggered only by this container control. Then the container control shouldcall
    * <code>updateCurrentTimeVisualization</code> of the <code>CalendarRow</code> to update the
    * visualization.Default value is <code>true</code>.
    * @returns Value of property <code>updateCurrentTime</code>
    */
  def getUpdateCurrentTime(): scala.Boolean = js.native
  /**
    * Gets current value of property <code>width</code>.Width of the row
    * @returns Value of property <code>width</code>
    */
  def getWidth(): js.Any = js.native
  /**
    * After a resize of the <code>CalendarRow</code>, some calculations for appointmentsizes are
    * needed.For this, each <code>CalendarRow</code> can trigger the resize check for it's own DOM.But if
    * multiple <code>CalendarRow</code>s are used in one container (e.g. <code>PlanningCalendar</code>),it
    * is better if the container triggers the resize check once an then calls this functionof each
    * <code>CalendarRow</code>.
    * @param oEvent The event object of the resize handler.
    * @returns <code>this</code> to allow method chaining
    */
  def handleResize(oEvent: js.Any): CalendarRow = js.native
  /**
    * Checks for the provided <code>sap.ui.unified.CalendarAppointment</code> in the aggregation
    * <code>appointments</code>.and returns its index if found or -1 otherwise.
    * @param oAppointment The appointment whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfAppointment(oAppointment: CalendarAppointment): scala.Double = js.native
  /**
    * Checks for the provided <code>sap.ui.unified.CalendarAppointment</code> in the aggregation
    * <code>intervalHeaders</code>.and returns its index if found or -1 otherwise.
    * @param oIntervalHeader The intervalHeader whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfIntervalHeader(oIntervalHeader: CalendarAppointment): scala.Double = js.native
  /**
    * Inserts a appointment into the aggregation <code>appointments</code>.
    * @param oAppointment the appointment to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the appointment should be inserted at; for            
    * a negative value of <code>iIndex</code>, the appointment is inserted at position 0; for a value     
    *        greater than the current size of the aggregation, the appointment is inserted at            
    * the last position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertAppointment(oAppointment: CalendarAppointment, iIndex: scala.Double): CalendarRow = js.native
  /**
    * Inserts a intervalHeader into the aggregation <code>intervalHeaders</code>.
    * @param oIntervalHeader the intervalHeader to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the intervalHeader should be inserted at; for          
    *   a negative value of <code>iIndex</code>, the intervalHeader is inserted at position 0; for a value
    *             greater than the current size of the aggregation, the intervalHeader is inserted at     
    *        the last position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertIntervalHeader(oIntervalHeader: CalendarAppointment, iIndex: scala.Double): CalendarRow = js.native
  /**
    * Removes all the controls from the aggregation <code>appointments</code>.Additionally, it unregisters
    * them from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllAppointments(): js.Array[CalendarAppointment] = js.native
  /**
    * Removes all the controls in the association named <code>ariaLabelledBy</code>.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllAriaLabelledBy(): js.Array[_] = js.native
  /**
    * Removes all the controls from the aggregation <code>intervalHeaders</code>.Additionally, it
    * unregisters them from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllIntervalHeaders(): js.Array[CalendarAppointment] = js.native
  def removeAppointment(vAppointment: java.lang.String): CalendarAppointment = js.native
  def removeAppointment(vAppointment: CalendarAppointment): CalendarAppointment = js.native
  /**
    * Removes a appointment from the aggregation <code>appointments</code>.
    * @param vAppointment The appointment to remove or its index or id
    * @returns The removed appointment or <code>null</code>
    */
  def removeAppointment(vAppointment: scala.Double): CalendarAppointment = js.native
  def removeAriaLabelledBy(vAriaLabelledBy: js.Any): js.Any = js.native
  def removeAriaLabelledBy(vAriaLabelledBy: openui5Lib.sapNs.uiNs.coreNs.Control): js.Any = js.native
  /**
    * Removes an ariaLabelledBy from the association named <code>ariaLabelledBy</code>.
    * @param vAriaLabelledBy The ariaLabelledBy to be removed or its index or ID
    * @returns The removed ariaLabelledBy or <code>null</code>
    */
  def removeAriaLabelledBy(vAriaLabelledBy: scala.Double): js.Any = js.native
  def removeIntervalHeader(vIntervalHeader: java.lang.String): CalendarAppointment = js.native
  def removeIntervalHeader(vIntervalHeader: CalendarAppointment): CalendarAppointment = js.native
  /**
    * Removes a intervalHeader from the aggregation <code>intervalHeaders</code>.
    * @param vIntervalHeader The intervalHeader to remove or its index or id
    * @returns The removed intervalHeader or <code>null</code>
    */
  def removeIntervalHeader(vIntervalHeader: scala.Double): CalendarAppointment = js.native
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
  def setAppointmentsReducedHeight(bAppointmentsReducedHeight: scala.Boolean): CalendarRow = js.native
  /**
    * Sets a new value for property <code>appointmentsVisualization</code>.Defines the visualization of
    * the <code>CalendarAppoinment</code><b>Note:</b> The real visualization depends on the used
    * theme.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code>Standard</code>.
    * @since 1.40.0
    * @param sAppointmentsVisualization New value for property <code>appointmentsVisualization</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setAppointmentsVisualization(sAppointmentsVisualization: CalendarAppointmentVisualization): CalendarRow = js.native
  /**
    * Sets a new value for property <code>checkResize</code>.If set, the <code>CalendarRow</code> checks
    * for resize by itself.If a lot of <code>CalendarRow</code> controls are used in one container control
    * (like <code>PlanningCalendar</code>).the resize checks should be done only by this container
    * control. Then the container control shouldcall <code>handleResize</code> of the
    * <code>CalendarRow</code> if a resize happens.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>true</code>.
    * @param bCheckResize New value for property <code>checkResize</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setCheckResize(bCheckResize: scala.Boolean): CalendarRow = js.native
  /**
    * Sets a new value for property <code>height</code>.Height of the rowWhen called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @param sHeight New value for property <code>height</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setHeight(sHeight: js.Any): CalendarRow = js.native
  /**
    * Sets a new value for property <code>intervalType</code>.Type of the intervals of the row. The
    * default is one hour.When called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.Default value is <code>Hour</code>.
    * @param sIntervalType New value for property <code>intervalType</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIntervalType(sIntervalType: CalendarIntervalType): CalendarRow = js.native
  /**
    * Sets a new value for property <code>intervals</code>.Number of displayed intervals. The size of the
    * intervals is defined with <code>intervalType</code>When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>12</code>.
    * @param iIntervals New value for property <code>intervals</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIntervals(iIntervals: scala.Double): CalendarRow = js.native
  /**
    * Sets the associated <code>legend</code>.
    * @since 1.40.0
    * @param oLegend ID of an element which becomes the new target of this legend association;
    * alternatively, an element instance may be given
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setLegend(oLegend: js.Any): CalendarRow = js.native
  def setLegend(oLegend: CalendarLegend): CalendarRow = js.native
  /**
    * Sets a new value for property <code>nonWorkingDays</code>.If set, the provided weekdays are
    * displayed as non-working days.Valid values inside the array are 0 to 6. (Other values will just be
    * ignored.)If not set, the weekend defined in the locale settings is displayed as non-working
    * days.<b>Note:</b> The non working days are only visualized if <code>intervalType</code> is set to
    * day.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.
    * @param sNonWorkingDays New value for property <code>nonWorkingDays</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setNonWorkingDays(sNonWorkingDays: scala.Double): CalendarRow = js.native
  /**
    * Sets a new value for property <code>nonWorkingHours</code>.If set, the provided hours are displayed
    * as non-working hours.Valid values inside the array are 0 to 23. (Other values will just be
    * ignored.)<b>Note:</b> The non working hours are only visualized if <code>intervalType</code> is set
    * to hour.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.
    * @param sNonWorkingHours New value for property <code>nonWorkingHours</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setNonWorkingHours(sNonWorkingHours: scala.Double): CalendarRow = js.native
  /**
    * Sets a new value for property <code>showEmptyIntervalHeaders</code>.If set, interval headers are
    * shown even if no <code>intervalHeaders</code> are assigned to the visible time frame.If not set, no
    * interval headers are shown if no <code>intervalHeaders</code> are assigned.<b>Note:</b> This
    * property is only used if <code>showIntervalHeaders</code> is set to true.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>true</code>.
    * @since 1.38.0
    * @param bShowEmptyIntervalHeaders New value for property <code>showEmptyIntervalHeaders</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowEmptyIntervalHeaders(bShowEmptyIntervalHeaders: scala.Boolean): CalendarRow = js.native
  /**
    * Sets a new value for property <code>showIntervalHeaders</code>.If set, interval headers are shown
    * like specified in <code>showEmptyIntervalHeaders</code>.If not set, no interval headers are shown
    * even if <code>intervalHeaders</code> are assigned.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>true</code>.
    * @param bShowIntervalHeaders New value for property <code>showIntervalHeaders</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowIntervalHeaders(bShowIntervalHeaders: scala.Boolean): CalendarRow = js.native
  /**
    * Sets a new value for property <code>showSubIntervals</code>.If set, subintervals are shown.If the
    * interval type is <code>Hour</code>, quarter hours are shown.If the interval type is
    * <code>Day</code>, hours are shown.If the interval type is <code>Month</code>, days are shown.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.Default value is <code>false</code>.
    * @param bShowSubIntervals New value for property <code>showSubIntervals</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowSubIntervals(bShowSubIntervals: scala.Boolean): CalendarRow = js.native
  /**
    * Sets a new value for property <code>startDate</code>.Start date, as JavaScript Date object, of the
    * row. As default, the current date is used.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @param oStartDate New value for property <code>startDate</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setStartDate(oStartDate: js.Any): CalendarRow = js.native
  /**
    * Sets a new value for property <code>updateCurrentTime</code>.If set the <code>CalendarRow</code>
    * triggers a periodic update to visualize the current time.If a lot of <code>CalendarRow</code>
    * controls are used in one container control (like <code>PlanningCalendar</code>)the periodic update
    * should be triggered only by this container control. Then the container control shouldcall
    * <code>updateCurrentTimeVisualization</code> of the <code>CalendarRow</code> to update the
    * visualization.When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.Default value is <code>true</code>.
    * @param bUpdateCurrentTime New value for property <code>updateCurrentTime</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setUpdateCurrentTime(bUpdateCurrentTime: scala.Boolean): CalendarRow = js.native
  /**
    * Sets a new value for property <code>width</code>.Width of the rowWhen called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @param sWidth New value for property <code>width</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setWidth(sWidth: js.Any): CalendarRow = js.native
  /**
    * If the current time is in the visible output of the <code>CalendarRow</code>,the indicator for the
    * current time must be positioned.For this, each <code>CalendarRow</code> can trigger a timer.But if
    * multiple <code>CalendarRow</code>s are used in one container (e.G. <code>PlanningCalendar</code>),it
    * is better if the container triggers the interval once an then calls this functionof each
    * <code>CalendarRow</code>.
    * @returns <code>this</code> to allow method chaining
    */
  def updateCurrentTimeVisualization(): CalendarRow = js.native
}

