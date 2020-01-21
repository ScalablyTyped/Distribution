package typings.oakdexPokedex.mod

import typings.oakdexPokedex.AnonBug
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PokemonType extends js.Object {
  var color: String
  var effectivness: AnonBug
  var names: Translations
}

object PokemonType {
  @scala.inline
  def apply(color: String, effectivness: AnonBug, names: Translations): PokemonType = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], effectivness = effectivness.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PokemonType]
  }
}

