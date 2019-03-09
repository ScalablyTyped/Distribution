package typings
package oakdexDashPokedexLib.oakdexDashPokedexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemPokemonChange extends js.Object {
  var change: js.UndefOr[java.lang.String] = js.undefined
  var change_by: js.UndefOr[scala.Double] = js.undefined
  var change_by_percent: js.UndefOr[scala.Double] = js.undefined
  var conditions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var field: java.lang.String
  var revive: js.UndefOr[scala.Boolean] = js.undefined
}

object ItemPokemonChange {
  @scala.inline
  def apply(
    field: java.lang.String,
    change: java.lang.String = null,
    change_by: scala.Int | scala.Double = null,
    change_by_percent: scala.Int | scala.Double = null,
    conditions: js.Array[java.lang.String] = null,
    revive: js.UndefOr[scala.Boolean] = js.undefined
  ): ItemPokemonChange = {
    val __obj = js.Dynamic.literal(field = field)
    if (change != null) __obj.updateDynamic("change")(change)
    if (change_by != null) __obj.updateDynamic("change_by")(change_by.asInstanceOf[js.Any])
    if (change_by_percent != null) __obj.updateDynamic("change_by_percent")(change_by_percent.asInstanceOf[js.Any])
    if (conditions != null) __obj.updateDynamic("conditions")(conditions)
    if (!js.isUndefined(revive)) __obj.updateDynamic("revive")(revive)
    __obj.asInstanceOf[ItemPokemonChange]
  }
}

