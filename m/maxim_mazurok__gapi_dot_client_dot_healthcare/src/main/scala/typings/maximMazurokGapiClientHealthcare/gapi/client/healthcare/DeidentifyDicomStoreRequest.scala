package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeidentifyDicomStoreRequest extends js.Object {
  
  /** De-identify configuration. */
  var config: js.UndefOr[DeidentifyConfig] = js.native
  
  /**
    * The name of the DICOM store to create and write the redacted data to. For example,
    * `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}`. * The destination dataset must exist. * The source dataset and destination
    * dataset must both reside in the same project. De-identifying data across multiple projects is not supported. * The destination DICOM store must not exist. * The caller must have the
    * necessary permissions to create the destination DICOM store.
    */
  var destinationStore: js.UndefOr[String] = js.native
  
  /** Filter configuration. */
  var filterConfig: js.UndefOr[DicomFilterConfig] = js.native
}
object DeidentifyDicomStoreRequest {
  
  @scala.inline
  def apply(): DeidentifyDicomStoreRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeidentifyDicomStoreRequest]
  }
  
  @scala.inline
  implicit class DeidentifyDicomStoreRequestOps[Self <: DeidentifyDicomStoreRequest] (val x: Self) extends AnyVal {
    
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
    def setFilterConfig(value: DicomFilterConfig): Self = this.set("filterConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterConfig: Self = this.set("filterConfig", js.undefined)
  }
}
