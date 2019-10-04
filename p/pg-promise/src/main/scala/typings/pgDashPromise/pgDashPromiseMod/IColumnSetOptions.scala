package typings.pgDashPromise.pgDashPromiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColumnSetOptions extends js.Object {
  var inherit: js.UndefOr[Boolean] = js.undefined
  var table: js.UndefOr[String | ITable | TableName] = js.undefined
}

object IColumnSetOptions {
  @scala.inline
  def apply(inherit: js.UndefOr[Boolean] = js.undefined, table: String | ITable | TableName = null): IColumnSetOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(inherit)) __obj.updateDynamic("inherit")(inherit)
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColumnSetOptions]
  }
}

