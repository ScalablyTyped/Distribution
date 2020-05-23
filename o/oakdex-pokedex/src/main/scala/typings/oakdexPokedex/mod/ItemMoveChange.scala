package typings.oakdexPokedex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemMoveChange extends js.Object {
  var change_by: js.UndefOr[Double] = js.undefined
  var change_by_max: js.UndefOr[Double] = js.undefined
  var change_by_percent: js.UndefOr[Double] = js.undefined
  var field: String
}

object ItemMoveChange {
  @scala.inline
  def apply(
    field: String,
    change_by: js.UndefOr[Double] = js.undefined,
    change_by_max: js.UndefOr[Double] = js.undefined,
    change_by_percent: js.UndefOr[Double] = js.undefined
  ): ItemMoveChange = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    if (!js.isUndefined(change_by)) __obj.updateDynamic("change_by")(change_by.get.asInstanceOf[js.Any])
    if (!js.isUndefined(change_by_max)) __obj.updateDynamic("change_by_max")(change_by_max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(change_by_percent)) __obj.updateDynamic("change_by_percent")(change_by_percent.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemMoveChange]
  }
}

