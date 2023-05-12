package typings.openui5.anon

import typings.openui5.sapUiCoreLibraryMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AltManifestUrl extends StObject {
  
  /**
    * List of active terminologies. The order of the given active terminologies is significant. The {@link
    * module:sap/base/i18n/ResourceBundle ResourceBundle} API documentation describes the processing behavior
    * in more detail. Please have a look at this dev-guide chapter for general usage instructions: {@link topic:eba8d25a31ef416ead876e091e67824e
    * Text Verticalization}.
    */
  var activeTerminologies: js.UndefOr[js.Array[String]] = js.undefined
  
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
  var asyncHints: js.UndefOr[Components] = js.undefined
  
  /**
    * Initial data of the Component, see {@link sap.ui.core.Component#getComponentData}.
    */
  var componentData: js.UndefOr[js.Object] = js.undefined
  
  /**
    * If set to `true` validation of the component is handled by the `MessageManager`
    */
  var handleValidation: js.UndefOr[String] = js.undefined
  
  /**
    * ID of the new Component
    */
  var id: js.UndefOr[ID] = js.undefined
  
  /**
    * Whether and from where to load the manifest.json for the Component. When set to any truthy value, the
    * manifest will be loaded and evaluated before the Component controller. If it is set to a falsy value,
    * the manifest will not be evaluated before the controller. It might still be loaded synchronously if declared
    * in the Component metadata. A non-empty string value will be interpreted as the URL to load the manifest
    * from. If the manifest could not be loaded from a given URL, the Promise returned by the Component.create
    * factory rejects. A non-null object value will be interpreted as manifest content.
    */
  var manifest: js.UndefOr[Boolean | String | js.Object] = js.undefined
  
  /**
    * Name of the component to load, this is the dot-separated name of the package that contains the Component.js
    * module; Even when an alternative location is specified from which the manifest should be loaded (`mOptions.manifest`
    * is set to a non-empty string), then the name specified in that manifest will be ignored and this name
    * will be used instead to determine the module to be loaded.
    */
  var name: String
  
  /**
    * Settings of the new Component
    */
  var settings: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Alternative location from where to load the Component. If `mOptions.manifest` is set to a non-empty string,
    * this URL specifies the location of the final component defined via that manifest, otherwise it specifies
    * the location of the component defined via its name `mOptions.name`.
    */
  var url: js.UndefOr[String] = js.undefined
}
object AltManifestUrl {
  
  inline def apply(name: String): AltManifestUrl = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AltManifestUrl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AltManifestUrl] (val x: Self) extends AnyVal {
    
    inline def setActiveTerminologies(value: js.Array[String]): Self = StObject.set(x, "activeTerminologies", value.asInstanceOf[js.Any])
    
    inline def setActiveTerminologiesUndefined: Self = StObject.set(x, "activeTerminologies", js.undefined)
    
    inline def setActiveTerminologiesVarargs(value: String*): Self = StObject.set(x, "activeTerminologies", js.Array(value*))
    
    inline def setAltManifestUrl(value: String): Self = StObject.set(x, "altManifestUrl", value.asInstanceOf[js.Any])
    
    inline def setAltManifestUrlUndefined: Self = StObject.set(x, "altManifestUrl", js.undefined)
    
    inline def setAsyncHints(value: Components): Self = StObject.set(x, "asyncHints", value.asInstanceOf[js.Any])
    
    inline def setAsyncHintsUndefined: Self = StObject.set(x, "asyncHints", js.undefined)
    
    inline def setComponentData(value: js.Object): Self = StObject.set(x, "componentData", value.asInstanceOf[js.Any])
    
    inline def setComponentDataUndefined: Self = StObject.set(x, "componentData", js.undefined)
    
    inline def setHandleValidation(value: String): Self = StObject.set(x, "handleValidation", value.asInstanceOf[js.Any])
    
    inline def setHandleValidationUndefined: Self = StObject.set(x, "handleValidation", js.undefined)
    
    inline def setId(value: ID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setManifest(value: Boolean | String | js.Object): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
    
    inline def setManifestUndefined: Self = StObject.set(x, "manifest", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSettings(value: js.Object): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
