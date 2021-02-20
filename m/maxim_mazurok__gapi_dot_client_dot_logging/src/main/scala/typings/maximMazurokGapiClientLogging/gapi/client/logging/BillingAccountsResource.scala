package typings.maximMazurokGapiClientLogging.gapi.client.logging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BillingAccountsResource extends StObject {
  
  var buckets: BucketsResource = js.native
  
  var exclusions: ExclusionsResource = js.native
  
  var locations: LocationsResource = js.native
  
  var logs: LogsResource = js.native
  
  var sinks: SinksResource = js.native
}
object BillingAccountsResource {
  
  @scala.inline
  def apply(
    buckets: BucketsResource,
    exclusions: ExclusionsResource,
    locations: LocationsResource,
    logs: LogsResource,
    sinks: SinksResource
  ): BillingAccountsResource = {
    val __obj = js.Dynamic.literal(buckets = buckets.asInstanceOf[js.Any], exclusions = exclusions.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], logs = logs.asInstanceOf[js.Any], sinks = sinks.asInstanceOf[js.Any])
    __obj.asInstanceOf[BillingAccountsResource]
  }
  
  @scala.inline
  implicit class BillingAccountsResourceMutableBuilder[Self <: BillingAccountsResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuckets(value: BucketsResource): Self = StObject.set(x, "buckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusions(value: ExclusionsResource): Self = StObject.set(x, "exclusions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocations(value: LocationsResource): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogs(value: LogsResource): Self = StObject.set(x, "logs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSinks(value: SinksResource): Self = StObject.set(x, "sinks", value.asInstanceOf[js.Any])
  }
}
