package typings.maximMazurokGapiClientServiceusage.gapi.client.serviceusage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleApiServiceusageV1ServiceConfig extends StObject {
  
  /** A list of API interfaces exported by this service. Contains only the names, versions, and method names of the interfaces. */
  var apis: js.UndefOr[js.Array[Api]] = js.undefined
  
  /** Auth configuration. Contains only the OAuth rules. */
  var authentication: js.UndefOr[Authentication] = js.undefined
  
  /** Additional API documentation. Contains only the summary and the documentation URL. */
  var documentation: js.UndefOr[Documentation] = js.undefined
  
  /** Configuration for network endpoints. Contains only the names and aliases of the endpoints. */
  var endpoints: js.UndefOr[js.Array[Endpoint]] = js.undefined
  
  /** Defines the monitored resources used by this service. This is required by the Service.monitoring and Service.logging configurations. */
  var monitoredResources: js.UndefOr[js.Array[MonitoredResourceDescriptor]] = js.undefined
  
  /** Monitoring configuration. This should not include the 'producer_destinations' field. */
  var monitoring: js.UndefOr[Monitoring] = js.undefined
  
  /** The DNS address at which this service is available. An example DNS address would be: `calendar.googleapis.com`. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Quota configuration. */
  var quota: js.UndefOr[Quota] = js.undefined
  
  /** The product title for this service. */
  var title: js.UndefOr[String] = js.undefined
  
  /** Configuration controlling usage of this service. */
  var usage: js.UndefOr[Usage] = js.undefined
}
object GoogleApiServiceusageV1ServiceConfig {
  
  @scala.inline
  def apply(): GoogleApiServiceusageV1ServiceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleApiServiceusageV1ServiceConfig]
  }
  
  @scala.inline
  implicit class GoogleApiServiceusageV1ServiceConfigMutableBuilder[Self <: GoogleApiServiceusageV1ServiceConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApis(value: js.Array[Api]): Self = StObject.set(x, "apis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApisUndefined: Self = StObject.set(x, "apis", js.undefined)
    
    @scala.inline
    def setApisVarargs(value: Api*): Self = StObject.set(x, "apis", js.Array(value :_*))
    
    @scala.inline
    def setAuthentication(value: Authentication): Self = StObject.set(x, "authentication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationUndefined: Self = StObject.set(x, "authentication", js.undefined)
    
    @scala.inline
    def setDocumentation(value: Documentation): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    @scala.inline
    def setEndpoints(value: js.Array[Endpoint]): Self = StObject.set(x, "endpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointsUndefined: Self = StObject.set(x, "endpoints", js.undefined)
    
    @scala.inline
    def setEndpointsVarargs(value: Endpoint*): Self = StObject.set(x, "endpoints", js.Array(value :_*))
    
    @scala.inline
    def setMonitoredResources(value: js.Array[MonitoredResourceDescriptor]): Self = StObject.set(x, "monitoredResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoredResourcesUndefined: Self = StObject.set(x, "monitoredResources", js.undefined)
    
    @scala.inline
    def setMonitoredResourcesVarargs(value: MonitoredResourceDescriptor*): Self = StObject.set(x, "monitoredResources", js.Array(value :_*))
    
    @scala.inline
    def setMonitoring(value: Monitoring): Self = StObject.set(x, "monitoring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoringUndefined: Self = StObject.set(x, "monitoring", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setQuota(value: Quota): Self = StObject.set(x, "quota", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaUndefined: Self = StObject.set(x, "quota", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setUsage(value: Usage): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
  }
}
