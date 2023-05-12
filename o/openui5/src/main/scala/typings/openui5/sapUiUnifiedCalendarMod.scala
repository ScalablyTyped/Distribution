package typings.openui5

import typings.openui5.anon.WeekDays
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreCalendarTypeMod.CalendarType
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreDateCalendarWeekNumberingMod.CalendarWeekNumbering
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiUnifiedCalendarMod {
  
  @JSImport("sap/ui/unified/Calendar", JSImport.Default)
  @js.native
  /**
    * Constructor for a new Calendar.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Calendar {
    def this(/**
      * initial settings for the new control
      */
    mSettings: CalendarSettings) = this()
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
    mSettings: CalendarSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: CalendarSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/unified/Calendar", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.unified.Calendar with name `sClassName` and enriches it with the
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
    oClassInfo: ClassInfo[T, Calendar]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Calendar],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.unified.Calendar.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Calendar
    extends typings.openui5.sapUiCoreControlMod.default {
    
    def addAriaLabelledBy(
      /**
      * The ariaLabelledBy to add; if empty, nothing is inserted
      */
    vAriaLabelledBy: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * @SINCE 1.28.0
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
      * @SINCE 1.38.0
      *
      * Adds some disabledDate to the aggregation {@link #getDisabledDates disabledDates}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addDisabledDate(
      /**
      * The disabledDate to add; if empty, nothing is inserted
      */
    oDisabledDate: typings.openui5.sapUiUnifiedDateRangeMod.default
    ): this.type = js.native
    
    /**
      * Adds some selectedDate to the aggregation {@link #getSelectedDates selectedDates}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addSelectedDate(
      /**
      * The selectedDate to add; if empty, nothing is inserted
      */
    oSelectedDate: typings.openui5.sapUiUnifiedDateRangeMod.default
    ): this.type = js.native
    
    /**
      * @SINCE 1.24.0
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
      * Attaches event handler `fnFunction` to the {@link #event:cancel cancel} event of this `sap.ui.unified.Calendar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.Calendar` itself.
      *
      * Date selection was cancelled
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachCancel(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachCancel(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.Calendar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:cancel cancel} event of this `sap.ui.unified.Calendar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.Calendar` itself.
      *
      * Date selection was cancelled
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachCancel(
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
    def attachCancel(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.Calendar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:select select} event of this `sap.ui.unified.Calendar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.Calendar` itself.
      *
      * Date selection changed
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
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.Calendar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:select select} event of this `sap.ui.unified.Calendar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.Calendar` itself.
      *
      * Date selection changed
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
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.Calendar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.34.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:startDateChange startDateChange} event of this
      * `sap.ui.unified.Calendar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.Calendar` itself.
      *
      * `startDate` was changed while navigation in `Calendar`
      *
      * Use `getStartDate` function to determine the current start date
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
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.Calendar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.34.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:startDateChange startDateChange} event of this
      * `sap.ui.unified.Calendar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.Calendar` itself.
      *
      * `startDate` was changed while navigation in `Calendar`
      *
      * Use `getStartDate` function to determine the current start date
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
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.Calendar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.56
      *
      * Attaches event handler `fnFunction` to the {@link #event:weekNumberSelect weekNumberSelect} event of
      * this `sap.ui.unified.Calendar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.Calendar` itself.
      *
      * Week number selection changed. By default, clicking on the week number will select the corresponding
      * week. If the week has already been selected, clicking the week number will deselect it.
      *
      * The default behavior can be prevented using the `preventDefault` method.
      *
      * **Note** Works for Gregorian calendars only and when `intervalSelection` is set to 'true'.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachWeekNumberSelect(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachWeekNumberSelect(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.Calendar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.56
      *
      * Attaches event handler `fnFunction` to the {@link #event:weekNumberSelect weekNumberSelect} event of
      * this `sap.ui.unified.Calendar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.Calendar` itself.
      *
      * Week number selection changed. By default, clicking on the week number will select the corresponding
      * week. If the week has already been selected, clicking the week number will deselect it.
      *
      * The default behavior can be prevented using the `preventDefault` method.
      *
      * **Note** Works for Gregorian calendars only and when `intervalSelection` is set to 'true'.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachWeekNumberSelect(
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
    def attachWeekNumberSelect(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.Calendar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.38.0
      *
      * Destroys all the disabledDates in the aggregation {@link #getDisabledDates disabledDates}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyDisabledDates(): this.type = js.native
    
    /**
      * Destroys all the selectedDates in the aggregation {@link #getSelectedDates selectedDates}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroySelectedDates(): this.type = js.native
    
    /**
      * @SINCE 1.24.0
      *
      * Destroys all the specialDates in the aggregation {@link #getSpecialDates specialDates}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroySpecialDates(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:cancel cancel} event of this `sap.ui.unified.Calendar`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachCancel(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachCancel(
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
      * Detaches event handler `fnFunction` from the {@link #event:select select} event of this `sap.ui.unified.Calendar`.
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
      * @SINCE 1.34.0
      *
      * Detaches event handler `fnFunction` from the {@link #event:startDateChange startDateChange} event of
      * this `sap.ui.unified.Calendar`.
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
      * @SINCE 1.56
      *
      * Detaches event handler `fnFunction` from the {@link #event:weekNumberSelect weekNumberSelect} event of
      * this `sap.ui.unified.Calendar`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachWeekNumberSelect(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachWeekNumberSelect(
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
      * @SINCE 1.28.0
      *
      * Displays a date in the calendar but doesn't set the focus.
      *
      * @returns Reference to `this` for method chaining
      */
    def displayDate(/**
      * JavaScript date object for focused date
      */
    oDate: js.Date): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:cancel cancel} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireCancel(): this.type = js.native
    def fireCancel(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:select select} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSelect(): this.type = js.native
    def fireSelect(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * @SINCE 1.34.0
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
      * @SINCE 1.56
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:weekNumberSelect weekNumberSelect} to attached listeners.
      *
      * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
      * event object. The return value of this method indicates whether the default action should be executed.
      *
      * @returns Whether or not to prevent the default action
      */
    def fireWeekNumberSelect(): Boolean = js.native
    def fireWeekNumberSelect(/**
      * Parameters to pass along with the event
      */
    mParameters: WeekDays): Boolean = js.native
    
    /**
      * Displays and sets the focused date of the calendar.
      *
      * @returns Reference to `this` for method chaining
      */
    def focusDate(/**
      * A JavaScript date object for focused date
      */
    oDate: js.Date): this.type = js.native
    
    /**
      * @SINCE 1.28.0
      *
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaLabelledBy
      * ariaLabelledBy}.
      */
    def getAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * @SINCE 1.108.0
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
      * @SINCE 1.38.0
      *
      * Gets content of aggregation {@link #getDisabledDates disabledDates}.
      *
      * Dates or date ranges for disabled dates.
      *
      * To set a single date (instead of a range), set only the `startDate` property of the {@link sap.ui.unified.DateRange}
      * class.
      */
    def getDisabledDates(): js.Array[typings.openui5.sapUiUnifiedDateRangeMod.default] = js.native
    
    /**
      * @SINCE 1.28.9
      *
      * Gets current value of property {@link #getFirstDayOfWeek firstDayOfWeek}.
      *
      * If the property is set, this day marks the start of the displayed week. Valid values are 0 to 6. If no
      * valid property is set, the current locale's default is applied. Note: This property should not be used
      * with the calendarWeekNumbering property.
      *
      * Default value is `-1`.
      *
      * @returns Value of property `firstDayOfWeek`
      */
    def getFirstDayOfWeek(): int = js.native
    
    /**
      * @SINCE 1.111
      *
      * Gets current value of property {@link #getInitialFocusedDate initialFocusedDate}.
      *
      * Holds a reference to a JavaScript Date Object to define the initially navigated date in the calendar.
      *
      * @returns Value of property `initialFocusedDate`
      */
    def getInitialFocusedDate(): js.Object = js.native
    
    /**
      * Gets current value of property {@link #getIntervalSelection intervalSelection}.
      *
      * If set, interval selection is allowed
      *
      * Default value is `false`.
      *
      * @returns Value of property `intervalSelection`
      */
    def getIntervalSelection(): Boolean = js.native
    
    /**
      * @SINCE 1.38.5
      *
      * ID of the element which is the current target of the association {@link #getLegend legend}, or `null`.
      */
    def getLegend(): ID = js.native
    
    /**
      * @SINCE 1.38.0
      *
      * Gets current value of property {@link #getMaxDate maxDate}.
      *
      * Maximum date that can be shown and selected in the Calendar. This must be a JavaScript date object.
      *
      * **Note:** if the date is inside of a month the complete month is displayed, but dates outside the valid
      * range can not be selected.
      *
      * **Note:** If the `maxDate` is set to be before the `minDate`, the `minDate` is set to the begin of the
      * month of the `maxDate`.
      *
      * @returns Value of property `maxDate`
      */
    def getMaxDate(): js.Object = js.native
    
    /**
      * @SINCE 1.38.0
      *
      * Gets current value of property {@link #getMinDate minDate}.
      *
      * Minimum date that can be shown and selected in the Calendar. This must be a JavaScript date object.
      *
      * **Note:** if the date is inside of a month the complete month is displayed, but dates outside the valid
      * range can not be selected.
      *
      * **Note:** If the `minDate` is set to be after the `maxDate`, the `maxDate` is set to the end of the month
      * of the `minDate`.
      *
      * @returns Value of property `minDate`
      */
    def getMinDate(): js.Object = js.native
    
    /**
      * @SINCE 1.28.0
      *
      * Gets current value of property {@link #getMonths months}.
      *
      * Determines the number of months displayed.
      *
      * As of version 1.50, the duplicated dates are not displayed if there are multiple months.
      *
      * **Note:** On phones, only one month is displayed.
      *
      * Default value is `1`.
      *
      * @returns Value of property `months`
      */
    def getMonths(): int = js.native
    
    /**
      * @SINCE 1.28.9
      *
      * Gets current value of property {@link #getNonWorkingDays nonWorkingDays}.
      *
      * If set, the provided weekdays are displayed as non-working days. Valid values inside the array are 0
      * to 6. If not set, the weekend defined in the locale settings is displayed as non-working days.
      *
      * **Note:** Keep in mind that this property sets only weekly-recurring days as non-working. If you need
      * specific dates or dates ranges, such as national holidays, use the `specialDates` aggregation to set
      * them. Both the non-working days (from property) and dates (from aggregation) are visualized the same.
      *
      * @returns Value of property `nonWorkingDays`
      */
    def getNonWorkingDays(): js.Array[int] = js.native
    
    /**
      * @SINCE 1.34.0
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
      * @SINCE 1.34.0
      *
      * Gets current value of property {@link #getSecondaryCalendarType secondaryCalendarType}.
      *
      * If set, the days are also displayed in this calendar type If not set, the dates are only displayed in
      * the primary calendar type
      *
      * @returns Value of property `secondaryCalendarType`
      */
    def getSecondaryCalendarType(): CalendarType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String) = js.native
    
    /**
      * Gets content of aggregation {@link #getSelectedDates selectedDates}.
      *
      * Dates or date ranges for selected dates.
      *
      * To set a single date (instead of a range), set only the `startDate` property of the {@link sap.ui.unified.DateRange}
      * class.
      */
    def getSelectedDates(): js.Array[typings.openui5.sapUiUnifiedDateRangeMod.default] = js.native
    
    /**
      * @SINCE 1.95
      *
      * Gets current value of property {@link #getShowCurrentDateButton showCurrentDateButton}.
      *
      * Determines whether there is a shortcut navigation to Today. When used in Month, Year or Year-range picker
      * view, the calendar navigates to Day picker view.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showCurrentDateButton`
      */
    def getShowCurrentDateButton(): Boolean = js.native
    
    /**
      * @SINCE 1.48
      *
      * Gets current value of property {@link #getShowWeekNumbers showWeekNumbers}.
      *
      * Determines whether the week numbers in the months are displayed.
      *
      * **Note:** For Islamic calendars, the week numbers are not displayed regardless of what is set to this
      * property.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showWeekNumbers`
      */
    def getShowWeekNumbers(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getSingleSelection singleSelection}.
      *
      * If set, only a single date or interval, if intervalSelection is enabled, can be selected
      *
      * Default value is `true`.
      *
      * @returns Value of property `singleSelection`
      */
    def getSingleSelection(): Boolean = js.native
    
    /**
      * @SINCE 1.34.1
      *
      * Returns the first day of the displayed month.
      *
      * There might be some days of the previous month shown, but they can not be focused.
      *
      * @returns JavaScript date object for start date
      */
    def getStartDate(): js.Date = js.native
    
    /**
      * @SINCE 1.38.0
      *
      * Gets current value of property {@link #getWidth width}.
      *
      * Width of Calendar
      *
      * **Note:** There is a theme depending minimum width, so the calendar can not be set smaller.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * @SINCE 1.38.0
      *
      * Checks for the provided `sap.ui.unified.DateRange` in the aggregation {@link #getDisabledDates disabledDates}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfDisabledDate(
      /**
      * The disabledDate whose index is looked for
      */
    oDisabledDate: typings.openui5.sapUiUnifiedDateRangeMod.default
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
      * @SINCE 1.24.0
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
      * @SINCE 1.38.0
      *
      * Inserts a disabledDate into the aggregation {@link #getDisabledDates disabledDates}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertDisabledDate(
      /**
      * The disabledDate to insert; if empty, nothing is inserted
      */
    oDisabledDate: typings.openui5.sapUiUnifiedDateRangeMod.default,
      /**
      * The `0`-based index the disabledDate should be inserted at; for a negative value of `iIndex`, the disabledDate
      * is inserted at position 0; for a value greater than the current size of the aggregation, the disabledDate
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
      * @SINCE 1.24.0
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
      * @SINCE 1.28.0
      *
      * Removes all the controls in the association named {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * @SINCE 1.38.0
      *
      * Removes all the controls from the aggregation {@link #getDisabledDates disabledDates}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllDisabledDates(): js.Array[typings.openui5.sapUiUnifiedDateRangeMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getSelectedDates selectedDates}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllSelectedDates(): js.Array[typings.openui5.sapUiUnifiedDateRangeMod.default] = js.native
    
    /**
      * @SINCE 1.24.0
      *
      * Removes all the controls from the aggregation {@link #getSpecialDates specialDates}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllSpecialDates(): js.Array[typings.openui5.sapUiUnifiedDateTypeRangeMod.default] = js.native
    
    /**
      * @SINCE 1.28.0
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
    
    def removeDisabledDate(/**
      * The disabledDate to remove or its index or id
      */
    vDisabledDate: String): typings.openui5.sapUiUnifiedDateRangeMod.default | Null = js.native
    /**
      * @SINCE 1.38.0
      *
      * Removes a disabledDate from the aggregation {@link #getDisabledDates disabledDates}.
      *
      * @returns The removed disabledDate or `null`
      */
    def removeDisabledDate(/**
      * The disabledDate to remove or its index or id
      */
    vDisabledDate: int): typings.openui5.sapUiUnifiedDateRangeMod.default | Null = js.native
    def removeDisabledDate(
      /**
      * The disabledDate to remove or its index or id
      */
    vDisabledDate: typings.openui5.sapUiUnifiedDateRangeMod.default
    ): typings.openui5.sapUiUnifiedDateRangeMod.default | Null = js.native
    
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
      * @SINCE 1.24.0
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
      * @SINCE 1.108.0
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
      * @SINCE 1.28.9
      *
      * Sets a new value for property {@link #getFirstDayOfWeek firstDayOfWeek}.
      *
      * If the property is set, this day marks the start of the displayed week. Valid values are 0 to 6. If no
      * valid property is set, the current locale's default is applied. Note: This property should not be used
      * with the calendarWeekNumbering property.
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
      * @SINCE 1.111
      *
      * Sets a new value for property {@link #getInitialFocusedDate initialFocusedDate}.
      *
      * Holds a reference to a JavaScript Date Object to define the initially navigated date in the calendar.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setInitialFocusedDate(): this.type = js.native
    def setInitialFocusedDate(/**
      * New value for property `initialFocusedDate`
      */
    oInitialFocusedDate: js.Object): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIntervalSelection intervalSelection}.
      *
      * If set, interval selection is allowed
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIntervalSelection(): this.type = js.native
    def setIntervalSelection(/**
      * New value for property `intervalSelection`
      */
    bIntervalSelection: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.38.5
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
      * Sets a maximum date for the calendar.
      *
      * @returns Reference to `this` for method chaining
      */
    def setMaxDate(/**
      * a JavaScript date
      */
    oDate: js.Date): this.type = js.native
    
    /**
      * Sets a minimum date for the calendar.
      *
      * @returns Reference to `this` for method chaining
      */
    def setMinDate(/**
      * a JavaScript date
      */
    oDate: js.Date): this.type = js.native
    
    /**
      * @SINCE 1.28.0
      *
      * Sets a new value for property {@link #getMonths months}.
      *
      * Determines the number of months displayed.
      *
      * As of version 1.50, the duplicated dates are not displayed if there are multiple months.
      *
      * **Note:** On phones, only one month is displayed.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `1`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMonths(): this.type = js.native
    def setMonths(/**
      * New value for property `months`
      */
    iMonths: int): this.type = js.native
    
    /**
      * @SINCE 1.28.9
      *
      * Sets a new value for property {@link #getNonWorkingDays nonWorkingDays}.
      *
      * If set, the provided weekdays are displayed as non-working days. Valid values inside the array are 0
      * to 6. If not set, the weekend defined in the locale settings is displayed as non-working days.
      *
      * **Note:** Keep in mind that this property sets only weekly-recurring days as non-working. If you need
      * specific dates or dates ranges, such as national holidays, use the `specialDates` aggregation to set
      * them. Both the non-working days (from property) and dates (from aggregation) are visualized the same.
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
    
    def setPrimaryCalendarType(
      /**
      * New value for property `primaryCalendarType`
      */
    sPrimaryCalendarType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String
    ): this.type = js.native
    /**
      * @SINCE 1.34.0
      *
      * Sets a new value for property {@link #getPrimaryCalendarType primaryCalendarType}.
      *
      * If set, the calendar type is used for display. If not set, the calendar type of the global configuration
      * is used.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPrimaryCalendarType(/**
      * New value for property `primaryCalendarType`
      */
    sPrimaryCalendarType: CalendarType): this.type = js.native
    
    def setSecondaryCalendarType(
      /**
      * New value for property `secondaryCalendarType`
      */
    sSecondaryCalendarType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String
    ): this.type = js.native
    /**
      * @SINCE 1.34.0
      *
      * Sets a new value for property {@link #getSecondaryCalendarType secondaryCalendarType}.
      *
      * If set, the days are also displayed in this calendar type If not set, the dates are only displayed in
      * the primary calendar type
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSecondaryCalendarType(/**
      * New value for property `secondaryCalendarType`
      */
    sSecondaryCalendarType: CalendarType): this.type = js.native
    
    /**
      * Sets the visibility of the Current date button in the calendar.
      *
      * @returns Reference to `this` for method chaining
      */
    def setShowCurrentDateButton(/**
      * whether the Today button will be displayed
      */
    bShow: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.48
      *
      * Sets a new value for property {@link #getShowWeekNumbers showWeekNumbers}.
      *
      * Determines whether the week numbers in the months are displayed.
      *
      * **Note:** For Islamic calendars, the week numbers are not displayed regardless of what is set to this
      * property.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
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
      * If set, only a single date or interval, if intervalSelection is enabled, can be selected
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
      * @SINCE 1.38.0
      *
      * Sets a new value for property {@link #getWidth width}.
      *
      * Width of Calendar
      *
      * **Note:** There is a theme depending minimum width, so the calendar can not be set smaller.
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
  }
  
  trait CalendarSettings
    extends StObject
       with ControlSettings {
    
    /**
      * @SINCE 1.28.0
      *
      * Association to controls / ids which label this control (see WAI-ARIA attribute aria-labelledby).
      */
    var ariaLabelledBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * @SINCE 1.108.0
      *
      * If set, the calendar week numbering is used for display. If not set, the calendar week numbering of the
      * global configuration is used. Note: This property should not be used with firstDayOfWeek property.
      */
    var calendarWeekNumbering: js.UndefOr[
        CalendarWeekNumbering | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarWeekNumbering * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Date selection was cancelled
      */
    var cancel: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.38.0
      *
      * Dates or date ranges for disabled dates.
      *
      * To set a single date (instead of a range), set only the `startDate` property of the {@link sap.ui.unified.DateRange}
      * class.
      */
    var disabledDates: js.UndefOr[
        js.Array[typings.openui5.sapUiUnifiedDateRangeMod.default] | typings.openui5.sapUiUnifiedDateRangeMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.28.9
      *
      * If the property is set, this day marks the start of the displayed week. Valid values are 0 to 6. If no
      * valid property is set, the current locale's default is applied. Note: This property should not be used
      * with the calendarWeekNumbering property.
      */
    var firstDayOfWeek: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.111
      *
      * Holds a reference to a JavaScript Date Object to define the initially navigated date in the calendar.
      */
    var initialFocusedDate: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * If set, interval selection is allowed
      */
    var intervalSelection: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.38.5
      *
      * Association to the `CalendarLegend` explaining the colors of the `specialDates`.
      *
      * **Note** The legend does not have to be rendered but must exist, and all required types must be assigned.
      */
    var legend: js.UndefOr[typings.openui5.sapUiUnifiedCalendarLegendMod.default | String] = js.undefined
    
    /**
      * @SINCE 1.38.0
      *
      * Maximum date that can be shown and selected in the Calendar. This must be a JavaScript date object.
      *
      * **Note:** if the date is inside of a month the complete month is displayed, but dates outside the valid
      * range can not be selected.
      *
      * **Note:** If the `maxDate` is set to be before the `minDate`, the `minDate` is set to the begin of the
      * month of the `maxDate`.
      */
    var maxDate: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.38.0
      *
      * Minimum date that can be shown and selected in the Calendar. This must be a JavaScript date object.
      *
      * **Note:** if the date is inside of a month the complete month is displayed, but dates outside the valid
      * range can not be selected.
      *
      * **Note:** If the `minDate` is set to be after the `maxDate`, the `maxDate` is set to the end of the month
      * of the `minDate`.
      */
    var minDate: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.28.0
      *
      * Determines the number of months displayed.
      *
      * As of version 1.50, the duplicated dates are not displayed if there are multiple months.
      *
      * **Note:** On phones, only one month is displayed.
      */
    var months: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.28.9
      *
      * If set, the provided weekdays are displayed as non-working days. Valid values inside the array are 0
      * to 6. If not set, the weekend defined in the locale settings is displayed as non-working days.
      *
      * **Note:** Keep in mind that this property sets only weekly-recurring days as non-working. If you need
      * specific dates or dates ranges, such as national holidays, use the `specialDates` aggregation to set
      * them. Both the non-working days (from property) and dates (from aggregation) are visualized the same.
      */
    var nonWorkingDays: js.UndefOr[
        js.Array[int] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.34.0
      *
      * If set, the calendar type is used for display. If not set, the calendar type of the global configuration
      * is used.
      */
    var primaryCalendarType: js.UndefOr[
        CalendarType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.34.0
      *
      * If set, the days are also displayed in this calendar type If not set, the dates are only displayed in
      * the primary calendar type
      */
    var secondaryCalendarType: js.UndefOr[
        CalendarType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Date selection changed
      */
    var select: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Dates or date ranges for selected dates.
      *
      * To set a single date (instead of a range), set only the `startDate` property of the {@link sap.ui.unified.DateRange}
      * class.
      */
    var selectedDates: js.UndefOr[
        js.Array[typings.openui5.sapUiUnifiedDateRangeMod.default] | typings.openui5.sapUiUnifiedDateRangeMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.95
      *
      * Determines whether there is a shortcut navigation to Today. When used in Month, Year or Year-range picker
      * view, the calendar navigates to Day picker view.
      */
    var showCurrentDateButton: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.48
      *
      * Determines whether the week numbers in the months are displayed.
      *
      * **Note:** For Islamic calendars, the week numbers are not displayed regardless of what is set to this
      * property.
      */
    var showWeekNumbers: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * If set, only a single date or interval, if intervalSelection is enabled, can be selected
      */
    var singleSelection: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.24.0
      *
      * Dates or date ranges with type, to visualize special days in the `Calendar`. If one day is assigned to
      * more than one Type, only the first one will be used.
      *
      * To set a single date (instead of a range), set only the `startDate` property of the {@link sap.ui.unified.DateRange}
      * class.
      *
      * **Note:** Keep in mind that the `NonWorking` type is for marking specific dates or date ranges as non-working,
      * where if you need a weekly-reccuring non-working days (weekend), you should use the `nonWorkingDays`
      * property. Both the non-working days (from property) and dates (from aggregation) are visualized the same.
      */
    var specialDates: js.UndefOr[
        js.Array[typings.openui5.sapUiUnifiedDateTypeRangeMod.default] | typings.openui5.sapUiUnifiedDateTypeRangeMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.34.0
      *
      * `startDate` was changed while navigation in `Calendar`
      *
      * Use `getStartDate` function to determine the current start date
      */
    var startDateChange: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.56
      *
      * Week number selection changed. By default, clicking on the week number will select the corresponding
      * week. If the week has already been selected, clicking the week number will deselect it.
      *
      * The default behavior can be prevented using the `preventDefault` method.
      *
      * **Note** Works for Gregorian calendars only and when `intervalSelection` is set to 'true'.
      */
    var weekNumberSelect: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.38.0
      *
      * Width of Calendar
      *
      * **Note:** There is a theme depending minimum width, so the calendar can not be set smaller.
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object CalendarSettings {
    
    inline def apply(): CalendarSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CalendarSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CalendarSettings] (val x: Self) extends AnyVal {
      
      inline def setAriaLabelledBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAriaLabelledByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaLabelledBy", js.Array(value*))
      
      inline def setCalendarWeekNumbering(
        value: CalendarWeekNumbering | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarWeekNumbering * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "calendarWeekNumbering", value.asInstanceOf[js.Any])
      
      inline def setCalendarWeekNumberingUndefined: Self = StObject.set(x, "calendarWeekNumbering", js.undefined)
      
      inline def setCancel(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setDisabledDates(
        value: js.Array[typings.openui5.sapUiUnifiedDateRangeMod.default] | typings.openui5.sapUiUnifiedDateRangeMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "disabledDates", value.asInstanceOf[js.Any])
      
      inline def setDisabledDatesUndefined: Self = StObject.set(x, "disabledDates", js.undefined)
      
      inline def setDisabledDatesVarargs(value: typings.openui5.sapUiUnifiedDateRangeMod.default*): Self = StObject.set(x, "disabledDates", js.Array(value*))
      
      inline def setFirstDayOfWeek(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
      
      inline def setFirstDayOfWeekUndefined: Self = StObject.set(x, "firstDayOfWeek", js.undefined)
      
      inline def setInitialFocusedDate(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "initialFocusedDate", value.asInstanceOf[js.Any])
      
      inline def setInitialFocusedDateUndefined: Self = StObject.set(x, "initialFocusedDate", js.undefined)
      
      inline def setIntervalSelection(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "intervalSelection", value.asInstanceOf[js.Any])
      
      inline def setIntervalSelectionUndefined: Self = StObject.set(x, "intervalSelection", js.undefined)
      
      inline def setLegend(value: typings.openui5.sapUiUnifiedCalendarLegendMod.default | String): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
      
      inline def setMaxDate(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMinDate(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setMonths(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      inline def setMonthsUndefined: Self = StObject.set(x, "months", js.undefined)
      
      inline def setNonWorkingDays(value: js.Array[int] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "nonWorkingDays", value.asInstanceOf[js.Any])
      
      inline def setNonWorkingDaysUndefined: Self = StObject.set(x, "nonWorkingDays", js.undefined)
      
      inline def setNonWorkingDaysVarargs(value: int*): Self = StObject.set(x, "nonWorkingDays", js.Array(value*))
      
      inline def setPrimaryCalendarType(
        value: CalendarType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "primaryCalendarType", value.asInstanceOf[js.Any])
      
      inline def setPrimaryCalendarTypeUndefined: Self = StObject.set(x, "primaryCalendarType", js.undefined)
      
      inline def setSecondaryCalendarType(
        value: CalendarType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "secondaryCalendarType", value.asInstanceOf[js.Any])
      
      inline def setSecondaryCalendarTypeUndefined: Self = StObject.set(x, "secondaryCalendarType", js.undefined)
      
      inline def setSelect(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      inline def setSelectedDates(
        value: js.Array[typings.openui5.sapUiUnifiedDateRangeMod.default] | typings.openui5.sapUiUnifiedDateRangeMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "selectedDates", value.asInstanceOf[js.Any])
      
      inline def setSelectedDatesUndefined: Self = StObject.set(x, "selectedDates", js.undefined)
      
      inline def setSelectedDatesVarargs(value: typings.openui5.sapUiUnifiedDateRangeMod.default*): Self = StObject.set(x, "selectedDates", js.Array(value*))
      
      inline def setShowCurrentDateButton(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showCurrentDateButton", value.asInstanceOf[js.Any])
      
      inline def setShowCurrentDateButtonUndefined: Self = StObject.set(x, "showCurrentDateButton", js.undefined)
      
      inline def setShowWeekNumbers(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showWeekNumbers", value.asInstanceOf[js.Any])
      
      inline def setShowWeekNumbersUndefined: Self = StObject.set(x, "showWeekNumbers", js.undefined)
      
      inline def setSingleSelection(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "singleSelection", value.asInstanceOf[js.Any])
      
      inline def setSingleSelectionUndefined: Self = StObject.set(x, "singleSelection", js.undefined)
      
      inline def setSpecialDates(
        value: js.Array[typings.openui5.sapUiUnifiedDateTypeRangeMod.default] | typings.openui5.sapUiUnifiedDateTypeRangeMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "specialDates", value.asInstanceOf[js.Any])
      
      inline def setSpecialDatesUndefined: Self = StObject.set(x, "specialDates", js.undefined)
      
      inline def setSpecialDatesVarargs(value: typings.openui5.sapUiUnifiedDateTypeRangeMod.default*): Self = StObject.set(x, "specialDates", js.Array(value*))
      
      inline def setStartDateChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "startDateChange", js.Any.fromFunction1(value))
      
      inline def setStartDateChangeUndefined: Self = StObject.set(x, "startDateChange", js.undefined)
      
      inline def setWeekNumberSelect(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "weekNumberSelect", js.Any.fromFunction1(value))
      
      inline def setWeekNumberSelectUndefined: Self = StObject.set(x, "weekNumberSelect", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
