package typings.openui5

import typings.openui5.anon.Appointment
import typings.openui5.anon.HeaderId
import typings.openui5.anon.Rows
import typings.openui5.anon.StartDate
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreCalendarTypeMod.CalendarType
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreDateCalendarWeekNumberingMod.CalendarWeekNumbering
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiUnifiedLibraryMod.CalendarAppointmentHeight
import typings.openui5.sapUiUnifiedLibraryMod.CalendarAppointmentRoundWidth
import typings.openui5.sapUiUnifiedLibraryMod.CalendarAppointmentVisualization
import typings.openui5.sapUiUnifiedLibraryMod.GroupAppointmentsMode
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMPlanningCalendarMod {
  
  @JSImport("sap/m/PlanningCalendar", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `PlanningCalendar`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/planning-calendar/ Planning Calendar}
    */
  open class default () extends PlanningCalendar {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: PlanningCalendarSettings) = this()
    def this(/**
      * ID for the new control, generated automatically if no ID is given
      */
    sID: String) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sID: String,
      /**
      * Initial settings for the new control
      */
    mSettings: PlanningCalendarSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sID: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: PlanningCalendarSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/PlanningCalendar", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.PlanningCalendar with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, PlanningCalendar]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, PlanningCalendar],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.PlanningCalendar.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait PlanningCalendar
    extends typings.openui5.sapUiCoreControlMod.default {
    
    def addAriaLabelledBy(
      /**
      * The ariaLabelledBy to add; if empty, nothing is inserted
      */
    vAriaLabelledBy: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * @SINCE 1.40.0
      *
      * Adds some ariaLabelledBy into the association {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAriaLabelledBy(/**
      * The ariaLabelledBy to add; if empty, nothing is inserted
      */
    vAriaLabelledBy: ID): this.type = js.native
    
    /**
      * Adds some row to the aggregation {@link #getRows rows}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addRow(
      /**
      * The row to add; if empty, nothing is inserted
      */
    oRow: typings.openui5.sapMPlanningCalendarRowMod.default
    ): this.type = js.native
    
    /**
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
      * Adds some toolbarContent to the aggregation {@link #getToolbarContent toolbarContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addToolbarContent(
      /**
      * The toolbarContent to add; if empty, nothing is inserted
      */
    oToolbarContent: typings.openui5.sapUiCoreControlMod.default
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
    oView: typings.openui5.sapMPlanningCalendarViewMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:appointmentSelect appointmentSelect} event of
      * this `sap.m.PlanningCalendar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.PlanningCalendar` itself.
      *
      * Fired if an appointment is selected.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAppointmentSelect(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachAppointmentSelect(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.PlanningCalendar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:appointmentSelect appointmentSelect} event of
      * this `sap.m.PlanningCalendar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.PlanningCalendar` itself.
      *
      * Fired if an appointment is selected.
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.PlanningCalendar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:intervalSelect intervalSelect} event of this
      * `sap.m.PlanningCalendar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.PlanningCalendar` itself.
      *
      * Fired if an interval was selected in the calendar header or in the row.
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
      * Context object to call the event handler with. Defaults to this `sap.m.PlanningCalendar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:intervalSelect intervalSelect} event of this
      * `sap.m.PlanningCalendar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.PlanningCalendar` itself.
      *
      * Fired if an interval was selected in the calendar header or in the row.
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
      * Context object to call the event handler with. Defaults to this `sap.m.PlanningCalendar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.46.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:rowHeaderClick rowHeaderClick} event of this
      * `sap.m.PlanningCalendar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.PlanningCalendar` itself.
      *
      * Fires when a row header is clicked.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachRowHeaderClick(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachRowHeaderClick(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.PlanningCalendar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.46.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:rowHeaderClick rowHeaderClick} event of this
      * `sap.m.PlanningCalendar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.PlanningCalendar` itself.
      *
      * Fires when a row header is clicked.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachRowHeaderClick(
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
    def attachRowHeaderClick(
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
      * Context object to call the event handler with. Defaults to this `sap.m.PlanningCalendar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:rowSelectionChange rowSelectionChange} event
      * of this `sap.m.PlanningCalendar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.PlanningCalendar` itself.
      *
      * Fires when row selection is changed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachRowSelectionChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachRowSelectionChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.PlanningCalendar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:rowSelectionChange rowSelectionChange} event
      * of this `sap.m.PlanningCalendar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.PlanningCalendar` itself.
      *
      * Fires when row selection is changed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachRowSelectionChange(
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
    def attachRowSelectionChange(
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
      * Context object to call the event handler with. Defaults to this `sap.m.PlanningCalendar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:startDateChange startDateChange} event of this
      * `sap.m.PlanningCalendar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.PlanningCalendar` itself.
      *
      * Fired when the `startDate` property was changed while navigating in the `PlanningCalendar`. The new value
      * can be obtained using the `sap.m.PlanningCalendar#getStartDate()` method. **Note:** This event is fired
      * in case when the `viewKey` property is changed, and as a result of which the view requires a change in
      * the `startDate` property.
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
      * Context object to call the event handler with. Defaults to this `sap.m.PlanningCalendar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:startDateChange startDateChange} event of this
      * `sap.m.PlanningCalendar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.PlanningCalendar` itself.
      *
      * Fired when the `startDate` property was changed while navigating in the `PlanningCalendar`. The new value
      * can be obtained using the `sap.m.PlanningCalendar#getStartDate()` method. **Note:** This event is fired
      * in case when the `viewKey` property is changed, and as a result of which the view requires a change in
      * the `startDate` property.
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
      * Context object to call the event handler with. Defaults to this `sap.m.PlanningCalendar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:viewChange viewChange} event of this `sap.m.PlanningCalendar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.PlanningCalendar` itself.
      *
      * Fired when the `viewKey` property was changed by user interaction.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachViewChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachViewChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.PlanningCalendar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:viewChange viewChange} event of this `sap.m.PlanningCalendar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.PlanningCalendar` itself.
      *
      * Fired when the `viewKey` property was changed by user interaction.
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.PlanningCalendar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys all the rows in the aggregation {@link #getRows rows}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyRows(): this.type = js.native
    
    /**
      * Destroys all the specialDates in the aggregation {@link #getSpecialDates specialDates}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroySpecialDates(): this.type = js.native
    
    /**
      * Destroys all the toolbarContent in the aggregation {@link #getToolbarContent toolbarContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyToolbarContent(): this.type = js.native
    
    /**
      * Destroys all the views in the aggregation {@link #getViews views}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyViews(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:appointmentSelect appointmentSelect} event
      * of this `sap.m.PlanningCalendar`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachAppointmentSelect(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachAppointmentSelect(
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
      * Detaches event handler `fnFunction` from the {@link #event:intervalSelect intervalSelect} event of this
      * `sap.m.PlanningCalendar`.
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
      * @SINCE 1.46.0
      *
      * Detaches event handler `fnFunction` from the {@link #event:rowHeaderClick rowHeaderClick} event of this
      * `sap.m.PlanningCalendar`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachRowHeaderClick(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachRowHeaderClick(
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
      * Detaches event handler `fnFunction` from the {@link #event:rowSelectionChange rowSelectionChange} event
      * of this `sap.m.PlanningCalendar`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachRowSelectionChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachRowSelectionChange(
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
      * this `sap.m.PlanningCalendar`.
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
      * Detaches event handler `fnFunction` from the {@link #event:viewChange viewChange} event of this `sap.m.PlanningCalendar`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachViewChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachViewChange(
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
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:appointmentSelect appointmentSelect} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireAppointmentSelect(): this.type = js.native
    def fireAppointmentSelect(/**
      * Parameters to pass along with the event
      */
    mParameters: Appointment): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:intervalSelect intervalSelect} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireIntervalSelect(): this.type = js.native
    def fireIntervalSelect(/**
      * Parameters to pass along with the event
      */
    mParameters: StartDate): this.type = js.native
    
    /**
      * @SINCE 1.46.0
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:rowHeaderClick rowHeaderClick} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireRowHeaderClick(): this.type = js.native
    def fireRowHeaderClick(/**
      * Parameters to pass along with the event
      */
    mParameters: HeaderId): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:rowSelectionChange rowSelectionChange} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireRowSelectionChange(): this.type = js.native
    def fireRowSelectionChange(/**
      * Parameters to pass along with the event
      */
    mParameters: Rows): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
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
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
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
      * @SINCE 1.81.0
      *
      * Gets current value of property {@link #getAppointmentHeight appointmentHeight}.
      *
      * Determines the different possible sizes for appointments.
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
      * Defines rounding of the width `CalendarAppoinment` **Note:** This property is applied, when the calendar
      * interval type is day and the view shows more than 20 days
      *
      * Default value is `None`.
      *
      * @returns Value of property `appointmentRoundWidth`
      */
    def getAppointmentRoundWidth(): CalendarAppointmentRoundWidth | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarAppointmentRoundWidth * / any */ String) = js.native
    
    /**
      * @SINCE 1.38.0
      *
      * Gets current value of property {@link #getAppointmentsReducedHeight appointmentsReducedHeight}.
      *
      * Determines whether the appointments that have only title without text are rendered with smaller height.
      *
      * **Note:** On phone devices this property is ignored, appointments are always rendered in full height
      * to facilitate touching.
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
      * Determines how the appointments are visualized depending on the used theme.
      *
      * Default value is `Standard`.
      *
      * @returns Value of property `appointmentsVisualization`
      */
    def getAppointmentsVisualization(): CalendarAppointmentVisualization | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarAppointmentVisualization * / any */ String) = js.native
    
    /**
      * @SINCE 1.40.0
      *
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaLabelledBy
      * ariaLabelledBy}.
      */
    def getAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * @SINCE 1.50
      *
      * Gets current value of property {@link #getBuiltInViews builtInViews}.
      *
      * Defines the list of predefined views as an array. The views should be specified by their keys.
      *
      * The default predefined views and their keys are available at {@link sap.m.PlanningCalendarBuiltInView}.
      *
      * **Note:** If set, all specified views will be displayed along with any custom views (if available). If
      * not set and no custom views are available, all default views will be displayed. If not set and there
      * are any custom views available, only the custom views will be displayed.
      *
      * Default value is `[]`.
      *
      * @returns Value of property `builtInViews`
      */
    def getBuiltInViews(): js.Array[String] = js.native
    
    /**
      * @SINCE 1.110.0
      *
      * Gets current value of property {@link #getCalendarWeekNumbering calendarWeekNumbering}.
      *
      * If set, the calendar week numbering is used for display. If not set, the calendar week numbering of the
      * global configuration is used.
      *
      * @returns Value of property `calendarWeekNumbering`
      */
    def getCalendarWeekNumbering(): CalendarWeekNumbering | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarWeekNumbering * / any */ String) = js.native
    
    /**
      * @SINCE 1.54
      *
      * Getter for custom appointments sorter (if any).
      */
    def getCustomAppointmentsSorterCallback(): appointmentsSorterCallback = js.native
    
    /**
      * @SINCE 1.87
      *
      * Getter for the end point in time of the shown interval
      *
      * @returns JavaScript date object with the end date
      */
    def getEndDate(): js.Date = js.native
    
    /**
      * @SINCE 1.94
      *
      * Gets current value of property {@link #getFirstDayOfWeek firstDayOfWeek}.
      *
      * If set, the first day of the displayed week is this day. Valid values are 0 to 6 starting on Sunday.
      * If there is no valid value set, the default of the used locale is used.
      *
      * Note: this property will only have effect in the weekly – based views of the PlanningCalendar – Week
      * view, and OneMonth view (on small devices).
      *
      * Default value is `-1`.
      *
      * @returns Value of property `firstDayOfWeek`
      */
    def getFirstDayOfWeek(): int = js.native
    
    /**
      * @SINCE 1.48.0
      *
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
      * Specifies the height of the `PlanningCalendar`. **Note:** If the set height is less than the displayed
      * content, it will not be applied
      *
      * @returns Value of property `height`
      */
    def getHeight(): CSSSize = js.native
    
    /**
      * @SINCE 1.40.0
      *
      * ID of the element which is the current target of the association {@link #getLegend legend}, or `null`.
      */
    def getLegend(): ID = js.native
    
    /**
      * @SINCE 1.38.0
      *
      * Gets current value of property {@link #getMaxDate maxDate}.
      *
      * Defines the maximum date that can be displayed and selected in the `PlanningCalendar`. This must be a
      * JavaScript date object.
      *
      * **Note:** If the `maxDate` is set to be before the current `minDate`, the `minDate` is set to the first
      * date of the month in which the `maxDate` belongs.
      *
      * @returns Value of property `maxDate`
      */
    def getMaxDate(): js.Object = js.native
    
    /**
      * @SINCE 1.38.0
      *
      * Gets current value of property {@link #getMinDate minDate}.
      *
      * Defines the minimum date that can be displayed and selected in the `PlanningCalendar`. This must be a
      * JavaScript date object.
      *
      * **Note:** If the `minDate` is set to be after the current `maxDate`, the `maxDate` is set to the last
      * date of the month in which the `minDate` belongs.
      *
      * @returns Value of property `minDate`
      */
    def getMinDate(): js.Object = js.native
    
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
      * Gets current value of property {@link #getNoDataText noDataText}.
      *
      * Defines the text that is displayed when no {@link sap.m.PlanningCalendarRow PlanningCalendarRows} are
      * assigned.
      *
      * @returns Value of property `noDataText`
      */
    def getNoDataText(): String = js.native
    
    /**
      * @SINCE 1.108.0
      *
      * Gets current value of property {@link #getPrimaryCalendarType primaryCalendarType}.
      *
      * If set, the calendar type is used for display. If not set, the calendar type of the global configuration
      * is used.
      *
      * @returns Value of property `primaryCalendarType`
      */
    def getPrimaryCalendarType(): CalendarType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String) = js.native
    
    /**
      * Gets content of aggregation {@link #getRows rows}.
      *
      * Rows of the `PlanningCalendar`.
      */
    def getRows(): js.Array[typings.openui5.sapMPlanningCalendarRowMod.default] = js.native
    
    /**
      * @SINCE 1.109.0
      *
      * Gets current value of property {@link #getSecondaryCalendarType secondaryCalendarType}.
      *
      * If set, the days are also represented in this calendar type. If not set, the dates are only represented
      * in the primary calendar type. Note: The second calendar type won't be represented in the DOM when this
      * property is not set explicitly.
      *
      * @returns Value of property `secondaryCalendarType`
      */
    def getSecondaryCalendarType(): CalendarType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String) = js.native
    
    /**
      * @SINCE 1.54
      *
      * Holds the selected appointments. If no appointments are selected, an empty array is returned.
      *
      * @returns Array of IDs of selected appointments
      */
    def getSelectedAppointments(): js.Array[typings.openui5.sapUiUnifiedCalendarAppointmentMod.default] = js.native
    
    /**
      * Returns an array containing the selected rows. If no row is selected, an empty array is returned.
      *
      * @returns selected rows
      */
    def getSelectedRows(): js.Array[typings.openui5.sapMPlanningCalendarRowMod.default] = js.native
    
    /**
      * @SINCE 1.50
      *
      * Gets current value of property {@link #getShowDayNamesLine showDayNamesLine}.
      *
      * Determines whether the day names are displayed in a separate line or inside the single days.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showDayNamesLine`
      */
    def getShowDayNamesLine(): Boolean = js.native
    
    /**
      * @SINCE 1.38.0
      *
      * Gets current value of property {@link #getShowEmptyIntervalHeaders showEmptyIntervalHeaders}.
      *
      * Determines whether the space (at the top of the intervals), where the assigned interval headers appear,
      * should remain visible even when no interval headers are present in the visible time frame. If set to
      * `false`, this space would collapse/disappear when no interval headers are assigned.
      *
      * **Note:** This property takes effect, only if `showIntervalHeaders` is also set to `true`.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showEmptyIntervalHeaders`
      */
    def getShowEmptyIntervalHeaders(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowIntervalHeaders showIntervalHeaders}.
      *
      * Determines whether the assigned interval headers are displayed. You can assign them using the `intervalHeaders`
      * aggregation of the {@link sap.m.PlanningCalendarRow PlanningCalendarRow}.
      *
      * **Note:** If you set both `showIntervalHeaders` and `showEmptyIntervalHeaders` properties to `true`,
      * the space (at the top of the intervals) where the assigned interval headers appear, will remain visible
      * even if no interval headers are assigned.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showIntervalHeaders`
      */
    def getShowIntervalHeaders(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowRowHeaders showRowHeaders}.
      *
      * Determines whether the column containing the headers of the {@link sap.m.PlanningCalendarRow PlanningCalendarRows}
      * is displayed.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showRowHeaders`
      */
    def getShowRowHeaders(): Boolean = js.native
    
    /**
      * @SINCE 1.52
      *
      * Gets current value of property {@link #getShowWeekNumbers showWeekNumbers}.
      *
      * Determines if the week numbers are displayed.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showWeekNumbers`
      */
    def getShowWeekNumbers(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getSingleSelection singleSelection}.
      *
      * Determines whether only a single row can be selected.
      *
      * Default value is `true`.
      *
      * @returns Value of property `singleSelection`
      */
    def getSingleSelection(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getSpecialDates specialDates}.
      *
      * Special days in the header calendar visualized as date range with a type.
      *
      * **Note:** If one day is assigned to more than one type, only the first type will be used.
      */
    def getSpecialDates(): js.Array[typings.openui5.sapUiUnifiedDateTypeRangeMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getStartDate startDate}.
      *
      * Determines the start date of the row, as a JavaScript date object. The current date is used as default.
      *
      * @returns Value of property `startDate`
      */
    def getStartDate(): js.Object = js.native
    
    /**
      * @SINCE 1.54
      *
      * Gets current value of property {@link #getStickyHeader stickyHeader}.
      *
      * Determines whether the header area will remain visible (fixed on top) when the rest of the content is
      * scrolled out of view.
      *
      * The sticky header behavior is automatically disabled on phones in landscape mode for better visibility
      * of the content.
      *
      * **Note:** There is limited browser support, hence the API is in experimental state. Browsers that currently
      * support this feature are Chrome (desktop and mobile), Safari (desktop and mobile) and Edge 41.
      *
      * There are also some known issues with respect to the scrolling behavior and focus handling. A few are
      * given below:
      *
      * When the PlanningCalendar is placed in certain layout containers, for example the `GridLayout` control,
      * the column headers do not fix at the top of the viewport. Similar behavior is also observed with the
      * `ObjectPage` control.
      *
      * This API should not be used in production environment.
      *
      * **Note:** The `stickyHeader` of the `PlanningCalendar` uses the `sticky` property of `sap.m.Table`. Therefore,
      * all features and restrictions of the property in `sap.m.Table` apply to the `PlanningCalendar` as well.
      *
      * Default value is `false`.
      *
      * @returns Value of property `stickyHeader`
      */
    def getStickyHeader(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getToolbarContent toolbarContent}.
      *
      * The content of the toolbar.
      */
    def getToolbarContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getViewKey viewKey}.
      *
      * Defines the key of the `PlanningCalendarView` used for the output.
      *
      * **Note:** The default value is set `Hour`. If you are using your own views, the keys of these views should
      * be used instead.
      *
      * Default value is `CalendarIntervalType.Hour`.
      *
      * @returns Value of property `viewKey`
      */
    def getViewKey(): String = js.native
    
    /**
      * Gets content of aggregation {@link #getViews views}.
      *
      * Views of the `PlanningCalendar`.
      *
      * **Note:** If not set, all the default views are available. Their keys are defined in {@link sap.ui.unified.CalendarIntervalType}.
      */
    def getViews(): js.Array[typings.openui5.sapMPlanningCalendarViewMod.default] = js.native
    
    /**
      * Getter for how many intervals are currently displayed
      *
      * @returns The number of displayed intervals
      */
    def getVisibleIntervalsCount(): Double = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Specifies the width of the `PlanningCalendar`.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * Checks for the provided `sap.m.PlanningCalendarRow` in the aggregation {@link #getRows rows}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfRow(
      /**
      * The row whose index is looked for
      */
    oRow: typings.openui5.sapMPlanningCalendarRowMod.default
    ): int = js.native
    
    /**
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
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getToolbarContent toolbarContent}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfToolbarContent(
      /**
      * The toolbarContent whose index is looked for
      */
    oToolbarContent: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.m.PlanningCalendarView` in the aggregation {@link #getViews views}. and
      * returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfView(
      /**
      * The view whose index is looked for
      */
    oView: typings.openui5.sapMPlanningCalendarViewMod.default
    ): int = js.native
    
    /**
      * Inserts a row into the aggregation {@link #getRows rows}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertRow(
      /**
      * The row to insert; if empty, nothing is inserted
      */
    oRow: typings.openui5.sapMPlanningCalendarRowMod.default,
      /**
      * The `0`-based index the row should be inserted at; for a negative value of `iIndex`, the row is inserted
      * at position 0; for a value greater than the current size of the aggregation, the row is inserted at the
      * last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
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
      * Inserts a toolbarContent into the aggregation {@link #getToolbarContent toolbarContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertToolbarContent(
      /**
      * The toolbarContent to insert; if empty, nothing is inserted
      */
    oToolbarContent: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the toolbarContent should be inserted at; for a negative value of `iIndex`, the toolbarContent
      * is inserted at position 0; for a value greater than the current size of the aggregation, the toolbarContent
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
    oView: typings.openui5.sapMPlanningCalendarViewMod.default,
      /**
      * The `0`-based index the view should be inserted at; for a negative value of `iIndex`, the view is inserted
      * at position 0; for a value greater than the current size of the aggregation, the view is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * @SINCE 1.40.0
      *
      * Removes all the controls in the association named {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getRows rows}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllRows(): js.Array[typings.openui5.sapMPlanningCalendarRowMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getSpecialDates specialDates}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllSpecialDates(): js.Array[typings.openui5.sapUiUnifiedDateTypeRangeMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getToolbarContent toolbarContent}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllToolbarContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getViews views}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllViews(): js.Array[typings.openui5.sapMPlanningCalendarViewMod.default] = js.native
    
    /**
      * @SINCE 1.40.0
      *
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
    
    def removeRow(/**
      * The row to remove or its index or id
      */
    vRow: String): typings.openui5.sapMPlanningCalendarRowMod.default | Null = js.native
    /**
      * Removes a row from the aggregation {@link #getRows rows}.
      *
      * @returns The removed row or `null`
      */
    def removeRow(/**
      * The row to remove or its index or id
      */
    vRow: int): typings.openui5.sapMPlanningCalendarRowMod.default | Null = js.native
    def removeRow(
      /**
      * The row to remove or its index or id
      */
    vRow: typings.openui5.sapMPlanningCalendarRowMod.default
    ): typings.openui5.sapMPlanningCalendarRowMod.default | Null = js.native
    
    def removeSpecialDate(/**
      * The specialDate to remove or its index or id
      */
    vSpecialDate: String): typings.openui5.sapUiUnifiedDateTypeRangeMod.default | Null = js.native
    /**
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
    
    def removeToolbarContent(/**
      * The toolbarContent to remove or its index or id
      */
    vToolbarContent: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a toolbarContent from the aggregation {@link #getToolbarContent toolbarContent}.
      *
      * @returns The removed toolbarContent or `null`
      */
    def removeToolbarContent(/**
      * The toolbarContent to remove or its index or id
      */
    vToolbarContent: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeToolbarContent(
      /**
      * The toolbarContent to remove or its index or id
      */
    vToolbarContent: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    def removeView(/**
      * The view to remove or its index or id
      */
    vView: String): typings.openui5.sapMPlanningCalendarViewMod.default | Null = js.native
    /**
      * Removes a view from the aggregation {@link #getViews views}.
      *
      * @returns The removed view or `null`
      */
    def removeView(/**
      * The view to remove or its index or id
      */
    vView: int): typings.openui5.sapMPlanningCalendarViewMod.default | Null = js.native
    def removeView(
      /**
      * The view to remove or its index or id
      */
    vView: typings.openui5.sapMPlanningCalendarViewMod.default
    ): typings.openui5.sapMPlanningCalendarViewMod.default | Null = js.native
    
    /**
      * Selects or deselects all `PlanningCalendarRows`.
      *
      * **Note:** Selection only works if `singleSelection` is set to `false`.
      *
      * @returns `this` to allow method chaining
      */
    def selectAllRows(
      /**
      * Indicator showing whether `PlanningCalendarRows` should be selected or deselected
      */
    bSelect: Boolean
    ): this.type = js.native
    
    /**
      * @SINCE 1.81.0
      *
      * Sets a new value for property {@link #getAppointmentHeight appointmentHeight}.
      *
      * Determines the different possible sizes for appointments.
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
      * Defines rounding of the width `CalendarAppoinment` **Note:** This property is applied, when the calendar
      * interval type is day and the view shows more than 20 days
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
      *
      * Sets a new value for property {@link #getAppointmentsReducedHeight appointmentsReducedHeight}.
      *
      * Determines whether the appointments that have only title without text are rendered with smaller height.
      *
      * **Note:** On phone devices this property is ignored, appointments are always rendered in full height
      * to facilitate touching.
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
      * Determines how the appointments are visualized depending on the used theme.
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
      * @SINCE 1.50
      *
      * Sets a new value for property {@link #getBuiltInViews builtInViews}.
      *
      * Defines the list of predefined views as an array. The views should be specified by their keys.
      *
      * The default predefined views and their keys are available at {@link sap.m.PlanningCalendarBuiltInView}.
      *
      * **Note:** If set, all specified views will be displayed along with any custom views (if available). If
      * not set and no custom views are available, all default views will be displayed. If not set and there
      * are any custom views available, only the custom views will be displayed.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `[]`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBuiltInViews(): this.type = js.native
    def setBuiltInViews(/**
      * New value for property `builtInViews`
      */
    sBuiltInViews: js.Array[String]): this.type = js.native
    
    /**
      * @SINCE 1.110.0
      *
      * Sets a new value for property {@link #getCalendarWeekNumbering calendarWeekNumbering}.
      *
      * If set, the calendar week numbering is used for display. If not set, the calendar week numbering of the
      * global configuration is used.
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
      * @SINCE 1.54
      *
      * Setter for custom sorting of appointments. If not used, the appointments will be sorted according to
      * their duration vertically. For example, the start time and order to the X axis won't change.
      *
      * @returns `this` for chaining
      */
    def setCustomAppointmentsSorterCallback(fnSorter: appointmentsSorterCallback): this.type = js.native
    
    /**
      * @SINCE 1.94
      *
      * Sets a new value for property {@link #getFirstDayOfWeek firstDayOfWeek}.
      *
      * If set, the first day of the displayed week is this day. Valid values are 0 to 6 starting on Sunday.
      * If there is no valid value set, the default of the used locale is used.
      *
      * Note: this property will only have effect in the weekly – based views of the PlanningCalendar – Week
      * view, and OneMonth view (on small devices).
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
      * @SINCE 1.48.0
      *
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
      * Specifies the height of the `PlanningCalendar`. **Note:** If the set height is less than the displayed
      * content, it will not be applied
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
      * Set maximum date that can be shown and selected in the `PlanningCalendar`. This must be a JavaScript
      * date object.
      *
      * @returns Reference to `this` for method chaining
      */
    def setMaxDate(/**
      * A JavaScript Date
      */
    oDate: js.Date): this.type = js.native
    
    /**
      * Set minimum date that can be shown and selected in the `PlanningCalendar`. This must be a JavaScript
      * date object.
      *
      * @returns Reference to `this` for method chaining
      */
    def setMinDate(/**
      * A JavaScript Date
      */
    oDate: js.Date): this.type = js.native
    
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
      * Sets a new value for property {@link #getNoDataText noDataText}.
      *
      * Defines the text that is displayed when no {@link sap.m.PlanningCalendarRow PlanningCalendarRows} are
      * assigned.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setNoDataText(): this.type = js.native
    def setNoDataText(/**
      * New value for property `noDataText`
      */
    sNoDataText: String): this.type = js.native
    
    def setPrimaryCalendarType(
      /**
      * the `sap.ui.core.CalendarType` to set as `sap.m.PlanningCalendar` `primaryCalendarType`.
      */
    sPrimaryCalendarType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String
    ): this.type = js.native
    /**
      * Sets the primaryCalendarType. If not set, the calendar type of the global configuration is used.
      *
      * @returns `this` to allow method chaining
      */
    def setPrimaryCalendarType(
      /**
      * the `sap.ui.core.CalendarType` to set as `sap.m.PlanningCalendar` `primaryCalendarType`.
      */
    sPrimaryCalendarType: CalendarType
    ): this.type = js.native
    
    def setSecondaryCalendarType(
      /**
      * the `sap.ui.core.CalendarType` to set as `sap.m.PlanningCalendar` `secondaryCalendarType`.
      */
    sSecondaryCalendarType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String
    ): this.type = js.native
    /**
      * Sets the secondaryCalendarType.
      *
      * @returns `this` to allow method chaining
      */
    def setSecondaryCalendarType(
      /**
      * the `sap.ui.core.CalendarType` to set as `sap.m.PlanningCalendar` `secondaryCalendarType`.
      */
    sSecondaryCalendarType: CalendarType
    ): this.type = js.native
    
    /**
      * @SINCE 1.50
      *
      * Sets a new value for property {@link #getShowDayNamesLine showDayNamesLine}.
      *
      * Determines whether the day names are displayed in a separate line or inside the single days.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowDayNamesLine(): this.type = js.native
    def setShowDayNamesLine(/**
      * New value for property `showDayNamesLine`
      */
    bShowDayNamesLine: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.38.0
      *
      * Sets a new value for property {@link #getShowEmptyIntervalHeaders showEmptyIntervalHeaders}.
      *
      * Determines whether the space (at the top of the intervals), where the assigned interval headers appear,
      * should remain visible even when no interval headers are present in the visible time frame. If set to
      * `false`, this space would collapse/disappear when no interval headers are assigned.
      *
      * **Note:** This property takes effect, only if `showIntervalHeaders` is also set to `true`.
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
      * Determines whether the assigned interval headers are displayed. You can assign them using the `intervalHeaders`
      * aggregation of the {@link sap.m.PlanningCalendarRow PlanningCalendarRow}.
      *
      * **Note:** If you set both `showIntervalHeaders` and `showEmptyIntervalHeaders` properties to `true`,
      * the space (at the top of the intervals) where the assigned interval headers appear, will remain visible
      * even if no interval headers are assigned.
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
      * Sets a new value for property {@link #getShowRowHeaders showRowHeaders}.
      *
      * Determines whether the column containing the headers of the {@link sap.m.PlanningCalendarRow PlanningCalendarRows}
      * is displayed.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowRowHeaders(): this.type = js.native
    def setShowRowHeaders(/**
      * New value for property `showRowHeaders`
      */
    bShowRowHeaders: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.52
      *
      * Sets a new value for property {@link #getShowWeekNumbers showWeekNumbers}.
      *
      * Determines if the week numbers are displayed.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowWeekNumbers(): this.type = js.native
    def setShowWeekNumbers(/**
      * New value for property `showWeekNumbers`
      */
    bShowWeekNumbers: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSingleSelection singleSelection}.
      *
      * Determines whether only a single row can be selected.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSingleSelection(): this.type = js.native
    def setSingleSelection(/**
      * New value for property `singleSelection`
      */
    bSingleSelection: Boolean): this.type = js.native
    
    /**
      * Sets the given date as start date. The current date is used as default. Depending on the current view
      * the start date may be adjusted (for example, the week view shows always the first weekday of the same
      * week as the given date).
      *
      * @returns `this` to allow method chaining
      */
    def setStartDate(
      /**
      * the date to set as `sap.m.PlanningCalendar` `startDate`. May be changed(adjusted) if property `startDate`
      * is adjusted. See remark about week view above.
      */
    oDate: js.Date
    ): this.type = js.native
    
    /**
      * Sets the stickyHeader property.
      *
      * @returns this pointer for chaining
      */
    def setStickyHeader(/**
      * Whether the header area will remain visible (fixed on top)
      */
    bStick: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getViewKey viewKey}.
      *
      * Defines the key of the `PlanningCalendarView` used for the output.
      *
      * **Note:** The default value is set `Hour`. If you are using your own views, the keys of these views should
      * be used instead.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `CalendarIntervalType.Hour`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setViewKey(): this.type = js.native
    def setViewKey(/**
      * New value for property `viewKey`
      */
    sViewKey: String): this.type = js.native
    
    /**
      * Sets the width property and ensures that the start date is in sync with each row timeline.
      *
      * @returns this for method chaining
      */
    def setWidth(/**
      * the width to be set to the PlanningCalendar
      */
    sWidth: CSSSize): this.type = js.native
  }
  
  trait PlanningCalendarSettings
    extends StObject
       with ControlSettings {
    
    /**
      * @SINCE 1.81.0
      *
      * Determines the different possible sizes for appointments.
      */
    var appointmentHeight: js.UndefOr[
        CalendarAppointmentHeight | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarAppointmentHeight * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.81.0
      * @EXPERIMENTAL (since 1.81.0)
      *
      * Defines rounding of the width `CalendarAppoinment` **Note:** This property is applied, when the calendar
      * interval type is day and the view shows more than 20 days
      */
    var appointmentRoundWidth: js.UndefOr[
        CalendarAppointmentRoundWidth | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarAppointmentRoundWidth * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Fired if an appointment is selected.
      */
    var appointmentSelect: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.38.0
      *
      * Determines whether the appointments that have only title without text are rendered with smaller height.
      *
      * **Note:** On phone devices this property is ignored, appointments are always rendered in full height
      * to facilitate touching.
      */
    var appointmentsReducedHeight: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.40.0
      *
      * Determines how the appointments are visualized depending on the used theme.
      */
    var appointmentsVisualization: js.UndefOr[
        CalendarAppointmentVisualization | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarAppointmentVisualization * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.40.0
      *
      * Association to controls / IDs which label this control (see WAI-ARIA attribute aria-labelledby).
      */
    var ariaLabelledBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * @SINCE 1.50
      *
      * Defines the list of predefined views as an array. The views should be specified by their keys.
      *
      * The default predefined views and their keys are available at {@link sap.m.PlanningCalendarBuiltInView}.
      *
      * **Note:** If set, all specified views will be displayed along with any custom views (if available). If
      * not set and no custom views are available, all default views will be displayed. If not set and there
      * are any custom views available, only the custom views will be displayed.
      */
    var builtInViews: js.UndefOr[
        js.Array[String] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.110.0
      *
      * If set, the calendar week numbering is used for display. If not set, the calendar week numbering of the
      * global configuration is used.
      */
    var calendarWeekNumbering: js.UndefOr[
        CalendarWeekNumbering | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarWeekNumbering * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.94
      *
      * If set, the first day of the displayed week is this day. Valid values are 0 to 6 starting on Sunday.
      * If there is no valid value set, the default of the used locale is used.
      *
      * Note: this property will only have effect in the weekly – based views of the PlanningCalendar – Week
      * view, and OneMonth view (on small devices).
      */
    var firstDayOfWeek: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.48.0
      *
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
      * Specifies the height of the `PlanningCalendar`. **Note:** If the set height is less than the displayed
      * content, it will not be applied
      */
    var height: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Fired if an interval was selected in the calendar header or in the row.
      */
    var intervalSelect: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.40.0
      *
      * Association to the `CalendarLegend` explaining the colors of the `Appointments`.
      *
      * **Note:** The legend does not have to be rendered but must exist, and all required types must be assigned.
      */
    var legend: js.UndefOr[typings.openui5.sapUiUnifiedCalendarLegendMod.default | String] = js.undefined
    
    /**
      * @SINCE 1.38.0
      *
      * Defines the maximum date that can be displayed and selected in the `PlanningCalendar`. This must be a
      * JavaScript date object.
      *
      * **Note:** If the `maxDate` is set to be before the current `minDate`, the `minDate` is set to the first
      * date of the month in which the `maxDate` belongs.
      */
    var maxDate: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.38.0
      *
      * Defines the minimum date that can be displayed and selected in the `PlanningCalendar`. This must be a
      * JavaScript date object.
      *
      * **Note:** If the `minDate` is set to be after the current `maxDate`, the `maxDate` is set to the last
      * date of the month in which the `minDate` belongs.
      */
    var minDate: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
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
      * Defines the text that is displayed when no {@link sap.m.PlanningCalendarRow PlanningCalendarRows} are
      * assigned.
      */
    var noDataText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.108.0
      *
      * If set, the calendar type is used for display. If not set, the calendar type of the global configuration
      * is used.
      */
    var primaryCalendarType: js.UndefOr[
        CalendarType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.46.0
      *
      * Fires when a row header is clicked.
      */
    var rowHeaderClick: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Fires when row selection is changed.
      */
    var rowSelectionChange: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Rows of the `PlanningCalendar`.
      */
    var rows: js.UndefOr[
        js.Array[typings.openui5.sapMPlanningCalendarRowMod.default] | typings.openui5.sapMPlanningCalendarRowMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.109.0
      *
      * If set, the days are also represented in this calendar type. If not set, the dates are only represented
      * in the primary calendar type. Note: The second calendar type won't be represented in the DOM when this
      * property is not set explicitly.
      */
    var secondaryCalendarType: js.UndefOr[
        CalendarType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.50
      *
      * Determines whether the day names are displayed in a separate line or inside the single days.
      */
    var showDayNamesLine: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.38.0
      *
      * Determines whether the space (at the top of the intervals), where the assigned interval headers appear,
      * should remain visible even when no interval headers are present in the visible time frame. If set to
      * `false`, this space would collapse/disappear when no interval headers are assigned.
      *
      * **Note:** This property takes effect, only if `showIntervalHeaders` is also set to `true`.
      */
    var showEmptyIntervalHeaders: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines whether the assigned interval headers are displayed. You can assign them using the `intervalHeaders`
      * aggregation of the {@link sap.m.PlanningCalendarRow PlanningCalendarRow}.
      *
      * **Note:** If you set both `showIntervalHeaders` and `showEmptyIntervalHeaders` properties to `true`,
      * the space (at the top of the intervals) where the assigned interval headers appear, will remain visible
      * even if no interval headers are assigned.
      */
    var showIntervalHeaders: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines whether the column containing the headers of the {@link sap.m.PlanningCalendarRow PlanningCalendarRows}
      * is displayed.
      */
    var showRowHeaders: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.52
      *
      * Determines if the week numbers are displayed.
      */
    var showWeekNumbers: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines whether only a single row can be selected.
      */
    var singleSelection: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Special days in the header calendar visualized as date range with a type.
      *
      * **Note:** If one day is assigned to more than one type, only the first type will be used.
      */
    var specialDates: js.UndefOr[
        js.Array[typings.openui5.sapUiUnifiedDateTypeRangeMod.default] | typings.openui5.sapUiUnifiedDateTypeRangeMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines the start date of the row, as a JavaScript date object. The current date is used as default.
      */
    var startDate: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Fired when the `startDate` property was changed while navigating in the `PlanningCalendar`. The new value
      * can be obtained using the `sap.m.PlanningCalendar#getStartDate()` method. **Note:** This event is fired
      * in case when the `viewKey` property is changed, and as a result of which the view requires a change in
      * the `startDate` property.
      */
    var startDateChange: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.54
      *
      * Determines whether the header area will remain visible (fixed on top) when the rest of the content is
      * scrolled out of view.
      *
      * The sticky header behavior is automatically disabled on phones in landscape mode for better visibility
      * of the content.
      *
      * **Note:** There is limited browser support, hence the API is in experimental state. Browsers that currently
      * support this feature are Chrome (desktop and mobile), Safari (desktop and mobile) and Edge 41.
      *
      * There are also some known issues with respect to the scrolling behavior and focus handling. A few are
      * given below:
      *
      * When the PlanningCalendar is placed in certain layout containers, for example the `GridLayout` control,
      * the column headers do not fix at the top of the viewport. Similar behavior is also observed with the
      * `ObjectPage` control.
      *
      * This API should not be used in production environment.
      *
      * **Note:** The `stickyHeader` of the `PlanningCalendar` uses the `sticky` property of `sap.m.Table`. Therefore,
      * all features and restrictions of the property in `sap.m.Table` apply to the `PlanningCalendar` as well.
      */
    var stickyHeader: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The content of the toolbar.
      */
    var toolbarContent: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Fired when the `viewKey` property was changed by user interaction.
      */
    var viewChange: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Defines the key of the `PlanningCalendarView` used for the output.
      *
      * **Note:** The default value is set `Hour`. If you are using your own views, the keys of these views should
      * be used instead.
      */
    var viewKey: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Views of the `PlanningCalendar`.
      *
      * **Note:** If not set, all the default views are available. Their keys are defined in {@link sap.ui.unified.CalendarIntervalType}.
      */
    var views: js.UndefOr[
        js.Array[typings.openui5.sapMPlanningCalendarViewMod.default] | typings.openui5.sapMPlanningCalendarViewMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Specifies the width of the `PlanningCalendar`.
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object PlanningCalendarSettings {
    
    inline def apply(): PlanningCalendarSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlanningCalendarSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PlanningCalendarSettings] (val x: Self) extends AnyVal {
      
      inline def setAppointmentHeight(
        value: CalendarAppointmentHeight | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarAppointmentHeight * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "appointmentHeight", value.asInstanceOf[js.Any])
      
      inline def setAppointmentHeightUndefined: Self = StObject.set(x, "appointmentHeight", js.undefined)
      
      inline def setAppointmentRoundWidth(
        value: CalendarAppointmentRoundWidth | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarAppointmentRoundWidth * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "appointmentRoundWidth", value.asInstanceOf[js.Any])
      
      inline def setAppointmentRoundWidthUndefined: Self = StObject.set(x, "appointmentRoundWidth", js.undefined)
      
      inline def setAppointmentSelect(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "appointmentSelect", js.Any.fromFunction1(value))
      
      inline def setAppointmentSelectUndefined: Self = StObject.set(x, "appointmentSelect", js.undefined)
      
      inline def setAppointmentsReducedHeight(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "appointmentsReducedHeight", value.asInstanceOf[js.Any])
      
      inline def setAppointmentsReducedHeightUndefined: Self = StObject.set(x, "appointmentsReducedHeight", js.undefined)
      
      inline def setAppointmentsVisualization(
        value: CalendarAppointmentVisualization | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarAppointmentVisualization * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "appointmentsVisualization", value.asInstanceOf[js.Any])
      
      inline def setAppointmentsVisualizationUndefined: Self = StObject.set(x, "appointmentsVisualization", js.undefined)
      
      inline def setAriaLabelledBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAriaLabelledByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaLabelledBy", js.Array(value*))
      
      inline def setBuiltInViews(
        value: js.Array[String] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "builtInViews", value.asInstanceOf[js.Any])
      
      inline def setBuiltInViewsUndefined: Self = StObject.set(x, "builtInViews", js.undefined)
      
      inline def setBuiltInViewsVarargs(value: String*): Self = StObject.set(x, "builtInViews", js.Array(value*))
      
      inline def setCalendarWeekNumbering(
        value: CalendarWeekNumbering | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarWeekNumbering * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "calendarWeekNumbering", value.asInstanceOf[js.Any])
      
      inline def setCalendarWeekNumberingUndefined: Self = StObject.set(x, "calendarWeekNumbering", js.undefined)
      
      inline def setFirstDayOfWeek(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
      
      inline def setFirstDayOfWeekUndefined: Self = StObject.set(x, "firstDayOfWeek", js.undefined)
      
      inline def setGroupAppointmentsMode(
        value: GroupAppointmentsMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GroupAppointmentsMode * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "groupAppointmentsMode", value.asInstanceOf[js.Any])
      
      inline def setGroupAppointmentsModeUndefined: Self = StObject.set(x, "groupAppointmentsMode", js.undefined)
      
      inline def setHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setIntervalSelect(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "intervalSelect", js.Any.fromFunction1(value))
      
      inline def setIntervalSelectUndefined: Self = StObject.set(x, "intervalSelect", js.undefined)
      
      inline def setLegend(value: typings.openui5.sapUiUnifiedCalendarLegendMod.default | String): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
      
      inline def setMaxDate(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMinDate(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setMultipleAppointmentsSelection(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "multipleAppointmentsSelection", value.asInstanceOf[js.Any])
      
      inline def setMultipleAppointmentsSelectionUndefined: Self = StObject.set(x, "multipleAppointmentsSelection", js.undefined)
      
      inline def setNoDataText(value: String | PropertyBindingInfo): Self = StObject.set(x, "noDataText", value.asInstanceOf[js.Any])
      
      inline def setNoDataTextUndefined: Self = StObject.set(x, "noDataText", js.undefined)
      
      inline def setPrimaryCalendarType(
        value: CalendarType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "primaryCalendarType", value.asInstanceOf[js.Any])
      
      inline def setPrimaryCalendarTypeUndefined: Self = StObject.set(x, "primaryCalendarType", js.undefined)
      
      inline def setRowHeaderClick(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "rowHeaderClick", js.Any.fromFunction1(value))
      
      inline def setRowHeaderClickUndefined: Self = StObject.set(x, "rowHeaderClick", js.undefined)
      
      inline def setRowSelectionChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "rowSelectionChange", js.Any.fromFunction1(value))
      
      inline def setRowSelectionChangeUndefined: Self = StObject.set(x, "rowSelectionChange", js.undefined)
      
      inline def setRows(
        value: js.Array[typings.openui5.sapMPlanningCalendarRowMod.default] | typings.openui5.sapMPlanningCalendarRowMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setRowsVarargs(value: typings.openui5.sapMPlanningCalendarRowMod.default*): Self = StObject.set(x, "rows", js.Array(value*))
      
      inline def setSecondaryCalendarType(
        value: CalendarType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "secondaryCalendarType", value.asInstanceOf[js.Any])
      
      inline def setSecondaryCalendarTypeUndefined: Self = StObject.set(x, "secondaryCalendarType", js.undefined)
      
      inline def setShowDayNamesLine(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showDayNamesLine", value.asInstanceOf[js.Any])
      
      inline def setShowDayNamesLineUndefined: Self = StObject.set(x, "showDayNamesLine", js.undefined)
      
      inline def setShowEmptyIntervalHeaders(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showEmptyIntervalHeaders", value.asInstanceOf[js.Any])
      
      inline def setShowEmptyIntervalHeadersUndefined: Self = StObject.set(x, "showEmptyIntervalHeaders", js.undefined)
      
      inline def setShowIntervalHeaders(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showIntervalHeaders", value.asInstanceOf[js.Any])
      
      inline def setShowIntervalHeadersUndefined: Self = StObject.set(x, "showIntervalHeaders", js.undefined)
      
      inline def setShowRowHeaders(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showRowHeaders", value.asInstanceOf[js.Any])
      
      inline def setShowRowHeadersUndefined: Self = StObject.set(x, "showRowHeaders", js.undefined)
      
      inline def setShowWeekNumbers(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showWeekNumbers", value.asInstanceOf[js.Any])
      
      inline def setShowWeekNumbersUndefined: Self = StObject.set(x, "showWeekNumbers", js.undefined)
      
      inline def setSingleSelection(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "singleSelection", value.asInstanceOf[js.Any])
      
      inline def setSingleSelectionUndefined: Self = StObject.set(x, "singleSelection", js.undefined)
      
      inline def setSpecialDates(
        value: js.Array[typings.openui5.sapUiUnifiedDateTypeRangeMod.default] | typings.openui5.sapUiUnifiedDateTypeRangeMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "specialDates", value.asInstanceOf[js.Any])
      
      inline def setSpecialDatesUndefined: Self = StObject.set(x, "specialDates", js.undefined)
      
      inline def setSpecialDatesVarargs(value: typings.openui5.sapUiUnifiedDateTypeRangeMod.default*): Self = StObject.set(x, "specialDates", js.Array(value*))
      
      inline def setStartDate(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setStartDateChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "startDateChange", js.Any.fromFunction1(value))
      
      inline def setStartDateChangeUndefined: Self = StObject.set(x, "startDateChange", js.undefined)
      
      inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
      
      inline def setStickyHeader(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "stickyHeader", value.asInstanceOf[js.Any])
      
      inline def setStickyHeaderUndefined: Self = StObject.set(x, "stickyHeader", js.undefined)
      
      inline def setToolbarContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "toolbarContent", value.asInstanceOf[js.Any])
      
      inline def setToolbarContentUndefined: Self = StObject.set(x, "toolbarContent", js.undefined)
      
      inline def setToolbarContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "toolbarContent", js.Array(value*))
      
      inline def setViewChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "viewChange", js.Any.fromFunction1(value))
      
      inline def setViewChangeUndefined: Self = StObject.set(x, "viewChange", js.undefined)
      
      inline def setViewKey(value: String | PropertyBindingInfo): Self = StObject.set(x, "viewKey", value.asInstanceOf[js.Any])
      
      inline def setViewKeyUndefined: Self = StObject.set(x, "viewKey", js.undefined)
      
      inline def setViews(
        value: js.Array[typings.openui5.sapMPlanningCalendarViewMod.default] | typings.openui5.sapMPlanningCalendarViewMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
      
      inline def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
      
      inline def setViewsVarargs(value: typings.openui5.sapMPlanningCalendarViewMod.default*): Self = StObject.set(x, "views", js.Array(value*))
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type appointmentsSorterCallback = js.Function2[
    /* appointment1 */ typings.openui5.sapUiUnifiedCalendarAppointmentMod.default, 
    /* appointment2 */ typings.openui5.sapUiUnifiedCalendarAppointmentMod.default, 
    int
  ]
}
