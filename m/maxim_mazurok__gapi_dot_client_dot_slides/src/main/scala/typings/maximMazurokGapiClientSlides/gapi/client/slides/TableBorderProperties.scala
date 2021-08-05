package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableBorderProperties extends StObject {
  
  /** The dash style of the border. */
  var dashStyle: js.UndefOr[String] = js.undefined
  
  /** The fill of the table border. */
  var tableBorderFill: js.UndefOr[TableBorderFill] = js.undefined
  
  /** The thickness of the border. */
  var weight: js.UndefOr[Dimension] = js.undefined
}
object TableBorderProperties {
  
  inline def apply(): TableBorderProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableBorderProperties]
  }
  
  extension [Self <: TableBorderProperties](x: Self) {
    
    inline def setDashStyle(value: String): Self = StObject.set(x, "dashStyle", value.asInstanceOf[js.Any])
    
    inline def setDashStyleUndefined: Self = StObject.set(x, "dashStyle", js.undefined)
    
    inline def setTableBorderFill(value: TableBorderFill): Self = StObject.set(x, "tableBorderFill", value.asInstanceOf[js.Any])
    
    inline def setTableBorderFillUndefined: Self = StObject.set(x, "tableBorderFill", js.undefined)
    
    inline def setWeight(value: Dimension): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
