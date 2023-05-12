package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.ManagedObjectSettings
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.std.Generator
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreUtilExportTypeMod {
  
  @JSImport("sap/ui/core/util/ExportType", JSImport.Default)
  @js.native
  /**
    * Constructor for a new ExportType.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ExportType {
    def this(/**
      * initial settings for the new control
      */
    mSettings: ExportTypeSettings) = this()
    def this(/**
      * id for the new control, generated automatically if no id is given
      */
    sId: String) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: String,
      /**
      * initial settings for the new control
      */
    mSettings: ExportTypeSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: ExportTypeSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/util/ExportType", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.core.util.ExportType with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.base.ManagedObject.extend}.
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
    oClassInfo: ClassInfo[T, ExportType]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ExportType],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.core.util.ExportType.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseManagedObjectMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseManagedObjectMetadataMod.default]
  }
  
  @js.native
  trait ExportType
    extends typings.openui5.sapUiBaseManagedObjectMod.default {
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Handles the generation process of the file.
      *
      *
      * @returns content
      */
    def _generate(/**
      * export instance
      */
    oExport: typings.openui5.sapUiCoreUtilExportMod.default): String = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Creates a cell "generator" (inspired by ES6 Generators)
      *
      * @returns generator
      */
    def cellGenerator(): Generator[Any, Any, Any] = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Creates a column "generator" (inspired by ES6 Generators)
      *
      * @returns generator
      */
    def columnGenerator(): Generator[Any, Any, Any] = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Generates the file content.
      *  Should be implemented by the individual types!
      *
      * @returns content
      */
    def generate(): String = js.native
    
    /**
      * Gets current value of property {@link #getByteOrderMark byteOrderMark}.
      *
      * Whether to prepend an unicode byte order mark when saving as a file (only applies for utf-8 charset).
      *
      * Default value is `undefined`.
      *
      * @returns Value of property `byteOrderMark`
      */
    def getByteOrderMark(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getCharset charset}.
      *
      * Charset.
      *
      * @returns Value of property `charset`
      */
    def getCharset(): String = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Returns the number of columns.
      *
      * @returns count
      */
    def getColumnCount(): int = js.native
    
    /**
      * Gets current value of property {@link #getFileExtension fileExtension}.
      *
      * File extension.
      *
      * @returns Value of property `fileExtension`
      */
    def getFileExtension(): String = js.native
    
    /**
      * Gets current value of property {@link #getMimeType mimeType}.
      *
      * MIME type.
      *
      * @returns Value of property `mimeType`
      */
    def getMimeType(): String = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Returns the number of rows.
      *
      * @returns count
      */
    def getRowCount(): int = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Creates a row "generator" (inspired by ES6 Generators)
      *
      * @returns generator
      */
    def rowGenerator(): Generator[Any, Any, Any] = js.native
    
    /**
      * Sets a new value for property {@link #getByteOrderMark byteOrderMark}.
      *
      * Whether to prepend an unicode byte order mark when saving as a file (only applies for utf-8 charset).
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `undefined`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setByteOrderMark(): this.type = js.native
    def setByteOrderMark(/**
      * New value for property `byteOrderMark`
      */
    bByteOrderMark: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getCharset charset}.
      *
      * Charset.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCharset(/**
      * New value for property `charset`
      */
    sCharset: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getFileExtension fileExtension}.
      *
      * File extension.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFileExtension(/**
      * New value for property `fileExtension`
      */
    sFileExtension: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMimeType mimeType}.
      *
      * MIME type.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMimeType(/**
      * New value for property `mimeType`
      */
    sMimeType: String): this.type = js.native
  }
  
  trait ExportTypeSettings
    extends StObject
       with ManagedObjectSettings {
    
    /**
      * Whether to prepend an unicode byte order mark when saving as a file (only applies for utf-8 charset).
      */
    var byteOrderMark: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Charset.
      */
    var charset: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * File extension.
      */
    var fileExtension: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * MIME type.
      */
    var mimeType: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object ExportTypeSettings {
    
    inline def apply(): ExportTypeSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExportTypeSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExportTypeSettings] (val x: Self) extends AnyVal {
      
      inline def setByteOrderMark(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "byteOrderMark", value.asInstanceOf[js.Any])
      
      inline def setByteOrderMarkUndefined: Self = StObject.set(x, "byteOrderMark", js.undefined)
      
      inline def setCharset(value: String | PropertyBindingInfo): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
      
      inline def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
      
      inline def setFileExtension(value: String | PropertyBindingInfo): Self = StObject.set(x, "fileExtension", value.asInstanceOf[js.Any])
      
      inline def setFileExtensionUndefined: Self = StObject.set(x, "fileExtension", js.undefined)
      
      inline def setMimeType(value: String | PropertyBindingInfo): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
      
      inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    }
  }
}
