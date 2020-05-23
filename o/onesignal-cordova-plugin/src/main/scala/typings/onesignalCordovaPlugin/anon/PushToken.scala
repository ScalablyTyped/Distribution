package typings.onesignalCordovaPlugin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushToken extends js.Object {
  var pushToken: String
  var userId: String
}

object PushToken {
  @scala.inline
  def apply(pushToken: String, userId: String): PushToken = {
    val __obj = js.Dynamic.literal(pushToken = pushToken.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushToken]
  }
}

