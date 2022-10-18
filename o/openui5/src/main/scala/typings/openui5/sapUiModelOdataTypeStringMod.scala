package typings.openui5

import typings.openui5.anon.IsDigitSequence
import typings.openui5.anon.ParseKeepsEmptyString
import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelOdataTypeStringMod {
  
  @JSImport("sap/ui/model/odata/type/String", JSImport.Default)
  @js.native
  /**
    * Constructor for an OData primitive type `Edm.String`.
    */
  open class default () extends String1 {
    def this(/**
      * format options as defined in the interface of {@link sap.ui.model.SimpleType}
      */
    oFormatOptions: ParseKeepsEmptyString) = this()
    def this(
      /**
      * format options as defined in the interface of {@link sap.ui.model.SimpleType}
      */
    oFormatOptions: Unit,
      /**
      * constraints; {@link #validateValue validateValue} throws an error if any constraint is violated
      */
    oConstraints: IsDigitSequence
    ) = this()
    def this(
      /**
      * format options as defined in the interface of {@link sap.ui.model.SimpleType}
      */
    oFormatOptions: ParseKeepsEmptyString,
      /**
      * constraints; {@link #validateValue validateValue} throws an error if any constraint is violated
      */
    oConstraints: IsDigitSequence
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/model/odata/type/String", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.model.odata.type.String with name `sClassName` and enriches it
      * with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.model.odata.type.ODataType.extend}.
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
      * Returns a metadata object for class sap.ui.model.odata.type.String.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait String1
    extends typings.openui5.sapUiModelOdataTypeOdatatypeMod.default {
    
    /**
      * Formats the given value to the given target type. If the `isDigitSequence` constraint of this type is
      * set to `true`, the target type is 'any' or 'string', and the given value contains only digits, the leading
      * zeros are truncated. If the `isDigitSequence` constraint of this type is set to `true` and the `maxLength`
      * constraint is set, this type behaves as an ABAP type NUMC; in this case, the value '0' is formatted to
      * '', provided the target type is 'string'.
      *
      * @returns the formatted output value in the target type; `undefined` is always formatted to `null`; `null`
      * is formatted to "" if the target type is "string".
      */
    def formatValue(
      /**
      * the value to be formatted
      */
    sValue: String,
      /**
      * the target type; may be "any", "boolean", "float", "int" or "string". See {@link sap.ui.model.odata.type}
      * for more information.
      */
    sTargetType: String
    ): String | Double | Boolean = js.native
    
    /**
      * Parses the given value which is expected to be of the given type to a string. If `isDigitSequence` constraint
      * of this type is set to `true` and the parsed string is a sequence of digits, then the parsed string is
      * either enhanced with leading zeros, if `maxLength` constraint is given, or leading zeros are removed
      * from parsed string.
      *
      * Note: Depending on the format option `parseKeepsEmptyString`, an empty input string (`""`) is either
      * parsed to `""` or `null`. If the constraint `nullable` is `false`, a `null` value is rejected with a
      * {@link sap.ui.model.ValidateException ValidateException} raised in the {@link #validateValue} method.
      *
      * @returns the parsed value
      */
    def parseValue(
      /**
      * the value to be parsed
      */
    vValue: String,
      /**
      * the source type (the expected type of `vValue`). See {@link sap.ui.model.odata.type} for more information.
      */
    sSourceType: String
    ): String = js.native
    def parseValue(
      /**
      * the value to be parsed
      */
    vValue: Boolean,
      /**
      * the source type (the expected type of `vValue`). See {@link sap.ui.model.odata.type} for more information.
      */
    sSourceType: String
    ): String = js.native
    def parseValue(
      /**
      * the value to be parsed
      */
    vValue: Double,
      /**
      * the source type (the expected type of `vValue`). See {@link sap.ui.model.odata.type} for more information.
      */
    sSourceType: String
    ): String = js.native
    
    /**
      * Validates whether the given value in model representation is valid and meets the defined constraints.
      */
    def validateValue(/**
      * the value to be validated
      */
    sValue: String): Unit = js.native
  }
}
