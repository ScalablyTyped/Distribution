package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.maintainer
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.member_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `64` extends StObject {
  
  /**
    * @description The role that this user should have in the team.
    * @default member
    * @enum {string}
    */
  var role: js.UndefOr[member_ | maintainer] = js.undefined
}
object `64` {
  
  inline def apply(): `64` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`64`]
  }
  
  extension [Self <: `64`](x: Self) {
    
    inline def setRole(value: member_ | maintainer): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
