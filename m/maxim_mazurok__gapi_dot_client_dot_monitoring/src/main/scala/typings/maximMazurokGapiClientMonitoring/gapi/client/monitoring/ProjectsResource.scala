package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectsResource extends js.Object {
  
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
  implicit class ProjectsResourceOps[Self <: ProjectsResource] (val x: Self) extends AnyVal {
    
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
    def setAlertPolicies(value: AlertPoliciesResource): Self = this.set("alertPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollectdTimeSeries(value: CollectdTimeSeriesResource): Self = this.set("collectdTimeSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroups(value: GroupsResource): Self = this.set("groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricDescriptors(value: MetricDescriptorsResource): Self = this.set("metricDescriptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoredResourceDescriptors(value: MonitoredResourceDescriptorsResource): Self = this.set("monitoredResourceDescriptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationChannelDescriptors(value: NotificationChannelDescriptorsResource): Self = this.set("notificationChannelDescriptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationChannels(value: NotificationChannelsResource): Self = this.set("notificationChannels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeSeries(value: TimeSeriesResource): Self = this.set("timeSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUptimeCheckConfigs(value: UptimeCheckConfigsResource): Self = this.set("uptimeCheckConfigs", value.asInstanceOf[js.Any])
  }
}
