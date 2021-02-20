package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`9`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  reaction_id :number} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'squirrel-girl'> */
@js.native
trait ReactionsDeleteLegacyEndpoint extends StObject {
  
  var mediaType: `9` = js.native
  
  var reaction_id: Double = js.native
}
object ReactionsDeleteLegacyEndpoint {
  
  @scala.inline
  def apply(mediaType: `9`, reaction_id: Double): ReactionsDeleteLegacyEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], reaction_id = reaction_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactionsDeleteLegacyEndpoint]
  }
  
  @scala.inline
  implicit class ReactionsDeleteLegacyEndpointMutableBuilder[Self <: ReactionsDeleteLegacyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMediaType(value: `9`): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReaction_id(value: Double): Self = StObject.set(x, "reaction_id", value.asInstanceOf[js.Any])
  }
}
