package typings.nodeSqlParser.typesMod

import typings.nodeSqlParser.nodeSqlParserStrings.insert
import typings.nodeSqlParser.nodeSqlParserStrings.replace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsertReplace
  extends StObject
     with AST {
  
  var columns: js.Array[String] | Null
  
  var db: String | Null
  
  var table: Any
  
  var `type`: replace | insert
  
  var values: js.Array[InsertReplaceValue]
}
object InsertReplace {
  
  inline def apply(table: Any, `type`: replace | insert, values: js.Array[InsertReplaceValue]): InsertReplace = {
    val __obj = js.Dynamic.literal(table = table.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], columns = null, db = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertReplace]
  }
  
  extension [Self <: InsertReplace](x: Self) {
    
    inline def setColumns(value: js.Array[String]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsNull: Self = StObject.set(x, "columns", null)
    
    inline def setColumnsVarargs(value: String*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setDb(value: String): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
    
    inline def setDbNull: Self = StObject.set(x, "db", null)
    
    inline def setTable(value: Any): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    inline def setType(value: replace | insert): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Array[InsertReplaceValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: InsertReplaceValue*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
