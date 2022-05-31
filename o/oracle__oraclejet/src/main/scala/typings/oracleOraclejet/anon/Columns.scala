package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Columns extends StObject {
  
  var columns: DataTypesDragEnter
  
  var rows: DragEnterDragLeave
}
object Columns {
  
  inline def apply(columns: DataTypesDragEnter, rows: DragEnterDragLeave): Columns = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Columns]
  }
  
  extension [Self <: Columns](x: Self) {
    
    inline def setColumns(value: DataTypesDragEnter): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setRows(value: DragEnterDragLeave): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
  }
}
