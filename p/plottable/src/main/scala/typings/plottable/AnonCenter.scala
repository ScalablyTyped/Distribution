package typings.plottable

import typings.plottable.plottableStrings.center
import typings.plottable.plottableStrings.left
import typings.plottable.plottableStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCenter extends js.Object {
  var center: typings.plottable.plottableStrings.center
  var left: typings.plottable.plottableStrings.left
  var right: typings.plottable.plottableStrings.right
}

object AnonCenter {
  @scala.inline
  def apply(center: center, left: left, right: right): AnonCenter = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCenter]
  }
}

