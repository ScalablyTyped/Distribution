package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2Proximity extends StObject {
  
  /** Number of characters after the finding to consider. */
  var windowAfter: js.UndefOr[Double] = js.undefined
  
  /** Number of characters before the finding to consider. */
  var windowBefore: js.UndefOr[Double] = js.undefined
}
object GooglePrivacyDlpV2Proximity {
  
  inline def apply(): GooglePrivacyDlpV2Proximity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2Proximity]
  }
  
  extension [Self <: GooglePrivacyDlpV2Proximity](x: Self) {
    
    inline def setWindowAfter(value: Double): Self = StObject.set(x, "windowAfter", value.asInstanceOf[js.Any])
    
    inline def setWindowAfterUndefined: Self = StObject.set(x, "windowAfter", js.undefined)
    
    inline def setWindowBefore(value: Double): Self = StObject.set(x, "windowBefore", value.asInstanceOf[js.Any])
    
    inline def setWindowBeforeUndefined: Self = StObject.set(x, "windowBefore", js.undefined)
  }
}
