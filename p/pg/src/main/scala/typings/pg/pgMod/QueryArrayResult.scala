package typings.pg.pgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryArrayResult[R /* <: js.Array[_] */] extends QueryResultBase {
  var rows: js.Array[R]
}

object QueryArrayResult {
  @scala.inline
  def apply[R /* <: js.Array[_] */](command: String, fields: js.Array[FieldDef], oid: Double, rowCount: Double, rows: js.Array[R]): QueryArrayResult[R] = {
    val __obj = js.Dynamic.literal(command = command, fields = fields, oid = oid, rowCount = rowCount, rows = rows)
  
    __obj.asInstanceOf[QueryArrayResult[R]]
  }
}

