package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2ProfileStatus extends StObject {
  
  /** Profiling status code and optional message */
  var status: js.UndefOr[GoogleRpcStatus] = js.undefined
  
  /** Time when the profile generation status was updated */
  var timestamp: js.UndefOr[String] = js.undefined
}
object GooglePrivacyDlpV2ProfileStatus {
  
  inline def apply(): GooglePrivacyDlpV2ProfileStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2ProfileStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GooglePrivacyDlpV2ProfileStatus] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: GoogleRpcStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
