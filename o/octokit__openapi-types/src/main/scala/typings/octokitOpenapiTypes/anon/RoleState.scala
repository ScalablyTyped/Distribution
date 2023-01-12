package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.active
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.maintainer
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.member_
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.pending
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoleState extends StObject {
  
  /**
    * @description The role of the user in the team.
    * @default member
    * @example member
    * @enum {string}
    */
  var role: member_ | maintainer
  
  /**
    * @description The state of the user's membership in the team.
    * @enum {string}
    */
  var state: active | pending
  
  /** Format: uri */
  var url: String
}
object RoleState {
  
  inline def apply(role: member_ | maintainer, state: active | pending, url: String): RoleState = {
    val __obj = js.Dynamic.literal(role = role.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoleState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RoleState] (val x: Self) extends AnyVal {
    
    inline def setRole(value: member_ | maintainer): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setState(value: active | pending): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
