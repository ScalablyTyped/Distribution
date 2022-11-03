package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.openui5.sapUiUnifiedLibraryMod.CalendarAppointmentHeight
import typings.openui5.sapUiUnifiedLibraryMod.CalendarIntervalType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMPlanningCalendarViewMod {
  
  @JSImport("sap/m/PlanningCalendarView", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `PlanningCalendarView`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends PlanningCalendarView {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: PlanningCalendarViewSettings) = this()
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
    mSettings: PlanningCalendarViewSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: PlanningCalendarViewSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/PlanningCalendarView", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.PlanningCalendarView with name `sClassName` and enriches it with
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
    oClassInfo: ClassInfo[T, PlanningCalendarView]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, PlanningCalendarView],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.PlanningCalendarView.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait PlanningCalendarView
    extends typings.openui5.sapUiCoreElementMod.default {
    
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
      * Gets current value of property {@link #getDescription description}.
      *
      * Defines the description of the `PlanningCalendarView`.
      *
      * @returns Value of property `description`
      */
    def getDescription(): String = js.native
    
    /**
      * @SINCE 1.93
      * @EXPERIMENTAL (since 1.93) - This class is experimental and provides only limited functionality. Also
      * the API might be changed in future.
      *
      * Gets current value of property {@link #getIntervalLabelFormatter intervalLabelFormatter}.
      *
      * A function that formats the interval.
      *
      * @returns Value of property `intervalLabelFormatter`
      */
    def getIntervalLabelFormatter(): js.Object = js.native
    
    /**
      * @SINCE 1.93
      * @EXPERIMENTAL (since 1.93) - This class is experimental and provides only limited functionality. Also
      * the API might be changed in future.
      *
      * Gets current value of property {@link #getIntervalSize intervalSize}.
      *
      * An integer that defines the period size.
      *
      * Default value is `1`.
      *
      * @returns Value of property `intervalSize`
      */
    def getIntervalSize(): int = js.native
    
    /**
      * Gets current value of property {@link #getIntervalType intervalType}.
      *
      * Determines the type of the intervals of the row.
      *
      * **Note:** Not all predefined interval types are supported for this property. For more information, see
      * the descriptions in the {@link sap.ui.unified.CalendarIntervalType CalendarIntervalType} enumeration.
      *
      * Default value is `Hour`.
      *
      * @returns Value of property `intervalType`
      */
    def getIntervalType(): CalendarIntervalType = js.native
    
    /**
      * Gets current value of property {@link #getIntervalsL intervalsL}.
      *
      * Defines the number of intervals that are displayed for a {@link sap.m.PlanningCalendar} that is more
      * than 1024 pixels wide.
      *
      * Default value is `12`.
      *
      * @returns Value of property `intervalsL`
      */
    def getIntervalsL(): int = js.native
    
    /**
      * Gets current value of property {@link #getIntervalsM intervalsM}.
      *
      * Defines the number of intervals that are displayed for a {@link sap.m.PlanningCalendar} that is between
      * 600 and 1024 pixels wide.
      *
      * Default value is `8`.
      *
      * @returns Value of property `intervalsM`
      */
    def getIntervalsM(): int = js.native
    
    /**
      * Gets current value of property {@link #getIntervalsS intervalsS}.
      *
      * Defines the number of intervals that are displayed for a {@link sap.m.PlanningCalendar} that is less
      * than 600 pixels wide. **Note:** On a phone the maximum visible intervals are 8.
      *
      * Default value is `6`.
      *
      * @returns Value of property `intervalsS`
      */
    def getIntervalsS(): int = js.native
    
    /**
      * Gets current value of property {@link #getKey key}.
      *
      * Defines the key of the view. This must be set to identify the used view in the {@link sap.m.PlanningCalendar}.
      *
      * @returns Value of property `key`
      */
    def getKey(): String = js.native
    
    /**
      * @SINCE 1.93
      * @EXPERIMENTAL (since 1.93) - This class is experimental and provides only limited functionality. Also
      * the API might be changed in future.
      *
      * Gets current value of property {@link #getRelative relative}.
      *
      * Defines if the view will be relative. NOTE: Relative views, can be only used with intervalType - Day
      * and when used they need intervalSize and intervalLabelFormatter defined.
      *
      * Default value is `false`.
      *
      * @returns Value of property `relative`
      */
    def getRelative(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowSubIntervals showSubIntervals}.
      *
      * If set, subintervals are displayed as lines in the rows.
      *
      *
      * 	 - Quarter hour subintervals for interval type `Hour`.
      * 	 - Hour subintervals for interval types `Day`, `Week` and `OneMonth`.
      * 	 - Day subintervals for interval type `Month`.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showSubIntervals`
      */
    def getShowSubIntervals(): Boolean = js.native
    
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
      * Sets a new value for property {@link #getDescription description}.
      *
      * Defines the description of the `PlanningCalendarView`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDescription(/**
      * New value for property `description`
      */
    sDescription: String): this.type = js.native
    
    /**
      * @SINCE 1.93
      * @EXPERIMENTAL (since 1.93) - This class is experimental and provides only limited functionality. Also
      * the API might be changed in future.
      *
      * Sets a new value for property {@link #getIntervalLabelFormatter intervalLabelFormatter}.
      *
      * A function that formats the interval.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIntervalLabelFormatter(/**
      * New value for property `intervalLabelFormatter`
      */
    oIntervalLabelFormatter: js.Object): this.type = js.native
    
    /**
      * @SINCE 1.93
      * @EXPERIMENTAL (since 1.93) - This class is experimental and provides only limited functionality. Also
      * the API might be changed in future.
      *
      * Sets a new value for property {@link #getIntervalSize intervalSize}.
      *
      * An integer that defines the period size.
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
      * Determines the type of the intervals of the row.
      *
      * **Note:** Not all predefined interval types are supported for this property. For more information, see
      * the descriptions in the {@link sap.ui.unified.CalendarIntervalType CalendarIntervalType} enumeration.
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
      * Sets a new value for property {@link #getIntervalsL intervalsL}.
      *
      * Defines the number of intervals that are displayed for a {@link sap.m.PlanningCalendar} that is more
      * than 1024 pixels wide.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `12`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIntervalsL(): this.type = js.native
    def setIntervalsL(/**
      * New value for property `intervalsL`
      */
    iIntervalsL: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIntervalsM intervalsM}.
      *
      * Defines the number of intervals that are displayed for a {@link sap.m.PlanningCalendar} that is between
      * 600 and 1024 pixels wide.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `8`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIntervalsM(): this.type = js.native
    def setIntervalsM(/**
      * New value for property `intervalsM`
      */
    iIntervalsM: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIntervalsS intervalsS}.
      *
      * Defines the number of intervals that are displayed for a {@link sap.m.PlanningCalendar} that is less
      * than 600 pixels wide. **Note:** On a phone the maximum visible intervals are 8.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `6`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIntervalsS(): this.type = js.native
    def setIntervalsS(/**
      * New value for property `intervalsS`
      */
    iIntervalsS: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getKey key}.
      *
      * Defines the key of the view. This must be set to identify the used view in the {@link sap.m.PlanningCalendar}.
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
      * @SINCE 1.93
      * @EXPERIMENTAL (since 1.93) - This class is experimental and provides only limited functionality. Also
      * the API might be changed in future.
      *
      * Sets a new value for property {@link #getRelative relative}.
      *
      * Defines if the view will be relative. NOTE: Relative views, can be only used with intervalType - Day
      * and when used they need intervalSize and intervalLabelFormatter defined.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setRelative(): this.type = js.native
    def setRelative(/**
      * New value for property `relative`
      */
    bRelative: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowSubIntervals showSubIntervals}.
      *
      * If set, subintervals are displayed as lines in the rows.
      *
      *
      * 	 - Quarter hour subintervals for interval type `Hour`.
      * 	 - Hour subintervals for interval types `Day`, `Week` and `OneMonth`.
      * 	 - Day subintervals for interval type `Month`.
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
  }
  
  trait PlanningCalendarViewSettings
    extends StObject
       with ElementSettings {
    
    /**
      * @SINCE 1.81.0
      *
      * Determines the different possible sizes for appointments.
      */
    var appointmentHeight: js.UndefOr[
        CalendarAppointmentHeight | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarAppointmentHeight * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines the description of the `PlanningCalendarView`.
      */
    var description: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.93
      * @EXPERIMENTAL (since 1.93) - This class is experimental and provides only limited functionality. Also
      * the API might be changed in future.
      *
      * A function that formats the interval.
      */
    var intervalLabelFormatter: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.93
      * @EXPERIMENTAL (since 1.93) - This class is experimental and provides only limited functionality. Also
      * the API might be changed in future.
      *
      * An integer that defines the period size.
      */
    var intervalSize: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Determines the type of the intervals of the row.
      *
      * **Note:** Not all predefined interval types are supported for this property. For more information, see
      * the descriptions in the {@link sap.ui.unified.CalendarIntervalType CalendarIntervalType} enumeration.
      */
    var intervalType: js.UndefOr[
        CalendarIntervalType | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the number of intervals that are displayed for a {@link sap.m.PlanningCalendar} that is more
      * than 1024 pixels wide.
      */
    var intervalsL: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Defines the number of intervals that are displayed for a {@link sap.m.PlanningCalendar} that is between
      * 600 and 1024 pixels wide.
      */
    var intervalsM: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Defines the number of intervals that are displayed for a {@link sap.m.PlanningCalendar} that is less
      * than 600 pixels wide. **Note:** On a phone the maximum visible intervals are 8.
      */
    var intervalsS: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Defines the key of the view. This must be set to identify the used view in the {@link sap.m.PlanningCalendar}.
      */
    var key: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.93
      * @EXPERIMENTAL (since 1.93) - This class is experimental and provides only limited functionality. Also
      * the API might be changed in future.
      *
      * Defines if the view will be relative. NOTE: Relative views, can be only used with intervalType - Day
      * and when used they need intervalSize and intervalLabelFormatter defined.
      */
    var relative: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * If set, subintervals are displayed as lines in the rows.
      *
      *
      * 	 - Quarter hour subintervals for interval type `Hour`.
      * 	 - Hour subintervals for interval types `Day`, `Week` and `OneMonth`.
      * 	 - Day subintervals for interval type `Month`.
      */
    var showSubIntervals: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object PlanningCalendarViewSettings {
    
    inline def apply(): PlanningCalendarViewSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlanningCalendarViewSettings]
    }
    
    extension [Self <: PlanningCalendarViewSettings](x: Self) {
      
      inline def setAppointmentHeight(
        value: CalendarAppointmentHeight | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarAppointmentHeight * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "appointmentHeight", value.asInstanceOf[js.Any])
      
      inline def setAppointmentHeightUndefined: Self = StObject.set(x, "appointmentHeight", js.undefined)
      
      inline def setDescription(value: String | PropertyBindingInfo): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setIntervalLabelFormatter(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "intervalLabelFormatter", value.asInstanceOf[js.Any])
      
      inline def setIntervalLabelFormatterUndefined: Self = StObject.set(x, "intervalLabelFormatter", js.undefined)
      
      inline def setIntervalSize(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "intervalSize", value.asInstanceOf[js.Any])
      
      inline def setIntervalSizeUndefined: Self = StObject.set(x, "intervalSize", js.undefined)
      
      inline def setIntervalType(
        value: CalendarIntervalType | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "intervalType", value.asInstanceOf[js.Any])
      
      inline def setIntervalTypeUndefined: Self = StObject.set(x, "intervalType", js.undefined)
      
      inline def setIntervalsL(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "intervalsL", value.asInstanceOf[js.Any])
      
      inline def setIntervalsLUndefined: Self = StObject.set(x, "intervalsL", js.undefined)
      
      inline def setIntervalsM(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "intervalsM", value.asInstanceOf[js.Any])
      
      inline def setIntervalsMUndefined: Self = StObject.set(x, "intervalsM", js.undefined)
      
      inline def setIntervalsS(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "intervalsS", value.asInstanceOf[js.Any])
      
      inline def setIntervalsSUndefined: Self = StObject.set(x, "intervalsS", js.undefined)
      
      inline def setKey(value: String | PropertyBindingInfo): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setRelative(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      inline def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
      
      inline def setShowSubIntervals(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showSubIntervals", value.asInstanceOf[js.Any])
      
      inline def setShowSubIntervalsUndefined: Self = StObject.set(x, "showSubIntervals", js.undefined)
    }
  }
}
