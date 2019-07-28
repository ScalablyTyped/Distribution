package typings.pg.pgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultBuilder extends QueryResult {
  def addRow(row: js.Any): Unit
}

object ResultBuilder {
  @scala.inline
  def apply(
    addRow: js.Any => Unit,
    command: String,
    fields: js.Array[FieldDef],
    oid: Double,
    rowCount: Double,
    rows: js.Array[_]
  ): ResultBuilder = {
    val __obj = js.Dynamic.literal(addRow = js.Any.fromFunction1(addRow), command = command, fields = fields, oid = oid, rowCount = rowCount, rows = rows)
  
    __obj.asInstanceOf[ResultBuilder]
  }
}

