package typings
package oakdexDashPokedexLib.oakdexDashPokedexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemPocket extends js.Object {
  var generations: js.Array[scala.Double]
  var pocket: java.lang.String
}

object ItemPocket {
  @scala.inline
  def apply(generations: js.Array[scala.Double], pocket: java.lang.String): ItemPocket = {
    val __obj = js.Dynamic.literal(generations = generations, pocket = pocket)
  
    __obj.asInstanceOf[ItemPocket]
  }
}

