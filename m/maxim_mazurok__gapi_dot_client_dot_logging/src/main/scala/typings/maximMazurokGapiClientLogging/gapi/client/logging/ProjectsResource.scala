package typings.maximMazurokGapiClientLogging.gapi.client.logging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectsResource extends StObject {
  
  var exclusions: ExclusionsResource = js.native
  
  var locations: LocationsResource = js.native
  
  var logs: LogsResource = js.native
  
  var metrics: MetricsResource = js.native
  
  var sinks: SinksResource = js.native
}
object ProjectsResource {
  
  @scala.inline
  def apply(
    exclusions: ExclusionsResource,
    locations: LocationsResource,
    logs: LogsResource,
    metrics: MetricsResource,
    sinks: SinksResource
  ): ProjectsResource = {
    val __obj = js.Dynamic.literal(exclusions = exclusions.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], logs = logs.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any], sinks = sinks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsResource]
  }
  
  @scala.inline
  implicit class ProjectsResourceMutableBuilder[Self <: ProjectsResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExclusions(value: ExclusionsResource): Self = StObject.set(x, "exclusions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocations(value: LocationsResource): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogs(value: LogsResource): Self = StObject.set(x, "logs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetrics(value: MetricsResource): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSinks(value: SinksResource): Self = StObject.set(x, "sinks", value.asInstanceOf[js.Any])
  }
}
