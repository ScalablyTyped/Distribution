package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2DataProfileAction extends StObject {
  
  /** Export data profiles into a provided location. */
  var exportData: js.UndefOr[GooglePrivacyDlpV2Export] = js.undefined
  
  /** Publish a message into the Pub/Sub topic. */
  var pubSubNotification: js.UndefOr[GooglePrivacyDlpV2PubSubNotification] = js.undefined
}
object GooglePrivacyDlpV2DataProfileAction {
  
  inline def apply(): GooglePrivacyDlpV2DataProfileAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2DataProfileAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GooglePrivacyDlpV2DataProfileAction] (val x: Self) extends AnyVal {
    
    inline def setExportData(value: GooglePrivacyDlpV2Export): Self = StObject.set(x, "exportData", value.asInstanceOf[js.Any])
    
    inline def setExportDataUndefined: Self = StObject.set(x, "exportData", js.undefined)
    
    inline def setPubSubNotification(value: GooglePrivacyDlpV2PubSubNotification): Self = StObject.set(x, "pubSubNotification", value.asInstanceOf[js.Any])
    
    inline def setPubSubNotificationUndefined: Self = StObject.set(x, "pubSubNotification", js.undefined)
  }
}
