package typings.openui5

import typings.openui5.anon.DecimalsMaximum
import typings.openui5.anon.Source
import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelTypeUnitMod {
  
  @JSImport("sap/ui/model/type/Unit", JSImport.Default)
  @js.native
  /**
    * Constructor for a Unit type.
    */
  open class default () extends Unit {
    def this(/**
      * Formatting options. For a list of all available options, see {@link sap.ui.core.format.NumberFormat.getUnitInstance NumberFormat}.
      * If the format options `showMeasure` or `showNumber` are set to `false`, model messages for the respective
      * parts are not propagated to the control, provided the corresponding binding supports the feature of ignoring
      * model messages, see {@link sap.ui.model.Binding#supportsIgnoreMessages}, and the corresponding binding
      * parameter is not set manually.
      */
    oFormatOptions: Source) = this()
    def this(
      /**
      * Formatting options. For a list of all available options, see {@link sap.ui.core.format.NumberFormat.getUnitInstance NumberFormat}.
      * If the format options `showMeasure` or `showNumber` are set to `false`, model messages for the respective
      * parts are not propagated to the control, provided the corresponding binding supports the feature of ignoring
      * model messages, see {@link sap.ui.model.Binding#supportsIgnoreMessages}, and the corresponding binding
      * parameter is not set manually.
      */
    oFormatOptions: scala.Unit,
      /**
      * Value constraints
      */
    oConstraints: DecimalsMaximum
    ) = this()
    def this(
      /**
      * Formatting options. For a list of all available options, see {@link sap.ui.core.format.NumberFormat.getUnitInstance NumberFormat}.
      * If the format options `showMeasure` or `showNumber` are set to `false`, model messages for the respective
      * parts are not propagated to the control, provided the corresponding binding supports the feature of ignoring
      * model messages, see {@link sap.ui.model.Binding#supportsIgnoreMessages}, and the corresponding binding
      * parameter is not set manually.
      */
    oFormatOptions: Source,
      /**
      * Value constraints
      */
    oConstraints: DecimalsMaximum
    ) = this()
    def this(
      /**
      * Formatting options. For a list of all available options, see {@link sap.ui.core.format.NumberFormat.getUnitInstance NumberFormat}.
      * If the format options `showMeasure` or `showNumber` are set to `false`, model messages for the respective
      * parts are not propagated to the control, provided the corresponding binding supports the feature of ignoring
      * model messages, see {@link sap.ui.model.Binding#supportsIgnoreMessages}, and the corresponding binding
      * parameter is not set manually.
      */
    oFormatOptions: scala.Unit,
      /**
      * Value constraints
      */
    oConstraints: scala.Unit,
      /**
      * keys for dynamic format options which are used to map additional binding values, e.g. `["decimals"]`
      */
    aDynamicFormatOptionNames: js.Array[Any]
    ) = this()
    def this(
      /**
      * Formatting options. For a list of all available options, see {@link sap.ui.core.format.NumberFormat.getUnitInstance NumberFormat}.
      * If the format options `showMeasure` or `showNumber` are set to `false`, model messages for the respective
      * parts are not propagated to the control, provided the corresponding binding supports the feature of ignoring
      * model messages, see {@link sap.ui.model.Binding#supportsIgnoreMessages}, and the corresponding binding
      * parameter is not set manually.
      */
    oFormatOptions: scala.Unit,
      /**
      * Value constraints
      */
    oConstraints: DecimalsMaximum,
      /**
      * keys for dynamic format options which are used to map additional binding values, e.g. `["decimals"]`
      */
    aDynamicFormatOptionNames: js.Array[Any]
    ) = this()
    def this(
      /**
      * Formatting options. For a list of all available options, see {@link sap.ui.core.format.NumberFormat.getUnitInstance NumberFormat}.
      * If the format options `showMeasure` or `showNumber` are set to `false`, model messages for the respective
      * parts are not propagated to the control, provided the corresponding binding supports the feature of ignoring
      * model messages, see {@link sap.ui.model.Binding#supportsIgnoreMessages}, and the corresponding binding
      * parameter is not set manually.
      */
    oFormatOptions: Source,
      /**
      * Value constraints
      */
    oConstraints: scala.Unit,
      /**
      * keys for dynamic format options which are used to map additional binding values, e.g. `["decimals"]`
      */
    aDynamicFormatOptionNames: js.Array[Any]
    ) = this()
    def this(
      /**
      * Formatting options. For a list of all available options, see {@link sap.ui.core.format.NumberFormat.getUnitInstance NumberFormat}.
      * If the format options `showMeasure` or `showNumber` are set to `false`, model messages for the respective
      * parts are not propagated to the control, provided the corresponding binding supports the feature of ignoring
      * model messages, see {@link sap.ui.model.Binding#supportsIgnoreMessages}, and the corresponding binding
      * parameter is not set manually.
      */
    oFormatOptions: Source,
      /**
      * Value constraints
      */
    oConstraints: DecimalsMaximum,
      /**
      * keys for dynamic format options which are used to map additional binding values, e.g. `["decimals"]`
      */
    aDynamicFormatOptionNames: js.Array[Any]
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/model/type/Unit", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.model.type.Unit with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
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
    oClassInfo: scala.Unit,
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
    oClassInfo: ClassInfo[T, Unit]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Unit],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.model.type.Unit.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait Unit
    extends typings.openui5.sapUiModelCompositeTypeMod.default {
    
    def formatValue(
      /**
      * the array of values or string value to be formatted. If an array is given, index 0 is the number value,
      * and index 1 is the Unit code (CLDR or custom). Indices 2+ are the bound values for the dynamic format
      * options.
      */
    vValue: String,
      /**
      * the target type
      */
    sInternalType: String
    ): Any = js.native
  }
}
