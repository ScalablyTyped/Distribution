package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `410422503` extends StObject {
  
  /** @description Response */
  var `201`: ContentApplicationjsonBodyhtml
  
  var `403`: Content36
  
  var `404`: Content36
  
  var `410`: Content36
  
  var `422`: Content346
  
  var `503`: ContentApplicationjsonCodeDocumentationurlMessage
}
object `410422503` {
  
  inline def apply(
    `201`: ContentApplicationjsonBodyhtml,
    `403`: Content36,
    `404`: Content36,
    `410`: Content36,
    `422`: Content346,
    `503`: ContentApplicationjsonCodeDocumentationurlMessage
  ): `410422503` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("410")(`410`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.updateDynamic("503")(`503`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`410422503`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `410422503`] (val x: Self) extends AnyVal {
    
    inline def set201(value: ContentApplicationjsonBodyhtml): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content36): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content36): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set410(value: Content36): Self = StObject.set(x, "410", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content346): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
    
    inline def set503(value: ContentApplicationjsonCodeDocumentationurlMessage): Self = StObject.set(x, "503", value.asInstanceOf[js.Any])
  }
}
