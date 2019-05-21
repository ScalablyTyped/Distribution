package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsUpdateCardEndpoint extends js.Object {
  var archived: js.UndefOr[scala.Boolean] = js.undefined
  var card_id: scala.Double
  var note: js.UndefOr[java.lang.String] = js.undefined
}

object ProjectsUpdateCardEndpoint {
  @scala.inline
  def apply(
    card_id: scala.Double,
    archived: js.UndefOr[scala.Boolean] = js.undefined,
    note: java.lang.String = null
  ): ProjectsUpdateCardEndpoint = {
    val __obj = js.Dynamic.literal(card_id = card_id)
    if (!js.isUndefined(archived)) __obj.updateDynamic("archived")(archived)
    if (note != null) __obj.updateDynamic("note")(note)
    __obj.asInstanceOf[ProjectsUpdateCardEndpoint]
  }
}

