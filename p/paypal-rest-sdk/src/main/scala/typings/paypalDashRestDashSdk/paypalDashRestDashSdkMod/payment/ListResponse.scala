package typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.payment

import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.Payment
import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListResponse extends Response {
  @JSName("count")
  var count_ListResponse: Double
  var next_id: String
  var payments: js.Array[Payment]
}

object ListResponse {
  @scala.inline
  def apply(
    count: Double,
    httpStatusCode: Double,
    next_id: String,
    payments: js.Array[Payment],
    create_time: String = null,
    total_count: Int | Double = null
  ): ListResponse = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], httpStatusCode = httpStatusCode.asInstanceOf[js.Any], next_id = next_id.asInstanceOf[js.Any], payments = payments.asInstanceOf[js.Any])
    if (create_time != null) __obj.updateDynamic("create_time")(create_time.asInstanceOf[js.Any])
    if (total_count != null) __obj.updateDynamic("total_count")(total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResponse]
  }
}

