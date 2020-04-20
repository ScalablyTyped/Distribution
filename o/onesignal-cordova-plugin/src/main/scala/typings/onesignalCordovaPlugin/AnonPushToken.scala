package typings.onesignalCordovaPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPushToken extends js.Object {
  var pushToken: String
  var userId: String
}

object AnonPushToken {
  @scala.inline
  def apply(pushToken: String, userId: String): AnonPushToken = {
    val __obj = js.Dynamic.literal(pushToken = pushToken.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPushToken]
  }
}

