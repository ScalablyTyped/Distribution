package typings
package pebblekitjsLib.PebbleKitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var payload: js.UndefOr[js.Object] = js.undefined
  var response: js.UndefOr[java.lang.String] = js.undefined
  var `type`: java.lang.String
}

object Event {
  @scala.inline
  def apply(`type`: java.lang.String, payload: js.Object = null, response: java.lang.String = null): Event = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (payload != null) __obj.updateDynamic("payload")(payload)
    if (response != null) __obj.updateDynamic("response")(response)
    __obj.asInstanceOf[Event]
  }
}

