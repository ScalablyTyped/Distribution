package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectsResource extends StObject {
  
  var authorizeddomains: AuthorizeddomainsResource
  
  var locations: LocationsResource
}
object ProjectsResource {
  
  @scala.inline
  def apply(authorizeddomains: AuthorizeddomainsResource, locations: LocationsResource): ProjectsResource = {
    val __obj = js.Dynamic.literal(authorizeddomains = authorizeddomains.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsResource]
  }
  
  @scala.inline
  implicit class ProjectsResourceMutableBuilder[Self <: ProjectsResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorizeddomains(value: AuthorizeddomainsResource): Self = StObject.set(x, "authorizeddomains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocations(value: LocationsResource): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
  }
}
