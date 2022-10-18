package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HandleValidation extends StObject {
  
  /**
    * List of active terminologies. The order of the given active terminologies is significant. The {@link
    * module:sap/base/i18n/ResourceBundle ResourceBundle} API documentation describes the processing behavior
    * in more detail. Please also have a look at this dev-guide chapter for general usage instructions: {@link
    * topic:eba8d25a31ef416ead876e091e67824e Text Verticalization}.
    */
  var activeTerminologies: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Indicates whether the Component creation should be done asynchronously; defaults to true when using the
    * manifest property with a truthy value otherwise the default is false (experimental setting)
    */
  var async: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @since 1.27.0 Hints for the asynchronous loading. **Beware:** This parameter is only used internally
    * by the UI5 framework and compatibility cannot be guaranteed. The parameter must not be used in productive
    * code, except in code delivered by the UI5 teams.
    */
  var asyncHints: js.UndefOr[WaitFor] = js.undefined
  
  /**
    * Initial data of the Component (@see sap.ui.core.Component#getComponentData)
    */
  var componentData: js.UndefOr[js.Object] = js.undefined
  
  /**
    * If set to `true` validation of the component is handled by the `MessageManager`
    */
  var handleValidation: js.UndefOr[String] = js.undefined
  
  /**
    * sId of the new Component
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * @since 1.49.0 Controls when and from where to load the manifest for the Component. When set to any truthy
    * value, the manifest will be loaded asynchronously by default and evaluated before the Component controller,
    * if it is set to a falsy value other than `undefined`, the manifest will be loaded after the controller.
    * A non-empty string value will be interpreted as the URL location from where to load the manifest. A non-null
    * object value will be interpreted as manifest content. Setting this property to a value other than `undefined`,
    * completely deactivates the properties `manifestUrl` and `manifestFirst`, no matter what their values
    * are.
    */
  var manifest: js.UndefOr[Boolean | String | js.Object] = js.undefined
  
  /**
    * @since 1.33.0 defines whether the manifest is loaded before or after the Component controller. Defaults
    * to `sap.ui.getCore().getConfiguration().getManifestFirst()`
    * **DEPRECATED since 1.49.0, use `vConfig.manifest=true|false` instead!** Note that this property is ignored
    * when `vConfig.manifest` has a value other than `undefined`.
    */
  var manifestFirst: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @since 1.33.0 Specifies the URL from where the manifest should be loaded from Using this property implies
    * `vConfig.manifestFirst=true`.
    * **DEPRECATED since 1.49.0, use `vConfig.manifest=url` instead!**. Note that this property is ignored
    * when `vConfig.manifest` has a value other than `undefined`.
    */
  var manifestUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the Component to load, as a dot-separated name; Even when an alternative location is specified
    * from which the manifest should be loaded (e.g. `vConfig.manifest` is set to a non-empty string), then
    * the name specified in that manifest will be ignored and this name will be used instead to determine the
    * module to be loaded.
    */
  var name: String
  
  /**
    * Settings of the new Component
    */
  var settings: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Alternative location from where to load the Component. If a `manifestUrl` is given, this URL specifies
    * the location of the final component defined via that manifest, otherwise it specifies the location of
    * the component defined via its name `vConfig.name`.
    */
  var url: js.UndefOr[String] = js.undefined
}
object HandleValidation {
  
  inline def apply(name: String): HandleValidation = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandleValidation]
  }
  
  extension [Self <: HandleValidation](x: Self) {
    
    inline def setActiveTerminologies(value: js.Array[String]): Self = StObject.set(x, "activeTerminologies", value.asInstanceOf[js.Any])
    
    inline def setActiveTerminologiesUndefined: Self = StObject.set(x, "activeTerminologies", js.undefined)
    
    inline def setActiveTerminologiesVarargs(value: String*): Self = StObject.set(x, "activeTerminologies", js.Array(value*))
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setAsyncHints(value: WaitFor): Self = StObject.set(x, "asyncHints", value.asInstanceOf[js.Any])
    
    inline def setAsyncHintsUndefined: Self = StObject.set(x, "asyncHints", js.undefined)
    
    inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    inline def setComponentData(value: js.Object): Self = StObject.set(x, "componentData", value.asInstanceOf[js.Any])
    
    inline def setComponentDataUndefined: Self = StObject.set(x, "componentData", js.undefined)
    
    inline def setHandleValidation(value: String): Self = StObject.set(x, "handleValidation", value.asInstanceOf[js.Any])
    
    inline def setHandleValidationUndefined: Self = StObject.set(x, "handleValidation", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setManifest(value: Boolean | String | js.Object): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
    
    inline def setManifestFirst(value: Boolean): Self = StObject.set(x, "manifestFirst", value.asInstanceOf[js.Any])
    
    inline def setManifestFirstUndefined: Self = StObject.set(x, "manifestFirst", js.undefined)
    
    inline def setManifestUndefined: Self = StObject.set(x, "manifest", js.undefined)
    
    inline def setManifestUrl(value: String): Self = StObject.set(x, "manifestUrl", value.asInstanceOf[js.Any])
    
    inline def setManifestUrlUndefined: Self = StObject.set(x, "manifestUrl", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSettings(value: js.Object): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
