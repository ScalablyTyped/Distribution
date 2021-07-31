package typings.maximMazurokGapiClientServiceusage.gapi.client.serviceusage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonitoringDestination extends StObject {
  
  /** Types of the metrics to report to this monitoring destination. Each type must be defined in Service.metrics section. */
  var metrics: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The monitored resource type. The type must be defined in Service.monitored_resources section. */
  var monitoredResource: js.UndefOr[String] = js.undefined
}
object MonitoringDestination {
  
  @scala.inline
  def apply(): MonitoringDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonitoringDestination]
  }
  
  @scala.inline
  implicit class MonitoringDestinationMutableBuilder[Self <: MonitoringDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetrics(value: js.Array[String]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    @scala.inline
    def setMetricsVarargs(value: String*): Self = StObject.set(x, "metrics", js.Array(value :_*))
    
    @scala.inline
    def setMonitoredResource(value: String): Self = StObject.set(x, "monitoredResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoredResourceUndefined: Self = StObject.set(x, "monitoredResource", js.undefined)
  }
}
