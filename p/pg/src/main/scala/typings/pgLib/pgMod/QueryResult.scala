package typings
package pgLib.pgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryResult extends QueryResultBase {
  var rows: js.Array[_]
}

object QueryResult {
  @scala.inline
  def apply(
    command: java.lang.String,
    fields: js.Array[FieldDef],
    oid: scala.Double,
    rowCount: scala.Double,
    rows: js.Array[_]
  ): QueryResult = {
    val __obj = js.Dynamic.literal(command = command, fields = fields, oid = oid, rowCount = rowCount, rows = rows)
  
    __obj.asInstanceOf[QueryResult]
  }
}

