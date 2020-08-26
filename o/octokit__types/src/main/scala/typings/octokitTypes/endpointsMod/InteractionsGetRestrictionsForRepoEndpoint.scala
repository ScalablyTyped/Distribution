package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  owner :string,   repo :string} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'sombra'> */
@js.native
trait InteractionsGetRestrictionsForRepoEndpoint extends js.Object {
  var mediaType: `6` = js.native
  var owner: String = js.native
  var repo: String = js.native
}

object InteractionsGetRestrictionsForRepoEndpoint {
  @scala.inline
  def apply(mediaType: `6`, owner: String, repo: String): InteractionsGetRestrictionsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionsGetRestrictionsForRepoEndpoint]
  }
  @scala.inline
  implicit class InteractionsGetRestrictionsForRepoEndpointOps[Self <: InteractionsGetRestrictionsForRepoEndpoint] (val x: Self) extends AnyVal {
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
    def setMediaType(value: `6`): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
  }
  
}

