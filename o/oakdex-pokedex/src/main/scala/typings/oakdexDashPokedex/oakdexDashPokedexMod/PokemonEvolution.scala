package typings.oakdexDashPokedex.oakdexDashPokedexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PokemonEvolution extends js.Object {
  var conditions: js.UndefOr[js.Array[String]] = js.undefined
  var happiness: js.UndefOr[Boolean] = js.undefined
  var hold_item: js.UndefOr[String] = js.undefined
  var item: js.UndefOr[String] = js.undefined
  var level: js.UndefOr[Double] = js.undefined
  var level_up: js.UndefOr[Boolean] = js.undefined
  var move_learned: js.UndefOr[String] = js.undefined
  var to: String
  var trade: js.UndefOr[Boolean] = js.undefined
}

object PokemonEvolution {
  @scala.inline
  def apply(
    to: String,
    conditions: js.Array[String] = null,
    happiness: js.UndefOr[Boolean] = js.undefined,
    hold_item: String = null,
    item: String = null,
    level: Int | Double = null,
    level_up: js.UndefOr[Boolean] = js.undefined,
    move_learned: String = null,
    trade: js.UndefOr[Boolean] = js.undefined
  ): PokemonEvolution = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    if (conditions != null) __obj.updateDynamic("conditions")(conditions.asInstanceOf[js.Any])
    if (!js.isUndefined(happiness)) __obj.updateDynamic("happiness")(happiness.asInstanceOf[js.Any])
    if (hold_item != null) __obj.updateDynamic("hold_item")(hold_item.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (!js.isUndefined(level_up)) __obj.updateDynamic("level_up")(level_up.asInstanceOf[js.Any])
    if (move_learned != null) __obj.updateDynamic("move_learned")(move_learned.asInstanceOf[js.Any])
    if (!js.isUndefined(trade)) __obj.updateDynamic("trade")(trade.asInstanceOf[js.Any])
    __obj.asInstanceOf[PokemonEvolution]
  }
}

