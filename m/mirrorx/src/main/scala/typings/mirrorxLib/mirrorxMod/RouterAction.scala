package typings
package mirrorxLib.mirrorxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterAction extends js.Object {
  var payload: LocationActionPayload
  var `type`: mirrorxLib.mirrorxLibStrings.`@@router/CALL_HISTORY_METHOD`
}

object RouterAction {
  @scala.inline
  def apply(
    payload: LocationActionPayload,
    `type`: mirrorxLib.mirrorxLibStrings.`@@router/CALL_HISTORY_METHOD`
  ): RouterAction = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("payload")(payload)
    __obj.asInstanceOf[RouterAction]
  }
}

