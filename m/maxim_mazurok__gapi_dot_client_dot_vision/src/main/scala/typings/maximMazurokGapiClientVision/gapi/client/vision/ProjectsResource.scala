package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectsResource extends StObject {
  
  var files: FilesResource
  
  var images: ImagesResource
  
  var locations: LocationsResource
  
  var operations: OperationsResource
}
object ProjectsResource {
  
  @scala.inline
  def apply(
    files: FilesResource,
    images: ImagesResource,
    locations: LocationsResource,
    operations: OperationsResource
  ): ProjectsResource = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsResource]
  }
  
  @scala.inline
  implicit class ProjectsResourceMutableBuilder[Self <: ProjectsResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFiles(value: FilesResource): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImages(value: ImagesResource): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocations(value: LocationsResource): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperations(value: OperationsResource): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
  }
}
