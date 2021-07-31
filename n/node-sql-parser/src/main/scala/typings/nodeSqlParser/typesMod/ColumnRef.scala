package typings.nodeSqlParser.typesMod

import typings.nodeSqlParser.nodeSqlParserStrings.column_ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnRef extends StObject {
  
  var column: String
  
  var table: String | Null
  
  var `type`: column_ref
}
object ColumnRef {
  
  @scala.inline
  def apply(column: String): ColumnRef = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], table = null)
    __obj.updateDynamic("type")("column_ref")
    __obj.asInstanceOf[ColumnRef]
  }
  
  @scala.inline
  implicit class ColumnRefMutableBuilder[Self <: ColumnRef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: String): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableNull: Self = StObject.set(x, "table", null)
    
    @scala.inline
    def setType(value: column_ref): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
