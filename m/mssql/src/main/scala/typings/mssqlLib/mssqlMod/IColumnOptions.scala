package typings
package mssqlLib.mssqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColumnOptions extends js.Object {
  var nullable: js.UndefOr[scala.Boolean] = js.undefined
  var primary: js.UndefOr[scala.Boolean] = js.undefined
}

object IColumnOptions {
  @scala.inline
  def apply(
    nullable: js.UndefOr[scala.Boolean] = js.undefined,
    primary: js.UndefOr[scala.Boolean] = js.undefined
  ): IColumnOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(nullable)) __obj.updateDynamic("nullable")(nullable)
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary)
    __obj.asInstanceOf[IColumnOptions]
  }
}

