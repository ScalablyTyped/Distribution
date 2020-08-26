package typings.postmark.bounceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BounceActivationResponse extends js.Object {
  var Bounce: typings.postmark.bounceMod.Bounce = js.native
  var Message: String = js.native
}

object BounceActivationResponse {
  @scala.inline
  def apply(Bounce: Bounce, Message: String): BounceActivationResponse = {
    val __obj = js.Dynamic.literal(Bounce = Bounce.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[BounceActivationResponse]
  }
  @scala.inline
  implicit class BounceActivationResponseOps[Self <: BounceActivationResponse] (val x: Self) extends AnyVal {
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
    def setBounce(value: Bounce): Self = this.set("Bounce", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("Message", value.asInstanceOf[js.Any])
  }
  
}

