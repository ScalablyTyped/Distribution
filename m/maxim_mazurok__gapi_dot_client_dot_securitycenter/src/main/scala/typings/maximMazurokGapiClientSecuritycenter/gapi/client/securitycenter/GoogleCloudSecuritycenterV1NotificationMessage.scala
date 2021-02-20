package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudSecuritycenterV1NotificationMessage extends StObject {
  
  /** If it's a Finding based notification config, this field will be populated. */
  var finding: js.UndefOr[Finding] = js.native
  
  /** Name of the notification config that generated current notification. */
  var notificationConfigName: js.UndefOr[String] = js.native
  
  /** The Cloud resource tied to this notification's Finding. */
  var resource: js.UndefOr[GoogleCloudSecuritycenterV1Resource] = js.native
}
object GoogleCloudSecuritycenterV1NotificationMessage {
  
  @scala.inline
  def apply(): GoogleCloudSecuritycenterV1NotificationMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudSecuritycenterV1NotificationMessage]
  }
  
  @scala.inline
  implicit class GoogleCloudSecuritycenterV1NotificationMessageMutableBuilder[Self <: GoogleCloudSecuritycenterV1NotificationMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFinding(value: Finding): Self = StObject.set(x, "finding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingUndefined: Self = StObject.set(x, "finding", js.undefined)
    
    @scala.inline
    def setNotificationConfigName(value: String): Self = StObject.set(x, "notificationConfigName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationConfigNameUndefined: Self = StObject.set(x, "notificationConfigName", js.undefined)
    
    @scala.inline
    def setResource(value: GoogleCloudSecuritycenterV1Resource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
