package typings.oakdexPokedex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemEffect extends js.Object {
  var condition: String = js.native
  var move_changes: js.UndefOr[js.Array[ItemMoveChange]] = js.native
  var pokemon_changes: js.UndefOr[js.Array[ItemPokemonChange]] = js.native
  var target: String = js.native
  var triggers_evolution: js.UndefOr[Boolean] = js.native
}

object ItemEffect {
  @scala.inline
  def apply(condition: String, target: String): ItemEffect = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemEffect]
  }
  @scala.inline
  implicit class ItemEffectOps[Self <: ItemEffect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCondition(value: String): Self = this.set("condition", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setMove_changesVarargs(value: ItemMoveChange*): Self = this.set("move_changes", js.Array(value :_*))
    @scala.inline
    def setMove_changes(value: js.Array[ItemMoveChange]): Self = this.set("move_changes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMove_changes: Self = this.set("move_changes", js.undefined)
    @scala.inline
    def setPokemon_changesVarargs(value: ItemPokemonChange*): Self = this.set("pokemon_changes", js.Array(value :_*))
    @scala.inline
    def setPokemon_changes(value: js.Array[ItemPokemonChange]): Self = this.set("pokemon_changes", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePokemon_changes: Self = this.set("pokemon_changes", js.undefined)
    @scala.inline
    def setTriggers_evolution(value: Boolean): Self = this.set("triggers_evolution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTriggers_evolution: Self = this.set("triggers_evolution", js.undefined)
  }
  
}

