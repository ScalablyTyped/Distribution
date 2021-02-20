package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`7`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  project_id :number,   name :string} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'inertia'> */
@js.native
trait ProjectsCreateColumnEndpoint extends StObject {
  
  var mediaType: `7` = js.native
  
  /**
    * The name of the column.
    */
  var name: String = js.native
  
  var project_id: Double = js.native
}
object ProjectsCreateColumnEndpoint {
  
  @scala.inline
  def apply(mediaType: `7`, name: String, project_id: Double): ProjectsCreateColumnEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], project_id = project_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsCreateColumnEndpoint]
  }
  
  @scala.inline
  implicit class ProjectsCreateColumnEndpointMutableBuilder[Self <: ProjectsCreateColumnEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMediaType(value: `7`): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProject_id(value: Double): Self = StObject.set(x, "project_id", value.asInstanceOf[js.Any])
  }
}
