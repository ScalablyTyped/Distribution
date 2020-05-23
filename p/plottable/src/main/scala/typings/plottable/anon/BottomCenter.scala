package typings.plottable.anon

import typings.plottable.plottableStrings.bottom
import typings.plottable.plottableStrings.center
import typings.plottable.plottableStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BottomCenter extends js.Object {
  var bottom: typings.plottable.plottableStrings.bottom
  var center: typings.plottable.plottableStrings.center
  var top: typings.plottable.plottableStrings.top
}

object BottomCenter {
  @scala.inline
  def apply(bottom: bottom, center: center, top: top): BottomCenter = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[BottomCenter]
  }
}

