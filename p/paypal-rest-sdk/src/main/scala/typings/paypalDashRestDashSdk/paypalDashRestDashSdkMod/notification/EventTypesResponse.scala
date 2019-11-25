package typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.notification

import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.Response
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
    count: Int | Double = null,
    create_time: String = null,
    total_count: Int | Double = null
  ): EventTypesResponse = {
    val __obj = js.Dynamic.literal(event_types = event_types.asInstanceOf[js.Any], httpStatusCode = httpStatusCode.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (create_time != null) __obj.updateDynamic("create_time")(create_time.asInstanceOf[js.Any])
    if (total_count != null) __obj.updateDynamic("total_count")(total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventTypesResponse]
  }
}

