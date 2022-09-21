package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `404ContentApplicationjsonDocumentationurlMessage` extends StObject {
  
  /** Otherwise a `404` status code is returned. */
  var `404`: ContentApplicationjsonDocumentationurlMessage
}
object `404ContentApplicationjsonDocumentationurlMessage` {
  
  inline def apply(`404`: ContentApplicationjsonDocumentationurlMessage): `404ContentApplicationjsonDocumentationurlMessage` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`404ContentApplicationjsonDocumentationurlMessage`]
  }
  
  extension [Self <: `404ContentApplicationjsonDocumentationurlMessage`](x: Self) {
    
    inline def set404(value: ContentApplicationjsonDocumentationurlMessage): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
