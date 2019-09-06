package typings.pg.pgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultBuilder[R /* <: QueryResultRow */] extends QueryResult[R] {
  def addRow(row: R): Unit
}

object ResultBuilder {
  @scala.inline
  def apply[R /* <: QueryResultRow */](
    addRow: R => Unit,
    command: String,
    fields: js.Array[FieldDef],
    oid: Double,
    rowCount: Double,
    rows: js.Array[R]
  ): ResultBuilder[R] = {
    val __obj = js.Dynamic.literal(addRow = js.Any.fromFunction1(addRow), command = command, fields = fields, oid = oid, rowCount = rowCount, rows = rows)
  
    __obj.asInstanceOf[ResultBuilder[R]]
  }
}

