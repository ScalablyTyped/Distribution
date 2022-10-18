package typings.openui5

import typings.openui5.anon.NullablePrecision
import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelOdataTypeTimeOfDayMod {
  
  @JSImport("sap/ui/model/odata/type/TimeOfDay", JSImport.Default)
  @js.native
  /**
    * Constructor for an OData primitive type `Edm.TimeOfDay`.
    */
  open class default () extends TimeOfDay {
    def this(/**
      * Format options as defined in {@link sap.ui.core.format.DateFormat}
      */
    oFormatOptions: js.Object) = this()
    def this(
      /**
      * Format options as defined in {@link sap.ui.core.format.DateFormat}
      */
    oFormatOptions: js.Object,
      /**
      * Constraints; {@link #validateValue validateValue} throws an error if any constraint is violated
      */
    oConstraints: NullablePrecision
    ) = this()
    def this(
      /**
      * Format options as defined in {@link sap.ui.core.format.DateFormat}
      */
    oFormatOptions: Unit,
      /**
      * Constraints; {@link #validateValue validateValue} throws an error if any constraint is violated
      */
    oConstraints: NullablePrecision
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/model/odata/type/TimeOfDay", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.model.odata.type.TimeOfDay with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, TimeOfDay]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, TimeOfDay],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.model.odata.type.TimeOfDay.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait TimeOfDay
    extends typings.openui5.sapUiModelOdataTypeOdatatypeMod.default {
    
    /**
      * @SINCE 1.37.0
      *
      * Formats the given value to the given target type.
      *
      * @returns The formatted output value in the target type; `undefined` or `null` are formatted to `null`
      */
    def formatValue(
      /**
      * The value to be formatted, which is represented as a string in the model
      */
    sValue: String,
      /**
      * The target type, may be "any", "object" (since 1.69.0), "string", or a type with one of these types as
      * its {@link sap.ui.base.DataType#getPrimitiveType primitive type}. See {@link sap.ui.model.odata.type}
      * for more information
      */
    sTargetType: String
    ): js.Date | String = js.native
    
    def parseValue(
      /**
      * The value to be parsed, maps `""` to `null`; `Date` objects are expected to represent local time and
      * are supported if and only if source type is "object".
      */
    vValue: String,
      /**
      * The source type (the expected type of `sValue`), must be "string", "object" (since 1.69.0) or a type
      * with one of these types as its {@link sap.ui.base.DataType#getPrimitiveType primitive type}. See {@link
      * sap.ui.model.odata.type} for more information.
      */
    sSourceType: String
    ): String = js.native
    /**
      * @SINCE 1.37.0
      *
      * Parses the given value, which is expected to be of the given type, to a string with an OData V4 Edm.TimeOfDay
      * value.
      *
      * @returns The parsed value
      */
    def parseValue(
      /**
      * The value to be parsed, maps `""` to `null`; `Date` objects are expected to represent local time and
      * are supported if and only if source type is "object".
      */
    vValue: js.Date,
      /**
      * The source type (the expected type of `sValue`), must be "string", "object" (since 1.69.0) or a type
      * with one of these types as its {@link sap.ui.base.DataType#getPrimitiveType primitive type}. See {@link
      * sap.ui.model.odata.type} for more information.
      */
    sSourceType: String
    ): String = js.native
    
    /**
      * @SINCE 1.37.0
      *
      * Validates the given value in model representation and meets the type's constraints.
      */
    def validateValue(/**
      * The value to be validated
      */
    sValue: String): Unit = js.native
  }
}
