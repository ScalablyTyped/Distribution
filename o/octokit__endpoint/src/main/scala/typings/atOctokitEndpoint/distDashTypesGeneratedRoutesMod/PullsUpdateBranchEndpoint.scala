package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsUpdateBranchEndpoint extends js.Object {
  var expected_head_sha: js.UndefOr[String] = js.undefined
  var owner: String
  var pull_number: Double
  var repo: String
}

object PullsUpdateBranchEndpoint {
  @scala.inline
  def apply(owner: String, pull_number: Double, repo: String, expected_head_sha: String = null): PullsUpdateBranchEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, pull_number = pull_number, repo = repo)
    if (expected_head_sha != null) __obj.updateDynamic("expected_head_sha")(expected_head_sha)
    __obj.asInstanceOf[PullsUpdateBranchEndpoint]
  }
}

