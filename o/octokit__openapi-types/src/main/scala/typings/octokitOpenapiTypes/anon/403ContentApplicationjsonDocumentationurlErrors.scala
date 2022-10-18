package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `403ContentApplicationjsonDocumentationurlErrors` extends StObject {
  
  var `304`: Any
  
  var `401`: Content6
  
  /** Forbidden */
  var `403`: ContentApplicationjsonDocumentationurlErrors
  
  var `404`: Content6
}
object `403ContentApplicationjsonDocumentationurlErrors` {
  
  inline def apply(`304`: Any, `401`: Content6, `403`: ContentApplicationjsonDocumentationurlErrors, `404`: Content6): `403ContentApplicationjsonDocumentationurlErrors` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.updateDynamic("401")(`401`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`403ContentApplicationjsonDocumentationurlErrors`]
  }
  
  extension [Self <: `403ContentApplicationjsonDocumentationurlErrors`](x: Self) {
    
    inline def set304(value: Any): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
    
    inline def set401(value: Content6): Self = StObject.set(x, "401", value.asInstanceOf[js.Any])
    
    inline def set403(value: ContentApplicationjsonDocumentationurlErrors): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content6): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
