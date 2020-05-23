package typings.plottable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CenterX extends js.Object {
  var centerX: Double
  var centerY: Double
}

object CenterX {
  @scala.inline
  def apply(centerX: Double, centerY: Double): CenterX = {
    val __obj = js.Dynamic.literal(centerX = centerX.asInstanceOf[js.Any], centerY = centerY.asInstanceOf[js.Any])
    __obj.asInstanceOf[CenterX]
  }
}

