package typings.peerjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallOption extends js.Object {
  var metadata: js.UndefOr[js.Any] = js.native
  var sdpTransform: js.UndefOr[js.Function] = js.native
}

object CallOption {
  @scala.inline
  def apply(): CallOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallOption]
  }
  @scala.inline
  implicit class CallOptionOps[Self <: CallOption] (val x: Self) extends AnyVal {
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
    def setMetadata(value: js.Any): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setSdpTransform(value: js.Function): Self = this.set("sdpTransform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSdpTransform: Self = this.set("sdpTransform", js.undefined)
  }
  
}

