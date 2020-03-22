package typings.octokitPluginRestEndpointMethods.typesMod

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.`private`
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.all
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.asc
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.created
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.desc
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.full_name
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.member
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.owner
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.public
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.pushed
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.updated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListParams extends js.Object {
  /**
    * Comma-separated list of values. Can include:
    * \* `owner`: Repositories that are owned by the authenticated user.
    * \* `collaborator`: Repositories that the user has been added to as a collaborator.
    * \* `organization_member`: Repositories that the user has access to through being a member of an organization. This includes every repository on every team that the user is on.
    */
  var affiliation: js.UndefOr[String] = js.undefined
  /**
    * Can be one of `asc` or `desc`. Default: `asc` when using `full_name`, otherwise `desc`
    */
  var direction: js.UndefOr[asc | desc] = js.undefined
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.undefined
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.undefined
  /**
    * Can be one of `created`, `updated`, `pushed`, `full_name`.
    */
  var sort: js.UndefOr[created | updated | pushed | full_name] = js.undefined
  /**
    * Can be one of `all`, `owner`, `public`, `private`, `member`. Default: `all`
    *
    * Will cause a `422` error if used in the same request as **visibility** or **affiliation**. Will cause a `422` error if used in the same request as **visibility** or **affiliation**.
    */
  var `type`: js.UndefOr[all | owner | public | `private` | member] = js.undefined
  /**
    * Can be one of `all`, `public`, or `private`.
    */
  var visibility: js.UndefOr[all | public | `private`] = js.undefined
}

object ReposListParams {
  @scala.inline
  def apply(
    affiliation: String = null,
    direction: asc | desc = null,
    page: Int | Double = null,
    per_page: Int | Double = null,
    sort: created | updated | pushed | full_name = null,
    `type`: all | owner | public | `private` | member = null,
    visibility: all | public | `private` = null
  ): ReposListParams = {
    val __obj = js.Dynamic.literal()
    if (affiliation != null) __obj.updateDynamic("affiliation")(affiliation.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposListParams]
  }
}

