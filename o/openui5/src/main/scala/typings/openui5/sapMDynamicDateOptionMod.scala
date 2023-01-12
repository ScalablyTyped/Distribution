package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMDynamicDateOptionMod {
  
  @JSImport("sap/m/DynamicDateOption", JSImport.Default)
  @js.native
  /**
    * Constructor for a new DynamicDateOption.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends DynamicDateOption {
    def this(/**
      * initial settings for the new control
      */
    mSettings: DynamicDateOptionSettings) = this()
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
    mSettings: DynamicDateOptionSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: DynamicDateOptionSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/DynamicDateOption", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.DynamicDateOption with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, DynamicDateOption]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, DynamicDateOption],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.DynamicDateOption.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait DynamicDateOption
    extends typings.openui5.sapUiCoreElementMod.default {
    
    /**
      * Creates the option's value help UI. Mainly used for custom scenarios where getValueHelpUITypes is not
      * enough to define the UI.
      *
      * @returns An array with the option's value help UI controls
      */
    def createValueHelpUI(
      /**
      * The control instance
      */
    oControl: typings.openui5.sapMDynamicDateRangeMod.default,
      /**
      * A callback invoked when any of the created controls updates its value
      */
    fnControlsUpdated: js.Function
    ): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Controls whether the formatted date range should be concatenated to the formatted value when displayed.
      *
      * @returns True if the formatted value should be enhanced
      */
    def enhanceFormattedValue(): Boolean = js.native
    
    /**
      * Formats the option's value to a string.
      *
      * @returns A string representing this option's value
      */
    def format(/**
      * A DynamicDateRange value
      */
    oValue: js.Object): String = js.native
    
    /**
      * Provides the order index of the option's group. Used for grouping within the options list inside a DynamicDateRange's
      * popup. Standard options are arranged in 6 groups - from 1 to 6.
      *
      * @returns A group index
      */
    def getGroup(): int = js.native
    
    /**
      * Provides the option's group header text.
      *
      * @returns A group header
      */
    def getGroupHeader(): String = js.native
    
    /**
      * Gets current value of property {@link #getKey key}.
      *
      * A key which identifies the option. The option produces DynamicDateRange values with operator same as
      * the option key.
      *
      * @returns Value of property `key`
      */
    def getKey(): String = js.native
    
    /**
      * Defines the option's label for the DynamicDateRange's list of options.
      *
      * @returns The option's label
      */
    def getText(
      /**
      * The control instance which the label may depend on
      */
    oControl: typings.openui5.sapMDynamicDateRangeMod.default
    ): String = js.native
    
    /**
      * Gets the value help controls' output values and converts them to a DynamicDateRange value.
      *
      * @returns A DynamicDateRange value
      */
    def getValueHelpOutput(/**
      * The control instance
      */
    oControl: typings.openui5.sapMDynamicDateRangeMod.default): js.Object = js.native
    
    /**
      * Defines the UI types of the option. They are used to create predefined UI for the DynamicDateRange's
      * value help dialog corresponding to this option. The types are DynamicDateValueHelpUIType instances. Their
      * possible values are "date", "daterange", "month", "int". The created UI consists of Calendar or Input
      * controls.
      *
      * @returns An array with the option's UI types
      */
    def getValueHelpUITypes(/**
      * The control instance
      */
    oControl: typings.openui5.sapMDynamicDateRangeMod.default): js.Array[typings.openui5.sapMDynamicDateValueHelpUITypeMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getValueTypes valueTypes}.
      *
      * Defines the types of the option's parameters. Possible values for the array items are "date" and "int".
      * A date range is usually represented with two consecutive "date" values.
      *
      * @returns Value of property `valueTypes`
      */
    def getValueTypes(): js.Array[String] = js.native
    
    /**
      * Parses a string to a DynamicDateRange value.
      *
      * @returns This option's DynamicDateRange value
      */
    def parse(/**
      * An input string
      */
    sValue: String): js.Object = js.native
    
    /**
      * Sets a new value for property {@link #getKey key}.
      *
      * A key which identifies the option. The option produces DynamicDateRange values with operator same as
      * the option key.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setKey(/**
      * New value for property `key`
      */
    sKey: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getValueTypes valueTypes}.
      *
      * Defines the types of the option's parameters. Possible values for the array items are "date" and "int".
      * A date range is usually represented with two consecutive "date" values.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setValueTypes(/**
      * New value for property `valueTypes`
      */
    sValueTypes: js.Array[String]): this.type = js.native
    
    /**
      * Calculates an absolute date range from the options relative value.
      *
      * @returns A couple of dates marking the start and the end of the range
      */
    def toDates(/**
      * A DynamicDateRange value
      */
    oValue: js.Object): js.Array[/* was: sap.ui.core.date.UniversalDate */ Any] = js.native
    
    /**
      * Validates all input controls in the value help UI related to the current option. If one of the input
      * controls contains invalid value, then validation will return `false`. If all input controls contain valid
      * value, then the validation will return `true`.
      *
      * @returns value help UI validity indicator
      */
    def validateValueHelpUI(/**
      * The control instance
      */
    oControl: typings.openui5.sapMDynamicDateRangeMod.default): Boolean = js.native
  }
  
  trait DynamicDateOptionSettings
    extends StObject
       with ElementSettings {
    
    /**
      * A key which identifies the option. The option produces DynamicDateRange values with operator same as
      * the option key.
      */
    var key: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the types of the option's parameters. Possible values for the array items are "date" and "int".
      * A date range is usually represented with two consecutive "date" values.
      */
    var valueTypes: js.UndefOr[
        js.Array[String] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object DynamicDateOptionSettings {
    
    inline def apply(): DynamicDateOptionSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DynamicDateOptionSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DynamicDateOptionSettings] (val x: Self) extends AnyVal {
      
      inline def setKey(value: String | PropertyBindingInfo): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setValueTypes(
        value: js.Array[String] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "valueTypes", value.asInstanceOf[js.Any])
      
      inline def setValueTypesUndefined: Self = StObject.set(x, "valueTypes", js.undefined)
      
      inline def setValueTypesVarargs(value: String*): Self = StObject.set(x, "valueTypes", js.Array(value*))
    }
  }
}
