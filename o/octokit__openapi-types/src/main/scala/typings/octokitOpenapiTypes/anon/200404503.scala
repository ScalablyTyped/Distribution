package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200404503` extends StObject {
  
  /** Response */
  var `200`: Content181
  
  /** Repository is public or secret scanning is disabled for the repository */
  var `404`: Any
  
  var `503`: ContentApplicationjsonCodeDocumentationurl
}
object `200404503` {
  
  inline def apply(`200`: Content181, `404`: Any, `503`: ContentApplicationjsonCodeDocumentationurl): `200404503` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("503")(`503`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200404503`]
  }
  
  extension [Self <: `200404503`](x: Self) {
    
    inline def set200(value: Content181): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Any): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set503(value: ContentApplicationjsonCodeDocumentationurl): Self = StObject.set(x, "503", value.asInstanceOf[js.Any])
  }
}
