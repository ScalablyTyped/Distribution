package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplaceAllShapesWithSheetsChartResponse extends StObject {
  
  /** The number of shapes replaced with charts. */
  var occurrencesChanged: js.UndefOr[Double] = js.undefined
}
object ReplaceAllShapesWithSheetsChartResponse {
  
  inline def apply(): ReplaceAllShapesWithSheetsChartResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplaceAllShapesWithSheetsChartResponse]
  }
  
  extension [Self <: ReplaceAllShapesWithSheetsChartResponse](x: Self) {
    
    inline def setOccurrencesChanged(value: Double): Self = StObject.set(x, "occurrencesChanged", value.asInstanceOf[js.Any])
    
    inline def setOccurrencesChangedUndefined: Self = StObject.set(x, "occurrencesChanged", js.undefined)
  }
}
