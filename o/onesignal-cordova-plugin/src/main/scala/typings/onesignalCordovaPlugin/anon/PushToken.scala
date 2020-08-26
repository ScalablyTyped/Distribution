package typings.onesignalCordovaPlugin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PushToken extends js.Object {
  var pushToken: String = js.native
  var userId: String = js.native
}

object PushToken {
  @scala.inline
  def apply(pushToken: String, userId: String): PushToken = {
    val __obj = js.Dynamic.literal(pushToken = pushToken.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushToken]
  }
  @scala.inline
  implicit class PushTokenOps[Self <: PushToken] (val x: Self) extends AnyVal {
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
    def setPushToken(value: String): Self = this.set("pushToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
  }
  
}

