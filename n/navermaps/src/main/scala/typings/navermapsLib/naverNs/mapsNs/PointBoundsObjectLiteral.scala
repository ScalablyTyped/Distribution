package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointBoundsObjectLiteral extends js.Object {
  var maxX: scala.Double
  var maxY: scala.Double
  var minX: scala.Double
  var minY: scala.Double
}

object PointBoundsObjectLiteral {
  @scala.inline
  def apply(maxX: scala.Double, maxY: scala.Double, minX: scala.Double, minY: scala.Double): PointBoundsObjectLiteral = {
    val __obj = js.Dynamic.literal(maxX = maxX, maxY = maxY, minX = minX, minY = minY)
  
    __obj.asInstanceOf[PointBoundsObjectLiteral]
  }
}

