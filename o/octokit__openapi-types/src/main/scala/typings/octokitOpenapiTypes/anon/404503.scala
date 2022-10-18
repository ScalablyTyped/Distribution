package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `404503` extends StObject {
  
  /** Response */
  var `200`: Content16
  
  var `404`: Content6
  
  var `503`: ContentApplicationjsonCodeDocumentationurl
}
object `404503` {
  
  inline def apply(`200`: Content16, `404`: Content6, `503`: ContentApplicationjsonCodeDocumentationurl): `404503` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("503")(`503`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`404503`]
  }
  
  extension [Self <: `404503`](x: Self) {
    
    inline def set200(value: Content16): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content6): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set503(value: ContentApplicationjsonCodeDocumentationurl): Self = StObject.set(x, "503", value.asInstanceOf[js.Any])
  }
}
