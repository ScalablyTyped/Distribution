package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitGetTreeEndpoint extends js.Object {
  var owner: String
  var recursive: js.UndefOr[Double] = js.undefined
  var repo: String
  var tree_sha: String
}

object GitGetTreeEndpoint {
  @scala.inline
  def apply(owner: String, repo: String, tree_sha: String, recursive: Int | Double = null): GitGetTreeEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo, tree_sha = tree_sha)
    if (recursive != null) __obj.updateDynamic("recursive")(recursive.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitGetTreeEndpoint]
  }
}

