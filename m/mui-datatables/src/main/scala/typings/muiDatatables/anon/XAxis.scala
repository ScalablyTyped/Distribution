package typings.muiDatatables.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XAxis extends js.Object {
  var xAxis: Boolean
  var yAxis: Boolean
}

object XAxis {
  @scala.inline
  def apply(xAxis: Boolean, yAxis: Boolean): XAxis = {
    val __obj = js.Dynamic.literal(xAxis = xAxis.asInstanceOf[js.Any], yAxis = yAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[XAxis]
  }
}

