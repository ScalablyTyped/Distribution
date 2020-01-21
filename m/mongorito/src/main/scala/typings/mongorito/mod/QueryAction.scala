package typings.mongorito.mod

import typings.mongorito.AnonArgs
import typings.mongorito.mod.ActionTypes.QUERY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryAction extends Action {
  var method: String
  var query: js.Array[AnonArgs]
  var `type`: QUERY
}

object QueryAction {
  @scala.inline
  def apply(method: String, query: js.Array[AnonArgs], `type`: QUERY): QueryAction = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryAction]
  }
}

