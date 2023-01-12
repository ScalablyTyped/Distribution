package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content556` extends StObject {
  
  /** Response */
  var `200`: Content556
  
  /** Repository is public or secret scanning is disabled for the repository */
  var `404`: Any
  
  var `503`: ContentApplicationjsonCodeDocumentationurlMessage
}
object `200Content556` {
  
  inline def apply(`200`: Content556, `404`: Any, `503`: ContentApplicationjsonCodeDocumentationurlMessage): `200Content556` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("503")(`503`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content556`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content556`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content556): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Any): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set503(value: ContentApplicationjsonCodeDocumentationurlMessage): Self = StObject.set(x, "503", value.asInstanceOf[js.Any])
  }
}
