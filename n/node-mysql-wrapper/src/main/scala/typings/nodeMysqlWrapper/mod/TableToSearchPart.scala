package typings.nodeMysqlWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableToSearchPart extends StObject {
  
  var propertyName: String
  
  var tableName: String
}
object TableToSearchPart {
  
  @scala.inline
  def apply(propertyName: String, tableName: String): TableToSearchPart = {
    val __obj = js.Dynamic.literal(propertyName = propertyName.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableToSearchPart]
  }
  
  @scala.inline
  implicit class TableToSearchPartMutableBuilder[Self <: TableToSearchPart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
  }
}
