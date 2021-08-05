package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableBorderCell extends StObject {
  
  /** The location of the border within the border table. */
  var location: js.UndefOr[TableCellLocation] = js.undefined
  
  /** The border properties. */
  var tableBorderProperties: js.UndefOr[TableBorderProperties] = js.undefined
}
object TableBorderCell {
  
  inline def apply(): TableBorderCell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableBorderCell]
  }
  
  extension [Self <: TableBorderCell](x: Self) {
    
    inline def setLocation(value: TableCellLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setTableBorderProperties(value: TableBorderProperties): Self = StObject.set(x, "tableBorderProperties", value.asInstanceOf[js.Any])
    
    inline def setTableBorderPropertiesUndefined: Self = StObject.set(x, "tableBorderProperties", js.undefined)
  }
}
