package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableBorderCell extends StObject {
  
  /** The location of the border within the border table. */
  var location: js.UndefOr[TableCellLocation] = js.native
  
  /** The border properties. */
  var tableBorderProperties: js.UndefOr[TableBorderProperties] = js.native
}
object TableBorderCell {
  
  @scala.inline
  def apply(): TableBorderCell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableBorderCell]
  }
  
  @scala.inline
  implicit class TableBorderCellMutableBuilder[Self <: TableBorderCell] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocation(value: TableCellLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setTableBorderProperties(value: TableBorderProperties): Self = StObject.set(x, "tableBorderProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableBorderPropertiesUndefined: Self = StObject.set(x, "tableBorderProperties", js.undefined)
  }
}
