package typings.oakdexPokedex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Generation extends js.Object {
  var dex_name: String
  var games: js.Array[Translations]
  var names: Translations
  var number: Double
}

object Generation {
  @scala.inline
  def apply(dex_name: String, games: js.Array[Translations], names: Translations, number: Double): Generation = {
    val __obj = js.Dynamic.literal(dex_name = dex_name.asInstanceOf[js.Any], games = games.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[Generation]
  }
}

