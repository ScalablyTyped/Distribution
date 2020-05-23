package typings.mongorito.mod

import typings.mongorito.anon.Args
import typings.mongorito.mod.ActionTypes.QUERY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryAction extends Action {
  var method: String
  var query: js.Array[Args]
  var `type`: QUERY
}

object QueryAction {
  @scala.inline
  def apply(method: String, query: js.Array[Args], `type`: QUERY): QueryAction = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryAction]
  }
}

