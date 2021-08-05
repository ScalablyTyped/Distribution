package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudHealthcareV1FhirBigQueryDestination extends StObject {
  
  /** BigQuery URI to an existing dataset, up to 2000 characters long, in the format `bq://projectId.bqDatasetId`. */
  var datasetUri: js.UndefOr[String] = js.undefined
  
  /**
    * If this flag is `TRUE`, all tables are deleted from the dataset before the new exported tables are written. If the flag is not set and the destination dataset contains tables, the
    * export call returns an error.
    */
  var force: js.UndefOr[Boolean] = js.undefined
  
  /** The configuration for the exported BigQuery schema. */
  var schemaConfig: js.UndefOr[SchemaConfig] = js.undefined
}
object GoogleCloudHealthcareV1FhirBigQueryDestination {
  
  inline def apply(): GoogleCloudHealthcareV1FhirBigQueryDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudHealthcareV1FhirBigQueryDestination]
  }
  
  extension [Self <: GoogleCloudHealthcareV1FhirBigQueryDestination](x: Self) {
    
    inline def setDatasetUri(value: String): Self = StObject.set(x, "datasetUri", value.asInstanceOf[js.Any])
    
    inline def setDatasetUriUndefined: Self = StObject.set(x, "datasetUri", js.undefined)
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setSchemaConfig(value: SchemaConfig): Self = StObject.set(x, "schemaConfig", value.asInstanceOf[js.Any])
    
    inline def setSchemaConfigUndefined: Self = StObject.set(x, "schemaConfig", js.undefined)
  }
}
