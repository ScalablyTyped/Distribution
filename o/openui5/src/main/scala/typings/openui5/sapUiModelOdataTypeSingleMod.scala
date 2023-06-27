package typings.openui5

import typings.openui5.anon.Nullable
import typings.openui5.anon.PreserveDecimals
import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelOdataTypeSingleMod {
  
  @JSImport("sap/ui/model/odata/type/Single", JSImport.Default)
  @js.native
  /**
    * Constructor for a primitive type `Edm.Single`.
    */
  open class default () extends Single {
    def this(/**
      * Format options as defined in {@link sap.ui.core.format.NumberFormat.getFloatInstance}. In contrast to
      * NumberFormat `groupingEnabled` defaults to `true`.
      */
    oFormatOptions: PreserveDecimals) = this()
    def this(
      /**
      * Format options as defined in {@link sap.ui.core.format.NumberFormat.getFloatInstance}. In contrast to
      * NumberFormat `groupingEnabled` defaults to `true`.
      */
    oFormatOptions: Unit,
      /**
      * constraints; {@link #validateValue validateValue} throws an error if any constraint is violated
      */
    oConstraints: Nullable
    ) = this()
    def this(
      /**
      * Format options as defined in {@link sap.ui.core.format.NumberFormat.getFloatInstance}. In contrast to
      * NumberFormat `groupingEnabled` defaults to `true`.
      */
    oFormatOptions: PreserveDecimals,
      /**
      * constraints; {@link #validateValue validateValue} throws an error if any constraint is violated
      */
    oConstraints: Nullable
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/model/odata/type/Single", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.model.odata.type.Single with name `sClassName` and enriches it
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
    oClassInfo: ClassInfo[T, Single]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Single],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.model.odata.type.Single.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait Single
    extends typings.openui5.sapUiModelOdataTypeOdatatypeMod.default {
    
    /**
      * Formats the given value to the given target type.
      *
      * @returns the formatted output value in the target type; `undefined` or `null` are formatted to `null`
      */
    def formatValue(
      /**
      * the value to be formatted, which is represented as a number in the model
      */
    vValue: String,
      /**
      * the target type; may be "any", "float", "int", "string", or a type with one of these types as its {@link sap.ui.base.DataType#getPrimitiveType primitive type}.
      * See {@link sap.ui.model.odata.type} for more information.
      */
    sTargetType: String
    ): Double | String = js.native
    def formatValue(
      /**
      * the value to be formatted, which is represented as a number in the model
      */
    vValue: Double,
      /**
      * the target type; may be "any", "float", "int", "string", or a type with one of these types as its {@link sap.ui.base.DataType#getPrimitiveType primitive type}.
      * See {@link sap.ui.model.odata.type} for more information.
      */
    sTargetType: String
    ): Double | String = js.native
    
    def parseValue(
      /**
      * The value to be parsed; note that there is no way to enter `Infinity` or `NaN` values
      */
    vValue: String,
      /**
      * The source type (the expected type of `vValue`); may be "float", "int", "string", or a type with one
      * of these types as its {@link sap.ui.base.DataType#getPrimitiveType primitive type}. See {@link sap.ui.model.odata.type }
      * for more information.
      */
    sSourceType: String
    ): Double | Null = js.native
    /**
      * @since 1.29.0
      *
      * Parses the given value, which is expected to be of the given type, to an Edm.Single in `number` representation.
      *
      * @returns The parsed value. The empty string and `null` are parsed to:
      * 	 - `0` if the `parseEmptyValueToZero` format option is set to `true` and the `nullable` constraint is
      *     set to `false`,
      * 	 - `null` otherwise.
      */
    def parseValue(
      /**
      * The value to be parsed; note that there is no way to enter `Infinity` or `NaN` values
      */
    vValue: Double,
      /**
      * The source type (the expected type of `vValue`); may be "float", "int", "string", or a type with one
      * of these types as its {@link sap.ui.base.DataType#getPrimitiveType primitive type}. See {@link sap.ui.model.odata.type }
      * for more information.
      */
    sSourceType: String
    ): Double | Null = js.native
    def parseValue(
      /**
      * The value to be parsed; note that there is no way to enter `Infinity` or `NaN` values
      */
    vValue: Null,
      /**
      * The source type (the expected type of `vValue`); may be "float", "int", "string", or a type with one
      * of these types as its {@link sap.ui.base.DataType#getPrimitiveType primitive type}. See {@link sap.ui.model.odata.type }
      * for more information.
      */
    sSourceType: String
    ): Double | Null = js.native
    
    /**
      * @since 1.29.0
      *
      * Validates whether the given value in model representation is valid and meets the defined constraints.
      */
    def validateValue(/**
      * the value to be validated
      */
    fValue: Double): Unit = js.native
  }
}
