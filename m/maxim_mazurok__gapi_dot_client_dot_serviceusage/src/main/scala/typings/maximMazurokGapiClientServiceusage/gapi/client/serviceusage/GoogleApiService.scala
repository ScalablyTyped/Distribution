package typings.maximMazurokGapiClientServiceusage.gapi.client.serviceusage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleApiService extends StObject {
  
  /**
    * A list of API interfaces exported by this service. Only the `name` field of the google.protobuf.Api needs to be provided by the configuration author, as the remaining fields will be
    * derived from the IDL during the normalization process. It is an error to specify an API interface here which cannot be resolved against the associated IDL files.
    */
  var apis: js.UndefOr[js.Array[Api]] = js.undefined
  
  /** Auth configuration. */
  var authentication: js.UndefOr[Authentication] = js.undefined
  
  /** API backend configuration. */
  var backend: js.UndefOr[Backend] = js.undefined
  
  /** Billing configuration. */
  var billing: js.UndefOr[Billing] = js.undefined
  
  /** This field is obsolete. Its value must be set to `3`. */
  var configVersion: js.UndefOr[Double] = js.undefined
  
  /** Context configuration. */
  var context: js.UndefOr[Context] = js.undefined
  
  /** Configuration for the service control plane. */
  var control: js.UndefOr[Control] = js.undefined
  
  /** Custom error configuration. */
  var customError: js.UndefOr[CustomError] = js.undefined
  
  /** Additional API documentation. */
  var documentation: js.UndefOr[Documentation] = js.undefined
  
  /** Configuration for network endpoints. If this is empty, then an endpoint with the same name as the service is automatically generated to service all defined APIs. */
  var endpoints: js.UndefOr[js.Array[Endpoint]] = js.undefined
  
  /**
    * A list of all enum types included in this API service. Enums referenced directly or indirectly by the `apis` are automatically included. Enums which are not referenced but shall be
    * included should be listed here by name. Example: enums: - name: google.someapi.v1.SomeEnum
    */
  var enums: js.UndefOr[js.Array[Enum]] = js.undefined
  
  /** HTTP configuration. */
  var http: js.UndefOr[Http] = js.undefined
  
  /**
    * A unique ID for a specific instance of this message, typically assigned by the client for tracking purpose. Must be no longer than 63 characters and only lower case letters, digits,
    * '.', '_' and '-' are allowed. If empty, the server may choose to generate one instead.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /** Logging configuration. */
  var logging: js.UndefOr[Logging] = js.undefined
  
  /** Defines the logs used by this service. */
  var logs: js.UndefOr[js.Array[LogDescriptor]] = js.undefined
  
  /** Defines the metrics used by this service. */
  var metrics: js.UndefOr[js.Array[MetricDescriptor]] = js.undefined
  
  /** Defines the monitored resources used by this service. This is required by the Service.monitoring and Service.logging configurations. */
  var monitoredResources: js.UndefOr[js.Array[MonitoredResourceDescriptor]] = js.undefined
  
  /** Monitoring configuration. */
  var monitoring: js.UndefOr[Monitoring] = js.undefined
  
  /**
    * The service name, which is a DNS-like logical identifier for the service, such as `calendar.googleapis.com`. The service name typically goes through DNS verification to make sure
    * the owner of the service also owns the DNS name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** The Google project that owns this service. */
  var producerProjectId: js.UndefOr[String] = js.undefined
  
  /** Quota configuration. */
  var quota: js.UndefOr[Quota] = js.undefined
  
  /** Output only. The source information for this configuration if available. */
  var sourceInfo: js.UndefOr[SourceInfo] = js.undefined
  
  /** System parameter configuration. */
  var systemParameters: js.UndefOr[SystemParameters] = js.undefined
  
  /**
    * A list of all proto message types included in this API service. It serves similar purpose as [google.api.Service.types], except that these types are not needed by user-defined APIs.
    * Therefore, they will not show up in the generated discovery doc. This field should only be used to define system APIs in ESF.
    */
  var systemTypes: js.UndefOr[js.Array[Type]] = js.undefined
  
  /** The product title for this service. */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * A list of all proto message types included in this API service. Types referenced directly or indirectly by the `apis` are automatically included. Messages which are not referenced
    * but shall be included, such as types used by the `google.protobuf.Any` type, should be listed here by name. Example: types: - name: google.protobuf.Int32
    */
  var types: js.UndefOr[js.Array[Type]] = js.undefined
  
  /** Configuration controlling usage of this service. */
  var usage: js.UndefOr[Usage] = js.undefined
}
object GoogleApiService {
  
