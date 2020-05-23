package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.`private`
import typings.octokitTypes.octokitTypesStrings.all
import typings.octokitTypes.octokitTypesStrings.asc
import typings.octokitTypes.octokitTypesStrings.created
import typings.octokitTypes.octokitTypesStrings.desc
import typings.octokitTypes.octokitTypesStrings.forks
import typings.octokitTypes.octokitTypesStrings.full_name
import typings.octokitTypes.octokitTypesStrings.internal
import typings.octokitTypes.octokitTypesStrings.member
import typings.octokitTypes.octokitTypesStrings.public
import typings.octokitTypes.octokitTypesStrings.pushed
import typings.octokitTypes.octokitTypesStrings.sources
import typings.octokitTypes.octokitTypesStrings.updated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListForOrgEndpoint extends js.Object {
  /**
    * Can be one of `asc` or `desc`. Default: when using `full_name`: `asc`, otherwise `desc`
    */
  var direction: js.UndefOr[asc | desc] = js.undefined
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
    * Can be one of `created`, `updated`, `pushed`, `full_name`.
    */
  var sort: js.UndefOr[created | updated | pushed | full_name] = js.undefined
  /**
    * Specifies the types of repositories you want returned. Can be one of `all`, `public`, `private`, `forks`, `sources`, `member`, `internal`. Default: `all`. If your organization is associated with an enterprise account using GitHub Enterprise Cloud or GitHub Enterprise Server 2.20+, `type` can also be `internal`.
    */
  var `type`: js.UndefOr[all | public | `private` | forks | sources | member | internal] = js.undefined
}

object ReposListForOrgEndpoint {
  @scala.inline
  def apply(
    org_ : String,
    direction: asc | desc = null,
    page: js.UndefOr[Double] = js.undefined,
    per_page: js.UndefOr[Double] = js.undefined,
    sort: created | updated | pushed | full_name = null,
    `type`: all | public | `private` | forks | sources | member | internal = null
  ): ReposListForOrgEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (!js.isUndefined(per_page)) __obj.updateDynamic("per_page")(per_page.get.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposListForOrgEndpoint]
  }
}

