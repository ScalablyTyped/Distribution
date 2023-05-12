package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMDynamicDateOptionMod.DynamicDateOptionSettings
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreDateCalendarWeekNumberingMod.CalendarWeekNumbering
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMStandardDynamicDateOptionMod {
  
  @JSImport("sap/m/StandardDynamicDateOption", JSImport.Default)
  @js.native
  /**
    * Constructor for a new StandardDynamicDateOption.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends StandardDynamicDateOption {
    def this(/**
      * initial settings for the new control
      */
    mSettings: StandardDynamicDateOptionSettings) = this()
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
    mSettings: StandardDynamicDateOptionSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: StandardDynamicDateOptionSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/StandardDynamicDateOption", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.StandardDynamicDateOption with name `sClassName` and enriches it
      * with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.m.DynamicDateOption.extend}.
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
    oClassInfo: ClassInfo[T, StandardDynamicDateOption]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, StandardDynamicDateOption],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.StandardDynamicDateOption.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait StandardDynamicDateOption
    extends typings.openui5.sapMDynamicDateOptionMod.default {
    
    /**
      * @SINCE 1.111.0
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
      * @SINCE 1.111.0
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
  }
  
  trait StandardDynamicDateOptionSettings
    extends StObject
       with DynamicDateOptionSettings {
    
    /**
      * @SINCE 1.111.0
      *
      * If set, the calendar week numbering is used for display. If not set, the calendar week numbering of the
      * global configuration is used.
      */
    var calendarWeekNumbering: js.UndefOr[
        CalendarWeekNumbering | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarWeekNumbering * / any */ String) | PropertyBindingInfo
      ] = js.undefined
  }
  object StandardDynamicDateOptionSettings {
    
    inline def apply(): StandardDynamicDateOptionSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StandardDynamicDateOptionSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StandardDynamicDateOptionSettings] (val x: Self) extends AnyVal {
      
      inline def setCalendarWeekNumbering(
        value: CalendarWeekNumbering | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarWeekNumbering * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "calendarWeekNumbering", value.asInstanceOf[js.Any])
      
      inline def setCalendarWeekNumberingUndefined: Self = StObject.set(x, "calendarWeekNumbering", js.undefined)
    }
  }
}
