package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsMoveCardEndpoint extends js.Object {
  var card_id: Double
  var column_id: js.UndefOr[Double] = js.undefined
  var position: String
}

object ProjectsMoveCardEndpoint {
  @scala.inline
  def apply(card_id: Double, position: String, column_id: Int | Double = null): ProjectsMoveCardEndpoint = {
    val __obj = js.Dynamic.literal(card_id = card_id, position = position)
    if (column_id != null) __obj.updateDynamic("column_id")(column_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsMoveCardEndpoint]
  }
}

