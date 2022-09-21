package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UptimeCheckConfig extends StObject {
  
  /** The type of checkers to use to execute the Uptime check. */
  var checkerType: js.UndefOr[String] = js.undefined
  
  /**
    * The content that is expected to appear in the data returned by the target server against which the check is run. Currently, only the first entry in the content_matchers list is
    * supported, and additional entries will be ignored. This field is optional and should only be specified if a content match is required as part of the/ Uptime check.
    */
  var contentMatchers: js.UndefOr[js.Array[ContentMatcher]] = js.undefined
  
  /**
    * A human-friendly name for the Uptime check configuration. The display name should be unique within a Cloud Monitoring Workspace in order to make it easier to identify; however,
    * uniqueness is not enforced. Required.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Contains information needed to make an HTTP or HTTPS check. */
  var httpCheck: js.UndefOr[HttpCheck] = js.undefined
  
  /**
    * The internal checkers that this check will egress from. If is_internal is true and this list is empty, the check will egress from all the InternalCheckers configured for the project
    * that owns this UptimeCheckConfig.
    */
  var internalCheckers: js.UndefOr[js.Array[InternalChecker]] = js.undefined
  
  /**
    * If this is true, then checks are made only from the 'internal_checkers'. If it is false, then checks are made only from the 'selected_regions'. It is an error to provide
    * 'selected_regions' when is_internal is true, or to provide 'internal_checkers' when is_internal is false.
    */
  var isInternal: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The monitored resource (https://cloud.google.com/monitoring/api/resources) associated with the configuration. The following monitored resource types are valid for this field:
    * uptime_url, gce_instance, gae_app, aws_ec2_instance, aws_elb_load_balancer k8s_service servicedirectory_service cloud_run_revision
    */
  var monitoredResource: js.UndefOr[MonitoredResource] = js.undefined
  
  /**
    * A unique resource name for this Uptime check configuration. The format is: projects/[PROJECT_ID_OR_NUMBER]/uptimeCheckConfigs/[UPTIME_CHECK_ID] [PROJECT_ID_OR_NUMBER] is the
    * Workspace host project associated with the Uptime check.This field should be omitted when creating the Uptime check configuration; on create, the resource name is assigned by the
    * server and included in the response.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * How often, in seconds, the Uptime check is performed. Currently, the only supported values are 60s (1 minute), 300s (5 minutes), 600s (10 minutes), and 900s (15 minutes). Optional,
    * defaults to 60s.
    */
  var period: js.UndefOr[String] = js.undefined
  
  /** The group resource associated with the configuration. */
  var resourceGroup: js.UndefOr[ResourceGroup] = js.undefined
  
  /**
    * The list of regions from which the check will be run. Some regions contain one location, and others contain more than one. If this field is specified, enough regions must be
    * provided to include a minimum of 3 locations. Not specifying this field will result in Uptime checks running from all available regions.
    */
  var selectedRegions: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Contains information needed to make a TCP check. */
  var tcpCheck: js.UndefOr[TcpCheck] = js.undefined
  
  /** The maximum amount of time to wait for the request to complete (must be between 1 and 60 seconds). Required. */
  var timeout: js.UndefOr[String] = js.undefined
  
  /**
    * User-supplied key/value data to be used for organizing and identifying the UptimeCheckConfig objects.The field can contain up to 64 entries. Each key and value is limited to 63
    * Unicode characters or 128 bytes, whichever is smaller. Labels and values can contain only lowercase letters, numerals, underscores, and dashes. Keys must begin with a letter.
    */
  var userLabels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientMonitoring.maximMazurokGapiClientMonitoringStrings.UptimeCheckConfig & TopLevel[Any]
  ] = js.undefined
}
object UptimeCheckConfig {
  
  inline def apply(): UptimeCheckConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UptimeCheckConfig]
  }
  
  extension [Self <: UptimeCheckConfig](x: Self) {
    
    inline def setCheckerType(value: String): Self = StObject.set(x, "checkerType", value.asInstanceOf[js.Any])
    
    inline def setCheckerTypeUndefined: Self = StObject.set(x, "checkerType", js.undefined)
    
    inline def setContentMatchers(value: js.Array[ContentMatcher]): Self = StObject.set(x, "contentMatchers", value.asInstanceOf[js.Any])
    
    inline def setContentMatchersUndefined: Self = StObject.set(x, "contentMatchers", js.undefined)
    
    inline def setContentMatchersVarargs(value: ContentMatcher*): Self = StObject.set(x, "contentMatchers", js.Array(value*))
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setHttpCheck(value: HttpCheck): Self = StObject.set(x, "httpCheck", value.asInstanceOf[js.Any])
    
    inline def setHttpCheckUndefined: Self = StObject.set(x, "httpCheck", js.undefined)
    
    inline def setInternalCheckers(value: js.Array[InternalChecker]): Self = StObject.set(x, "internalCheckers", value.asInstanceOf[js.Any])
    
    inline def setInternalCheckersUndefined: Self = StObject.set(x, "internalCheckers", js.undefined)
    
    inline def setInternalCheckersVarargs(value: InternalChecker*): Self = StObject.set(x, "internalCheckers", js.Array(value*))
    
    inline def setIsInternal(value: Boolean): Self = StObject.set(x, "isInternal", value.asInstanceOf[js.Any])
    
    inline def setIsInternalUndefined: Self = StObject.set(x, "isInternal", js.undefined)
    
    inline def setMonitoredResource(value: MonitoredResource): Self = StObject.set(x, "monitoredResource", value.asInstanceOf[js.Any])
    
    inline def setMonitoredResourceUndefined: Self = StObject.set(x, "monitoredResource", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPeriod(value: String): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setResourceGroup(value: ResourceGroup): Self = StObject.set(x, "resourceGroup", value.asInstanceOf[js.Any])
    
    inline def setResourceGroupUndefined: Self = StObject.set(x, "resourceGroup", js.undefined)
    
    inline def setSelectedRegions(value: js.Array[String]): Self = StObject.set(x, "selectedRegions", value.asInstanceOf[js.Any])
    
    inline def setSelectedRegionsUndefined: Self = StObject.set(x, "selectedRegions", js.undefined)
    
    inline def setSelectedRegionsVarargs(value: String*): Self = StObject.set(x, "selectedRegions", js.Array(value*))
    
    inline def setTcpCheck(value: TcpCheck): Self = StObject.set(x, "tcpCheck", value.asInstanceOf[js.Any])
    
    inline def setTcpCheckUndefined: Self = StObject.set(x, "tcpCheck", js.undefined)
    
    inline def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setUserLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientMonitoring.maximMazurokGapiClientMonitoringStrings.UptimeCheckConfig & TopLevel[Any]
    ): Self = StObject.set(x, "userLabels", value.asInstanceOf[js.Any])
    
    inline def setUserLabelsUndefined: Self = StObject.set(x, "userLabels", js.undefined)
  }
}
