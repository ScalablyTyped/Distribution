package typings.nodeSqlParser.typesMod

import typings.nodeSqlParser.nodeSqlParserStrings.Asterisk
import typings.nodeSqlParser.nodeSqlParserStrings.insert
import typings.nodeSqlParser.nodeSqlParserStrings.replace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.nodeSqlParser.typesMod.Use
  - typings.nodeSqlParser.typesMod.Select
  - typings.nodeSqlParser.typesMod.InsertReplace
  - typings.nodeSqlParser.typesMod.Update
  - typings.nodeSqlParser.typesMod.Delete
  - typings.nodeSqlParser.typesMod.Alter
*/
trait AST extends StObject
object AST {
  
  inline def Alter(expr: js.Any, table: From): typings.nodeSqlParser.typesMod.Alter = {
    val __obj = js.Dynamic.literal(expr = expr.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("alter")
    __obj.asInstanceOf[typings.nodeSqlParser.typesMod.Alter]
  }
  
  inline def Delete(from: js.Array[From | Dual], table: js.Any, where: js.Any): typings.nodeSqlParser.typesMod.Delete = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any], where = where.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("delete")
    __obj.asInstanceOf[typings.nodeSqlParser.typesMod.Delete]
  }
  
  inline def InsertReplace(table: js.Any, `type`: replace | insert, values: js.Array[InsertReplaceValue]): typings.nodeSqlParser.typesMod.InsertReplace = {
    val __obj = js.Dynamic.literal(table = table.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], columns = null, db = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.nodeSqlParser.typesMod.InsertReplace]
  }
  
  inline def Select(columns: (js.Array[js.Any | Column]) | Asterisk, where: js.Any): typings.nodeSqlParser.typesMod.Select = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], where = where.asInstanceOf[js.Any], distinct = null, from = null, groupby = null, having = null, limit = null, options = null, orderby = null)
    __obj.updateDynamic("type")("select")
    __obj.updateDynamic("with")(null)
    __obj.asInstanceOf[typings.nodeSqlParser.typesMod.Select]
  }
  
  inline def Update(set: js.Array[SetList], where: js.Any): typings.nodeSqlParser.typesMod.Update = {
    val __obj = js.Dynamic.literal(set = set.asInstanceOf[js.Any], where = where.asInstanceOf[js.Any], db = null, table = null)
    __obj.updateDynamic("type")("update")
    __obj.asInstanceOf[typings.nodeSqlParser.typesMod.Update]
  }
  
  inline def Use(db: String): typings.nodeSqlParser.typesMod.Use = {
    val __obj = js.Dynamic.literal(db = db.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("use")
    __obj.asInstanceOf[typings.nodeSqlParser.typesMod.Use]
  }
}
