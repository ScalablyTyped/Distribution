package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.GET
import typings.octokitTypes.octokitTypesStrings.Slashmarketplace_listingSlashplansSlashColonplan_idSlashaccounts
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsListAccountsForPlanRequestOptions extends js.Object {
  var headers: RequestHeaders
  var method: GET
  var request: RequestRequestOptions
  var url: Slashmarketplace_listingSlashplansSlashColonplan_idSlashaccounts
}

object AppsListAccountsForPlanRequestOptions {
  @scala.inline
  def apply(
    headers: RequestHeaders,
    method: GET,
    request: RequestRequestOptions,
    url: Slashmarketplace_listingSlashplansSlashColonplan_idSlashaccounts
  ): AppsListAccountsForPlanRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsListAccountsForPlanRequestOptions]
  }
}

