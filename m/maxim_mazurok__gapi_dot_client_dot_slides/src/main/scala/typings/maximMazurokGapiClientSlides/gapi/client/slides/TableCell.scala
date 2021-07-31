package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableCell extends StObject {
  
  /** Column span of the cell. */
  var columnSpan: js.UndefOr[Double] = js.undefined
  
  /** The location of the cell within the table. */
  var location: js.UndefOr[TableCellLocation] = js.undefined
  
  /** Row span of the cell. */
  var rowSpan: js.UndefOr[Double] = js.undefined
  
  /** The properties of the table cell. */
  var tableCellProperties: js.UndefOr[TableCellProperties] = js.undefined
  
  /** The text content of the cell. */
  var text: js.UndefOr[TextContent] = js.undefined
}
object TableCell {
  
  @scala.inline
  def apply(): TableCell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableCell]
  }
  
  @scala.inline
  implicit class TableCellMutableBuilder[Self <: TableCell] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnSpan(value: Double): Self = StObject.set(x, "columnSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnSpanUndefined: Self = StObject.set(x, "columnSpan", js.undefined)
    
    @scala.inline
    def setLocation(value: TableCellLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
    
    @scala.inline
    def setTableCellProperties(value: TableCellProperties): Self = StObject.set(x, "tableCellProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableCellPropertiesUndefined: Self = StObject.set(x, "tableCellProperties", js.undefined)
    
    @scala.inline
    def setText(value: TextContent): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
