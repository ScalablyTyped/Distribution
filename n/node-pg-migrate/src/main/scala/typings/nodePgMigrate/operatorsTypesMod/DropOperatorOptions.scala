package typings.nodePgMigrate.operatorsTypesMod

import typings.nodePgMigrate.generalTypesMod.CascadeOption
import typings.nodePgMigrate.generalTypesMod.IfExistsOption
import typings.nodePgMigrate.generalTypesMod.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropOperatorOptions
  extends IfExistsOption
     with CascadeOption {
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
    if (!js.isUndefined(cascade)) __obj.updateDynamic("cascade")(cascade.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ifExists)) __obj.updateDynamic("ifExists")(ifExists.get.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropOperatorOptions]
  }
}

