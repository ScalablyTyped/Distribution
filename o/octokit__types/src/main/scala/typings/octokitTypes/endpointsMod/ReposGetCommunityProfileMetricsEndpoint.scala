package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`16`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  owner :string,   repo :string} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'black-panther'> */
@js.native
trait ReposGetCommunityProfileMetricsEndpoint extends StObject {
  
  var mediaType: `16` = js.native
  
  var owner: String = js.native
  
  var repo: String = js.native
}
object ReposGetCommunityProfileMetricsEndpoint {
  
  @scala.inline
  def apply(mediaType: `16`, owner: String, repo: String): ReposGetCommunityProfileMetricsEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetCommunityProfileMetricsEndpoint]
  }
  
  @scala.inline
  implicit class ReposGetCommunityProfileMetricsEndpointMutableBuilder[Self <: ReposGetCommunityProfileMetricsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMediaType(value: `16`): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
