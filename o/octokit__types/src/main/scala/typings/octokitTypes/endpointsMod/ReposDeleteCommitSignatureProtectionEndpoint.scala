package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`14`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  owner :string,   repo :string,   branch :string} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'zzzax'> */
@js.native
trait ReposDeleteCommitSignatureProtectionEndpoint extends js.Object {
  var branch: String = js.native
  var mediaType: `14` = js.native
  var owner: String = js.native
  var repo: String = js.native
}

object ReposDeleteCommitSignatureProtectionEndpoint {
  @scala.inline
  def apply(branch: String, mediaType: `14`, owner: String, repo: String): ReposDeleteCommitSignatureProtectionEndpoint = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposDeleteCommitSignatureProtectionEndpoint]
  }
  @scala.inline
  implicit class ReposDeleteCommitSignatureProtectionEndpointOps[Self <: ReposDeleteCommitSignatureProtectionEndpoint] (val x: Self) extends AnyVal {
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
    def setMediaType(value: `14`): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
  }
  
}

