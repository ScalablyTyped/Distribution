package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCollectdTimeSeriesRequest extends js.Object {
  
  /**
    * The collectd payloads representing the time series data. You must not include more than a single point for each time series, so no two payloads can have the same values for all of
    * the fields plugin, plugin_instance, type, and type_instance.
    */
  var collectdPayloads: js.UndefOr[js.Array[CollectdPayload]] = js.native
  
  /** The version of collectd that collected the data. Example: "5.3.0-192.el6". */
  var collectdVersion: js.UndefOr[String] = js.native
  
  /** The monitored resource associated with the time series. */
  var resource: js.UndefOr[MonitoredResource] = js.native
}
object CreateCollectdTimeSeriesRequest {
  
  @scala.inline
  def apply(): CreateCollectdTimeSeriesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCollectdTimeSeriesRequest]
  }
  
  @scala.inline
  implicit class CreateCollectdTimeSeriesRequestOps[Self <: CreateCollectdTimeSeriesRequest] (val x: Self) extends AnyVal {
    
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
    def setCollectdPayloadsVarargs(value: CollectdPayload*): Self = this.set("collectdPayloads", js.Array(value :_*))
    
    @scala.inline
    def setCollectdPayloads(value: js.Array[CollectdPayload]): Self = this.set("collectdPayloads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollectdPayloads: Self = this.set("collectdPayloads", js.undefined)
    
    @scala.inline
    def setCollectdVersion(value: String): Self = this.set("collectdVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollectdVersion: Self = this.set("collectdVersion", js.undefined)
    
    @scala.inline
    def setResource(value: MonitoredResource): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
  }
}
