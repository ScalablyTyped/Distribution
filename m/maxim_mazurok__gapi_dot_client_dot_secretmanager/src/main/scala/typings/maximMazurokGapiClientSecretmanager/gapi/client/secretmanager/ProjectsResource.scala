package typings.maximMazurokGapiClientSecretmanager.gapi.client.secretmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectsResource extends StObject {
  
  var locations: LocationsResource
  
  var secrets: SecretsResource
}
object ProjectsResource {
  
  @scala.inline
  def apply(locations: LocationsResource, secrets: SecretsResource): ProjectsResource = {
    val __obj = js.Dynamic.literal(locations = locations.asInstanceOf[js.Any], secrets = secrets.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsResource]
  }
  
  @scala.inline
  implicit class ProjectsResourceMutableBuilder[Self <: ProjectsResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocations(value: LocationsResource): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecrets(value: SecretsResource): Self = StObject.set(x, "secrets", value.asInstanceOf[js.Any])
  }
}
