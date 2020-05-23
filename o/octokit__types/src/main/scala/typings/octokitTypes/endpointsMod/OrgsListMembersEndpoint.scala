package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.`2fa_disabled`
import typings.octokitTypes.octokitTypesStrings.admin
import typings.octokitTypes.octokitTypesStrings.all
import typings.octokitTypes.octokitTypesStrings.member
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsListMembersEndpoint extends js.Object {
  /**
    * Filter members returned in the list. Can be one of:
    * \* `2fa_disabled` - Members without [two-factor authentication](https://github.com/blog/1614-two-factor-authentication) enabled. Available for organization owners.
    * \* `all` - All members the authenticated user can see.
    */
  var filter: js.UndefOr[`2fa_disabled` | all] = js.undefined
  @JSName("org")
  var org_ : String
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

object OrgsListMembersEndpoint {
  @scala.inline
  def apply(
    org_ : String,
    filter: `2fa_disabled` | all = null,
    page: js.UndefOr[Double] = js.undefined,
    per_page: js.UndefOr[Double] = js.undefined,
    role: all | admin | member = null
  ): OrgsListMembersEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (!js.isUndefined(per_page)) __obj.updateDynamic("per_page")(per_page.get.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsListMembersEndpoint]
  }
}

