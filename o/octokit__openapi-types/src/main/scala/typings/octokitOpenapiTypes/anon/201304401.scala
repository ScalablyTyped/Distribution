package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201304401` extends StObject {
  
  /** Response */
  var `201`: ContentApplicationjsonColumnurl
  
  var `304`: Any
  
  var `401`: Content6
  
  var `403`: Content6
  
  /** Validation failed */
  var `422`: Content38
  
  /** Response */
  var `503`: ContentApplicationjsonCodeDocumentationurlErrors
}
object `201304401` {
  
  inline def apply(
    `201`: ContentApplicationjsonColumnurl,
    `304`: Any,
    `401`: Content6,
    `403`: Content6,
    `422`: Content38,
    `503`: ContentApplicationjsonCodeDocumentationurlErrors
  ): `201304401` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.updateDynamic("401")(`401`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.updateDynamic("503")(`503`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201304401`]
  }
  
  extension [Self <: `201304401`](x: Self) {
    
    inline def set201(value: ContentApplicationjsonColumnurl): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set304(value: Any): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
    
    inline def set401(value: Content6): Self = StObject.set(x, "401", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content6): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content38): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
    
    inline def set503(value: ContentApplicationjsonCodeDocumentationurlErrors): Self = StObject.set(x, "503", value.asInstanceOf[js.Any])
  }
}
