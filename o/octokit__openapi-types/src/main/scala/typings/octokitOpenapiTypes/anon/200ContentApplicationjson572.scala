package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjson572` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjson572
  
  var `304`: Any
  
  var `422`: Content397
  
  var `503`: ContentApplicationjsonCodeDocumentationurlMessage
}
object `200ContentApplicationjson572` {
  
  inline def apply(
    `200`: ContentApplicationjson572,
    `304`: Any,
    `422`: Content397,
    `503`: ContentApplicationjsonCodeDocumentationurlMessage
  ): `200ContentApplicationjson572` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.updateDynamic("503")(`503`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjson572`]
  }
  
  extension [Self <: `200ContentApplicationjson572`](x: Self) {
    
    inline def set200(value: ContentApplicationjson572): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set304(value: Any): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content397): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
    
    inline def set503(value: ContentApplicationjsonCodeDocumentationurlMessage): Self = StObject.set(x, "503", value.asInstanceOf[js.Any])
  }
}
