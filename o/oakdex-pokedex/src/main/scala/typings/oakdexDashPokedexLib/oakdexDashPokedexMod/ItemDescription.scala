package typings
package oakdexDashPokedexLib.oakdexDashPokedexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemDescription extends js.Object {
  var games: js.Array[java.lang.String]
  var translations: Translations
}

object ItemDescription {
  @scala.inline
  def apply(games: js.Array[java.lang.String], translations: Translations): ItemDescription = {
    val __obj = js.Dynamic.literal(games = games, translations = translations)
  
    __obj.asInstanceOf[ItemDescription]
  }
}

