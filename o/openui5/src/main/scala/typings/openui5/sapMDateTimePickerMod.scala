package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMDatePickerMod.DatePickerSettings
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMDateTimePickerMod {
  
  @JSImport("sap/m/DateTimePicker", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `DateTimePicker`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/datetime-picker/ Date/Time Picker}
    */
  open class default () extends DateTimePicker {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: DateTimePickerSettings) = this()
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
    mSettings: DateTimePickerSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: DateTimePickerSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/DateTimePicker", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.DateTimePicker with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.m.DatePicker.extend}.
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
    oClassInfo: ClassInfo[T, DateTimePicker]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, DateTimePicker],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.DateTimePicker.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait DateTimePicker
    extends typings.openui5.sapMDatePickerMod.default {
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Apply the correct icon to the used Date control
      */
    def getIconSrc(): Unit = js.native
    
    /**
      * @since 1.56
      *
      * Gets current value of property {@link #getMinutesStep minutesStep}.
      *
      * Sets the minutes step. If the step is less than 1, it will be automatically converted back to 1. The
      * minutes clock is populated only by multiples of the step.
      *
      * Default value is `1`.
      *
      * @returns Value of property `minutesStep`
      */
    def getMinutesStep(): int = js.native
    
    /**
      * @since 1.56
      *
      * Gets current value of property {@link #getSecondsStep secondsStep}.
      *
      * Sets the seconds step. If the step is less than 1, it will be automatically converted back to 1. The
      * seconds clock is populated only by multiples of the step.
      *
      * Default value is `1`.
      *
      * @returns Value of property `secondsStep`
      */
    def getSecondsStep(): int = js.native
    
    /**
      * @since 1.98
      *
      * Gets current value of property {@link #getShowCurrentTimeButton showCurrentTimeButton}.
      *
      * Determines whether there is a shortcut navigation to current time.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showCurrentTimeButton`
      */
    def getShowCurrentTimeButton(): Boolean = js.native
    
    /**
      * @since 1.99
      *
      * Gets current value of property {@link #getShowTimezone showTimezone}.
      *
      * Determines whether to show the timezone or not.
      *
      * @returns Value of property `showTimezone`
      */
    def getShowTimezone(): Boolean = js.native
    
    /**
      * @since 1.99
      *
      * Gets current value of property {@link #getTimezone timezone}.
      *
      * The IANA timezone ID, e.g `"Europe/Berlin"`. For display purposes only in combination with `showTimezone`
      * property. The `value` property is a string representation of a date and time and is not related to the
      * displayed time zone. The `dateValue` property should not be used as this could lead to unpredictable
      * results. Use `getValue()` instead.
      *
      * @returns Value of property `timezone`
      */
    def getTimezone(): String = js.native
    
    /**
      * @since 1.56
      *
      * Sets a new value for property {@link #getMinutesStep minutesStep}.
      *
      * Sets the minutes step. If the step is less than 1, it will be automatically converted back to 1. The
      * minutes clock is populated only by multiples of the step.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `1`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMinutesStep(): this.type = js.native
    def setMinutesStep(/**
      * New value for property `minutesStep`
      */
    iMinutesStep: int): this.type = js.native
    
    /**
      * @since 1.56
      *
      * Sets a new value for property {@link #getSecondsStep secondsStep}.
      *
      * Sets the seconds step. If the step is less than 1, it will be automatically converted back to 1. The
      * seconds clock is populated only by multiples of the step.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `1`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSecondsStep(): this.type = js.native
    def setSecondsStep(/**
      * New value for property `secondsStep`
      */
    iSecondsStep: int): this.type = js.native
    
    /**
      * @since 1.98
      *
      * Sets a new value for property {@link #getShowCurrentTimeButton showCurrentTimeButton}.
      *
      * Determines whether there is a shortcut navigation to current time.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowCurrentTimeButton(): this.type = js.native
    def setShowCurrentTimeButton(/**
      * New value for property `showCurrentTimeButton`
      */
    bShowCurrentTimeButton: Boolean): this.type = js.native
    
    /**
      * @since 1.99
      *
      * Sets a new value for property {@link #getShowTimezone showTimezone}.
      *
      * Determines whether to show the timezone or not.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowTimezone(/**
      * New value for property `showTimezone`
      */
    bShowTimezone: Boolean): this.type = js.native
    
    /**
      * @since 1.99
      *
      * Sets a new value for property {@link #getTimezone timezone}.
      *
      * The IANA timezone ID, e.g `"Europe/Berlin"`. For display purposes only in combination with `showTimezone`
      * property. The `value` property is a string representation of a date and time and is not related to the
      * displayed time zone. The `dateValue` property should not be used as this could lead to unpredictable
      * results. Use `getValue()` instead.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTimezone(/**
      * New value for property `timezone`
      */
    sTimezone: String): this.type = js.native
  }
  
  trait DateTimePickerSettings
    extends StObject
       with DatePickerSettings {
    
    /**
      * @since 1.56
      *
      * Sets the minutes step. If the step is less than 1, it will be automatically converted back to 1. The
      * minutes clock is populated only by multiples of the step.
      */
    var minutesStep: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @since 1.56
      *
      * Sets the seconds step. If the step is less than 1, it will be automatically converted back to 1. The
      * seconds clock is populated only by multiples of the step.
      */
    var secondsStep: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @since 1.98
      *
      * Determines whether there is a shortcut navigation to current time.
      */
    var showCurrentTimeButton: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.99
      *
      * Determines whether to show the timezone or not.
      */
    var showTimezone: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.99
      *
      * The IANA timezone ID, e.g `"Europe/Berlin"`. For display purposes only in combination with `showTimezone`
      * property. The `value` property is a string representation of a date and time and is not related to the
      * displayed time zone. The `dateValue` property should not be used as this could lead to unpredictable
      * results. Use `getValue()` instead.
      */
    var timezone: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object DateTimePickerSettings {
    
    inline def apply(): DateTimePickerSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateTimePickerSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DateTimePickerSettings] (val x: Self) extends AnyVal {
      
      inline def setMinutesStep(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "minutesStep", value.asInstanceOf[js.Any])
      
      inline def setMinutesStepUndefined: Self = StObject.set(x, "minutesStep", js.undefined)
      
      inline def setSecondsStep(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "secondsStep", value.asInstanceOf[js.Any])
      
      inline def setSecondsStepUndefined: Self = StObject.set(x, "secondsStep", js.undefined)
      
      inline def setShowCurrentTimeButton(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showCurrentTimeButton", value.asInstanceOf[js.Any])
      
      inline def setShowCurrentTimeButtonUndefined: Self = StObject.set(x, "showCurrentTimeButton", js.undefined)
      
      inline def setShowTimezone(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showTimezone", value.asInstanceOf[js.Any])
      
      inline def setShowTimezoneUndefined: Self = StObject.set(x, "showTimezone", js.undefined)
      
      inline def setTimezone(value: String | PropertyBindingInfo): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
      
      inline def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
    }
  }
}
