package typings.nodeSqlParser.mod

import typings.nodeSqlParser.nodeSqlParserStrings.column_ref
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
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnRef]
  }
}

