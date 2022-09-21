package typings.oclazyload

import typings.angular.mod.IPromise
import typings.angular.mod.IRequestShortcutConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object oc {
  
  @js.native
  trait ILazyLoad extends StObject {
    
    /**
      * Gets the specified module config object.
      * @param name The name of the module config object to get
      */
    def getModuleConfig(name: String): IModuleConfig = js.native
    
    /**
      * Gets the list of loaded module names.
      */
    def getModules(): js.Array[String] = js.native
    
    /**
      * Injects a module with the associated name into Angular. Useful for manual injection when loading through RequireJS, SystemJS, etc. Useful in
      * conjunction with the toggleWatch() method.
      */
    def inject(moduleName: String): IPromise[Any] = js.native
    def inject(moduleName: js.Array[String]): IPromise[Any] = js.native
    
    /**
      * Checks if a module name, or list of modules names, has been previously loaded into Angular.
      */
    def isLoaded(moduleName: String): Boolean = js.native
    def isLoaded(moduleName: js.Array[String]): Boolean = js.native
    
    /**
      * Loads a module or a list of modules into Angular.
      *
      * @param module The name of a predefined module config object, or a module config object, or an array of either
      * @param config Options to be used when loading the modules
      */
    def load(module: String): IPromise[Any] = js.native
    def load(module: String, config: IOptionsConfig): IPromise[Any] = js.native
    def load(module: js.Array[String | ITypedModuleConfig | IModuleConfig]): IPromise[Any] = js.native
    def load(module: js.Array[String | ITypedModuleConfig | IModuleConfig], config: IOptionsConfig): IPromise[Any] = js.native
    def load(module: IModuleConfig): IPromise[Any] = js.native
    def load(module: IModuleConfig, config: IOptionsConfig): IPromise[Any] = js.native
    def load(module: ITypedModuleConfig): IPromise[Any] = js.native
    def load(module: ITypedModuleConfig, config: IOptionsConfig): IPromise[Any] = js.native
    
    /**
      * Defines a module config object.
      * @param config The module config object
      * @returns The module config object that was passed in
      */
    def setModuleConfig(config: IModuleConfig): IModuleConfig = js.native
    
    /**
      * Enables or disables watching Angular for new modules. Useful in conjunction with the inject() method. Make sure to not keep the watch enabled
      * indefinitely, or unexpected results may occur.
      */
    def toggleWatch(watch: Boolean): Unit = js.native
  }
  
  trait ILazyLoadProvider extends StObject {
    
    /**
      * Configures the main service provider.
      * @param config The configuration settings to use
      */
    def config(config: IProviderConfig): Unit
  }
  object ILazyLoadProvider {
    
    inline def apply(config: IProviderConfig => Unit): ILazyLoadProvider = {
      val __obj = js.Dynamic.literal(config = js.Any.fromFunction1(config))
      __obj.asInstanceOf[ILazyLoadProvider]
    }
    
    extension [Self <: ILazyLoadProvider](x: Self) {
      
      inline def setConfig(value: IProviderConfig => Unit): Self = StObject.set(x, "config", js.Any.fromFunction1(value))
    }
  }
  
  trait IModuleConfig
    extends StObject
       with IOptionsConfig {
    
    /**
      * The list of files to be loaded for this module.
      */
    var files: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The name of the module for easy retrieval later.
      */
    var name: js.UndefOr[String] = js.undefined
  }
  object IModuleConfig {
    
    inline def apply(): IModuleConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IModuleConfig]
    }
    
    extension [Self <: IModuleConfig](x: Self) {
      
      inline def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait IOptionsConfig
    extends StObject
       with IRequestShortcutConfig {
    
    /**
      * If true, bypasses browser cache by appending a timestamp to URLs. Defaults to true.
      */
    @JSName("cache")
    var cache_IOptionsConfig: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If set, will insert files immediately before the provided CSS selector, instead of the default behavior of inserting files immediately before the
      * last child of the <head> element. Defaults to undefined.
      */
    var insertBefore: js.UndefOr[String] = js.undefined
    
    /**
      * If true, a module config will be invoked each time the module is reloaded. Use with caution, as re-invoking configs can lead to unexpected results.
      * Defaults to false.
      */
    var reconfig: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, a module run block will be invoked each time the module is reloaded. Use with caution, as re-invoking run blocks can lead to unexpected results.
      * Defaults to false.
      */
    var rerun: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, will load files in a series, instead of in parallel. Defaults to false.
      */
    var serie: js.UndefOr[Boolean] = js.undefined
  }
  object IOptionsConfig {
    
    inline def apply(): IOptionsConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOptionsConfig]
    }
    
    extension [Self <: IOptionsConfig](x: Self) {
      
      inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setInsertBefore(value: String): Self = StObject.set(x, "insertBefore", value.asInstanceOf[js.Any])
      
      inline def setInsertBeforeUndefined: Self = StObject.set(x, "insertBefore", js.undefined)
      
      inline def setReconfig(value: Boolean): Self = StObject.set(x, "reconfig", value.asInstanceOf[js.Any])
      
      inline def setReconfigUndefined: Self = StObject.set(x, "reconfig", js.undefined)
      
      inline def setRerun(value: Boolean): Self = StObject.set(x, "rerun", value.asInstanceOf[js.Any])
      
      inline def setRerunUndefined: Self = StObject.set(x, "rerun", js.undefined)
      
      inline def setSerie(value: Boolean): Self = StObject.set(x, "serie", value.asInstanceOf[js.Any])
      
      inline def setSerieUndefined: Self = StObject.set(x, "serie", js.undefined)
    }
  }
  
  trait IProviderConfig extends StObject {
    
    /**
      * If true, all errors will be logged to the console, in addition to rejecting a promise. Defaults to false.
      */
    var debug: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, an event will be broadcast whenever a module, component or file is loaded. Events that can be broadcast are: ocLazyLoad.moduleLoaded,
      * ocLazyLoad.moduleReloaded, ocLazyLoad.componentLoaded, ocLazyLoad.fileLoaded. Defaults to false.
      */
    var events: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Predefines a set of module configurations for later use. A name must be provided for each module so that it can be retrieved later.
      */
    var modules: js.UndefOr[js.Array[IModuleConfig]] = js.undefined
  }
  object IProviderConfig {
    
    inline def apply(): IProviderConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IProviderConfig]
    }
    
    extension [Self <: IProviderConfig](x: Self) {
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setEvents(value: Boolean): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setModules(value: js.Array[IModuleConfig]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      inline def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
      
      inline def setModulesVarargs(value: IModuleConfig*): Self = StObject.set(x, "modules", js.Array(value*))
    }
  }
  
  trait ITypedModuleConfig
    extends StObject
       with IOptionsConfig {
    
    /**
      * The file path, including file name.
      */
    var path: String
    
    /**
      * The file extension, without the period. For example, 'html'.
      */
    var `type`: String
  }
  object ITypedModuleConfig {
    
    inline def apply(path: String, `type`: String): ITypedModuleConfig = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITypedModuleConfig]
    }
    
    extension [Self <: ITypedModuleConfig](x: Self) {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
