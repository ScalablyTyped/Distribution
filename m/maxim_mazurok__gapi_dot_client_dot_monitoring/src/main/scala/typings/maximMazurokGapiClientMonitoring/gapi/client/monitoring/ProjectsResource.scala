package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectsResource extends StObject {
  
  var alertPolicies: AlertPoliciesResource = js.native
  
  var collectdTimeSeries: CollectdTimeSeriesResource = js.native
  
  var groups: GroupsResource = js.native
  
  var metricDescriptors: MetricDescriptorsResource = js.native
  
  var monitoredResourceDescriptors: MonitoredResourceDescriptorsResource = js.native
  
  var notificationChannelDescriptors: NotificationChannelDescriptorsResource = js.native
  
  var notificationChannels: NotificationChannelsResource = js.native
  
  var timeSeries: TimeSeriesResource = js.native
  
  var uptimeCheckConfigs: UptimeCheckConfigsResource = js.native
}
object ProjectsResource {
  
  @scala.inline
  def apply(
    alertPolicies: AlertPoliciesResource,
    collectdTimeSeries: CollectdTimeSeriesResource,
    groups: GroupsResource,
    metricDescriptors: MetricDescriptorsResource,
    monitoredResourceDescriptors: MonitoredResourceDescriptorsResource,
    notificationChannelDescriptors: NotificationChannelDescriptorsResource,
    notificationChannels: NotificationChannelsResource,
    timeSeries: TimeSeriesResource,
    uptimeCheckConfigs: UptimeCheckConfigsResource
  ): ProjectsResource = {
    val __obj = js.Dynamic.literal(alertPolicies = alertPolicies.asInstanceOf[js.Any], collectdTimeSeries = collectdTimeSeries.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], metricDescriptors = metricDescriptors.asInstanceOf[js.Any], monitoredResourceDescriptors = monitoredResourceDescriptors.asInstanceOf[js.Any], notificationChannelDescriptors = notificationChannelDescriptors.asInstanceOf[js.Any], notificationChannels = notificationChannels.asInstanceOf[js.Any], timeSeries = timeSeries.asInstanceOf[js.Any], uptimeCheckConfigs = uptimeCheckConfigs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsResource]
  }
  
  @scala.inline
  implicit class ProjectsResourceMutableBuilder[Self <: ProjectsResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlertPolicies(value: AlertPoliciesResource): Self = StObject.set(x, "alertPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollectdTimeSeries(value: CollectdTimeSeriesResource): Self = StObject.set(x, "collectdTimeSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroups(value: GroupsResource): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricDescriptors(value: MetricDescriptorsResource): Self = StObject.set(x, "metricDescriptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoredResourceDescriptors(value: MonitoredResourceDescriptorsResource): Self = StObject.set(x, "monitoredResourceDescriptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationChannelDescriptors(value: NotificationChannelDescriptorsResource): Self = StObject.set(x, "notificationChannelDescriptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationChannels(value: NotificationChannelsResource): Self = StObject.set(x, "notificationChannels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeSeries(value: TimeSeriesResource): Self = StObject.set(x, "timeSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUptimeCheckConfigs(value: UptimeCheckConfigsResource): Self = StObject.set(x, "uptimeCheckConfigs", value.asInstanceOf[js.Any])
  }
}
