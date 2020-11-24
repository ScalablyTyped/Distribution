package typings.maximMazurokGapiClientMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudMlV1AddTrialMeasurementRequest extends js.Object {
  
  /** Required. The measurement to be added to a trial. */
  var measurement: js.UndefOr[GoogleCloudMlV1Measurement] = js.native
}
object GoogleCloudMlV1AddTrialMeasurementRequest {
  
  @scala.inline
  def apply(): GoogleCloudMlV1AddTrialMeasurementRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1AddTrialMeasurementRequest]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1AddTrialMeasurementRequestOps[Self <: GoogleCloudMlV1AddTrialMeasurementRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMeasurement(value: GoogleCloudMlV1Measurement): Self = this.set("measurement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeasurement: Self = this.set("measurement", js.undefined)
  }
}
