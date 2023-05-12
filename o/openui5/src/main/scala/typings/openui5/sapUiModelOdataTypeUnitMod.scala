package typings.openui5

import typings.openui5.anon.CustomUnits
import typings.openui5.anon.SkipDecimalsValidation
import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelOdataTypeUnitMod {
  
  @JSImport("sap/ui/model/odata/type/Unit", JSImport.Default)
  @js.native
  /**
    * Constructor for a `Unit` composite type.
    */
  open class default () extends Unit {
    def this(/**
      * Format options as defined in {@link sap.ui.core.format.NumberFormat.getUnitInstance}. Format options
      * are immutable, that is, they can only be set once on construction. Format options that are not supported
      * or have a different default are listed below. If the format option `showMeasure` is set to `false`, model
      * messages for the unit of measure are not propagated to the control if the corresponding binding supports
      * the feature of ignoring messages, see {@link sap.ui.model.Binding#supportsIgnoreMessages}, and the corresponding
      * binding parameter is not set manually.
      */
    oFormatOptions: CustomUnits) = this()
    def this(
      /**
      * Format options as defined in {@link sap.ui.core.format.NumberFormat.getUnitInstance}. Format options
      * are immutable, that is, they can only be set once on construction. Format options that are not supported
      * or have a different default are listed below. If the format option `showMeasure` is set to `false`, model
      * messages for the unit of measure are not propagated to the control if the corresponding binding supports
      * the feature of ignoring messages, see {@link sap.ui.model.Binding#supportsIgnoreMessages}, and the corresponding
      * binding parameter is not set manually.
      */
    oFormatOptions: scala.Unit,
      /**
      * Only the 'skipDecimalsValidation' constraint is supported. Constraints are immutable, that is, they can
      * only be set once on construction.
      */
    oConstraints: SkipDecimalsValidation
    ) = this()
    def this(
      /**
      * Format options as defined in {@link sap.ui.core.format.NumberFormat.getUnitInstance}. Format options
      * are immutable, that is, they can only be set once on construction. Format options that are not supported
      * or have a different default are listed below. If the format option `showMeasure` is set to `false`, model
      * messages for the unit of measure are not propagated to the control if the corresponding binding supports
      * the feature of ignoring messages, see {@link sap.ui.model.Binding#supportsIgnoreMessages}, and the corresponding
      * binding parameter is not set manually.
      */
    oFormatOptions: CustomUnits,
      /**
      * Only the 'skipDecimalsValidation' constraint is supported. Constraints are immutable, that is, they can
      * only be set once on construction.
      */
    oConstraints: SkipDecimalsValidation
    ) = this()
    def this(
      /**
      * Format options as defined in {@link sap.ui.core.format.NumberFormat.getUnitInstance}. Format options
      * are immutable, that is, they can only be set once on construction. Format options that are not supported
      * or have a different default are listed below. If the format option `showMeasure` is set to `false`, model
      * messages for the unit of measure are not propagated to the control if the corresponding binding supports
      * the feature of ignoring messages, see {@link sap.ui.model.Binding#supportsIgnoreMessages}, and the corresponding
      * binding parameter is not set manually.
      */
    oFormatOptions: scala.Unit,
      /**
      * Only the 'skipDecimalsValidation' constraint is supported. Constraints are immutable, that is, they can
      * only be set once on construction.
      */
    oConstraints: scala.Unit,
      /**
      * Not supported
      */
    aDynamicFormatOptionNames: js.Array[String]
    ) = this()
    def this(
      /**
      * Format options as defined in {@link sap.ui.core.format.NumberFormat.getUnitInstance}. Format options
      * are immutable, that is, they can only be set once on construction. Format options that are not supported
      * or have a different default are listed below. If the format option `showMeasure` is set to `false`, model
      * messages for the unit of measure are not propagated to the control if the corresponding binding supports
      * the feature of ignoring messages, see {@link sap.ui.model.Binding#supportsIgnoreMessages}, and the corresponding
      * binding parameter is not set manually.
      */
    oFormatOptions: scala.Unit,
      /**
      * Only the 'skipDecimalsValidation' constraint is supported. Constraints are immutable, that is, they can
      * only be set once on construction.
      */
    oConstraints: SkipDecimalsValidation,
      /**
      * Not supported
      */
    aDynamicFormatOptionNames: js.Array[String]
    ) = this()
    def this(
      /**
      * Format options as defined in {@link sap.ui.core.format.NumberFormat.getUnitInstance}. Format options
      * are immutable, that is, they can only be set once on construction. Format options that are not supported
      * or have a different default are listed below. If the format option `showMeasure` is set to `false`, model
      * messages for the unit of measure are not propagated to the control if the corresponding binding supports
      * the feature of ignoring messages, see {@link sap.ui.model.Binding#supportsIgnoreMessages}, and the corresponding
      * binding parameter is not set manually.
      */
    oFormatOptions: CustomUnits,
      /**
      * Only the 'skipDecimalsValidation' constraint is supported. Constraints are immutable, that is, they can
      * only be set once on construction.
      */
    oConstraints: scala.Unit,
      /**
      * Not supported
      */
    aDynamicFormatOptionNames: js.Array[String]
    ) = this()
    def this(
      /**
      * Format options as defined in {@link sap.ui.core.format.NumberFormat.getUnitInstance}. Format options
      * are immutable, that is, they can only be set once on construction. Format options that are not supported
      * or have a different default are listed below. If the format option `showMeasure` is set to `false`, model
      * messages for the unit of measure are not propagated to the control if the corresponding binding supports
      * the feature of ignoring messages, see {@link sap.ui.model.Binding#supportsIgnoreMessages}, and the corresponding
      * binding parameter is not set manually.
      */
    oFormatOptions: CustomUnits,
      /**
      * Only the 'skipDecimalsValidation' constraint is supported. Constraints are immutable, that is, they can
      * only be set once on construction.
      */
    oConstraints: SkipDecimalsValidation,
      /**
      * Not supported
      */
    aDynamicFormatOptionNames: js.Array[String]
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/model/odata/type/Unit", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.model.odata.type.Unit with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.model.type.Unit.extend}.
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
      * Returns a metadata object for class sap.ui.model.odata.type.Unit.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait Unit
    extends typings.openui5.sapUiModelTypeUnitMod.default {
    
    /**
      * @SINCE 1.63.0
      *
      * Parses the given string value to an array containing measure and unit.
      * See:
      * 	sap.ui.model.type.Unit#parseValue
      *
      * @returns An array containing measure and unit in this order. Both, measure and unit, are string values
      * unless the format option `parseAsString` is `false`; in this case, the measure is a number.
      */
    def parseValue(
      /**
      * The value to be parsed
      */
    vValue: String,
      /**
      * The source type (the expected type of `vValue`); must be "string", or a type with "string" as its {@link
      * sap.ui.base.DataType#getPrimitiveType primitive type}. See {@link sap.ui.model.odata.type} for more information.
      */
    sSourceType: String
    ): js.Array[Any] = js.native
    def parseValue(
      /**
      * The value to be parsed
      */
    vValue: String,
      /**
      * The source type (the expected type of `vValue`); must be "string", or a type with "string" as its {@link
      * sap.ui.base.DataType#getPrimitiveType primitive type}. See {@link sap.ui.model.odata.type} for more information.
      */
    sSourceType: String,
      /**
      * Not used
      */
    aCurrentValues: js.Array[Any]
    ): js.Array[Any] = js.native
  }
}
