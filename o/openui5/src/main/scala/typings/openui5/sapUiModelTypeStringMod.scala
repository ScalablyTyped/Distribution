package typings.openui5

import typings.openui5.anon.Contains
import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelTypeStringMod {
  
  @JSImport("sap/ui/model/type/String", JSImport.Default)
  @js.native
  /**
    * Constructor for a `String` type.
    */
  open class default () extends String1 {
    def this(/**
      * Format options; this type ignores them, since it does not support any format options
      */
    oFormatOptions: js.Object) = this()
    def this(
      /**
      * Format options; this type ignores them, since it does not support any format options
      */
    oFormatOptions: js.Object,
      /**
      * Constraints; {@link #validateValue} throws an error if any constraint is violated
      */
    oConstraints: Contains
    ) = this()
    def this(
      /**
      * Format options; this type ignores them, since it does not support any format options
      */
    oFormatOptions: Unit,
      /**
      * Constraints; {@link #validateValue} throws an error if any constraint is violated
      */
    oConstraints: Contains
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/model/type/String", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.model.type.String with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.model.SimpleType.extend}.
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
    oClassInfo: ClassInfo[T, String1]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, String1],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.model.type.String.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait String1
    extends typings.openui5.sapUiModelSimpleTypeMod.default {
    
    /**
      * Formats the given value to the given target type.
      *
      * @returns The formatted output value in the target type; `undefined` and `null` are always formatted to
      * `null`
      */
    def formatValue(
      /**
      * The value to be formatted
      */
    sValue: String,
      /**
      * The target type; may be "any", "boolean", "float", "int" or "string", or a type with "any", "boolean",
      * "float", "int" or "string" as its {@link sap.ui.base.DataType#getPrimitiveType primitive type}
      */
    sTargetType: String
    ): String | Double | Boolean | Null = js.native
    
    /**
      * Parses the given value, which is expected to be of the given type, to a string.
      *
      * @returns The parsed value
      */
    def parseValue(
      /**
      * The value to be parsed
      */
    vValue: String,
      /**
      * The source type (the expected type of `vValue`); may be "boolean", "float", "int" or "string", or a type
      * with "boolean", "float", "int" or "string" as its {@link sap.ui.base.DataType#getPrimitiveType primitive
      * type}
      */
    sSourceType: String
    ): String = js.native
    def parseValue(
      /**
      * The value to be parsed
      */
    vValue: Boolean,
      /**
      * The source type (the expected type of `vValue`); may be "boolean", "float", "int" or "string", or a type
      * with "boolean", "float", "int" or "string" as its {@link sap.ui.base.DataType#getPrimitiveType primitive
      * type}
      */
    sSourceType: String
    ): String = js.native
    def parseValue(
      /**
      * The value to be parsed
      */
    vValue: Double,
      /**
      * The source type (the expected type of `vValue`); may be "boolean", "float", "int" or "string", or a type
      * with "boolean", "float", "int" or "string" as its {@link sap.ui.base.DataType#getPrimitiveType primitive
      * type}
      */
    sSourceType: String
    ): String = js.native
    
    /**
      * Validates whether the given value in model representation is valid and meets the defined constraints,
      * see {@link #constructor}.
      */
    def validateValue(/**
      * The value to be validated; `null` is treated like an empty string
      */
    sValue: String): Unit = js.native
  }
}
