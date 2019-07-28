package typings.oakdexDashPokedex.oakdexDashPokedexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemPocket extends js.Object {
  var generations: js.Array[Double]
  var pocket: String
}

object ItemPocket {
  @scala.inline
  def apply(generations: js.Array[Double], pocket: String): ItemPocket = {
    val __obj = js.Dynamic.literal(generations = generations, pocket = pocket)
  
    __obj.asInstanceOf[ItemPocket]
  }
}

