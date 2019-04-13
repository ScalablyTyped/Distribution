package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListForOrgParams extends js.Object {
  /**
    * Can be one of `asc` or `desc`.
    */
  var direction: js.UndefOr[
    atOctokitRestLib.atOctokitRestLibStrings.asc | atOctokitRestLib.atOctokitRestLibStrings.desc
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
    * Can be one of `created`, `updated`, `pushed`, `full_name`.
    */
  var sort: js.UndefOr[
    atOctokitRestLib.atOctokitRestLibStrings.created | atOctokitRestLib.atOctokitRestLibStrings.updated | atOctokitRestLib.atOctokitRestLibStrings.pushed | atOctokitRestLib.atOctokitRestLibStrings.full_name
  ] = js.undefined
  /**
    * Can be one of `all`, `public`, `private`, `forks`, `sources`, `member`.
    */
  var `type`: js.UndefOr[
    atOctokitRestLib.atOctokitRestLibStrings.all | atOctokitRestLib.atOctokitRestLibStrings.public | atOctokitRestLib.atOctokitRestLibStrings.`private` | atOctokitRestLib.atOctokitRestLibStrings.forks | atOctokitRestLib.atOctokitRestLibStrings.sources | atOctokitRestLib.atOctokitRestLibStrings.member
  ] = js.undefined
}

object ReposListForOrgParams {
  @scala.inline
  def apply(
    org: java.lang.String,
    direction: atOctokitRestLib.atOctokitRestLibStrings.asc | atOctokitRestLib.atOctokitRestLibStrings.desc = null,
    page: scala.Int | scala.Double = null,
    per_page: scala.Int | scala.Double = null,
    sort: atOctokitRestLib.atOctokitRestLibStrings.created | atOctokitRestLib.atOctokitRestLibStrings.updated | atOctokitRestLib.atOctokitRestLibStrings.pushed | atOctokitRestLib.atOctokitRestLibStrings.full_name = null,
    `type`: atOctokitRestLib.atOctokitRestLibStrings.all | atOctokitRestLib.atOctokitRestLibStrings.public | atOctokitRestLib.atOctokitRestLibStrings.`private` | atOctokitRestLib.atOctokitRestLibStrings.forks | atOctokitRestLib.atOctokitRestLibStrings.sources | atOctokitRestLib.atOctokitRestLibStrings.member = null
  ): ReposListForOrgParams = {
    val __obj = js.Dynamic.literal(org = org)
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposListForOrgParams]
  }
}

