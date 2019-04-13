package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsListCardsParams extends js.Object {
  /**
    * Filters the project cards that are returned by the card's state. Can be one of `all`,`archived`, or `not_archived`.
    */
  var archived_state: js.UndefOr[
    atOctokitRestLib.atOctokitRestLibStrings.all | atOctokitRestLib.atOctokitRestLibStrings.archived | atOctokitRestLib.atOctokitRestLibStrings.not_archived
  ] = js.undefined
  var column_id: scala.Double
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[scala.Double] = js.undefined
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[scala.Double] = js.undefined
}

object ProjectsListCardsParams {
  @scala.inline
  def apply(
    column_id: scala.Double,
    archived_state: atOctokitRestLib.atOctokitRestLibStrings.all | atOctokitRestLib.atOctokitRestLibStrings.archived | atOctokitRestLib.atOctokitRestLibStrings.not_archived = null,
    page: scala.Int | scala.Double = null,
    per_page: scala.Int | scala.Double = null
  ): ProjectsListCardsParams = {
    val __obj = js.Dynamic.literal(column_id = column_id)
    if (archived_state != null) __obj.updateDynamic("archived_state")(archived_state.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsListCardsParams]
  }
}

