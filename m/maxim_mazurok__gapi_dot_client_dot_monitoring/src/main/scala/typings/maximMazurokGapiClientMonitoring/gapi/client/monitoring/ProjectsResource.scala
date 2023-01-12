package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectsResource extends StObject {
  
  var alertPolicies: AlertPoliciesResource
  
  var collectdTimeSeries: CollectdTimeSeriesResource
  
  var groups: GroupsResource
  
  var metricDescriptors: MetricDescriptorsResource
  
  var monitoredResourceDescriptors: MonitoredResourceDescriptorsResource
  
  var notificationChannelDescriptors: NotificationChannelDescriptorsResource
  
  var notificationChannels: NotificationChannelsResource
  
  var timeSeries: TimeSeriesResource
  
  var uptimeCheckConfigs: UptimeCheckConfigsResource
}
object ProjectsResource {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: ProjectsResource] (val x: Self) extends AnyVal {
    
    inline def setAlertPolicies(value: AlertPoliciesResource): Self = StObject.set(x, "alertPolicies", value.asInstanceOf[js.Any])
    
    inline def setCollectdTimeSeries(value: CollectdTimeSeriesResource): Self = StObject.set(x, "collectdTimeSeries", value.asInstanceOf[js.Any])
    
    inline def setGroups(value: GroupsResource): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setMetricDescriptors(value: MetricDescriptorsResource): Self = StObject.set(x, "metricDescriptors", value.asInstanceOf[js.Any])
    
    inline def setMonitoredResourceDescriptors(value: MonitoredResourceDescriptorsResource): Self = StObject.set(x, "monitoredResourceDescriptors", value.asInstanceOf[js.Any])
    
    inline def setNotificationChannelDescriptors(value: NotificationChannelDescriptorsResource): Self = StObject.set(x, "notificationChannelDescriptors", value.asInstanceOf[js.Any])
    
    inline def setNotificationChannels(value: NotificationChannelsResource): Self = StObject.set(x, "notificationChannels", value.asInstanceOf[js.Any])
    
    inline def setTimeSeries(value: TimeSeriesResource): Self = StObject.set(x, "timeSeries", value.asInstanceOf[js.Any])
    
    inline def setUptimeCheckConfigs(value: UptimeCheckConfigsResource): Self = StObject.set(x, "uptimeCheckConfigs", value.asInstanceOf[js.Any])
  }
}
