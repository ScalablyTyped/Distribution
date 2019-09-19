package typings.atOctokitRest.atOctokitRestMod

import typings.atOctokitRest.atOctokitRestStrings.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitGetTreeParams extends js.Object {
  var owner: String
  var recursive: js.UndefOr[`1`] = js.undefined
  var repo: String
  var tree_sha: String
}

object GitGetTreeParams {
  @scala.inline
  def apply(owner: String, repo: String, tree_sha: String, recursive: `1` = null): GitGetTreeParams = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo, tree_sha = tree_sha)
    if (recursive != null) __obj.updateDynamic("recursive")(recursive)
    __obj.asInstanceOf[GitGetTreeParams]
  }
}

