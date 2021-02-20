package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplaceAllShapesWithSheetsChartResponse extends StObject {
  
  /** The number of shapes replaced with charts. */
  var occurrencesChanged: js.UndefOr[Double] = js.native
}
object ReplaceAllShapesWithSheetsChartResponse {
  
  @scala.inline
  def apply(): ReplaceAllShapesWithSheetsChartResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplaceAllShapesWithSheetsChartResponse]
  }
  
  @scala.inline
  implicit class ReplaceAllShapesWithSheetsChartResponseMutableBuilder[Self <: ReplaceAllShapesWithSheetsChartResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOccurrencesChanged(value: Double): Self = StObject.set(x, "occurrencesChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccurrencesChangedUndefined: Self = StObject.set(x, "occurrencesChanged", js.undefined)
  }
}
