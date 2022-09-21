package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableBorderRow extends StObject {
  
  /** Properties of each border cell. When a border's adjacent table cells are merged, it is not included in the response. */
  var tableBorderCells: js.UndefOr[js.Array[TableBorderCell]] = js.undefined
}
object TableBorderRow {
  
  inline def apply(): TableBorderRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableBorderRow]
  }
  
  extension [Self <: TableBorderRow](x: Self) {
    
    inline def setTableBorderCells(value: js.Array[TableBorderCell]): Self = StObject.set(x, "tableBorderCells", value.asInstanceOf[js.Any])
    
    inline def setTableBorderCellsUndefined: Self = StObject.set(x, "tableBorderCells", js.undefined)
    
    inline def setTableBorderCellsVarargs(value: TableBorderCell*): Self = StObject.set(x, "tableBorderCells", js.Array(value*))
  }
}
