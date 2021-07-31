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
  
  @scala.inline
  def apply(column: String, value: js.Any): SetList = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], table = null)
    __obj.asInstanceOf[SetList]
  }
  
  @scala.inline
  implicit class SetListMutableBuilder[Self <: SetList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: String): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableNull: Self = StObject.set(x, "table", null)
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
