package typings.mongorito.mod

import typings.mongorito.anon.Args
import typings.mongorito.mod.ActionTypes.QUERY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryAction extends Action {
  var method: String = js.native
  var query: js.Array[Args] = js.native
  var `type`: QUERY = js.native
}

object QueryAction {
  @scala.inline
  def apply(method: String, query: js.Array[Args], `type`: QUERY): QueryAction = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryAction]
  }
  @scala.inline
  implicit class QueryActionOps[Self <: QueryAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueryVarargs(value: Args*): Self = this.set("query", js.Array(value :_*))
    @scala.inline
    def setQuery(value: js.Array[Args]): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: QUERY): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

