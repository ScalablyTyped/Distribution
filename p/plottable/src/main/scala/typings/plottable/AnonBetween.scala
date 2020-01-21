package typings.plottable

import typings.plottable.plottableStrings.between
import typings.plottable.plottableStrings.center
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBetween extends js.Object {
  var between: typings.plottable.plottableStrings.between
  var center: typings.plottable.plottableStrings.center
}

object AnonBetween {
  @scala.inline
  def apply(between: between, center: center): AnonBetween = {
    val __obj = js.Dynamic.literal(between = between.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBetween]
  }
}

