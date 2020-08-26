package typings.pg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryResult[R /* <: QueryResultRow */] extends QueryResultBase {
  var rows: js.Array[R] = js.native
}

object QueryResult {
  @scala.inline
  def apply[/* <: typings.pg.mod.QueryResultRow */ R](command: String, fields: js.Array[FieldDef], oid: Double, rowCount: Double, rows: js.Array[R]): QueryResult[R] = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], oid = oid.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryResult[R]]
  }
  @scala.inline
  implicit class QueryResultOps[Self <: QueryResult[_], /* <: typings.pg.mod.QueryResultRow */ R] (val x: Self with QueryResult[R]) extends AnyVal {
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
    def setRowsVarargs(value: R*): Self = this.set("rows", js.Array(value :_*))
    @scala.inline
    def setRows(value: js.Array[R]): Self = this.set("rows", value.asInstanceOf[js.Any])
  }
  
}

