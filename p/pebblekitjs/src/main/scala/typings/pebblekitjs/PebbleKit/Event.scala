package typings.pebblekitjs.PebbleKit

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
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}

