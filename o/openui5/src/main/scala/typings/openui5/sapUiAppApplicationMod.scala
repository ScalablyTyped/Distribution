package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.ManagedObjectSettings
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiAppApplicationMod {
  
  @JSImport("sap/ui/app/Application", JSImport.Default)
  @js.native
  /**
    * Creates an application instance, only one instance is allowed (singleton).
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Application {
    def this(/**
      * Initial settings for the new application instance
      */
    mSettings: ApplicationSettings) = this()
    def this(/**
      * Optional ID for the application; generated automatically if no non-empty ID is given. **Note:** this
      * can be omitted, no matter whether `mSettings` will be given or not
      */
    sId: String) = this()
    def this(
      /**
      * Optional ID for the application; generated automatically if no non-empty ID is given. **Note:** this
      * can be omitted, no matter whether `mSettings` will be given or not
      */
    sId: String,
      /**
      * Initial settings for the new application instance
      */
    mSettings: ApplicationSettings
    ) = this()
    def this(
      /**
      * Optional ID for the application; generated automatically if no non-empty ID is given. **Note:** this
      * can be omitted, no matter whether `mSettings` will be given or not
      */
    sId: Unit,
      /**
      * Initial settings for the new application instance
      */
    mSettings: ApplicationSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/app/Application", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.app.Application with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Component.extend}.
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
    oClassInfo: ClassInfo[T, Application]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Application],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.app.Application.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreComponentMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreComponentMetadataMod.default]
  }
  
  @js.native
  trait Application
    extends typings.openui5.sapUiCoreComponentMod.default {
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Creates and returns the root component. Override this method in your application implementation, if you
      * want to override the default creation by metadata.
      *
      * @returns the root component
      */
    def createRootComponent(): typings.openui5.sapUiCoreUicomponentMod.default = js.native
    
    /**
      * Destroys the rootComponent in the aggregation {@link #getRootComponent rootComponent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyRootComponent(): this.type = js.native
    
    /**
      * Gets current value of property {@link #getConfig config}.
      *
      * @returns Value of property `config`
      */
    def getConfig(): Any = js.native
    
    /**
      * Gets current value of property {@link #getRoot root}.
      *
      * @returns Value of property `root`
      */
    def getRoot(): String = js.native
    
    /**
      * Gets content of aggregation {@link #getRootComponent rootComponent}.
      */
    def getRootComponent(): typings.openui5.sapUiCoreUicomponentMod.default = js.native
    
    /**
      * @since 1.13.1
      * @deprecated (since 1.14)
      *
      * Returns the application root component.
      *
      * @returns The root component
      */
    def getView(): typings.openui5.sapUiCoreUicomponentMod.default = js.native
    
    /**
      * The main method is called when the DOM and UI5 is completely loaded. Override this method in your Application
      * class implementation to execute code which relies on a loaded DOM / UI5.
      */
    def main(): Unit = js.native
    
    /**
      * On before exit application hook. Override this method in your Application class implementation, to handle
      * cleanup before the real exit or to prompt a question to the user, if the application should be exited.
      *
      * @returns return a string if a prompt should be displayed to the user confirming closing the application
      * (e.g. when the application is not yet saved).
      */
    def onBeforeExit(): String = js.native
    
    /**
      * On error hook. Override this method in your Application class implementation to listen to unhandled errors.
      */
    def onError(
      /**
      * The error message.
      */
    sMessage: String,
      /**
      * The file where the error occurred
      */
    sFile: String,
      /**
      * The line number of the error
      */
    iLine: Double
    ): Unit = js.native
    
    /**
      * On exit application hook. Override this method in your Application class implementation, to handle cleanup
      * of the application.
      */
    def onExit(): Unit = js.native
    
    /**
      * @since 1.13.1
      *
      * Sets the configuration model.
      */
    def setConfig(
      /**
      * the configuration model, the configuration object or a URI string to load a JSON configuration file.
      */
    vConfig: String
    ): Unit = js.native
    def setConfig(
      /**
      * the configuration model, the configuration object or a URI string to load a JSON configuration file.
      */
    vConfig: js.Object
    ): Unit = js.native
    def setConfig(
      /**
      * the configuration model, the configuration object or a URI string to load a JSON configuration file.
      */
    vConfig: typings.openui5.sapUiModelModelMod.default
    ): Unit = js.native
    
    /**
      * Sets a new value for property {@link #getRoot root}.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setRoot(/**
      * New value for property `root`
      */
    sRoot: String): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getRootComponent rootComponent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setRootComponent(
      /**
      * The rootComponent to set
      */
    oRootComponent: typings.openui5.sapUiCoreUicomponentMod.default
    ): this.type = js.native
  }
  
  trait ApplicationSettings
    extends StObject
       with ManagedObjectSettings {
    
    var config: js.UndefOr[Any | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    var root: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    var rootComponent: js.UndefOr[typings.openui5.sapUiCoreUicomponentMod.default] = js.undefined
  }
  object ApplicationSettings {
    
    inline def apply(): ApplicationSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApplicationSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ApplicationSettings] (val x: Self) extends AnyVal {
      
      inline def setConfig(value: Any | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setRoot(value: String | PropertyBindingInfo): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootComponent(value: typings.openui5.sapUiCoreUicomponentMod.default): Self = StObject.set(x, "rootComponent", value.asInstanceOf[js.Any])
      
      inline def setRootComponentUndefined: Self = StObject.set(x, "rootComponent", js.undefined)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
