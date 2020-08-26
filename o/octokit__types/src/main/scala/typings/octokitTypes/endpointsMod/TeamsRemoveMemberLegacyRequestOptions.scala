package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.DELETE
import typings.octokitTypes.octokitTypesStrings.SlashteamsSlashColonteam_idSlashmembersSlashColonusername
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamsRemoveMemberLegacyRequestOptions extends js.Object {
  var headers: RequestHeaders = js.native
  var method: DELETE = js.native
  var request: RequestRequestOptions = js.native
  var url: SlashteamsSlashColonteam_idSlashmembersSlashColonusername = js.native
}

object TeamsRemoveMemberLegacyRequestOptions {
  @scala.inline
  def apply(
    headers: RequestHeaders,
    method: DELETE,
    request: RequestRequestOptions,
    url: SlashteamsSlashColonteam_idSlashmembersSlashColonusername
  ): TeamsRemoveMemberLegacyRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsRemoveMemberLegacyRequestOptions]
  }
  @scala.inline
  implicit class TeamsRemoveMemberLegacyRequestOptionsOps[Self <: TeamsRemoveMemberLegacyRequestOptions] (val x: Self) extends AnyVal {
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
    def setMethod(value: DELETE): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: RequestRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: SlashteamsSlashColonteam_idSlashmembersSlashColonusername): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

