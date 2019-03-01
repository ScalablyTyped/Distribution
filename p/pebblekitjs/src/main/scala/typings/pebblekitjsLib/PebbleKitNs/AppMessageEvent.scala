package typings
package pebblekitjsLib.PebbleKitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppMessageEvent extends js.Object {
  var data: AppMessageData
  var error: js.UndefOr[Error] = js.undefined
}

object AppMessageEvent {
  @scala.inline
  def apply(data: AppMessageData, error: Error = null): AppMessageEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[AppMessageEvent]
  }
}

