package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjson594` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjson594
  
  var `304`: Any
  
  var `422`: Content421
  
  var `503`: ContentApplicationjsonCodeDocumentationurlMessage
}
object `200ContentApplicationjson594` {
  
  inline def apply(
    `200`: ContentApplicationjson594,
    `304`: Any,
    `422`: Content421,
    `503`: ContentApplicationjsonCodeDocumentationurlMessage
  ): `200ContentApplicationjson594` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.updateDynamic("503")(`503`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjson594`]
  }
  
  extension [Self <: `200ContentApplicationjson594`](x: Self) {
    
    inline def set200(value: ContentApplicationjson594): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set304(value: Any): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content421): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
    
    inline def set503(value: ContentApplicationjsonCodeDocumentationurlMessage): Self = StObject.set(x, "503", value.asInstanceOf[js.Any])
  }
}
