package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`16`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  owner  :string,   repo  :string,   pull_number  :number,   expected_head_sha ? :string} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'lydian'> */
trait PullsUpdateBranchEndpoint extends js.Object {
  /**
    * The expected SHA of the pull request's HEAD ref. This is the most recent commit on the pull request's branch. If the expected SHA does not match the pull request's HEAD, you will receive a `422 Unprocessable Entity` status. You can use the "[List commits on a repository](https://developer.github.com/v3/repos/commits/#list-commits-on-a-repository)" endpoint to find the most recent commit SHA. Default: SHA of the pull request's current HEAD ref.
    */
  var expected_head_sha: js.UndefOr[String] = js.undefined
  var mediaType: `16`
  var owner: String
  var pull_number: Double
  var repo: String
}

object PullsUpdateBranchEndpoint {
  @scala.inline
  def apply(
    mediaType: `16`,
    owner: String,
    pull_number: Double,
    repo: String,
    expected_head_sha: String = null
  ): PullsUpdateBranchEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (expected_head_sha != null) __obj.updateDynamic("expected_head_sha")(expected_head_sha.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsUpdateBranchEndpoint]
  }
}

