package typings.openui5

import typings.openui5.anon.AppointmentCalendarRow
import typings.openui5.anon.AppointmentEndDate
import typings.openui5.anon.CalendarRow
import typings.openui5.anon.Copy
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMPlanningCalendarRowMod {
  
  @JSImport("sap/m/PlanningCalendarRow", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `PlanningCalendarRow`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends PlanningCalendarRow {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: PlanningCalendarRowSettings) = this()
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
    mSettings: PlanningCalendarRowSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: PlanningCalendarRowSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/PlanningCalendarRow", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.PlanningCalendarRow with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Element.extend}.
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
    oClassInfo: ClassInfo[T, PlanningCalendarRow]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, PlanningCalendarRow],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.PlanningCalendarRow.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait PlanningCalendarRow
    extends typings.openui5.sapUiCoreElementMod.default {
    
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
    
    /**
      * @SINCE 1.67
      * @EXPERIMENTAL (since 1.67) - providing only limited functionality. Also, the API might be changed in
      * the future.
      *
      * Adds some headerContent to the aggregation {@link #getHeaderContent headerContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addHeaderContent(
      /**
      * The headerContent to add; if empty, nothing is inserted
      */
    oHeaderContent: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
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
      * @SINCE 1.56
      *
      * Adds some specialDate to the aggregation {@link #getSpecialDates specialDates}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addSpecialDate(
      /**
      * The specialDate to add; if empty, nothing is inserted
      */
    oSpecialDate: typings.openui5.sapUiUnifiedDateTypeRangeMod.default
    ): this.type = js.native
    
    /**
      * @SINCE 1.56
      *
      * Attaches event handler `fnFunction` to the {@link #event:appointmentCreate appointmentCreate} event of
      * this `sap.m.PlanningCalendarRow`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.PlanningCalendarRow` itself.
      *
      * Fired if an appointment is created.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAppointmentCreate(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachAppointmentCreate(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.PlanningCalendarRow` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.56
      *
      * Attaches event handler `fnFunction` to the {@link #event:appointmentCreate appointmentCreate} event of
      * this `sap.m.PlanningCalendarRow`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.PlanningCalendarRow` itself.
      *
      * Fired if an appointment is created.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAppointmentCreate(
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
    def attachAppointmentCreate(
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
      * Context object to call the event handler with. Defaults to this `sap.m.PlanningCalendarRow` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.56
      *
      * Attaches event handler `fnFunction` to the {@link #event:appointmentDragEnter appointmentDragEnter} event
      * of this `sap.m.PlanningCalendarRow`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.PlanningCalendarRow` itself.
      *
      * Fired if an appointment is dropped.
      *
      * When this event handler is attached, the default behavior of the `enableAppointmentsDragAndDrop` property
      * to move appointments only within their original calendar row is no longer valid. You can move the appointment
      * around all rows for which `enableAppointmentsDragAndDrop` is set to true. In this case, the drop target
      * area is indicated by a placeholder. In the event handler you can call the `preventDefault` method of
      * the event to prevent this default behavior. In this case, the placeholder will no longer be available
      * and it will not be possible to drop the appointment in the row.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAppointmentDragEnter(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachAppointmentDragEnter(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.PlanningCalendarRow` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.56
      *
      * Attaches event handler `fnFunction` to the {@link #event:appointmentDragEnter appointmentDragEnter} event
      * of this `sap.m.PlanningCalendarRow`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.PlanningCalendarRow` itself.
      *
      * Fired if an appointment is dropped.
      *
      * When this event handler is attached, the default behavior of the `enableAppointmentsDragAndDrop` property
      * to move appointments only within their original calendar row is no longer valid. You can move the appointment
      * around all rows for which `enableAppointmentsDragAndDrop` is set to true. In this case, the drop target
      * area is indicated by a placeholder. In the event handler you can call the `preventDefault` method of
      * the event to prevent this default behavior. In this case, the placeholder will no longer be available
      * and it will not be possible to drop the appointment in the row.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAppointmentDragEnter(
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
    def attachAppointmentDragEnter(
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
      * Context object to call the event handler with. Defaults to this `sap.m.PlanningCalendarRow` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.54
      *
      * Attaches event handler `fnFunction` to the {@link #event:appointmentDrop appointmentDrop} event of this
      * `sap.m.PlanningCalendarRow`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.PlanningCalendarRow` itself.
      *
      * Fired if an appointment is dropped.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAppointmentDrop(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachAppointmentDrop(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.PlanningCalendarRow` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.54
      *
      * Attaches event handler `fnFunction` to the {@link #event:appointmentDrop appointmentDrop} event of this
      * `sap.m.PlanningCalendarRow`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.PlanningCalendarRow` itself.
      *
      * Fired if an appointment is dropped.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAppointmentDrop(
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
    def attachAppointmentDrop(
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
      * Context object to call the event handler with. Defaults to this `sap.m.PlanningCalendarRow` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.56
      *
      * Attaches event handler `fnFunction` to the {@link #event:appointmentResize appointmentResize} event of
      * this `sap.m.PlanningCalendarRow`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.PlanningCalendarRow` itself.
      *
      * Fired if an appointment is resized.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAppointmentResize(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachAppointmentResize(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.PlanningCalendarRow` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.56
      *
      * Attaches event handler `fnFunction` to the {@link #event:appointmentResize appointmentResize} event of
      * this `sap.m.PlanningCalendarRow`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.PlanningCalendarRow` itself.
      *
      * Fired if an appointment is resized.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAppointmentResize(
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
    def attachAppointmentResize(
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
      * Context object to call the event handler with. Defaults to this `sap.m.PlanningCalendarRow` itself
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
      * @SINCE 1.67
      * @EXPERIMENTAL (since 1.67) - providing only limited functionality. Also, the API might be changed in
      * the future.
      *
      * Destroys all the headerContent in the aggregation {@link #getHeaderContent headerContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyHeaderContent(): this.type = js.native
    
    /**
      * Destroys all the intervalHeaders in the aggregation {@link #getIntervalHeaders intervalHeaders}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyIntervalHeaders(): this.type = js.native
    
    /**
      * @SINCE 1.56
      *
      * Destroys all the specialDates in the aggregation {@link #getSpecialDates specialDates}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroySpecialDates(): this.type = js.native
    
    /**
      * @SINCE 1.56
      *
      * Detaches event handler `fnFunction` from the {@link #event:appointmentCreate appointmentCreate} event
      * of this `sap.m.PlanningCalendarRow`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachAppointmentCreate(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachAppointmentCreate(
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
      * @SINCE 1.56
      *
      * Detaches event handler `fnFunction` from the {@link #event:appointmentDragEnter appointmentDragEnter}
      * event of this `sap.m.PlanningCalendarRow`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachAppointmentDragEnter(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachAppointmentDragEnter(
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
      * @SINCE 1.54
      *
      * Detaches event handler `fnFunction` from the {@link #event:appointmentDrop appointmentDrop} event of
      * this `sap.m.PlanningCalendarRow`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachAppointmentDrop(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachAppointmentDrop(
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
      * @SINCE 1.56
      *
      * Detaches event handler `fnFunction` from the {@link #event:appointmentResize appointmentResize} event
      * of this `sap.m.PlanningCalendarRow`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachAppointmentResize(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachAppointmentResize(
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
      * @SINCE 1.56
      *
      * Fires event {@link #event:appointmentCreate appointmentCreate} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireAppointmentCreate(): this.type = js.native
    def fireAppointmentCreate(/**
      * Parameters to pass along with the event
      */
    mParameters: CalendarRow): this.type = js.native
    
    /**
      * @SINCE 1.56
      *
      * Fires event {@link #event:appointmentDragEnter appointmentDragEnter} to attached listeners.
      *
      * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
      * event object. The return value of this method indicates whether the default action should be executed.
      *
      * @returns Whether or not to prevent the default action
      */
    def fireAppointmentDragEnter(): Boolean = js.native
    def fireAppointmentDragEnter(/**
      * Parameters to pass along with the event
      */
    mParameters: AppointmentCalendarRow): Boolean = js.native
    
    /**
      * @SINCE 1.54
      *
      * Fires event {@link #event:appointmentDrop appointmentDrop} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireAppointmentDrop(): this.type = js.native
    def fireAppointmentDrop(/**
      * Parameters to pass along with the event
      */
    mParameters: Copy): this.type = js.native
    
    /**
      * @SINCE 1.56
      *
      * Fires event {@link #event:appointmentResize appointmentResize} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireAppointmentResize(): this.type = js.native
    def fireAppointmentResize(/**
      * Parameters to pass along with the event
      */
    mParameters: AppointmentEndDate): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getAppointments appointments}.
      *
      * The appointments to be displayed in the row. Appointments that outside the visible time frame are not
      * rendered.
      *
      * **Note:** For performance reasons, only appointments in the visible time range or nearby should be assigned.
      */
    def getAppointments(): js.Array[typings.openui5.sapUiUnifiedCalendarAppointmentMod.default] = js.native
    
    /**
      * @SINCE 1.56
      *
      * Gets current value of property {@link #getEnableAppointmentsCreate enableAppointmentsCreate}.
      *
      * Determines whether the appointments can be created by dragging on empty cells.
      *
      * See {@link #property:enableAppointmentsResize enableAppointmentsResize} for the specific points for events
      * snapping
      *
      * **Notes:** In "One month" view, the appointments cannot be created on small screen (as there they are
      * displayed as a list below the dates).
      *
      * Default value is `false`.
      *
      * @returns Value of property `enableAppointmentsCreate`
      */
    def getEnableAppointmentsCreate(): Boolean = js.native
    
    /**
      * @SINCE 1.54
      *
      * Gets current value of property {@link #getEnableAppointmentsDragAndDrop enableAppointmentsDragAndDrop}.
      *
      * Determines whether the appointments in the row are draggable.
      *
      * The drag and drop interaction is visualized by a placeholder highlighting the area where the appointment
      * can be dropped by the user.
      *
      * By default, appointments can be dragged only within their original `PlanningCalendarRow`. When `enableAppointmentsDragAndDrop`
      * is set to true, attaching the {@link #event:appointmentDragEnter appointmentDragEnter} event can change
      * the default behavior and allow appointments to be dragged between calendar rows.
      *
      * Specifics based on the intervals (hours, days or months) displayed in the `PlanningCalendar` views:
      *
      * Hours:
      *  For views where the displayed intervals are hours, the placeholder snaps on every interval of 30 minutes.
      * After the appointment is dropped, the {@link #event:appointmentDrop appointmentDrop} event is fired,
      * containing the new start and end JavaScript date objects.
      *  For example, an appointment with start date "Nov 13 2017 12:17:00" and end date "Nov 13 2017 12:45:30"
      * lasts for 27 minutes and 30 seconds. After dragging and dropping to a new time, the possible new start
      * date has time that is either "hh:00:00" or "hh:30:00" because of the placeholder that can snap on every
      * 30 minutes. The new end date is calculated to be 27 minutes and 30 seconds later and would be either
      * "hh:27:30" or "hh:57:30".
      *
      * Days:
      *  For views where intervals are days, the placeholder highlights the whole day and after the appointment
      * is dropped the {@link #event:appointmentDrop appointmentDrop} event is fired. The event contains the
      * new start and end JavaScript date objects with changed date but the original time (hh:mm:ss) is preserved.
      *
      * Months:
      *  For views where intervals are months, the placeholder highlights the whole month and after the appointment
      * is dropped the {@link #event:appointmentDrop appointmentDrop} event is fired. The event contains the
      * new start and end JavaScript date objects with changed month but the original date and time is preserved.
      *
      * **Note:** In "One month" view, the appointments are not draggable on small screen (as there they are
      * displayed as a list below the dates). Group appointments are also not draggable.
      *
      * Default value is `false`.
      *
      * @returns Value of property `enableAppointmentsDragAndDrop`
      */
    def getEnableAppointmentsDragAndDrop(): Boolean = js.native
    
    /**
      * @SINCE 1.56
      *
      * Gets current value of property {@link #getEnableAppointmentsResize enableAppointmentsResize}.
      *
      * Determines whether the appointments in the row are resizable.
      *
      * The resize interaction is visualized by making the appointment transparent.
      *
      * Specifics based on the intervals (hours, days or months) displayed in the `PlanningCalendar` views:
      *
      * Hours: For views where the displayed intervals are hours, the appointment snaps on every interval of
      * 30 minutes. After the resize is finished, the {@link #event:appointmentResize appointmentResize} event
      * is fired, containing the new start and end JavaScript date objects.
      *
      * Days: For views where intervals are days, the appointment snaps to the end of the day. After the resize
      * is finished, the {@link #event:appointmentResize appointmentResize} event is fired, containing the new
      * start and end JavaScript date objects. The `endDate` time is changed to 00:00:00
      *
      * Months: For views where intervals are months, the appointment snaps to the end of the month. The {@link
      * #event:appointmentResize appointmentResize} event is fired, containing the new start and end JavaScript
      * date objects. The `endDate` is set to the 00:00:00 and first day of the following month.
      *
      * **Notes:** In "One month" view, the appointments are not resizable on small screen (as there they are
      * displayed as a list below the dates). Group appointments are also not resizable
      *
      * Default value is `false`.
      *
      * @returns Value of property `enableAppointmentsResize`
      */
    def getEnableAppointmentsResize(): Boolean = js.native
    
    /**
      * @SINCE 1.67
      * @EXPERIMENTAL (since 1.67) - providing only limited functionality. Also, the API might be changed in
      * the future.
      *
      * Gets content of aggregation {@link #getHeaderContent headerContent}.
      *
      * Holds the header content of the row.
      *
      * **Note:** If the `headerContent` aggregation is added, then the set icon, description, title and tooltip
      * are ignored.
      */
    def getHeaderContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getIcon icon}.
      *
      * Specifies the URI of an image or an icon registered in `sap.ui.core.IconPool`.
      *
      * @returns Value of property `icon`
      */
    def getIcon(): URI = js.native
    
    /**
      * Gets content of aggregation {@link #getIntervalHeaders intervalHeaders}.
      *
      * The appointments to be displayed at the top of the intervals (for example, for public holidays). Appointments
      * outside the visible time frame are not rendered.
      *
      * Keep in mind that the `intervalHeaders` should always fill whole intervals. If they are shorter or longer
      * than one interval, they are not displayed.
      *
      * **Note:** For performance reasons, only appointments in the visible time range or nearby should be assigned.
      */
    def getIntervalHeaders(): js.Array[typings.openui5.sapUiUnifiedCalendarAppointmentMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getKey key}.
      *
      * Defines the identifier of the row.
      *
      * @returns Value of property `key`
      */
    def getKey(): String = js.native
    
    /**
      * Gets current value of property {@link #getNoAppointmentsText noAppointmentsText}.
      *
      * Defines the text that is displayed when no {@link sap.ui.unified.CalendarAppointment CalendarAppointments}
      * are assigned.
      *
      * @returns Value of property `noAppointmentsText`
      */
    def getNoAppointmentsText(): String = js.native
    
    /**
      * Gets current value of property {@link #getNonWorkingDays nonWorkingDays}.
      *
      * Determines whether the provided weekdays are displayed as non-working days. Valid values inside the array
      * are from 0 to 6 (other values are ignored). If not set, the weekend defined in the locale settings is
      * displayed as non-working days.
      *
      * **Note:** The non-working days are visualized if the `intervalType` property of the {@link sap.m.PlanningCalendarView}
      * is set to `Day`.
      *
      * @returns Value of property `nonWorkingDays`
      */
    def getNonWorkingDays(): js.Array[int] = js.native
    
    /**
      * Gets current value of property {@link #getNonWorkingHours nonWorkingHours}.
      *
      * Determines whether the provided hours are displayed as non-working hours. Valid values inside the array
      * are from 0 to 23 (other values are ignored).
      *
      * **Note:** The non-working hours are visualized if `intervalType` property of the {@link sap.m.PlanningCalendarView}
      * is set to `Hour`.
      *
      * @returns Value of property `nonWorkingHours`
      */
    def getNonWorkingHours(): js.Array[int] = js.native
    
    /**
      * Gets current value of property {@link #getSelected selected}.
      *
      * Defines the selected state of the `PlanningCalendarRow`.
      *
      * **Note:** Binding the `selected` property in single selection modes may cause unwanted results if you
      * have more than one selected row in your binding.
      *
      * Default value is `false`.
      *
      * @returns Value of property `selected`
      */
    def getSelected(): Boolean = js.native
    
    /**
      * @SINCE 1.56
      *
      * Gets content of aggregation {@link #getSpecialDates specialDates}.
      *
      * Holds the special dates in the context of a row. A single date or a date range can be set.
      *
      * **Note** Only date or date ranges of type `sap.ui.unified.CalendarDayType.NonWorking` will be visualized
      * in the `PlanningCalendarRow`. If the aggregation is set as another type, the date or date range will
      * be ignored and will not be displayed in the control.
      */
    def getSpecialDates(): js.Array[typings.openui5.sapUiUnifiedDateTypeRangeMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getText text}.
      *
      * Defines the text of the header (for example, the department of the person).
      *
      * @returns Value of property `text`
      */
    def getText(): String = js.native
    
    /**
      * Gets current value of property {@link #getTitle title}.
      *
      * Defines the title of the header (for example, the name of the person).
      *
      * @returns Value of property `title`
      */
    def getTitle(): String = js.native
    
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
      * @SINCE 1.67
      * @EXPERIMENTAL (since 1.67) - providing only limited functionality. Also, the API might be changed in
      * the future.
      *
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getHeaderContent headerContent}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfHeaderContent(
      /**
      * The headerContent whose index is looked for
      */
    oHeaderContent: typings.openui5.sapUiCoreControlMod.default
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
      * @SINCE 1.56
      *
      * Checks for the provided `sap.ui.unified.DateTypeRange` in the aggregation {@link #getSpecialDates specialDates}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfSpecialDate(
      /**
      * The specialDate whose index is looked for
      */
    oSpecialDate: typings.openui5.sapUiUnifiedDateTypeRangeMod.default
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
      * @SINCE 1.67
      * @EXPERIMENTAL (since 1.67) - providing only limited functionality. Also, the API might be changed in
      * the future.
      *
      * Inserts a headerContent into the aggregation {@link #getHeaderContent headerContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertHeaderContent(
      /**
      * The headerContent to insert; if empty, nothing is inserted
      */
    oHeaderContent: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the headerContent should be inserted at; for a negative value of `iIndex`, the headerContent
      * is inserted at position 0; for a value greater than the current size of the aggregation, the headerContent
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
      * @SINCE 1.56
      *
      * Inserts a specialDate into the aggregation {@link #getSpecialDates specialDates}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertSpecialDate(
      /**
      * The specialDate to insert; if empty, nothing is inserted
      */
    oSpecialDate: typings.openui5.sapUiUnifiedDateTypeRangeMod.default,
      /**
      * The `0`-based index the specialDate should be inserted at; for a negative value of `iIndex`, the specialDate
      * is inserted at position 0; for a value greater than the current size of the aggregation, the specialDate
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
      * @SINCE 1.67
      * @EXPERIMENTAL (since 1.67) - providing only limited functionality. Also, the API might be changed in
      * the future.
      *
      * Removes all the controls from the aggregation {@link #getHeaderContent headerContent}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllHeaderContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getIntervalHeaders intervalHeaders}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllIntervalHeaders(): js.Array[typings.openui5.sapUiUnifiedCalendarAppointmentMod.default] = js.native
    
    /**
      * @SINCE 1.56
      *
      * Removes all the controls from the aggregation {@link #getSpecialDates specialDates}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllSpecialDates(): js.Array[typings.openui5.sapUiUnifiedDateTypeRangeMod.default] = js.native
    
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
    
    def removeHeaderContent(/**
      * The headerContent to remove or its index or id
      */
    vHeaderContent: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * @SINCE 1.67
      * @EXPERIMENTAL (since 1.67) - providing only limited functionality. Also, the API might be changed in
      * the future.
      *
      * Removes a headerContent from the aggregation {@link #getHeaderContent headerContent}.
      *
      * @returns The removed headerContent or `null`
      */
    def removeHeaderContent(/**
      * The headerContent to remove or its index or id
      */
    vHeaderContent: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeHeaderContent(
      /**
      * The headerContent to remove or its index or id
      */
    vHeaderContent: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
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
    
    def removeSpecialDate(/**
      * The specialDate to remove or its index or id
      */
    vSpecialDate: String): typings.openui5.sapUiUnifiedDateTypeRangeMod.default | Null = js.native
    /**
      * @SINCE 1.56
      *
      * Removes a specialDate from the aggregation {@link #getSpecialDates specialDates}.
      *
      * @returns The removed specialDate or `null`
      */
    def removeSpecialDate(/**
      * The specialDate to remove or its index or id
      */
    vSpecialDate: int): typings.openui5.sapUiUnifiedDateTypeRangeMod.default | Null = js.native
    def removeSpecialDate(
      /**
      * The specialDate to remove or its index or id
      */
    vSpecialDate: typings.openui5.sapUiUnifiedDateTypeRangeMod.default
    ): typings.openui5.sapUiUnifiedDateTypeRangeMod.default | Null = js.native
    
    /**
      * @SINCE 1.56
      *
      * Sets a new value for property {@link #getEnableAppointmentsCreate enableAppointmentsCreate}.
      *
      * Determines whether the appointments can be created by dragging on empty cells.
      *
      * See {@link #property:enableAppointmentsResize enableAppointmentsResize} for the specific points for events
      * snapping
      *
      * **Notes:** In "One month" view, the appointments cannot be created on small screen (as there they are
      * displayed as a list below the dates).
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnableAppointmentsCreate(): this.type = js.native
    def setEnableAppointmentsCreate(/**
      * New value for property `enableAppointmentsCreate`
      */
    bEnableAppointmentsCreate: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.54
      *
      * Sets a new value for property {@link #getEnableAppointmentsDragAndDrop enableAppointmentsDragAndDrop}.
      *
      * Determines whether the appointments in the row are draggable.
      *
      * The drag and drop interaction is visualized by a placeholder highlighting the area where the appointment
      * can be dropped by the user.
      *
      * By default, appointments can be dragged only within their original `PlanningCalendarRow`. When `enableAppointmentsDragAndDrop`
      * is set to true, attaching the {@link #event:appointmentDragEnter appointmentDragEnter} event can change
      * the default behavior and allow appointments to be dragged between calendar rows.
      *
      * Specifics based on the intervals (hours, days or months) displayed in the `PlanningCalendar` views:
      *
      * Hours:
      *  For views where the displayed intervals are hours, the placeholder snaps on every interval of 30 minutes.
      * After the appointment is dropped, the {@link #event:appointmentDrop appointmentDrop} event is fired,
      * containing the new start and end JavaScript date objects.
      *  For example, an appointment with start date "Nov 13 2017 12:17:00" and end date "Nov 13 2017 12:45:30"
      * lasts for 27 minutes and 30 seconds. After dragging and dropping to a new time, the possible new start
      * date has time that is either "hh:00:00" or "hh:30:00" because of the placeholder that can snap on every
      * 30 minutes. The new end date is calculated to be 27 minutes and 30 seconds later and would be either
      * "hh:27:30" or "hh:57:30".
      *
      * Days:
      *  For views where intervals are days, the placeholder highlights the whole day and after the appointment
      * is dropped the {@link #event:appointmentDrop appointmentDrop} event is fired. The event contains the
      * new start and end JavaScript date objects with changed date but the original time (hh:mm:ss) is preserved.
      *
      * Months:
      *  For views where intervals are months, the placeholder highlights the whole month and after the appointment
      * is dropped the {@link #event:appointmentDrop appointmentDrop} event is fired. The event contains the
      * new start and end JavaScript date objects with changed month but the original date and time is preserved.
      *
      * **Note:** In "One month" view, the appointments are not draggable on small screen (as there they are
      * displayed as a list below the dates). Group appointments are also not draggable.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnableAppointmentsDragAndDrop(): this.type = js.native
    def setEnableAppointmentsDragAndDrop(
      /**
      * New value for property `enableAppointmentsDragAndDrop`
      */
    bEnableAppointmentsDragAndDrop: Boolean
    ): this.type = js.native
    
    /**
      * @SINCE 1.56
      *
      * Sets a new value for property {@link #getEnableAppointmentsResize enableAppointmentsResize}.
      *
      * Determines whether the appointments in the row are resizable.
      *
      * The resize interaction is visualized by making the appointment transparent.
      *
      * Specifics based on the intervals (hours, days or months) displayed in the `PlanningCalendar` views:
      *
      * Hours: For views where the displayed intervals are hours, the appointment snaps on every interval of
      * 30 minutes. After the resize is finished, the {@link #event:appointmentResize appointmentResize} event
      * is fired, containing the new start and end JavaScript date objects.
      *
      * Days: For views where intervals are days, the appointment snaps to the end of the day. After the resize
      * is finished, the {@link #event:appointmentResize appointmentResize} event is fired, containing the new
      * start and end JavaScript date objects. The `endDate` time is changed to 00:00:00
      *
      * Months: For views where intervals are months, the appointment snaps to the end of the month. The {@link
      * #event:appointmentResize appointmentResize} event is fired, containing the new start and end JavaScript
      * date objects. The `endDate` is set to the 00:00:00 and first day of the following month.
      *
      * **Notes:** In "One month" view, the appointments are not resizable on small screen (as there they are
      * displayed as a list below the dates). Group appointments are also not resizable
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnableAppointmentsResize(): this.type = js.native
    def setEnableAppointmentsResize(/**
      * New value for property `enableAppointmentsResize`
      */
    bEnableAppointmentsResize: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIcon icon}.
      *
      * Specifies the URI of an image or an icon registered in `sap.ui.core.IconPool`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIcon(): this.type = js.native
    def setIcon(/**
      * New value for property `icon`
      */
    sIcon: URI): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getKey key}.
      *
      * Defines the identifier of the row.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setKey(): this.type = js.native
    def setKey(/**
      * New value for property `key`
      */
    sKey: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getNoAppointmentsText noAppointmentsText}.
      *
      * Defines the text that is displayed when no {@link sap.ui.unified.CalendarAppointment CalendarAppointments}
      * are assigned.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setNoAppointmentsText(): this.type = js.native
    def setNoAppointmentsText(/**
      * New value for property `noAppointmentsText`
      */
    sNoAppointmentsText: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getNonWorkingDays nonWorkingDays}.
      *
      * Determines whether the provided weekdays are displayed as non-working days. Valid values inside the array
      * are from 0 to 6 (other values are ignored). If not set, the weekend defined in the locale settings is
      * displayed as non-working days.
      *
      * **Note:** The non-working days are visualized if the `intervalType` property of the {@link sap.m.PlanningCalendarView}
      * is set to `Day`.
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
      * Determines whether the provided hours are displayed as non-working hours. Valid values inside the array
      * are from 0 to 23 (other values are ignored).
      *
      * **Note:** The non-working hours are visualized if `intervalType` property of the {@link sap.m.PlanningCalendarView}
      * is set to `Hour`.
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
      * Sets a new value for property {@link #getSelected selected}.
      *
      * Defines the selected state of the `PlanningCalendarRow`.
      *
      * **Note:** Binding the `selected` property in single selection modes may cause unwanted results if you
      * have more than one selected row in your binding.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSelected(): this.type = js.native
    def setSelected(/**
      * New value for property `selected`
      */
    bSelected: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getText text}.
      *
      * Defines the text of the header (for example, the department of the person).
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setText(/**
      * New value for property `text`
      */
    sText: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTitle title}.
      *
      * Defines the title of the header (for example, the name of the person).
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitle(/**
      * New value for property `title`
      */
    sTitle: String): this.type = js.native
  }
  
  trait PlanningCalendarRowSettings
    extends StObject
       with ElementSettings {
    
    /**
      * @SINCE 1.56
      *
      * Fired if an appointment is created.
      */
    var appointmentCreate: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.56
      *
      * Fired if an appointment is dropped.
      *
      * When this event handler is attached, the default behavior of the `enableAppointmentsDragAndDrop` property
      * to move appointments only within their original calendar row is no longer valid. You can move the appointment
      * around all rows for which `enableAppointmentsDragAndDrop` is set to true. In this case, the drop target
      * area is indicated by a placeholder. In the event handler you can call the `preventDefault` method of
      * the event to prevent this default behavior. In this case, the placeholder will no longer be available
      * and it will not be possible to drop the appointment in the row.
      */
    var appointmentDragEnter: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.54
      *
      * Fired if an appointment is dropped.
      */
    var appointmentDrop: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.56
      *
      * Fired if an appointment is resized.
      */
    var appointmentResize: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * The appointments to be displayed in the row. Appointments that outside the visible time frame are not
      * rendered.
      *
      * **Note:** For performance reasons, only appointments in the visible time range or nearby should be assigned.
      */
    var appointments: js.UndefOr[
        js.Array[typings.openui5.sapUiUnifiedCalendarAppointmentMod.default] | typings.openui5.sapUiUnifiedCalendarAppointmentMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.56
      *
      * Determines whether the appointments can be created by dragging on empty cells.
      *
      * See {@link #property:enableAppointmentsResize enableAppointmentsResize} for the specific points for events
      * snapping
      *
      * **Notes:** In "One month" view, the appointments cannot be created on small screen (as there they are
      * displayed as a list below the dates).
      */
    var enableAppointmentsCreate: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.54
      *
      * Determines whether the appointments in the row are draggable.
      *
      * The drag and drop interaction is visualized by a placeholder highlighting the area where the appointment
      * can be dropped by the user.
      *
      * By default, appointments can be dragged only within their original `PlanningCalendarRow`. When `enableAppointmentsDragAndDrop`
      * is set to true, attaching the {@link #event:appointmentDragEnter appointmentDragEnter} event can change
      * the default behavior and allow appointments to be dragged between calendar rows.
      *
      * Specifics based on the intervals (hours, days or months) displayed in the `PlanningCalendar` views:
      *
      * Hours:
      *  For views where the displayed intervals are hours, the placeholder snaps on every interval of 30 minutes.
      * After the appointment is dropped, the {@link #event:appointmentDrop appointmentDrop} event is fired,
      * containing the new start and end JavaScript date objects.
      *  For example, an appointment with start date "Nov 13 2017 12:17:00" and end date "Nov 13 2017 12:45:30"
      * lasts for 27 minutes and 30 seconds. After dragging and dropping to a new time, the possible new start
      * date has time that is either "hh:00:00" or "hh:30:00" because of the placeholder that can snap on every
      * 30 minutes. The new end date is calculated to be 27 minutes and 30 seconds later and would be either
      * "hh:27:30" or "hh:57:30".
      *
      * Days:
      *  For views where intervals are days, the placeholder highlights the whole day and after the appointment
      * is dropped the {@link #event:appointmentDrop appointmentDrop} event is fired. The event contains the
      * new start and end JavaScript date objects with changed date but the original time (hh:mm:ss) is preserved.
      *
      * Months:
      *  For views where intervals are months, the placeholder highlights the whole month and after the appointment
      * is dropped the {@link #event:appointmentDrop appointmentDrop} event is fired. The event contains the
      * new start and end JavaScript date objects with changed month but the original date and time is preserved.
      *
      * **Note:** In "One month" view, the appointments are not draggable on small screen (as there they are
      * displayed as a list below the dates). Group appointments are also not draggable.
      */
    var enableAppointmentsDragAndDrop: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.56
      *
      * Determines whether the appointments in the row are resizable.
      *
      * The resize interaction is visualized by making the appointment transparent.
      *
      * Specifics based on the intervals (hours, days or months) displayed in the `PlanningCalendar` views:
      *
      * Hours: For views where the displayed intervals are hours, the appointment snaps on every interval of
      * 30 minutes. After the resize is finished, the {@link #event:appointmentResize appointmentResize} event
      * is fired, containing the new start and end JavaScript date objects.
      *
      * Days: For views where intervals are days, the appointment snaps to the end of the day. After the resize
      * is finished, the {@link #event:appointmentResize appointmentResize} event is fired, containing the new
      * start and end JavaScript date objects. The `endDate` time is changed to 00:00:00
      *
      * Months: For views where intervals are months, the appointment snaps to the end of the month. The {@link
      * #event:appointmentResize appointmentResize} event is fired, containing the new start and end JavaScript
      * date objects. The `endDate` is set to the 00:00:00 and first day of the following month.
      *
      * **Notes:** In "One month" view, the appointments are not resizable on small screen (as there they are
      * displayed as a list below the dates). Group appointments are also not resizable
      */
    var enableAppointmentsResize: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.67
      * @EXPERIMENTAL (since 1.67) - providing only limited functionality. Also, the API might be changed in
      * the future.
      *
      * Holds the header content of the row.
      *
      * **Note:** If the `headerContent` aggregation is added, then the set icon, description, title and tooltip
      * are ignored.
      */
    var headerContent: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Specifies the URI of an image or an icon registered in `sap.ui.core.IconPool`.
      */
    var icon: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * The appointments to be displayed at the top of the intervals (for example, for public holidays). Appointments
      * outside the visible time frame are not rendered.
      *
      * Keep in mind that the `intervalHeaders` should always fill whole intervals. If they are shorter or longer
      * than one interval, they are not displayed.
      *
      * **Note:** For performance reasons, only appointments in the visible time range or nearby should be assigned.
      */
    var intervalHeaders: js.UndefOr[
        js.Array[typings.openui5.sapUiUnifiedCalendarAppointmentMod.default] | typings.openui5.sapUiUnifiedCalendarAppointmentMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the identifier of the row.
      */
    var key: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the text that is displayed when no {@link sap.ui.unified.CalendarAppointment CalendarAppointments}
      * are assigned.
      */
    var noAppointmentsText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Determines whether the provided weekdays are displayed as non-working days. Valid values inside the array
      * are from 0 to 6 (other values are ignored). If not set, the weekend defined in the locale settings is
      * displayed as non-working days.
      *
      * **Note:** The non-working days are visualized if the `intervalType` property of the {@link sap.m.PlanningCalendarView}
      * is set to `Day`.
      */
    var nonWorkingDays: js.UndefOr[
        js.Array[int] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines whether the provided hours are displayed as non-working hours. Valid values inside the array
      * are from 0 to 23 (other values are ignored).
      *
      * **Note:** The non-working hours are visualized if `intervalType` property of the {@link sap.m.PlanningCalendarView}
      * is set to `Hour`.
      */
    var nonWorkingHours: js.UndefOr[
        js.Array[int] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the selected state of the `PlanningCalendarRow`.
      *
      * **Note:** Binding the `selected` property in single selection modes may cause unwanted results if you
      * have more than one selected row in your binding.
      */
    var selected: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.56
      *
      * Holds the special dates in the context of a row. A single date or a date range can be set.
      *
      * **Note** Only date or date ranges of type `sap.ui.unified.CalendarDayType.NonWorking` will be visualized
      * in the `PlanningCalendarRow`. If the aggregation is set as another type, the date or date range will
      * be ignored and will not be displayed in the control.
      */
    var specialDates: js.UndefOr[
        js.Array[typings.openui5.sapUiUnifiedDateTypeRangeMod.default] | typings.openui5.sapUiUnifiedDateTypeRangeMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the text of the header (for example, the department of the person).
      */
    var text: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the title of the header (for example, the name of the person).
      */
    var title: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object PlanningCalendarRowSettings {
    
    inline def apply(): PlanningCalendarRowSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlanningCalendarRowSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PlanningCalendarRowSettings] (val x: Self) extends AnyVal {
      
      inline def setAppointmentCreate(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "appointmentCreate", js.Any.fromFunction1(value))
      
      inline def setAppointmentCreateUndefined: Self = StObject.set(x, "appointmentCreate", js.undefined)
      
      inline def setAppointmentDragEnter(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "appointmentDragEnter", js.Any.fromFunction1(value))
      
      inline def setAppointmentDragEnterUndefined: Self = StObject.set(x, "appointmentDragEnter", js.undefined)
      
      inline def setAppointmentDrop(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "appointmentDrop", js.Any.fromFunction1(value))
      
      inline def setAppointmentDropUndefined: Self = StObject.set(x, "appointmentDrop", js.undefined)
      
      inline def setAppointmentResize(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "appointmentResize", js.Any.fromFunction1(value))
      
      inline def setAppointmentResizeUndefined: Self = StObject.set(x, "appointmentResize", js.undefined)
      
      inline def setAppointments(
        value: js.Array[typings.openui5.sapUiUnifiedCalendarAppointmentMod.default] | typings.openui5.sapUiUnifiedCalendarAppointmentMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "appointments", value.asInstanceOf[js.Any])
      
      inline def setAppointmentsUndefined: Self = StObject.set(x, "appointments", js.undefined)
      
      inline def setAppointmentsVarargs(value: typings.openui5.sapUiUnifiedCalendarAppointmentMod.default*): Self = StObject.set(x, "appointments", js.Array(value*))
      
      inline def setEnableAppointmentsCreate(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enableAppointmentsCreate", value.asInstanceOf[js.Any])
      
      inline def setEnableAppointmentsCreateUndefined: Self = StObject.set(x, "enableAppointmentsCreate", js.undefined)
      
      inline def setEnableAppointmentsDragAndDrop(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enableAppointmentsDragAndDrop", value.asInstanceOf[js.Any])
      
      inline def setEnableAppointmentsDragAndDropUndefined: Self = StObject.set(x, "enableAppointmentsDragAndDrop", js.undefined)
      
      inline def setEnableAppointmentsResize(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enableAppointmentsResize", value.asInstanceOf[js.Any])
      
      inline def setEnableAppointmentsResizeUndefined: Self = StObject.set(x, "enableAppointmentsResize", js.undefined)
      
      inline def setHeaderContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "headerContent", value.asInstanceOf[js.Any])
      
      inline def setHeaderContentUndefined: Self = StObject.set(x, "headerContent", js.undefined)
      
      inline def setHeaderContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "headerContent", js.Array(value*))
      
      inline def setIcon(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIntervalHeaders(
        value: js.Array[typings.openui5.sapUiUnifiedCalendarAppointmentMod.default] | typings.openui5.sapUiUnifiedCalendarAppointmentMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "intervalHeaders", value.asInstanceOf[js.Any])
      
      inline def setIntervalHeadersUndefined: Self = StObject.set(x, "intervalHeaders", js.undefined)
      
      inline def setIntervalHeadersVarargs(value: typings.openui5.sapUiUnifiedCalendarAppointmentMod.default*): Self = StObject.set(x, "intervalHeaders", js.Array(value*))
      
      inline def setKey(value: String | PropertyBindingInfo): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setNoAppointmentsText(value: String | PropertyBindingInfo): Self = StObject.set(x, "noAppointmentsText", value.asInstanceOf[js.Any])
      
      inline def setNoAppointmentsTextUndefined: Self = StObject.set(x, "noAppointmentsText", js.undefined)
      
      inline def setNonWorkingDays(value: js.Array[int] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "nonWorkingDays", value.asInstanceOf[js.Any])
      
      inline def setNonWorkingDaysUndefined: Self = StObject.set(x, "nonWorkingDays", js.undefined)
      
      inline def setNonWorkingDaysVarargs(value: int*): Self = StObject.set(x, "nonWorkingDays", js.Array(value*))
      
      inline def setNonWorkingHours(value: js.Array[int] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "nonWorkingHours", value.asInstanceOf[js.Any])
      
      inline def setNonWorkingHoursUndefined: Self = StObject.set(x, "nonWorkingHours", js.undefined)
      
      inline def setNonWorkingHoursVarargs(value: int*): Self = StObject.set(x, "nonWorkingHours", js.Array(value*))
      
      inline def setSelected(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setSpecialDates(
        value: js.Array[typings.openui5.sapUiUnifiedDateTypeRangeMod.default] | typings.openui5.sapUiUnifiedDateTypeRangeMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "specialDates", value.asInstanceOf[js.Any])
      
      inline def setSpecialDatesUndefined: Self = StObject.set(x, "specialDates", js.undefined)
      
      inline def setSpecialDatesVarargs(value: typings.openui5.sapUiUnifiedDateTypeRangeMod.default*): Self = StObject.set(x, "specialDates", js.Array(value*))
      
      inline def setText(value: String | PropertyBindingInfo): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
