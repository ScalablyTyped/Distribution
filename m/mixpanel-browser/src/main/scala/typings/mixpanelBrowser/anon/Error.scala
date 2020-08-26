package typings.mixpanelBrowser.anon

import typings.mixpanelBrowser.mixpanelBrowserNumbers.`1`
import typings.mixpanelBrowser.mod.VerboseResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Error extends VerboseResponse {
  var error: Null = js.native
  var status: `1` = js.native
}

object Error {
  @scala.inline
  def apply(error: Null, status: `1`): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  @scala.inline
  implicit class ErrorOps[Self <: Error] (val x: Self) extends AnyVal {
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
    def setError(value: Null): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: `1`): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

