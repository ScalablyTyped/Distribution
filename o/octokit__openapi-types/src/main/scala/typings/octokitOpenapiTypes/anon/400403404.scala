package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `400403404` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonConfirmdeleteurl
  
  var `400`: ContentApplicationjsonApplicationscimjson
  
  var `403`: Content36
  
  var `404`: Content36
  
  var `503`: ContentApplicationjsonCodeDocumentationurlMessage
}
object `400403404` {
  
  inline def apply(
    `200`: ContentApplicationjsonConfirmdeleteurl,
    `400`: ContentApplicationjsonApplicationscimjson,
    `403`: Content36,
    `404`: Content36,
    `503`: ContentApplicationjsonCodeDocumentationurlMessage
  ): `400403404` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("400")(`400`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("503")(`503`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`400403404`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `400403404`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonConfirmdeleteurl): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set400(value: ContentApplicationjsonApplicationscimjson): Self = StObject.set(x, "400", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content36): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content36): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set503(value: ContentApplicationjsonCodeDocumentationurlMessage): Self = StObject.set(x, "503", value.asInstanceOf[js.Any])
  }
}
