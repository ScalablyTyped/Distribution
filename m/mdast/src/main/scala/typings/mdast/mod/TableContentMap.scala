package typings.mdast.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableContentMap extends StObject {
  
  var tableRow: TableRow
}
object TableContentMap {
  
  inline def apply(tableRow: TableRow): TableContentMap = {
    val __obj = js.Dynamic.literal(tableRow = tableRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableContentMap]
  }
  
  extension [Self <: TableContentMap](x: Self) {
    
    inline def setTableRow(value: TableRow): Self = StObject.set(x, "tableRow", value.asInstanceOf[js.Any])
  }
}
