package typings.oakdexPokedex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemDescription extends js.Object {
  var games: js.Array[String]
  var translations: Translations
}

object ItemDescription {
  @scala.inline
  def apply(games: js.Array[String], translations: Translations): ItemDescription = {
    val __obj = js.Dynamic.literal(games = games.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemDescription]
  }
}

