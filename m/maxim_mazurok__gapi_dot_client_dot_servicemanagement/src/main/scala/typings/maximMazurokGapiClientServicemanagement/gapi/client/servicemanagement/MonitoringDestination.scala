package typings.maximMazurokGapiClientServicemanagement.gapi.client.servicemanagement

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
  
  inline def apply(): MonitoringDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonitoringDestination]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MonitoringDestination] (val x: Self) extends AnyVal {
    
    inline def setMetrics(value: js.Array[String]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setMetricsVarargs(value: String*): Self = StObject.set(x, "metrics", js.Array(value*))
    
    inline def setMonitoredResource(value: String): Self = StObject.set(x, "monitoredResource", value.asInstanceOf[js.Any])
    
    inline def setMonitoredResourceUndefined: Self = StObject.set(x, "monitoredResource", js.undefined)
  }
}
