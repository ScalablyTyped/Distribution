package typings
package paypalDashRestDashSdkLib.paypalDashRestDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterOptions extends js.Object {
  var end_time: java.lang.String
  var page_size: scala.Double
  var start_time: java.lang.String
}

object FilterOptions {
  @scala.inline
  def apply(end_time: java.lang.String, page_size: scala.Double, start_time: java.lang.String): FilterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end_time")(end_time)
    __obj.updateDynamic("page_size")(page_size)
    __obj.updateDynamic("start_time")(start_time)
    __obj.asInstanceOf[FilterOptions]
  }
}

