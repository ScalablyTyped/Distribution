package typings.oakdexPokedex.mod

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
    val __obj = js.Dynamic.literal(generations = generations.asInstanceOf[js.Any], pocket = pocket.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ItemPocket]
  }
}

