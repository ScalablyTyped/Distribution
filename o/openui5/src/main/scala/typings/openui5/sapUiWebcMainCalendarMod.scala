package typings.openui5

import typings.openui5.anon.Dates
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreCalendarTypeMod.CalendarType
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiWebcMainLibraryMod.CalendarSelectionMode
import typings.openui5.sapUiWebcMainLibraryMod.ICalendarDate
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiWebcMainCalendarMod {
  
  @JSImport("sap/ui/webc/main/Calendar", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `Calendar`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Calendar {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: CalendarSettings) = this()
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
    mSettings: CalendarSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: CalendarSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/webc/main/Calendar", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.webc.main.Calendar with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.webc.common.WebComponent.extend}.
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
      * Returns a metadata object for class sap.ui.webc.main.Calendar.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default]
  }
  
  @js.native
  trait Calendar
    extends typings.openui5.sapUiWebcCommonWebComponentMod.default {
    
    /**
      * Adds some date to the aggregation {@link #getDates dates}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addDate(/**
      * The date to add; if empty, nothing is inserted
      */
    oDate: ICalendarDate): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:selectedDatesChange selectedDatesChange} event
      * of this `sap.ui.webc.main.Calendar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.Calendar` itself.
      *
      * Fired when the selected dates change. **Note:** If you call `preventDefault()` for this event, the component
      * will not create instances of `sap.ui.webc.main.CalendarDate` for the newly selected dates. In that case
      * you should do this manually.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSelectedDatesChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachSelectedDatesChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.Calendar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:selectedDatesChange selectedDatesChange} event
      * of this `sap.ui.webc.main.Calendar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.Calendar` itself.
      *
      * Fired when the selected dates change. **Note:** If you call `preventDefault()` for this event, the component
      * will not create instances of `sap.ui.webc.main.CalendarDate` for the newly selected dates. In that case
      * you should do this manually.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSelectedDatesChange(
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
    def attachSelectedDatesChange(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.Calendar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys all the dates in the aggregation {@link #getDates dates}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyDates(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:selectedDatesChange selectedDatesChange} event
      * of this `sap.ui.webc.main.Calendar`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSelectedDatesChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachSelectedDatesChange(
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
      * Fires event {@link #event:selectedDatesChange selectedDatesChange} to attached listeners.
      *
      * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
      * event object. The return value of this method indicates whether the default action should be executed.
      *
      * @returns Whether or not to prevent the default action
      */
    def fireSelectedDatesChange(): Boolean = js.native
    def fireSelectedDatesChange(/**
      * Parameters to pass along with the event
      */
    mParameters: Dates): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getDates dates}.
      *
      * Defines the selected date or dates (depending on the `selectionMode` property) for this calendar as instances
      * of `sap.ui.webc.main.CalendarDate`
      */
    def getDates(): js.Array[ICalendarDate] = js.native
    
    /**
      * Gets current value of property {@link #getFormatPattern formatPattern}.
      *
      * Determines the format, displayed in the input field.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `formatPattern`
      */
    def getFormatPattern(): String = js.native
    
    /**
      * Gets current value of property {@link #getHideWeekNumbers hideWeekNumbers}.
      *
      * Defines the visibility of the week numbers column.
      *
      *
      *
      * **Note:** For calendars other than Gregorian, the week numbers are not displayed regardless of what is
      * set.
      *
      * Default value is `false`.
      *
      * @returns Value of property `hideWeekNumbers`
      */
    def getHideWeekNumbers(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getMaxDate maxDate}.
      *
      * Determines the maximum date available for selection.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `maxDate`
      */
    def getMaxDate(): String = js.native
    
    /**
      * Gets current value of property {@link #getMinDate minDate}.
      *
      * Determines the minimum date available for selection.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `minDate`
      */
    def getMinDate(): String = js.native
    
    /**
      * Gets current value of property {@link #getPrimaryCalendarType primaryCalendarType}.
      *
      * Sets a calendar type used for display. If not set, the calendar type of the global configuration is used.
      *
      * @returns Value of property `primaryCalendarType`
      */
    def getPrimaryCalendarType(): CalendarType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getSecondaryCalendarType secondaryCalendarType}.
      *
      * Defines the secondary calendar type. If not set, the calendar will only show the primary calendar type.
      *
      * Default value is `undefined`.
      *
      * @returns Value of property `secondaryCalendarType`
      */
    def getSecondaryCalendarType(): CalendarType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getSelectionMode selectionMode}.
      *
      * Defines the type of selection used in the calendar component. Accepted property values are:
      *
      *
      *
      * 	 - `CalendarSelectionMode.Single` - enables a single date selection.(default value)
      * 	 - `CalendarSelectionMode.Range` - enables selection of a date range.
      * 	 - `CalendarSelectionMode.Multiple` - enables selection of multiple dates.
      *
      * Default value is `Single`.
      *
      * @returns Value of property `selectionMode`
      */
    def getSelectionMode(): CalendarSelectionMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarSelectionMode * / any */ String) = js.native
    
    /**
      * Checks for the provided `sap.ui.webc.main.ICalendarDate` in the aggregation {@link #getDates dates}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfDate(/**
      * The date whose index is looked for
      */
    oDate: ICalendarDate): int = js.native
    
    /**
      * Inserts a date into the aggregation {@link #getDates dates}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertDate(
      /**
      * The date to insert; if empty, nothing is inserted
      */
    oDate: ICalendarDate,
      /**
      * The `0`-based index the date should be inserted at; for a negative value of `iIndex`, the date is inserted
      * at position 0; for a value greater than the current size of the aggregation, the date is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getDates dates}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllDates(): js.Array[ICalendarDate] = js.native
    
    def removeDate(/**
      * The date to remove or its index or id
      */
    vDate: String): ICalendarDate | Null = js.native
    /**
      * Removes a date from the aggregation {@link #getDates dates}.
      *
      * @returns The removed date or `null`
      */
    def removeDate(/**
      * The date to remove or its index or id
      */
    vDate: int): ICalendarDate | Null = js.native
    def removeDate(/**
      * The date to remove or its index or id
      */
    vDate: ICalendarDate): ICalendarDate | Null = js.native
    
    /**
      * Sets a new value for property {@link #getFormatPattern formatPattern}.
      *
      * Determines the format, displayed in the input field.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFormatPattern(): this.type = js.native
    def setFormatPattern(/**
      * New value for property `formatPattern`
      */
    sFormatPattern: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHideWeekNumbers hideWeekNumbers}.
      *
      * Defines the visibility of the week numbers column.
      *
      *
      *
      * **Note:** For calendars other than Gregorian, the week numbers are not displayed regardless of what is
      * set.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHideWeekNumbers(): this.type = js.native
    def setHideWeekNumbers(/**
      * New value for property `hideWeekNumbers`
      */
    bHideWeekNumbers: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMaxDate maxDate}.
      *
      * Determines the maximum date available for selection.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMaxDate(): this.type = js.native
    def setMaxDate(/**
      * New value for property `maxDate`
      */
    sMaxDate: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMinDate minDate}.
      *
      * Determines the minimum date available for selection.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMinDate(): this.type = js.native
    def setMinDate(/**
      * New value for property `minDate`
      */
    sMinDate: String): this.type = js.native
    
    def setPrimaryCalendarType(
      /**
      * New value for property `primaryCalendarType`
      */
    sPrimaryCalendarType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String
    ): this.type = js.native
    /**
      * Sets a new value for property {@link #getPrimaryCalendarType primaryCalendarType}.
      *
      * Sets a calendar type used for display. If not set, the calendar type of the global configuration is used.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPrimaryCalendarType(/**
      * New value for property `primaryCalendarType`
      */
    sPrimaryCalendarType: CalendarType): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSecondaryCalendarType secondaryCalendarType}.
      *
      * Defines the secondary calendar type. If not set, the calendar will only show the primary calendar type.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `undefined`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSecondaryCalendarType(): this.type = js.native
    def setSecondaryCalendarType(
      /**
      * New value for property `secondaryCalendarType`
      */
    sSecondaryCalendarType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String
    ): this.type = js.native
    def setSecondaryCalendarType(/**
      * New value for property `secondaryCalendarType`
      */
    sSecondaryCalendarType: CalendarType): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSelectionMode selectionMode}.
      *
      * Defines the type of selection used in the calendar component. Accepted property values are:
      *
      *
      *
      * 	 - `CalendarSelectionMode.Single` - enables a single date selection.(default value)
      * 	 - `CalendarSelectionMode.Range` - enables selection of a date range.
      * 	 - `CalendarSelectionMode.Multiple` - enables selection of multiple dates.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Single`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSelectionMode(): this.type = js.native
    def setSelectionMode(
      /**
      * New value for property `selectionMode`
      */
    sSelectionMode: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarSelectionMode * / any */ String
    ): this.type = js.native
    def setSelectionMode(/**
      * New value for property `selectionMode`
      */
    sSelectionMode: CalendarSelectionMode): this.type = js.native
  }
  
  trait CalendarSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Defines the selected date or dates (depending on the `selectionMode` property) for this calendar as instances
      * of `sap.ui.webc.main.CalendarDate`
      */
    var dates: js.UndefOr[
        js.Array[ICalendarDate] | ICalendarDate | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines the format, displayed in the input field.
      */
    var formatPattern: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the visibility of the week numbers column.
      *
      *
      *
      * **Note:** For calendars other than Gregorian, the week numbers are not displayed regardless of what is
      * set.
      */
    var hideWeekNumbers: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines the maximum date available for selection.
      */
    var maxDate: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Determines the minimum date available for selection.
      */
    var minDate: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Sets a calendar type used for display. If not set, the calendar type of the global configuration is used.
      */
    var primaryCalendarType: js.UndefOr[
        CalendarType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines the secondary calendar type. If not set, the calendar will only show the primary calendar type.
      */
    var secondaryCalendarType: js.UndefOr[
        CalendarType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Fired when the selected dates change. **Note:** If you call `preventDefault()` for this event, the component
      * will not create instances of `sap.ui.webc.main.CalendarDate` for the newly selected dates. In that case
      * you should do this manually.
      */
    var selectedDatesChange: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Defines the type of selection used in the calendar component. Accepted property values are:
      *
      *
      *
      * 	 - `CalendarSelectionMode.Single` - enables a single date selection.(default value)
      * 	 - `CalendarSelectionMode.Range` - enables selection of a date range.
      * 	 - `CalendarSelectionMode.Multiple` - enables selection of multiple dates.
      */
    var selectionMode: js.UndefOr[
        CalendarSelectionMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarSelectionMode * / any */ String) | PropertyBindingInfo
      ] = js.undefined
  }
  object CalendarSettings {
    
    inline def apply(): CalendarSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CalendarSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CalendarSettings] (val x: Self) extends AnyVal {
      
      inline def setDates(
        value: js.Array[ICalendarDate] | ICalendarDate | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "dates", value.asInstanceOf[js.Any])
      
      inline def setDatesUndefined: Self = StObject.set(x, "dates", js.undefined)
      
      inline def setDatesVarargs(value: ICalendarDate*): Self = StObject.set(x, "dates", js.Array(value*))
      
      inline def setFormatPattern(value: String | PropertyBindingInfo): Self = StObject.set(x, "formatPattern", value.asInstanceOf[js.Any])
      
      inline def setFormatPatternUndefined: Self = StObject.set(x, "formatPattern", js.undefined)
      
      inline def setHideWeekNumbers(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "hideWeekNumbers", value.asInstanceOf[js.Any])
      
      inline def setHideWeekNumbersUndefined: Self = StObject.set(x, "hideWeekNumbers", js.undefined)
      
      inline def setMaxDate(value: String | PropertyBindingInfo): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMinDate(value: String | PropertyBindingInfo): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setPrimaryCalendarType(
        value: CalendarType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "primaryCalendarType", value.asInstanceOf[js.Any])
      
      inline def setPrimaryCalendarTypeUndefined: Self = StObject.set(x, "primaryCalendarType", js.undefined)
      
      inline def setSecondaryCalendarType(
        value: CalendarType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "secondaryCalendarType", value.asInstanceOf[js.Any])
      
      inline def setSecondaryCalendarTypeUndefined: Self = StObject.set(x, "secondaryCalendarType", js.undefined)
      
      inline def setSelectedDatesChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "selectedDatesChange", js.Any.fromFunction1(value))
      
      inline def setSelectedDatesChangeUndefined: Self = StObject.set(x, "selectedDatesChange", js.undefined)
      
      inline def setSelectionMode(
        value: CalendarSelectionMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarSelectionMode * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
      
      inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
    }
  }
}
