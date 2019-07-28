package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsListCardsEndpoint extends js.Object {
  var archived_state: js.UndefOr[String] = js.undefined
  var column_id: Double
  var page: js.UndefOr[Double] = js.undefined
  var per_page: js.UndefOr[Double] = js.undefined
}

object ProjectsListCardsEndpoint {
  @scala.inline
  def apply(
    column_id: Double,
    archived_state: String = null,
    page: Int | Double = null,
    per_page: Int | Double = null
  ): ProjectsListCardsEndpoint = {
    val __obj = js.Dynamic.literal(column_id = column_id)
    if (archived_state != null) __obj.updateDynamic("archived_state")(archived_state)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsListCardsEndpoint]
  }
}

