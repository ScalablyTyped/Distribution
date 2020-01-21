package typings.mssql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColumnOptions extends js.Object {
  var nullable: js.UndefOr[Boolean] = js.undefined
  var primary: js.UndefOr[Boolean] = js.undefined
}

object IColumnOptions {
  @scala.inline
  def apply(nullable: js.UndefOr[Boolean] = js.undefined, primary: js.UndefOr[Boolean] = js.undefined): IColumnOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(nullable)) __obj.updateDynamic("nullable")(nullable.asInstanceOf[js.Any])
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColumnOptions]
  }
}

