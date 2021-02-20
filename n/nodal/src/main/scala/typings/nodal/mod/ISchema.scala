package typings.nodal.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISchema extends StObject {
  
  var columns: js.Array[IColumn] = js.native
  
  var table: String = js.native
}
object ISchema {
  
  @scala.inline
  def apply(columns: js.Array[IColumn], table: String): ISchema = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISchema]
  }
  
  @scala.inline
  implicit class ISchemaMutableBuilder[Self <: ISchema] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: js.Array[IColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsVarargs(value: IColumn*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
  }
}
