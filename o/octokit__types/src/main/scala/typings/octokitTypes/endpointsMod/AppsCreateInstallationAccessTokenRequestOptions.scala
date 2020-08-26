package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.POST
import typings.octokitTypes.octokitTypesStrings.SlashappSlashinstallationsSlashColoninstallation_idSlashaccess_tokens
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppsCreateInstallationAccessTokenRequestOptions extends js.Object {
  var headers: RequestHeaders = js.native
  var method: POST = js.native
  var request: RequestRequestOptions = js.native
  var url: SlashappSlashinstallationsSlashColoninstallation_idSlashaccess_tokens = js.native
}

object AppsCreateInstallationAccessTokenRequestOptions {
  @scala.inline
  def apply(
    headers: RequestHeaders,
    method: POST,
    request: RequestRequestOptions,
    url: SlashappSlashinstallationsSlashColoninstallation_idSlashaccess_tokens
  ): AppsCreateInstallationAccessTokenRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsCreateInstallationAccessTokenRequestOptions]
  }
  @scala.inline
  implicit class AppsCreateInstallationAccessTokenRequestOptionsOps[Self <: AppsCreateInstallationAccessTokenRequestOptions] (val x: Self) extends AnyVal {
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
    def setHeaders(value: RequestHeaders): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: POST): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: RequestRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: SlashappSlashinstallationsSlashColoninstallation_idSlashaccess_tokens): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

