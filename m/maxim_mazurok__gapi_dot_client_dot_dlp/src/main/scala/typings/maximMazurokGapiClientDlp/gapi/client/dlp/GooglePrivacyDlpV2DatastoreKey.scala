package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2DatastoreKey extends StObject {
  
  /** Datastore entity key. */
  var entityKey: js.UndefOr[GooglePrivacyDlpV2Key] = js.undefined
}
object GooglePrivacyDlpV2DatastoreKey {
  
  inline def apply(): GooglePrivacyDlpV2DatastoreKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2DatastoreKey]
  }
  
  extension [Self <: GooglePrivacyDlpV2DatastoreKey](x: Self) {
    
    inline def setEntityKey(value: GooglePrivacyDlpV2Key): Self = StObject.set(x, "entityKey", value.asInstanceOf[js.Any])
    
    inline def setEntityKeyUndefined: Self = StObject.set(x, "entityKey", js.undefined)
  }
}
