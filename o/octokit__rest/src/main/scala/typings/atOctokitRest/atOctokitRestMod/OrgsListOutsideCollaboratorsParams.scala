package typings.atOctokitRest.atOctokitRestMod

import typings.atOctokitRest.atOctokitRestStrings.`2fa_disabled`
import typings.atOctokitRest.atOctokitRestStrings.all
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsListOutsideCollaboratorsParams extends js.Object {
  /**
    * Filter the list of outside collaborators. Can be one of:
    * \* `2fa_disabled`: Outside collaborators without [two-factor authentication](https://github.com/blog/1614-two-factor-authentication) enabled.
    * \* `all`: All outside collaborators.
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
}

object OrgsListOutsideCollaboratorsParams {
  @scala.inline
  def apply(
    org: String,
    filter: `2fa_disabled` | all = null,
    page: Int | Double = null,
    per_page: Int | Double = null
  ): OrgsListOutsideCollaboratorsParams = {
    val __obj = js.Dynamic.literal(org = org)
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsListOutsideCollaboratorsParams]
  }
}

