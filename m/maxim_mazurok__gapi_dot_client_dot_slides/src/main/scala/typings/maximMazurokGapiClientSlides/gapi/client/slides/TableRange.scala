package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableRange extends StObject {
  
  /** The column span of the table range. */
  var columnSpan: js.UndefOr[Double] = js.native
  
  /** The starting location of the table range. */
  var location: js.UndefOr[TableCellLocation] = js.native
  
  /** The row span of the table range. */
  var rowSpan: js.UndefOr[Double] = js.native
}
object TableRange {
  
  @scala.inline
  def apply(): TableRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableRange]
  }
  
  @scala.inline
  implicit class TableRangeMutableBuilder[Self <: TableRange] (val x: Self) extends AnyVal {
    
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
  }
}
