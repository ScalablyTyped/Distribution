package typings.maximMazurokGapiClientIam.gapi.client.iam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizationsResource extends StObject {
  
  var roles: RolesResource
}
object OrganizationsResource {
  
  @scala.inline
  def apply(roles: RolesResource): OrganizationsResource = {
    val __obj = js.Dynamic.literal(roles = roles.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationsResource]
  }
  
  @scala.inline
  implicit class OrganizationsResourceMutableBuilder[Self <: OrganizationsResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoles(value: RolesResource): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
  }
}
