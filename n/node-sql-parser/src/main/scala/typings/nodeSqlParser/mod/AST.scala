package typings.nodeSqlParser.mod

import typings.nodeSqlParser.nodeSqlParserStrings.Asterisk
import typings.nodeSqlParser.nodeSqlParserStrings.DISTINCT
import typings.nodeSqlParser.nodeSqlParserStrings.alter
import typings.nodeSqlParser.nodeSqlParserStrings.delete
import typings.nodeSqlParser.nodeSqlParserStrings.insert
import typings.nodeSqlParser.nodeSqlParserStrings.replace
import typings.nodeSqlParser.nodeSqlParserStrings.select
import typings.nodeSqlParser.nodeSqlParserStrings.update
import typings.nodeSqlParser.nodeSqlParserStrings.use
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeSqlParser.mod.Use
  - typings.nodeSqlParser.mod.Select
  - typings.nodeSqlParser.mod.InsertReplace
  - typings.nodeSqlParser.mod.Update
  - typings.nodeSqlParser.mod.Delete
  - typings.nodeSqlParser.mod.Alter
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
  def Alter(expr: js.Any, table: From, `type`: alter): AST = {
    val __obj = js.Dynamic.literal(expr = expr.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AST]
  }
  @scala.inline
  def InsertReplace(
    table: js.Any,
    `type`: replace | insert,
    values: js.Array[InsertReplaceValue],
    columns: js.Array[String] = null,
    db: String = null
  ): AST = {
    val __obj = js.Dynamic.literal(table = table.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], db = db.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AST]
  }
  @scala.inline
  def Delete(from: js.Array[From | Dual], table: js.Any, `type`: delete, where: js.Any): AST = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any], where = where.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AST]
  }
  @scala.inline
  def Select(
    columns: js.Array[_] | Asterisk,
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
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], where = where.asInstanceOf[js.Any], distinct = distinct.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], groupby = groupby.asInstanceOf[js.Any], having = having.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], orderby = orderby.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.updateDynamic("with")(`with`.asInstanceOf[js.Any])
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
    val __obj = js.Dynamic.literal(set = set.asInstanceOf[js.Any], where = where.asInstanceOf[js.Any], db = db.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AST]
  }
}

