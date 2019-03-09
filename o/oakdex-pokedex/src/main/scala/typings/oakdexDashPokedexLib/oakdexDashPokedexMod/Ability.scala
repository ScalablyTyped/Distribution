package typings
package oakdexDashPokedexLib.oakdexDashPokedexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ability extends js.Object {
  var descriptions: Translations
  var index_number: scala.Double
  var names: Translations
}

object Ability {
  @scala.inline
  def apply(descriptions: Translations, index_number: scala.Double, names: Translations): Ability = {
    val __obj = js.Dynamic.literal(descriptions = descriptions, index_number = index_number, names = names)
  
    __obj.asInstanceOf[Ability]
  }
}

