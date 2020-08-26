package typings.parse.mod.global.Parse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FullOptions extends js.Object {
  var error: js.UndefOr[js.Function] = js.native
  var installationId: js.UndefOr[String] = js.native
  var progress: js.UndefOr[js.Function] = js.native
  var sessionToken: js.UndefOr[String] = js.native
  var success: js.UndefOr[js.Function] = js.native
  var useMasterKey: js.UndefOr[Boolean] = js.native
}

object FullOptions {
  @scala.inline
  def apply(): FullOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FullOptions]
  }
  @scala.inline
  implicit class FullOptionsOps[Self <: FullOptions] (val x: Self) extends AnyVal {
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
    def setError(value: js.Function): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setInstallationId(value: String): Self = this.set("installationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstallationId: Self = this.set("installationId", js.undefined)
    @scala.inline
    def setProgress(value: js.Function): Self = this.set("progress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
    @scala.inline
    def setSessionToken(value: String): Self = this.set("sessionToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionToken: Self = this.set("sessionToken", js.undefined)
    @scala.inline
    def setSuccess(value: js.Function): Self = this.set("success", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    @scala.inline
    def setUseMasterKey(value: Boolean): Self = this.set("useMasterKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseMasterKey: Self = this.set("useMasterKey", js.undefined)
  }
  
}

