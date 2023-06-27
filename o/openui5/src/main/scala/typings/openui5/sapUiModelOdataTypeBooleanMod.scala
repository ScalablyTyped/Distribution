package typings.openui5

import typings.openui5.anon.Nullable
import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelOdataTypeBooleanMod {
  
  @JSImport("sap/ui/model/odata/type/Boolean", JSImport.Default)
  @js.native
  /**
    * Constructor for an OData primitive type `Edm.Boolean`.
    */
  open class default () extends Boolean1 {
    def this(/**
      * format options as defined in the interface of {@link sap.ui.model.SimpleType}; this type ignores them
      * since it does not support any format options
      */
    oFormatOptions: js.Object) = this()
    def this(
      /**
      * format options as defined in the interface of {@link sap.ui.model.SimpleType}; this type ignores them
      * since it does not support any format options
      */
    oFormatOptions: js.Object,
      /**
      * constraints; {@link #validateValue validateValue} throws an error if any constraint is violated
      */
    oConstraints: Nullable
    ) = this()
    def this(
      /**
      * format options as defined in the interface of {@link sap.ui.model.SimpleType}; this type ignores them
      * since it does not support any format options
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
    
    @JSImport("sap/ui/model/odata/type/Boolean", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.model.odata.type.Boolean with name `sClassName` and enriches it
      * with the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, Boolean1]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Boolean1],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.model.odata.type.Boolean.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait Boolean1
    extends typings.openui5.sapUiModelOdataTypeOdatatypeMod.default {
    
    /**
      * Formats the given boolean value to the given target type.
      *
      * @returns the formatted output value in the target type; `undefined` or `null` are formatted to `null`
      */
    def formatValue(
      /**
      * the value to be formatted
      */
    bValue: Boolean,
      /**
      * the target type; may be "any", "boolean", "string", or a type with one of these types as its {@link sap.ui.base.DataType#getPrimitiveType primitive type}.
      * If the target type (or its primitive type) is "string", the result is "Yes" or "No" in the current {@link sap.ui.core.Configuration#getLanguage language}.
      * See {@link sap.ui.model.odata.type} for more information.
      */
    sTargetType: String
    ): Boolean | String = js.native
    
    def parseValue(
      /**
      * the value to be parsed; the empty string and `null` are parsed to `null`
      */
    vValue: String,
      /**
      * the source type (the expected type of `vValue`); may be "boolean", "string", or a type with one of these
      * types as its {@link sap.ui.base.DataType#getPrimitiveType primitive type}. See {@link sap.ui.model.odata.type }
      * for more information.
      */
    sSourceType: String
    ): Boolean = js.native
    /**
      * Parses the given value from the given type to a boolean.
      *
      * @returns the parsed value
      */
    def parseValue(
      /**
      * the value to be parsed; the empty string and `null` are parsed to `null`
      */
    vValue: Boolean,
      /**
      * the source type (the expected type of `vValue`); may be "boolean", "string", or a type with one of these
      * types as its {@link sap.ui.base.DataType#getPrimitiveType primitive type}. See {@link sap.ui.model.odata.type }
      * for more information.
      */
    sSourceType: String
    ): Boolean = js.native
    
    /**
      * Validates whether the given value in model representation is valid and meets the given constraints.
      */
    def validateValue(/**
      * the value to be validated
      */
    bValue: Boolean): Unit = js.native
  }
}
