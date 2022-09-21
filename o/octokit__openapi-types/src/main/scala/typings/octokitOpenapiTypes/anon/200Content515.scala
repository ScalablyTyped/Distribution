package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content515` extends StObject {
  
  /** Response */
  var `200`: Content515
  
  var `403`: Content55
  
  var `404`: Content55
  
  var `503`: ContentApplicationjsonCodeDocumentationurlMessage
}
object `200Content515` {
  
  inline def apply(
    `200`: Content515,
    `403`: Content55,
    `404`: Content55,
    `503`: ContentApplicationjsonCodeDocumentationurlMessage
  ): `200Content515` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("503")(`503`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content515`]
  }
  
  extension [Self <: `200Content515`](x: Self) {
    
    inline def set200(value: Content515): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content55): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content55): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set503(value: ContentApplicationjsonCodeDocumentationurlMessage): Self = StObject.set(x, "503", value.asInstanceOf[js.Any])
  }
}
