package typings.nodeDashSqlDashParser.nodeDashSqlDashParserMod

import typings.nodeDashSqlDashParser.nodeDashSqlDashParserStrings.insert
import typings.nodeDashSqlDashParser.nodeDashSqlDashParserStrings.replace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Insert_Replace extends AST {
  var columns: js.Array[String] | Null
  var db: String | Null
  var table: js.Any
  var `type`: replace | insert
  var values: js.Array[InsertReplaceValue]
}

object Insert_Replace {
  @scala.inline
  def apply(
    table: js.Any,
    `type`: replace | insert,
    values: js.Array[InsertReplaceValue],
    columns: js.Array[String] = null,
    db: String = null
  ): Insert_Replace = {
    val __obj = js.Dynamic.literal(table = table.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (db != null) __obj.updateDynamic("db")(db.asInstanceOf[js.Any])
    __obj.asInstanceOf[Insert_Replace]
  }
}

