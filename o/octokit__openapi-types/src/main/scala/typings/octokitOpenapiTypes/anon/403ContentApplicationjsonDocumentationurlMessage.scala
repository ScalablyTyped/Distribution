package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `403ContentApplicationjsonDocumentationurlMessage` extends StObject {
  
  /** Forbidden if the project is not owned by the organization */
  var `403`: ContentApplicationjsonDocumentationurlMessage
}
object `403ContentApplicationjsonDocumentationurlMessage` {
  
  inline def apply(`403`: ContentApplicationjsonDocumentationurlMessage): `403ContentApplicationjsonDocumentationurlMessage` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`403ContentApplicationjsonDocumentationurlMessage`]
  }
  
  extension [Self <: `403ContentApplicationjsonDocumentationurlMessage`](x: Self) {
    
    inline def set403(value: ContentApplicationjsonDocumentationurlMessage): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
  }
}
