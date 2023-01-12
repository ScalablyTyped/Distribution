package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCommonsTextFieldMod.TextFieldSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCommonsDatePickerMod {
  
  @JSImport("sap/ui/commons/DatePicker", JSImport.Default)
  @js.native
  /**
    * Constructor for a new DatePicker.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends DatePicker {
    def this(/**
      * initial settings for the new control
      */
    mSettings: DatePickerSettings) = this()
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
    mSettings: DatePickerSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: DatePickerSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/commons/DatePicker", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.commons.DatePicker with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.commons.TextField.extend}.
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
    oClassInfo: ClassInfo[T, DatePicker]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, DatePicker],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.commons.DatePicker.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait DatePicker
    extends typings.openui5.sapUiCommonsTextFieldMod.default {
    
    def fireChange(
      /**
      * Parameters to pass along with the event - do not use: value is ignored
      */
    mParameters: js.Object
    ): this.type = js.native
    def fireChange(
      /**
      * Parameters to pass along with the event - do not use: value is ignored
      */
    mParameters: js.Object,
      /**
      * true if value is invalid
      */
    bInvalidValue: Boolean
    ): this.type = js.native
    def fireChange(
      /**
      * Parameters to pass along with the event - do not use: value is ignored
      */
    mParameters: Unit,
      /**
      * true if value is invalid
      */
    bInvalidValue: Boolean
    ): this.type = js.native
    
    /**
      * Gets current value of property {@link #getLocale locale}.
      *
      * Defines the locale (language and country), e.g. "en-US", whose translations and Date formatters should
      * be used to render the DatePicker.If the value property is bound to a model using a Date type the locale
      * will be ignored, because the locale information of the model are used.
      *
      * @returns Value of property `locale`
      */
    def getLocale(): String = js.native
    
    /**
      * Gets current value of property {@link #getYyyymmdd yyyymmdd}.
      *
      * Defines the date as a "yyyymmdd" string, independent from the format used. The inherited textField "value"
      * attribute uses the date format as configured via the locale. The date is interpreted as gregorian date
      *
      * @returns Value of property `yyyymmdd`
      */
    def getYyyymmdd(): String = js.native
    
    /**
      * Sets a new value for property {@link #getLocale locale}.
      *
      * Defines the locale (language and country), e.g. "en-US", whose translations and Date formatters should
      * be used to render the DatePicker.If the value property is bound to a model using a Date type the locale
      * will be ignored, because the locale information of the model are used.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLocale(): this.type = js.native
    def setLocale(/**
      * New value for property `locale`
      */
    sLocale: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getYyyymmdd yyyymmdd}.
      *
      * Defines the date as a "yyyymmdd" string, independent from the format used. The inherited textField "value"
      * attribute uses the date format as configured via the locale. The date is interpreted as gregorian date
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setYyyymmdd(): this.type = js.native
    def setYyyymmdd(/**
      * New value for property `yyyymmdd`
      */
    sYyyymmdd: String): this.type = js.native
  }
  
  trait DatePickerSettings
    extends StObject
       with TextFieldSettings {
    
    /**
      * Defines the locale (language and country), e.g. "en-US", whose translations and Date formatters should
      * be used to render the DatePicker.If the value property is bound to a model using a Date type the locale
      * will be ignored, because the locale information of the model are used.
      */
    var locale: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the date as a "yyyymmdd" string, independent from the format used. The inherited textField "value"
      * attribute uses the date format as configured via the locale. The date is interpreted as gregorian date
      */
    var yyyymmdd: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object DatePickerSettings {
    
    inline def apply(): DatePickerSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DatePickerSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DatePickerSettings] (val x: Self) extends AnyVal {
      
      inline def setLocale(value: String | PropertyBindingInfo): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setYyyymmdd(value: String | PropertyBindingInfo): Self = StObject.set(x, "yyyymmdd", value.asInstanceOf[js.Any])
      
      inline def setYyyymmddUndefined: Self = StObject.set(x, "yyyymmdd", js.undefined)
    }
  }
}
