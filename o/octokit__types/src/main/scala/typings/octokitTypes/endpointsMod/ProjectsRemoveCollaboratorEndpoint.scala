package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`0`
import typings.octokitTypes.octokitTypesStrings.inertia
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectsRemoveCollaboratorEndpoint
  extends StObject
     with RequiredPreview[inertia] {
  
  var project_id: Double
  
  var username: String
}
object ProjectsRemoveCollaboratorEndpoint {
  
  @scala.inline
  def apply(mediaType: `0`[inertia], project_id: Double, username: String): ProjectsRemoveCollaboratorEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], project_id = project_id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsRemoveCollaboratorEndpoint]
  }
  
  @scala.inline
  implicit class ProjectsRemoveCollaboratorEndpointMutableBuilder[Self <: ProjectsRemoveCollaboratorEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProject_id(value: Double): Self = StObject.set(x, "project_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
