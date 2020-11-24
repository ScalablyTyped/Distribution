package typings.nodeSqlParser.typesMod

import typings.nodeSqlParser.nodeSqlParserStrings.Asterisk
import typings.nodeSqlParser.nodeSqlParserStrings.alter
import typings.nodeSqlParser.nodeSqlParserStrings.delete
import typings.nodeSqlParser.nodeSqlParserStrings.insert
import typings.nodeSqlParser.nodeSqlParserStrings.replace
import typings.nodeSqlParser.nodeSqlParserStrings.select
import typings.nodeSqlParser.nodeSqlParserStrings.update
import typings.nodeSqlParser.nodeSqlParserStrings.use
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.nodeSqlParser.typesMod.Use
  - typings.nodeSqlParser.typesMod.Select
  - typings.nodeSqlParser.typesMod.InsertReplace
  - typings.nodeSqlParser.typesMod.Update
  - typings.nodeSqlParser.typesMod.Delete
  - typings.nodeSqlParser.typesMod.Alter
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
  def Select(columns: (js.Array[_ | Column]) | Asterisk, `type`: select, where: js.Any): AST = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], where = where.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AST]
  }
  
  @scala.inline
  def InsertReplace(table: js.Any, `type`: replace | insert, values: js.Array[InsertReplaceValue]): AST = {
    val __obj = js.Dynamic.literal(table = table.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
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
  def Update(set: js.Array[SetList], `type`: update, where: js.Any): AST = {
    val __obj = js.Dynamic.literal(set = set.asInstanceOf[js.Any], where = where.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AST]
  }
}
