package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsUpdateBranchParams extends js.Object {
  /**
    * The expected SHA of the pull request's HEAD ref. This is the most recent commit on the pull request's branch. If the expected SHA does not match the pull request's HEAD, you will receive a `422 Unprocessable Entity` status. You can use the "[List commits on a repository](https://developer.github.com/v3/repos/commits/#list-commits-on-a-repository)" endpoint to find the most recent commit SHA. Default: SHA of the pull request's current HEAD ref.
    */
  var expected_head_sha: js.UndefOr[String] = js.undefined
  var owner: String
  var pull_number: Double
  var repo: String
}

object PullsUpdateBranchParams {
  @scala.inline
  def apply(owner: String, pull_number: Double, repo: String, expected_head_sha: String = null): PullsUpdateBranchParams = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (expected_head_sha != null) __obj.updateDynamic("expected_head_sha")(expected_head_sha.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsUpdateBranchParams]
  }
}

