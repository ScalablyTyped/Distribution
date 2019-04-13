package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListParams extends js.Object {
  /**
    * Comma-separated list of values. Can include:  ,* \* `owner`: Repositories that are owned by the authenticated user.  ,* \* `collaborator`: Repositories that the user has been added to as a collaborator.  ,* \* `organization_member`: Repositories that the user has access to through being a member of an organization. This includes every repository on every team that the user is on.
    */
  var affiliation: js.UndefOr[java.lang.String] = js.undefined
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
    * Can be one of `all`, `owner`, `public`, `private`, `member`. Default: `all`  ,*   ,* Will cause a `422` error if used in the same request as **visibility** or **affiliation**. Will cause a `422` error if used in the same request as **visibility** or **affiliation**.
    */
  var `type`: js.UndefOr[
    atOctokitRestLib.atOctokitRestLibStrings.all | atOctokitRestLib.atOctokitRestLibStrings.owner | atOctokitRestLib.atOctokitRestLibStrings.public | atOctokitRestLib.atOctokitRestLibStrings.`private` | atOctokitRestLib.atOctokitRestLibStrings.member
  ] = js.undefined
  /**
    * Can be one of `all`, `public`, or `private`.
    */
  var visibility: js.UndefOr[
    atOctokitRestLib.atOctokitRestLibStrings.all | atOctokitRestLib.atOctokitRestLibStrings.public | atOctokitRestLib.atOctokitRestLibStrings.`private`
  ] = js.undefined
}

object ReposListParams {
  @scala.inline
  def apply(
    affiliation: java.lang.String = null,
    direction: atOctokitRestLib.atOctokitRestLibStrings.asc | atOctokitRestLib.atOctokitRestLibStrings.desc = null,
    page: scala.Int | scala.Double = null,
    per_page: scala.Int | scala.Double = null,
    sort: atOctokitRestLib.atOctokitRestLibStrings.created | atOctokitRestLib.atOctokitRestLibStrings.updated | atOctokitRestLib.atOctokitRestLibStrings.pushed | atOctokitRestLib.atOctokitRestLibStrings.full_name = null,
    `type`: atOctokitRestLib.atOctokitRestLibStrings.all | atOctokitRestLib.atOctokitRestLibStrings.owner | atOctokitRestLib.atOctokitRestLibStrings.public | atOctokitRestLib.atOctokitRestLibStrings.`private` | atOctokitRestLib.atOctokitRestLibStrings.member = null,
    visibility: atOctokitRestLib.atOctokitRestLibStrings.all | atOctokitRestLib.atOctokitRestLibStrings.public | atOctokitRestLib.atOctokitRestLibStrings.`private` = null
  ): ReposListParams = {
    val __obj = js.Dynamic.literal()
    if (affiliation != null) __obj.updateDynamic("affiliation")(affiliation)
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposListParams]
  }
}

