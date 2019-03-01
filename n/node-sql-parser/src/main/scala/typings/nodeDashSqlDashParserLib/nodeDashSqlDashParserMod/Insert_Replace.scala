package typings
package nodeDashSqlDashParserLib.nodeDashSqlDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Insert_Replace extends AST {
  var columns: js.Array[java.lang.String] | scala.Null
  var db: java.lang.String | scala.Null
  var table: java.lang.String
  var `type`: nodeDashSqlDashParserLib.nodeDashSqlDashParserLibStrings.replace | nodeDashSqlDashParserLib.nodeDashSqlDashParserLibStrings.insert
  var values: js.Array[InsertReplaceValue]
}

object Insert_Replace {
  @scala.inline
  def apply(
    table: java.lang.String,
    `type`: nodeDashSqlDashParserLib.nodeDashSqlDashParserLibStrings.replace | nodeDashSqlDashParserLib.nodeDashSqlDashParserLibStrings.insert,
    values: js.Array[InsertReplaceValue],
    columns: js.Array[java.lang.String] = null,
    db: java.lang.String = null
  ): Insert_Replace = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("table")(table)
    __obj.updateDynamic("values")(values)
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (db != null) __obj.updateDynamic("db")(db)
    __obj.asInstanceOf[Insert_Replace]
  }
}

