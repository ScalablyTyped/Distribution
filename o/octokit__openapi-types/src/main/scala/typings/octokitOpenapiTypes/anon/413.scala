package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `413` extends StObject {
  
  /** Response */
  var `202`: ContentApplicationjson106
  
  /** Bad Request if the sarif field is invalid */
  var `400`: Any
  
  var `403`: Content6
  
  var `404`: Content6
  
  /** Payload Too Large if the sarif field is too large */
  var `413`: Any
  
  var `503`: ContentApplicationjsonCodeDocumentationurl
}
object `413` {
  
  inline def apply(
    `202`: ContentApplicationjson106,
    `400`: Any,
    `403`: Content6,
    `404`: Content6,
    `413`: Any,
    `503`: ContentApplicationjsonCodeDocumentationurl
  ): `413` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("202")(`202`.asInstanceOf[js.Any])
    __obj.updateDynamic("400")(`400`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("413")(`413`.asInstanceOf[js.Any])
    __obj.updateDynamic("503")(`503`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`413`]
  }
  
  extension [Self <: `413`](x: Self) {
    
    inline def set202(value: ContentApplicationjson106): Self = StObject.set(x, "202", value.asInstanceOf[js.Any])
    
    inline def set400(value: Any): Self = StObject.set(x, "400", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content6): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content6): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set413(value: Any): Self = StObject.set(x, "413", value.asInstanceOf[js.Any])
    
    inline def set503(value: ContentApplicationjsonCodeDocumentationurl): Self = StObject.set(x, "503", value.asInstanceOf[js.Any])
  }
}
