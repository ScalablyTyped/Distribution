package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCollectdTimeSeriesRequest extends StObject {
  
  /**
    * The collectd payloads representing the time series data. You must not include more than a single point for each time series, so no two payloads can have the same values for all of
    * the fields plugin, plugin_instance, type, and type_instance.
    */
  var collectdPayloads: js.UndefOr[js.Array[CollectdPayload]] = js.undefined
  
  /** The version of collectd that collected the data. Example: "5.3.0-192.el6". */
  var collectdVersion: js.UndefOr[String] = js.undefined
  
  /** The monitored resource associated with the time series. */
  var resource: js.UndefOr[MonitoredResource] = js.undefined
}
object CreateCollectdTimeSeriesRequest {
  
  @scala.inline
  def apply(): CreateCollectdTimeSeriesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCollectdTimeSeriesRequest]
  }
  
  @scala.inline
  implicit class CreateCollectdTimeSeriesRequestMutableBuilder[Self <: CreateCollectdTimeSeriesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollectdPayloads(value: js.Array[CollectdPayload]): Self = StObject.set(x, "collectdPayloads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollectdPayloadsUndefined: Self = StObject.set(x, "collectdPayloads", js.undefined)
    
    @scala.inline
    def setCollectdPayloadsVarargs(value: CollectdPayload*): Self = StObject.set(x, "collectdPayloads", js.Array(value :_*))
    
    @scala.inline
    def setCollectdVersion(value: String): Self = StObject.set(x, "collectdVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollectdVersionUndefined: Self = StObject.set(x, "collectdVersion", js.undefined)
    
    @scala.inline
    def setResource(value: MonitoredResource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
