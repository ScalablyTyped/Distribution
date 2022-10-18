package typings.openui5

import typings.openui5.anon.IsDateOnly
import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelOdataTypeDateTimeBaseMod {
  
  @JSImport("sap/ui/model/odata/type/DateTimeBase", JSImport.Default)
  @js.native
  /**
    * Base constructor for the primitive types `Edm.DateTime` and `Edm.DateTimeOffset`.
    */
  open class default () extends DateTimeBase {
    def this(/**
      * Type-specific format options; see subtypes
      */
    oFormatOptions: js.Object) = this()
    def this(
      /**
      * Type-specific format options; see subtypes
      */
    oFormatOptions: js.Object,
      /**
      * Constraints; {@link #validateValue validateValue} throws an error if any constraint is violated
      */
    oConstraints: IsDateOnly
    ) = this()
    def this(
      /**
      * Type-specific format options; see subtypes
      */
    oFormatOptions: Unit,
      /**
      * Constraints; {@link #validateValue validateValue} throws an error if any constraint is violated
      */
    oConstraints: IsDateOnly
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/model/odata/type/DateTimeBase", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.model.odata.type.DateTimeBase with name `sClassName` and enriches
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
    oClassInfo: ClassInfo[T, DateTimeBase]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, DateTimeBase],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.model.odata.type.DateTimeBase.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait DateTimeBase
    extends typings.openui5.sapUiModelOdataTypeOdatatypeMod.default {
    
    /**
      * @SINCE 1.27.0
      *
      * Formats the given value to the given target type.
      *
      * @returns The formatted output value in the target type; `undefined` or `null` are formatted to `null`
      */
    def formatValue(
      /**
      * The value to be formatted, which is represented in the model as a `Date` instance (OData V2)
      */
    oValue: js.Date,
      /**
      * The target type, may be "any", "object" (since 1.69.0), "string", or a type with one of these types as
      * its {@link sap.ui.base.DataType#getPrimitiveType primitive type}. See {@link sap.ui.model.odata.type}
      * for more information.
      */
    sTargetType: String
    ): js.Date | String = js.native
    
    /**
      * @SINCE 1.27.0
      *
      * Parses the given value to a `Date` instance (OData V2).
      *
      * @returns The parsed value
      */
    def parseValue(
      /**
      * The value to be parsed; the empty string and `null` are parsed to `null`
      */
    vValue: String,
      /**
      * The source type (the expected type of `vValue`), must be "object" (since 1.69.0), "string", or a type
      * with one of these types as its {@link sap.ui.base.DataType#getPrimitiveType primitive type}. See {@link
      * sap.ui.model.odata.type} for more information.
      */
    sSourceType: String
    ): js.Date | String = js.native
    def parseValue(
      /**
      * The value to be parsed; the empty string and `null` are parsed to `null`
      */
    vValue: js.Date,
      /**
      * The source type (the expected type of `vValue`), must be "object" (since 1.69.0), "string", or a type
      * with one of these types as its {@link sap.ui.base.DataType#getPrimitiveType primitive type}. See {@link
      * sap.ui.model.odata.type} for more information.
      */
    sSourceType: String
    ): js.Date | String = js.native
    
    /**
      * @SINCE 1.27.0
      *
      * Validates whether the given value in model representation is valid and meets the defined constraints.
      */
    def validateValue(/**
      * The value to be validated
      */
    oValue: js.Date): Unit = js.native
  }
}
