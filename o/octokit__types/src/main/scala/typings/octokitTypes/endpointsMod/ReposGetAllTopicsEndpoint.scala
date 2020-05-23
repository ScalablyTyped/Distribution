package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`17`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  owner  :string,   repo  :string} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'mercy'> */
trait ReposGetAllTopicsEndpoint extends js.Object {
  var mediaType: `17`
  var owner: String
  var repo: String
}

object ReposGetAllTopicsEndpoint {
  @scala.inline
  def apply(mediaType: `17`, owner: String, repo: String): ReposGetAllTopicsEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetAllTopicsEndpoint]
  }
}

