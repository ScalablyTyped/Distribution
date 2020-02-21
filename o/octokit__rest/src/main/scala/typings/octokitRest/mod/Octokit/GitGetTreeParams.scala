package typings.octokitRest.mod.Octokit

import typings.octokitRest.octokitRestStrings.`1`
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
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], tree_sha = tree_sha.asInstanceOf[js.Any])
    if (recursive != null) __obj.updateDynamic("recursive")(recursive.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitGetTreeParams]
  }
}

