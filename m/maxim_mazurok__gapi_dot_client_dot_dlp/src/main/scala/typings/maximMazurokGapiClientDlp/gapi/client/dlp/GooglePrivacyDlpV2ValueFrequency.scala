package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2ValueFrequency extends StObject {
  
  /** How many times the value is contained in the field. */
  var count: js.UndefOr[String] = js.undefined
  
  /** A value contained in the field in question. */
  var value: js.UndefOr[GooglePrivacyDlpV2Value] = js.undefined
}
object GooglePrivacyDlpV2ValueFrequency {
  
  inline def apply(): GooglePrivacyDlpV2ValueFrequency = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2ValueFrequency]
  }
  
  extension [Self <: GooglePrivacyDlpV2ValueFrequency](x: Self) {
    
    inline def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setValue(value: GooglePrivacyDlpV2Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
