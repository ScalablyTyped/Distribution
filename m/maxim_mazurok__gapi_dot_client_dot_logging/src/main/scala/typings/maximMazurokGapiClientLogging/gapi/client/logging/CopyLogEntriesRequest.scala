package typings.maximMazurokGapiClientLogging.gapi.client.logging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyLogEntriesRequest extends StObject {
  
  /** Required. Destination to which to copy log entries. */
  var destination: js.UndefOr[String] = js.undefined
  
  /** Optional. A filter specifying which log entries to copy. The filter must be no more than 20k characters. An empty filter matches all log entries. */
  var filter: js.UndefOr[String] = js.undefined
  
  /** Required. Log bucket from which to copy log entries.For example:"projects/my-project/locations/global/buckets/my-source-bucket" */
  var name: js.UndefOr[String] = js.undefined
}
object CopyLogEntriesRequest {
  
  inline def apply(): CopyLogEntriesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyLogEntriesRequest]
  }
  
  extension [Self <: CopyLogEntriesRequest](x: Self) {
    
    inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
