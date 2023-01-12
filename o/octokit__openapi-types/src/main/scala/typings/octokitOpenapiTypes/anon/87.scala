package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.admin
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.member_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `87` extends StObject {
  
  /**
    * @description The role to give the user in the organization. Can be one of:
    * \* `admin` - The user will become an owner of the organization.
    * \* `member` - The user will become a non-owner member of the organization.
    * @default member
    * @enum {string}
    */
  var role: js.UndefOr[admin | member_] = js.undefined
}
object `87` {
  
  inline def apply(): `87` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`87`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `87`] (val x: Self) extends AnyVal {
    
    inline def setRole(value: admin | member_): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
