package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoFillRequest extends StObject {
  
  /** The range to autofill. This will examine the range and detect the location that has data and automatically fill that data in to the rest of the range. */
  var range: js.UndefOr[GridRange] = js.undefined
  
  /** The source and destination areas to autofill. This explicitly lists the source of the autofill and where to extend that data. */
  var sourceAndDestination: js.UndefOr[SourceAndDestination] = js.undefined
  
  /** True if we should generate data with the "alternate" series. This differs based on the type and amount of source data. */
  var useAlternateSeries: js.UndefOr[Boolean] = js.undefined
}
object AutoFillRequest {
  
  @scala.inline
  def apply(): AutoFillRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoFillRequest]
  }
  
  @scala.inline
  implicit class AutoFillRequestMutableBuilder[Self <: AutoFillRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRange(value: GridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    @scala.inline
    def setSourceAndDestination(value: SourceAndDestination): Self = StObject.set(x, "sourceAndDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceAndDestinationUndefined: Self = StObject.set(x, "sourceAndDestination", js.undefined)
    
    @scala.inline
    def setUseAlternateSeries(value: Boolean): Self = StObject.set(x, "useAlternateSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseAlternateSeriesUndefined: Self = StObject.set(x, "useAlternateSeries", js.undefined)
  }
}
