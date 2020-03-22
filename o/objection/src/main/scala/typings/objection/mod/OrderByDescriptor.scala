package typings.objection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderByDescriptor extends js.Object {
  var column: ColumnRef
  var order: js.UndefOr[OrderByDirection] = js.undefined
}

object OrderByDescriptor {
  @scala.inline
  def apply(column: ColumnRef, order: OrderByDirection = null): OrderByDescriptor = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderByDescriptor]
  }
}

