package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsConfig extends StObject {
  
  var jsConfig: Any
  
  var resolvedBaseUrl: js.UndefOr[String] = js.undefined
  
  var useTypeScript: Boolean
}
object JsConfig {
  
  inline def apply(jsConfig: Any, useTypeScript: Boolean): JsConfig = {
    val __obj = js.Dynamic.literal(jsConfig = jsConfig.asInstanceOf[js.Any], useTypeScript = useTypeScript.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsConfig]
  }
  
  extension [Self <: JsConfig](x: Self) {
    
    inline def setJsConfig(value: Any): Self = StObject.set(x, "jsConfig", value.asInstanceOf[js.Any])
    
    inline def setResolvedBaseUrl(value: String): Self = StObject.set(x, "resolvedBaseUrl", value.asInstanceOf[js.Any])
    
    inline def setResolvedBaseUrlUndefined: Self = StObject.set(x, "resolvedBaseUrl", js.undefined)
    
    inline def setUseTypeScript(value: Boolean): Self = StObject.set(x, "useTypeScript", value.asInstanceOf[js.Any])
  }
}
