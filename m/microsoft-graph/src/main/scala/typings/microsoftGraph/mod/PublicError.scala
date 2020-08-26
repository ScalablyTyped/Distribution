package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublicError extends js.Object {
  var code: js.UndefOr[String] = js.native
  var details: js.UndefOr[js.Array[PublicErrorDetail]] = js.native
  var innerError: js.UndefOr[PublicInnerError] = js.native
  var message: js.UndefOr[String] = js.native
  var target: js.UndefOr[String] = js.native
}

object PublicError {
  @scala.inline
  def apply(): PublicError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublicError]
  }
  @scala.inline
  implicit class PublicErrorOps[Self <: PublicError] (val x: Self) extends AnyVal {
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setDetailsVarargs(value: PublicErrorDetail*): Self = this.set("details", js.Array(value :_*))
    @scala.inline
    def setDetails(value: js.Array[PublicErrorDetail]): Self = this.set("details", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetails: Self = this.set("details", js.undefined)
    @scala.inline
    def setInnerError(value: PublicInnerError): Self = this.set("innerError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerError: Self = this.set("innerError", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
  
}

