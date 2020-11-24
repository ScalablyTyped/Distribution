package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudHealthcareV1FhirBigQueryDestination extends js.Object {
  
  /** BigQuery URI to an existing dataset, up to 2000 characters long, in the format `bq://projectId.bqDatasetId`. */
  var datasetUri: js.UndefOr[String] = js.native
  
  /**
    * If this flag is `TRUE`, all tables are deleted from the dataset before the new exported tables are written. If the flag is not set and the destination dataset contains tables, the
    * export call returns an error.
    */
  var force: js.UndefOr[Boolean] = js.native
  
  /** The configuration for the exported BigQuery schema. */
  var schemaConfig: js.UndefOr[SchemaConfig] = js.native
}
object GoogleCloudHealthcareV1FhirBigQueryDestination {
  
  @scala.inline
  def apply(): GoogleCloudHealthcareV1FhirBigQueryDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudHealthcareV1FhirBigQueryDestination]
  }
  
  @scala.inline
  implicit class GoogleCloudHealthcareV1FhirBigQueryDestinationOps[Self <: GoogleCloudHealthcareV1FhirBigQueryDestination] (val x: Self) extends AnyVal {
    
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
    def setDatasetUri(value: String): Self = this.set("datasetUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatasetUri: Self = this.set("datasetUri", js.undefined)
    
    @scala.inline
    def setForce(value: Boolean): Self = this.set("force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForce: Self = this.set("force", js.undefined)
    
    @scala.inline
    def setSchemaConfig(value: SchemaConfig): Self = this.set("schemaConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemaConfig: Self = this.set("schemaConfig", js.undefined)
  }
}