  @scala.inline
  def apply(): GoogleApiService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleApiService]
  }
  
  @scala.inline
  implicit class GoogleApiServiceMutableBuilder[Self <: GoogleApiService] (val x: Self) extends AnyVal {
    
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
    def setBackend(value: Backend): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackendUndefined: Self = StObject.set(x, "backend", js.undefined)
    
    @scala.inline
    def setBilling(value: Billing): Self = StObject.set(x, "billing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingUndefined: Self = StObject.set(x, "billing", js.undefined)
    
    @scala.inline
    def setConfigVersion(value: Double): Self = StObject.set(x, "configVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigVersionUndefined: Self = StObject.set(x, "configVersion", js.undefined)
    
    @scala.inline
    def setContext(value: Context): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setControl(value: Control): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlUndefined: Self = StObject.set(x, "control", js.undefined)
    
    @scala.inline
    def setCustomError(value: CustomError): Self = StObject.set(x, "customError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomErrorUndefined: Self = StObject.set(x, "customError", js.undefined)
    
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
    def setEnums(value: js.Array[Enum]): Self = StObject.set(x, "enums", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumsUndefined: Self = StObject.set(x, "enums", js.undefined)
    
    @scala.inline
    def setEnumsVarargs(value: Enum*): Self = StObject.set(x, "enums", js.Array(value :_*))
    
    @scala.inline
    def setHttp(value: Http): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLogging(value: Logging): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
    
    @scala.inline
    def setLogs(value: js.Array[LogDescriptor]): Self = StObject.set(x, "logs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogsUndefined: Self = StObject.set(x, "logs", js.undefined)
    
    @scala.inline
    def setLogsVarargs(value: LogDescriptor*): Self = StObject.set(x, "logs", js.Array(value :_*))
    
    @scala.inline
    def setMetrics(value: js.Array[MetricDescriptor]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    @scala.inline
    def setMetricsVarargs(value: MetricDescriptor*): Self = StObject.set(x, "metrics", js.Array(value :_*))
    
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
    def setProducerProjectId(value: String): Self = StObject.set(x, "producerProjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProducerProjectIdUndefined: Self = StObject.set(x, "producerProjectId", js.undefined)
    
    @scala.inline
    def setQuota(value: Quota): Self = StObject.set(x, "quota", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaUndefined: Self = StObject.set(x, "quota", js.undefined)
    
    @scala.inline
    def setSourceInfo(value: SourceInfo): Self = StObject.set(x, "sourceInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceInfoUndefined: Self = StObject.set(x, "sourceInfo", js.undefined)
    
    @scala.inline
    def setSystemParameters(value: SystemParameters): Self = StObject.set(x, "systemParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemParametersUndefined: Self = StObject.set(x, "systemParameters", js.undefined)
    
    @scala.inline
    def setSystemTypes(value: js.Array[Type]): Self = StObject.set(x, "systemTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemTypesUndefined: Self = StObject.set(x, "systemTypes", js.undefined)
    
    @scala.inline
    def setSystemTypesVarargs(value: Type*): Self = StObject.set(x, "systemTypes", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTypes(value: js.Array[Type]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    @scala.inline
    def setTypesVarargs(value: Type*): Self = StObject.set(x, "types", js.Array(value :_*))
    
    @scala.inline
    def setUsage(value: Usage): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
  }
}
