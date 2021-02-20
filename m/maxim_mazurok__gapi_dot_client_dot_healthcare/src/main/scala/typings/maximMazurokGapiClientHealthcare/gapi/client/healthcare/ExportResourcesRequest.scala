package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportResourcesRequest extends StObject {
  
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
  implicit class ExportResourcesRequestMutableBuilder[Self <: ExportResourcesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBigqueryDestination(value: GoogleCloudHealthcareV1FhirBigQueryDestination): Self = StObject.set(x, "bigqueryDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBigqueryDestinationUndefined: Self = StObject.set(x, "bigqueryDestination", js.undefined)
    
    @scala.inline
    def setGcsDestination(value: GoogleCloudHealthcareV1FhirGcsDestination): Self = StObject.set(x, "gcsDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcsDestinationUndefined: Self = StObject.set(x, "gcsDestination", js.undefined)
  }
}
