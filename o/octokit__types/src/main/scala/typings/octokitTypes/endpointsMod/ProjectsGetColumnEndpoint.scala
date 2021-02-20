package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`7`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  column_id :number} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'inertia'> */
@js.native
trait ProjectsGetColumnEndpoint extends StObject {
  
  var column_id: Double = js.native
  
  var mediaType: `7` = js.native
}
object ProjectsGetColumnEndpoint {
  
  @scala.inline
  def apply(column_id: Double, mediaType: `7`): ProjectsGetColumnEndpoint = {
    val __obj = js.Dynamic.literal(column_id = column_id.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsGetColumnEndpoint]
  }
  
  @scala.inline
  implicit class ProjectsGetColumnEndpointMutableBuilder[Self <: ProjectsGetColumnEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn_id(value: Double): Self = StObject.set(x, "column_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaType(value: `7`): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
  }
}
