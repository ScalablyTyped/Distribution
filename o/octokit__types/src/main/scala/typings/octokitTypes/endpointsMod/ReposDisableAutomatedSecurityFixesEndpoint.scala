package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`10`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  owner  :string,   repo  :string} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'london'> */
trait ReposDisableAutomatedSecurityFixesEndpoint extends js.Object {
  var mediaType: `10`
  var owner: String
  var repo: String
}

object ReposDisableAutomatedSecurityFixesEndpoint {
  @scala.inline
  def apply(mediaType: `10`, owner: String, repo: String): ReposDisableAutomatedSecurityFixesEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposDisableAutomatedSecurityFixesEndpoint]
  }
}

