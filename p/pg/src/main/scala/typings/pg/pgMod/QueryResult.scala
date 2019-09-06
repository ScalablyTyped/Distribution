package typings.pg.pgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryResult[R /* <: QueryResultRow */] extends QueryResultBase {
  var rows: js.Array[R]
}

object QueryResult {
  @scala.inline
  def apply[R /* <: QueryResultRow */](command: String, fields: js.Array[FieldDef], oid: Double, rowCount: Double, rows: js.Array[R]): QueryResult[R] = {
    val __obj = js.Dynamic.literal(command = command, fields = fields, oid = oid, rowCount = rowCount, rows = rows)
  
    __obj.asInstanceOf[QueryResult[R]]
  }
}

