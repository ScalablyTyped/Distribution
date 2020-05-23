package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.GET
import typings.octokitTypes.octokitTypesStrings.SlashreposSlashColonownerSlashColonrepoSlashactionsSlashworkflows
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsListRepoWorkflowsRequestOptions extends js.Object {
  var headers: RequestHeaders
  var method: GET
  var request: RequestRequestOptions
  var url: SlashreposSlashColonownerSlashColonrepoSlashactionsSlashworkflows
}

object ActionsListRepoWorkflowsRequestOptions {
  @scala.inline
  def apply(
    headers: RequestHeaders,
    method: GET,
    request: RequestRequestOptions,
    url: SlashreposSlashColonownerSlashColonrepoSlashactionsSlashworkflows
  ): ActionsListRepoWorkflowsRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsListRepoWorkflowsRequestOptions]
  }
}

