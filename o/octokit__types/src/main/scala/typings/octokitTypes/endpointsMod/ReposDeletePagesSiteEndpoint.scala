package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`15`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  owner  :string,   repo  :string} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'switcheroo'> */
trait ReposDeletePagesSiteEndpoint extends js.Object {
  var mediaType: `15`
  var owner: String
  var repo: String
}

object ReposDeletePagesSiteEndpoint {
  @scala.inline
  def apply(mediaType: `15`, owner: String, repo: String): ReposDeletePagesSiteEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposDeletePagesSiteEndpoint]
  }
}

