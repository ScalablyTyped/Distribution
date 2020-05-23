package typings.paypalRestSdk.mod.notification

import typings.paypalRestSdk.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventTypesResponse extends Response {
  val event_types: js.Array[NotificationEventType]
}

object EventTypesResponse {
  @scala.inline
  def apply(
    event_types: js.Array[NotificationEventType],
    httpStatusCode: Double,
    count: js.UndefOr[Double] = js.undefined,
    create_time: String = null,
    total_count: js.UndefOr[Double] = js.undefined
  ): EventTypesResponse = {
    val __obj = js.Dynamic.literal(event_types = event_types.asInstanceOf[js.Any], httpStatusCode = httpStatusCode.asInstanceOf[js.Any])
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (create_time != null) __obj.updateDynamic("create_time")(create_time.asInstanceOf[js.Any])
    if (!js.isUndefined(total_count)) __obj.updateDynamic("total_count")(total_count.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventTypesResponse]
  }
}

