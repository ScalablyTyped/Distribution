package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `202400` extends StObject {
  
  /** Response */
  var `202`: ContentApplicationjsonAllowupdatebranch
  
  var `400`: ContentApplicationjsonApplicationscimjson
  
  var `403`: Content6
  
  var `404`: Content6
  
  var `422`: Content8
}
object `202400` {
  
  inline def apply(
    `202`: ContentApplicationjsonAllowupdatebranch,
    `400`: ContentApplicationjsonApplicationscimjson,
    `403`: Content6,
    `404`: Content6,
    `422`: Content8
  ): `202400` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("202")(`202`.asInstanceOf[js.Any])
    __obj.updateDynamic("400")(`400`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`202400`]
  }
  
  extension [Self <: `202400`](x: Self) {
    
    inline def set202(value: ContentApplicationjsonAllowupdatebranch): Self = StObject.set(x, "202", value.asInstanceOf[js.Any])
    
    inline def set400(value: ContentApplicationjsonApplicationscimjson): Self = StObject.set(x, "400", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content6): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content6): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content8): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
