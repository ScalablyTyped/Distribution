package typings.oakdexPokedex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ability extends js.Object {
  var descriptions: Translations
  var index_number: Double
  var names: Translations
}

object Ability {
  @scala.inline
  def apply(descriptions: Translations, index_number: Double, names: Translations): Ability = {
    val __obj = js.Dynamic.literal(descriptions = descriptions.asInstanceOf[js.Any], index_number = index_number.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Ability]
  }
}

