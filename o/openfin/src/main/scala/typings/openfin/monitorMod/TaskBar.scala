package typings.openfin.monitorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskBar extends DipScaleRects {
  var edge: String
  var rect: Rect
}

object TaskBar {
  @scala.inline
  def apply(dipRect: Rect, edge: String, rect: Rect, scaledRect: Rect): TaskBar = {
    val __obj = js.Dynamic.literal(dipRect = dipRect.asInstanceOf[js.Any], edge = edge.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any], scaledRect = scaledRect.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskBar]
  }
}

