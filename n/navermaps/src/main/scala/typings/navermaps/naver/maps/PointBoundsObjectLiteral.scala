package typings.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointBoundsObjectLiteral extends js.Object {
  var maxX: Double
  var maxY: Double
  var minX: Double
  var minY: Double
}

object PointBoundsObjectLiteral {
  @scala.inline
  def apply(maxX: Double, maxY: Double, minX: Double, minY: Double): PointBoundsObjectLiteral = {
    val __obj = js.Dynamic.literal(maxX = maxX.asInstanceOf[js.Any], maxY = maxY.asInstanceOf[js.Any], minX = minX.asInstanceOf[js.Any], minY = minY.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointBoundsObjectLiteral]
  }
}

