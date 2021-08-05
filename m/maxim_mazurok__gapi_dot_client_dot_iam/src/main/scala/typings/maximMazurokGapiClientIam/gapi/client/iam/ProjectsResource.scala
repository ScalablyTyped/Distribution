package typings.maximMazurokGapiClientIam.gapi.client.iam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectsResource extends StObject {
  
  var locations: LocationsResource
  
  var roles: RolesResource
  
  var serviceAccounts: ServiceAccountsResource
}
object ProjectsResource {
  
  inline def apply(locations: LocationsResource, roles: RolesResource, serviceAccounts: ServiceAccountsResource): ProjectsResource = {
    val __obj = js.Dynamic.literal(locations = locations.asInstanceOf[js.Any], roles = roles.asInstanceOf[js.Any], serviceAccounts = serviceAccounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsResource]
  }
  
  extension [Self <: ProjectsResource](x: Self) {
    
    inline def setLocations(value: LocationsResource): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    inline def setRoles(value: RolesResource): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setServiceAccounts(value: ServiceAccountsResource): Self = StObject.set(x, "serviceAccounts", value.asInstanceOf[js.Any])
  }
}
