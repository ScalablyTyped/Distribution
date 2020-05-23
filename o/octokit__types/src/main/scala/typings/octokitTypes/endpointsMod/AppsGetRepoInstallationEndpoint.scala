package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  owner  :string,   repo  :string} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'machine-man'> */
trait AppsGetRepoInstallationEndpoint extends js.Object {
  var mediaType: `2`
  var owner: String
  var repo: String
}

object AppsGetRepoInstallationEndpoint {
  @scala.inline
  def apply(mediaType: `2`, owner: String, repo: String): AppsGetRepoInstallationEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsGetRepoInstallationEndpoint]
  }
}

