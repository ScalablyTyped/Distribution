package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UptimeCheckConfig extends StObject {
  
  /**
    * The content that is expected to appear in the data returned by the target server against which the check is run. Currently, only the first entry in the content_matchers list is
    * supported, and additional entries will be ignored. This field is optional and should only be specified if a content match is required as part of the/ Uptime check.
    */
  var contentMatchers: js.UndefOr[js.Array[ContentMatcher]] = js.native
  
  /**
    * A human-friendly name for the Uptime check configuration. The display name should be unique within a Stackdriver Workspace in order to make it easier to identify; however,
    * uniqueness is not enforced. Required.
    */
  var displayName: js.UndefOr[String] = js.native
  
  /** Contains information needed to make an HTTP or HTTPS check. */
  var httpCheck: js.UndefOr[HttpCheck] = js.native
  
  /**
    * The internal checkers that this check will egress from. If is_internal is true and this list is empty, the check will egress from all the InternalCheckers configured for the project
    * that owns this UptimeCheckConfig.
    */
  var internalCheckers: js.UndefOr[js.Array[InternalChecker]] = js.native
  
  /**
    * If this is true, then checks are made only from the 'internal_checkers'. If it is false, then checks are made only from the 'selected_regions'. It is an error to provide
    * 'selected_regions' when is_internal is true, or to provide 'internal_checkers' when is_internal is false.
    */
  var isInternal: js.UndefOr[Boolean] = js.native
  
  /**
    * The monitored resource (https://cloud.google.com/monitoring/api/resources) associated with the configuration. The following monitored resource types are supported for Uptime checks:
    * uptime_url, gce_instance, gae_app, aws_ec2_instance, aws_elb_load_balancer
    */
  var monitoredResource: js.UndefOr[MonitoredResource] = js.native
  
  /**
    * A unique resource name for this Uptime check configuration. The format is: projects/[PROJECT_ID_OR_NUMBER]/uptimeCheckConfigs/[UPTIME_CHECK_ID] [PROJECT_ID_OR_NUMBER] is the
    * Workspace host project associated with the Uptime check.This field should be omitted when creating the Uptime check configuration; on create, the resource name is assigned by the
    * server and included in the response.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * How often, in seconds, the Uptime check is performed. Currently, the only supported values are 60s (1 minute), 300s (5 minutes), 600s (10 minutes), and 900s (15 minutes). Optional,
    * defaults to 60s.
    */
  var period: js.UndefOr[String] = js.native
  
  /** The group resource associated with the configuration. */
  var resourceGroup: js.UndefOr[ResourceGroup] = js.native
  
  /**
    * The list of regions from which the check will be run. Some regions contain one location, and others contain more than one. If this field is specified, enough regions must be
    * provided to include a minimum of 3 locations. Not specifying this field will result in Uptime checks running from all available regions.
    */
  var selectedRegions: js.UndefOr[js.Array[String]] = js.native
  
  /** Contains information needed to make a TCP check. */
  var tcpCheck: js.UndefOr[TcpCheck] = js.native
  
  /** The maximum amount of time to wait for the request to complete (must be between 1 and 60 seconds). Required. */
  var timeout: js.UndefOr[String] = js.native
}
object UptimeCheckConfig {
  
  @scala.inline
  def apply(): UptimeCheckConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UptimeCheckConfig]
  }
  
  @scala.inline
  implicit class UptimeCheckConfigMutableBuilder[Self <: UptimeCheckConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentMatchers(value: js.Array[ContentMatcher]): Self = StObject.set(x, "contentMatchers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentMatchersUndefined: Self = StObject.set(x, "contentMatchers", js.undefined)
    
    @scala.inline
    def setContentMatchersVarargs(value: ContentMatcher*): Self = StObject.set(x, "contentMatchers", js.Array(value :_*))
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setHttpCheck(value: HttpCheck): Self = StObject.set(x, "httpCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpCheckUndefined: Self = StObject.set(x, "httpCheck", js.undefined)
    
    @scala.inline
    def setInternalCheckers(value: js.Array[InternalChecker]): Self = StObject.set(x, "internalCheckers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternalCheckersUndefined: Self = StObject.set(x, "internalCheckers", js.undefined)
    
    @scala.inline
    def setInternalCheckersVarargs(value: InternalChecker*): Self = StObject.set(x, "internalCheckers", js.Array(value :_*))
    
    @scala.inline
    def setIsInternal(value: Boolean): Self = StObject.set(x, "isInternal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInternalUndefined: Self = StObject.set(x, "isInternal", js.undefined)
    
    @scala.inline
    def setMonitoredResource(value: MonitoredResource): Self = StObject.set(x, "monitoredResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoredResourceUndefined: Self = StObject.set(x, "monitoredResource", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPeriod(value: String): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    @scala.inline
    def setResourceGroup(value: ResourceGroup): Self = StObject.set(x, "resourceGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceGroupUndefined: Self = StObject.set(x, "resourceGroup", js.undefined)
    
    @scala.inline
    def setSelectedRegions(value: js.Array[String]): Self = StObject.set(x, "selectedRegions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedRegionsUndefined: Self = StObject.set(x, "selectedRegions", js.undefined)
    
    @scala.inline
    def setSelectedRegionsVarargs(value: String*): Self = StObject.set(x, "selectedRegions", js.Array(value :_*))
    
    @scala.inline
    def setTcpCheck(value: TcpCheck): Self = StObject.set(x, "tcpCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTcpCheckUndefined: Self = StObject.set(x, "tcpCheck", js.undefined)
    
    @scala.inline
    def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
