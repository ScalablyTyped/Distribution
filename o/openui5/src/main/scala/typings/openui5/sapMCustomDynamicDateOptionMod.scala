package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMDynamicDateOptionMod.DynamicDateOptionSettings
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMCustomDynamicDateOptionMod {
  
  @JSImport("sap/m/CustomDynamicDateOption", JSImport.Default)
  @js.native
  /**
    * Constructor for a new CustomDynamicDateOption.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends CustomDynamicDateOption {
    def this(/**
      * initial settings for the new control
      */
    mSettings: CustomDynamicDateOptionSettings) = this()
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
    mSettings: CustomDynamicDateOptionSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: CustomDynamicDateOptionSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/CustomDynamicDateOption", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.CustomDynamicDateOption with name `sClassName` and enriches it
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
    oClassInfo: ClassInfo[T, CustomDynamicDateOption]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, CustomDynamicDateOption],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.CustomDynamicDateOption.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait CustomDynamicDateOption
    extends typings.openui5.sapMDynamicDateOptionMod.default {
    
    /**
      * Gets current value of property {@link #getCreateValueHelpUI createValueHelpUI}.
      *
      * Defines a method that can create the option's value help UI. For custom scenarios where getValueHelpUITypes
      * is not enough to define the UI.
      *
      * @returns Value of property `createValueHelpUI`
      */
    def getCreateValueHelpUI(): js.Function = js.native
    
    /**
      * Gets current value of property {@link #getEnhanceFormattedValue enhanceFormattedValue}.
      *
      * Defines a method that controls whether the formatted date range should be concatenated to the formatted
      * value when displayed.
      *
      * @returns Value of property `enhanceFormattedValue`
      */
    def getEnhanceFormattedValue(): js.Function = js.native
    
    /**
      * Gets current value of property {@link #getFormat format}.
      *
      * Defines a method that formats the option's value to a string. See DynamicDateOption.format.
      *
      * @returns Value of property `format`
      */
    def getFormat(): js.Function = js.native
    
    /**
      * Gets current value of property {@link #getGetGroup getGroup}.
      *
      * Defines a method that provides the order index of the option's group. Used for grouping within the options
      * list inside a DynamicDateRange's popup.
      *
      * @returns Value of property `getGroup`
      */
    def getGetGroup(): js.Function = js.native
    
    /**
      * Gets current value of property {@link #getGetGroupHeader getGroupHeader}.
      *
      * Defines a method that provides the option's group header text.
      *
      * @returns Value of property `getGroupHeader`
      */
    def getGetGroupHeader(): js.Function = js.native
    
    /**
      * Gets current value of property {@link #getGetText getText}.
      *
      * Defines a method that provides the option's label text.
      *
      * @returns Value of property `getText`
      */
    def getGetText(): js.Function = js.native
    
    /**
      * Gets current value of property {@link #getGetValueHelpOutput getValueHelpOutput}.
      *
      * Defines a method that can collect the value from the value help UI.
      *
      * @returns Value of property `getValueHelpOutput`
      */
    def getGetValueHelpOutput(): js.Function = js.native
    
    /**
      * Gets current value of property {@link #getGetValueHelpUITypes getValueHelpUITypes}.
      *
      * Defines a method that provides the option's value help UI types. Based on the types a functional value
      * help dialog will be created. Types are DynamicDateValueHelpUIType instances.
      *
      * @returns Value of property `getValueHelpUITypes`
      */
    def getGetValueHelpUITypes(): js.Function = js.native
    
    /**
      * Gets current value of property {@link #getParse parse}.
      *
      * Defines a method that parses the option's value from a string. See DynamicDateOption.parse.
      *
      * @returns Value of property `parse`
      */
    def getParse(): js.Function = js.native
    
    /**
      * Gets current value of property {@link #getToDates toDates}.
      *
      * Defines a method that calculates an absolute date range from the options relative value. See DynamicDateOption.toDates.
      *
      * @returns Value of property `toDates`
      */
    def getToDates(): js.Function = js.native
    
    /**
      * Gets current value of property {@link #getValidateValueHelpUI validateValueHelpUI}.
      *
      * Defines a method that can validate all controls from the value help UI related to a given option.
      *
      * @returns Value of property `validateValueHelpUI`
      */
    def getValidateValueHelpUI(): js.Function = js.native
    
    /**
      * Sets a new value for property {@link #getCreateValueHelpUI createValueHelpUI}.
      *
      * Defines a method that can create the option's value help UI. For custom scenarios where getValueHelpUITypes
      * is not enough to define the UI.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCreateValueHelpUI(/**
      * New value for property `createValueHelpUI`
      */
    fnCreateValueHelpUI: js.Function): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getEnhanceFormattedValue enhanceFormattedValue}.
      *
      * Defines a method that controls whether the formatted date range should be concatenated to the formatted
      * value when displayed.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnhanceFormattedValue(/**
      * New value for property `enhanceFormattedValue`
      */
    fnEnhanceFormattedValue: js.Function): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getFormat format}.
      *
      * Defines a method that formats the option's value to a string. See DynamicDateOption.format.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFormat(/**
      * New value for property `format`
      */
    fnFormat: js.Function): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getGetGroup getGroup}.
      *
      * Defines a method that provides the order index of the option's group. Used for grouping within the options
      * list inside a DynamicDateRange's popup.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setGetGroup(/**
      * New value for property `getGroup`
      */
    fnGetGroup: js.Function): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getGetGroupHeader getGroupHeader}.
      *
      * Defines a method that provides the option's group header text.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setGetGroupHeader(/**
      * New value for property `getGroupHeader`
      */
    fnGetGroupHeader: js.Function): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getGetText getText}.
      *
      * Defines a method that provides the option's label text.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setGetText(/**
      * New value for property `getText`
      */
    fnGetText: js.Function): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getGetValueHelpOutput getValueHelpOutput}.
      *
      * Defines a method that can collect the value from the value help UI.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setGetValueHelpOutput(/**
      * New value for property `getValueHelpOutput`
      */
    fnGetValueHelpOutput: js.Function): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getGetValueHelpUITypes getValueHelpUITypes}.
      *
      * Defines a method that provides the option's value help UI types. Based on the types a functional value
      * help dialog will be created. Types are DynamicDateValueHelpUIType instances.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setGetValueHelpUITypes(/**
      * New value for property `getValueHelpUITypes`
      */
    fnGetValueHelpUITypes: js.Function): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getParse parse}.
      *
      * Defines a method that parses the option's value from a string. See DynamicDateOption.parse.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setParse(/**
      * New value for property `parse`
      */
    fnParse: js.Function): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getToDates toDates}.
      *
      * Defines a method that calculates an absolute date range from the options relative value. See DynamicDateOption.toDates.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setToDates(/**
      * New value for property `toDates`
      */
    fnToDates: js.Function): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getValidateValueHelpUI validateValueHelpUI}.
      *
      * Defines a method that can validate all controls from the value help UI related to a given option.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setValidateValueHelpUI(/**
      * New value for property `validateValueHelpUI`
      */
    fnValidateValueHelpUI: js.Function): this.type = js.native
  }
  
  trait CustomDynamicDateOptionSettings
    extends StObject
       with DynamicDateOptionSettings {
    
    /**
      * Defines a method that can create the option's value help UI. For custom scenarios where getValueHelpUITypes
      * is not enough to define the UI.
      */
    var createValueHelpUI: js.UndefOr[
        js.Function | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines a method that controls whether the formatted date range should be concatenated to the formatted
      * value when displayed.
      */
    var enhanceFormattedValue: js.UndefOr[
        js.Function | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines a method that formats the option's value to a string. See DynamicDateOption.format.
      */
    var format: js.UndefOr[
        js.Function | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines a method that provides the order index of the option's group. Used for grouping within the options
      * list inside a DynamicDateRange's popup.
      */
    var getGroup: js.UndefOr[
        js.Function | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines a method that provides the option's group header text.
      */
    var getGroupHeader: js.UndefOr[
        js.Function | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines a method that provides the option's label text.
      */
    var getText: js.UndefOr[
        js.Function | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines a method that can collect the value from the value help UI.
      */
    var getValueHelpOutput: js.UndefOr[
        js.Function | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines a method that provides the option's value help UI types. Based on the types a functional value
      * help dialog will be created. Types are DynamicDateValueHelpUIType instances.
      */
    var getValueHelpUITypes: js.UndefOr[
        js.Function | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines a method that parses the option's value from a string. See DynamicDateOption.parse.
      */
    var parse: js.UndefOr[
        js.Function | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines a method that calculates an absolute date range from the options relative value. See DynamicDateOption.toDates.
      */
    var toDates: js.UndefOr[
        js.Function | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines a method that can validate all controls from the value help UI related to a given option.
      */
    var validateValueHelpUI: js.UndefOr[
        js.Function | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object CustomDynamicDateOptionSettings {
    
    inline def apply(): CustomDynamicDateOptionSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomDynamicDateOptionSettings]
    }
    
    extension [Self <: CustomDynamicDateOptionSettings](x: Self) {
      
      inline def setCreateValueHelpUI(value: js.Function | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "createValueHelpUI", value.asInstanceOf[js.Any])
      
      inline def setCreateValueHelpUIUndefined: Self = StObject.set(x, "createValueHelpUI", js.undefined)
      
      inline def setEnhanceFormattedValue(value: js.Function | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enhanceFormattedValue", value.asInstanceOf[js.Any])
      
      inline def setEnhanceFormattedValueUndefined: Self = StObject.set(x, "enhanceFormattedValue", js.undefined)
      
      inline def setFormat(value: js.Function | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setGetGroup(value: js.Function | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "getGroup", value.asInstanceOf[js.Any])
      
      inline def setGetGroupHeader(value: js.Function | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "getGroupHeader", value.asInstanceOf[js.Any])
      
      inline def setGetGroupHeaderUndefined: Self = StObject.set(x, "getGroupHeader", js.undefined)
      
      inline def setGetGroupUndefined: Self = StObject.set(x, "getGroup", js.undefined)
      
      inline def setGetText(value: js.Function | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "getText", value.asInstanceOf[js.Any])
      
      inline def setGetTextUndefined: Self = StObject.set(x, "getText", js.undefined)
      
      inline def setGetValueHelpOutput(value: js.Function | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "getValueHelpOutput", value.asInstanceOf[js.Any])
      
      inline def setGetValueHelpOutputUndefined: Self = StObject.set(x, "getValueHelpOutput", js.undefined)
      
      inline def setGetValueHelpUITypes(value: js.Function | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "getValueHelpUITypes", value.asInstanceOf[js.Any])
      
      inline def setGetValueHelpUITypesUndefined: Self = StObject.set(x, "getValueHelpUITypes", js.undefined)
      
      inline def setParse(value: js.Function | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
      
      inline def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
      
      inline def setToDates(value: js.Function | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "toDates", value.asInstanceOf[js.Any])
      
      inline def setToDatesUndefined: Self = StObject.set(x, "toDates", js.undefined)
      
      inline def setValidateValueHelpUI(value: js.Function | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "validateValueHelpUI", value.asInstanceOf[js.Any])
      
      inline def setValidateValueHelpUIUndefined: Self = StObject.set(x, "validateValueHelpUI", js.undefined)
    }
  }
}
