package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMDatePickerMod.DatePickerSettings
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMDateRangeSelectionMod {
  
  @JSImport("sap/m/DateRangeSelection", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `DateRangeSelection`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends DateRangeSelection {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: DateRangeSelectionSettings) = this()
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
    mSettings: DateRangeSelectionSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: DateRangeSelectionSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/DateRangeSelection", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.DateRangeSelection with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, DateRangeSelection]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, DateRangeSelection],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.DateRangeSelection.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait DateRangeSelection
    extends typings.openui5.sapMDatePickerMod.default {
    
    /**
      * Gets current value of property {@link #getDelimiter delimiter}.
      *
      * Delimiter between start and end date. Default value is "-". If no delimiter is given, the one defined
      * for the used locale is used.
      *
      * Default value is `'-'`.
      *
      * @returns Value of property `delimiter`
      */
    def getDelimiter(): String = js.native
    
    /**
      * @deprecated (since 1.22.0) - replaced by `dateValue` property of the {@link sap.m.DateTimeField}
      *
      * Get the start date of the range.
      *
      * @returns the start date of the date range
      */
    def getFrom(): js.Date = js.native
    
    /**
      * Getter for property `secondDateValue`.
      *
      * The end date of the range as JavaScript Date object. This is independent from any formatter.
      *
      * **Note:** If this property is used, the `value` property should not be changed from the caller.
      *
      * @returns the value of property `secondDateValue`
      */
    def getSecondDateValue(): js.Date = js.native
    
    /**
      * @deprecated (since 1.22.0) - replaced by `secondDateValue` property
      *
      * Get the end date of the range.
      *
      * @returns the end date of the date range
      */
    def getTo(): js.Date = js.native
    
    /**
      * Sets a new value for property {@link #getDelimiter delimiter}.
      *
      * Delimiter between start and end date. Default value is "-". If no delimiter is given, the one defined
      * for the used locale is used.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `'-'`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDelimiter(): this.type = js.native
    def setDelimiter(/**
      * New value for property `delimiter`
      */
    sDelimiter: String): this.type = js.native
    
    /**
      * @deprecated (since 1.22.0) - replaced by `dateValue` property of the {@link sap.m.DateTimeField}
      *
      * Set the start date of the range.
      *
      * @returns Reference to `this` for method chaining
      */
    def setFrom(/**
      * A JavaScript Date
      */
    oFrom: js.Date): this.type = js.native
    
    /**
      * Setter for property `secondDateValue`.
      *
      * The start date of the range as JavaScript Date object. This is independent from any formatter.
      *
      * **Note:** If this property is used, the `value` property should not be changed from the caller.
      *
      * @returns Reference to `this` for method chaining
      */
    def setSecondDateValue(/**
      * New value for property `dateValue`
      */
    oSecondDateValue: js.Date): this.type = js.native
    
    /**
      * @deprecated (since 1.22.0) - replaced by `secondDateValue` property
      *
      * Set the end date of the range.
      *
      * @returns Reference to `this` for method chaining
      */
    def setTo(/**
      * A JavaScript Date
      */
    oTo: js.Date): this.type = js.native
  }
  
  trait DateRangeSelectionSettings
    extends StObject
       with DatePickerSettings {
    
    /**
      * Delimiter between start and end date. Default value is "-". If no delimiter is given, the one defined
      * for the used locale is used.
      */
    var delimiter: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @deprecated (since 1.22.0) - replaced by `dateValue` property of the {@link sap.m.DateTimeField}
      *
      * Start date of the range.
      */
    var from: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The end date of the range as JavaScript Date object. This is independent from any formatter.
      *
      * **Note:** If this property is used, the `value` property should not be changed from the caller.
      */
    var secondDateValue: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @deprecated (since 1.22.0) - replaced by `secondDateValue` property
      *
      * End date of the range.
      */
    var to: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object DateRangeSelectionSettings {
    
    inline def apply(): DateRangeSelectionSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateRangeSelectionSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DateRangeSelectionSettings] (val x: Self) extends AnyVal {
      
      inline def setDelimiter(value: String | PropertyBindingInfo): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      inline def setFrom(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setSecondDateValue(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "secondDateValue", value.asInstanceOf[js.Any])
      
      inline def setSecondDateValueUndefined: Self = StObject.set(x, "secondDateValue", js.undefined)
      
      inline def setTo(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
}
