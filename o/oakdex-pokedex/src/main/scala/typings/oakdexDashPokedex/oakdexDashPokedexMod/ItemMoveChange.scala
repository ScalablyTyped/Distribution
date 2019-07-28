package typings.oakdexDashPokedex.oakdexDashPokedexMod

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
    change_by: Int | Double = null,
    change_by_max: Int | Double = null,
    change_by_percent: Int | Double = null
  ): ItemMoveChange = {
    val __obj = js.Dynamic.literal(field = field)
    if (change_by != null) __obj.updateDynamic("change_by")(change_by.asInstanceOf[js.Any])
    if (change_by_max != null) __obj.updateDynamic("change_by_max")(change_by_max.asInstanceOf[js.Any])
    if (change_by_percent != null) __obj.updateDynamic("change_by_percent")(change_by_percent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemMoveChange]
  }
}

