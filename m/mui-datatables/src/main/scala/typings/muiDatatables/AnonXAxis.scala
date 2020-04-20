package typings.muiDatatables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonXAxis extends js.Object {
  var xAxis: Boolean
  var yAxis: Boolean
}

object AnonXAxis {
  @scala.inline
  def apply(xAxis: Boolean, yAxis: Boolean): AnonXAxis = {
    val __obj = js.Dynamic.literal(xAxis = xAxis.asInstanceOf[js.Any], yAxis = yAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonXAxis]
  }
}

