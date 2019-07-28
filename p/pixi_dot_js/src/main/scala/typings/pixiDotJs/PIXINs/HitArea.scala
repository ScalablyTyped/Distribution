package typings.pixiDotJs.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HitArea extends js.Object {
  def contains(x: Double, y: Double): Boolean
}

object HitArea {
  @scala.inline
  def apply(contains: (Double, Double) => Boolean): HitArea = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction2(contains))
  
    __obj.asInstanceOf[HitArea]
  }
}

