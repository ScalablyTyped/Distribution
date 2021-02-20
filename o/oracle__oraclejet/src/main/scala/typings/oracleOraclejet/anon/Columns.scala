package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Columns extends StObject {
  
  var columns: DataTypesDragEnter = js.native
  
  var rows: DragEnterDragLeave = js.native
}
object Columns {
  
  @scala.inline
  def apply(columns: DataTypesDragEnter, rows: DragEnterDragLeave): Columns = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Columns]
  }
  
  @scala.inline
  implicit class ColumnsMutableBuilder[Self <: Columns] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: DataTypesDragEnter): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRows(value: DragEnterDragLeave): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
  }
}
