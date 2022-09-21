package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableRow extends StObject {
  
  /** Height of a row. */
  var rowHeight: js.UndefOr[Dimension] = js.undefined
  
  /**
    * Properties and contents of each cell. Cells that span multiple columns are represented only once with a column_span greater than 1. As a result, the length of this collection does
    * not always match the number of columns of the entire table.
    */
  var tableCells: js.UndefOr[js.Array[TableCell]] = js.undefined
  
  /** Properties of the row. */
  var tableRowProperties: js.UndefOr[TableRowProperties] = js.undefined
}
object TableRow {
  
  inline def apply(): TableRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableRow]
  }
  
  extension [Self <: TableRow](x: Self) {
    
    inline def setRowHeight(value: Dimension): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
    
    inline def setRowHeightUndefined: Self = StObject.set(x, "rowHeight", js.undefined)
    
    inline def setTableCells(value: js.Array[TableCell]): Self = StObject.set(x, "tableCells", value.asInstanceOf[js.Any])
    
    inline def setTableCellsUndefined: Self = StObject.set(x, "tableCells", js.undefined)
    
    inline def setTableCellsVarargs(value: TableCell*): Self = StObject.set(x, "tableCells", js.Array(value*))
    
    inline def setTableRowProperties(value: TableRowProperties): Self = StObject.set(x, "tableRowProperties", value.asInstanceOf[js.Any])
    
    inline def setTableRowPropertiesUndefined: Self = StObject.set(x, "tableRowProperties", js.undefined)
  }
}
