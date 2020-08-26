package typings.oakdexPokedex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PokemonEvolution extends js.Object {
  var conditions: js.UndefOr[js.Array[String]] = js.native
  var happiness: js.UndefOr[Boolean] = js.native
  var hold_item: js.UndefOr[String] = js.native
  var item: js.UndefOr[String] = js.native
  var level: js.UndefOr[Double] = js.native
  var level_up: js.UndefOr[Boolean] = js.native
  var move_learned: js.UndefOr[String] = js.native
  var to: String = js.native
  var trade: js.UndefOr[Boolean] = js.native
}

object PokemonEvolution {
  @scala.inline
  def apply(to: String): PokemonEvolution = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[PokemonEvolution]
  }
  @scala.inline
  implicit class PokemonEvolutionOps[Self <: PokemonEvolution] (val x: Self) extends AnyVal {
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
    def setTo(value: String): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def setConditionsVarargs(value: String*): Self = this.set("conditions", js.Array(value :_*))
    @scala.inline
    def setConditions(value: js.Array[String]): Self = this.set("conditions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConditions: Self = this.set("conditions", js.undefined)
    @scala.inline
    def setHappiness(value: Boolean): Self = this.set("happiness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHappiness: Self = this.set("happiness", js.undefined)
    @scala.inline
    def setHold_item(value: String): Self = this.set("hold_item", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHold_item: Self = this.set("hold_item", js.undefined)
    @scala.inline
    def setItem(value: String): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    @scala.inline
    def setLevel_up(value: Boolean): Self = this.set("level_up", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevel_up: Self = this.set("level_up", js.undefined)
    @scala.inline
    def setMove_learned(value: String): Self = this.set("move_learned", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMove_learned: Self = this.set("move_learned", js.undefined)
    @scala.inline
    def setTrade(value: Boolean): Self = this.set("trade", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrade: Self = this.set("trade", js.undefined)
  }
  
}

