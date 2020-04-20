package typings.openfin.monitorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DipScaleRects extends js.Object {
  var dipRect: Rect
  var scaledRect: Rect
}

object DipScaleRects {
  @scala.inline
  def apply(dipRect: Rect, scaledRect: Rect): DipScaleRects = {
    val __obj = js.Dynamic.literal(dipRect = dipRect.asInstanceOf[js.Any], scaledRect = scaledRect.asInstanceOf[js.Any])
    __obj.asInstanceOf[DipScaleRects]
  }
}

