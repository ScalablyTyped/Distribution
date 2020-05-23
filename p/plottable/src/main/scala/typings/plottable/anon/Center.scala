package typings.plottable.anon

import typings.plottable.plottableStrings.center
import typings.plottable.plottableStrings.left
import typings.plottable.plottableStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Center extends js.Object {
  var center: typings.plottable.plottableStrings.center
  var left: typings.plottable.plottableStrings.left
  var right: typings.plottable.plottableStrings.right
}

object Center {
  @scala.inline
  def apply(center: center, left: left, right: right): Center = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[Center]
  }
}

