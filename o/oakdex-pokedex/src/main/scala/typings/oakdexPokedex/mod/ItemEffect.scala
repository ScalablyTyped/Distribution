package typings.oakdexPokedex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemEffect extends js.Object {
  var condition: String
  var move_changes: js.UndefOr[js.Array[ItemMoveChange]] = js.undefined
  var pokemon_changes: js.UndefOr[js.Array[ItemPokemonChange]] = js.undefined
  var target: String
  var triggers_evolution: js.UndefOr[Boolean] = js.undefined
}

object ItemEffect {
  @scala.inline
  def apply(
    condition: String,
    target: String,
    move_changes: js.Array[ItemMoveChange] = null,
    pokemon_changes: js.Array[ItemPokemonChange] = null,
    triggers_evolution: js.UndefOr[Boolean] = js.undefined
  ): ItemEffect = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    if (move_changes != null) __obj.updateDynamic("move_changes")(move_changes.asInstanceOf[js.Any])
    if (pokemon_changes != null) __obj.updateDynamic("pokemon_changes")(pokemon_changes.asInstanceOf[js.Any])
    if (!js.isUndefined(triggers_evolution)) __obj.updateDynamic("triggers_evolution")(triggers_evolution.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemEffect]
  }
}

