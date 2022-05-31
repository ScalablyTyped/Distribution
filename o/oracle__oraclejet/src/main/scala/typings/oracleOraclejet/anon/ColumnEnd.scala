package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnEnd[K, D] extends StObject {
  
  var column: Resizable[K, D]
  
  var columnEnd: ClassNameLabel[K, D]
  
  var row: Sortable[K, D]
  
  var rowEnd: LabelRenderer[K, D]
}
object ColumnEnd {
  
  inline def apply[K, D](
    column: Resizable[K, D],
    columnEnd: ClassNameLabel[K, D],
    row: Sortable[K, D],
    rowEnd: LabelRenderer[K, D]
  ): ColumnEnd[K, D] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnEnd = columnEnd.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], rowEnd = rowEnd.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnEnd[K, D]]
  }
  
  extension [Self <: ColumnEnd[?, ?], K, D](x: Self & (ColumnEnd[K, D])) {
    
    inline def setColumn(value: Resizable[K, D]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnEnd(value: ClassNameLabel[K, D]): Self = StObject.set(x, "columnEnd", value.asInstanceOf[js.Any])
    
    inline def setRow(value: Sortable[K, D]): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setRowEnd(value: LabelRenderer[K, D]): Self = StObject.set(x, "rowEnd", value.asInstanceOf[js.Any])
  }
}
