package typings.oakdexDashPokedex.oakdexDashPokedexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemPrice extends js.Object {
  var buying: Double
  var games: js.Array[String]
  var selling: Double
}

object ItemPrice {
  @scala.inline
  def apply(buying: Double, games: js.Array[String], selling: Double): ItemPrice = {
    val __obj = js.Dynamic.literal(buying = buying, games = games, selling = selling)
  
    __obj.asInstanceOf[ItemPrice]
  }
}

