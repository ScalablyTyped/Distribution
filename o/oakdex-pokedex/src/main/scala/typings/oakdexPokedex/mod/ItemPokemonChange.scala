package typings.oakdexPokedex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemPokemonChange extends js.Object {
  var change: js.UndefOr[String] = js.undefined
  var change_by: js.UndefOr[Double] = js.undefined
  var change_by_percent: js.UndefOr[Double] = js.undefined
  var conditions: js.UndefOr[js.Array[String]] = js.undefined
  var field: String
  var revive: js.UndefOr[Boolean] = js.undefined
}

object ItemPokemonChange {
  @scala.inline
  def apply(
    field: String,
    change: String = null,
    change_by: Int | Double = null,
    change_by_percent: Int | Double = null,
    conditions: js.Array[String] = null,
    revive: js.UndefOr[Boolean] = js.undefined
  ): ItemPokemonChange = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(change.asInstanceOf[js.Any])
    if (change_by != null) __obj.updateDynamic("change_by")(change_by.asInstanceOf[js.Any])
    if (change_by_percent != null) __obj.updateDynamic("change_by_percent")(change_by_percent.asInstanceOf[js.Any])
    if (conditions != null) __obj.updateDynamic("conditions")(conditions.asInstanceOf[js.Any])
    if (!js.isUndefined(revive)) __obj.updateDynamic("revive")(revive.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemPokemonChange]
  }
}

