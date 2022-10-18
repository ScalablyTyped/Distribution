package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncHints extends StObject {
  
  /**
    * @since 1.61.0 Alternative URL for the manifest.json. If `mOptions.manifest` is set to an object value,
    * this URL specifies the location to which the manifest object should resolve the relative URLs to.
    */
  var altManifestUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Hints for asynchronous loading. **Beware:** This parameter is only used internally by the UI5 framework
    * and compatibility cannot be guaranteed. The parameter must not be used in productive code, except in
    * code delivered by the UI5 teams.
    */
  var asyncHints: js.UndefOr[PreloadBundles] = js.undefined
  
  /**
    * Whether and from where to load the manifest.json for the Component. When set to a truthy value, the manifest
    * will be loaded and evaluated **before** the Component controller. When set to a falsy value, the manifest
    * will be loaded and evaluated **after** the Component controller. A non-empty string value will be interpreted
    * as the URL to load the manifest from. This implies that the manifest is loaded and evaluated **before**
    * the Component controller. A non-null object value will be interpreted as manifest content.
    */
  var manifest: js.UndefOr[Boolean | String | js.Object] = js.undefined
  
  /**
    * Name of the Component to load, as a dot-separated name; Even when an alternative location is specified
    * from which the manifest should be loaded (`mOptions.manifest` is set to a non-empty string), then the
    * name specified in that manifest will be ignored and this name will be used instead to determine the module
    * to be loaded.
    */
  var name: String
  
  /**
    * Alternative location from where to load the Component. If `mOptions.manifest` is set to a non-empty string,
    * this URL specifies the location of the final component defined via that manifest, otherwise it specifies
    * the location of the component defined via its name `mOptions.name`.
    */
  var url: js.UndefOr[String] = js.undefined
}
object AsyncHints {
  
  inline def apply(name: String): AsyncHints = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncHints]
  }
  
  extension [Self <: AsyncHints](x: Self) {
    
    inline def setAltManifestUrl(value: String): Self = StObject.set(x, "altManifestUrl", value.asInstanceOf[js.Any])
    
    inline def setAltManifestUrlUndefined: Self = StObject.set(x, "altManifestUrl", js.undefined)
    
    inline def setAsyncHints(value: PreloadBundles): Self = StObject.set(x, "asyncHints", value.asInstanceOf[js.Any])
    
    inline def setAsyncHintsUndefined: Self = StObject.set(x, "asyncHints", js.undefined)
    
    inline def setManifest(value: Boolean | String | js.Object): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
    
    inline def setManifestUndefined: Self = StObject.set(x, "manifest", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
