package typings.maximMazurokGapiClientFile.gapi.client.file

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudSaasacceleratorManagementProvidersV1ProvisionedResource extends js.Object {
  
  /**
    * Type of the resource. This can be either a GCP resource or a custom one (e.g. another cloud provider's VM). For GCP compute resources use singular form of the names listed in GCP
    * compute API documentation (https://cloud.google.com/compute/docs/reference/rest/v1/), prefixed with 'compute-', for example: 'compute-instance', 'compute-disk',
    * 'compute-autoscaler'.
    */
  var resourceType: js.UndefOr[String] = js.native
  
  /** URL identifying the resource, e.g. "https://www.googleapis.com/compute/v1/projects/...)". */
  var resourceUrl: js.UndefOr[String] = js.native
}
object GoogleCloudSaasacceleratorManagementProvidersV1ProvisionedResource {
  
  @scala.inline
  def apply(): GoogleCloudSaasacceleratorManagementProvidersV1ProvisionedResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudSaasacceleratorManagementProvidersV1ProvisionedResource]
  }
  
  @scala.inline
  implicit class GoogleCloudSaasacceleratorManagementProvidersV1ProvisionedResourceOps[Self <: GoogleCloudSaasacceleratorManagementProvidersV1ProvisionedResource] (val x: Self) extends AnyVal {
    
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
    def setResourceType(value: String): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceType: Self = this.set("resourceType", js.undefined)
    
    @scala.inline
    def setResourceUrl(value: String): Self = this.set("resourceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceUrl: Self = this.set("resourceUrl", js.undefined)
  }
}
