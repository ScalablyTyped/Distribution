package typings.mdast.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowContentMap extends StObject {
  
  var tableCell: TableCell
}
object RowContentMap {
  
  inline def apply(tableCell: TableCell): RowContentMap = {
    val __obj = js.Dynamic.literal(tableCell = tableCell.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowContentMap]
  }
  
  extension [Self <: RowContentMap](x: Self) {
    
    inline def setTableCell(value: TableCell): Self = StObject.set(x, "tableCell", value.asInstanceOf[js.Any])
  }
}
