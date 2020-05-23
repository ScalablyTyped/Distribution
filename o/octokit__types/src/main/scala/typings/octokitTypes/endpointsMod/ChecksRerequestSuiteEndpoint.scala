package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`12`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  owner  :string,   repo  :string,   check_suite_id  :number} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'antiope'> */
trait ChecksRerequestSuiteEndpoint extends js.Object {
  var check_suite_id: Double
  var mediaType: `12`
  var owner: String
  var repo: String
}

object ChecksRerequestSuiteEndpoint {
  @scala.inline
  def apply(check_suite_id: Double, mediaType: `12`, owner: String, repo: String): ChecksRerequestSuiteEndpoint = {
    val __obj = js.Dynamic.literal(check_suite_id = check_suite_id.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksRerequestSuiteEndpoint]
  }
}

