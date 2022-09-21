package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportResourcesRequest extends StObject {
  
  /**
    * If provided, only resources updated after this time are exported. The time uses the format YYYY-MM-DDThh:mm:ss.sss+zz:zz. For example, `2015-02-07T13:28:17.239+02:00` or
    * `2017-01-01T00:00:00Z`. The time must be specified to the second and include a time zone.
    */
  var _since: js.UndefOr[String] = js.undefined
  
  /** String of comma-delimited FHIR resource types. If provided, only resources of the specified resource type(s) are exported. */
  var _type: js.UndefOr[String] = js.undefined
  
  /**
    * The BigQuery output destination. The Cloud Healthcare Service Agent requires two IAM roles on the BigQuery location: `roles/bigquery.dataEditor` and `roles/bigquery.jobUser`. The
    * output is one BigQuery table per resource type. Unlike when setting `BigQueryDestination` for `StreamConfig`, `ExportResources` does not create BigQuery views.
    */
  var bigqueryDestination: js.UndefOr[GoogleCloudHealthcareV1FhirBigQueryDestination] = js.undefined
  
  /**
    * The Cloud Storage output destination. The Healthcare Service Agent account requires the `roles/storage.objectAdmin` role on the Cloud Storage location. The exported outputs are
    * organized by FHIR resource types. The server creates one object per resource type. Each object contains newline delimited JSON, and each line is a FHIR resource.
    */
  var gcsDestination: js.UndefOr[GoogleCloudHealthcareV1FhirGcsDestination] = js.undefined
}
object ExportResourcesRequest {
  
  inline def apply(): ExportResourcesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportResourcesRequest]
  }
  
  extension [Self <: ExportResourcesRequest](x: Self) {
    
    inline def setBigqueryDestination(value: GoogleCloudHealthcareV1FhirBigQueryDestination): Self = StObject.set(x, "bigqueryDestination", value.asInstanceOf[js.Any])
    
    inline def setBigqueryDestinationUndefined: Self = StObject.set(x, "bigqueryDestination", js.undefined)
    
    inline def setGcsDestination(value: GoogleCloudHealthcareV1FhirGcsDestination): Self = StObject.set(x, "gcsDestination", value.asInstanceOf[js.Any])
    
    inline def setGcsDestinationUndefined: Self = StObject.set(x, "gcsDestination", js.undefined)
    
    inline def set_since(value: String): Self = StObject.set(x, "_since", value.asInstanceOf[js.Any])
    
    inline def set_sinceUndefined: Self = StObject.set(x, "_since", js.undefined)
    
    inline def set_type(value: String): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
