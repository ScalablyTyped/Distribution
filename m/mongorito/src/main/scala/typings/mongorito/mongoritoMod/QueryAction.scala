package typings.mongorito.mongoritoMod

import typings.mongorito.Anon_Args
import typings.mongorito.mongoritoMod.ActionTypes.QUERY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryAction extends Action {
  var method: String
  var query: js.Array[Anon_Args]
  var `type`: QUERY
}

object QueryAction {
  @scala.inline
  def apply(method: String, query: js.Array[Anon_Args], `type`: QUERY): QueryAction = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryAction]
  }
}

