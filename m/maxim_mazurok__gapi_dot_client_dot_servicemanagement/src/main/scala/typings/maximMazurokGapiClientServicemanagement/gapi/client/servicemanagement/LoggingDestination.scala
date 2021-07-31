package typings.maximMazurokGapiClientServicemanagement.gapi.client.servicemanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoggingDestination extends StObject {
  
  /**
    * Names of the logs to be sent to this destination. Each name must be defined in the Service.logs section. If the log name is not a domain scoped name, it will be automatically
    * prefixed with the service name followed by "/".
    */
  var logs: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The monitored resource type. The type must be defined in the Service.monitored_resources section. */
  var monitoredResource: js.UndefOr[String] = js.undefined
}
object LoggingDestination {
  
  @scala.inline
  def apply(): LoggingDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoggingDestination]
  }
  
  @scala.inline
  implicit class LoggingDestinationMutableBuilder[Self <: LoggingDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogs(value: js.Array[String]): Self = StObject.set(x, "logs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogsUndefined: Self = StObject.set(x, "logs", js.undefined)
    
    @scala.inline
    def setLogsVarargs(value: String*): Self = StObject.set(x, "logs", js.Array(value :_*))
    
    @scala.inline
    def setMonitoredResource(value: String): Self = StObject.set(x, "monitoredResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoredResourceUndefined: Self = StObject.set(x, "monitoredResource", js.undefined)
  }
}
