package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiUnifiedFileUploaderXHRSettingsMod {
  
  @JSImport("sap/ui/unified/FileUploaderXHRSettings", JSImport.Default)
  @js.native
  /**
    * Constructor for a new FileUploaderXHRSettings.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends FileUploaderXHRSettings {
    def this(/**
      * initial settings for the new control
      */
    mSettings: FileUploaderXHRSettingsSettings) = this()
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
    mSettings: FileUploaderXHRSettingsSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: FileUploaderXHRSettingsSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/unified/FileUploaderXHRSettings", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.unified.FileUploaderXHRSettings with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Element.extend}.
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
    oClassInfo: ClassInfo[T, FileUploaderXHRSettings]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, FileUploaderXHRSettings],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.unified.FileUploaderXHRSettings.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait FileUploaderXHRSettings
    extends typings.openui5.sapUiCoreElementMod.default {
    
    /**
      * @SINCE 1.52
      *
      * Gets current value of property {@link #getWithCredentials withCredentials}.
      *
      * Determines the value of the `XMLHttpRequest.withCredentials` property
      *
      * Default value is `false`.
      *
      * @returns Value of property `withCredentials`
      */
    def getWithCredentials(): Boolean = js.native
    
    /**
      * @SINCE 1.52
      *
      * Sets a new value for property {@link #getWithCredentials withCredentials}.
      *
      * Determines the value of the `XMLHttpRequest.withCredentials` property
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWithCredentials(): this.type = js.native
    def setWithCredentials(/**
      * New value for property `withCredentials`
      */
    bWithCredentials: Boolean): this.type = js.native
  }
  
  trait FileUploaderXHRSettingsSettings
    extends StObject
       with ElementSettings {
    
    /**
      * @SINCE 1.52
      *
      * Determines the value of the `XMLHttpRequest.withCredentials` property
      */
    var withCredentials: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object FileUploaderXHRSettingsSettings {
    
    inline def apply(): FileUploaderXHRSettingsSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileUploaderXHRSettingsSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FileUploaderXHRSettingsSettings] (val x: Self) extends AnyVal {
      
      inline def setWithCredentials(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
      
      inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
    }
  }
}
