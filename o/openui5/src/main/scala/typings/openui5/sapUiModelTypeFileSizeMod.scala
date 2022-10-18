package typings.openui5

import typings.openui5.anon.`37`
import typings.openui5.anon.`38`
import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelTypeFileSizeMod {
  
  @JSImport("sap/ui/model/type/FileSize", JSImport.Default)
  @js.native
  /**
    * Constructor for a FileSize type.
    */
  open class default ()
    extends typings.openui5.sapUiModelSimpleTypeMod.default {
    def this(/**
      * formatting options. Supports the same options as {@link sap.ui.core.format.FileSizeFormat.getInstance
      * FileSizeFormat.getInstance}
      */
    oFormatOptions: `37`) = this()
    def this(
      /**
      * formatting options. Supports the same options as {@link sap.ui.core.format.FileSizeFormat.getInstance
      * FileSizeFormat.getInstance}
      */
    oFormatOptions: Unit,
      /**
      * value constraints.
      */
    oConstraints: `38`
    ) = this()
    def this(
      /**
      * formatting options. Supports the same options as {@link sap.ui.core.format.FileSizeFormat.getInstance
      * FileSizeFormat.getInstance}
      */
    oFormatOptions: `37`,
      /**
      * value constraints.
      */
    oConstraints: `38`
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/model/type/FileSize", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.model.type.FileSize with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.model.SimpleType.extend}.
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
    oClassInfo: ClassInfo[T, FileSize]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, FileSize],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.model.type.FileSize.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  type FileSize = typings.openui5.sapUiModelSimpleTypeMod.default
}
