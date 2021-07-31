package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScopedRoleMembership
  extends StObject
     with Entity {
  
  // Unique identifier for the administrative unit that the directory role is scoped to
  var administrativeUnitId: js.UndefOr[String] = js.undefined
  
  // Unique identifier for the directory role that the member is in.
  var roleId: js.UndefOr[String] = js.undefined
  
  // Role member identity information. Represents the user that is a member of this scoped-role.
  var roleMemberInfo: js.UndefOr[Identity] = js.undefined
}
object ScopedRoleMembership {
  
  @scala.inline
  def apply(): ScopedRoleMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScopedRoleMembership]
  }
  
  @scala.inline
  implicit class ScopedRoleMembershipMutableBuilder[Self <: ScopedRoleMembership] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdministrativeUnitId(value: String): Self = StObject.set(x, "administrativeUnitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdministrativeUnitIdUndefined: Self = StObject.set(x, "administrativeUnitId", js.undefined)
    
    @scala.inline
    def setRoleId(value: String): Self = StObject.set(x, "roleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleIdUndefined: Self = StObject.set(x, "roleId", js.undefined)
    
    @scala.inline
    def setRoleMemberInfo(value: Identity): Self = StObject.set(x, "roleMemberInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleMemberInfoUndefined: Self = StObject.set(x, "roleMemberInfo", js.undefined)
  }
}
