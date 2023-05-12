package typings.nodeSqlParser.mod

import typings.nodeSqlParser.nodeSqlParserStrings.Asterisk
import typings.nodeSqlParser.nodeSqlParserStrings.database
import typings.nodeSqlParser.nodeSqlParserStrings.index
import typings.nodeSqlParser.nodeSqlParserStrings.insert
import typings.nodeSqlParser.nodeSqlParserStrings.replace
import typings.nodeSqlParser.nodeSqlParserStrings.table
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.nodeSqlParser.mod.Use
  - typings.nodeSqlParser.mod.Select
  - typings.nodeSqlParser.mod.InsertReplace
  - typings.nodeSqlParser.mod.Update
  - typings.nodeSqlParser.mod.Delete
  - typings.nodeSqlParser.mod.Alter
  - typings.nodeSqlParser.mod.Create
*/
trait AST extends StObject
object AST {
  
  inline def Alter(expr: Any, table: From): typings.nodeSqlParser.mod.Alter = {
    val __obj = js.Dynamic.literal(expr = expr.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("alter")
    __obj.asInstanceOf[typings.nodeSqlParser.mod.Alter]
  }
  
  inline def Create(keyword: table | index | database): typings.nodeSqlParser.mod.Create = {
    val __obj = js.Dynamic.literal(keyword = keyword.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("create")
    __obj.asInstanceOf[typings.nodeSqlParser.mod.Create]
  }
  
  inline def Delete(from: js.Array[From | Dual], table: Any, where: Any): typings.nodeSqlParser.mod.Delete = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any], where = where.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("delete")
    __obj.asInstanceOf[typings.nodeSqlParser.mod.Delete]
  }
  
  inline def InsertReplace(table: Any, `type`: replace | insert, values: js.Array[InsertReplaceValue]): typings.nodeSqlParser.mod.InsertReplace = {
    val __obj = js.Dynamic.literal(table = table.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], columns = null, db = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.nodeSqlParser.mod.InsertReplace]
  }
  
  inline def Select(columns: (js.Array[Any | Column]) | Asterisk, where: Any): typings.nodeSqlParser.mod.Select = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], where = where.asInstanceOf[js.Any], distinct = null, from = null, groupby = null, having = null, limit = null, options = null, orderby = null)
    __obj.updateDynamic("type")("select")
    __obj.updateDynamic("with")(null)
    __obj.asInstanceOf[typings.nodeSqlParser.mod.Select]
  }
  
  inline def Update(set: js.Array[SetList], where: Any): typings.nodeSqlParser.mod.Update = {
    val __obj = js.Dynamic.literal(set = set.asInstanceOf[js.Any], where = where.asInstanceOf[js.Any], db = null, table = null)
    __obj.updateDynamic("type")("update")
    __obj.asInstanceOf[typings.nodeSqlParser.mod.Update]
  }
  
  inline def Use(db: String): typings.nodeSqlParser.mod.Use = {
    val __obj = js.Dynamic.literal(db = db.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("use")
    __obj.asInstanceOf[typings.nodeSqlParser.mod.Use]
  }
}
