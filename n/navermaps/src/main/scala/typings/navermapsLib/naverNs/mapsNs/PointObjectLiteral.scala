package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointObjectLiteral extends js.Object {
  var x: scala.Double
  var y: scala.Double
}

object PointObjectLiteral {
  @scala.inline
  def apply(x: scala.Double, y: scala.Double): PointObjectLiteral = {
    val __obj = js.Dynamic.literal(x = x, y = y)
  
    __obj.asInstanceOf[PointObjectLiteral]
  }
}

