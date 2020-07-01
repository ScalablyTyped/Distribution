package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitGetTreeEndpoint extends js.Object {
  var owner: String
  /**
    * Setting this parameter to any value returns the objects or subtrees referenced by the tree specified in `:tree_sha`. For example, setting `recursive` to any of the following will enable returning objects or subtrees: `0`, `1`, `"true"`, and `"false"`. Omit this parameter to prevent recursively returning objects or subtrees.
    */
  var recursive: js.UndefOr[String] = js.undefined
  var repo: String
  var tree_sha: String
}

object GitGetTreeEndpoint {
  @scala.inline
  def apply(owner: String, repo: String, tree_sha: String, recursive: String = null): GitGetTreeEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], tree_sha = tree_sha.asInstanceOf[js.Any])
    if (recursive != null) __obj.updateDynamic("recursive")(recursive.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitGetTreeEndpoint]
  }
}

