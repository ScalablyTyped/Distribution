package typings.nodeDashSqlDashParser.nodeDashSqlDashParserMod

import typings.nodeDashSqlDashParser.nodeDashSqlDashParserStrings.DISTINCT
import typings.nodeDashSqlDashParser.nodeDashSqlDashParserStrings.alter
import typings.nodeDashSqlDashParser.nodeDashSqlDashParserStrings.delete
import typings.nodeDashSqlDashParser.nodeDashSqlDashParserStrings.insert
import typings.nodeDashSqlDashParser.nodeDashSqlDashParserStrings.replace
import typings.nodeDashSqlDashParser.nodeDashSqlDashParserStrings.select
import typings.nodeDashSqlDashParser.nodeDashSqlDashParserStrings.update
import typings.nodeDashSqlDashParser.nodeDashSqlDashParserStrings.use
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeDashSqlDashParser.nodeDashSqlDashParserMod.Use
  - typings.nodeDashSqlDashParser.nodeDashSqlDashParserMod.Select
  - typings.nodeDashSqlDashParser.nodeDashSqlDashParserMod.Insert_Replace
  - typings.nodeDashSqlDashParser.nodeDashSqlDashParserMod.Update
  - typings.nodeDashSqlDashParser.nodeDashSqlDashParserMod.Delete
  - typings.nodeDashSqlDashParser.nodeDashSqlDashParserMod.Alter
*/
trait AST extends js.Object

object AST {
  @scala.inline
  def Use(db: String, `type`: use): AST = {
    val __obj = js.Dynamic.literal(db = db.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AST]
  }
  @scala.inline
  def Update(
    set: js.Array[SetList],
    `type`: update,
    where: js.Any,
    db: String = null,
    table: js.Array[From | Dual] = null
  ): AST = {
    val __obj = js.Dynamic.literal(set = set.asInstanceOf[js.Any], where = where.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (db != null) __obj.updateDynamic("db")(db.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    __obj.asInstanceOf[AST]
  }
  @scala.inline
  def Delete(from: js.Array[From | Dual], table: js.Any, `type`: delete, where: js.Any): AST = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any], where = where.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AST]
  }
  @scala.inline
  def Alter(expr: js.Any, table: From, `type`: alter): AST = {
    val __obj = js.Dynamic.literal(expr = expr.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AST]
  }
  @scala.inline
  def Insert_Replace(
    table: String,
    `type`: replace | insert,
    values: js.Array[InsertReplaceValue],
    columns: js.Array[String] = null,
    db: String = null
  ): AST = {
    val __obj = js.Dynamic.literal(table = table.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (db != null) __obj.updateDynamic("db")(db.asInstanceOf[js.Any])
    __obj.asInstanceOf[AST]
  }
  @scala.inline
  def Select(
    columns: js.Array[_] | typings.nodeDashSqlDashParser.nodeDashSqlDashParserStrings.`*`,
    `type`: select,
    where: js.Any,
    distinct: DISTINCT = null,
    from: js.Array[From | Dual] = null,
    groupby: js.Array[ColumnRef] = null,
    having: js.Array[_] = null,
    limit: js.Array[Limit] = null,
    options: js.Array[_] = null,
    orderby: js.Array[OrderBy] = null,
    `with`: With = null
  ): AST = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], where = where.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (distinct != null) __obj.updateDynamic("distinct")(distinct.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (groupby != null) __obj.updateDynamic("groupby")(groupby.asInstanceOf[js.Any])
    if (having != null) __obj.updateDynamic("having")(having.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (orderby != null) __obj.updateDynamic("orderby")(orderby.asInstanceOf[js.Any])
    if (`with` != null) __obj.updateDynamic("with")(`with`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AST]
  }
}

