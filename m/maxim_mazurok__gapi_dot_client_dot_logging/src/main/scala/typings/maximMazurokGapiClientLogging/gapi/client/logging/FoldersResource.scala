package typings.maximMazurokGapiClientLogging.gapi.client.logging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FoldersResource extends StObject {
  
  var exclusions: ExclusionsResource
  
  var locations: LocationsResource
  
  var logs: LogsResource
  
  var sinks: SinksResource
}
object FoldersResource {
  
  inline def apply(
    exclusions: ExclusionsResource,
    locations: LocationsResource,
    logs: LogsResource,
    sinks: SinksResource
  ): FoldersResource = {
    val __obj = js.Dynamic.literal(exclusions = exclusions.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], logs = logs.asInstanceOf[js.Any], sinks = sinks.asInstanceOf[js.Any])
    __obj.asInstanceOf[FoldersResource]
  }
  
  extension [Self <: FoldersResource](x: Self) {
    
    inline def setExclusions(value: ExclusionsResource): Self = StObject.set(x, "exclusions", value.asInstanceOf[js.Any])
    
    inline def setLocations(value: LocationsResource): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    inline def setLogs(value: LogsResource): Self = StObject.set(x, "logs", value.asInstanceOf[js.Any])
    
    inline def setSinks(value: SinksResource): Self = StObject.set(x, "sinks", value.asInstanceOf[js.Any])
  }
}
