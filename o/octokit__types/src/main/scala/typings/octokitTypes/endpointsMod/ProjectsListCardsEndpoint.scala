package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`8`
import typings.octokitTypes.octokitTypesStrings.all
import typings.octokitTypes.octokitTypesStrings.archived
import typings.octokitTypes.octokitTypesStrings.not_archived
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  column_id  :number,   archived_state ? :'all' | 'archived' | 'not_archived',   per_page ? :number,   page ? :number} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'inertia'> */
trait ProjectsListCardsEndpoint extends js.Object {
  /**
    * Filters the project cards that are returned by the card's state. Can be one of `all`,`archived`, or `not_archived`.
    */
  var archived_state: js.UndefOr[all | archived | not_archived] = js.undefined
  var column_id: Double
  var mediaType: `8`
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.undefined
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.undefined
}

object ProjectsListCardsEndpoint {
  @scala.inline
  def apply(
    column_id: Double,
    mediaType: `8`,
    archived_state: all | archived | not_archived = null,
    page: js.UndefOr[Double] = js.undefined,
    per_page: js.UndefOr[Double] = js.undefined
  ): ProjectsListCardsEndpoint = {
    val __obj = js.Dynamic.literal(column_id = column_id.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any])
    if (archived_state != null) __obj.updateDynamic("archived_state")(archived_state.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (!js.isUndefined(per_page)) __obj.updateDynamic("per_page")(per_page.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsListCardsEndpoint]
  }
}

