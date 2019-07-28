package typings.oakdexDashPokedex.oakdexDashPokedexMod

import typings.oakdexDashPokedex.Anon_Bug
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PokemonType extends js.Object {
  var color: String
  var effectivness: Anon_Bug
  var names: Translations
}

object PokemonType {
  @scala.inline
  def apply(color: String, effectivness: Anon_Bug, names: Translations): PokemonType = {
    val __obj = js.Dynamic.literal(color = color, effectivness = effectivness, names = names)
  
    __obj.asInstanceOf[PokemonType]
  }
}

