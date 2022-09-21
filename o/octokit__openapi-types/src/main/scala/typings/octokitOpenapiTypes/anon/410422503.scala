package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `410422503` extends StObject {
  
  /** Response */
  var `201`: ContentApplicationjsonBodyhtml
  
  var `403`: Content55
  
  var `404`: Content55
  
  var `410`: Content55
  
  var `422`: Content421
  
  var `503`: ContentApplicationjsonCodeDocumentationurlMessage
}
object `410422503` {
  
  inline def apply(
    `201`: ContentApplicationjsonBodyhtml,
    `403`: Content55,
    `404`: Content55,
    `410`: Content55,
    `422`: Content421,
    `503`: ContentApplicationjsonCodeDocumentationurlMessage
  ): `410422503` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("410")(`410`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.updateDynamic("503")(`503`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`410422503`]
  }
  
  extension [Self <: `410422503`](x: Self) {
    
    inline def set201(value: ContentApplicationjsonBodyhtml): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content55): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content55): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set410(value: Content55): Self = StObject.set(x, "410", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content421): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
    
    inline def set503(value: ContentApplicationjsonCodeDocumentationurlMessage): Self = StObject.set(x, "503", value.asInstanceOf[js.Any])
  }
}
