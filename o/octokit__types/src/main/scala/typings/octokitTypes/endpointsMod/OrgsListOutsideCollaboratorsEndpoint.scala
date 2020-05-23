package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.`2fa_disabled`
import typings.octokitTypes.octokitTypesStrings.all
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsListOutsideCollaboratorsEndpoint extends js.Object {
  /**
    * Filter the list of outside collaborators. Can be one of:
    * \* `2fa_disabled`: Outside collaborators without [two-factor authentication](https://github.com/blog/1614-two-factor-authentication) enabled.
    * \* `all`: All outside collaborators.
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
}

object OrgsListOutsideCollaboratorsEndpoint {
  @scala.inline
  def apply(
    org_ : String,
    filter: `2fa_disabled` | all = null,
    page: js.UndefOr[Double] = js.undefined,
    per_page: js.UndefOr[Double] = js.undefined
  ): OrgsListOutsideCollaboratorsEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (!js.isUndefined(per_page)) __obj.updateDynamic("per_page")(per_page.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsListOutsideCollaboratorsEndpoint]
  }
}

