package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.POST
import typings.octokitTypes.octokitTypesStrings.`SlashreposSlashColonownerSlashColonrepoSlashcheck-suitesSlashColoncheck_suite_idSlashrerequest`
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksRerequestSuiteRequestOptions extends js.Object {
  var headers: RequestHeaders
  var method: POST
  var request: RequestRequestOptions
  var url: `SlashreposSlashColonownerSlashColonrepoSlashcheck-suitesSlashColoncheck_suite_idSlashrerequest`
}

object ChecksRerequestSuiteRequestOptions {
  @scala.inline
  def apply(
    headers: RequestHeaders,
    method: POST,
    request: RequestRequestOptions,
    url: `SlashreposSlashColonownerSlashColonrepoSlashcheck-suitesSlashColoncheck_suite_idSlashrerequest`
  ): ChecksRerequestSuiteRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksRerequestSuiteRequestOptions]
  }
}

