package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `403ContentApplicationjson` extends StObject {
  
  /** Response */
  var `201`: Content4
  
  /** Forbidden if the check run is not rerequestable or doesn't belong to the authenticated GitHub App */
  var `403`: ContentApplicationjson
  
  var `404`: Content6
  
  /** Validation error if the check run is not rerequestable */
  var `422`: ContentApplicationjson
}
object `403ContentApplicationjson` {
  
  inline def apply(`201`: Content4, `403`: ContentApplicationjson, `404`: Content6, `422`: ContentApplicationjson): `403ContentApplicationjson` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`403ContentApplicationjson`]
  }
  
  extension [Self <: `403ContentApplicationjson`](x: Self) {
    
    inline def set201(value: Content4): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set403(value: ContentApplicationjson): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content6): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: ContentApplicationjson): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
