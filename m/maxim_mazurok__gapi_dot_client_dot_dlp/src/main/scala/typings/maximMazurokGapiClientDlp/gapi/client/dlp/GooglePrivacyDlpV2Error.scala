package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2Error extends StObject {
  
  /** Detailed error codes and messages. */
  var details: js.UndefOr[GoogleRpcStatus] = js.undefined
  
  /** The times the error occurred. */
  var timestamps: js.UndefOr[js.Array[String]] = js.undefined
}
object GooglePrivacyDlpV2Error {
  
  inline def apply(): GooglePrivacyDlpV2Error = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2Error]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GooglePrivacyDlpV2Error] (val x: Self) extends AnyVal {
    
    inline def setDetails(value: GoogleRpcStatus): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setTimestamps(value: js.Array[String]): Self = StObject.set(x, "timestamps", value.asInstanceOf[js.Any])
    
    inline def setTimestampsUndefined: Self = StObject.set(x, "timestamps", js.undefined)
    
    inline def setTimestampsVarargs(value: String*): Self = StObject.set(x, "timestamps", js.Array(value*))
  }
}
