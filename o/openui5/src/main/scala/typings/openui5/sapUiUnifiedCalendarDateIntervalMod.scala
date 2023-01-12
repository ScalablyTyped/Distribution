package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiUnifiedCalendarMod.CalendarSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiUnifiedCalendarDateIntervalMod {
  
  @JSImport("sap/ui/unified/CalendarDateInterval", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `CalendarDateInterval`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends CalendarDateInterval {
    def this(/**
      * initial settings for the new control
      */
    mSettings: CalendarDateIntervalSettings) = this()
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
    mSettings: CalendarDateIntervalSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: CalendarDateIntervalSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/unified/CalendarDateInterval", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.unified.CalendarDateInterval with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.unified.Calendar.extend}.
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
    oClassInfo: ClassInfo[T, CalendarDateInterval]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, CalendarDateInterval],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.unified.CalendarDateInterval.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait CalendarDateInterval
    extends typings.openui5.sapUiUnifiedCalendarMod.default {
    
    /**
      * If more than this number of days are displayed, start and end month are displayed on the button.
      *
      * @returns The number of days to determine how the start and end of month are displayed
      */
    def _getDaysLarge(): int = js.native
    
    /**
      * Gets current value of property {@link #getDays days}.
      *
      * number of days displayed on phones the maximum rendered number of days is 8.
      *
      * Default value is `7`.
      *
      * @returns Value of property `days`
      */
    def getDays(): int = js.native
    
    /**
      * @SINCE 1.34.0
      *
      * Gets current value of property {@link #getPickerPopup pickerPopup}.
      *
      * If set, the month- and yearPicker opens on a popup
      *
      * Default value is `false`.
      *
      * @returns Value of property `pickerPopup`
      */
    def getPickerPopup(): Boolean = js.native
    
    /**
      * @SINCE 1.34.0
      *
      * Gets current value of property {@link #getShowDayNamesLine showDayNamesLine}.
      *
      * If set the day names are shown in a separate line. If not set the day names are shown inside the single
      * days.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showDayNamesLine`
      */
    def getShowDayNamesLine(): Boolean = js.native
    
    /**
      * Sets a new value for property {@link #getDays days}.
      *
      * number of days displayed on phones the maximum rendered number of days is 8.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `7`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDays(): this.type = js.native
    def setDays(/**
      * New value for property `days`
      */
    iDays: int): this.type = js.native
    
    /**
      * @SINCE 1.34.0
      *
      * Sets a new value for property {@link #getPickerPopup pickerPopup}.
      *
      * If set, the month- and yearPicker opens on a popup
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPickerPopup(): this.type = js.native
    def setPickerPopup(/**
      * New value for property `pickerPopup`
      */
    bPickerPopup: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.34.0
      *
      * Sets a new value for property {@link #getShowDayNamesLine showDayNamesLine}.
      *
      * If set the day names are shown in a separate line. If not set the day names are shown inside the single
      * days.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowDayNamesLine(): this.type = js.native
    def setShowDayNamesLine(/**
      * New value for property `showDayNamesLine`
      */
    bShowDayNamesLine: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getStartDate startDate}.
      *
      * Start date of the Interval
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setStartDate(/**
      * New value for property `startDate`
      */
    oStartDate: js.Object): this.type = js.native
  }
  
  trait CalendarDateIntervalSettings
    extends StObject
       with CalendarSettings {
    
    /**
      * number of days displayed on phones the maximum rendered number of days is 8.
      */
    var days: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.34.0
      *
      * If set, the month- and yearPicker opens on a popup
      */
    var pickerPopup: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.34.0
      *
      * If set the day names are shown in a separate line. If not set the day names are shown inside the single
      * days.
      */
    var showDayNamesLine: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Start date of the Interval
      */
    var startDate: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object CalendarDateIntervalSettings {
    
    inline def apply(): CalendarDateIntervalSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CalendarDateIntervalSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CalendarDateIntervalSettings] (val x: Self) extends AnyVal {
      
      inline def setDays(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
      
      inline def setDaysUndefined: Self = StObject.set(x, "days", js.undefined)
      
      inline def setPickerPopup(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "pickerPopup", value.asInstanceOf[js.Any])
      
      inline def setPickerPopupUndefined: Self = StObject.set(x, "pickerPopup", js.undefined)
      
      inline def setShowDayNamesLine(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showDayNamesLine", value.asInstanceOf[js.Any])
      
      inline def setShowDayNamesLineUndefined: Self = StObject.set(x, "showDayNamesLine", js.undefined)
      
      inline def setStartDate(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    }
  }
}
