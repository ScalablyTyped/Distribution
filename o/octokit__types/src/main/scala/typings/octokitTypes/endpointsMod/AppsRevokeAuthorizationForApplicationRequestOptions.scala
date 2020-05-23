package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.DELETE
import typings.octokitTypes.octokitTypesStrings.SlashapplicationsSlashColonclient_idSlashtokensSlashColonaccess_token
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsRevokeAuthorizationForApplicationRequestOptions extends js.Object {
  var headers: RequestHeaders
  var method: DELETE
  var request: RequestRequestOptions
  var url: SlashapplicationsSlashColonclient_idSlashtokensSlashColonaccess_token
}

object AppsRevokeAuthorizationForApplicationRequestOptions {
  @scala.inline
  def apply(
    headers: RequestHeaders,
    method: DELETE,
    request: RequestRequestOptions,
    url: SlashapplicationsSlashColonclient_idSlashtokensSlashColonaccess_token
  ): AppsRevokeAuthorizationForApplicationRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsRevokeAuthorizationForApplicationRequestOptions]
  }
}

