package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200304422503` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonItemsArray
  
  var `304`: Any
  
  var `422`: Content8
  
  var `503`: ContentApplicationjsonCodeDocumentationurl
}
object `200304422503` {
  
  inline def apply(
    `200`: ContentApplicationjsonItemsArray,
    `304`: Any,
    `422`: Content8,
    `503`: ContentApplicationjsonCodeDocumentationurl
  ): `200304422503` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.updateDynamic("503")(`503`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200304422503`]
  }
  
  extension [Self <: `200304422503`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonItemsArray): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set304(value: Any): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content8): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
    
    inline def set503(value: ContentApplicationjsonCodeDocumentationurl): Self = StObject.set(x, "503", value.asInstanceOf[js.Any])
  }
}
