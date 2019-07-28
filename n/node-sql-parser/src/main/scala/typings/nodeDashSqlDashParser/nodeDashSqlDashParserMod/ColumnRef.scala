package typings.nodeDashSqlDashParser.nodeDashSqlDashParserMod

import typings.nodeDashSqlDashParser.nodeDashSqlDashParserStrings.column_ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnRef extends js.Object {
  var column: String
  var table: String | Null
  var `type`: column_ref
}

object ColumnRef {
  @scala.inline
  def apply(column: String, `type`: column_ref, table: String = null): ColumnRef = {
    val __obj = js.Dynamic.literal(column = column)
    __obj.updateDynamic("type")(`type`)
    if (table != null) __obj.updateDynamic("table")(table)
    __obj.asInstanceOf[ColumnRef]
  }
}

