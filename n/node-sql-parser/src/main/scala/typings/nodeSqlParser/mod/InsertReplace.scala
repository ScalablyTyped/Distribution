package typings.nodeSqlParser.mod

import typings.nodeSqlParser.nodeSqlParserStrings.insert
import typings.nodeSqlParser.nodeSqlParserStrings.replace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertReplace extends AST {
  var columns: js.Array[String] | Null
  var db: String | Null
  var table: js.Any
  var `type`: replace | insert
  var values: js.Array[InsertReplaceValue]
}

object InsertReplace {
  @scala.inline
  def apply(
    table: js.Any,
    `type`: replace | insert,
    values: js.Array[InsertReplaceValue],
    columns: js.Array[String] = null,
    db: String = null
  ): InsertReplace = {
    val __obj = js.Dynamic.literal(table = table.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (db != null) __obj.updateDynamic("db")(db.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertReplace]
  }
}

