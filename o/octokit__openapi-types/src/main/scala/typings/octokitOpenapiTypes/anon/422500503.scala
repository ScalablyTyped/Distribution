package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `422500503` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonAuthorCommentsurl
  
  var `404`: Content41
  
  var `422`: Content414
  
  var `500`: Content41
  
  var `503`: ContentApplicationjsonCodeDocumentationurlMessage
}
object `422500503` {
  
  inline def apply(
    `200`: ContentApplicationjsonAuthorCommentsurl,
    `404`: Content41,
    `422`: Content414,
    `500`: Content41,
    `503`: ContentApplicationjsonCodeDocumentationurlMessage
  ): `422500503` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.updateDynamic("500")(`500`.asInstanceOf[js.Any])
    __obj.updateDynamic("503")(`503`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`422500503`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `422500503`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonAuthorCommentsurl): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content41): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content414): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
    
    inline def set500(value: Content41): Self = StObject.set(x, "500", value.asInstanceOf[js.Any])
    
    inline def set503(value: ContentApplicationjsonCodeDocumentationurlMessage): Self = StObject.set(x, "503", value.asInstanceOf[js.Any])
  }
}
