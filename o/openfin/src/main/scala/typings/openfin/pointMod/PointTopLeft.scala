package typings.openfin.pointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointTopLeft extends js.Object {
  var left: Double
  var top: Double
}

object PointTopLeft {
  @scala.inline
  def apply(left: Double, top: Double): PointTopLeft = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PointTopLeft]
  }
}

