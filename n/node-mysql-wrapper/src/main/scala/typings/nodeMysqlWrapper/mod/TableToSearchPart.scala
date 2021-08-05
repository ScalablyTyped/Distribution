package typings.nodeMysqlWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableToSearchPart extends StObject {
  
  var propertyName: String
  
  var tableName: String
}
object TableToSearchPart {
  
  inline def apply(propertyName: String, tableName: String): TableToSearchPart = {
    val __obj = js.Dynamic.literal(propertyName = propertyName.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableToSearchPart]
  }
  
  extension [Self <: TableToSearchPart](x: Self) {
    
    inline def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
    
    inline def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
  }
}
