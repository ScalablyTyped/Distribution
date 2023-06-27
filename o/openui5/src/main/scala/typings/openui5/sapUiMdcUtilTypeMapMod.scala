package typings.openui5

import org.scalablytyped.runtime.Shortcut
import typings.openui5.sapUiMdcEnumsBaseTypeMod.BaseType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcUtilTypeMapMod extends Shortcut {
  
  @JSImport("sap/ui/mdc/util/TypeMap", JSImport.Default)
  @js.native
  val default: TypeMap = js.native
  
  /**
    * @since 1.114.0
    *
    * Configuration class for type-handling in MDC delegates. Allows mapping of model-types to `sap.ui.mdc.enums.BaseType`
    * and enables model-specific type configuration.
    *
    * **Note:** This utility is experimental and the API/behavior is not finalized and hence this should not
    * be used for productive usage.
    */
  @js.native
  trait TypeMap extends StObject {
    
    /**
      * Exports the TypeMap's current data
      *
      * @returns Array created from this TypeMap's internal map
      */
    def `export`(): js.Array[Any] = js.native
    
    /**
      *
      * @returns converted value
      */
    def externalizeValue(
      /**
      * typed value
      */
    vValue: js.Object,
      /**
      * Data type considered for conversion
      */
    vType: String
    ): String = js.native
    def externalizeValue(
      /**
      * typed value
      */
    vValue: js.Object,
      /**
      * Data type considered for conversion
      */
    vType: String,
      /**
      * formatoptions for the dataType
      */
    oFormatOptions: js.Object
    ): String = js.native
    def externalizeValue(
      /**
      * typed value
      */
    vValue: js.Object,
      /**
      * Data type considered for conversion
      */
    vType: String,
      /**
      * formatoptions for the dataType
      */
    oFormatOptions: js.Object,
      /**
      * constraints for the dataType
      */
    oConstraints: js.Object
    ): String = js.native
    def externalizeValue(
      /**
      * typed value
      */
    vValue: js.Object,
      /**
      * Data type considered for conversion
      */
    vType: String,
      /**
      * formatoptions for the dataType
      */
    oFormatOptions: Unit,
      /**
      * constraints for the dataType
      */
    oConstraints: js.Object
    ): String = js.native
    def externalizeValue(
      /**
      * typed value
      */
    vValue: js.Object,
      /**
      * Data type considered for conversion
      */
    vType: typings.openui5.sapUiModelSimpleTypeMod.default
    ): String = js.native
    def externalizeValue(
      /**
      * typed value
      */
    vValue: js.Object,
      /**
      * Data type considered for conversion
      */
    vType: typings.openui5.sapUiModelSimpleTypeMod.default,
      /**
      * formatoptions for the dataType
      */
    oFormatOptions: js.Object
    ): String = js.native
    def externalizeValue(
      /**
      * typed value
      */
    vValue: js.Object,
      /**
      * Data type considered for conversion
      */
    vType: typings.openui5.sapUiModelSimpleTypeMod.default,
      /**
      * formatoptions for the dataType
      */
    oFormatOptions: js.Object,
      /**
      * constraints for the dataType
      */
    oConstraints: js.Object
    ): String = js.native
    def externalizeValue(
      /**
      * typed value
      */
    vValue: js.Object,
      /**
      * Data type considered for conversion
      */
    vType: typings.openui5.sapUiModelSimpleTypeMod.default,
      /**
      * formatoptions for the dataType
      */
    oFormatOptions: Unit,
      /**
      * constraints for the dataType
      */
    oConstraints: js.Object
    ): String = js.native
    
    /**
      * Prevents further manipulation of a TypeMap's data
      */
    def freeze(): Unit = js.native
    
    /**
      *
      * @returns output `Date`, `DateTime` or `Time`...
      */
    def getBaseType(
      /**
      * Given type string or sap.ui.model.SimpleType
      */
    sType: String,
      /**
      * Used `FormatOptions`
      */
    oFormatOptions: js.Object,
      /**
      * Used `Constraints`
      */
    oConstraints: js.Object
    ): BaseType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BaseType * / any */ String) = js.native
    
    /**
      *
      * @returns output `Date`, `DateTime` or `Time`...
      */
    def getBaseTypeForType(
      /**
      * Given type string or sap.ui.model.SimpleType
      */
    oType: typings.openui5.sapUiModelSimpleTypeMod.default
    ): String = js.native
    
    /**
      *
      * @returns creates returns a dataType class
      */
    def getDataTypeClass(/**
      * Class path as string where each name is separated by '.'
      */
    sDataType: String): typings.openui5.sapUiModelSimpleTypeMod.default = js.native
    
    /**
      *
      * @returns Data type name
      */
    def getDataTypeClassName(/**
      * Given model specific type
      */
    sType: String): String = js.native
    
    /**
      *
      * @returns creates returns an instance of the resolved dataType
      */
    def getDataTypeInstance(/**
      * Class path as string where each name is separated by '.'
      */
    sDataType: String): typings.openui5.sapUiModelSimpleTypeMod.default = js.native
    def getDataTypeInstance(
      /**
      * Class path as string where each name is separated by '.'
      */
    sDataType: String,
      /**
      * formatoptions for the dataType
      */
    oFormatOptions: js.Object
    ): typings.openui5.sapUiModelSimpleTypeMod.default = js.native
    def getDataTypeInstance(
      /**
      * Class path as string where each name is separated by '.'
      */
    sDataType: String,
      /**
      * formatoptions for the dataType
      */
    oFormatOptions: js.Object,
      /**
      * constraints for the dataType
      */
    oConstraints: js.Object
    ): typings.openui5.sapUiModelSimpleTypeMod.default = js.native
    def getDataTypeInstance(
      /**
      * Class path as string where each name is separated by '.'
      */
    sDataType: String,
      /**
      * formatoptions for the dataType
      */
    oFormatOptions: js.Object,
      /**
      * constraints for the dataType
      */
    oConstraints: js.Object,
      /**
      * Additional options for overrides
      */
    oOptions: js.Object
    ): typings.openui5.sapUiModelSimpleTypeMod.default = js.native
    def getDataTypeInstance(
      /**
      * Class path as string where each name is separated by '.'
      */
    sDataType: String,
      /**
      * formatoptions for the dataType
      */
    oFormatOptions: js.Object,
      /**
      * constraints for the dataType
      */
    oConstraints: Unit,
      /**
      * Additional options for overrides
      */
    oOptions: js.Object
    ): typings.openui5.sapUiModelSimpleTypeMod.default = js.native
    def getDataTypeInstance(
      /**
      * Class path as string where each name is separated by '.'
      */
    sDataType: String,
      /**
      * formatoptions for the dataType
      */
    oFormatOptions: Unit,
      /**
      * constraints for the dataType
      */
    oConstraints: js.Object
    ): typings.openui5.sapUiModelSimpleTypeMod.default = js.native
    def getDataTypeInstance(
      /**
      * Class path as string where each name is separated by '.'
      */
    sDataType: String,
      /**
      * formatoptions for the dataType
      */
    oFormatOptions: Unit,
      /**
      * constraints for the dataType
      */
    oConstraints: js.Object,
      /**
      * Additional options for overrides
      */
    oOptions: js.Object
    ): typings.openui5.sapUiModelSimpleTypeMod.default = js.native
    def getDataTypeInstance(
      /**
      * Class path as string where each name is separated by '.'
      */
    sDataType: String,
      /**
      * formatoptions for the dataType
      */
    oFormatOptions: Unit,
      /**
      * constraints for the dataType
      */
    oConstraints: Unit,
      /**
      * Additional options for overrides
      */
    oOptions: js.Object
    ): typings.openui5.sapUiModelSimpleTypeMod.default = js.native
    
    /**
      *
      * @returns output returns typeConfig object
      */
    def getTypeConfig(/**
      * Given dataType as string or type
      */
    vType: String): Any = js.native
    def getTypeConfig(
      /**
      * Given dataType as string or type
      */
    vType: String,
      /**
      * formatoptions for the given dataType
      */
    oFormatOptions: js.Object
    ): Any = js.native
    def getTypeConfig(
      /**
      * Given dataType as string or type
      */
    vType: String,
      /**
      * formatoptions for the given dataType
      */
    oFormatOptions: js.Object,
      /**
      * constraints for the given dataType
      */
    oConstraints: js.Object
    ): Any = js.native
    def getTypeConfig(
      /**
      * Given dataType as string or type
      */
    vType: String,
      /**
      * formatoptions for the given dataType
      */
    oFormatOptions: Unit,
      /**
      * constraints for the given dataType
      */
    oConstraints: js.Object
    ): Any = js.native
    def getTypeConfig(
      /**
      * Given dataType as string or type
      */
    vType: typings.openui5.sapUiModelSimpleTypeMod.default
    ): Any = js.native
    def getTypeConfig(
      /**
      * Given dataType as string or type
      */
    vType: typings.openui5.sapUiModelSimpleTypeMod.default,
      /**
      * formatoptions for the given dataType
      */
    oFormatOptions: js.Object
    ): Any = js.native
    def getTypeConfig(
      /**
      * Given dataType as string or type
      */
    vType: typings.openui5.sapUiModelSimpleTypeMod.default,
      /**
      * formatoptions for the given dataType
      */
    oFormatOptions: js.Object,
      /**
      * constraints for the given dataType
      */
    oConstraints: js.Object
    ): Any = js.native
    def getTypeConfig(
      /**
      * Given dataType as string or type
      */
    vType: typings.openui5.sapUiModelSimpleTypeMod.default,
      /**
      * formatoptions for the given dataType
      */
    oFormatOptions: Unit,
      /**
      * constraints for the given dataType
      */
    oConstraints: js.Object
    ): Any = js.native
    
    /**
      * Imports a TypeMap's data into another TypeMap
      */
    def `import`(/**
      * TypeMap to import
      */
    oTypeMap: /* was: sap.ui.mdc.util.TypeMap */ Any): Unit = js.native
    
    /**
      *
      * @returns converted value
      */
    def internalizeValue(
      /**
      * externalized value
      */
    vValue: String,
      /**
      * Data type considered for conversion
      */
    vType: String
    ): js.Object = js.native
    def internalizeValue(
      /**
      * externalized value
      */
    vValue: String,
      /**
      * Data type considered for conversion
      */
    vType: String,
      /**
      * formatoptions for the dataType
      */
    oFormatOptions: js.Object
    ): js.Object = js.native
    def internalizeValue(
      /**
      * externalized value
      */
    vValue: String,
      /**
      * Data type considered for conversion
      */
    vType: String,
      /**
      * formatoptions for the dataType
      */
    oFormatOptions: js.Object,
      /**
      * constraints for the dataType
      */
    oConstraints: js.Object
    ): js.Object = js.native
    def internalizeValue(
      /**
      * externalized value
      */
    vValue: String,
      /**
      * Data type considered for conversion
      */
    vType: String,
      /**
      * formatoptions for the dataType
      */
    oFormatOptions: Unit,
      /**
      * constraints for the dataType
      */
    oConstraints: js.Object
    ): js.Object = js.native
    def internalizeValue(
      /**
      * externalized value
      */
    vValue: String,
      /**
      * Data type considered for conversion
      */
    vType: typings.openui5.sapUiModelSimpleTypeMod.default
    ): js.Object = js.native
    def internalizeValue(
      /**
      * externalized value
      */
    vValue: String,
      /**
      * Data type considered for conversion
      */
    vType: typings.openui5.sapUiModelSimpleTypeMod.default,
      /**
      * formatoptions for the dataType
      */
    oFormatOptions: js.Object
    ): js.Object = js.native
    def internalizeValue(
      /**
      * externalized value
      */
    vValue: String,
      /**
      * Data type considered for conversion
      */
    vType: typings.openui5.sapUiModelSimpleTypeMod.default,
      /**
      * formatoptions for the dataType
      */
    oFormatOptions: js.Object,
      /**
      * constraints for the dataType
      */
    oConstraints: js.Object
    ): js.Object = js.native
    def internalizeValue(
      /**
      * externalized value
      */
    vValue: String,
      /**
      * Data type considered for conversion
      */
    vType: typings.openui5.sapUiModelSimpleTypeMod.default,
      /**
      * formatoptions for the dataType
      */
    oFormatOptions: Unit,
      /**
      * constraints for the dataType
      */
    oConstraints: js.Object
    ): js.Object = js.native
    
    def set(
      /**
      * Objectpath string for sap.ui.model.SimpleType
      */
    sType: String,
      /**
      * BaseType fitting the given sType or method returning a BaseType based on type configuration
      */
    vBaseType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BaseType * / any */ String
    ): Unit = js.native
    def set(
      /**
      * Objectpath string for sap.ui.model.SimpleType
      */
    sType: String,
      /**
      * BaseType fitting the given sType or method returning a BaseType based on type configuration
      */
    vBaseType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BaseType * / any */ String,
      /**
      * Optional customizing method for formatoptions and constraints. See `sap.ui.mdc.DefaultTypeMap` for examples.
      */
    fnOptions: js.Function
    ): Unit = js.native
    def set(
      /**
      * Objectpath string for sap.ui.model.SimpleType
      */
    sType: String,
      /**
      * BaseType fitting the given sType or method returning a BaseType based on type configuration
      */
    vBaseType: js.Function
    ): Unit = js.native
    def set(
      /**
      * Objectpath string for sap.ui.model.SimpleType
      */
    sType: String,
      /**
      * BaseType fitting the given sType or method returning a BaseType based on type configuration
      */
    vBaseType: js.Function,
      /**
      * Optional customizing method for formatoptions and constraints. See `sap.ui.mdc.DefaultTypeMap` for examples.
      */
    fnOptions: js.Function
    ): Unit = js.native
    /**
      * Sets a BaseType and an optional model- or scenario-specific configuration method for a given sap.ui.model.SimpleType
      * ObjectPath string
      *
      * As default `string` is returned.
      */
    def set(
      /**
      * Objectpath string for sap.ui.model.SimpleType
      */
    sType: String,
      /**
      * BaseType fitting the given sType or method returning a BaseType based on type configuration
      */
    vBaseType: BaseType
    ): Unit = js.native
    def set(
      /**
      * Objectpath string for sap.ui.model.SimpleType
      */
    sType: String,
      /**
      * BaseType fitting the given sType or method returning a BaseType based on type configuration
      */
    vBaseType: BaseType,
      /**
      * Optional customizing method for formatoptions and constraints. See `sap.ui.mdc.DefaultTypeMap` for examples.
      */
    fnOptions: js.Function
    ): Unit = js.native
    
    /**
      * Allows alternative identifiers for Types, such as "Boolean" for "sap.ui.model.type.Boolean"
      */
    def setAlias(
      /**
      * Objectpath string for sap.ui.model.SimpleType
      */
    sType: String,
      /**
      * Alternative identifier for sType
      */
    sAlias: String
    ): Unit = js.native
  }
  
  type _To = TypeMap
  
  /* This means you don't have to write `default`, but can instead just say `sapUiMdcUtilTypeMapMod.foo` */
  override def _to: TypeMap = default
}
