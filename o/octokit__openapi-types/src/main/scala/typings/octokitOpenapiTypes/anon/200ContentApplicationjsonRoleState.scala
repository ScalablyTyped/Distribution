package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonRoleState` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonRoleState
}
object `200ContentApplicationjsonRoleState` {
  
  inline def apply(`200`: ContentApplicationjsonRoleState): `200ContentApplicationjsonRoleState` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonRoleState`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonRoleState`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonRoleState): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
