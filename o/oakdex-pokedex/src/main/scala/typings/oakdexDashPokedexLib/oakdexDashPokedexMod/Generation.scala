package typings
package oakdexDashPokedexLib.oakdexDashPokedexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Generation extends js.Object {
  var dex_name: java.lang.String
  var games: js.Array[Translations]
  var names: Translations
  var number: scala.Double
}

object Generation {
  @scala.inline
  def apply(
    dex_name: java.lang.String,
    games: js.Array[Translations],
    names: Translations,
    number: scala.Double
  ): Generation = {
    val __obj = js.Dynamic.literal(dex_name = dex_name, games = games, names = names, number = number)
  
    __obj.asInstanceOf[Generation]
  }
}

