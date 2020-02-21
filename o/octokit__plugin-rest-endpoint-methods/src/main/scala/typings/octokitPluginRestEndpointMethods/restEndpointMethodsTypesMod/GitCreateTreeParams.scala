package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCreateTreeParams extends js.Object {
  /**
    * The SHA1 of the tree you want to update with new data. If you don't set this, the commit will be created on top of everything; however, it will only contain your change, the rest of your files will show up as deleted.
    */
  var base_tree: js.UndefOr[String] = js.undefined
  var owner: String
  var repo: String
  /**
    * Objects (of `path`, `mode`, `type`, and `sha`) specifying a tree structure.
    */
  var tree: js.Array[GitCreateTreeParamsTree]
}

object GitCreateTreeParams {
  @scala.inline
  def apply(owner: String, repo: String, tree: js.Array[GitCreateTreeParamsTree], base_tree: String = null): GitCreateTreeParams = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any])
    if (base_tree != null) __obj.updateDynamic("base_tree")(base_tree.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitCreateTreeParams]
  }
}

