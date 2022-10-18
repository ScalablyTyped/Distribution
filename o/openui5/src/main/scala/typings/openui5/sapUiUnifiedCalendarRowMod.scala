package typings.openui5

import typings.openui5.anon.Appointment
import typings.openui5.anon.EndDate
import typings.openui5.anon.Type
import typings.openui5.jQuery.Event
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiUnifiedLibraryMod.CalendarAppointmentHeight
import typings.openui5.sapUiUnifiedLibraryMod.CalendarAppointmentRoundWidth
import typings.openui5.sapUiUnifiedLibraryMod.CalendarAppointmentVisualization
import typings.openui5.sapUiUnifiedLibraryMod.CalendarIntervalType
import typings.openui5.sapUiUnifiedLibraryMod.GroupAppointmentsMode
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiUnifiedCalendarRowMod {
  
  @JSImport("sap/ui/unified/CalendarRow", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `CalendarRow`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends CalendarRow {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: CalendarRowSettings) = this()
    def this(/**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: String,
      /**
      * Initial settings for the new control
      */
    mSettings: CalendarRowSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: CalendarRowSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/unified/CalendarRow", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.unified.CalendarRow with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Control.extend}.
      *
      * @returns Created class / constructor function
      */
    inline def extend[T /* <: Record[String, Any] */](/**
      * Name of the class being created
      */
    sClassName: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: Unit,
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, CalendarRow]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, CalendarRow],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.unified.CalendarRow.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait CalendarRow
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Adds some appointment to the aggregation {@link #getAppointments appointments}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAppointment(
      /**
      * The appointment to add; if empty, nothing is inserted
      */
    oAppointment: typings.openui5.sapUiUnifiedCalendarAppointmentMod.default
    ): this.type = js.native
    
    def addAriaLabelledBy(
      /**
      * The ariaLabelledBy to add; if empty, nothing is inserted
      */
    vAriaLabelledBy: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * Adds some ariaLabelledBy into the association {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAriaLabelledBy(/**
      * The ariaLabelledBy to add; if empty, nothing is inserted
      */
    vAriaLabelledBy: ID): this.type = js.native
    
    /**
      * Adds some intervalHeader to the aggregation {@link #getIntervalHeaders intervalHeaders}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addIntervalHeader(
      /**
      * The intervalHeader to add; if empty, nothing is inserted
      */
    oIntervalHeader: typings.openui5.sapUiUnifiedCalendarAppointmentMod.default
    ): this.type = js.native
    
    /**
      * @SINCE 1.38.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:intervalSelect intervalSelect} event of this
      * `sap.ui.unified.CalendarRow`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.CalendarRow` itself.
      *
      * Fired if an interval was selected
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachIntervalSelect(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachIntervalSelect(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.CalendarRow` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.38.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:intervalSelect intervalSelect} event of this
      * `sap.ui.unified.CalendarRow`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.CalendarRow` itself.
      *
      * Fired if an interval was selected
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachIntervalSelect(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachIntervalSelect(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.CalendarRow` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:leaveRow leaveRow} event of this `sap.ui.unified.CalendarRow`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.CalendarRow` itself.
      *
      * The `CalendarRow` should be left while navigating. (Arrow up or arrow down.) The caller should determine
      * the next control to be focused
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachLeaveRow(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachLeaveRow(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.CalendarRow` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:leaveRow leaveRow} event of this `sap.ui.unified.CalendarRow`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.CalendarRow` itself.
      *
      * The `CalendarRow` should be left while navigating. (Arrow up or arrow down.) The caller should determine
      * the next control to be focused
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachLeaveRow(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachLeaveRow(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.CalendarRow` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:select select} event of this `sap.ui.unified.CalendarRow`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.CalendarRow` itself.
      *
      * Fired if an appointment was selected
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSelect(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachSelect(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.CalendarRow` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:select select} event of this `sap.ui.unified.CalendarRow`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.CalendarRow` itself.
      *
      * Fired if an appointment was selected
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSelect(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachSelect(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.CalendarRow` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:startDateChange startDateChange} event of this
      * `sap.ui.unified.CalendarRow`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.CalendarRow` itself.
      *
      * `startDate` was changed while navigating in `CalendarRow`
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachStartDateChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachStartDateChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.CalendarRow` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:startDateChange startDateChange} event of this
      * `sap.ui.unified.CalendarRow`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.CalendarRow` itself.
      *
      * `startDate` was changed while navigating in `CalendarRow`
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachStartDateChange(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachStartDateChange(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.CalendarRow` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys all the appointments in the aggregation {@link #getAppointments appointments}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyAppointments(): this.type = js.native
    
    /**
      * Destroys all the intervalHeaders in the aggregation {@link #getIntervalHeaders intervalHeaders}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyIntervalHeaders(): this.type = js.native
    
    /**
      * @SINCE 1.38.0
      *
      * Detaches event handler `fnFunction` from the {@link #event:intervalSelect intervalSelect} event of this
      * `sap.ui.unified.CalendarRow`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachIntervalSelect(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachIntervalSelect(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:leaveRow leaveRow} event of this `sap.ui.unified.CalendarRow`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachLeaveRow(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachLeaveRow(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:select select} event of this `sap.ui.unified.CalendarRow`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSelect(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachSelect(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:startDateChange startDateChange} event of
      * this `sap.ui.unified.CalendarRow`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachStartDateChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachStartDateChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.38.0
      *
      * Fires event {@link #event:intervalSelect intervalSelect} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireIntervalSelect(): this.type = js.native
    def fireIntervalSelect(/**
      * Parameters to pass along with the event
      */
    mParameters: EndDate): this.type = js.native
    
    /**
      * Fires event {@link #event:leaveRow leaveRow} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireLeaveRow(): this.type = js.native
    def fireLeaveRow(/**
      * Parameters to pass along with the event
      */
    mParameters: Type): this.type = js.native
    
    /**
      * Fires event {@link #event:select select} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSelect(): this.type = js.native
    def fireSelect(/**
      * Parameters to pass along with the event
      */
    mParameters: Appointment): this.type = js.native
    
    /**
      * Fires event {@link #event:startDateChange startDateChange} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireStartDateChange(): this.type = js.native
    def fireStartDateChange(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Focus the given `CalendarAppointment` in the `CalendarRow`.
      *
      * @returns `this` to allow method chaining
      */
    def focusAppointment(
      /**
      * Appointment to be focused.
      */
    oAppointment: typings.openui5.sapUiUnifiedCalendarAppointmentMod.default
    ): this.type = js.native
    
    /**
      * Focus the `CalendarAppointment` in the `CalendarRow` that is nearest to the given date.
      *
      * @returns `this` to allow method chaining
      */
    def focusNearestAppointment(/**
      * Javascript Date object.
      */
    oDate: js.Object): this.type = js.native
    
    /**
      * @SINCE 1.81.0
      *
      * Gets current value of property {@link #getAppointmentHeight appointmentHeight}.
      *
      * Defines the height of the CalendarAppoinment
      *
      * Default value is `Regular`.
      *
      * @returns Value of property `appointmentHeight`
      */
    def getAppointmentHeight(): CalendarAppointmentHeight | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarAppointmentHeight * / any */ String) = js.native
    
    /**
      * @SINCE 1.81.0
      * @EXPERIMENTAL (since 1.81.0)
      *
      * Gets current value of property {@link #getAppointmentRoundWidth appointmentRoundWidth}.
      *
      * Defines rounding of the width of CalendarAppoinment **Note:** This property is applied, when
      * the calendar interval type is day and the view shows more than 20 days
      *
      * Default value is `None`.
      *
      * @returns Value of property `appointmentRoundWidth`
      */
    def getAppointmentRoundWidth(): CalendarAppointmentRoundWidth | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarAppointmentRoundWidth * / any */ String) = js.native
    
    /**
      * Gets content of aggregation {@link #getAppointments appointments}.
      *
      * Appointments to be displayed in the row. Appointments outside the visible time frame are not rendered.
      *
      * **Note:** For performance reasons, only appointments in the visible time range or nearby should be assigned.
      */
    def getAppointments(): js.Array[typings.openui5.sapUiUnifiedCalendarAppointmentMod.default] = js.native
    
    /**
      * @SINCE 1.38.0
      * @deprecated (since 1.81) - Please use the `appointmentHeight` with value "Automatic" property instead.
      *
      * Gets current value of property {@link #getAppointmentsReducedHeight appointmentsReducedHeight}.
      *
      * If set the appointments without text (only title) are rendered with a smaller height.
      *
      * **Note:** On phone devices this property is ignored, appointments are always rendered in full height
      * to allow touching.
      *
      * Default value is `false`.
      *
      * @returns Value of property `appointmentsReducedHeight`
      */
    def getAppointmentsReducedHeight(): Boolean = js.native
    
    /**
      * @SINCE 1.40.0
      *
      * Gets current value of property {@link #getAppointmentsVisualization appointmentsVisualization}.
      *
      * Defines the visualization of the `CalendarAppoinment`
      *
      * **Note:** The real visualization depends on the used theme.
      *
      * Default value is `Standard`.
      *
      * @returns Value of property `appointmentsVisualization`
      */
    def getAppointmentsVisualization(): CalendarAppointmentVisualization | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarAppointmentVisualization * / any */ String) = js.native
    
    /**
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaLabelledBy
      * ariaLabelledBy}.
      */
    def getAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * Gets current value of property {@link #getCheckResize checkResize}.
      *
      * If set, the `CalendarRow` checks for resize by itself.
      *
      * If a lot of `CalendarRow` controls are used in one container control (like `PlanningCalendar`). the resize
      * checks should be done only by this container control. Then the container control should call `handleResize`
      * of the `CalendarRow` if a resize happens.
      *
      * Default value is `true`.
      *
      * @returns Value of property `checkResize`
      */
    def getCheckResize(): Boolean = js.native
    
    /**
      * Returns the focused `CalendarAppointment` of the `CalendarRow`.
      *
      * The focus must not really be on the `CalendarAppointment`, it have just to be the one that has the focus
      * when the `CalendarRow` was focused last time.
      *
      * @returns Focused Appointment
      */
    def getFocusedAppointment(): typings.openui5.sapUiUnifiedCalendarAppointmentMod.default = js.native
    
    /**
      * Gets current value of property {@link #getGroupAppointmentsMode groupAppointmentsMode}.
      *
      * Defines the mode in which the overlapping appointments are displayed.
      *
      * **Note:** This property takes effect, only if the `intervalType` of the current calendar view is set
      * to `sap.ui.unified.CalendarIntervalType.Month`. On phone devices this property is ignored, and the default
      * value is applied.
      *
      * Default value is `Collapsed`.
      *
      * @returns Value of property `groupAppointmentsMode`
      */
    def getGroupAppointmentsMode(): GroupAppointmentsMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GroupAppointmentsMode * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getHeight height}.
      *
      * Height of the row
      *
      * @returns Value of property `height`
      */
    def getHeight(): CSSSize = js.native
    
    /**
      * Gets content of aggregation {@link #getIntervalHeaders intervalHeaders}.
      *
      * Appointments to be displayed in the top of the intervals. The `intervalHeaders` are used to visualize
      * public holidays and similar things.
      *
      * Appointments outside the visible time frame are not rendered.
      *
      * The `intervalHeaders` always fill whole intervals. If they are shorter than one interval, they are not
      * displayed.
      *
      * **Note:** For performance reasons, only appointments in the visible time range or nearby should be assigned.
      */
    def getIntervalHeaders(): js.Array[typings.openui5.sapUiUnifiedCalendarAppointmentMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getIntervalSize intervalSize}.
      *
      * Number of interval type units merged. It's used when presenting Relative View in sap.m.PlanningCalendar.
      * Note: If the value is more than 1, the NonWorkingDays type is not presented.
      *
      * Default value is `1`.
      *
      * @returns Value of property `intervalSize`
      */
    def getIntervalSize(): int = js.native
    
    /**
      * Gets current value of property {@link #getIntervalType intervalType}.
      *
      * Type of the intervals of the row. The default is one hour.
      *
      * Default value is `Hour`.
      *
      * @returns Value of property `intervalType`
      */
    def getIntervalType(): CalendarIntervalType = js.native
    
    /**
      * Gets current value of property {@link #getIntervals intervals}.
      *
      * Number of displayed intervals. The size of the intervals is defined with `intervalType`
      *
      * Default value is `12`.
      *
      * @returns Value of property `intervals`
      */
    def getIntervals(): int = js.native
    
    /**
      * @SINCE 1.40.0
      *
      * ID of the element which is the current target of the association {@link #getLegend legend}, or `null`.
      */
    def getLegend(): ID = js.native
    
    /**
      * @SINCE 1.97
      *
      * Gets current value of property {@link #getMultipleAppointmentsSelection multipleAppointmentsSelection}.
      *
      * Determines whether the selection of multiple appointments is enabled.
      *
      * Note: selection of multiple appointments is possible using CTRL key regardless of the value of this property.
      *
      * Default value is `false`.
      *
      * @returns Value of property `multipleAppointmentsSelection`
      */
    def getMultipleAppointmentsSelection(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getNonWorkingDays nonWorkingDays}.
      *
      * If set, the provided weekdays are displayed as non-working days. Valid values inside the array are 0
      * to 6. (Other values will just be ignored.)
      *
      * If not set, the weekend defined in the locale settings is displayed as non-working days.
      *
      * **Note:** The non working days are only visualized if `intervalType` is set to day.
      *
      * @returns Value of property `nonWorkingDays`
      */
    def getNonWorkingDays(): js.Array[int] = js.native
    
    /**
      * Gets current value of property {@link #getNonWorkingHours nonWorkingHours}.
      *
      * If set, the provided hours are displayed as non-working hours. Valid values inside the array are 0 to
      * 23. (Other values will just be ignored.)
      *
      * **Note:** The non working hours are only visualized if `intervalType` is set to hour.
      *
      * @returns Value of property `nonWorkingHours`
      */
    def getNonWorkingHours(): js.Array[int] = js.native
    
    /**
      * @SINCE 1.38.0
      *
      * Gets current value of property {@link #getShowEmptyIntervalHeaders showEmptyIntervalHeaders}.
      *
      * If set, interval headers are shown even if no `intervalHeaders` are assigned to the visible time frame.
      *
      * If not set, no interval headers are shown if no `intervalHeaders` are assigned.
      *
      * **Note:** This property is only used if `showIntervalHeaders` is set to true.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showEmptyIntervalHeaders`
      */
    def getShowEmptyIntervalHeaders(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowIntervalHeaders showIntervalHeaders}.
      *
      * If set, interval headers are shown like specified in `showEmptyIntervalHeaders`.
      *
      * If not set, no interval headers are shown even if `intervalHeaders` are assigned.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showIntervalHeaders`
      */
    def getShowIntervalHeaders(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowSubIntervals showSubIntervals}.
      *
      * If set, subintervals are shown.
      *
      * If the interval type is `Hour`, quarter hours are shown.
      *
      * If the interval type is `Day`, hours are shown.
      *
      * If the interval type is `Month`, days are shown.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showSubIntervals`
      */
    def getShowSubIntervals(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getStartDate startDate}.
      *
      * Start date, as JavaScript Date object, of the row. As default, the current date is used.
      *
      * @returns Value of property `startDate`
      */
    def getStartDate(): js.Object = js.native
    
    /**
      * Gets current value of property {@link #getUpdateCurrentTime updateCurrentTime}.
      *
      * If set the `CalendarRow` triggers a periodic update to visualize the current time.
      *
      * If a lot of `CalendarRow` controls are used in one container control (like `PlanningCalendar`) the periodic
      * update should be triggered only by this container control. Then the container control should call `updateCurrentTimeVisualization`
      * of the `CalendarRow` to update the visualization.
      *
      * Default value is `true`.
      *
      * @returns Value of property `updateCurrentTime`
      */
    def getUpdateCurrentTime(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Width of the row
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * After a resize of the `CalendarRow`, some calculations for appointment sizes are needed.
      *
      * For this, each `CalendarRow` can trigger the resize check for it's own DOM. But if multiple `CalendarRow`s
      * are used in one container (e.g. `PlanningCalendar`), it is better if the container triggers the resize
      * check once and then calls this function of each `CalendarRow`.
      *
      * @returns `this` to allow method chaining
      */
    def handleResize(/**
      * The event object of the resize handler.
      */
    oEvent: Event): this.type = js.native
    
    /**
      * Checks for the provided `sap.ui.unified.CalendarAppointment` in the aggregation {@link #getAppointments
      * appointments}. and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfAppointment(
      /**
      * The appointment whose index is looked for
      */
    oAppointment: typings.openui5.sapUiUnifiedCalendarAppointmentMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.ui.unified.CalendarAppointment` in the aggregation {@link #getIntervalHeaders
      * intervalHeaders}. and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfIntervalHeader(
      /**
      * The intervalHeader whose index is looked for
      */
    oIntervalHeader: typings.openui5.sapUiUnifiedCalendarAppointmentMod.default
    ): int = js.native
    
    /**
      * Inserts a appointment into the aggregation {@link #getAppointments appointments}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertAppointment(
      /**
      * The appointment to insert; if empty, nothing is inserted
      */
    oAppointment: typings.openui5.sapUiUnifiedCalendarAppointmentMod.default,
      /**
      * The `0`-based index the appointment should be inserted at; for a negative value of `iIndex`, the appointment
      * is inserted at position 0; for a value greater than the current size of the aggregation, the appointment
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a intervalHeader into the aggregation {@link #getIntervalHeaders intervalHeaders}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertIntervalHeader(
      /**
      * The intervalHeader to insert; if empty, nothing is inserted
      */
    oIntervalHeader: typings.openui5.sapUiUnifiedCalendarAppointmentMod.default,
      /**
      * The `0`-based index the intervalHeader should be inserted at; for a negative value of `iIndex`, the intervalHeader
      * is inserted at position 0; for a value greater than the current size of the aggregation, the intervalHeader
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getAppointments appointments}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAppointments(): js.Array[typings.openui5.sapUiUnifiedCalendarAppointmentMod.default] = js.native
    
    /**
      * Removes all the controls in the association named {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getIntervalHeaders intervalHeaders}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllIntervalHeaders(): js.Array[typings.openui5.sapUiUnifiedCalendarAppointmentMod.default] = js.native
    
    def removeAppointment(/**
      * The appointment to remove or its index or id
      */
    vAppointment: String): typings.openui5.sapUiUnifiedCalendarAppointmentMod.default | Null = js.native
    /**
      * Removes a appointment from the aggregation {@link #getAppointments appointments}.
      *
      * @returns The removed appointment or `null`
      */
    def removeAppointment(/**
      * The appointment to remove or its index or id
      */
    vAppointment: int): typings.openui5.sapUiUnifiedCalendarAppointmentMod.default | Null = js.native
    def removeAppointment(
      /**
      * The appointment to remove or its index or id
      */
    vAppointment: typings.openui5.sapUiUnifiedCalendarAppointmentMod.default
    ): typings.openui5.sapUiUnifiedCalendarAppointmentMod.default | Null = js.native
    
    /**
      * Removes an ariaLabelledBy from the association named {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns The removed ariaLabelledBy or `null`
      */
    def removeAriaLabelledBy(/**
      * The ariaLabelledBy to be removed or its index or ID
      */
    vAriaLabelledBy: int): ID | Null = js.native
    def removeAriaLabelledBy(
      /**
      * The ariaLabelledBy to be removed or its index or ID
      */
    vAriaLabelledBy: typings.openui5.sapUiCoreControlMod.default
    ): ID | Null = js.native
    def removeAriaLabelledBy(/**
      * The ariaLabelledBy to be removed or its index or ID
      */
    vAriaLabelledBy: ID): ID | Null = js.native
    
    def removeIntervalHeader(/**
      * The intervalHeader to remove or its index or id
      */
    vIntervalHeader: String): typings.openui5.sapUiUnifiedCalendarAppointmentMod.default | Null = js.native
    /**
      * Removes a intervalHeader from the aggregation {@link #getIntervalHeaders intervalHeaders}.
      *
      * @returns The removed intervalHeader or `null`
      */
    def removeIntervalHeader(/**
      * The intervalHeader to remove or its index or id
      */
    vIntervalHeader: int): typings.openui5.sapUiUnifiedCalendarAppointmentMod.default | Null = js.native
    def removeIntervalHeader(
      /**
      * The intervalHeader to remove or its index or id
      */
    vIntervalHeader: typings.openui5.sapUiUnifiedCalendarAppointmentMod.default
    ): typings.openui5.sapUiUnifiedCalendarAppointmentMod.default | Null = js.native
    
    /**
      * @SINCE 1.81.0
      *
      * Sets a new value for property {@link #getAppointmentHeight appointmentHeight}.
      *
      * Defines the height of the CalendarAppoinment
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Regular`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAppointmentHeight(): this.type = js.native
    def setAppointmentHeight(
      /**
      * New value for property `appointmentHeight`
      */
    sAppointmentHeight: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarAppointmentHeight * / any */ String
    ): this.type = js.native
    def setAppointmentHeight(
      /**
      * New value for property `appointmentHeight`
      */
    sAppointmentHeight: CalendarAppointmentHeight
    ): this.type = js.native
    
    /**
      * @SINCE 1.81.0
      * @EXPERIMENTAL (since 1.81.0)
      *
      * Sets a new value for property {@link #getAppointmentRoundWidth appointmentRoundWidth}.
      *
      * Defines rounding of the width of CalendarAppoinment **Note:** This property is applied, when
      * the calendar interval type is day and the view shows more than 20 days
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `None`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAppointmentRoundWidth(): this.type = js.native
    def setAppointmentRoundWidth(
      /**
      * New value for property `appointmentRoundWidth`
      */
    sAppointmentRoundWidth: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarAppointmentRoundWidth * / any */ String
    ): this.type = js.native
    def setAppointmentRoundWidth(
      /**
      * New value for property `appointmentRoundWidth`
      */
    sAppointmentRoundWidth: CalendarAppointmentRoundWidth
    ): this.type = js.native
    
    /**
      * @SINCE 1.38.0
      * @deprecated (since 1.81) - Please use the `appointmentHeight` with value "Automatic" property instead.
      *
      * Sets a new value for property {@link #getAppointmentsReducedHeight appointmentsReducedHeight}.
      *
      * If set the appointments without text (only title) are rendered with a smaller height.
      *
      * **Note:** On phone devices this property is ignored, appointments are always rendered in full height
      * to allow touching.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAppointmentsReducedHeight(): this.type = js.native
    def setAppointmentsReducedHeight(
      /**
      * New value for property `appointmentsReducedHeight`
      */
    bAppointmentsReducedHeight: Boolean
    ): this.type = js.native
    
    /**
      * @SINCE 1.40.0
      *
      * Sets a new value for property {@link #getAppointmentsVisualization appointmentsVisualization}.
      *
      * Defines the visualization of the `CalendarAppoinment`
      *
      * **Note:** The real visualization depends on the used theme.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Standard`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAppointmentsVisualization(): this.type = js.native
    def setAppointmentsVisualization(
      /**
      * New value for property `appointmentsVisualization`
      */
    sAppointmentsVisualization: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarAppointmentVisualization * / any */ String
    ): this.type = js.native
    def setAppointmentsVisualization(
      /**
      * New value for property `appointmentsVisualization`
      */
    sAppointmentsVisualization: CalendarAppointmentVisualization
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getCheckResize checkResize}.
      *
      * If set, the `CalendarRow` checks for resize by itself.
      *
      * If a lot of `CalendarRow` controls are used in one container control (like `PlanningCalendar`). the resize
      * checks should be done only by this container control. Then the container control should call `handleResize`
      * of the `CalendarRow` if a resize happens.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCheckResize(): this.type = js.native
    def setCheckResize(/**
      * New value for property `checkResize`
      */
    bCheckResize: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getGroupAppointmentsMode groupAppointmentsMode}.
      *
      * Defines the mode in which the overlapping appointments are displayed.
      *
      * **Note:** This property takes effect, only if the `intervalType` of the current calendar view is set
      * to `sap.ui.unified.CalendarIntervalType.Month`. On phone devices this property is ignored, and the default
      * value is applied.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Collapsed`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setGroupAppointmentsMode(): this.type = js.native
    def setGroupAppointmentsMode(
      /**
      * New value for property `groupAppointmentsMode`
      */
    sGroupAppointmentsMode: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GroupAppointmentsMode * / any */ String
    ): this.type = js.native
    def setGroupAppointmentsMode(
      /**
      * New value for property `groupAppointmentsMode`
      */
    sGroupAppointmentsMode: GroupAppointmentsMode
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHeight height}.
      *
      * Height of the row
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeight(): this.type = js.native
    def setHeight(/**
      * New value for property `height`
      */
    sHeight: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIntervalSize intervalSize}.
      *
      * Number of interval type units merged. It's used when presenting Relative View in sap.m.PlanningCalendar.
      * Note: If the value is more than 1, the NonWorkingDays type is not presented.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `1`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIntervalSize(): this.type = js.native
    def setIntervalSize(/**
      * New value for property `intervalSize`
      */
    iIntervalSize: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIntervalType intervalType}.
      *
      * Type of the intervals of the row. The default is one hour.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Hour`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIntervalType(): this.type = js.native
    def setIntervalType(/**
      * New value for property `intervalType`
      */
    sIntervalType: CalendarIntervalType): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIntervals intervals}.
      *
      * Number of displayed intervals. The size of the intervals is defined with `intervalType`
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `12`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIntervals(): this.type = js.native
    def setIntervals(/**
      * New value for property `intervals`
      */
    iIntervals: int): this.type = js.native
    
    /**
      * @SINCE 1.40.0
      *
      * Sets the associated {@link #getLegend legend}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLegend(
      /**
      * ID of an element which becomes the new target of this legend association; alternatively, an element instance
      * may be given
      */
    oLegend: ID
    ): this.type = js.native
    def setLegend(
      /**
      * ID of an element which becomes the new target of this legend association; alternatively, an element instance
      * may be given
      */
    oLegend: typings.openui5.sapUiUnifiedCalendarLegendMod.default
    ): this.type = js.native
    
    /**
      * @SINCE 1.97
      *
      * Sets a new value for property {@link #getMultipleAppointmentsSelection multipleAppointmentsSelection}.
      *
      * Determines whether the selection of multiple appointments is enabled.
      *
      * Note: selection of multiple appointments is possible using CTRL key regardless of the value of this property.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMultipleAppointmentsSelection(): this.type = js.native
    def setMultipleAppointmentsSelection(
      /**
      * New value for property `multipleAppointmentsSelection`
      */
    bMultipleAppointmentsSelection: Boolean
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getNonWorkingDays nonWorkingDays}.
      *
      * If set, the provided weekdays are displayed as non-working days. Valid values inside the array are 0
      * to 6. (Other values will just be ignored.)
      *
      * If not set, the weekend defined in the locale settings is displayed as non-working days.
      *
      * **Note:** The non working days are only visualized if `intervalType` is set to day.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setNonWorkingDays(): this.type = js.native
    def setNonWorkingDays(/**
      * New value for property `nonWorkingDays`
      */
    sNonWorkingDays: js.Array[int]): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getNonWorkingHours nonWorkingHours}.
      *
      * If set, the provided hours are displayed as non-working hours. Valid values inside the array are 0 to
      * 23. (Other values will just be ignored.)
      *
      * **Note:** The non working hours are only visualized if `intervalType` is set to hour.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setNonWorkingHours(): this.type = js.native
    def setNonWorkingHours(/**
      * New value for property `nonWorkingHours`
      */
    sNonWorkingHours: js.Array[int]): this.type = js.native
    
    /**
      * @SINCE 1.38.0
      *
      * Sets a new value for property {@link #getShowEmptyIntervalHeaders showEmptyIntervalHeaders}.
      *
      * If set, interval headers are shown even if no `intervalHeaders` are assigned to the visible time frame.
      *
      * If not set, no interval headers are shown if no `intervalHeaders` are assigned.
      *
      * **Note:** This property is only used if `showIntervalHeaders` is set to true.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowEmptyIntervalHeaders(): this.type = js.native
    def setShowEmptyIntervalHeaders(/**
      * New value for property `showEmptyIntervalHeaders`
      */
    bShowEmptyIntervalHeaders: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowIntervalHeaders showIntervalHeaders}.
      *
      * If set, interval headers are shown like specified in `showEmptyIntervalHeaders`.
      *
      * If not set, no interval headers are shown even if `intervalHeaders` are assigned.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowIntervalHeaders(): this.type = js.native
    def setShowIntervalHeaders(/**
      * New value for property `showIntervalHeaders`
      */
    bShowIntervalHeaders: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowSubIntervals showSubIntervals}.
      *
      * If set, subintervals are shown.
      *
      * If the interval type is `Hour`, quarter hours are shown.
      *
      * If the interval type is `Day`, hours are shown.
      *
      * If the interval type is `Month`, days are shown.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowSubIntervals(): this.type = js.native
    def setShowSubIntervals(/**
      * New value for property `showSubIntervals`
      */
    bShowSubIntervals: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getStartDate startDate}.
      *
      * Start date, as JavaScript Date object, of the row. As default, the current date is used.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setStartDate(/**
      * New value for property `startDate`
      */
    oStartDate: js.Object): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getUpdateCurrentTime updateCurrentTime}.
      *
      * If set the `CalendarRow` triggers a periodic update to visualize the current time.
      *
      * If a lot of `CalendarRow` controls are used in one container control (like `PlanningCalendar`) the periodic
      * update should be triggered only by this container control. Then the container control should call `updateCurrentTimeVisualization`
      * of the `CalendarRow` to update the visualization.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setUpdateCurrentTime(): this.type = js.native
    def setUpdateCurrentTime(/**
      * New value for property `updateCurrentTime`
      */
    bUpdateCurrentTime: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * Width of the row
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWidth(): this.type = js.native
    def setWidth(/**
      * New value for property `width`
      */
    sWidth: CSSSize): this.type = js.native
    
    /**
      * If the current time is in the visible output of the `CalendarRow`, the indicator for the current time
      * must be positioned.
      *
      * For this, each `CalendarRow` can trigger a timer. But if multiple `CalendarRow`s are used in one container
      * (e.G. `PlanningCalendar`), it is better if the container triggers the interval once and then calls this
      * function of each `CalendarRow`.
      *
      * @returns `this` to allow method chaining
      */
    def updateCurrentTimeVisualization(): this.type = js.native
  }
  
  trait CalendarRowSettings
    extends StObject
       with ControlSettings {
    
    /**
      * @SINCE 1.81.0
      *
      * Defines the height of the CalendarAppoinment
      */
    var appointmentHeight: js.UndefOr[
        CalendarAppointmentHeight | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarAppointmentHeight * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.81.0
      * @EXPERIMENTAL (since 1.81.0)
      *
      * Defines rounding of the width of CalendarAppoinment **Note:** This property is applied, when
      * the calendar interval type is day and the view shows more than 20 days
      */
    var appointmentRoundWidth: js.UndefOr[
        CalendarAppointmentRoundWidth | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarAppointmentRoundWidth * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Appointments to be displayed in the row. Appointments outside the visible time frame are not rendered.
      *
      * **Note:** For performance reasons, only appointments in the visible time range or nearby should be assigned.
      */
    var appointments: js.UndefOr[
        js.Array[typings.openui5.sapUiUnifiedCalendarAppointmentMod.default] | typings.openui5.sapUiUnifiedCalendarAppointmentMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.38.0
      * @deprecated (since 1.81) - Please use the `appointmentHeight` with value "Automatic" property instead.
      *
      * If set the appointments without text (only title) are rendered with a smaller height.
      *
      * **Note:** On phone devices this property is ignored, appointments are always rendered in full height
      * to allow touching.
      */
    var appointmentsReducedHeight: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.40.0
      *
      * Defines the visualization of the `CalendarAppoinment`
      *
      * **Note:** The real visualization depends on the used theme.
      */
    var appointmentsVisualization: js.UndefOr[
        CalendarAppointmentVisualization | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarAppointmentVisualization * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Association to controls / IDs which label this control (see WAI-ARIA attribute aria-labelledby).
      *
      * **Note** These labels are also assigned to the appointments.
      */
    var ariaLabelledBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * If set, the `CalendarRow` checks for resize by itself.
      *
      * If a lot of `CalendarRow` controls are used in one container control (like `PlanningCalendar`). the resize
      * checks should be done only by this container control. Then the container control should call `handleResize`
      * of the `CalendarRow` if a resize happens.
      */
    var checkResize: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the mode in which the overlapping appointments are displayed.
      *
      * **Note:** This property takes effect, only if the `intervalType` of the current calendar view is set
      * to `sap.ui.unified.CalendarIntervalType.Month`. On phone devices this property is ignored, and the default
      * value is applied.
      */
    var groupAppointmentsMode: js.UndefOr[
        GroupAppointmentsMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GroupAppointmentsMode * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Height of the row
      */
    var height: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Appointments to be displayed in the top of the intervals. The `intervalHeaders` are used to visualize
      * public holidays and similar things.
      *
      * Appointments outside the visible time frame are not rendered.
      *
      * The `intervalHeaders` always fill whole intervals. If they are shorter than one interval, they are not
      * displayed.
      *
      * **Note:** For performance reasons, only appointments in the visible time range or nearby should be assigned.
      */
    var intervalHeaders: js.UndefOr[
        js.Array[typings.openui5.sapUiUnifiedCalendarAppointmentMod.default] | typings.openui5.sapUiUnifiedCalendarAppointmentMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.38.0
      *
      * Fired if an interval was selected
      */
    var intervalSelect: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Number of interval type units merged. It's used when presenting Relative View in sap.m.PlanningCalendar.
      * Note: If the value is more than 1, the NonWorkingDays type is not presented.
      */
    var intervalSize: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Type of the intervals of the row. The default is one hour.
      */
    var intervalType: js.UndefOr[
        CalendarIntervalType | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Number of displayed intervals. The size of the intervals is defined with `intervalType`
      */
    var intervals: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * The `CalendarRow` should be left while navigating. (Arrow up or arrow down.) The caller should determine
      * the next control to be focused
      */
    var leaveRow: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.40.0
      *
      * Association to the `CalendarLegend` explaining the colors of the `Appointments`.
      *
      * **Note** The legend does not have to be rendered but must exist, and all required types must be assigned.
      */
    var legend: js.UndefOr[typings.openui5.sapUiUnifiedCalendarLegendMod.default | String] = js.undefined
    
    /**
      * @SINCE 1.97
      *
      * Determines whether the selection of multiple appointments is enabled.
      *
      * Note: selection of multiple appointments is possible using CTRL key regardless of the value of this property.
      */
    var multipleAppointmentsSelection: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * If set, the provided weekdays are displayed as non-working days. Valid values inside the array are 0
      * to 6. (Other values will just be ignored.)
      *
      * If not set, the weekend defined in the locale settings is displayed as non-working days.
      *
      * **Note:** The non working days are only visualized if `intervalType` is set to day.
      */
    var nonWorkingDays: js.UndefOr[
        js.Array[int] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * If set, the provided hours are displayed as non-working hours. Valid values inside the array are 0 to
      * 23. (Other values will just be ignored.)
      *
      * **Note:** The non working hours are only visualized if `intervalType` is set to hour.
      */
    var nonWorkingHours: js.UndefOr[
        js.Array[int] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Fired if an appointment was selected
      */
    var select: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.38.0
      *
      * If set, interval headers are shown even if no `intervalHeaders` are assigned to the visible time frame.
      *
      * If not set, no interval headers are shown if no `intervalHeaders` are assigned.
      *
      * **Note:** This property is only used if `showIntervalHeaders` is set to true.
      */
    var showEmptyIntervalHeaders: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * If set, interval headers are shown like specified in `showEmptyIntervalHeaders`.
      *
      * If not set, no interval headers are shown even if `intervalHeaders` are assigned.
      */
    var showIntervalHeaders: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * If set, subintervals are shown.
      *
      * If the interval type is `Hour`, quarter hours are shown.
      *
      * If the interval type is `Day`, hours are shown.
      *
      * If the interval type is `Month`, days are shown.
      */
    var showSubIntervals: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Start date, as JavaScript Date object, of the row. As default, the current date is used.
      */
    var startDate: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * `startDate` was changed while navigating in `CalendarRow`
      */
    var startDateChange: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * If set the `CalendarRow` triggers a periodic update to visualize the current time.
      *
      * If a lot of `CalendarRow` controls are used in one container control (like `PlanningCalendar`) the periodic
      * update should be triggered only by this container control. Then the container control should call `updateCurrentTimeVisualization`
      * of the `CalendarRow` to update the visualization.
      */
    var updateCurrentTime: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Width of the row
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object CalendarRowSettings {
    
    inline def apply(): CalendarRowSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CalendarRowSettings]
    }
    
    extension [Self <: CalendarRowSettings](x: Self) {
      
      inline def setAppointmentHeight(
        value: CalendarAppointmentHeight | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarAppointmentHeight * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "appointmentHeight", value.asInstanceOf[js.Any])
      
      inline def setAppointmentHeightUndefined: Self = StObject.set(x, "appointmentHeight", js.undefined)
      
      inline def setAppointmentRoundWidth(
        value: CalendarAppointmentRoundWidth | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarAppointmentRoundWidth * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "appointmentRoundWidth", value.asInstanceOf[js.Any])
      
      inline def setAppointmentRoundWidthUndefined: Self = StObject.set(x, "appointmentRoundWidth", js.undefined)
      
      inline def setAppointments(
        value: js.Array[typings.openui5.sapUiUnifiedCalendarAppointmentMod.default] | typings.openui5.sapUiUnifiedCalendarAppointmentMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "appointments", value.asInstanceOf[js.Any])
      
      inline def setAppointmentsReducedHeight(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "appointmentsReducedHeight", value.asInstanceOf[js.Any])
      
      inline def setAppointmentsReducedHeightUndefined: Self = StObject.set(x, "appointmentsReducedHeight", js.undefined)
      
      inline def setAppointmentsUndefined: Self = StObject.set(x, "appointments", js.undefined)
      
      inline def setAppointmentsVarargs(value: typings.openui5.sapUiUnifiedCalendarAppointmentMod.default*): Self = StObject.set(x, "appointments", js.Array(value*))
      
      inline def setAppointmentsVisualization(
        value: CalendarAppointmentVisualization | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarAppointmentVisualization * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "appointmentsVisualization", value.asInstanceOf[js.Any])
      
      inline def setAppointmentsVisualizationUndefined: Self = StObject.set(x, "appointmentsVisualization", js.undefined)
      
      inline def setAriaLabelledBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAriaLabelledByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaLabelledBy", js.Array(value*))
      
      inline def setCheckResize(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "checkResize", value.asInstanceOf[js.Any])
      
      inline def setCheckResizeUndefined: Self = StObject.set(x, "checkResize", js.undefined)
      
      inline def setGroupAppointmentsMode(
        value: GroupAppointmentsMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GroupAppointmentsMode * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "groupAppointmentsMode", value.asInstanceOf[js.Any])
      
      inline def setGroupAppointmentsModeUndefined: Self = StObject.set(x, "groupAppointmentsMode", js.undefined)
      
      inline def setHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setIntervalHeaders(
        value: js.Array[typings.openui5.sapUiUnifiedCalendarAppointmentMod.default] | typings.openui5.sapUiUnifiedCalendarAppointmentMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "intervalHeaders", value.asInstanceOf[js.Any])
      
      inline def setIntervalHeadersUndefined: Self = StObject.set(x, "intervalHeaders", js.undefined)
      
      inline def setIntervalHeadersVarargs(value: typings.openui5.sapUiUnifiedCalendarAppointmentMod.default*): Self = StObject.set(x, "intervalHeaders", js.Array(value*))
      
      inline def setIntervalSelect(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "intervalSelect", js.Any.fromFunction1(value))
      
      inline def setIntervalSelectUndefined: Self = StObject.set(x, "intervalSelect", js.undefined)
      
      inline def setIntervalSize(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "intervalSize", value.asInstanceOf[js.Any])
      
      inline def setIntervalSizeUndefined: Self = StObject.set(x, "intervalSize", js.undefined)
      
      inline def setIntervalType(
        value: CalendarIntervalType | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "intervalType", value.asInstanceOf[js.Any])
      
      inline def setIntervalTypeUndefined: Self = StObject.set(x, "intervalType", js.undefined)
      
      inline def setIntervals(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "intervals", value.asInstanceOf[js.Any])
      
      inline def setIntervalsUndefined: Self = StObject.set(x, "intervals", js.undefined)
      
      inline def setLeaveRow(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "leaveRow", js.Any.fromFunction1(value))
      
      inline def setLeaveRowUndefined: Self = StObject.set(x, "leaveRow", js.undefined)
      
      inline def setLegend(value: typings.openui5.sapUiUnifiedCalendarLegendMod.default | String): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
      
      inline def setMultipleAppointmentsSelection(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "multipleAppointmentsSelection", value.asInstanceOf[js.Any])
      
      inline def setMultipleAppointmentsSelectionUndefined: Self = StObject.set(x, "multipleAppointmentsSelection", js.undefined)
      
      inline def setNonWorkingDays(value: js.Array[int] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "nonWorkingDays", value.asInstanceOf[js.Any])
      
      inline def setNonWorkingDaysUndefined: Self = StObject.set(x, "nonWorkingDays", js.undefined)
      
      inline def setNonWorkingDaysVarargs(value: int*): Self = StObject.set(x, "nonWorkingDays", js.Array(value*))
      
      inline def setNonWorkingHours(value: js.Array[int] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "nonWorkingHours", value.asInstanceOf[js.Any])
      
      inline def setNonWorkingHoursUndefined: Self = StObject.set(x, "nonWorkingHours", js.undefined)
      
      inline def setNonWorkingHoursVarargs(value: int*): Self = StObject.set(x, "nonWorkingHours", js.Array(value*))
      
      inline def setSelect(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      inline def setShowEmptyIntervalHeaders(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showEmptyIntervalHeaders", value.asInstanceOf[js.Any])
      
      inline def setShowEmptyIntervalHeadersUndefined: Self = StObject.set(x, "showEmptyIntervalHeaders", js.undefined)
      
      inline def setShowIntervalHeaders(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showIntervalHeaders", value.asInstanceOf[js.Any])
      
      inline def setShowIntervalHeadersUndefined: Self = StObject.set(x, "showIntervalHeaders", js.undefined)
      
      inline def setShowSubIntervals(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showSubIntervals", value.asInstanceOf[js.Any])
      
      inline def setShowSubIntervalsUndefined: Self = StObject.set(x, "showSubIntervals", js.undefined)
      
      inline def setStartDate(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setStartDateChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "startDateChange", js.Any.fromFunction1(value))
      
      inline def setStartDateChangeUndefined: Self = StObject.set(x, "startDateChange", js.undefined)
      
      inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
      
      inline def setUpdateCurrentTime(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "updateCurrentTime", value.asInstanceOf[js.Any])
      
      inline def setUpdateCurrentTimeUndefined: Self = StObject.set(x, "updateCurrentTime", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
