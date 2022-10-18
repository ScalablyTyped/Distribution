package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonAnalysesurl` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonAnalysesurl
  
  var `403`: Content6
  
  /** Not Found if the sarif id does not match any upload */
  var `404`: Any
  
  var `503`: ContentApplicationjsonCodeDocumentationurl
}
object `200ContentApplicationjsonAnalysesurl` {
  
  inline def apply(
    `200`: ContentApplicationjsonAnalysesurl,
    `403`: Content6,
    `404`: Any,
    `503`: ContentApplicationjsonCodeDocumentationurl
  ): `200ContentApplicationjsonAnalysesurl` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("503")(`503`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonAnalysesurl`]
  }
  
  extension [Self <: `200ContentApplicationjsonAnalysesurl`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonAnalysesurl): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content6): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Any): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set503(value: ContentApplicationjsonCodeDocumentationurl): Self = StObject.set(x, "503", value.asInstanceOf[js.Any])
  }
}
