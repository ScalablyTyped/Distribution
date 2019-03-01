package typings
package paypalDashRestDashSdkLib.paypalDashRestDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  val count: js.UndefOr[scala.Double] = js.undefined
  val create_time: js.UndefOr[java.lang.String] = js.undefined
  val httpStatusCode: scala.Double
  val total_count: js.UndefOr[scala.Double] = js.undefined
}

object Response {
  @scala.inline
  def apply(
    httpStatusCode: scala.Double,
    count: scala.Int | scala.Double = null,
    create_time: java.lang.String = null,
    total_count: scala.Int | scala.Double = null
  ): Response = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("httpStatusCode")(httpStatusCode)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (create_time != null) __obj.updateDynamic("create_time")(create_time)
    if (total_count != null) __obj.updateDynamic("total_count")(total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
}

