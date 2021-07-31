package typings.maximMazurokGapiClientMemcache.gapi.client.memcache

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudSaasacceleratorManagementProvidersV1ProvisionedResource extends StObject {
  
  /**
    * Type of the resource. This can be either a GCP resource or a custom one (e.g. another cloud provider's VM). For GCP compute resources use singular form of the names listed in GCP
    * compute API documentation (https://cloud.google.com/compute/docs/reference/rest/v1/), prefixed with 'compute-', for example: 'compute-instance', 'compute-disk',
    * 'compute-autoscaler'.
    */
  var resourceType: js.UndefOr[String] = js.undefined
  
  /** URL identifying the resource, e.g. "https://www.googleapis.com/compute/v1/projects/...)". */
  var resourceUrl: js.UndefOr[String] = js.undefined
}
object GoogleCloudSaasacceleratorManagementProvidersV1ProvisionedResource {
  
  @scala.inline
  def apply(): GoogleCloudSaasacceleratorManagementProvidersV1ProvisionedResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudSaasacceleratorManagementProvidersV1ProvisionedResource]
  }
  
  @scala.inline
  implicit class GoogleCloudSaasacceleratorManagementProvidersV1ProvisionedResourceMutableBuilder[Self <: GoogleCloudSaasacceleratorManagementProvidersV1ProvisionedResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    @scala.inline
    def setResourceUrl(value: String): Self = StObject.set(x, "resourceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUrlUndefined: Self = StObject.set(x, "resourceUrl", js.undefined)
  }
}
