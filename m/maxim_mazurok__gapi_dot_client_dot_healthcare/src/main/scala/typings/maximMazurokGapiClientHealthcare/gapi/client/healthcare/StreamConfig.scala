package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamConfig extends StObject {
  
  /**
    * The destination BigQuery structure that contains both the dataset location and corresponding schema config. The output is organized in one table per resource type. The server reuses
    * the existing tables (if any) that are named after the resource types. For example, "Patient", "Observation". When there is no existing table for a given resource type, the server
    * attempts to create one. When a table schema doesn't align with the schema config, either because of existing incompatible schema or out of band incompatible modification, the server
    * does not stream in new data. BigQuery imposes a 1 MB limit on streaming insert row size, therefore any resource mutation that generates more than 1 MB of BigQuery data is not
    * streamed. One resolution in this case is to delete the incompatible table and let the server recreate one, though the newly created table only contains data after the table
    * recreation. Results are written to BigQuery tables according to the parameters in BigQueryDestination.WriteDisposition. Different versions of the same resource are distinguishable
    * by the meta.versionId and meta.lastUpdated columns. The operation (CREATE/UPDATE/DELETE) that results in the new version is recorded in the meta.tag. The tables contain all
    * historical resource versions since streaming was enabled. For query convenience, the server also creates one view per table of the same name containing only the current resource
    * version. The streamed data in the BigQuery dataset is not guaranteed to be completely unique. The combination of the id and meta.versionId columns should ideally identify a single
    * unique row. But in rare cases, duplicates may exist. At query time, users may use the SQL select statement to keep only one of the duplicate rows given an id and meta.versionId
    * pair. Alternatively, the server created view mentioned above also filters out duplicates. If a resource mutation cannot be streamed to BigQuery, errors are logged to Cloud Logging.
    * For more information, see [Viewing error logs in Cloud Logging](https://cloud.google.com/healthcare/docs/how-tos/logging)).
    */
  var bigqueryDestination: js.UndefOr[GoogleCloudHealthcareV1FhirBigQueryDestination] = js.undefined
  
  /**
    * Supply a FHIR resource type (such as "Patient" or "Observation"). See https://www.hl7.org/fhir/valueset-resource-types.html for a list of all FHIR resource types. The server treats
    * an empty list as an intent to stream all the supported resource types in this FHIR store.
    */
  var resourceTypes: js.UndefOr[js.Array[String]] = js.undefined
}
object StreamConfig {
  
  inline def apply(): StreamConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamConfig]
  }
  
  extension [Self <: StreamConfig](x: Self) {
    
    inline def setBigqueryDestination(value: GoogleCloudHealthcareV1FhirBigQueryDestination): Self = StObject.set(x, "bigqueryDestination", value.asInstanceOf[js.Any])
    
    inline def setBigqueryDestinationUndefined: Self = StObject.set(x, "bigqueryDestination", js.undefined)
    
    inline def setResourceTypes(value: js.Array[String]): Self = StObject.set(x, "resourceTypes", value.asInstanceOf[js.Any])
    
    inline def setResourceTypesUndefined: Self = StObject.set(x, "resourceTypes", js.undefined)
    
    inline def setResourceTypesVarargs(value: String*): Self = StObject.set(x, "resourceTypes", js.Array(value*))
  }
}
