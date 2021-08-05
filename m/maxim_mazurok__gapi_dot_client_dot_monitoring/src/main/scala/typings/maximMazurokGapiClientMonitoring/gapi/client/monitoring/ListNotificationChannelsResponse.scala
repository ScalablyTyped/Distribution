package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListNotificationChannelsResponse extends StObject {
  
  /**
    * If not empty, indicates that there may be more results that match the request. Use the value in the page_token field in a subsequent request to fetch the next set of results. If
    * empty, all results have been returned.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The notification channels defined for the specified project. */
  var notificationChannels: js.UndefOr[js.Array[NotificationChannel]] = js.undefined
  
  /** The total number of notification channels in all pages. This number is only an estimate, and may change in subsequent pages. https://aip.dev/158 */
  var totalSize: js.UndefOr[Double] = js.undefined
}
object ListNotificationChannelsResponse {
  
  inline def apply(): ListNotificationChannelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNotificationChannelsResponse]
  }
  
  extension [Self <: ListNotificationChannelsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setNotificationChannels(value: js.Array[NotificationChannel]): Self = StObject.set(x, "notificationChannels", value.asInstanceOf[js.Any])
    
    inline def setNotificationChannelsUndefined: Self = StObject.set(x, "notificationChannels", js.undefined)
    
    inline def setNotificationChannelsVarargs(value: NotificationChannel*): Self = StObject.set(x, "notificationChannels", js.Array(value :_*))
    
    inline def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    
    inline def setTotalSizeUndefined: Self = StObject.set(x, "totalSize", js.undefined)
  }
}
