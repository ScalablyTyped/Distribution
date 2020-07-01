package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`11`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  owner  :string,   repo  :string,   branch  :string} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'zzzax'> */
trait ReposDeleteCommitSignatureProtectionEndpoint extends js.Object {
  var branch: String
  var mediaType: `11`
  var owner: String
  var repo: String
}

object ReposDeleteCommitSignatureProtectionEndpoint {
  @scala.inline
  def apply(branch: String, mediaType: `11`, owner: String, repo: String): ReposDeleteCommitSignatureProtectionEndpoint = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposDeleteCommitSignatureProtectionEndpoint]
  }
}

