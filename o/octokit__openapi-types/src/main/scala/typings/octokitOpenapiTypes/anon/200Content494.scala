package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content494` extends StObject {
  
  /** Response */
  var `200`: Content494
  
  var `403`: Content48
  
  var `404`: Content48
  
  var `503`: ContentApplicationjsonCodeDocumentationurlMessage
}
object `200Content494` {
  
  inline def apply(
    `200`: Content494,
    `403`: Content48,
    `404`: Content48,
    `503`: ContentApplicationjsonCodeDocumentationurlMessage
  ): `200Content494` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("503")(`503`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content494`]
  }
  
  extension [Self <: `200Content494`](x: Self) {
    
    inline def set200(value: Content494): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content48): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content48): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set503(value: ContentApplicationjsonCodeDocumentationurlMessage): Self = StObject.set(x, "503", value.asInstanceOf[js.Any])
  }
}
