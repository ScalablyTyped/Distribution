package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `403ContentApplicationjsonDocumentationurlMessage` extends StObject {
  
  /** Response */
  var `201`: Content40
  
  /** Forbidden if the check run is not rerequestable or doesn't belong to the authenticated GitHub App */
  var `403`: ContentApplicationjsonDocumentationurlMessage
  
  var `404`: Content48
  
  /** Validation error if the check run is not rerequestable */
  var `422`: ContentApplicationjsonDocumentationurlMessage
}
object `403ContentApplicationjsonDocumentationurlMessage` {
  
  inline def apply(
    `201`: Content40,
    `403`: ContentApplicationjsonDocumentationurlMessage,
    `404`: Content48,
    `422`: ContentApplicationjsonDocumentationurlMessage
  ): `403ContentApplicationjsonDocumentationurlMessage` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`403ContentApplicationjsonDocumentationurlMessage`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `403ContentApplicationjsonDocumentationurlMessage`] (val x: Self) extends AnyVal {
    
    inline def set201(value: Content40): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set403(value: ContentApplicationjsonDocumentationurlMessage): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content48): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: ContentApplicationjsonDocumentationurlMessage): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
