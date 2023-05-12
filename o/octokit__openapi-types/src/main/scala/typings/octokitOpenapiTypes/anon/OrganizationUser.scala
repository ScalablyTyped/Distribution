package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizationUser extends StObject {
  
  /** Organization */
  var organization: js.UndefOr[Issuesurl] = js.undefined
  
  /** User */
  var user: js.UndefOr[Deleted | Null] = js.undefined
}
object OrganizationUser {
  
  inline def apply(): OrganizationUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrganizationUser]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrganizationUser] (val x: Self) extends AnyVal {
    
    inline def setOrganization(value: Issuesurl): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setUser(value: Deleted): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserNull: Self = StObject.set(x, "user", null)
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
