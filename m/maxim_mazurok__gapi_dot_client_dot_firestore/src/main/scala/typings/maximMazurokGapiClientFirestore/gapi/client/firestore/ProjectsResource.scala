package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectsResource extends StObject {
  
  var databases: DatabasesResource
  
  var locations: LocationsResource
}
object ProjectsResource {
  
  @scala.inline
  def apply(databases: DatabasesResource, locations: LocationsResource): ProjectsResource = {
    val __obj = js.Dynamic.literal(databases = databases.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsResource]
  }
  
  @scala.inline
  implicit class ProjectsResourceMutableBuilder[Self <: ProjectsResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatabases(value: DatabasesResource): Self = StObject.set(x, "databases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocations(value: LocationsResource): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
  }
}
