package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `404413` extends StObject {
  
  /** Response */
  var `202`: ContentApplicationjson518
  
  /** Bad Request if the sarif field is invalid */
  var `400`: Any
  
  var `403`: Content55
  
  var `404`: Content55
  
  /** Payload Too Large if the sarif field is too large */
  var `413`: Any
  
  var `503`: ContentApplicationjsonCodeDocumentationurlMessage
}
object `404413` {
  
  inline def apply(
    `202`: ContentApplicationjson518,
    `400`: Any,
    `403`: Content55,
    `404`: Content55,
    `413`: Any,
    `503`: ContentApplicationjsonCodeDocumentationurlMessage
  ): `404413` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("202")(`202`.asInstanceOf[js.Any])
    __obj.updateDynamic("400")(`400`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("413")(`413`.asInstanceOf[js.Any])
    __obj.updateDynamic("503")(`503`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`404413`]
  }
  
  extension [Self <: `404413`](x: Self) {
    
    inline def set202(value: ContentApplicationjson518): Self = StObject.set(x, "202", value.asInstanceOf[js.Any])
    
    inline def set400(value: Any): Self = StObject.set(x, "400", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content55): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content55): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set413(value: Any): Self = StObject.set(x, "413", value.asInstanceOf[js.Any])
    
    inline def set503(value: ContentApplicationjsonCodeDocumentationurlMessage): Self = StObject.set(x, "503", value.asInstanceOf[js.Any])
  }
}
