package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitGetTreeEndpoint extends js.Object {
  var owner: java.lang.String
  var recursive: js.UndefOr[scala.Double] = js.undefined
  var repo: java.lang.String
  var tree_sha: java.lang.String
}

object GitGetTreeEndpoint {
  @scala.inline
  def apply(
    owner: java.lang.String,
    repo: java.lang.String,
    tree_sha: java.lang.String,
    recursive: scala.Int | scala.Double = null
  ): GitGetTreeEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo, tree_sha = tree_sha)
    if (recursive != null) __obj.updateDynamic("recursive")(recursive.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitGetTreeEndpoint]
  }
}

