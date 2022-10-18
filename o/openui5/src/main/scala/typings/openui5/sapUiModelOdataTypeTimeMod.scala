package typings.openui5

import typings.openui5.anon.EdmType
import typings.openui5.anon.Nullable
import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelOdataTypeTimeMod {
  
  @JSImport("sap/ui/model/odata/type/Time", JSImport.Default)
  @js.native
  /**
    * Constructor for an OData primitive type `Edm.Time`.
    */
  open class default () extends Time {
    def this(/**
      * format options as defined in {@link sap.ui.core.format.DateFormat}
      */
    oFormatOptions: js.Object) = this()
    def this(
      /**
      * format options as defined in {@link sap.ui.core.format.DateFormat}
      */
    oFormatOptions: js.Object,
      /**
      * constraints; {@link #validateValue validateValue} throws an error if any constraint is violated
      */
    oConstraints: Nullable
    ) = this()
    def this(
      /**
      * format options as defined in {@link sap.ui.core.format.DateFormat}
      */
    oFormatOptions: Unit,
      /**
      * constraints; {@link #validateValue validateValue} throws an error if any constraint is violated
      */
    oConstraints: Nullable
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/model/odata/type/Time", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.model.odata.type.Time with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, Time]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Time],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.model.odata.type.Time.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait Time
    extends typings.openui5.sapUiModelOdataTypeOdatatypeMod.default {
    
    /**
      * Formats the given value to the given target type
      *
      * @returns the formatted output value in the target type; `undefined` or `null` are formatted to `null`
      */
    def formatValue(
      /**
      * the value in model representation to be formatted.
      */
    oValue: EdmType,
      /**
      * the target type; may be "any", "string", or a type with one of these types as its {@link sap.ui.base.DataType#getPrimitiveType
      * primitive type}. See {@link sap.ui.model.odata.type} for more information.
      */
    sTargetType: String
    ): String = js.native
    
    /**
      * Parses the given value, which is expected to be of the given type, to a time object.
      *
      * @returns the parsed value as described in {@link #formatValue formatValue}
      */
    def parseValue(
      /**
      * the value to be parsed, maps `""` to `null`
      */
    sValue: String,
      /**
      * the source type (the expected type of `sValue`); must be "string", or a type with "string" as its {@link
      * sap.ui.base.DataType#getPrimitiveType primitive type}. See {@link sap.ui.model.odata.type} for more information.
      */
    sSourceType: String
    ): js.Object = js.native
    
    /**
      * Validates whether the given value in model representation is valid and meets the defined constraints.
      */
    def validateValue(/**
      * the value to be validated
      */
    oValue: js.Object): Unit = js.native
  }
}
