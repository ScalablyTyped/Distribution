package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileIndex extends js.Object {
  var xIndex: scala.Double
  var yIndex: scala.Double
}

object TileIndex {
  @scala.inline
  def apply(xIndex: scala.Double, yIndex: scala.Double): TileIndex = {
    val __obj = js.Dynamic.literal(xIndex = xIndex, yIndex = yIndex)
  
    __obj.asInstanceOf[TileIndex]
  }
}

