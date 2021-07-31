package typings.muiDatatables.anon

import typings.muiDatatables.mod.SelectableRows
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Columns extends StObject {
  
  var columns: js.Array[js.Any]
  
  var data: js.Array[js.Any]
  
  var selectableRows: SelectableRows
}
object Columns {
  
  @scala.inline
  def apply(columns: js.Array[js.Any], data: js.Array[js.Any], selectableRows: SelectableRows): Columns = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], selectableRows = selectableRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Columns]
  }
  
  @scala.inline
  implicit class ColumnsMutableBuilder[Self <: Columns] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: js.Array[js.Any]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsVarargs(value: js.Any*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setSelectableRows(value: SelectableRows): Self = StObject.set(x, "selectableRows", value.asInstanceOf[js.Any])
  }
}
