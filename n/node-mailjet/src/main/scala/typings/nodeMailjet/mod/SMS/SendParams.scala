package typings.nodeMailjet.mod.SMS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendParams extends js.Object {
  var From: String = js.native
  var Text: String = js.native
  var To: String = js.native
}

object SendParams {
  @scala.inline
  def apply(From: String, Text: String, To: String): SendParams = {
    val __obj = js.Dynamic.literal(From = From.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendParams]
  }
  @scala.inline
  implicit class SendParamsOps[Self <: SendParams] (val x: Self) extends AnyVal {
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
    def setFrom(value: String): Self = this.set("From", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("Text", value.asInstanceOf[js.Any])
    @scala.inline
    def setTo(value: String): Self = this.set("To", value.asInstanceOf[js.Any])
  }
  
}

