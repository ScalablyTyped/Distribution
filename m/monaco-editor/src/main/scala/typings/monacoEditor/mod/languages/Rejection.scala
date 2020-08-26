package typings.monacoEditor.mod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rejection extends js.Object {
  var rejectReason: js.UndefOr[String] = js.native
}

object Rejection {
  @scala.inline
  def apply(): Rejection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Rejection]
  }
  @scala.inline
  implicit class RejectionOps[Self <: Rejection] (val x: Self) extends AnyVal {
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
    def setRejectReason(value: String): Self = this.set("rejectReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRejectReason: Self = this.set("rejectReason", js.undefined)
  }
  
}

