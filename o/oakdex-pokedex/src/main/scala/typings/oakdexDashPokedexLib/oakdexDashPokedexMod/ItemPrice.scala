package typings
package oakdexDashPokedexLib.oakdexDashPokedexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemPrice extends js.Object {
  var buying: scala.Double
  var games: js.Array[java.lang.String]
  var selling: scala.Double
}

object ItemPrice {
  @scala.inline
  def apply(buying: scala.Double, games: js.Array[java.lang.String], selling: scala.Double): ItemPrice = {
    val __obj = js.Dynamic.literal(buying = buying, games = games, selling = selling)
  
    __obj.asInstanceOf[ItemPrice]
  }
}

