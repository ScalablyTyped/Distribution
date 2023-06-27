package typings.openui5

import typings.openui5.anon.MaximumExclusive
import typings.openui5.anon.PreserveDecimals
import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelOdataTypeDecimalMod {
  
  @JSImport("sap/ui/model/odata/type/Decimal", JSImport.Default)
  @js.native
  /**
    * Constructor for a primitive type `Edm.Decimal`.
    */
  open class default () extends Decimal {
    def this(/**
      * Format options as defined in {@link sap.ui.core.format.NumberFormat.getFloatInstance}. In contrast to
      * NumberFormat `groupingEnabled` defaults to `true`. Note that `maxFractionDigits` and `minFractionDigits`
      * are set to the value of the constraint `scale` unless it is "variable". They can however be overwritten.
      */
    oFormatOptions: PreserveDecimals) = this()
    def this(
      /**
      * Format options as defined in {@link sap.ui.core.format.NumberFormat.getFloatInstance}. In contrast to
      * NumberFormat `groupingEnabled` defaults to `true`. Note that `maxFractionDigits` and `minFractionDigits`
      * are set to the value of the constraint `scale` unless it is "variable". They can however be overwritten.
      */
    oFormatOptions: Unit,
      /**
      * constraints; {@link #validateValue validateValue} throws an error if any constraint is violated
      */
    oConstraints: MaximumExclusive
    ) = this()
    def this(
      /**
      * Format options as defined in {@link sap.ui.core.format.NumberFormat.getFloatInstance}. In contrast to
      * NumberFormat `groupingEnabled` defaults to `true`. Note that `maxFractionDigits` and `minFractionDigits`
      * are set to the value of the constraint `scale` unless it is "variable". They can however be overwritten.
      */
    oFormatOptions: PreserveDecimals,
      /**
      * constraints; {@link #validateValue validateValue} throws an error if any constraint is violated
      */
    oConstraints: MaximumExclusive
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/model/odata/type/Decimal", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.model.odata.type.Decimal with name `sClassName` and enriches it
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
    oClassInfo: ClassInfo[T, Decimal]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Decimal],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.model.odata.type.Decimal.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait Decimal
    extends typings.openui5.sapUiModelOdataTypeOdatatypeMod.default {
    
    /**
      * Formats the given value to the given target type. When formatting to "string" the type's constraint `scale`
      * is taken into account.
      *
      * @returns the formatted output value in the target type; `undefined` or `null` are formatted to `null`
      */
    def formatValue(
      /**
      * the value to be formatted, which is represented as a string in the model
      */
    sValue: String,
      /**
      * the target type; may be "any", "float", "int", "string", or a type with one of these types as its {@link sap.ui.base.DataType#getPrimitiveType primitive type}.
      * See {@link sap.ui.model.odata.type} for more information.
      */
    sTargetType: String
    ): Double | String = js.native
    
    /**
      * Parses the given value, which is expected to be of the given type, to a decimal in `string` representation.
      *
      * @returns The parsed value. The empty string and `null` are parsed to:
      * 	 - `"0"` if the `parseEmptyValueToZero` format option is set to `true` and the `nullable` constraint
      *     is set to `false`,
      * 	 - `null` otherwise.
      */
    def parseValue(
      /**
      * The value to be parsed
      */
    vValue: String,
      /**
      * The source type (the expected type of `vValue`); may be "float", "int", "string", or a type with one
      * of these types as its {@link sap.ui.base.DataType#getPrimitiveType primitive type}. See {@link sap.ui.model.odata.type }
      * for more information.
      */
    sSourceType: String
    ): String | Null = js.native
    def parseValue(
      /**
      * The value to be parsed
      */
    vValue: Double,
      /**
      * The source type (the expected type of `vValue`); may be "float", "int", "string", or a type with one
      * of these types as its {@link sap.ui.base.DataType#getPrimitiveType primitive type}. See {@link sap.ui.model.odata.type }
      * for more information.
      */
    sSourceType: String
    ): String | Null = js.native
    def parseValue(
      /**
      * The value to be parsed
      */
    vValue: Null,
      /**
      * The source type (the expected type of `vValue`); may be "float", "int", "string", or a type with one
      * of these types as its {@link sap.ui.base.DataType#getPrimitiveType primitive type}. See {@link sap.ui.model.odata.type }
      * for more information.
      */
    sSourceType: String
    ): String | Null = js.native
    
    /**
      * Validates whether the given value in model representation is valid and meets the defined constraints.
      */
    def validateValue(/**
      * the value to be validated
      */
    sValue: String): Unit = js.native
  }
}
