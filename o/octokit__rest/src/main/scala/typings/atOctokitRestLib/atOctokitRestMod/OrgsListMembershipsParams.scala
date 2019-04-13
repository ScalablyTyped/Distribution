package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsListMembershipsParams extends js.Object {
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[scala.Double] = js.undefined
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[scala.Double] = js.undefined
  /**
    * Indicates the state of the memberships to return. Can be either `active` or `pending`. If not specified, the API returns both active and pending memberships.
    */
  var state: js.UndefOr[
    atOctokitRestLib.atOctokitRestLibStrings.active | atOctokitRestLib.atOctokitRestLibStrings.pending
  ] = js.undefined
}

object OrgsListMembershipsParams {
  @scala.inline
  def apply(
    page: scala.Int | scala.Double = null,
    per_page: scala.Int | scala.Double = null,
    state: atOctokitRestLib.atOctokitRestLibStrings.active | atOctokitRestLib.atOctokitRestLibStrings.pending = null
  ): OrgsListMembershipsParams = {
    val __obj = js.Dynamic.literal()
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsListMembershipsParams]
  }
}

