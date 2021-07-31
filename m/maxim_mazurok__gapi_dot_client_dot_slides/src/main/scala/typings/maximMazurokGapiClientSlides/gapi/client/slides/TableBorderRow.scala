package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableBorderRow extends StObject {
  
  /** Properties of each border cell. When a border's adjacent table cells are merged, it is not included in the response. */
  var tableBorderCells: js.UndefOr[js.Array[TableBorderCell]] = js.undefined
}
object TableBorderRow {
  
  @scala.inline
  def apply(): TableBorderRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableBorderRow]
  }
  
  @scala.inline
  implicit class TableBorderRowMutableBuilder[Self <: TableBorderRow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTableBorderCells(value: js.Array[TableBorderCell]): Self = StObject.set(x, "tableBorderCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableBorderCellsUndefined: Self = StObject.set(x, "tableBorderCells", js.undefined)
    
    @scala.inline
    def setTableBorderCellsVarargs(value: TableBorderCell*): Self = StObject.set(x, "tableBorderCells", js.Array(value :_*))
  }
}
