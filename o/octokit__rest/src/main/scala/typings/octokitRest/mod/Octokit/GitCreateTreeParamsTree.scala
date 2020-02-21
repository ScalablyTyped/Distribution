package typings.octokitRest.mod.Octokit

import typings.octokitRest.octokitRestStrings.`040000`
import typings.octokitRest.octokitRestStrings.`100644`
import typings.octokitRest.octokitRestStrings.`100755`
import typings.octokitRest.octokitRestStrings.`120000`
import typings.octokitRest.octokitRestStrings.`160000`
import typings.octokitRest.octokitRestStrings.blob
import typings.octokitRest.octokitRestStrings.commit
import typings.octokitRest.octokitRestStrings.tree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCreateTreeParamsTree extends js.Object {
  var content: js.UndefOr[String] = js.undefined
  var mode: js.UndefOr[`100644` | `100755` | `040000` | `160000` | `120000`] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var sha: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[blob | tree | commit] = js.undefined
}

object GitCreateTreeParamsTree {
  @scala.inline
  def apply(
    content: String = null,
    mode: `100644` | `100755` | `040000` | `160000` | `120000` = null,
    path: String = null,
    sha: String = null,
    `type`: blob | tree | commit = null
  ): GitCreateTreeParamsTree = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (sha != null) __obj.updateDynamic("sha")(sha.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitCreateTreeParamsTree]
  }
}

