package typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  val count: js.UndefOr[Double] = js.undefined
  val create_time: js.UndefOr[String] = js.undefined
  val httpStatusCode: Double
  val total_count: js.UndefOr[Double] = js.undefined
}

object Response {
  @scala.inline
  def apply(
    httpStatusCode: Double,
    count: Int | Double = null,
    create_time: String = null,
    total_count: Int | Double = null
  ): Response = {
    val __obj = js.Dynamic.literal(httpStatusCode = httpStatusCode)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (create_time != null) __obj.updateDynamic("create_time")(create_time)
    if (total_count != null) __obj.updateDynamic("total_count")(total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
}

