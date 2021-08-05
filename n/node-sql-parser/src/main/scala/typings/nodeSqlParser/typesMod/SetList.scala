package typings.nodeSqlParser.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetList extends StObject {
  
  var column: String
  
  var table: String | Null
  
  var value: js.Any
}
object SetList {
  
  inline def apply(column: String, value: js.Any): SetList = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], table = null)
    __obj.asInstanceOf[SetList]
  }
  
  extension [Self <: SetList](x: Self) {
    
    inline def setColumn(value: String): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    inline def setTableNull: Self = StObject.set(x, "table", null)
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
