package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitGetTreeEndpoint extends js.Object {
  /**
    * owner parameter
    */
  var owner: String
  /**
    * recursive parameter
    */
  var recursive: js.UndefOr[`1`] = js.undefined
  /**
    * repo parameter
    */
  var repo: String
  /**
    * tree_sha parameter
    */
  var tree_sha: String
}

object GitGetTreeEndpoint {
  @scala.inline
  def apply(owner: String, repo: String, tree_sha: String, recursive: `1` = null): GitGetTreeEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], tree_sha = tree_sha.asInstanceOf[js.Any])
    if (recursive != null) __obj.updateDynamic("recursive")(recursive.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitGetTreeEndpoint]
  }
}

