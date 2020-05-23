package typings.oakdexPokedex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PokemonAbility extends js.Object {
  var hidden: js.UndefOr[Boolean] = js.undefined
  var name: String
}

object PokemonAbility {
  @scala.inline
  def apply(name: String, hidden: js.UndefOr[Boolean] = js.undefined): PokemonAbility = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PokemonAbility]
  }
}

