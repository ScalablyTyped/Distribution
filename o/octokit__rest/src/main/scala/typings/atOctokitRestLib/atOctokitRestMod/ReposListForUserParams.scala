package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListForUserParams extends js.Object {
  /**
    * Can be one of `asc` or `desc`.
    */
  var direction: js.UndefOr[
    atOctokitRestLib.atOctokitRestLibStrings.asc | atOctokitRestLib.atOctokitRestLibStrings.desc
  ] = js.undefined
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
    * Can be one of `all`, `owner`, `member`.
    */
  var `type`: js.UndefOr[
    atOctokitRestLib.atOctokitRestLibStrings.all | atOctokitRestLib.atOctokitRestLibStrings.owner | atOctokitRestLib.atOctokitRestLibStrings.member
  ] = js.undefined
  var username: java.lang.String
}

object ReposListForUserParams {
  @scala.inline
  def apply(
    username: java.lang.String,
    direction: atOctokitRestLib.atOctokitRestLibStrings.asc | atOctokitRestLib.atOctokitRestLibStrings.desc = null,
    page: scala.Int | scala.Double = null,
    per_page: scala.Int | scala.Double = null,
    sort: atOctokitRestLib.atOctokitRestLibStrings.created | atOctokitRestLib.atOctokitRestLibStrings.updated | atOctokitRestLib.atOctokitRestLibStrings.pushed | atOctokitRestLib.atOctokitRestLibStrings.full_name = null,
    `type`: atOctokitRestLib.atOctokitRestLibStrings.all | atOctokitRestLib.atOctokitRestLibStrings.owner | atOctokitRestLib.atOctokitRestLibStrings.member = null
  ): ReposListForUserParams = {
    val __obj = js.Dynamic.literal(username = username)
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposListForUserParams]
  }
}

