package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudSecuritycenterV1NotificationMessage extends StObject {
  
  /** If it's a Finding based notification config, this field will be populated. */
  var finding: js.UndefOr[Finding] = js.undefined
  
  /** Name of the notification config that generated current notification. */
  var notificationConfigName: js.UndefOr[String] = js.undefined
  
  /** The Cloud resource tied to this notification's Finding. */
  var resource: js.UndefOr[GoogleCloudSecuritycenterV1Resource] = js.undefined
}
object GoogleCloudSecuritycenterV1NotificationMessage {
  
  inline def apply(): GoogleCloudSecuritycenterV1NotificationMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudSecuritycenterV1NotificationMessage]
  }
  
  extension [Self <: GoogleCloudSecuritycenterV1NotificationMessage](x: Self) {
    
    inline def setFinding(value: Finding): Self = StObject.set(x, "finding", value.asInstanceOf[js.Any])
    
    inline def setFindingUndefined: Self = StObject.set(x, "finding", js.undefined)
    
    inline def setNotificationConfigName(value: String): Self = StObject.set(x, "notificationConfigName", value.asInstanceOf[js.Any])
    
    inline def setNotificationConfigNameUndefined: Self = StObject.set(x, "notificationConfigName", js.undefined)
    
    inline def setResource(value: GoogleCloudSecuritycenterV1Resource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
