package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `403Unknown404Content48` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonRoleState
  
  /** Forbidden if team synchronization is set up */
  var `403`: Any
  
  var `404`: Content48
  
  /** Unprocessable Entity if you attempt to add an organization to a team */
  var `422`: Any
}
object `403Unknown404Content48` {
  
  inline def apply(`200`: ContentApplicationjsonRoleState, `403`: Any, `404`: Content48, `422`: Any): `403Unknown404Content48` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`403Unknown404Content48`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `403Unknown404Content48`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonRoleState): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set403(value: Any): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content48): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Any): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
