package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2DataProfilePubSubMessage extends StObject {
  
  /** The event that caused the Pub/Sub message to be sent. */
  var event: js.UndefOr[String] = js.undefined
  
  /** If `DetailLevel` is `TABLE_PROFILE` this will be fully populated. Otherwise, if `DetailLevel` is `RESOURCE_NAME`, then only `name` and `full_resource` will be populated. */
  var profile: js.UndefOr[GooglePrivacyDlpV2TableDataProfile] = js.undefined
}
object GooglePrivacyDlpV2DataProfilePubSubMessage {
  
  inline def apply(): GooglePrivacyDlpV2DataProfilePubSubMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2DataProfilePubSubMessage]
  }
  
  extension [Self <: GooglePrivacyDlpV2DataProfilePubSubMessage](x: Self) {
    
    inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setProfile(value: GooglePrivacyDlpV2TableDataProfile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
  }
}
