package typings.openui5

import typings.openui5.anon.Precision
import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelOdataTypeDateTimeOffsetMod {
  
  @JSImport("sap/ui/model/odata/type/DateTimeOffset", JSImport.Default)
  @js.native
  /**
    * Constructor for a primitive type `Edm.DateTimeOffset`.
    */
  open class default () extends DateTimeOffset {
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
      * Constraints; {@link sap.ui.model.odata.type.DateTimeBase#validateValue validateValue} throws an error
      * if any constraint is violated
      */
    oConstraints: Precision
    ) = this()
    def this(
      /**
      * Format options as defined in {@link sap.ui.core.format.DateFormat}
      */
    oFormatOptions: Unit,
      /**
      * Constraints; {@link sap.ui.model.odata.type.DateTimeBase#validateValue validateValue} throws an error
      * if any constraint is violated
      */
    oConstraints: Precision
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/model/odata/type/DateTimeOffset", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.model.odata.type.DateTimeOffset with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.model.odata.type.DateTimeBase.extend}.
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
    oClassInfo: ClassInfo[T, DateTimeOffset]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, DateTimeOffset],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.model.odata.type.DateTimeOffset.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait DateTimeOffset
    extends typings.openui5.sapUiModelOdataTypeDateTimeBaseMod.default {
    
    /**
      * @SINCE 1.27.0
      *
      * Formats the given value to the given target type.
      *
      * @returns The formatted output value in the target type; `undefined` or `null` are formatted to `null`
      */
    def formatValue(
      /**
      * The target type, may be "any", "object" (since 1.69.0), "string", or a type with one of these types as
      * its {@link sap.ui.base.DataType#getPrimitiveType primitive type}. See {@link sap.ui.model.odata.type}
      * for more information.
      */
    sTargetType: String
    ): js.Date | String = js.native
    def formatValue(
      /**
      * The value to be formatted, which is represented in the model as a `Date` instance (OData V2) or as a
      * string like "1970-12-31T23:59:58Z" (OData V4); both representations are accepted independent of the model's
      * OData version
      */
    vValue: String,
      /**
      * The target type, may be "any", "object" (since 1.69.0), "string", or a type with one of these types as
      * its {@link sap.ui.base.DataType#getPrimitiveType primitive type}. See {@link sap.ui.model.odata.type}
      * for more information.
      */
    sTargetType: String
    ): js.Date | String = js.native
  }
}
