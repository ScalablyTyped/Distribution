package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`12`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  owner  :string,   repo  :string,   check_run_id  :number} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'antiope'> */
trait ChecksGetEndpoint extends js.Object {
  var check_run_id: Double
  var mediaType: `12`
  var owner: String
  var repo: String
}

object ChecksGetEndpoint {
  @scala.inline
  def apply(check_run_id: Double, mediaType: `12`, owner: String, repo: String): ChecksGetEndpoint = {
    val __obj = js.Dynamic.literal(check_run_id = check_run_id.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksGetEndpoint]
  }
}

