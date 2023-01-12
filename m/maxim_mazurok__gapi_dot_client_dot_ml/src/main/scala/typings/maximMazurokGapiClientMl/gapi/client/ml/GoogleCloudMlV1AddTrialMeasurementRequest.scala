package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudMlV1AddTrialMeasurementRequest extends StObject {
  
  /** Required. The measurement to be added to a trial. */
  var measurement: js.UndefOr[GoogleCloudMlV1Measurement] = js.undefined
}
object GoogleCloudMlV1AddTrialMeasurementRequest {
  
  inline def apply(): GoogleCloudMlV1AddTrialMeasurementRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1AddTrialMeasurementRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudMlV1AddTrialMeasurementRequest] (val x: Self) extends AnyVal {
    
    inline def setMeasurement(value: GoogleCloudMlV1Measurement): Self = StObject.set(x, "measurement", value.asInstanceOf[js.Any])
    
    inline def setMeasurementUndefined: Self = StObject.set(x, "measurement", js.undefined)
  }
}
