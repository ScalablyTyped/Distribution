package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListNotificationChannelDescriptorsResponse extends StObject {
  
  /** The monitored resource descriptors supported for the specified project, optionally filtered. */
  var channelDescriptors: js.UndefOr[js.Array[NotificationChannelDescriptor]] = js.undefined
  
  /**
    * If not empty, indicates that there may be more results that match the request. Use the value in the page_token field in a subsequent request to fetch the next set of results. If
    * empty, all results have been returned.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListNotificationChannelDescriptorsResponse {
  
  inline def apply(): ListNotificationChannelDescriptorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNotificationChannelDescriptorsResponse]
  }
  
  extension [Self <: ListNotificationChannelDescriptorsResponse](x: Self) {
    
    inline def setChannelDescriptors(value: js.Array[NotificationChannelDescriptor]): Self = StObject.set(x, "channelDescriptors", value.asInstanceOf[js.Any])
    
    inline def setChannelDescriptorsUndefined: Self = StObject.set(x, "channelDescriptors", js.undefined)
    
    inline def setChannelDescriptorsVarargs(value: NotificationChannelDescriptor*): Self = StObject.set(x, "channelDescriptors", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
