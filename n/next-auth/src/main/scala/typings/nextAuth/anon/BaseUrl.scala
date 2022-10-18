package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseUrl extends StObject {
  
  /** Default base URL of site (can be used as fallback) */
  var baseUrl: String
  
  /** URL provided as callback URL by the client */
  var url: String
}
object BaseUrl {
  
  inline def apply(baseUrl: String, url: String): BaseUrl = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseUrl]
  }
  
  extension [Self <: BaseUrl](x: Self) {
    
    inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
