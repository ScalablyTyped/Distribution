package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`7`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  card_id :number} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'inertia'> */
@js.native
trait ProjectsDeleteCardEndpoint extends StObject {
  
  var card_id: Double = js.native
  
  var mediaType: `7` = js.native
}
object ProjectsDeleteCardEndpoint {
  
  @scala.inline
  def apply(card_id: Double, mediaType: `7`): ProjectsDeleteCardEndpoint = {
    val __obj = js.Dynamic.literal(card_id = card_id.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsDeleteCardEndpoint]
  }
  
  @scala.inline
  implicit class ProjectsDeleteCardEndpointMutableBuilder[Self <: ProjectsDeleteCardEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCard_id(value: Double): Self = StObject.set(x, "card_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaType(value: `7`): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
  }
}
