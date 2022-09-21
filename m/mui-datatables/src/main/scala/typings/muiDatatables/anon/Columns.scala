package typings.muiDatatables.anon

import typings.muiDatatables.mod.SelectableRows
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Columns extends StObject {
  
  var columns: js.Array[Any]
  
  var data: js.Array[Any]
  
  var selectableRows: SelectableRows
}
object Columns {
  
  inline def apply(columns: js.Array[Any], data: js.Array[Any], selectableRows: SelectableRows): Columns = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], selectableRows = selectableRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Columns]
  }
  
  extension [Self <: Columns](x: Self) {
    
    inline def setColumns(value: js.Array[Any]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsVarargs(value: Any*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setData(value: js.Array[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Any*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setSelectableRows(value: SelectableRows): Self = StObject.set(x, "selectableRows", value.asInstanceOf[js.Any])
  }
}
