package typings.openfin.transportMod

import typings.openfin.anon.NotificationId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationEvent extends js.Object {
  var payload: NotificationId
  var `type`: String | js.Symbol
}

object NotificationEvent {
  @scala.inline
  def apply(payload: NotificationId, `type`: String | js.Symbol): NotificationEvent = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationEvent]
  }
}

