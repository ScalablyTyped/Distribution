package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`12`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  owner  :string,   repo  :string,   head_sha  :string} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'antiope'> */
trait ChecksCreateSuiteEndpoint extends js.Object {
  /**
    * The sha of the head commit.
    */
  var head_sha: String
  var mediaType: `12`
  var owner: String
  var repo: String
}

object ChecksCreateSuiteEndpoint {
  @scala.inline
  def apply(head_sha: String, mediaType: `12`, owner: String, repo: String): ChecksCreateSuiteEndpoint = {
    val __obj = js.Dynamic.literal(head_sha = head_sha.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksCreateSuiteEndpoint]
  }
}

