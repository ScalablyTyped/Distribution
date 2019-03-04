package typings
package pgLib.pgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultBuilder extends QueryResult {
  def addRow(row: js.Any): scala.Unit
}

object ResultBuilder {
  @scala.inline
  def apply(
    addRow: js.Function1[js.Any, scala.Unit],
    command: java.lang.String,
    fields: js.Array[FieldDef],
    oid: scala.Double,
    rowCount: scala.Double,
    rows: js.Array[_]
  ): ResultBuilder = {
    val __obj = js.Dynamic.literal(addRow = addRow, command = command, fields = fields, oid = oid, rowCount = rowCount, rows = rows)
  
    __obj.asInstanceOf[ResultBuilder]
  }
}

