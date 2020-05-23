package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.PATCH
import typings.octokitTypes.octokitTypesStrings.SlashreposSlashColonownerSlashColonrepoSlashmilestonesSlashColonmilestone_number
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesUpdateMilestoneRequestOptions extends js.Object {
  var headers: RequestHeaders
  var method: PATCH
  var request: RequestRequestOptions
  var url: SlashreposSlashColonownerSlashColonrepoSlashmilestonesSlashColonmilestone_number
}

object IssuesUpdateMilestoneRequestOptions {
  @scala.inline
  def apply(
    headers: RequestHeaders,
    method: PATCH,
    request: RequestRequestOptions,
    url: SlashreposSlashColonownerSlashColonrepoSlashmilestonesSlashColonmilestone_number
  ): IssuesUpdateMilestoneRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesUpdateMilestoneRequestOptions]
  }
}

