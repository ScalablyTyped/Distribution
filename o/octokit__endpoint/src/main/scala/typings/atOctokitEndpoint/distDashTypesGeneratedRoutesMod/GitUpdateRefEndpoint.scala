package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitUpdateRefEndpoint extends js.Object {
  var force: js.UndefOr[Boolean] = js.undefined
  var owner: String
  var ref: String
  var repo: String
  var sha: String
}

object GitUpdateRefEndpoint {
  @scala.inline
  def apply(owner: String, ref: String, repo: String, sha: String, force: js.UndefOr[Boolean] = js.undefined): GitUpdateRefEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, ref = ref, repo = repo, sha = sha)
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    __obj.asInstanceOf[GitUpdateRefEndpoint]
  }
}

