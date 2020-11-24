package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportResourcesRequest extends js.Object {
  
  /** The content structure in the source location. If not specified, the server treats the input source files as BUNDLE. */
  var contentStructure: js.UndefOr[String] = js.native
  
  /**
    * Cloud Storage source data location and import configuration. The Healthcare Service Agent account requires the `roles/storage.objectAdmin` role on the Cloud Storage location. Each
    * Cloud Storage object should be a text file that contains the format specified in ContentStructure.
    */
  var gcsSource: js.UndefOr[GoogleCloudHealthcareV1FhirGcsSource] = js.native
}
object ImportResourcesRequest {
  
  @scala.inline
  def apply(): ImportResourcesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportResourcesRequest]
  }
  
  @scala.inline
  implicit class ImportResourcesRequestOps[Self <: ImportResourcesRequest] (val x: Self) extends AnyVal {
    
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
    def setContentStructure(value: String): Self = this.set("contentStructure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentStructure: Self = this.set("contentStructure", js.undefined)
    
    @scala.inline
    def setGcsSource(value: GoogleCloudHealthcareV1FhirGcsSource): Self = this.set("gcsSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGcsSource: Self = this.set("gcsSource", js.undefined)
  }
}
