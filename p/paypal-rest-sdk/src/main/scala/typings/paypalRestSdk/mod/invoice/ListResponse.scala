package typings.paypalRestSdk.mod.invoice

import typings.paypalRestSdk.mod.Response
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
    count: js.UndefOr[Double] = js.undefined,
    create_time: String = null,
    total_count: js.UndefOr[Double] = js.undefined
  ): ListResponse = {
    val __obj = js.Dynamic.literal(httpStatusCode = httpStatusCode.asInstanceOf[js.Any], invoices = invoices.asInstanceOf[js.Any])
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (create_time != null) __obj.updateDynamic("create_time")(create_time.asInstanceOf[js.Any])
    if (!js.isUndefined(total_count)) __obj.updateDynamic("total_count")(total_count.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResponse]
  }
}

