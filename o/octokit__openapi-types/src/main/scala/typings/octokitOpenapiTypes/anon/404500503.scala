package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `404500503` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonBasecommit
  
  var `404`: Content48
  
  var `500`: Content48
  
  var `503`: ContentApplicationjsonCodeDocumentationurlMessage
}
object `404500503` {
  
  inline def apply(
    `200`: ContentApplicationjsonBasecommit,
    `404`: Content48,
    `500`: Content48,
    `503`: ContentApplicationjsonCodeDocumentationurlMessage
  ): `404500503` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("500")(`500`.asInstanceOf[js.Any])
    __obj.updateDynamic("503")(`503`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`404500503`]
  }
  
  extension [Self <: `404500503`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonBasecommit): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content48): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set500(value: Content48): Self = StObject.set(x, "500", value.asInstanceOf[js.Any])
    
    inline def set503(value: ContentApplicationjsonCodeDocumentationurlMessage): Self = StObject.set(x, "503", value.asInstanceOf[js.Any])
  }
}
