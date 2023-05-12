package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.maintainer
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.member_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `123` extends StObject {
  
  /**
    * @description The role that this user should have in the team.
    * @default member
    * @enum {string}
    */
  var role: js.UndefOr[member_ | maintainer] = js.undefined
}
object `123` {
  
  inline def apply(): `123` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`123`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `123`] (val x: Self) extends AnyVal {
    
    inline def setRole(value: member_ | maintainer): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
