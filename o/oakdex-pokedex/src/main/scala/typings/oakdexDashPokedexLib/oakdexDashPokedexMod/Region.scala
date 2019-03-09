package typings
package oakdexDashPokedexLib.oakdexDashPokedexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Region extends js.Object {
  var locations: js.Array[Location]
  var names: Translations
}

object Region {
  @scala.inline
  def apply(locations: js.Array[Location], names: Translations): Region = {
    val __obj = js.Dynamic.literal(locations = locations, names = names)
  
    __obj.asInstanceOf[Region]
  }
}

