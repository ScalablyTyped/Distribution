package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.active
import typings.octokitTypes.octokitTypesStrings.pending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsListMembershipsForAuthenticatedUserEndpoint extends js.Object {
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.undefined
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.undefined
  /**
    * Indicates the state of the memberships to return. Can be either `active` or `pending`. If not specified, the API returns both active and pending memberships.
    */
  var state: js.UndefOr[active | pending] = js.undefined
}

object OrgsListMembershipsForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(
    page: js.UndefOr[Double] = js.undefined,
    per_page: js.UndefOr[Double] = js.undefined,
    state: active | pending = null
  ): OrgsListMembershipsForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (!js.isUndefined(per_page)) __obj.updateDynamic("per_page")(per_page.get.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsListMembershipsForAuthenticatedUserEndpoint]
  }
}

