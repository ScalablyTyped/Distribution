package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportDicomDataRequest extends js.Object {
  
  /**
    * The BigQuery output destination. You can only export to a BigQuery dataset that's in the same project as the DICOM store you're exporting from. The Cloud Healthcare Service Agent
    * requires two IAM roles on the BigQuery location: `roles/bigquery.dataEditor` and `roles/bigquery.jobUser`.
    */
  var bigqueryDestination: js.UndefOr[GoogleCloudHealthcareV1DicomBigQueryDestination] = js.native
  
  /** The Cloud Storage output destination. The Cloud Healthcare Service Agent requires the `roles/storage.objectAdmin` Cloud IAM roles on the Cloud Storage location. */
  var gcsDestination: js.UndefOr[GoogleCloudHealthcareV1DicomGcsDestination] = js.native
}
object ExportDicomDataRequest {
  
  @scala.inline
  def apply(): ExportDicomDataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportDicomDataRequest]
  }
  
  @scala.inline
  implicit class ExportDicomDataRequestOps[Self <: ExportDicomDataRequest] (val x: Self) extends AnyVal {
    
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
    def setBigqueryDestination(value: GoogleCloudHealthcareV1DicomBigQueryDestination): Self = this.set("bigqueryDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBigqueryDestination: Self = this.set("bigqueryDestination", js.undefined)
    
    @scala.inline
    def setGcsDestination(value: GoogleCloudHealthcareV1DicomGcsDestination): Self = this.set("gcsDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGcsDestination: Self = this.set("gcsDestination", js.undefined)
  }
}
