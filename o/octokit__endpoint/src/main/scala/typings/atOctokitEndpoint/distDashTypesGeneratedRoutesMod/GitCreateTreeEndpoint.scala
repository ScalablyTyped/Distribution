package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCreateTreeEndpoint extends js.Object {
  var base_tree: js.UndefOr[String] = js.undefined
  var owner: String
  var repo: String
  var tree: js.Array[js.Object]
  var `tree[].content`: js.UndefOr[String] = js.undefined
  var `tree[].mode`: js.UndefOr[String] = js.undefined
  var `tree[].path`: js.UndefOr[String] = js.undefined
  var `tree[].sha`: js.UndefOr[String] = js.undefined
  var `tree[].type`: js.UndefOr[String] = js.undefined
}

object GitCreateTreeEndpoint {
  @scala.inline
  def apply(
    owner: String,
    repo: String,
    tree: js.Array[js.Object],
    base_tree: String = null,
    `tree[].content`: String = null,
    `tree[].mode`: String = null,
    `tree[].path`: String = null,
    `tree[].sha`: String = null,
    `tree[].type`: String = null
  ): GitCreateTreeEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo, tree = tree)
    if (base_tree != null) __obj.updateDynamic("base_tree")(base_tree)
    if (`tree[].content` != null) __obj.updateDynamic("tree[].content")(`tree[].content`)
    if (`tree[].mode` != null) __obj.updateDynamic("tree[].mode")(`tree[].mode`)
    if (`tree[].path` != null) __obj.updateDynamic("tree[].path")(`tree[].path`)
    if (`tree[].sha` != null) __obj.updateDynamic("tree[].sha")(`tree[].sha`)
    if (`tree[].type` != null) __obj.updateDynamic("tree[].type")(`tree[].type`)
    __obj.asInstanceOf[GitCreateTreeEndpoint]
  }
}

