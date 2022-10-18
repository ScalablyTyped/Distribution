package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `403ContentApplicationjsonDocumentationurlMessage404Content6` extends StObject {
  
  /** Forbidden if the project is not owned by the organization */
  var `403`: ContentApplicationjsonDocumentationurlMessage
  
  var `404`: Content6
  
  var `422`: Content8
}
object `403ContentApplicationjsonDocumentationurlMessage404Content6` {
  
  inline def apply(`403`: ContentApplicationjsonDocumentationurlMessage, `404`: Content6, `422`: Content8): `403ContentApplicationjsonDocumentationurlMessage404Content6` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`403ContentApplicationjsonDocumentationurlMessage404Content6`]
  }
  
  extension [Self <: `403ContentApplicationjsonDocumentationurlMessage404Content6`](x: Self) {
    
    inline def set403(value: ContentApplicationjsonDocumentationurlMessage): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content6): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content8): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
