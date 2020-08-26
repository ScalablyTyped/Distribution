package typings.nodeWit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WitResponse extends js.Object {
  var quickReplies: js.UndefOr[js.Any] = js.native
  var text: js.UndefOr[String] = js.native
}

object WitResponse {
  @scala.inline
  def apply(): WitResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WitResponse]
  }
  @scala.inline
  implicit class WitResponseOps[Self <: WitResponse] (val x: Self) extends AnyVal {
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
    def setQuickReplies(value: js.Any): Self = this.set("quickReplies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuickReplies: Self = this.set("quickReplies", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

