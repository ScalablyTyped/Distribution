package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`11`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  owner :string,   repo :string,   branch :string} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'zzzax'> */
@js.native
trait ReposCreateCommitSignatureProtectionEndpoint extends js.Object {
  
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
  implicit class ReposCreateCommitSignatureProtectionEndpointOps[Self <: ReposCreateCommitSignatureProtectionEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBranch(value: String): Self = this.set("branch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaType(value: `11`): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
  }
}
