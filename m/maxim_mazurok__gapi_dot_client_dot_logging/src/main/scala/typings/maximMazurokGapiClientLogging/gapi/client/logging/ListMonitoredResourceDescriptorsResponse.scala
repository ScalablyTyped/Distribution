package typings.maximMazurokGapiClientLogging.gapi.client.logging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMonitoredResourceDescriptorsResponse extends StObject {
  
  /**
    * If there might be more results than those appearing in this response, then nextPageToken is included. To get the next set of results, call this method again using the value of
    * nextPageToken as pageToken.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** A list of resource descriptors. */
  var resourceDescriptors: js.UndefOr[js.Array[MonitoredResourceDescriptor]] = js.undefined
}
object ListMonitoredResourceDescriptorsResponse {
  
  inline def apply(): ListMonitoredResourceDescriptorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMonitoredResourceDescriptorsResponse]
  }
  
  extension [Self <: ListMonitoredResourceDescriptorsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setResourceDescriptors(value: js.Array[MonitoredResourceDescriptor]): Self = StObject.set(x, "resourceDescriptors", value.asInstanceOf[js.Any])
    
    inline def setResourceDescriptorsUndefined: Self = StObject.set(x, "resourceDescriptors", js.undefined)
    
    inline def setResourceDescriptorsVarargs(value: MonitoredResourceDescriptor*): Self = StObject.set(x, "resourceDescriptors", js.Array(value :_*))
  }
}
