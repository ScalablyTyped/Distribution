package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.PlanningCalendarStickyMode
import typings.openui5.sapMLibraryMod.SinglePlanningCalendarSelectionMode
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreDateCalendarWeekNumberingMod.CalendarWeekNumbering
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMSinglePlanningCalendarMod {
  
  @JSImport("sap/m/SinglePlanningCalendar", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `SinglePlanningCalendar`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends SinglePlanningCalendar {
    def this(/**
      * initial settings for the new control
      */
    mSettings: SinglePlanningCalendarSettings) = this()
    def this(/**
      * id for the new control, generated automatically if no id is given
      */
    sId: String) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: String,
      /**
      * initial settings for the new control
      */
    mSettings: SinglePlanningCalendarSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: SinglePlanningCalendarSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/SinglePlanningCalendar", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.SinglePlanningCalendar with name `sClassName` and enriches it with
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
    oClassInfo: ClassInfo[T, SinglePlanningCalendar]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, SinglePlanningCalendar],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.SinglePlanningCalendar.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait SinglePlanningCalendar
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Adds some action to the aggregation {@link #getActions actions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAction(
      /**
      * The action to add; if empty, nothing is inserted
      */
    oAction: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
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
      * Adds a selected date to the grid.
      *
      * @returns Reference to `this` for method chaining
      */
    def addSelectedDate(/**
      * A DateRange object
      */
    oSelectedDate: js.Object): this.type = js.native
    
    /**
      * @since 1.66
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
      * Adds some view to the aggregation {@link #getViews views}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addView(
      /**
      * The view to add; if empty, nothing is inserted
      */
    oView: typings.openui5.sapMSinglePlanningCalendarViewMod.default
    ): this.type = js.native
    
    /**
      * @since 1.65
      *
      * Attaches event handler `fnFunction` to the {@link #event:appointmentCreate appointmentCreate} event of
      * this `sap.m.SinglePlanningCalendar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SinglePlanningCalendar` itself.
      *
      * Fired if an appointment is created.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAppointmentCreate(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SinglePlanningCalendarAppointmentCreateEvent, Unit]
    ): this.type = js.native
    def attachAppointmentCreate(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SinglePlanningCalendarAppointmentCreateEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.SinglePlanningCalendar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @since 1.65
      *
      * Attaches event handler `fnFunction` to the {@link #event:appointmentCreate appointmentCreate} event of
      * this `sap.m.SinglePlanningCalendar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SinglePlanningCalendar` itself.
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
    fnFunction: js.Function1[/* p1 */ SinglePlanningCalendarAppointmentCreateEvent, Unit]
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
    fnFunction: js.Function1[/* p1 */ SinglePlanningCalendarAppointmentCreateEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.SinglePlanningCalendar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @since 1.64
      *
      * Attaches event handler `fnFunction` to the {@link #event:appointmentDrop appointmentDrop} event of this
      * `sap.m.SinglePlanningCalendar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SinglePlanningCalendar` itself.
      *
      * Fired if an appointment is dropped.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAppointmentDrop(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SinglePlanningCalendarAppointmentDropEvent, Unit]
    ): this.type = js.native
    def attachAppointmentDrop(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SinglePlanningCalendarAppointmentDropEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.SinglePlanningCalendar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @since 1.64
      *
      * Attaches event handler `fnFunction` to the {@link #event:appointmentDrop appointmentDrop} event of this
      * `sap.m.SinglePlanningCalendar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SinglePlanningCalendar` itself.
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
    fnFunction: js.Function1[/* p1 */ SinglePlanningCalendarAppointmentDropEvent, Unit]
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
    fnFunction: js.Function1[/* p1 */ SinglePlanningCalendarAppointmentDropEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.SinglePlanningCalendar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @since 1.65
      *
      * Attaches event handler `fnFunction` to the {@link #event:appointmentResize appointmentResize} event of
      * this `sap.m.SinglePlanningCalendar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SinglePlanningCalendar` itself.
      *
      * Fired when an appointment is resized.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAppointmentResize(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SinglePlanningCalendarAppointmentResizeEvent, Unit]
    ): this.type = js.native
    def attachAppointmentResize(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SinglePlanningCalendarAppointmentResizeEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.SinglePlanningCalendar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @since 1.65
      *
      * Attaches event handler `fnFunction` to the {@link #event:appointmentResize appointmentResize} event of
      * this `sap.m.SinglePlanningCalendar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SinglePlanningCalendar` itself.
      *
      * Fired when an appointment is resized.
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
    fnFunction: js.Function1[/* p1 */ SinglePlanningCalendarAppointmentResizeEvent, Unit]
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
    fnFunction: js.Function1[/* p1 */ SinglePlanningCalendarAppointmentResizeEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.SinglePlanningCalendar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:appointmentSelect appointmentSelect} event of
      * this `sap.m.SinglePlanningCalendar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SinglePlanningCalendar` itself.
      *
      * Fired when the selected state of an appointment is changed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAppointmentSelect(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SinglePlanningCalendarAppointmentSelectEvent, Unit]
    ): this.type = js.native
    def attachAppointmentSelect(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SinglePlanningCalendarAppointmentSelectEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.SinglePlanningCalendar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:appointmentSelect appointmentSelect} event of
      * this `sap.m.SinglePlanningCalendar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SinglePlanningCalendar` itself.
      *
      * Fired when the selected state of an appointment is changed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAppointmentSelect(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SinglePlanningCalendarAppointmentSelectEvent, Unit]
    ): this.type = js.native
    def attachAppointmentSelect(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SinglePlanningCalendarAppointmentSelectEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.SinglePlanningCalendar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @since 1.65
      *
      * Attaches event handler `fnFunction` to the {@link #event:cellPress cellPress} event of this `sap.m.SinglePlanningCalendar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SinglePlanningCalendar` itself.
      *
      * Fired when a grid cell is pressed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachCellPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SinglePlanningCalendarCellPressEvent, Unit]
    ): this.type = js.native
    def attachCellPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SinglePlanningCalendarCellPressEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.SinglePlanningCalendar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @since 1.65
      *
      * Attaches event handler `fnFunction` to the {@link #event:cellPress cellPress} event of this `sap.m.SinglePlanningCalendar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SinglePlanningCalendar` itself.
      *
      * Fired when a grid cell is pressed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachCellPress(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SinglePlanningCalendarCellPressEvent, Unit]
    ): this.type = js.native
    def attachCellPress(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SinglePlanningCalendarCellPressEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.SinglePlanningCalendar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:headerDateSelect headerDateSelect} event of
      * this `sap.m.SinglePlanningCalendar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SinglePlanningCalendar` itself.
      *
      * Fired if a date is selected in the calendar header.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachHeaderDateSelect(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SinglePlanningCalendarHeaderDateSelectEvent, Unit]
    ): this.type = js.native
    def attachHeaderDateSelect(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SinglePlanningCalendarHeaderDateSelectEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.SinglePlanningCalendar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:headerDateSelect headerDateSelect} event of
      * this `sap.m.SinglePlanningCalendar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SinglePlanningCalendar` itself.
      *
      * Fired if a date is selected in the calendar header.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachHeaderDateSelect(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SinglePlanningCalendarHeaderDateSelectEvent, Unit]
    ): this.type = js.native
    def attachHeaderDateSelect(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SinglePlanningCalendarHeaderDateSelectEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.SinglePlanningCalendar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:moreLinkPress moreLinkPress} event of this `sap.m.SinglePlanningCalendar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SinglePlanningCalendar` itself.
      *
      * Fired when a 'more' button is pressed. **Note:** The 'more' button appears in a month view cell when
      * multiple appointments exist and the available space is not sufficient to display all of them.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachMoreLinkPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SinglePlanningCalendarMoreLinkPressEvent, Unit]
    ): this.type = js.native
    def attachMoreLinkPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SinglePlanningCalendarMoreLinkPressEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.SinglePlanningCalendar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:moreLinkPress moreLinkPress} event of this `sap.m.SinglePlanningCalendar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SinglePlanningCalendar` itself.
      *
      * Fired when a 'more' button is pressed. **Note:** The 'more' button appears in a month view cell when
      * multiple appointments exist and the available space is not sufficient to display all of them.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachMoreLinkPress(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SinglePlanningCalendarMoreLinkPressEvent, Unit]
    ): this.type = js.native
    def attachMoreLinkPress(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SinglePlanningCalendarMoreLinkPressEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.SinglePlanningCalendar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:startDateChange startDateChange} event of this
      * `sap.m.SinglePlanningCalendar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SinglePlanningCalendar` itself.
      *
      * `startDate` is changed while navigating in the `SinglePlanningCalendar`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachStartDateChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SinglePlanningCalendarStartDateChangeEvent, Unit]
    ): this.type = js.native
    def attachStartDateChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SinglePlanningCalendarStartDateChangeEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.SinglePlanningCalendar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:startDateChange startDateChange} event of this
      * `sap.m.SinglePlanningCalendar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SinglePlanningCalendar` itself.
      *
      * `startDate` is changed while navigating in the `SinglePlanningCalendar`.
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
    fnFunction: js.Function1[/* p1 */ SinglePlanningCalendarStartDateChangeEvent, Unit]
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
    fnFunction: js.Function1[/* p1 */ SinglePlanningCalendarStartDateChangeEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.SinglePlanningCalendar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @since 1.71.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:viewChange viewChange} event of this `sap.m.SinglePlanningCalendar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SinglePlanningCalendar` itself.
      *
      * The view was changed by user interaction.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachViewChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachViewChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.SinglePlanningCalendar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @since 1.71.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:viewChange viewChange} event of this `sap.m.SinglePlanningCalendar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SinglePlanningCalendar` itself.
      *
      * The view was changed by user interaction.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachViewChange(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachViewChange(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.SinglePlanningCalendar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys all the actions in the aggregation {@link #getActions actions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyActions(): this.type = js.native
    
    /**
      * Destroys all the appointments in the aggregation {@link #getAppointments appointments}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyAppointments(): this.type = js.native
    
    /**
      * Destroys all the selectedDates in the aggregation {@link #getSelectedDates selectedDates}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroySelectedDates(): this.type = js.native
    
    /**
      * @since 1.66
      *
      * Destroys all the specialDates in the aggregation {@link #getSpecialDates specialDates}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroySpecialDates(): this.type = js.native
    
    /**
      * Destroys all the views in the aggregation {@link #getViews views}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyViews(): this.type = js.native
    
    /**
      * @since 1.65
      *
      * Detaches event handler `fnFunction` from the {@link #event:appointmentCreate appointmentCreate} event
      * of this `sap.m.SinglePlanningCalendar`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachAppointmentCreate(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SinglePlanningCalendarAppointmentCreateEvent, Unit]
    ): this.type = js.native
    def detachAppointmentCreate(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SinglePlanningCalendarAppointmentCreateEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @since 1.64
      *
      * Detaches event handler `fnFunction` from the {@link #event:appointmentDrop appointmentDrop} event of
      * this `sap.m.SinglePlanningCalendar`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachAppointmentDrop(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SinglePlanningCalendarAppointmentDropEvent, Unit]
    ): this.type = js.native
    def detachAppointmentDrop(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SinglePlanningCalendarAppointmentDropEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @since 1.65
      *
      * Detaches event handler `fnFunction` from the {@link #event:appointmentResize appointmentResize} event
      * of this `sap.m.SinglePlanningCalendar`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachAppointmentResize(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SinglePlanningCalendarAppointmentResizeEvent, Unit]
    ): this.type = js.native
    def detachAppointmentResize(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SinglePlanningCalendarAppointmentResizeEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:appointmentSelect appointmentSelect} event
      * of this `sap.m.SinglePlanningCalendar`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachAppointmentSelect(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SinglePlanningCalendarAppointmentSelectEvent, Unit]
    ): this.type = js.native
    def detachAppointmentSelect(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SinglePlanningCalendarAppointmentSelectEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @since 1.65
      *
      * Detaches event handler `fnFunction` from the {@link #event:cellPress cellPress} event of this `sap.m.SinglePlanningCalendar`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachCellPress(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SinglePlanningCalendarCellPressEvent, Unit]
    ): this.type = js.native
    def detachCellPress(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SinglePlanningCalendarCellPressEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:headerDateSelect headerDateSelect} event of
      * this `sap.m.SinglePlanningCalendar`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachHeaderDateSelect(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SinglePlanningCalendarHeaderDateSelectEvent, Unit]
    ): this.type = js.native
    def detachHeaderDateSelect(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SinglePlanningCalendarHeaderDateSelectEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:moreLinkPress moreLinkPress} event of this
      * `sap.m.SinglePlanningCalendar`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachMoreLinkPress(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SinglePlanningCalendarMoreLinkPressEvent, Unit]
    ): this.type = js.native
    def detachMoreLinkPress(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SinglePlanningCalendarMoreLinkPressEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:startDateChange startDateChange} event of
      * this `sap.m.SinglePlanningCalendar`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachStartDateChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SinglePlanningCalendarStartDateChangeEvent, Unit]
    ): this.type = js.native
    def detachStartDateChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SinglePlanningCalendarStartDateChangeEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @since 1.71.0
      *
      * Detaches event handler `fnFunction` from the {@link #event:viewChange viewChange} event of this `sap.m.SinglePlanningCalendar`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachViewChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def detachViewChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @since 1.65
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:appointmentCreate appointmentCreate} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireAppointmentCreate(): this.type = js.native
    def fireAppointmentCreate(
      /**
      * Parameters to pass along with the event
      */
    mParameters: SinglePlanningCalendar$AppointmentCreateEventParameters
    ): this.type = js.native
    
    /**
      * @since 1.64
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:appointmentDrop appointmentDrop} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireAppointmentDrop(): this.type = js.native
    def fireAppointmentDrop(
      /**
      * Parameters to pass along with the event
      */
    mParameters: SinglePlanningCalendar$AppointmentDropEventParameters
    ): this.type = js.native
    
    /**
      * @since 1.65
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:appointmentResize appointmentResize} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireAppointmentResize(): this.type = js.native
    def fireAppointmentResize(
      /**
      * Parameters to pass along with the event
      */
    mParameters: SinglePlanningCalendar$AppointmentResizeEventParameters
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:appointmentSelect appointmentSelect} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireAppointmentSelect(): this.type = js.native
    def fireAppointmentSelect(
      /**
      * Parameters to pass along with the event
      */
    mParameters: SinglePlanningCalendar$AppointmentSelectEventParameters
    ): this.type = js.native
    
    /**
      * @since 1.65
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:cellPress cellPress} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireCellPress(): this.type = js.native
    def fireCellPress(
      /**
      * Parameters to pass along with the event
      */
    mParameters: SinglePlanningCalendar$CellPressEventParameters
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:headerDateSelect headerDateSelect} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireHeaderDateSelect(): this.type = js.native
    def fireHeaderDateSelect(
      /**
      * Parameters to pass along with the event
      */
    mParameters: SinglePlanningCalendar$HeaderDateSelectEventParameters
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:moreLinkPress moreLinkPress} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireMoreLinkPress(): this.type = js.native
    def fireMoreLinkPress(
      /**
      * Parameters to pass along with the event
      */
    mParameters: SinglePlanningCalendar$MoreLinkPressEventParameters
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:startDateChange startDateChange} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireStartDateChange(): this.type = js.native
    def fireStartDateChange(
      /**
      * Parameters to pass along with the event
      */
    mParameters: SinglePlanningCalendar$StartDateChangeEventParameters
    ): this.type = js.native
    
    /**
      * @since 1.71.0
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:viewChange viewChange} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireViewChange(): this.type = js.native
    def fireViewChange(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getActions actions}.
      *
      * The controls to be passed to the toolbar.
      */
    def getActions(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets content of aggregation {@link #getAppointments appointments}.
      *
      * The appointments to be displayed in the grid. Appointments outside the visible time frame are not rendered.
      * Appointments, longer than a day, will be displayed in all of the affected days. To display an all-day
      * appointment, the appointment must start at 00:00 and end on any day in the future in 00:00h.
      *
      * Note: The `customContent` functionality of the `CalendarAppointment` is not available in the `SinglePlanningCalendar`.
      * If set, it will not make any effect.
      */
    def getAppointments(): js.Array[typings.openui5.sapUiUnifiedCalendarAppointmentMod.default] = js.native
    
    /**
      * @since 1.110.0
      *
      * Gets current value of property {@link #getCalendarWeekNumbering calendarWeekNumbering}.
      *
      * If set, the calendar week numbering is used for display. If not set, the calendar week numbering of the
      * global configuration is used. Note: This property should not be used with firstDayOfWeek property.
      *
      * @returns Value of property `calendarWeekNumbering`
      */
    def getCalendarWeekNumbering(): CalendarWeekNumbering | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarWeekNumbering * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getDateSelectionMode dateSelectionMode}.
      *
      * Determines whether more than one day will be selectable. **Note:** selecting more than one day is possible
      * with a combination of `Ctrl + mouse click`
      *
      * Default value is `SingleSelect`.
      *
      * @returns Value of property `dateSelectionMode`
      */
    def getDateSelectionMode(): SinglePlanningCalendarSelectionMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SinglePlanningCalendarSelectionMode * / any */ String) = js.native
    
    /**
      * @since 1.65
      *
      * Gets current value of property {@link #getEnableAppointmentsCreate enableAppointmentsCreate}.
      *
      * Determines whether the appointments can be created by dragging on empty cells.
      *
      * See {@link #property:enableAppointmentsResize enableAppointmentsResize} for the specific points for events
      * snapping
      *
      * Default value is `false`.
      *
      * @returns Value of property `enableAppointmentsCreate`
      */
    def getEnableAppointmentsCreate(): Boolean = js.native
    
    /**
      * @since 1.64
      *
      * Gets current value of property {@link #getEnableAppointmentsDragAndDrop enableAppointmentsDragAndDrop}.
      *
      * Determines whether the appointments in the grid are draggable.
      *
      * The drag and drop interaction is visualized by a placeholder highlighting the area where the appointment
      * can be dropped by the user.
      *
      * Default value is `false`.
      *
      * @returns Value of property `enableAppointmentsDragAndDrop`
      */
    def getEnableAppointmentsDragAndDrop(): Boolean = js.native
    
    /**
      * @since 1.65
      *
      * Gets current value of property {@link #getEnableAppointmentsResize enableAppointmentsResize}.
      *
      * Determines whether the appointments are resizable.
      *
      * The resize interaction is visualized by making the appointment transparent.
      *
      * The appointment snaps on every interval of 30 minutes. After the resize is finished, the {@link #event:appointmentResize appointmentResize }
      * event is fired, containing the new start and end UI5Date or JavaScript Date objects.
      *
      * Default value is `false`.
      *
      * @returns Value of property `enableAppointmentsResize`
      */
    def getEnableAppointmentsResize(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getEndHour endHour}.
      *
      * Determines the end hour of the grid to be shown if the `fullDay` property is set to `false`. Otherwise
      * the next hours are displayed as non-working. The passed hour is considered as 24-hour based.
      *
      * Default value is `24`.
      *
      * @returns Value of property `endHour`
      */
    def getEndHour(): int = js.native
    
    /**
      * @since 1.98
      *
      * Gets current value of property {@link #getFirstDayOfWeek firstDayOfWeek}.
      *
      * If set, the first day of the displayed week is this day. Valid values are 0 to 6 starting on Sunday.
      * If there is no valid value set, the default of the used locale is used.
      *
      * Note: This property will only have effect in Week view and Month view of the SinglePlanningCalendar,
      * but it wouldn't have effect in WorkWeek view. This property should not be used with the calendarWeekNumbering
      * property.
      *
      * Default value is `-1`.
      *
      * @returns Value of property `firstDayOfWeek`
      */
    def getFirstDayOfWeek(): int = js.native
    
    /**
      * Gets current value of property {@link #getFullDay fullDay}.
      *
      * Determines if all of the hours in a day are displayed. If set to `false`, the hours shown are between
      * the `startHour` and `endHour`.
      *
      * Default value is `true`.
      *
      * @returns Value of property `fullDay`
      */
    def getFullDay(): Boolean = js.native
    
    /**
      * @since 1.65.0
      *
      * ID of the element which is the current target of the association {@link #getLegend legend}, or `null`.
      */
    def getLegend(): ID = js.native
    
    /**
      * @since 1.99
      *
      * Gets current value of property {@link #getScaleFactor scaleFactor}.
      *
      * Determines scale factor for the appointments.
      *
      * Acceptable range is from 1 to 6.
      *
      * Default value is `1`.
      *
      * @returns Value of property `scaleFactor`
      */
    def getScaleFactor(): float = js.native
    
    /**
      * @since 1.62
      *
      * Holds the selected appointments. If no appointments are selected, an empty array is returned.
      *
      * @returns All selected appointments
      */
    def getSelectedAppointments(): js.Array[typings.openui5.sapUiUnifiedCalendarAppointmentMod.default] = js.native
    
    /**
      * Gets the selected dates of the grid.
      *
      * @returns An array of DateRange objects
      */
    def getSelectedDates(): js.Object = js.native
    
    /**
      * ID of the element which is the current target of the association {@link #getSelectedView selectedView},
      * or `null`.
      */
    def getSelectedView(): ID = js.native
    
    /**
      * @since 1.66
      *
      * Gets content of aggregation {@link #getSpecialDates specialDates}.
      *
      * Special days in the header visualized as a date range with type.
      *
      * **Note:** If one day is assigned to more than one type, only the first type is used.
      */
    def getSpecialDates(): js.Array[typings.openui5.sapUiUnifiedDateTypeRangeMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getStartDate startDate}.
      *
      * Determines the start date of the grid, as a UI5Date or JavaScript Date object. It is considered as a
      * local date. The time part will be ignored. The current date is used as default.
      *
      * @returns Value of property `startDate`
      */
    def getStartDate(): js.Object = js.native
    
    /**
      * Gets current value of property {@link #getStartHour startHour}.
      *
      * Determines the start hour of the grid to be shown if the `fullDay` property is set to `false`. Otherwise
      * the previous hours are displayed as non-working. The passed hour is considered as 24-hour based.
      *
      * Default value is `0`.
      *
      * @returns Value of property `startHour`
      */
    def getStartHour(): int = js.native
    
    /**
      * @since 1.62
      *
      * Gets current value of property {@link #getStickyMode stickyMode}.
      *
      * Determines which part of the control will remain fixed at the top of the page during vertical scrolling
      * as long as the control is in the viewport.
      *
      * **Note:** Limited browser support. Browsers which do not support this feature:
      * 	 - Microsoft Internet Explorer
      * 	 - Microsoft Edge lower than version 41 (EdgeHTML 16)
      * 	 - Mozilla Firefox lower than version 59
      *
      * Default value is `None`.
      *
      * @returns Value of property `stickyMode`
      */
    def getStickyMode(): PlanningCalendarStickyMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlanningCalendarStickyMode * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getTitle title}.
      *
      * Determines the title of the `SinglePlanningCalendar`.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `title`
      */
    def getTitle(): String = js.native
    
    /**
      * @since 1.75
      *
      * Finds the view object by given key.
      *
      * @returns the view object which matched the given `sKey`, or `null` if there is no such view
      */
    def getViewByKey(/**
      * The key of the view
      */
    sKey: String): typings.openui5.sapMSinglePlanningCalendarViewMod.default | Null = js.native
    
    /**
      * Gets content of aggregation {@link #getViews views}.
      *
      * Views of the `SinglePlanningCalendar`.
      *
      * **Note:** If not set, the Week view is available.
      */
    def getViews(): js.Array[typings.openui5.sapMSinglePlanningCalendarViewMod.default] = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getActions actions}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfAction(
      /**
      * The action whose index is looked for
      */
    oAction: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.ui.unified.CalendarAppointment` in the aggregation {@link #getAppointments appointments}.
      * and returns its index if found or -1 otherwise.
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
      * Checks for the provided `sap.ui.unified.DateRange` in the aggregation {@link #getSelectedDates selectedDates}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfSelectedDate(
      /**
      * The selectedDate whose index is looked for
      */
    oSelectedDate: typings.openui5.sapUiUnifiedDateRangeMod.default
    ): int = js.native
    
    /**
      * @since 1.66
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
      * Checks for the provided `sap.m.SinglePlanningCalendarView` in the aggregation {@link #getViews views}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfView(
      /**
      * The view whose index is looked for
      */
    oView: typings.openui5.sapMSinglePlanningCalendarViewMod.default
    ): int = js.native
    
    /**
      * Inserts a action into the aggregation {@link #getActions actions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertAction(
      /**
      * The action to insert; if empty, nothing is inserted
      */
    oAction: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the action should be inserted at; for a negative value of `iIndex`, the action is
      * inserted at position 0; for a value greater than the current size of the aggregation, the action is inserted
      * at the last position
      */
    iIndex: int
    ): this.type = js.native
    
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
      * Inserts a selectedDate into the aggregation {@link #getSelectedDates selectedDates}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertSelectedDate(
      /**
      * The selectedDate to insert; if empty, nothing is inserted
      */
    oSelectedDate: typings.openui5.sapUiUnifiedDateRangeMod.default,
      /**
      * The `0`-based index the selectedDate should be inserted at; for a negative value of `iIndex`, the selectedDate
      * is inserted at position 0; for a value greater than the current size of the aggregation, the selectedDate
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * @since 1.66
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
      * Inserts a view into the aggregation {@link #getViews views}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertView(
      /**
      * The view to insert; if empty, nothing is inserted
      */
    oView: typings.openui5.sapMSinglePlanningCalendarViewMod.default,
      /**
      * The `0`-based index the view should be inserted at; for a negative value of `iIndex`, the view is inserted
      * at position 0; for a value greater than the current size of the aggregation, the view is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    def removeAction(/**
      * The action to remove or its index or id
      */
    vAction: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a action from the aggregation {@link #getActions actions}.
      *
      * @returns The removed action or `null`
      */
    def removeAction(/**
      * The action to remove or its index or id
      */
    vAction: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeAction(
      /**
      * The action to remove or its index or id
      */
    vAction: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getActions actions}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllActions(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getAppointments appointments}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAppointments(): js.Array[typings.openui5.sapUiUnifiedCalendarAppointmentMod.default] = js.native
    
    /**
      * Removes the selected dates of the grid.
      *
      * @returns An array of the removed DateRange objects
      */
    def removeAllSelectedDates(): js.Object = js.native
    
    /**
      * @since 1.66
      *
      * Removes all the controls from the aggregation {@link #getSpecialDates specialDates}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllSpecialDates(): js.Array[typings.openui5.sapUiUnifiedDateTypeRangeMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getViews views}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllViews(): js.Array[typings.openui5.sapMSinglePlanningCalendarViewMod.default] = js.native
    
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
    
    def removeSelectedDate(/**
      * The selectedDate to remove or its index or id
      */
    vSelectedDate: String): typings.openui5.sapUiUnifiedDateRangeMod.default | Null = js.native
    /**
      * Removes a selectedDate from the aggregation {@link #getSelectedDates selectedDates}.
      *
      * @returns The removed selectedDate or `null`
      */
    def removeSelectedDate(/**
      * The selectedDate to remove or its index or id
      */
    vSelectedDate: int): typings.openui5.sapUiUnifiedDateRangeMod.default | Null = js.native
    def removeSelectedDate(
      /**
      * The selectedDate to remove or its index or id
      */
    vSelectedDate: typings.openui5.sapUiUnifiedDateRangeMod.default
    ): typings.openui5.sapUiUnifiedDateRangeMod.default | Null = js.native
    
    def removeSpecialDate(/**
      * The specialDate to remove or its index or id
      */
    vSpecialDate: String): typings.openui5.sapUiUnifiedDateTypeRangeMod.default | Null = js.native
    /**
      * @since 1.66
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
    
    def removeView(/**
      * The view to remove or its index or id
      */
    vView: String): typings.openui5.sapMSinglePlanningCalendarViewMod.default | Null = js.native
    /**
      * Removes a view from the aggregation {@link #getViews views}.
      *
      * @returns The removed view or `null`
      */
    def removeView(/**
      * The view to remove or its index or id
      */
    vView: int): typings.openui5.sapMSinglePlanningCalendarViewMod.default | Null = js.native
    def removeView(
      /**
      * The view to remove or its index or id
      */
    vView: typings.openui5.sapMSinglePlanningCalendarViewMod.default
    ): typings.openui5.sapMSinglePlanningCalendarViewMod.default | Null = js.native
    
    /**
      * @since 1.110.0
      *
      * Sets a new value for property {@link #getCalendarWeekNumbering calendarWeekNumbering}.
      *
      * If set, the calendar week numbering is used for display. If not set, the calendar week numbering of the
      * global configuration is used. Note: This property should not be used with firstDayOfWeek property.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCalendarWeekNumbering(): this.type = js.native
    def setCalendarWeekNumbering(
      /**
      * New value for property `calendarWeekNumbering`
      */
    sCalendarWeekNumbering: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarWeekNumbering * / any */ String
    ): this.type = js.native
    def setCalendarWeekNumbering(
      /**
      * New value for property `calendarWeekNumbering`
      */
    sCalendarWeekNumbering: CalendarWeekNumbering
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getDateSelectionMode dateSelectionMode}.
      *
      * Determines whether more than one day will be selectable. **Note:** selecting more than one day is possible
      * with a combination of `Ctrl + mouse click`
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `SingleSelect`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDateSelectionMode(): this.type = js.native
    def setDateSelectionMode(
      /**
      * New value for property `dateSelectionMode`
      */
    sDateSelectionMode: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SinglePlanningCalendarSelectionMode * / any */ String
    ): this.type = js.native
    def setDateSelectionMode(
      /**
      * New value for property `dateSelectionMode`
      */
    sDateSelectionMode: SinglePlanningCalendarSelectionMode
    ): this.type = js.native
    
    /**
      * @since 1.65
      *
      * Sets a new value for property {@link #getEnableAppointmentsCreate enableAppointmentsCreate}.
      *
      * Determines whether the appointments can be created by dragging on empty cells.
      *
      * See {@link #property:enableAppointmentsResize enableAppointmentsResize} for the specific points for events
      * snapping
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
      * @since 1.64
      *
      * Sets a new value for property {@link #getEnableAppointmentsDragAndDrop enableAppointmentsDragAndDrop}.
      *
      * Determines whether the appointments in the grid are draggable.
      *
      * The drag and drop interaction is visualized by a placeholder highlighting the area where the appointment
      * can be dropped by the user.
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
      * @since 1.65
      *
      * Sets a new value for property {@link #getEnableAppointmentsResize enableAppointmentsResize}.
      *
      * Determines whether the appointments are resizable.
      *
      * The resize interaction is visualized by making the appointment transparent.
      *
      * The appointment snaps on every interval of 30 minutes. After the resize is finished, the {@link #event:appointmentResize appointmentResize }
      * event is fired, containing the new start and end UI5Date or JavaScript Date objects.
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
      * Sets a new value for property {@link #getEndHour endHour}.
      *
      * Determines the end hour of the grid to be shown if the `fullDay` property is set to `false`. Otherwise
      * the next hours are displayed as non-working. The passed hour is considered as 24-hour based.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `24`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEndHour(): this.type = js.native
    def setEndHour(/**
      * New value for property `endHour`
      */
    iEndHour: int): this.type = js.native
    
    /**
      * @since 1.98
      *
      * Sets a new value for property {@link #getFirstDayOfWeek firstDayOfWeek}.
      *
      * If set, the first day of the displayed week is this day. Valid values are 0 to 6 starting on Sunday.
      * If there is no valid value set, the default of the used locale is used.
      *
      * Note: This property will only have effect in Week view and Month view of the SinglePlanningCalendar,
      * but it wouldn't have effect in WorkWeek view. This property should not be used with the calendarWeekNumbering
      * property.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `-1`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFirstDayOfWeek(): this.type = js.native
    def setFirstDayOfWeek(/**
      * New value for property `firstDayOfWeek`
      */
    iFirstDayOfWeek: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getFullDay fullDay}.
      *
      * Determines if all of the hours in a day are displayed. If set to `false`, the hours shown are between
      * the `startHour` and `endHour`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFullDay(): this.type = js.native
    def setFullDay(/**
      * New value for property `fullDay`
      */
    bFullDay: Boolean): this.type = js.native
    
    def setLegend(
      /**
      * ID of an element which becomes the new target of this legend association; alternatively, an element instance
      * may be given
      */
    oLegend: typings.openui5.sapMPlanningCalendarLegendMod.default
    ): this.type = js.native
    /**
      * @since 1.65.0
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
    
    /**
      * @since 1.99
      *
      * Sets a new value for property {@link #getScaleFactor scaleFactor}.
      *
      * Determines scale factor for the appointments.
      *
      * Acceptable range is from 1 to 6.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `1`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setScaleFactor(): this.type = js.native
    def setScaleFactor(/**
      * New value for property `scaleFactor`
      */
    fScaleFactor: float): this.type = js.native
    
    def setSelectedView(
      /**
      * ID of an element which becomes the new target of this selectedView association; alternatively, an element
      * instance may be given
      */
    oSelectedView: typings.openui5.sapMSinglePlanningCalendarViewMod.default
    ): this.type = js.native
    /**
      * Sets the associated {@link #getSelectedView selectedView}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSelectedView(
      /**
      * ID of an element which becomes the new target of this selectedView association; alternatively, an element
      * instance may be given
      */
    oSelectedView: ID
    ): this.type = js.native
    
    /**
      * Sets the start date of the grid.
      *
      * @returns Reference to `this` for method chaining
      */
    def setStartDate(/**
      * A date instance
      */
    oDate: js.Date): this.type = js.native
    def setStartDate(/**
      * A date instance
      */
    oDate: typings.openui5.sapUiCoreDateUi5dateMod.default): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getStartHour startHour}.
      *
      * Determines the start hour of the grid to be shown if the `fullDay` property is set to `false`. Otherwise
      * the previous hours are displayed as non-working. The passed hour is considered as 24-hour based.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `0`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setStartHour(): this.type = js.native
    def setStartHour(/**
      * New value for property `startHour`
      */
    iStartHour: int): this.type = js.native
    
    /**
      * @since 1.62
      *
      * Sets a new value for property {@link #getStickyMode stickyMode}.
      *
      * Determines which part of the control will remain fixed at the top of the page during vertical scrolling
      * as long as the control is in the viewport.
      *
      * **Note:** Limited browser support. Browsers which do not support this feature:
      * 	 - Microsoft Internet Explorer
      * 	 - Microsoft Edge lower than version 41 (EdgeHTML 16)
      * 	 - Mozilla Firefox lower than version 59
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `None`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setStickyMode(): this.type = js.native
    def setStickyMode(
      /**
      * New value for property `stickyMode`
      */
    sStickyMode: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlanningCalendarStickyMode * / any */ String
    ): this.type = js.native
    def setStickyMode(/**
      * New value for property `stickyMode`
      */
    sStickyMode: PlanningCalendarStickyMode): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTitle title}.
      *
      * Determines the title of the `SinglePlanningCalendar`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitle(): this.type = js.native
    def setTitle(/**
      * New value for property `title`
      */
    sTitle: String): this.type = js.native
  }
  
  trait SinglePlanningCalendar$AppointmentCreateEventParameters extends StObject {
    
    /**
      * End date of the created appointment, as a UI5Date or JavaScript Date object.
      */
    var endDate: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Start date of the created appointment, as a UI5Date or JavaScript Date object.
      */
    var startDate: js.UndefOr[js.Object] = js.undefined
  }
  object SinglePlanningCalendar$AppointmentCreateEventParameters {
    
    inline def apply(): SinglePlanningCalendar$AppointmentCreateEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SinglePlanningCalendar$AppointmentCreateEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SinglePlanningCalendar$AppointmentCreateEventParameters] (val x: Self) extends AnyVal {
      
      inline def setEndDate(value: js.Object): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      inline def setStartDate(value: js.Object): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    }
  }
  
  trait SinglePlanningCalendar$AppointmentDropEventParameters extends StObject {
    
    /**
      * The dropped appointment.
      */
    var appointment: js.UndefOr[typings.openui5.sapUiUnifiedCalendarAppointmentMod.default] = js.undefined
    
    /**
      * The drop type. If true - it's "Copy", if false - it's "Move".
      */
    var copy: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Dropped appointment end date as a UI5Date or JavaScript Date object.
      */
    var endDate: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Start date of the dropped appointment, as a UI5Date or JavaScript Date object.
      */
    var startDate: js.UndefOr[js.Object] = js.undefined
  }
  object SinglePlanningCalendar$AppointmentDropEventParameters {
    
    inline def apply(): SinglePlanningCalendar$AppointmentDropEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SinglePlanningCalendar$AppointmentDropEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SinglePlanningCalendar$AppointmentDropEventParameters] (val x: Self) extends AnyVal {
      
      inline def setAppointment(value: typings.openui5.sapUiUnifiedCalendarAppointmentMod.default): Self = StObject.set(x, "appointment", value.asInstanceOf[js.Any])
      
      inline def setAppointmentUndefined: Self = StObject.set(x, "appointment", js.undefined)
      
      inline def setCopy(value: Boolean): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
      
      inline def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
      
      inline def setEndDate(value: js.Object): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      inline def setStartDate(value: js.Object): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    }
  }
  
  trait SinglePlanningCalendar$AppointmentResizeEventParameters extends StObject {
    
    /**
      * The resized appointment.
      */
    var appointment: js.UndefOr[typings.openui5.sapUiUnifiedCalendarAppointmentMod.default] = js.undefined
    
    /**
      * End date of the resized appointment, as a UI5Date or JavaScript Date object.
      */
    var endDate: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Start date of the resized appointment, as a UI5Date or JavaScript Date object.
      */
    var startDate: js.UndefOr[js.Object] = js.undefined
  }
  object SinglePlanningCalendar$AppointmentResizeEventParameters {
    
    inline def apply(): SinglePlanningCalendar$AppointmentResizeEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SinglePlanningCalendar$AppointmentResizeEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SinglePlanningCalendar$AppointmentResizeEventParameters] (val x: Self) extends AnyVal {
      
      inline def setAppointment(value: typings.openui5.sapUiUnifiedCalendarAppointmentMod.default): Self = StObject.set(x, "appointment", value.asInstanceOf[js.Any])
      
      inline def setAppointmentUndefined: Self = StObject.set(x, "appointment", js.undefined)
      
      inline def setEndDate(value: js.Object): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      inline def setStartDate(value: js.Object): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    }
  }
  
  trait SinglePlanningCalendar$AppointmentSelectEventParameters extends StObject {
    
    /**
      * The appointment on which the event was triggered.
      */
    var appointment: js.UndefOr[typings.openui5.sapUiUnifiedCalendarAppointmentMod.default] = js.undefined
    
    /**
      * All appointments with changed selected state.
      */
    var appointments: js.UndefOr[js.Array[typings.openui5.sapUiUnifiedCalendarAppointmentMod.default]] = js.undefined
  }
  object SinglePlanningCalendar$AppointmentSelectEventParameters {
    
    inline def apply(): SinglePlanningCalendar$AppointmentSelectEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SinglePlanningCalendar$AppointmentSelectEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SinglePlanningCalendar$AppointmentSelectEventParameters] (val x: Self) extends AnyVal {
      
      inline def setAppointment(value: typings.openui5.sapUiUnifiedCalendarAppointmentMod.default): Self = StObject.set(x, "appointment", value.asInstanceOf[js.Any])
      
      inline def setAppointmentUndefined: Self = StObject.set(x, "appointment", js.undefined)
      
      inline def setAppointments(value: js.Array[typings.openui5.sapUiUnifiedCalendarAppointmentMod.default]): Self = StObject.set(x, "appointments", value.asInstanceOf[js.Any])
      
      inline def setAppointmentsUndefined: Self = StObject.set(x, "appointments", js.undefined)
      
      inline def setAppointmentsVarargs(value: typings.openui5.sapUiUnifiedCalendarAppointmentMod.default*): Self = StObject.set(x, "appointments", js.Array(value*))
    }
  }
  
  trait SinglePlanningCalendar$CellPressEventParameters extends StObject {
    
    /**
      * The end date as a UI5Date or JavaScript Date object of the focused grid cell.
      */
    var endDate: js.UndefOr[js.Object] = js.undefined
    
    /**
      * The start date as a UI5Date or JavaScript Date object of the focused grid cell.
      */
    var startDate: js.UndefOr[js.Object] = js.undefined
  }
  object SinglePlanningCalendar$CellPressEventParameters {
    
    inline def apply(): SinglePlanningCalendar$CellPressEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SinglePlanningCalendar$CellPressEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SinglePlanningCalendar$CellPressEventParameters] (val x: Self) extends AnyVal {
      
      inline def setEndDate(value: js.Object): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      inline def setStartDate(value: js.Object): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    }
  }
  
  trait SinglePlanningCalendar$HeaderDateSelectEventParameters extends StObject {
    
    /**
      * Date of the selected header, as a UI5Date or JavaScript Date object. It is considered as a local date.
      */
    var date: js.UndefOr[js.Object] = js.undefined
  }
  object SinglePlanningCalendar$HeaderDateSelectEventParameters {
    
    inline def apply(): SinglePlanningCalendar$HeaderDateSelectEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SinglePlanningCalendar$HeaderDateSelectEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SinglePlanningCalendar$HeaderDateSelectEventParameters] (val x: Self) extends AnyVal {
      
      inline def setDate(value: js.Object): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    }
  }
  
  trait SinglePlanningCalendar$MoreLinkPressEventParameters extends StObject {
    
    /**
      * The date as a UI5Date or JavaScript Date object of the cell with the pressed more link.
      */
    var date: js.UndefOr[js.Object] = js.undefined
  }
  object SinglePlanningCalendar$MoreLinkPressEventParameters {
    
    inline def apply(): SinglePlanningCalendar$MoreLinkPressEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SinglePlanningCalendar$MoreLinkPressEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SinglePlanningCalendar$MoreLinkPressEventParameters] (val x: Self) extends AnyVal {
      
      inline def setDate(value: js.Object): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    }
  }
  
  trait SinglePlanningCalendar$StartDateChangeEventParameters extends StObject {
    
    /**
      * The new start date, as a UI5Date or JavaScript Date object. It is considered as a local date.
      */
    var date: js.UndefOr[js.Object] = js.undefined
  }
  object SinglePlanningCalendar$StartDateChangeEventParameters {
    
    inline def apply(): SinglePlanningCalendar$StartDateChangeEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SinglePlanningCalendar$StartDateChangeEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SinglePlanningCalendar$StartDateChangeEventParameters] (val x: Self) extends AnyVal {
      
      inline def setDate(value: js.Object): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    }
  }
  
  trait SinglePlanningCalendar$ViewChangeEventParameters extends StObject
  
  type SinglePlanningCalendarAppointmentCreateEvent = typings.openui5.sapUiBaseEventMod.default[SinglePlanningCalendar$AppointmentCreateEventParameters]
  
  type SinglePlanningCalendarAppointmentCreateEventParameters = SinglePlanningCalendar$AppointmentCreateEventParameters
  
  type SinglePlanningCalendarAppointmentDropEvent = typings.openui5.sapUiBaseEventMod.default[SinglePlanningCalendar$AppointmentDropEventParameters]
  
  type SinglePlanningCalendarAppointmentDropEventParameters = SinglePlanningCalendar$AppointmentDropEventParameters
  
  type SinglePlanningCalendarAppointmentResizeEvent = typings.openui5.sapUiBaseEventMod.default[SinglePlanningCalendar$AppointmentResizeEventParameters]
  
  type SinglePlanningCalendarAppointmentResizeEventParameters = SinglePlanningCalendar$AppointmentResizeEventParameters
  
  type SinglePlanningCalendarAppointmentSelectEvent = typings.openui5.sapUiBaseEventMod.default[SinglePlanningCalendar$AppointmentSelectEventParameters]
  
  type SinglePlanningCalendarAppointmentSelectEventParameters = SinglePlanningCalendar$AppointmentSelectEventParameters
  
  type SinglePlanningCalendarCellPressEvent = typings.openui5.sapUiBaseEventMod.default[SinglePlanningCalendar$CellPressEventParameters]
  
  type SinglePlanningCalendarCellPressEventParameters = SinglePlanningCalendar$CellPressEventParameters
  
  type SinglePlanningCalendarHeaderDateSelectEvent = typings.openui5.sapUiBaseEventMod.default[SinglePlanningCalendar$HeaderDateSelectEventParameters]
  
  type SinglePlanningCalendarHeaderDateSelectEventParameters = SinglePlanningCalendar$HeaderDateSelectEventParameters
  
  type SinglePlanningCalendarMoreLinkPressEvent = typings.openui5.sapUiBaseEventMod.default[SinglePlanningCalendar$MoreLinkPressEventParameters]
  
  type SinglePlanningCalendarMoreLinkPressEventParameters = SinglePlanningCalendar$MoreLinkPressEventParameters
  
  trait SinglePlanningCalendarSettings
    extends StObject
       with ControlSettings {
    
    /**
      * The controls to be passed to the toolbar.
      */
    var actions: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.65
      *
      * Fired if an appointment is created.
      */
    var appointmentCreate: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[SinglePlanningCalendar$AppointmentCreateEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * @since 1.64
      *
      * Fired if an appointment is dropped.
      */
    var appointmentDrop: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[SinglePlanningCalendar$AppointmentDropEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * @since 1.65
      *
      * Fired when an appointment is resized.
      */
    var appointmentResize: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[SinglePlanningCalendar$AppointmentResizeEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Fired when the selected state of an appointment is changed.
      */
    var appointmentSelect: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[SinglePlanningCalendar$AppointmentSelectEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * The appointments to be displayed in the grid. Appointments outside the visible time frame are not rendered.
      * Appointments, longer than a day, will be displayed in all of the affected days. To display an all-day
      * appointment, the appointment must start at 00:00 and end on any day in the future in 00:00h.
      *
      * Note: The `customContent` functionality of the `CalendarAppointment` is not available in the `SinglePlanningCalendar`.
      * If set, it will not make any effect.
      */
    var appointments: js.UndefOr[
        js.Array[typings.openui5.sapUiUnifiedCalendarAppointmentMod.default] | typings.openui5.sapUiUnifiedCalendarAppointmentMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.110.0
      *
      * If set, the calendar week numbering is used for display. If not set, the calendar week numbering of the
      * global configuration is used. Note: This property should not be used with firstDayOfWeek property.
      */
    var calendarWeekNumbering: js.UndefOr[
        CalendarWeekNumbering | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarWeekNumbering * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @since 1.65
      *
      * Fired when a grid cell is pressed.
      */
    var cellPress: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[SinglePlanningCalendar$CellPressEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Determines whether more than one day will be selectable. **Note:** selecting more than one day is possible
      * with a combination of `Ctrl + mouse click`
      */
    var dateSelectionMode: js.UndefOr[
        SinglePlanningCalendarSelectionMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SinglePlanningCalendarSelectionMode * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @since 1.65
      *
      * Determines whether the appointments can be created by dragging on empty cells.
      *
      * See {@link #property:enableAppointmentsResize enableAppointmentsResize} for the specific points for events
      * snapping
      */
    var enableAppointmentsCreate: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.64
      *
      * Determines whether the appointments in the grid are draggable.
      *
      * The drag and drop interaction is visualized by a placeholder highlighting the area where the appointment
      * can be dropped by the user.
      */
    var enableAppointmentsDragAndDrop: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.65
      *
      * Determines whether the appointments are resizable.
      *
      * The resize interaction is visualized by making the appointment transparent.
      *
      * The appointment snaps on every interval of 30 minutes. After the resize is finished, the {@link #event:appointmentResize appointmentResize }
      * event is fired, containing the new start and end UI5Date or JavaScript Date objects.
      */
    var enableAppointmentsResize: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines the end hour of the grid to be shown if the `fullDay` property is set to `false`. Otherwise
      * the next hours are displayed as non-working. The passed hour is considered as 24-hour based.
      */
    var endHour: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @since 1.98
      *
      * If set, the first day of the displayed week is this day. Valid values are 0 to 6 starting on Sunday.
      * If there is no valid value set, the default of the used locale is used.
      *
      * Note: This property will only have effect in Week view and Month view of the SinglePlanningCalendar,
      * but it wouldn't have effect in WorkWeek view. This property should not be used with the calendarWeekNumbering
      * property.
      */
    var firstDayOfWeek: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Determines if all of the hours in a day are displayed. If set to `false`, the hours shown are between
      * the `startHour` and `endHour`.
      */
    var fullDay: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Fired if a date is selected in the calendar header.
      */
    var headerDateSelect: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[SinglePlanningCalendar$HeaderDateSelectEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * @since 1.65.0
      *
      * Association to the `PlanningCalendarLegend` explaining the colors of the `Appointments`.
      *
      * **Note:** The legend does not have to be rendered but must exist and all required types must be assigned.
      */
    var legend: js.UndefOr[typings.openui5.sapMPlanningCalendarLegendMod.default | String] = js.undefined
    
    /**
      * Fired when a 'more' button is pressed. **Note:** The 'more' button appears in a month view cell when
      * multiple appointments exist and the available space is not sufficient to display all of them.
      */
    var moreLinkPress: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[SinglePlanningCalendar$MoreLinkPressEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * @since 1.99
      *
      * Determines scale factor for the appointments.
      *
      * Acceptable range is from 1 to 6.
      */
    var scaleFactor: js.UndefOr[
        float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Dates or date ranges for selected dates.
      *
      * To set a single date (instead of a range), set only the `startDate` property of the {@link sap.ui.unified.DateRange }
      * class.
      */
    var selectedDates: js.UndefOr[
        js.Array[typings.openui5.sapUiUnifiedDateRangeMod.default] | typings.openui5.sapUiUnifiedDateRangeMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Corresponds to the currently selected view.
      */
    var selectedView: js.UndefOr[typings.openui5.sapMSinglePlanningCalendarViewMod.default | String] = js.undefined
    
    /**
      * @since 1.66
      *
      * Special days in the header visualized as a date range with type.
      *
      * **Note:** If one day is assigned to more than one type, only the first type is used.
      */
    var specialDates: js.UndefOr[
        js.Array[typings.openui5.sapUiUnifiedDateTypeRangeMod.default] | typings.openui5.sapUiUnifiedDateTypeRangeMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines the start date of the grid, as a UI5Date or JavaScript Date object. It is considered as a
      * local date. The time part will be ignored. The current date is used as default.
      */
    var startDate: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * `startDate` is changed while navigating in the `SinglePlanningCalendar`.
      */
    var startDateChange: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[SinglePlanningCalendar$StartDateChangeEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Determines the start hour of the grid to be shown if the `fullDay` property is set to `false`. Otherwise
      * the previous hours are displayed as non-working. The passed hour is considered as 24-hour based.
      */
    var startHour: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @since 1.62
      *
      * Determines which part of the control will remain fixed at the top of the page during vertical scrolling
      * as long as the control is in the viewport.
      *
      * **Note:** Limited browser support. Browsers which do not support this feature:
      * 	 - Microsoft Internet Explorer
      * 	 - Microsoft Edge lower than version 41 (EdgeHTML 16)
      * 	 - Mozilla Firefox lower than version 59
      */
    var stickyMode: js.UndefOr[
        PlanningCalendarStickyMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlanningCalendarStickyMode * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Determines the title of the `SinglePlanningCalendar`.
      */
    var title: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @since 1.71.0
      *
      * The view was changed by user interaction.
      */
    var viewChange: js.UndefOr[
        js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
      ] = js.undefined
    
    /**
      * Views of the `SinglePlanningCalendar`.
      *
      * **Note:** If not set, the Week view is available.
      */
    var views: js.UndefOr[
        js.Array[typings.openui5.sapMSinglePlanningCalendarViewMod.default] | typings.openui5.sapMSinglePlanningCalendarViewMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object SinglePlanningCalendarSettings {
    
    inline def apply(): SinglePlanningCalendarSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SinglePlanningCalendarSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SinglePlanningCalendarSettings] (val x: Self) extends AnyVal {
      
      inline def setActions(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setActionsVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setAppointmentCreate(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[SinglePlanningCalendar$AppointmentCreateEventParameters] => Unit
      ): Self = StObject.set(x, "appointmentCreate", js.Any.fromFunction1(value))
      
      inline def setAppointmentCreateUndefined: Self = StObject.set(x, "appointmentCreate", js.undefined)
      
      inline def setAppointmentDrop(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[SinglePlanningCalendar$AppointmentDropEventParameters] => Unit
      ): Self = StObject.set(x, "appointmentDrop", js.Any.fromFunction1(value))
      
      inline def setAppointmentDropUndefined: Self = StObject.set(x, "appointmentDrop", js.undefined)
      
      inline def setAppointmentResize(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[SinglePlanningCalendar$AppointmentResizeEventParameters] => Unit
      ): Self = StObject.set(x, "appointmentResize", js.Any.fromFunction1(value))
      
      inline def setAppointmentResizeUndefined: Self = StObject.set(x, "appointmentResize", js.undefined)
      
      inline def setAppointmentSelect(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[SinglePlanningCalendar$AppointmentSelectEventParameters] => Unit
      ): Self = StObject.set(x, "appointmentSelect", js.Any.fromFunction1(value))
      
      inline def setAppointmentSelectUndefined: Self = StObject.set(x, "appointmentSelect", js.undefined)
      
      inline def setAppointments(
        value: js.Array[typings.openui5.sapUiUnifiedCalendarAppointmentMod.default] | typings.openui5.sapUiUnifiedCalendarAppointmentMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "appointments", value.asInstanceOf[js.Any])
      
      inline def setAppointmentsUndefined: Self = StObject.set(x, "appointments", js.undefined)
      
      inline def setAppointmentsVarargs(value: typings.openui5.sapUiUnifiedCalendarAppointmentMod.default*): Self = StObject.set(x, "appointments", js.Array(value*))
      
      inline def setCalendarWeekNumbering(
        value: CalendarWeekNumbering | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarWeekNumbering * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "calendarWeekNumbering", value.asInstanceOf[js.Any])
      
      inline def setCalendarWeekNumberingUndefined: Self = StObject.set(x, "calendarWeekNumbering", js.undefined)
      
      inline def setCellPress(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[SinglePlanningCalendar$CellPressEventParameters] => Unit
      ): Self = StObject.set(x, "cellPress", js.Any.fromFunction1(value))
      
      inline def setCellPressUndefined: Self = StObject.set(x, "cellPress", js.undefined)
      
      inline def setDateSelectionMode(
        value: SinglePlanningCalendarSelectionMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SinglePlanningCalendarSelectionMode * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "dateSelectionMode", value.asInstanceOf[js.Any])
      
      inline def setDateSelectionModeUndefined: Self = StObject.set(x, "dateSelectionMode", js.undefined)
      
      inline def setEnableAppointmentsCreate(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enableAppointmentsCreate", value.asInstanceOf[js.Any])
      
      inline def setEnableAppointmentsCreateUndefined: Self = StObject.set(x, "enableAppointmentsCreate", js.undefined)
      
      inline def setEnableAppointmentsDragAndDrop(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enableAppointmentsDragAndDrop", value.asInstanceOf[js.Any])
      
      inline def setEnableAppointmentsDragAndDropUndefined: Self = StObject.set(x, "enableAppointmentsDragAndDrop", js.undefined)
      
      inline def setEnableAppointmentsResize(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enableAppointmentsResize", value.asInstanceOf[js.Any])
      
      inline def setEnableAppointmentsResizeUndefined: Self = StObject.set(x, "enableAppointmentsResize", js.undefined)
      
      inline def setEndHour(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "endHour", value.asInstanceOf[js.Any])
      
      inline def setEndHourUndefined: Self = StObject.set(x, "endHour", js.undefined)
      
      inline def setFirstDayOfWeek(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
      
      inline def setFirstDayOfWeekUndefined: Self = StObject.set(x, "firstDayOfWeek", js.undefined)
      
      inline def setFullDay(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "fullDay", value.asInstanceOf[js.Any])
      
      inline def setFullDayUndefined: Self = StObject.set(x, "fullDay", js.undefined)
      
      inline def setHeaderDateSelect(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[SinglePlanningCalendar$HeaderDateSelectEventParameters] => Unit
      ): Self = StObject.set(x, "headerDateSelect", js.Any.fromFunction1(value))
      
      inline def setHeaderDateSelectUndefined: Self = StObject.set(x, "headerDateSelect", js.undefined)
      
      inline def setLegend(value: typings.openui5.sapMPlanningCalendarLegendMod.default | String): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
      
      inline def setMoreLinkPress(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[SinglePlanningCalendar$MoreLinkPressEventParameters] => Unit
      ): Self = StObject.set(x, "moreLinkPress", js.Any.fromFunction1(value))
      
      inline def setMoreLinkPressUndefined: Self = StObject.set(x, "moreLinkPress", js.undefined)
      
      inline def setScaleFactor(value: float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "scaleFactor", value.asInstanceOf[js.Any])
      
      inline def setScaleFactorUndefined: Self = StObject.set(x, "scaleFactor", js.undefined)
      
      inline def setSelectedDates(
        value: js.Array[typings.openui5.sapUiUnifiedDateRangeMod.default] | typings.openui5.sapUiUnifiedDateRangeMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "selectedDates", value.asInstanceOf[js.Any])
      
      inline def setSelectedDatesUndefined: Self = StObject.set(x, "selectedDates", js.undefined)
      
      inline def setSelectedDatesVarargs(value: typings.openui5.sapUiUnifiedDateRangeMod.default*): Self = StObject.set(x, "selectedDates", js.Array(value*))
      
      inline def setSelectedView(value: typings.openui5.sapMSinglePlanningCalendarViewMod.default | String): Self = StObject.set(x, "selectedView", value.asInstanceOf[js.Any])
      
      inline def setSelectedViewUndefined: Self = StObject.set(x, "selectedView", js.undefined)
      
      inline def setSpecialDates(
        value: js.Array[typings.openui5.sapUiUnifiedDateTypeRangeMod.default] | typings.openui5.sapUiUnifiedDateTypeRangeMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "specialDates", value.asInstanceOf[js.Any])
      
      inline def setSpecialDatesUndefined: Self = StObject.set(x, "specialDates", js.undefined)
      
      inline def setSpecialDatesVarargs(value: typings.openui5.sapUiUnifiedDateTypeRangeMod.default*): Self = StObject.set(x, "specialDates", js.Array(value*))
      
      inline def setStartDate(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setStartDateChange(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[SinglePlanningCalendar$StartDateChangeEventParameters] => Unit
      ): Self = StObject.set(x, "startDateChange", js.Any.fromFunction1(value))
      
      inline def setStartDateChangeUndefined: Self = StObject.set(x, "startDateChange", js.undefined)
      
      inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
      
      inline def setStartHour(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "startHour", value.asInstanceOf[js.Any])
      
      inline def setStartHourUndefined: Self = StObject.set(x, "startHour", js.undefined)
      
      inline def setStickyMode(
        value: PlanningCalendarStickyMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlanningCalendarStickyMode * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "stickyMode", value.asInstanceOf[js.Any])
      
      inline def setStickyModeUndefined: Self = StObject.set(x, "stickyMode", js.undefined)
      
      inline def setTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setViewChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object] => Unit): Self = StObject.set(x, "viewChange", js.Any.fromFunction1(value))
      
      inline def setViewChangeUndefined: Self = StObject.set(x, "viewChange", js.undefined)
      
      inline def setViews(
        value: js.Array[typings.openui5.sapMSinglePlanningCalendarViewMod.default] | typings.openui5.sapMSinglePlanningCalendarViewMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
      
      inline def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
      
      inline def setViewsVarargs(value: typings.openui5.sapMSinglePlanningCalendarViewMod.default*): Self = StObject.set(x, "views", js.Array(value*))
    }
  }
  
  type SinglePlanningCalendarStartDateChangeEvent = typings.openui5.sapUiBaseEventMod.default[SinglePlanningCalendar$StartDateChangeEventParameters]
  
  type SinglePlanningCalendarStartDateChangeEventParameters = SinglePlanningCalendar$StartDateChangeEventParameters
  
  type SinglePlanningCalendarViewChangeEvent = typings.openui5.sapUiBaseEventMod.default[SinglePlanningCalendar$ViewChangeEventParameters]
  
  type SinglePlanningCalendarViewChangeEventParameters = SinglePlanningCalendar$ViewChangeEventParameters
}
