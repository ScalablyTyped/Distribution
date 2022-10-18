package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200400` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonConfirmdeleteurl
  
  var `400`: ContentApplicationjsonApplicationscimjson
  
  var `403`: Content6
  
  var `404`: Content6
  
  var `503`: ContentApplicationjsonCodeDocumentationurl
}
object `200400` {
  
  inline def apply(
    `200`: ContentApplicationjsonConfirmdeleteurl,
    `400`: ContentApplicationjsonApplicationscimjson,
    `403`: Content6,
    `404`: Content6,
    `503`: ContentApplicationjsonCodeDocumentationurl
  ): `200400` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("400")(`400`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("503")(`503`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200400`]
  }
  
  extension [Self <: `200400`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonConfirmdeleteurl): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set400(value: ContentApplicationjsonApplicationscimjson): Self = StObject.set(x, "400", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content6): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content6): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set503(value: ContentApplicationjsonCodeDocumentationurl): Self = StObject.set(x, "503", value.asInstanceOf[js.Any])
  }
}
