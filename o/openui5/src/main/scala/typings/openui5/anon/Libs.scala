package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Libs extends StObject {
  
  /**
    * a list of components needed by the current component and its subcomponents The framework will try to
    * preload these components (their Component-preload.js) asynchronously, errors will be ignored. Please
    * note that the framework has no knowledge about whether a Component provides a preload file or whether
    * it is bundled in some library preload. If Components are listed in the hints section, they will be preloaded.
    * Instead of specifying just the names of components, an object might be given that contains a mandatory
    * `name` property and optionally, an `url` that will be used for a `registerModulePath`, and/or a `lazy`
    * property. When `lazy` is set to a truthy value, only a necessary `registerModulePath` will be executed,
    * but the corresponding component won't be preloaded.
    */
  var components: js.UndefOr[js.Array[js.Object | String]] = js.undefined
  
  /**
    * libraries needed by the Component and its subcomponents These libraries should be (pre-)loaded before
    * the Component. The framework will asynchronously load those libraries, if they're not loaded yet. Instead
    * of specifying just the names of libraries, an object might be given that contains a mandatory `name`
    * property and optionally, an `url` that will be used for a `registerModulePath`, and/or a `lazy` property.
    * When `lazy` is set to a truthy value, only a necessary `registerModulePath` will be executed, but the
    * corresponding library won't be preloaded.
    */
  var libs: js.UndefOr[js.Array[js.Object | String]] = js.undefined
  
  /**
    * a list of additional preload bundles The framework will try to load these bundles asynchronously before
    * requiring the component, errors will be ignored. The named modules must only represent preload bundles.
    * If they are normal modules, their dependencies will be loaded with the standard module loading mechanism
    * and performance might degrade. Instead of specifying just the names of preload bundles, an object might
    * be given that contains a mandatory `name` property and, optionally, a `url` that will be used for a `registerModulePath`.
    */
  var preloadBundles: js.UndefOr[js.Array[js.Object | String]] = js.undefined
  
  /**
    * Whether only the preloads should be done, but not the loading of the Component controller class itself.
    */
  var preloadOnly: js.UndefOr[Boolean] = js.undefined
}
object Libs {
  
  inline def apply(): Libs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Libs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Libs] (val x: Self) extends AnyVal {
    
    inline def setComponents(value: js.Array[js.Object | String]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    inline def setComponentsVarargs(value: (js.Object | String)*): Self = StObject.set(x, "components", js.Array(value*))
    
    inline def setLibs(value: js.Array[js.Object | String]): Self = StObject.set(x, "libs", value.asInstanceOf[js.Any])
    
    inline def setLibsUndefined: Self = StObject.set(x, "libs", js.undefined)
    
    inline def setLibsVarargs(value: (js.Object | String)*): Self = StObject.set(x, "libs", js.Array(value*))
    
    inline def setPreloadBundles(value: js.Array[js.Object | String]): Self = StObject.set(x, "preloadBundles", value.asInstanceOf[js.Any])
    
    inline def setPreloadBundlesUndefined: Self = StObject.set(x, "preloadBundles", js.undefined)
    
    inline def setPreloadBundlesVarargs(value: (js.Object | String)*): Self = StObject.set(x, "preloadBundles", js.Array(value*))
    
    inline def setPreloadOnly(value: Boolean): Self = StObject.set(x, "preloadOnly", value.asInstanceOf[js.Any])
    
    inline def setPreloadOnlyUndefined: Self = StObject.set(x, "preloadOnly", js.undefined)
  }
}
