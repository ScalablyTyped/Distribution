package typings.plottable.anon

import typings.plottable.plottableStrings.bottom
import typings.plottable.plottableStrings.left
import typings.plottable.plottableStrings.right
import typings.plottable.plottableStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bottom extends js.Object {
  var bottom: typings.plottable.plottableStrings.bottom
  var left: typings.plottable.plottableStrings.left
  var right: typings.plottable.plottableStrings.right
  var top: typings.plottable.plottableStrings.top
}

object Bottom {
  @scala.inline
  def apply(bottom: bottom, left: left, right: right, top: top): Bottom = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bottom]
  }
}

