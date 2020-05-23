package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  owner  :string,   repo  :string} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'sombra'> */
trait InteractionsGetRestrictionsForRepoEndpoint extends js.Object {
  var mediaType: `6`
  var owner: String
  var repo: String
}

object InteractionsGetRestrictionsForRepoEndpoint {
  @scala.inline
  def apply(mediaType: `6`, owner: String, repo: String): InteractionsGetRestrictionsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionsGetRestrictionsForRepoEndpoint]
  }
}

