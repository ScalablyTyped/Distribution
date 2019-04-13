package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsListMembersParams extends js.Object {
  /**
    * Filter members returned in the list. Can be one of:  ,* \* `2fa_disabled` - Members without [two-factor authentication](https://github.com/blog/1614-two-factor-authentication) enabled. Available for organization owners.  ,* \* `all` - All members the authenticated user can see.
    */
  var filter: js.UndefOr[
    atOctokitRestLib.atOctokitRestLibStrings.`2fa_disabled` | atOctokitRestLib.atOctokitRestLibStrings.all
  ] = js.undefined
  var org: java.lang.String
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[scala.Double] = js.undefined
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[scala.Double] = js.undefined
  /**
    * Filter members returned by their role. Can be one of:  ,* \* `all` - All members of the organization, regardless of role.  ,* \* `admin` - Organization owners.  ,* \* `member` - Non-owner organization members.
    */
  var role: js.UndefOr[
    atOctokitRestLib.atOctokitRestLibStrings.all | atOctokitRestLib.atOctokitRestLibStrings.admin | atOctokitRestLib.atOctokitRestLibStrings.member
  ] = js.undefined
}

object OrgsListMembersParams {
  @scala.inline
  def apply(
    org: java.lang.String,
    filter: atOctokitRestLib.atOctokitRestLibStrings.`2fa_disabled` | atOctokitRestLib.atOctokitRestLibStrings.all = null,
    page: scala.Int | scala.Double = null,
    per_page: scala.Int | scala.Double = null,
    role: atOctokitRestLib.atOctokitRestLibStrings.all | atOctokitRestLib.atOctokitRestLibStrings.admin | atOctokitRestLib.atOctokitRestLibStrings.member = null
  ): OrgsListMembersParams = {
    val __obj = js.Dynamic.literal(org = org)
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsListMembersParams]
  }
}

