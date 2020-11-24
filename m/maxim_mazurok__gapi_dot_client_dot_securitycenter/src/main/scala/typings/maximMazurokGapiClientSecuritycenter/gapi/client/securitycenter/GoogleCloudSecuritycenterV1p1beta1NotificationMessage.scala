package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudSecuritycenterV1p1beta1NotificationMessage extends js.Object {
  
  /** If it's a Finding based notification config, this field will be populated. */
  var finding: js.UndefOr[GoogleCloudSecuritycenterV1p1beta1Finding] = js.native
  
  /** Name of the notification config that generated current notification. */
  var notificationConfigName: js.UndefOr[String] = js.native
  
  /** The Cloud resource tied to the notification. */
  var resource: js.UndefOr[GoogleCloudSecuritycenterV1p1beta1Resource] = js.native
}
object GoogleCloudSecuritycenterV1p1beta1NotificationMessage {
  
  @scala.inline
  def apply(): GoogleCloudSecuritycenterV1p1beta1NotificationMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudSecuritycenterV1p1beta1NotificationMessage]
  }
  
  @scala.inline
  implicit class GoogleCloudSecuritycenterV1p1beta1NotificationMessageOps[Self <: GoogleCloudSecuritycenterV1p1beta1NotificationMessage] (val x: Self) extends AnyVal {
    
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
    def setFinding(value: GoogleCloudSecuritycenterV1p1beta1Finding): Self = this.set("finding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFinding: Self = this.set("finding", js.undefined)
    
    @scala.inline
    def setNotificationConfigName(value: String): Self = this.set("notificationConfigName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationConfigName: Self = this.set("notificationConfigName", js.undefined)
    
    @scala.inline
    def setResource(value: GoogleCloudSecuritycenterV1p1beta1Resource): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
  }
}
