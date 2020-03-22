package typings.openfin.monitorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DipRect extends Rect {
  var dipRect: Rect
  var scaledRect: Rect
}

object DipRect {
  @scala.inline
  def apply(bottom: Double, dipRect: Rect, left: Double, right: Double, scaledRect: Rect, top: Double): DipRect = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], dipRect = dipRect.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], scaledRect = scaledRect.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DipRect]
  }
}

