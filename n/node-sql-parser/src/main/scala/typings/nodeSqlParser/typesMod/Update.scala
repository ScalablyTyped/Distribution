package typings.nodeSqlParser.typesMod

import typings.nodeSqlParser.nodeSqlParserStrings.update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Update
  extends StObject
     with AST {
  
  var db: String | Null
  
  var set: js.Array[SetList]
  
  var table: (js.Array[From | Dual]) | Null
  
  var `type`: update
  
  var where: js.Any
}
object Update {
  
  inline def apply(set: js.Array[SetList], where: js.Any): Update = {
    val __obj = js.Dynamic.literal(set = set.asInstanceOf[js.Any], where = where.asInstanceOf[js.Any], db = null, table = null)
    __obj.updateDynamic("type")("update")
    __obj.asInstanceOf[Update]
  }
  
  extension [Self <: Update](x: Self) {
    
    inline def setDb(value: String): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
    
    inline def setDbNull: Self = StObject.set(x, "db", null)
    
    inline def setSet(value: js.Array[SetList]): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
    
    inline def setSetVarargs(value: SetList*): Self = StObject.set(x, "set", js.Array(value :_*))
    
    inline def setTable(value: js.Array[From | Dual]): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    inline def setTableNull: Self = StObject.set(x, "table", null)
    
    inline def setTableVarargs(value: (From | Dual)*): Self = StObject.set(x, "table", js.Array(value :_*))
    
    inline def setType(value: update): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWhere(value: js.Any): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
  }
}
