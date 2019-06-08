package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsUpdateBranchEndpoint extends js.Object {
  var expected_head_sha: js.UndefOr[java.lang.String] = js.undefined
  var owner: java.lang.String
  var pull_number: scala.Double
  var repo: java.lang.String
}

object PullsUpdateBranchEndpoint {
  @scala.inline
  def apply(
    owner: java.lang.String,
    pull_number: scala.Double,
    repo: java.lang.String,
    expected_head_sha: java.lang.String = null
  ): PullsUpdateBranchEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, pull_number = pull_number, repo = repo)
    if (expected_head_sha != null) __obj.updateDynamic("expected_head_sha")(expected_head_sha)
    __obj.asInstanceOf[PullsUpdateBranchEndpoint]
  }
}

