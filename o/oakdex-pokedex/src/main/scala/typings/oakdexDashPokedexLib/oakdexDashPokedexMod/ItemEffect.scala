package typings
package oakdexDashPokedexLib.oakdexDashPokedexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemEffect extends js.Object {
  var condition: java.lang.String
  var move_changes: js.UndefOr[js.Array[ItemMoveChange]] = js.undefined
  var pokemon_changes: js.UndefOr[js.Array[ItemPokemonChange]] = js.undefined
  var target: java.lang.String
  var triggers_evolution: js.UndefOr[scala.Boolean] = js.undefined
}

object ItemEffect {
  @scala.inline
  def apply(
    condition: java.lang.String,
    target: java.lang.String,
    move_changes: js.Array[ItemMoveChange] = null,
    pokemon_changes: js.Array[ItemPokemonChange] = null,
    triggers_evolution: js.UndefOr[scala.Boolean] = js.undefined
  ): ItemEffect = {
    val __obj = js.Dynamic.literal(condition = condition, target = target)
    if (move_changes != null) __obj.updateDynamic("move_changes")(move_changes)
    if (pokemon_changes != null) __obj.updateDynamic("pokemon_changes")(pokemon_changes)
    if (!js.isUndefined(triggers_evolution)) __obj.updateDynamic("triggers_evolution")(triggers_evolution)
    __obj.asInstanceOf[ItemEffect]
  }
}

