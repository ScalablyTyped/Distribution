package typings.oauth2orize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorHandlerOptions extends js.Object {
  var mode: js.UndefOr[String] = js.native
}

object ErrorHandlerOptions {
  @scala.inline
  def apply(): ErrorHandlerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorHandlerOptions]
  }
  @scala.inline
  implicit class ErrorHandlerOptionsOps[Self <: ErrorHandlerOptions] (val x: Self) extends AnyVal {
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
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
  }
  
}

