package typings.octokitRest.mod

import typings.octokitRest.octokitRestStrings.`2fa_disabled`
import typings.octokitRest.octokitRestStrings.admin
import typings.octokitRest.octokitRestStrings.all
import typings.octokitRest.octokitRestStrings.member
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsListMembersParams extends js.Object {
  /**
    * Filter members returned in the list. Can be one of:
    * \* `2fa_disabled` - Members without [two-factor authentication](https://github.com/blog/1614-two-factor-authentication) enabled. Available for organization owners.
    * \* `all` - All members the authenticated user can see.
    */
  var filter: js.UndefOr[`2fa_disabled` | all] = js.undefined
  var org: String
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.undefined
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.undefined
  /**
    * Filter members returned by their role. Can be one of:
    * \* `all` - All members of the organization, regardless of role.
    * \* `admin` - Organization owners.
    * \* `member` - Non-owner organization members.
    */
  var role: js.UndefOr[all | admin | member] = js.undefined
}

object OrgsListMembersParams {
  @scala.inline
  def apply(
    org: String,
    filter: `2fa_disabled` | all = null,
    page: Int | Double = null,
    per_page: Int | Double = null,
    role: all | admin | member = null
  ): OrgsListMembersParams = {
    val __obj = js.Dynamic.literal(org = org.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsListMembersParams]
  }
}

