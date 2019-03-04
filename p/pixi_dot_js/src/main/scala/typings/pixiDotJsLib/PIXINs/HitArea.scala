package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HitArea extends js.Object {
  def contains(x: scala.Double, y: scala.Double): scala.Boolean
}

object HitArea {
  @scala.inline
  def apply(contains: js.Function2[scala.Double, scala.Double, scala.Boolean]): HitArea = {
    val __obj = js.Dynamic.literal(contains = contains)
  
    __obj.asInstanceOf[HitArea]
  }
}

