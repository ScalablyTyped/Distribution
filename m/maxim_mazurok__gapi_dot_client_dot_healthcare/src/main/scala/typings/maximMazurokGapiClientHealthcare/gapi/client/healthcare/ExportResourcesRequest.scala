package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportResourcesRequest extends js.Object {
  
  /**
    * The BigQuery output destination. The Cloud Healthcare Service Agent requires two IAM roles on the BigQuery location: `roles/bigquery.dataEditor` and `roles/bigquery.jobUser`. The
    * output is one BigQuery table per resource type.
    */
  var bigqueryDestination: js.UndefOr[GoogleCloudHealthcareV1FhirBigQueryDestination] = js.native
  
  /**
    * The Cloud Storage output destination. The Healthcare Service Agent account requires the `roles/storage.objectAdmin` role on the Cloud Storage location. The exported outputs are
    * organized by FHIR resource types. The server creates one object per resource type. Each object contains newline delimited JSON, and each line is a FHIR resource.
    */
  var gcsDestination: js.UndefOr[GoogleCloudHealthcareV1FhirGcsDestination] = js.native
}
object ExportResourcesRequest {
  
  @scala.inline
  def apply(): ExportResourcesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportResourcesRequest]
  }
  
  @scala.inline
  implicit class ExportResourcesRequestOps[Self <: ExportResourcesRequest] (val x: Self) extends AnyVal {
    
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
    def setBigqueryDestination(value: GoogleCloudHealthcareV1FhirBigQueryDestination): Self = this.set("bigqueryDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBigqueryDestination: Self = this.set("bigqueryDestination", js.undefined)
    
    @scala.inline
    def setGcsDestination(value: GoogleCloudHealthcareV1FhirGcsDestination): Self = this.set("gcsDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGcsDestination: Self = this.set("gcsDestination", js.undefined)
  }
}
