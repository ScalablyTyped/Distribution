package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISQExpr extends js.Object {
  var args: js.UndefOr[ISQExpr] = js.undefined
  var left: js.UndefOr[ISQExpr] = js.undefined
  var right: js.UndefOr[ISQExpr] = js.undefined
}

object ISQExpr {
  @scala.inline
  def apply(args: ISQExpr = null, left: ISQExpr = null, right: ISQExpr = null): ISQExpr = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args)
    if (left != null) __obj.updateDynamic("left")(left)
    if (right != null) __obj.updateDynamic("right")(right)
    __obj.asInstanceOf[ISQExpr]
  }
}

