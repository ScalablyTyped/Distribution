package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentName extends StObject {
  
  /**
    * A list of active terminologies. The order of the given active terminologies is significant. The {@link
    * module:sap/base/i18n/ResourceBundle ResourceBundle} API documentation describes the processing behavior
    * in more detail. Please have a look at this dev-guide chapter for general usage instructions: {@link topic:eba8d25a31ef416ead876e091e67824e
    * Text Verticalization}.
    */
  var activeTerminologies: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Flag whether to load the manifest async or not
    */
  var async: js.UndefOr[Boolean] = js.undefined
  
  /**
    * name of the component
    */
  var componentName: js.UndefOr[String] = js.undefined
  
  /**
    * Flag whether to fail if an error occurs or not If set to `false`, errors during the loading of the manifest.json
    * file (e.g. 404) will be ignored and the resulting manifest object will be `null`. For asynchronous calls
    * the returned Promise will not reject but resolve with `null`.
    */
  var failOnError: js.UndefOr[Boolean] = js.undefined
  
  /**
    * URL of the manifest
    */
  var manifestUrl: String
  
  /**
    * Callback for asynchronous processing of the loaded manifest. The callback receives the parsed manifest
    * object and must return a Promise which resolves with an object. It allows to early access and modify
    * the manifest object.
    */
  var processJson: js.UndefOr[js.Function] = js.undefined
}
object ComponentName {
  
  inline def apply(manifestUrl: String): ComponentName = {
    val __obj = js.Dynamic.literal(manifestUrl = manifestUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComponentName] (val x: Self) extends AnyVal {
    
    inline def setActiveTerminologies(value: js.Array[String]): Self = StObject.set(x, "activeTerminologies", value.asInstanceOf[js.Any])
    
    inline def setActiveTerminologiesUndefined: Self = StObject.set(x, "activeTerminologies", js.undefined)
    
    inline def setActiveTerminologiesVarargs(value: String*): Self = StObject.set(x, "activeTerminologies", js.Array(value*))
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    inline def setComponentName(value: String): Self = StObject.set(x, "componentName", value.asInstanceOf[js.Any])
    
    inline def setComponentNameUndefined: Self = StObject.set(x, "componentName", js.undefined)
    
    inline def setFailOnError(value: Boolean): Self = StObject.set(x, "failOnError", value.asInstanceOf[js.Any])
    
    inline def setFailOnErrorUndefined: Self = StObject.set(x, "failOnError", js.undefined)
    
    inline def setManifestUrl(value: String): Self = StObject.set(x, "manifestUrl", value.asInstanceOf[js.Any])
    
    inline def setProcessJson(value: js.Function): Self = StObject.set(x, "processJson", value.asInstanceOf[js.Any])
    
    inline def setProcessJsonUndefined: Self = StObject.set(x, "processJson", js.undefined)
  }
}
