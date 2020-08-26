package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.DELETE
import typings.octokitTypes.octokitTypesStrings.SlashauthorizationsSlashColonauthorization_id
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OauthAuthorizationsDeleteAuthorizationRequestOptions extends js.Object {
  var headers: RequestHeaders = js.native
  var method: DELETE = js.native
  var request: RequestRequestOptions = js.native
  var url: SlashauthorizationsSlashColonauthorization_id = js.native
}

object OauthAuthorizationsDeleteAuthorizationRequestOptions {
  @scala.inline
  def apply(
    headers: RequestHeaders,
    method: DELETE,
    request: RequestRequestOptions,
    url: SlashauthorizationsSlashColonauthorization_id
  ): OauthAuthorizationsDeleteAuthorizationRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[OauthAuthorizationsDeleteAuthorizationRequestOptions]
  }
  @scala.inline
  implicit class OauthAuthorizationsDeleteAuthorizationRequestOptionsOps[Self <: OauthAuthorizationsDeleteAuthorizationRequestOptions] (val x: Self) extends AnyVal {
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
    def setUrl(value: SlashauthorizationsSlashColonauthorization_id): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

