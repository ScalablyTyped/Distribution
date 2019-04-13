package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCreateTreeParamsTree extends js.Object {
  var content: js.UndefOr[java.lang.String] = js.undefined
  var mode: js.UndefOr[
    atOctokitRestLib.atOctokitRestLibStrings.`100644` | atOctokitRestLib.atOctokitRestLibStrings.`100755` | atOctokitRestLib.atOctokitRestLibStrings.`040000` | atOctokitRestLib.atOctokitRestLibStrings.`160000` | atOctokitRestLib.atOctokitRestLibStrings.`120000`
  ] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var sha: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[
    atOctokitRestLib.atOctokitRestLibStrings.blob | atOctokitRestLib.atOctokitRestLibStrings.tree | atOctokitRestLib.atOctokitRestLibStrings.commit
  ] = js.undefined
}

object GitCreateTreeParamsTree {
  @scala.inline
  def apply(
    content: java.lang.String = null,
    mode: atOctokitRestLib.atOctokitRestLibStrings.`100644` | atOctokitRestLib.atOctokitRestLibStrings.`100755` | atOctokitRestLib.atOctokitRestLibStrings.`040000` | atOctokitRestLib.atOctokitRestLibStrings.`160000` | atOctokitRestLib.atOctokitRestLibStrings.`120000` = null,
    path: java.lang.String = null,
    sha: java.lang.String = null,
    `type`: atOctokitRestLib.atOctokitRestLibStrings.blob | atOctokitRestLib.atOctokitRestLibStrings.tree | atOctokitRestLib.atOctokitRestLibStrings.commit = null
  ): GitCreateTreeParamsTree = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path)
    if (sha != null) __obj.updateDynamic("sha")(sha)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitCreateTreeParamsTree]
  }
}

