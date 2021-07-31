package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`0`
import typings.octokitTypes.octokitTypesStrings.inertia
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectsDeleteEndpoint
  extends StObject
     with RequiredPreview[inertia] {
  
  var project_id: Double
}
object ProjectsDeleteEndpoint {
  
  @scala.inline
  def apply(mediaType: `0`[inertia], project_id: Double): ProjectsDeleteEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], project_id = project_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsDeleteEndpoint]
  }
  
  @scala.inline
  implicit class ProjectsDeleteEndpointMutableBuilder[Self <: ProjectsDeleteEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProject_id(value: Double): Self = StObject.set(x, "project_id", value.asInstanceOf[js.Any])
  }
}
