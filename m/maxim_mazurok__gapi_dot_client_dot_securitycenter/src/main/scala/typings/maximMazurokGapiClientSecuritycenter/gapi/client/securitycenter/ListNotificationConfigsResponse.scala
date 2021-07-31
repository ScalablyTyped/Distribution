package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListNotificationConfigsResponse extends StObject {
  
  /** Token to retrieve the next page of results, or empty if there are no more results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** Notification configs belonging to the requested parent. */
  var notificationConfigs: js.UndefOr[js.Array[NotificationConfig]] = js.undefined
}
object ListNotificationConfigsResponse {
  
  @scala.inline
  def apply(): ListNotificationConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNotificationConfigsResponse]
  }
  
  @scala.inline
  implicit class ListNotificationConfigsResponseMutableBuilder[Self <: ListNotificationConfigsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setNotificationConfigs(value: js.Array[NotificationConfig]): Self = StObject.set(x, "notificationConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationConfigsUndefined: Self = StObject.set(x, "notificationConfigs", js.undefined)
    
    @scala.inline
    def setNotificationConfigsVarargs(value: NotificationConfig*): Self = StObject.set(x, "notificationConfigs", js.Array(value :_*))
  }
}
