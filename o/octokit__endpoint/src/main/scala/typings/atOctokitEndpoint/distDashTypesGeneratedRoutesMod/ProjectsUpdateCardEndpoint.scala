package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsUpdateCardEndpoint extends js.Object {
  var archived: js.UndefOr[Boolean] = js.undefined
  var card_id: Double
  var note: js.UndefOr[String] = js.undefined
}

object ProjectsUpdateCardEndpoint {
  @scala.inline
  def apply(card_id: Double, archived: js.UndefOr[Boolean] = js.undefined, note: String = null): ProjectsUpdateCardEndpoint = {
    val __obj = js.Dynamic.literal(card_id = card_id)
    if (!js.isUndefined(archived)) __obj.updateDynamic("archived")(archived)
    if (note != null) __obj.updateDynamic("note")(note)
    __obj.asInstanceOf[ProjectsUpdateCardEndpoint]
  }
}

