package typings.pg.pgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notification extends js.Object {
  var channel: String
  var payload: js.UndefOr[String] = js.undefined
  var processId: Double
}

object Notification {
  @scala.inline
  def apply(channel: String, processId: Double, payload: String = null): Notification = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], processId = processId.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[Notification]
  }
}

