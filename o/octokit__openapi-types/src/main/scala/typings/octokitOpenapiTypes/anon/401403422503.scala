package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `401403422503` extends StObject {
  
  /** Response */
  var `201`: Content40
  
  var `304`: Any
  
  var `401`: Content48
  
  /** Forbidden */
  var `403`: ContentApplicationjsonDocumentationurlErrors
  
  var `422`: Content397
  
  /** Response */
  var `503`: ContentApplicationjsonCodeDocumentationurl
}
object `401403422503` {
  
  inline def apply(
    `201`: Content40,
    `304`: Any,
    `401`: Content48,
    `403`: ContentApplicationjsonDocumentationurlErrors,
    `422`: Content397,
    `503`: ContentApplicationjsonCodeDocumentationurl
  ): `401403422503` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.updateDynamic("401")(`401`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.updateDynamic("503")(`503`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`401403422503`]
  }
  
  extension [Self <: `401403422503`](x: Self) {
    
    inline def set201(value: Content40): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set304(value: Any): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
    
    inline def set401(value: Content48): Self = StObject.set(x, "401", value.asInstanceOf[js.Any])
    
    inline def set403(value: ContentApplicationjsonDocumentationurlErrors): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content397): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
    
    inline def set503(value: ContentApplicationjsonCodeDocumentationurl): Self = StObject.set(x, "503", value.asInstanceOf[js.Any])
  }
}
