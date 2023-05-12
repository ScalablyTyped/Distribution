package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `301403404` extends StObject {
  
  /** @description Response */
  var `200`: `596`
  
  var `301`: Content36
  
  var `403`: Content36
  
  var `404`: Content36
  
  var `410`: Content36
  
  var `422`: Content346
  
  var `503`: ContentApplicationjsonCodeDocumentationurlMessage
}
object `301403404` {
  
  inline def apply(
    `200`: `596`,
    `301`: Content36,
    `403`: Content36,
    `404`: Content36,
    `410`: Content36,
    `422`: Content346,
    `503`: ContentApplicationjsonCodeDocumentationurlMessage
  ): `301403404` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("301")(`301`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("410")(`410`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.updateDynamic("503")(`503`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`301403404`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `301403404`] (val x: Self) extends AnyVal {
    
    inline def set200(value: `596`): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set301(value: Content36): Self = StObject.set(x, "301", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content36): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content36): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set410(value: Content36): Self = StObject.set(x, "410", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content346): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
    
    inline def set503(value: ContentApplicationjsonCodeDocumentationurlMessage): Self = StObject.set(x, "503", value.asInstanceOf[js.Any])
  }
}
