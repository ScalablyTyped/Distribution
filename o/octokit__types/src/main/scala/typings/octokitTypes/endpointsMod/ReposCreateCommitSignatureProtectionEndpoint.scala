package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`11`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  owner :string,   repo :string,   branch :string} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'zzzax'> */
@js.native
trait ReposCreateCommitSignatureProtectionEndpoint extends StObject {
  
  var branch: String = js.native
  
  var mediaType: `11` = js.native
  
  var owner: String = js.native
  
  var repo: String = js.native
}
object ReposCreateCommitSignatureProtectionEndpoint {
  
  @scala.inline
  def apply(branch: String, mediaType: `11`, owner: String, repo: String): ReposCreateCommitSignatureProtectionEndpoint = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateCommitSignatureProtectionEndpoint]
  }
  
  @scala.inline
  implicit class ReposCreateCommitSignatureProtectionEndpointMutableBuilder[Self <: ReposCreateCommitSignatureProtectionEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaType(value: `11`): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
