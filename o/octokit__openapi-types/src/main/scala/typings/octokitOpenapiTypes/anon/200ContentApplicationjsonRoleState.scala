package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonRoleState` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonRoleState
  
  /** if user has no team membership */
  var `404`: Any
}
object `200ContentApplicationjsonRoleState` {
  
  inline def apply(`200`: ContentApplicationjsonRoleState, `404`: Any): `200ContentApplicationjsonRoleState` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonRoleState`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonRoleState`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonRoleState): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Any): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
