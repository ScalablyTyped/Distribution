package typings.maximMazurokGapiClientStreetviewpublish.gapi.client.streetviewpublish

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessingFailureDetails extends StObject {
  
  /** See GpsDataGapFailureDetails. */
  var gpsDataGapDetails: js.UndefOr[GpsDataGapFailureDetails] = js.undefined
  
  /** See ImuDataGapFailureDetails. */
  var imuDataGapDetails: js.UndefOr[ImuDataGapFailureDetails] = js.undefined
  
  /** See InsufficientGpsFailureDetails. */
  var insufficientGpsDetails: js.UndefOr[InsufficientGpsFailureDetails] = js.undefined
  
  /** See NotOutdoorsFailureDetails. */
  var notOutdoorsDetails: js.UndefOr[NotOutdoorsFailureDetails] = js.undefined
}
object ProcessingFailureDetails {
  
  inline def apply(): ProcessingFailureDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProcessingFailureDetails]
  }
  
  extension [Self <: ProcessingFailureDetails](x: Self) {
    
    inline def setGpsDataGapDetails(value: GpsDataGapFailureDetails): Self = StObject.set(x, "gpsDataGapDetails", value.asInstanceOf[js.Any])
    
    inline def setGpsDataGapDetailsUndefined: Self = StObject.set(x, "gpsDataGapDetails", js.undefined)
    
    inline def setImuDataGapDetails(value: ImuDataGapFailureDetails): Self = StObject.set(x, "imuDataGapDetails", value.asInstanceOf[js.Any])
    
    inline def setImuDataGapDetailsUndefined: Self = StObject.set(x, "imuDataGapDetails", js.undefined)
    
    inline def setInsufficientGpsDetails(value: InsufficientGpsFailureDetails): Self = StObject.set(x, "insufficientGpsDetails", value.asInstanceOf[js.Any])
    
    inline def setInsufficientGpsDetailsUndefined: Self = StObject.set(x, "insufficientGpsDetails", js.undefined)
    
    inline def setNotOutdoorsDetails(value: NotOutdoorsFailureDetails): Self = StObject.set(x, "notOutdoorsDetails", value.asInstanceOf[js.Any])
    
    inline def setNotOutdoorsDetailsUndefined: Self = StObject.set(x, "notOutdoorsDetails", js.undefined)
  }
}
