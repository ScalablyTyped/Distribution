package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsUpdateBranchParams extends js.Object {
  /**
    * The expected SHA of the pull request's HEAD ref. This is the most recent commit on the pull request's branch. If the expected SHA does not match the pull request's HEAD, you will receive a `422 Unprocessable Entity` status. You can use the "[List commits on a repository](https://developer.github.com/v3/repos/commits/#list-commits-on-a-repository)" endpoint to find the most recent commit SHA.
    */
  var expected_head_sha: js.UndefOr[java.lang.String] = js.undefined
  var owner: java.lang.String
  var pull_number: scala.Double
  var repo: java.lang.String
}

object PullsUpdateBranchParams {
  @scala.inline
  def apply(
    owner: java.lang.String,
    pull_number: scala.Double,
    repo: java.lang.String,
    expected_head_sha: java.lang.String = null
  ): PullsUpdateBranchParams = {
    val __obj = js.Dynamic.literal(owner = owner, pull_number = pull_number, repo = repo)
    if (expected_head_sha != null) __obj.updateDynamic("expected_head_sha")(expected_head_sha)
    __obj.asInstanceOf[PullsUpdateBranchParams]
  }
}

