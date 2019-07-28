package typings.pebblekitjs.PebbleKitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var payload: js.UndefOr[js.Object] = js.undefined
  var response: js.UndefOr[String] = js.undefined
  var `type`: String
}

object Event {
  @scala.inline
  def apply(`type`: String, payload: js.Object = null, response: String = null): Event = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (payload != null) __obj.updateDynamic("payload")(payload)
    if (response != null) __obj.updateDynamic("response")(response)
    __obj.asInstanceOf[Event]
  }
}

