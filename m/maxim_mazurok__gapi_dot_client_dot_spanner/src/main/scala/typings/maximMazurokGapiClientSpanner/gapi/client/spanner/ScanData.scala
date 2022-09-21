package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScanData extends StObject {
  
  /** Cloud Key Visualizer scan data. The range of time this information covers is captured via the above time range fields. Note, this field is not available to the ListScans method. */
  var data: js.UndefOr[VisualizationData] = js.undefined
  
  /** The upper bound for when the contained data is defined. */
  var endTime: js.UndefOr[String] = js.undefined
  
  /** A range of time (inclusive) for when the contained data is defined. The lower bound for when the contained data is defined. */
  var startTime: js.UndefOr[String] = js.undefined
}
object ScanData {
  
  inline def apply(): ScanData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScanData]
  }
  
  extension [Self <: ScanData](x: Self) {
    
    inline def setData(value: VisualizationData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
