package typings.oboe.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FailReason extends js.Object {
  var body: js.UndefOr[String] = js.native
  var jsonBody: js.UndefOr[js.Object] = js.native
  var statusCode: js.UndefOr[Double] = js.native
  var thrown: js.UndefOr[Error] = js.native
}

object FailReason {
  @scala.inline
  def apply(): FailReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailReason]
  }
  @scala.inline
  implicit class FailReasonOps[Self <: FailReason] (val x: Self) extends AnyVal {
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
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setJsonBody(value: js.Object): Self = this.set("jsonBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJsonBody: Self = this.set("jsonBody", js.undefined)
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusCode: Self = this.set("statusCode", js.undefined)
    @scala.inline
    def setThrown(value: Error): Self = this.set("thrown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThrown: Self = this.set("thrown", js.undefined)
  }
  
}

