package typings.paypalRestSdk.mod

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
    count: js.UndefOr[Double] = js.undefined,
    create_time: String = null,
    total_count: js.UndefOr[Double] = js.undefined
  ): Response = {
    val __obj = js.Dynamic.literal(httpStatusCode = httpStatusCode.asInstanceOf[js.Any])
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (create_time != null) __obj.updateDynamic("create_time")(create_time.asInstanceOf[js.Any])
    if (!js.isUndefined(total_count)) __obj.updateDynamic("total_count")(total_count.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
}

