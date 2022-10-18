package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseUrl extends StObject {
  
  /**
    * (optional) A list of active terminologies. If the `mOptions.process` flag is set to `true`, the given
    * terminologies will be respected when replacing placeholders with resource bundle values. To use active
    * terminologies, the `sap.app.i18n` section in the manifest must be defined in object syntax as described
    * here: {@link topic:eba8d25a31ef416ead876e091e67824e Text Verticalization}. The order of the given active
    * terminologies is significant. The {@link module:sap/base/i18n/ResourceBundle ResourceBundle} API documentation
    * describes the processing behavior in more detail.
    */
  var activeTerminologies: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * (optional) the base URL which is used to resolve relative URLs against
    */
  var baseUrl: js.UndefOr[String] = js.undefined
  
  /**
    * (optional) the name of the component
    */
  var componentName: js.UndefOr[String] = js.undefined
  
  /**
    * (optional) Flag whether the manifest object should be processed or not which means that the placeholders
    * will be replaced with resource bundle values
    */
  var process: js.UndefOr[Boolean] = js.undefined
}
object BaseUrl {
  
  inline def apply(): BaseUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseUrl]
  }
  
  extension [Self <: BaseUrl](x: Self) {
    
    inline def setActiveTerminologies(value: js.Array[String]): Self = StObject.set(x, "activeTerminologies", value.asInstanceOf[js.Any])
    
    inline def setActiveTerminologiesUndefined: Self = StObject.set(x, "activeTerminologies", js.undefined)
    
    inline def setActiveTerminologiesVarargs(value: String*): Self = StObject.set(x, "activeTerminologies", js.Array(value*))
    
    inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
    
    inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
    
    inline def setComponentName(value: String): Self = StObject.set(x, "componentName", value.asInstanceOf[js.Any])
    
    inline def setComponentNameUndefined: Self = StObject.set(x, "componentName", js.undefined)
    
    inline def setProcess(value: Boolean): Self = StObject.set(x, "process", value.asInstanceOf[js.Any])
    
    inline def setProcessUndefined: Self = StObject.set(x, "process", js.undefined)
  }
}
