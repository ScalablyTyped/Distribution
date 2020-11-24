package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListNotificationConfigsResponse extends js.Object {
  
  /** Token to retrieve the next page of results, or empty if there are no more results. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** Notification configs belonging to the requested parent. */
  var notificationConfigs: js.UndefOr[js.Array[NotificationConfig]] = js.native
}
object ListNotificationConfigsResponse {
  
  @scala.inline
  def apply(): ListNotificationConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNotificationConfigsResponse]
  }
  
  @scala.inline
  implicit class ListNotificationConfigsResponseOps[Self <: ListNotificationConfigsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setNotificationConfigsVarargs(value: NotificationConfig*): Self = this.set("notificationConfigs", js.Array(value :_*))
    
    @scala.inline
    def setNotificationConfigs(value: js.Array[NotificationConfig]): Self = this.set("notificationConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationConfigs: Self = this.set("notificationConfigs", js.undefined)
  }
}
