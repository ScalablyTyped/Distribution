package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportDicomDataRequest extends js.Object {
  
  /**
    * Cloud Storage source data location and import configuration. The Cloud Healthcare Service Agent requires the `roles/storage.objectViewer` Cloud IAM roles on the Cloud Storage
    * location.
    */
  var gcsSource: js.UndefOr[GoogleCloudHealthcareV1DicomGcsSource] = js.native
}
object ImportDicomDataRequest {
  
  @scala.inline
  def apply(): ImportDicomDataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportDicomDataRequest]
  }
  
  @scala.inline
  implicit class ImportDicomDataRequestOps[Self <: ImportDicomDataRequest] (val x: Self) extends AnyVal {
    
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
    def setGcsSource(value: GoogleCloudHealthcareV1DicomGcsSource): Self = this.set("gcsSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGcsSource: Self = this.set("gcsSource", js.undefined)
  }
}
