package typings.oakdexPokedex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  var names: Translations
  var pokemon: js.Array[LocationPokemon]
}

object Location {
  @scala.inline
  def apply(names: Translations, pokemon: js.Array[LocationPokemon]): Location = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any], pokemon = pokemon.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Location]
  }
}

