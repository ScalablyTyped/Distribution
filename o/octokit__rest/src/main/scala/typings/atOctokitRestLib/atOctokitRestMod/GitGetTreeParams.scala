package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitGetTreeParams extends js.Object {
  var owner: java.lang.String
  var recursive: js.UndefOr[atOctokitRestLib.atOctokitRestLibNumbers.`1`] = js.undefined
  var repo: java.lang.String
  var tree_sha: java.lang.String
}

object GitGetTreeParams {
  @scala.inline
  def apply(
    owner: java.lang.String,
    repo: java.lang.String,
    tree_sha: java.lang.String,
    recursive: atOctokitRestLib.atOctokitRestLibNumbers.`1` = null
  ): GitGetTreeParams = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo, tree_sha = tree_sha)
    if (recursive != null) __obj.updateDynamic("recursive")(recursive)
    __obj.asInstanceOf[GitGetTreeParams]
  }
}

