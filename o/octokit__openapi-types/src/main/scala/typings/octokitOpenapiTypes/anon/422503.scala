package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `422503` extends StObject {
  
  /** Response */
  var `201`: Content4
  
  var `304`: Any
  
  var `401`: Content6
  
  /** Forbidden */
  var `403`: ContentApplicationjsonErrorsMessage
  
  var `422`: Content8
  
  /** Response */
  var `503`: ContentApplicationjsonCodeDocumentationurlErrors
}
object `422503` {
  
  inline def apply(
    `201`: Content4,
    `304`: Any,
    `401`: Content6,
    `403`: ContentApplicationjsonErrorsMessage,
    `422`: Content8,
    `503`: ContentApplicationjsonCodeDocumentationurlErrors
  ): `422503` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.updateDynamic("401")(`401`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.updateDynamic("503")(`503`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`422503`]
  }
  
  extension [Self <: `422503`](x: Self) {
    
    inline def set201(value: Content4): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set304(value: Any): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
    
    inline def set401(value: Content6): Self = StObject.set(x, "401", value.asInstanceOf[js.Any])
    
    inline def set403(value: ContentApplicationjsonErrorsMessage): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content8): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
    
    inline def set503(value: ContentApplicationjsonCodeDocumentationurlErrors): Self = StObject.set(x, "503", value.asInstanceOf[js.Any])
  }
}
