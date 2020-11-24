package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeidentifyFhirStoreRequest extends js.Object {
  
  /** Deidentify configuration. */
  var config: js.UndefOr[DeidentifyConfig] = js.native
  
  /**
    * The name of the FHIR store to create and write the redacted data to. For example, `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/fhirStores/{fhir_store_id}`. *
    * The destination dataset must exist. * The source dataset and destination dataset must both reside in the same project. De-identifying data across multiple projects is not supported.
    * * The destination FHIR store must exist. * The caller must have the healthcare.fhirResources.update permission to write to the destination FHIR store.
    */
  var destinationStore: js.UndefOr[String] = js.native
  
  /** A filter specifying the resources to include in the output. If not specified, all resources are included in the output. */
  var resourceFilter: js.UndefOr[FhirFilter] = js.native
}
object DeidentifyFhirStoreRequest {
  
  @scala.inline
  def apply(): DeidentifyFhirStoreRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeidentifyFhirStoreRequest]
  }
  
  @scala.inline
  implicit class DeidentifyFhirStoreRequestOps[Self <: DeidentifyFhirStoreRequest] (val x: Self) extends AnyVal {
    
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
    def setConfig(value: DeidentifyConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    
    @scala.inline
    def setDestinationStore(value: String): Self = this.set("destinationStore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationStore: Self = this.set("destinationStore", js.undefined)
    
    @scala.inline
    def setResourceFilter(value: FhirFilter): Self = this.set("resourceFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceFilter: Self = this.set("resourceFilter", js.undefined)
  }
}
