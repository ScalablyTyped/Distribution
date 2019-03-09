package typings
package oakdexDashPokedexLib.oakdexDashPokedexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PokemonType extends js.Object {
  var color: java.lang.String
  var effectivness: oakdexDashPokedexLib.Anon_Bug
  var names: Translations
}

object PokemonType {
  @scala.inline
  def apply(color: java.lang.String, effectivness: oakdexDashPokedexLib.Anon_Bug, names: Translations): PokemonType = {
    val __obj = js.Dynamic.literal(color = color, effectivness = effectivness, names = names)
  
    __obj.asInstanceOf[PokemonType]
  }
}

