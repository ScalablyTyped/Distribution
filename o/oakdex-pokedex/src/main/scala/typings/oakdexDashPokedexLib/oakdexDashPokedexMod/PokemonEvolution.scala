package typings
package oakdexDashPokedexLib.oakdexDashPokedexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PokemonEvolution extends js.Object {
  var conditions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var happiness: js.UndefOr[scala.Boolean] = js.undefined
  var hold_item: js.UndefOr[java.lang.String] = js.undefined
  var item: js.UndefOr[java.lang.String] = js.undefined
  var level: js.UndefOr[scala.Double] = js.undefined
  var level_up: js.UndefOr[scala.Boolean] = js.undefined
  var move_learned: js.UndefOr[java.lang.String] = js.undefined
  var to: java.lang.String
  var trade: js.UndefOr[scala.Boolean] = js.undefined
}

object PokemonEvolution {
  @scala.inline
  def apply(
    to: java.lang.String,
    conditions: js.Array[java.lang.String] = null,
    happiness: js.UndefOr[scala.Boolean] = js.undefined,
    hold_item: java.lang.String = null,
    item: java.lang.String = null,
    level: scala.Int | scala.Double = null,
    level_up: js.UndefOr[scala.Boolean] = js.undefined,
    move_learned: java.lang.String = null,
    trade: js.UndefOr[scala.Boolean] = js.undefined
  ): PokemonEvolution = {
    val __obj = js.Dynamic.literal(to = to)
    if (conditions != null) __obj.updateDynamic("conditions")(conditions)
    if (!js.isUndefined(happiness)) __obj.updateDynamic("happiness")(happiness)
    if (hold_item != null) __obj.updateDynamic("hold_item")(hold_item)
    if (item != null) __obj.updateDynamic("item")(item)
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (!js.isUndefined(level_up)) __obj.updateDynamic("level_up")(level_up)
    if (move_learned != null) __obj.updateDynamic("move_learned")(move_learned)
    if (!js.isUndefined(trade)) __obj.updateDynamic("trade")(trade)
    __obj.asInstanceOf[PokemonEvolution]
  }
}

