package typings.plottable

import typings.plottable.plottableStrings.bottom
import typings.plottable.plottableStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTop extends js.Object {
  var bottom: typings.plottable.plottableStrings.bottom
  var top: typings.plottable.plottableStrings.top
}

object AnonTop {
  @scala.inline
  def apply(bottom: bottom, top: top): AnonTop = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTop]
  }
}

