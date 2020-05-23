package typings.plottable.anon

import typings.plottable.plottableStrings.between
import typings.plottable.plottableStrings.center
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Between extends js.Object {
  var between: typings.plottable.plottableStrings.between
  var center: typings.plottable.plottableStrings.center
}

object Between {
  @scala.inline
  def apply(between: between, center: center): Between = {
    val __obj = js.Dynamic.literal(between = between.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any])
    __obj.asInstanceOf[Between]
  }
}

