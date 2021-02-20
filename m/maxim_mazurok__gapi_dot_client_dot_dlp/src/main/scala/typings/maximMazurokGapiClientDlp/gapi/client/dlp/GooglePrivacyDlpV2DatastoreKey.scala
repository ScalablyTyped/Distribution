package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2DatastoreKey extends StObject {
  
  /** Datastore entity key. */
  var entityKey: js.UndefOr[GooglePrivacyDlpV2Key] = js.native
}
object GooglePrivacyDlpV2DatastoreKey {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2DatastoreKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2DatastoreKey]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2DatastoreKeyMutableBuilder[Self <: GooglePrivacyDlpV2DatastoreKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntityKey(value: GooglePrivacyDlpV2Key): Self = StObject.set(x, "entityKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityKeyUndefined: Self = StObject.set(x, "entityKey", js.undefined)
  }
}
