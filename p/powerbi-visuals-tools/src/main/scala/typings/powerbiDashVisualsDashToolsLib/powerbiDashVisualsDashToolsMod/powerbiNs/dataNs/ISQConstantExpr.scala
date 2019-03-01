package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISQConstantExpr extends ISQExpr {
  var kind: js.UndefOr[scala.Double] = js.undefined
}

object ISQConstantExpr {
  @scala.inline
  def apply(
    args: ISQExpr = null,
    kind: scala.Int | scala.Double = null,
    left: ISQExpr = null,
    right: ISQExpr = null
  ): ISQConstantExpr = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args)
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left)
    if (right != null) __obj.updateDynamic("right")(right)
    __obj.asInstanceOf[ISQConstantExpr]
  }
}

