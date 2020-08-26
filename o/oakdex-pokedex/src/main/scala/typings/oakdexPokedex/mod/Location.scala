package typings.oakdexPokedex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Location extends js.Object {
  var names: Translations = js.native
  var pokemon: js.Array[LocationPokemon] = js.native
}

object Location {
  @scala.inline
  def apply(names: Translations, pokemon: js.Array[LocationPokemon]): Location = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any], pokemon = pokemon.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
  @scala.inline
  implicit class LocationOps[Self <: Location] (val x: Self) extends AnyVal {
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
    def setNames(value: Translations): Self = this.set("names", value.asInstanceOf[js.Any])
    @scala.inline
    def setPokemonVarargs(value: LocationPokemon*): Self = this.set("pokemon", js.Array(value :_*))
    @scala.inline
    def setPokemon(value: js.Array[LocationPokemon]): Self = this.set("pokemon", value.asInstanceOf[js.Any])
  }
  
}

