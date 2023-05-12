package typings.openui5

import typings.openui5.anon.Nullable
import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelOdataTypeDateMod {
  
  @JSImport("sap/ui/model/odata/type/Date", JSImport.Default)
  @js.native
  /**
    * Constructor for an OData primitive type `Edm.Date`.
    * See:
    * 	http://docs.oasis-open.org/odata/odata/v4.0/odata-v4.0-part3-csdl.html
    */
  open class default () extends Date1 {
    def this(/**
      * Format options as defined in {@link sap.ui.core.format.DateFormat.getDateInstance}
      */
    oFormatOptions: js.Object) = this()
    def this(
      /**
      * Format options as defined in {@link sap.ui.core.format.DateFormat.getDateInstance}
      */
    oFormatOptions: js.Object,
      /**
      * constraints; {@link #validateValue validateValue} throws an error if any constraint is violated
      */
    oConstraints: Nullable
    ) = this()
    def this(
      /**
      * Format options as defined in {@link sap.ui.core.format.DateFormat.getDateInstance}
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
    
    @JSImport("sap/ui/model/odata/type/Date", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.model.odata.type.Date with name `sClassName` and enriches it with
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
    oClassInfo: ClassInfo[T, Date1]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Date1],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.model.odata.type.Date.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait Date1
    extends typings.openui5.sapUiModelOdataTypeOdatatypeMod.default {
    
    /**
      * Formats the given value to the given target type.
      *
      * @returns the formatted output value in the target type; `undefined` or `null` are formatted to `null`;
      * `Date` objects are returned for target type "object" and represent the given date with time "00:00:00"
      * in the configured time zone
      */
    def formatValue(
      /**
      * the value to be formatted; `string` values are expected in the format "yyyy-MM-dd" used by OData V4;
      * `Date` objects are expected to represent UTC as used by OData V2
      */
    vValue: String,
      /**
      * the target type; may be "any", "object" (since 1.69.0), "string", or a type with one of these types as
      * its {@link sap.ui.base.DataType#getPrimitiveType primitive type}; see {@link sap.ui.model.odata.type}
      * for more information.
      */
    sTargetType: String
    ): String | js.Date | typings.openui5.sapUiCoreDateUi5dateMod.default = js.native
    def formatValue(
      /**
      * the value to be formatted; `string` values are expected in the format "yyyy-MM-dd" used by OData V4;
      * `Date` objects are expected to represent UTC as used by OData V2
      */
    vValue: js.Date,
      /**
      * the target type; may be "any", "object" (since 1.69.0), "string", or a type with one of these types as
      * its {@link sap.ui.base.DataType#getPrimitiveType primitive type}; see {@link sap.ui.model.odata.type}
      * for more information.
      */
    sTargetType: String
    ): String | js.Date | typings.openui5.sapUiCoreDateUi5dateMod.default = js.native
    
    /**
      * @SINCE 1.111.0
      *
      * Gets the model value according to this type's constraints and format options for the given date object
      * representing a date. Validates the resulting value against the constraints of this type instance.
      *
      * @returns The model representation of the date
      */
    def getModelValue(): String | Null = js.native
    def getModelValue(
      /**
      * The date object considering the configured time zone. Must be created via {@link module:sap/ui/core/date/UI5Date.getInstance}
      */
    oDate: js.Date
    ): String | Null = js.native
    def getModelValue(
      /**
      * The date object considering the configured time zone. Must be created via {@link module:sap/ui/core/date/UI5Date.getInstance}
      */
    oDate: typings.openui5.sapUiCoreDateUi5dateMod.default
    ): String | Null = js.native
    
    /**
      * Parses the given value to a date.
      *
      * @returns the parsed value in the format "yyyy-MM-dd" used by OData V4
      */
    def parseValue(
      /**
      * the value to be parsed, maps `""` to `null`; `Date` objects are expected to represent local time and
      * are supported if and only if source type is "object"
      */
    vValue: String,
      /**
      * the source type (the expected type of `vValue`); must be "object" (since 1.69.0), "string", or a type
      * with one of these types as its {@link sap.ui.base.DataType#getPrimitiveType primitive type}; see {@link
      * sap.ui.model.odata.type} for more information.
      */
    sSourceType: String
    ): String = js.native
    def parseValue(
      /**
      * the value to be parsed, maps `""` to `null`; `Date` objects are expected to represent local time and
      * are supported if and only if source type is "object"
      */
    vValue: js.Date,
      /**
      * the source type (the expected type of `vValue`); must be "object" (since 1.69.0), "string", or a type
      * with one of these types as its {@link sap.ui.base.DataType#getPrimitiveType primitive type}; see {@link
      * sap.ui.model.odata.type} for more information.
      */
    sSourceType: String
    ): String = js.native
    
    /**
      * Validates whether the given value in model representation is valid and meets the given constraints.
      */
    def validateValue(/**
      * the value to be validated
      */
    sValue: String): Unit = js.native
  }
}
