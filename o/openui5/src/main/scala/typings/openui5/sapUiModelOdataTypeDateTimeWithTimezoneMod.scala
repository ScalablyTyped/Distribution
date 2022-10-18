package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelOdataTypeDateTimeWithTimezoneMod {
  
  @JSImport("sap/ui/model/odata/type/DateTimeWithTimezone", JSImport.Default)
  @js.native
  /**
    * Constructor for a `DateTimeWithTimezone` composite type.
    * See:
    * 	{sap.ui.model.odata.v2.ODataModel#bindProperty}
    */
  open class default () extends DateTimeWithTimezone {
    def this(/**
      * Format options. For a list of all available options, see {@link sap.ui.core.format.DateFormat.getDateTimeWithTimezoneInstance
      * DateFormat}. The `strictParsing` format option is set to `true` by default and can be overwritten. Format
      * options are immutable, that is, they can only be set once on construction.
      */
    oFormatOptions: js.Object) = this()
    def this(
      /**
      * Format options. For a list of all available options, see {@link sap.ui.core.format.DateFormat.getDateTimeWithTimezoneInstance
      * DateFormat}. The `strictParsing` format option is set to `true` by default and can be overwritten. Format
      * options are immutable, that is, they can only be set once on construction.
      */
    oFormatOptions: js.Object,
      /**
      * Constraints are not supported
      */
    oConstraints: js.Object
    ) = this()
    def this(
      /**
      * Format options. For a list of all available options, see {@link sap.ui.core.format.DateFormat.getDateTimeWithTimezoneInstance
      * DateFormat}. The `strictParsing` format option is set to `true` by default and can be overwritten. Format
      * options are immutable, that is, they can only be set once on construction.
      */
    oFormatOptions: Unit,
      /**
      * Constraints are not supported
      */
    oConstraints: js.Object
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/model/odata/type/DateTimeWithTimezone", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.model.odata.type.DateTimeWithTimezone with name `sClassName` and
      * enriches it with the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, DateTimeWithTimezone]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, DateTimeWithTimezone],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.model.odata.type.DateTimeWithTimezone.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait DateTimeWithTimezone
    extends typings.openui5.sapUiModelCompositeTypeMod.default {
    
    /**
      * Parses the given value.
      *
      * @returns An array with two entries; the first one is a `Date` object for the timestamp and the second
      * one is a string representing a time zone ID; if a part is hidden via the format option `showTimezone`,
      * the corresponding entry in the array is set to `undefined`
      */
    def parseValue(
      /**
      * The value to be parsed
      */
    vValue: String,
      /**
      * The source type (the expected type of `vValue`); must be "object", "string", or a type with one of these
      * types as its {@link sap.ui.base.DataType#getPrimitiveType primitive type}; see {@link sap.ui.model.odata.type}
      * for more information
      */
    sSourceType: String
    ): js.Array[Any] = js.native
    def parseValue(
      /**
      * The value to be parsed
      */
    vValue: String,
      /**
      * The source type (the expected type of `vValue`); must be "object", "string", or a type with one of these
      * types as its {@link sap.ui.base.DataType#getPrimitiveType primitive type}; see {@link sap.ui.model.odata.type}
      * for more information
      */
    sSourceType: String,
      /**
      * The array of current part values; the first entry has to be a `Date` object for the timestamp, and the
      * second entry has to be a string representing a time zone ID; **Note:** This parameter is required, see
      * definition of this parameter in {@link sap.ui.model.CompositeType#parseValue}
      */
    aCurrentValues: js.Array[Any]
    ): js.Array[Any] = js.native
    def parseValue(
      /**
      * The value to be parsed
      */
    vValue: js.Date,
      /**
      * The source type (the expected type of `vValue`); must be "object", "string", or a type with one of these
      * types as its {@link sap.ui.base.DataType#getPrimitiveType primitive type}; see {@link sap.ui.model.odata.type}
      * for more information
      */
    sSourceType: String
    ): js.Array[Any] = js.native
    def parseValue(
      /**
      * The value to be parsed
      */
    vValue: js.Date,
      /**
      * The source type (the expected type of `vValue`); must be "object", "string", or a type with one of these
      * types as its {@link sap.ui.base.DataType#getPrimitiveType primitive type}; see {@link sap.ui.model.odata.type}
      * for more information
      */
    sSourceType: String,
      /**
      * The array of current part values; the first entry has to be a `Date` object for the timestamp, and the
      * second entry has to be a string representing a time zone ID; **Note:** This parameter is required, see
      * definition of this parameter in {@link sap.ui.model.CompositeType#parseValue}
      */
    aCurrentValues: js.Array[Any]
    ): js.Array[Any] = js.native
  }
}
