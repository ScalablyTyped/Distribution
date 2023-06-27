package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201400403` extends StObject {
  
  /** @description Response */
  var `201`: ContentApplicationjsonBodyhtml
  
  var `400`: ContentApplicationjsonApplicationscimjson
  
  var `403`: Content41
  
  var `404`: Content41
  
  var `410`: Content41
  
  var `422`: Content414
  
  var `503`: ContentApplicationjsonCodeDocumentationurlMessage
}
object `201400403` {
  
  inline def apply(
    `201`: ContentApplicationjsonBodyhtml,
    `400`: ContentApplicationjsonApplicationscimjson,
    `403`: Content41,
    `404`: Content41,
    `410`: Content41,
    `422`: Content414,
    `503`: ContentApplicationjsonCodeDocumentationurlMessage
  ): `201400403` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("400")(`400`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("410")(`410`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.updateDynamic("503")(`503`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201400403`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `201400403`] (val x: Self) extends AnyVal {
    
    inline def set201(value: ContentApplicationjsonBodyhtml): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set400(value: ContentApplicationjsonApplicationscimjson): Self = StObject.set(x, "400", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content41): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content41): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set410(value: Content41): Self = StObject.set(x, "410", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content414): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
    
    inline def set503(value: ContentApplicationjsonCodeDocumentationurlMessage): Self = StObject.set(x, "503", value.asInstanceOf[js.Any])
  }
}
