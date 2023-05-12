package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreCalendarTypeMod.CalendarType
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiUnifiedCalendarMonthPickerMod {
  
  @JSImport("sap/ui/unified/calendar/MonthPicker", JSImport.Default)
  @js.native
  /**
    * Constructor for a new MonthPicker.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends MonthPicker {
    def this(/**
      * initial settings for the new control
      */
    mSettings: MonthPickerSettings) = this()
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
    mSettings: MonthPickerSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: MonthPickerSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/unified/calendar/MonthPicker", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.unified.calendar.MonthPicker with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, MonthPicker]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, MonthPicker],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.unified.calendar.MonthPicker.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait MonthPicker
    extends typings.openui5.sapUiCoreControlMod.default {
    
    def addAriaLabelledBy(
      /**
      * The ariaLabelledBy to add; if empty, nothing is inserted
      */
    vAriaLabelledBy: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * @SINCE 1.92
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
      * @SINCE 1.74
      *
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
      * @SINCE 1.38.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:pageChange pageChange} event of this `sap.ui.unified.calendar.MonthPicker`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.calendar.MonthPicker` itself.
      *
      * If less than 12 months are displayed the `pageChange` event is fired if the displayed months are changed
      * by user navigation.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPageChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachPageChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.calendar.MonthPicker`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.38.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:pageChange pageChange} event of this `sap.ui.unified.calendar.MonthPicker`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.calendar.MonthPicker` itself.
      *
      * If less than 12 months are displayed the `pageChange` event is fired if the displayed months are changed
      * by user navigation.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPageChange(
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
    def attachPageChange(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.calendar.MonthPicker`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:select select} event of this `sap.ui.unified.calendar.MonthPicker`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.calendar.MonthPicker` itself.
      *
      * Month selection changed
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
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.calendar.MonthPicker`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:select select} event of this `sap.ui.unified.calendar.MonthPicker`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.calendar.MonthPicker` itself.
      *
      * Month selection changed
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
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.calendar.MonthPicker`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.74
      *
      * Destroys all the selectedDates in the aggregation {@link #getSelectedDates selectedDates}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroySelectedDates(): this.type = js.native
    
    /**
      * @SINCE 1.38.0
      *
      * Detaches event handler `fnFunction` from the {@link #event:pageChange pageChange} event of this `sap.ui.unified.calendar.MonthPicker`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachPageChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachPageChange(
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
      * Detaches event handler `fnFunction` from the {@link #event:select select} event of this `sap.ui.unified.calendar.MonthPicker`.
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
      * @SINCE 1.38.0
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:pageChange pageChange} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def firePageChange(): this.type = js.native
    def firePageChange(/**
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
      * @SINCE 1.92
      *
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaLabelledBy
      * ariaLabelledBy}.
      */
    def getAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * @SINCE 1.30.0
      *
      * Gets current value of property {@link #getColumns columns}.
      *
      * number of months in each row The value must be between 0 and 12 (0 means just to have all months in one
      * row, independent of the number)
      *
      * Default value is `3`.
      *
      * @returns Value of property `columns`
      */
    def getColumns(): int = js.native
    
    /**
      * @SINCE 1.74
      *
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
      * Gets current value of property {@link #getMonth month}.
      *
      * The month is initial focused and selected The value must be between 0 and 11
      *
      * Default value is `0`.
      *
      * @returns Value of property `month`
      */
    def getMonth(): int = js.native
    
    /**
      * @SINCE 1.30.0
      *
      * Gets current value of property {@link #getMonths months}.
      *
      * number of displayed months The value must be between 1 and 12
      *
      * Default value is `12`.
      *
      * @returns Value of property `months`
      */
    def getMonths(): int = js.native
    
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
      * @SINCE 1.104.0
      *
      * Gets current value of property {@link #getSecondaryCalendarType secondaryCalendarType}.
      *
      * If set, the months are also displayed in this calendar type If not set, the months are only displayed
      * in the primary calendar type
      *
      * @returns Value of property `secondaryCalendarType`
      */
    def getSecondaryCalendarType(): CalendarType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String) = js.native
    
    /**
      * @SINCE 1.74
      *
      * Gets content of aggregation {@link #getSelectedDates selectedDates}.
      *
      * Date Ranges for selected dates of the MonthPicker
      */
    def getSelectedDates(): js.Array[typings.openui5.sapUiUnifiedDateRangeMod.default] = js.native
    
    /**
      * @SINCE 1.74
      *
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
      * @SINCE 1.74
      *
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
      * displays the next page
      *
      * @returns `this` to allow method chaining
      */
    def nextPage(): this.type = js.native
    
    /**
      * displays the previous page
      *
      * @returns `this` to allow method chaining
      */
    def previousPage(): this.type = js.native
    
    /**
      * @SINCE 1.92
      *
      * Removes all the controls in the association named {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * @SINCE 1.74
      *
      * Removes all the controls from the aggregation {@link #getSelectedDates selectedDates}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllSelectedDates(): js.Array[typings.openui5.sapUiUnifiedDateRangeMod.default] = js.native
    
    /**
      * @SINCE 1.92
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
    
    def removeSelectedDate(/**
      * The selectedDate to remove or its index or id
      */
    vSelectedDate: String): typings.openui5.sapUiUnifiedDateRangeMod.default | Null = js.native
    /**
      * @SINCE 1.74
      *
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
    
    /**
      * @SINCE 1.30.0
      *
      * Sets a new value for property {@link #getColumns columns}.
      *
      * number of months in each row The value must be between 0 and 12 (0 means just to have all months in one
      * row, independent of the number)
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `3`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setColumns(): this.type = js.native
    def setColumns(/**
      * New value for property `columns`
      */
    iColumns: int): this.type = js.native
    
    /**
      * @SINCE 1.74
      *
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
      * sets a minimum and maximum month
      *
      * @returns `this` to allow method chaining
      */
    def setMinMax(): this.type = js.native
    def setMinMax(
      /**
      * minimum month as integer (starting with 0)
      */
    iMin: Unit,
      /**
      * maximum month as integer (starting with 0)
      */
    iMax: int
    ): this.type = js.native
    def setMinMax(/**
      * minimum month as integer (starting with 0)
      */
    iMin: int): this.type = js.native
    def setMinMax(
      /**
      * minimum month as integer (starting with 0)
      */
    iMin: int,
      /**
      * maximum month as integer (starting with 0)
      */
    iMax: int
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMonth month}.
      *
      * The month is initial focused and selected The value must be between 0 and 11
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `0`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMonth(): this.type = js.native
    def setMonth(/**
      * New value for property `month`
      */
    iMonth: int): this.type = js.native
    
    /**
      * @SINCE 1.30.0
      *
      * Sets a new value for property {@link #getMonths months}.
      *
      * number of displayed months The value must be between 1 and 12
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `12`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMonths(): this.type = js.native
    def setMonths(/**
      * New value for property `months`
      */
    iMonths: int): this.type = js.native
    
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
      * @SINCE 1.104.0
      *
      * Sets a new value for property {@link #getSecondaryCalendarType secondaryCalendarType}.
      *
      * If set, the months are also displayed in this calendar type If not set, the months are only displayed
      * in the primary calendar type
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSecondaryCalendarType(/**
      * New value for property `secondaryCalendarType`
      */
    sSecondaryCalendarType: CalendarType): this.type = js.native
  }
  
  trait MonthPickerSettings
    extends StObject
       with ControlSettings {
    
    /**
      * @SINCE 1.92
      *
      * Association to controls / IDs that label this control (see WAI-ARIA attribute aria-labelledby).
      */
    var ariaLabelledBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * @SINCE 1.30.0
      *
      * number of months in each row The value must be between 0 and 12 (0 means just to have all months in one
      * row, independent of the number)
      */
    var columns: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.74
      *
      * If set, interval selection is allowed
      */
    var intervalSelection: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The month is initial focused and selected The value must be between 0 and 11
      */
    var month: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.30.0
      *
      * number of displayed months The value must be between 1 and 12
      */
    var months: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.38.0
      *
      * If less than 12 months are displayed the `pageChange` event is fired if the displayed months are changed
      * by user navigation.
      */
    var pageChange: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
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
      * @SINCE 1.104.0
      *
      * If set, the months are also displayed in this calendar type If not set, the months are only displayed
      * in the primary calendar type
      */
    var secondaryCalendarType: js.UndefOr[
        CalendarType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Month selection changed
      */
    var select: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.74
      *
      * Date Ranges for selected dates of the MonthPicker
      */
    var selectedDates: js.UndefOr[
        js.Array[typings.openui5.sapUiUnifiedDateRangeMod.default] | typings.openui5.sapUiUnifiedDateRangeMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object MonthPickerSettings {
    
    inline def apply(): MonthPickerSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MonthPickerSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MonthPickerSettings] (val x: Self) extends AnyVal {
      
      inline def setAriaLabelledBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAriaLabelledByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaLabelledBy", js.Array(value*))
      
      inline def setColumns(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setIntervalSelection(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "intervalSelection", value.asInstanceOf[js.Any])
      
      inline def setIntervalSelectionUndefined: Self = StObject.set(x, "intervalSelection", js.undefined)
      
      inline def setMonth(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
      
      inline def setMonths(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      inline def setMonthsUndefined: Self = StObject.set(x, "months", js.undefined)
      
      inline def setPageChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "pageChange", js.Any.fromFunction1(value))
      
      inline def setPageChangeUndefined: Self = StObject.set(x, "pageChange", js.undefined)
      
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
    }
  }
}
