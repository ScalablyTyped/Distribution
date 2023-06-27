package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreLibraryMod.CSSColor
import typings.openui5.sapUiUnifiedDateRangeMod.DateRangeSettings
import typings.openui5.sapUiUnifiedLibraryMod.CalendarDayType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiUnifiedDateTypeRangeMod {
  
  @JSImport("sap/ui/unified/DateTypeRange", JSImport.Default)
  @js.native
  /**
    * Constructor for a new DateTypeRange.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends DateTypeRange {
    def this(/**
      * initial settings for the new control
      */
    mSettings: DateTypeRangeSettings) = this()
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
    mSettings: DateTypeRangeSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: DateTypeRangeSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/unified/DateTypeRange", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.unified.DateTypeRange with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.unified.DateRange.extend}.
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
    oClassInfo: ClassInfo[T, DateTypeRange]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, DateTypeRange],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.unified.DateTypeRange.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait DateTypeRange
    extends typings.openui5.sapUiUnifiedDateRangeMod.default {
    
    /**
      * @since 1.76.0
      *
      * Gets current value of property {@link #getColor color}.
      *
      * Background color of the `Calendar` `specialDates` aggregation. If set, this color will override the default
      * background color defined in `Calendar` `specialDates` aggregation
      *
      * @returns Value of property `color`
      */
    def getColor(): CSSColor = js.native
    
    /**
      * @since 1.81.0
      *
      * Gets current value of property {@link #getSecondaryType secondaryType}.
      *
      * Applies secondary `CalendarDayType` combined with the `CalendarDayType` type chosen. Allows `specialDates`
      * to be also a `NonWorkingDay`. The secondary day type can only be used for `NonWorkingDay` or `None` calendar
      * day types. In other cases it will not be visible.
      *
      * Default value is `None`.
      *
      * @returns Value of property `secondaryType`
      */
    def getSecondaryType(): CalendarDayType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarDayType * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getType type}.
      *
      * Type of the date range.
      *
      * Default value is `Type01`.
      *
      * @returns Value of property `type`
      */
    def getType(): CalendarDayType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarDayType * / any */ String) = js.native
    
    /**
      * @since 1.76.0
      *
      * Sets a new value for property {@link #getColor color}.
      *
      * Background color of the `Calendar` `specialDates` aggregation. If set, this color will override the default
      * background color defined in `Calendar` `specialDates` aggregation
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setColor(): this.type = js.native
    def setColor(/**
      * New value for property `color`
      */
    sColor: CSSColor): this.type = js.native
    
    /**
      * @since 1.81.0
      *
      * Sets a new value for property {@link #getSecondaryType secondaryType}.
      *
      * Applies secondary `CalendarDayType` combined with the `CalendarDayType` type chosen. Allows `specialDates`
      * to be also a `NonWorkingDay`. The secondary day type can only be used for `NonWorkingDay` or `None` calendar
      * day types. In other cases it will not be visible.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `None`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSecondaryType(): this.type = js.native
    def setSecondaryType(
      /**
      * New value for property `secondaryType`
      */
    sSecondaryType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarDayType * / any */ String
    ): this.type = js.native
    def setSecondaryType(/**
      * New value for property `secondaryType`
      */
    sSecondaryType: CalendarDayType): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getType type}.
      *
      * Type of the date range.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Type01`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setType(): this.type = js.native
    def setType(
      /**
      * New value for property `type`
      */
    sType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarDayType * / any */ String
    ): this.type = js.native
    def setType(/**
      * New value for property `type`
      */
    sType: CalendarDayType): this.type = js.native
  }
  
  trait DateTypeRangeSettings
    extends StObject
       with DateRangeSettings {
    
    /**
      * @since 1.76.0
      *
      * Background color of the `Calendar` `specialDates` aggregation. If set, this color will override the default
      * background color defined in `Calendar` `specialDates` aggregation
      */
    var color: js.UndefOr[
        CSSColor | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.81.0
      *
      * Applies secondary `CalendarDayType` combined with the `CalendarDayType` type chosen. Allows `specialDates`
      * to be also a `NonWorkingDay`. The secondary day type can only be used for `NonWorkingDay` or `None` calendar
      * day types. In other cases it will not be visible.
      */
    var secondaryType: js.UndefOr[
        CalendarDayType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarDayType * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Type of the date range.
      */
    var `type`: js.UndefOr[
        CalendarDayType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarDayType * / any */ String) | PropertyBindingInfo
      ] = js.undefined
  }
  object DateTypeRangeSettings {
    
    inline def apply(): DateTypeRangeSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateTypeRangeSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DateTypeRangeSettings] (val x: Self) extends AnyVal {
      
      inline def setColor(value: CSSColor | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setSecondaryType(
        value: CalendarDayType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarDayType * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "secondaryType", value.asInstanceOf[js.Any])
      
      inline def setSecondaryTypeUndefined: Self = StObject.set(x, "secondaryType", js.undefined)
      
      inline def setType(
        value: CalendarDayType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarDayType * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
