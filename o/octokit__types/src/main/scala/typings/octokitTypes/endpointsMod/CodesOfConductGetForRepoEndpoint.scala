package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  owner :string,   repo :string} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'scarlet-witch'> */
@js.native
trait CodesOfConductGetForRepoEndpoint extends StObject {
  
  var mediaType: `3` = js.native
  
  var owner: String = js.native
  
  var repo: String = js.native
}
object CodesOfConductGetForRepoEndpoint {
  
  @scala.inline
  def apply(mediaType: `3`, owner: String, repo: String): CodesOfConductGetForRepoEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodesOfConductGetForRepoEndpoint]
  }
  
  @scala.inline
  implicit class CodesOfConductGetForRepoEndpointMutableBuilder[Self <: CodesOfConductGetForRepoEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMediaType(value: `3`): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
