package typings.pg.mod

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
    val __obj = js.Dynamic.literal(addRow = js.Any.fromFunction1(addRow), command = command.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], oid = oid.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultBuilder[R]]
  }
}

