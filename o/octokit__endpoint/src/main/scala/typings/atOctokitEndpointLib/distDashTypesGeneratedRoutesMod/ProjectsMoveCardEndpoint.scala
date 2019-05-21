package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsMoveCardEndpoint extends js.Object {
  var card_id: scala.Double
  var column_id: js.UndefOr[scala.Double] = js.undefined
  var position: java.lang.String
}

object ProjectsMoveCardEndpoint {
  @scala.inline
  def apply(card_id: scala.Double, position: java.lang.String, column_id: scala.Int | scala.Double = null): ProjectsMoveCardEndpoint = {
    val __obj = js.Dynamic.literal(card_id = card_id, position = position)
    if (column_id != null) __obj.updateDynamic("column_id")(column_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsMoveCardEndpoint]
  }
}

