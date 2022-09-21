package typings.maximMazurokGapiClientStreetviewpublish.gapi.client.streetviewpublish

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImuDataGapFailureDetails extends StObject {
  
  /** The duration of the gap in IMU data that was found. */
  var gapDuration: js.UndefOr[String] = js.undefined
  
  /** Relative time (from the start of the video stream) when the gap started. */
  var gapStartTime: js.UndefOr[String] = js.undefined
}
object ImuDataGapFailureDetails {
  
  inline def apply(): ImuDataGapFailureDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImuDataGapFailureDetails]
  }
  
  extension [Self <: ImuDataGapFailureDetails](x: Self) {
    
    inline def setGapDuration(value: String): Self = StObject.set(x, "gapDuration", value.asInstanceOf[js.Any])
    
    inline def setGapDurationUndefined: Self = StObject.set(x, "gapDuration", js.undefined)
    
    inline def setGapStartTime(value: String): Self = StObject.set(x, "gapStartTime", value.asInstanceOf[js.Any])
    
    inline def setGapStartTimeUndefined: Self = StObject.set(x, "gapStartTime", js.undefined)
  }
}
