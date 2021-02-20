package typings.nodeSqlParser.typesMod

import typings.nodeSqlParser.nodeSqlParserStrings.column_ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnRef extends StObject {
  
  var column: String = js.native
  
  var table: String | Null = js.native
  
  var `type`: column_ref = js.native
}
object ColumnRef {
  
  @scala.inline
  def apply(column: String, `type`: column_ref): ColumnRef = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
