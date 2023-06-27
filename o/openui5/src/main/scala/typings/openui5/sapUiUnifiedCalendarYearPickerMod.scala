package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreCalendarTypeMod.CalendarType
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiUnifiedCalendarYearPickerMod {
  
  @JSImport("sap/ui/unified/calendar/YearPicker", JSImport.Default)
  @js.native
  /**
    * Constructor for a new YearPicker.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends YearPicker {
    def this(/**
      * initial settings for the new control
      */
    mSettings: YearPickerSettings) = this()
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
    mSettings: YearPickerSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: YearPickerSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/unified/calendar/YearPicker", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.unified.calendar.YearPicker with name `sClassName` and enriches
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
    oClassInfo: ClassInfo[T, YearPicker]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, YearPicker],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.unified.calendar.YearPicker.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait YearPicker
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * @since 1.74
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
      * @since 1.38.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:pageChange pageChange} event of this `sap.ui.unified.calendar.YearPicker`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.calendar.YearPicker` itself.
      *
      * The `pageChange` event is fired if the displayed years are changed by user navigation.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPageChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachPageChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.calendar.YearPicker`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @since 1.38.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:pageChange pageChange} event of this `sap.ui.unified.calendar.YearPicker`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.calendar.YearPicker` itself.
      *
      * The `pageChange` event is fired if the displayed years are changed by user navigation.
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.calendar.YearPicker`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:select select} event of this `sap.ui.unified.calendar.YearPicker`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.calendar.YearPicker` itself.
      *
      * Year selection changed
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSelect(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachSelect(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.calendar.YearPicker`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:select select} event of this `sap.ui.unified.calendar.YearPicker`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.calendar.YearPicker` itself.
      *
      * Year selection changed
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.calendar.YearPicker`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @since 1.74
      *
      * Destroys all the selectedDates in the aggregation {@link #getSelectedDates selectedDates}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroySelectedDates(): this.type = js.native
    
    /**
      * @since 1.38.0
      *
      * Detaches event handler `fnFunction` from the {@link #event:pageChange pageChange} event of this `sap.ui.unified.calendar.YearPicker`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachPageChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def detachPageChange(
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
      * Detaches event handler `fnFunction` from the {@link #event:select select} event of this `sap.ui.unified.calendar.YearPicker`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSelect(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def detachSelect(
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
      * @since 1.38.0
      * Protected:  Do not call from applications (only from related classes in the framework)
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
      * Protected:  Do not call from applications (only from related classes in the framework)
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
      * @since 1.30.0
      *
      * Gets current value of property {@link #getColumns columns}.
      *
      * number of years in each row 0 means just to have all years in one row, independent of the number
      *
      * Default value is `4`.
      *
      * @returns Value of property `columns`
      */
    def getColumns(): int = js.native
    
    /**
      * @since 1.34.0
      *
      * Gets current value of property {@link #getDate date}.
      *
      * Date as UI5Date or JavaScript Date object. For this date a `YearPicker` is rendered. If a Year is selected
      * the date is updated with the start date of the selected year (depending on the calendar type).
      *
      * @returns Value of property `date`
      */
    def getDate(): js.Object = js.native
    
    /**
      * @since 1.38.0
      *
      * Return the first date of the first rendered year **Note:** If the YearPicker is not rendered no date
      * is returned
      *
      * @returns A date instance
      */
    def getFirstRenderedDate(): js.Date | typings.openui5.sapUiCoreDateUi5dateMod.default = js.native
    
    /**
      * @since 1.74
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
      * @since 1.34.0
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
      * @since 1.104.0
      *
      * Gets current value of property {@link #getSecondaryCalendarType secondaryCalendarType}.
      *
      * If set, the years are also displayed in this calendar type If not set, the years are only displayed in
      * the primary calendar type
      *
      * @returns Value of property `secondaryCalendarType`
      */
    def getSecondaryCalendarType(): CalendarType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String) = js.native
    
    /**
      * @since 1.74
      *
      * Gets content of aggregation {@link #getSelectedDates selectedDates}.
      *
      * Date Ranges for selected dates of the YearPicker
      */
    def getSelectedDates(): js.Array[typings.openui5.sapUiUnifiedDateRangeMod.default] = js.native
    
    /**
      * @deprecated (since 1.34.0) - replaced by `date` property
      *
      * Gets current value of property {@link #getYear year}.
      *
      * The year is initial focused and selected The value must be between 0 and 9999
      *
      * Default value is `2000`.
      *
      * @returns Value of property `year`
      */
    def getYear(): int = js.native
    
    /**
      * @since 1.30.0
      *
      * Gets current value of property {@link #getYears years}.
      *
      * number of displayed years
      *
      * Default value is `20`.
      *
      * @returns Value of property `years`
      */
    def getYears(): int = js.native
    
    /**
      * @since 1.74
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
      * @since 1.74
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
      * @returns Reference to `this` for method chaining
      */
    def nextPage(): this.type = js.native
    
    /**
      * displays the previous page
      *
      * @returns Reference to `this` for method chaining
      */
    def previousPage(): this.type = js.native
    
    /**
      * @since 1.74
      *
      * Removes all the controls from the aggregation {@link #getSelectedDates selectedDates}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllSelectedDates(): js.Array[typings.openui5.sapUiUnifiedDateRangeMod.default] = js.native
    
    def removeSelectedDate(/**
      * The selectedDate to remove or its index or id
      */
    vSelectedDate: String): typings.openui5.sapUiUnifiedDateRangeMod.default | Null = js.native
    /**
      * @since 1.74
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
      * @since 1.30.0
      *
      * Sets a new value for property {@link #getColumns columns}.
      *
      * number of years in each row 0 means just to have all years in one row, independent of the number
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `4`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setColumns(): this.type = js.native
    def setColumns(/**
      * New value for property `columns`
      */
    iColumns: int): this.type = js.native
    
    /**
      * Setter for the `date` property
      *
      * @returns Reference to `this` for method chaining
      */
    def setDate(/**
      * a date instance
      */
    oDate: js.Date): this.type = js.native
    def setDate(/**
      * a date instance
      */
    oDate: typings.openui5.sapUiCoreDateUi5dateMod.default): this.type = js.native
    
    /**
      * @since 1.74
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
    
    def setPrimaryCalendarType(
      /**
      * New value for property `primaryCalendarType`
      */
    sPrimaryCalendarType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String
    ): this.type = js.native
    /**
      * @since 1.34.0
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
      * @since 1.104.0
      *
      * Sets a new value for property {@link #getSecondaryCalendarType secondaryCalendarType}.
      *
      * If set, the years are also displayed in this calendar type If not set, the years are only displayed in
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
      * @deprecated (since 1.34.0) - replaced by `date` property
      *
      * Sets a new value for property {@link #getYear year}.
      *
      * The year is initial focused and selected The value must be between 0 and 9999
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `2000`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setYear(): this.type = js.native
    def setYear(/**
      * New value for property `year`
      */
    iYear: int): this.type = js.native
    
    /**
      * @since 1.30.0
      *
      * Sets a new value for property {@link #getYears years}.
      *
      * number of displayed years
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `20`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setYears(): this.type = js.native
    def setYears(/**
      * New value for property `years`
      */
    iYears: int): this.type = js.native
  }
  
  trait YearPicker$PageChangeEventParameters extends StObject
  
  trait YearPicker$SelectEventParameters extends StObject
  
  type YearPickerPageChangeEvent = typings.openui5.sapUiBaseEventMod.default[YearPicker$PageChangeEventParameters]
  
  type YearPickerPageChangeEventParameters = YearPicker$PageChangeEventParameters
  
  type YearPickerSelectEvent = typings.openui5.sapUiBaseEventMod.default[YearPicker$SelectEventParameters]
  
  type YearPickerSelectEventParameters = YearPicker$SelectEventParameters
  
  trait YearPickerSettings
    extends StObject
       with ControlSettings {
    
    /**
      * @since 1.30.0
      *
      * number of years in each row 0 means just to have all years in one row, independent of the number
      */
    var columns: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @since 1.34.0
      *
      * Date as UI5Date or JavaScript Date object. For this date a `YearPicker` is rendered. If a Year is selected
      * the date is updated with the start date of the selected year (depending on the calendar type).
      */
    var date: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.74
      *
      * If set, interval selection is allowed
      */
    var intervalSelection: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.38.0
      *
      * The `pageChange` event is fired if the displayed years are changed by user navigation.
      */
    var pageChange: js.UndefOr[
        js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
      ] = js.undefined
    
    /**
      * @since 1.34.0
      *
      * If set, the calendar type is used for display. If not set, the calendar type of the global configuration
      * is used.
      */
    var primaryCalendarType: js.UndefOr[
        CalendarType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @since 1.104.0
      *
      * If set, the years are also displayed in this calendar type If not set, the years are only displayed in
      * the primary calendar type
      */
    var secondaryCalendarType: js.UndefOr[
        CalendarType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Year selection changed
      */
    var select: js.UndefOr[
        js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
      ] = js.undefined
    
    /**
      * @since 1.74
      *
      * Date Ranges for selected dates of the YearPicker
      */
    var selectedDates: js.UndefOr[
        js.Array[typings.openui5.sapUiUnifiedDateRangeMod.default] | typings.openui5.sapUiUnifiedDateRangeMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @deprecated (since 1.34.0) - replaced by `date` property
      *
      * The year is initial focused and selected The value must be between 0 and 9999
      */
    var year: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @since 1.30.0
      *
      * number of displayed years
      */
    var years: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
  }
  object YearPickerSettings {
    
    inline def apply(): YearPickerSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[YearPickerSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: YearPickerSettings] (val x: Self) extends AnyVal {
      
      inline def setColumns(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setDate(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setIntervalSelection(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "intervalSelection", value.asInstanceOf[js.Any])
      
      inline def setIntervalSelectionUndefined: Self = StObject.set(x, "intervalSelection", js.undefined)
      
      inline def setPageChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object] => Unit): Self = StObject.set(x, "pageChange", js.Any.fromFunction1(value))
      
      inline def setPageChangeUndefined: Self = StObject.set(x, "pageChange", js.undefined)
      
      inline def setPrimaryCalendarType(
        value: CalendarType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "primaryCalendarType", value.asInstanceOf[js.Any])
      
      inline def setPrimaryCalendarTypeUndefined: Self = StObject.set(x, "primaryCalendarType", js.undefined)
      
      inline def setSecondaryCalendarType(
        value: CalendarType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "secondaryCalendarType", value.asInstanceOf[js.Any])
      
      inline def setSecondaryCalendarTypeUndefined: Self = StObject.set(x, "secondaryCalendarType", js.undefined)
      
      inline def setSelect(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object] => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      inline def setSelectedDates(
        value: js.Array[typings.openui5.sapUiUnifiedDateRangeMod.default] | typings.openui5.sapUiUnifiedDateRangeMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "selectedDates", value.asInstanceOf[js.Any])
      
      inline def setSelectedDatesUndefined: Self = StObject.set(x, "selectedDates", js.undefined)
      
      inline def setSelectedDatesVarargs(value: typings.openui5.sapUiUnifiedDateRangeMod.default*): Self = StObject.set(x, "selectedDates", js.Array(value*))
      
      inline def setYear(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
      
      inline def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
      
      inline def setYears(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "years", value.asInstanceOf[js.Any])
      
      inline def setYearsUndefined: Self = StObject.set(x, "years", js.undefined)
    }
  }
}
