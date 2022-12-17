package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonRoleState403Unknown` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonRoleState
  
  /** Forbidden if team synchronization is set up */
  var `403`: Any
  
  /** Unprocessable Entity if you attempt to add an organization to a team */
  var `422`: Any
}
object `200ContentApplicationjsonRoleState403Unknown` {
  
  inline def apply(`200`: ContentApplicationjsonRoleState, `403`: Any, `422`: Any): `200ContentApplicationjsonRoleState403Unknown` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonRoleState403Unknown`]
  }
  
  extension [Self <: `200ContentApplicationjsonRoleState403Unknown`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonRoleState): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set403(value: Any): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set422(value: Any): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
