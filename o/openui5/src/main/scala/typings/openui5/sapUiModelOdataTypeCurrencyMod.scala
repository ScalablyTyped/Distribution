package typings.openui5

import typings.openui5.anon.CustomCurrencies
import typings.openui5.anon.SkipDecimalsValidation
import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelOdataTypeCurrencyMod {
  
  @JSImport("sap/ui/model/odata/type/Currency", JSImport.Default)
  @js.native
  /**
    * Constructor for a `Currency` composite type.
    */
  open class default () extends Currency {
    def this(/**
      * See parameter `oFormatOptions` of {@link sap.ui.model.type.Currency#constructor}. Format options are
      * immutable, that is, they can only be set once on construction. Format options that are not supported
      * or have a different default are listed below. If the format option `showMeasure` is set to `false`, model
      * messages for the currency code are not propagated to the control if the corresponding binding supports
      * the feature of ignoring messages, see {@link sap.ui.model.Binding#supportsIgnoreMessages}, and the corresponding
      * binding parameter is not set manually.
      */
    oFormatOptions: CustomCurrencies) = this()
    def this(
      /**
      * See parameter `oFormatOptions` of {@link sap.ui.model.type.Currency#constructor}. Format options are
      * immutable, that is, they can only be set once on construction. Format options that are not supported
      * or have a different default are listed below. If the format option `showMeasure` is set to `false`, model
      * messages for the currency code are not propagated to the control if the corresponding binding supports
      * the feature of ignoring messages, see {@link sap.ui.model.Binding#supportsIgnoreMessages}, and the corresponding
      * binding parameter is not set manually.
      */
    oFormatOptions: Unit,
      /**
      * Only the 'skipDecimalsValidation' constraint is supported. Constraints are immutable, that is, they can
      * only be set once on construction.
      */
    oConstraints: SkipDecimalsValidation
    ) = this()
    def this(
      /**
      * See parameter `oFormatOptions` of {@link sap.ui.model.type.Currency#constructor}. Format options are
      * immutable, that is, they can only be set once on construction. Format options that are not supported
      * or have a different default are listed below. If the format option `showMeasure` is set to `false`, model
      * messages for the currency code are not propagated to the control if the corresponding binding supports
      * the feature of ignoring messages, see {@link sap.ui.model.Binding#supportsIgnoreMessages}, and the corresponding
      * binding parameter is not set manually.
      */
    oFormatOptions: CustomCurrencies,
      /**
      * Only the 'skipDecimalsValidation' constraint is supported. Constraints are immutable, that is, they can
      * only be set once on construction.
      */
    oConstraints: SkipDecimalsValidation
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/model/odata/type/Currency", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.model.odata.type.Currency with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.model.type.Currency.extend}.
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
      * Returns a metadata object for class sap.ui.model.odata.type.Currency.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait Currency
    extends typings.openui5.sapUiModelTypeCurrencyMod.default
}
