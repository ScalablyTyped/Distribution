package typings.onionoo.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Accept extends js.Object {
  var accept: js.UndefOr[js.Array[String]] = js.native
  var reject: js.UndefOr[js.Array[String]] = js.native
}

object Accept {
  @scala.inline
  def apply(): Accept = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Accept]
  }
  @scala.inline
  implicit class AcceptOps[Self <: Accept] (val x: Self) extends AnyVal {
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
    def setAcceptVarargs(value: String*): Self = this.set("accept", js.Array(value :_*))
    @scala.inline
    def setAccept(value: js.Array[String]): Self = this.set("accept", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccept: Self = this.set("accept", js.undefined)
    @scala.inline
    def setRejectVarargs(value: String*): Self = this.set("reject", js.Array(value :_*))
    @scala.inline
    def setReject(value: js.Array[String]): Self = this.set("reject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReject: Self = this.set("reject", js.undefined)
  }
  
}

