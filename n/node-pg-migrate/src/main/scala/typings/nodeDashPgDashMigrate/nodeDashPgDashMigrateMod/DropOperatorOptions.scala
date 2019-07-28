package typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropOperatorOptions extends js.Object {
  var cascade: js.UndefOr[Boolean] = js.undefined
  var ifExists: js.UndefOr[Boolean] = js.undefined
  var left: js.UndefOr[Name] = js.undefined
  var right: js.UndefOr[Name] = js.undefined
}

object DropOperatorOptions {
  @scala.inline
  def apply(
    cascade: js.UndefOr[Boolean] = js.undefined,
    ifExists: js.UndefOr[Boolean] = js.undefined,
    left: Name = null,
    right: Name = null
  ): DropOperatorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cascade)) __obj.updateDynamic("cascade")(cascade)
    if (!js.isUndefined(ifExists)) __obj.updateDynamic("ifExists")(ifExists)
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropOperatorOptions]
  }
}

