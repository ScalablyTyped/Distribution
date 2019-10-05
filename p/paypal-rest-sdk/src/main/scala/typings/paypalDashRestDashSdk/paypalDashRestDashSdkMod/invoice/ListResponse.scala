package typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.invoice

import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListResponse extends Response {
  var invoices: js.Array[Invoice]
}

object ListResponse {
  @scala.inline
  def apply(
    httpStatusCode: Double,
    invoices: js.Array[Invoice],
    count: Int | Double = null,
    create_time: String = null,
    total_count: Int | Double = null
  ): ListResponse = {
    val __obj = js.Dynamic.literal(httpStatusCode = httpStatusCode, invoices = invoices)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (create_time != null) __obj.updateDynamic("create_time")(create_time)
    if (total_count != null) __obj.updateDynamic("total_count")(total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResponse]
  }
}

