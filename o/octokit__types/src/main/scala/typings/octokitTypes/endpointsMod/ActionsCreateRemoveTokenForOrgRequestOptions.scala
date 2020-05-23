package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.POST
import typings.octokitTypes.octokitTypesStrings.`SlashorgsSlashColonorgSlashactionsSlashrunnersSlashremove-token`
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsCreateRemoveTokenForOrgRequestOptions extends js.Object {
  var headers: RequestHeaders
  var method: POST
  var request: RequestRequestOptions
  var url: `SlashorgsSlashColonorgSlashactionsSlashrunnersSlashremove-token`
}

object ActionsCreateRemoveTokenForOrgRequestOptions {
  @scala.inline
  def apply(
    headers: RequestHeaders,
    method: POST,
    request: RequestRequestOptions,
    url: `SlashorgsSlashColonorgSlashactionsSlashrunnersSlashremove-token`
  ): ActionsCreateRemoveTokenForOrgRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsCreateRemoveTokenForOrgRequestOptions]
  }
}

