package typings.openui5

import typings.openui5.anon.Minimum
import typings.openui5.anon.Source
import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelTypeCurrencyMod {
  
  @JSImport("sap/ui/model/type/Currency", JSImport.Default)
  @js.native
  /**
    * Constructor for a `Currency` type.
    */
  open class default () extends Currency {
    def this(/**
      * Format options; for a list of all available options, see {@link sap.ui.core.format.NumberFormat.getCurrencyInstance}.
      * If the format options `showMeasure` or since 1.89.0 `showNumber` are set to `false`, model messages for
      * the respective parts are not propagated to the control, provided the corresponding binding supports the
      * feature of ignoring model messages, see {@link sap.ui.model.Binding#supportsIgnoreMessages}, and the
      * corresponding binding parameter is not set manually.
      */
    oFormatOptions: Source) = this()
    def this(
      /**
      * Format options; for a list of all available options, see {@link sap.ui.core.format.NumberFormat.getCurrencyInstance}.
      * If the format options `showMeasure` or since 1.89.0 `showNumber` are set to `false`, model messages for
      * the respective parts are not propagated to the control, provided the corresponding binding supports the
      * feature of ignoring model messages, see {@link sap.ui.model.Binding#supportsIgnoreMessages}, and the
      * corresponding binding parameter is not set manually.
      */
    oFormatOptions: Unit,
      /**
      * Constraints for the value part
      */
    oConstraints: Minimum
    ) = this()
    def this(
      /**
      * Format options; for a list of all available options, see {@link sap.ui.core.format.NumberFormat.getCurrencyInstance}.
      * If the format options `showMeasure` or since 1.89.0 `showNumber` are set to `false`, model messages for
      * the respective parts are not propagated to the control, provided the corresponding binding supports the
      * feature of ignoring model messages, see {@link sap.ui.model.Binding#supportsIgnoreMessages}, and the
      * corresponding binding parameter is not set manually.
      */
    oFormatOptions: Source,
      /**
      * Constraints for the value part
      */
    oConstraints: Minimum
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/model/type/Currency", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.model.type.Currency with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.model.CompositeType.extend}.
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
    oClassInfo: ClassInfo[T, Currency]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Currency],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.model.type.Currency.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait Currency
    extends typings.openui5.sapUiModelCompositeTypeMod.default {
    
    def formatValue(
      /**
      * The array containing amount and currency code in case the `source` format option is not given; otherwise,
      * a string representation of the value which is parsed using the source format
      */
    vValue: String,
      /**
      * The target type; must be "string", or a type with "string" as its {@link sap.ui.base.DataType#getPrimitiveType primitive type}
      */
    sTargetType: String
    ): String | Null = js.native
    
    /**
      * Parses a string value.
      *
      * @returns If the `source` format option is not set, the method returns an array containing amount and
      * currency: the amount is a `string` if the format option `parseAsString` is set and a `number` otherwise,
      * the currency is always a `string`. If the `source` format option is set, the method returns a string
      * representation of amount and currency in the given source format.
      */
    def parseValue(
      /**
      * The value to be parsed
      */
    sValue: String,
      /**
      * The source type (the expected type of `sValue`); must be "string", or a type with "string" as its {@link sap.ui.base.DataType#getPrimitiveType primitive type}.
      */
    sSourceType: String
    ): js.Array[Any] | String = js.native
    def parseValue(
      /**
      * The value to be parsed
      */
    sValue: String,
      /**
      * The source type (the expected type of `sValue`); must be "string", or a type with "string" as its {@link sap.ui.base.DataType#getPrimitiveType primitive type}.
      */
    sSourceType: String,
      /**
      * Not used
      */
    aCurrentValues: js.Array[Any]
    ): js.Array[Any] | String = js.native
  }
}
