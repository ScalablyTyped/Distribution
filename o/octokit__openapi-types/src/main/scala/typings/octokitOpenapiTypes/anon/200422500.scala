package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200422500` extends StObject {
  
  /** Response */
  var `200`: Content171
  
  var `422`: Content8
  
  var `500`: Content6
  
  var `503`: ContentApplicationjsonCodeDocumentationurl
}
object `200422500` {
  
  inline def apply(
    `200`: Content171,
    `422`: Content8,
    `500`: Content6,
    `503`: ContentApplicationjsonCodeDocumentationurl
  ): `200422500` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.updateDynamic("500")(`500`.asInstanceOf[js.Any])
    __obj.updateDynamic("503")(`503`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200422500`]
  }
  
  extension [Self <: `200422500`](x: Self) {
    
    inline def set200(value: Content171): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content8): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
    
    inline def set500(value: Content6): Self = StObject.set(x, "500", value.asInstanceOf[js.Any])
    
    inline def set503(value: ContentApplicationjsonCodeDocumentationurl): Self = StObject.set(x, "503", value.asInstanceOf[js.Any])
  }
}
