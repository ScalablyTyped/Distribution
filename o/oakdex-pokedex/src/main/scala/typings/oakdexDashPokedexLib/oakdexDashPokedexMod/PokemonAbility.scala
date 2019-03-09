package typings
package oakdexDashPokedexLib.oakdexDashPokedexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PokemonAbility extends js.Object {
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  var name: java.lang.String
}

object PokemonAbility {
  @scala.inline
  def apply(name: java.lang.String, hidden: js.UndefOr[scala.Boolean] = js.undefined): PokemonAbility = {
    val __obj = js.Dynamic.literal(name = name)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    __obj.asInstanceOf[PokemonAbility]
  }
}

