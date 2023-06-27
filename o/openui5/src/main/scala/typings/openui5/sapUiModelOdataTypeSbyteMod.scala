package typings.openui5

import typings.openui5.anon.Nullable
import typings.openui5.anon.ParseEmptyValueToZero
import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelOdataTypeSbyteMod {
  
  @JSImport("sap/ui/model/odata/type/SByte", JSImport.Default)
  @js.native
  /**
    * Constructor for a primitive type `Edm.SByte`.
    */
  open class default () extends SByte {
    def this(/**
      * Format options as defined in {@link sap.ui.core.format.NumberFormat.getIntegerInstance}
      */
    oFormatOptions: ParseEmptyValueToZero) = this()
    def this(
      /**
      * Format options as defined in {@link sap.ui.core.format.NumberFormat.getIntegerInstance}
      */
    oFormatOptions: Unit,
      /**
      * constraints; {@link sap.ui.model.odata.type.Int#validateValue validateValue} throws an error if any constraint
      * is violated
      */
    oConstraints: Nullable
    ) = this()
    def this(
      /**
      * Format options as defined in {@link sap.ui.core.format.NumberFormat.getIntegerInstance}
      */
    oFormatOptions: ParseEmptyValueToZero,
      /**
      * constraints; {@link sap.ui.model.odata.type.Int#validateValue validateValue} throws an error if any constraint
      * is violated
      */
    oConstraints: Nullable
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/model/odata/type/SByte", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.model.odata.type.SByte with name `sClassName` and enriches it
      * with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.model.odata.type.Int.extend}.
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
    oClassInfo: ClassInfo[T, SByte]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, SByte],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.model.odata.type.SByte.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait SByte
    extends typings.openui5.sapUiModelOdataTypeIntMod.default {
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Returns the type's supported range as object with properties `minimum` and `maximum`.
      *
      * @returns the range
      */
    def getRange(): js.Object = js.native
  }
}
