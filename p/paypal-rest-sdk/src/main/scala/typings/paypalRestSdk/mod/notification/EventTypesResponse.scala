package typings.paypalRestSdk.mod.notification

import typings.paypalRestSdk.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventTypesResponse extends Response {
  val event_types: js.Array[NotificationEventType] = js.native
}

object EventTypesResponse {
  @scala.inline
  def apply(event_types: js.Array[NotificationEventType], httpStatusCode: Double): EventTypesResponse = {
    val __obj = js.Dynamic.literal(event_types = event_types.asInstanceOf[js.Any], httpStatusCode = httpStatusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventTypesResponse]
  }
  @scala.inline
  implicit class EventTypesResponseOps[Self <: EventTypesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEvent_typesVarargs(value: NotificationEventType*): Self = this.set("event_types", js.Array(value :_*))
    @scala.inline
    def setEvent_types(value: js.Array[NotificationEventType]): Self = this.set("event_types", value.asInstanceOf[js.Any])
  }
  
}

