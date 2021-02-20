package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2Proximity extends StObject {
  
  /** Number of characters after the finding to consider. */
  var windowAfter: js.UndefOr[Double] = js.native
  
  /** Number of characters before the finding to consider. */
  var windowBefore: js.UndefOr[Double] = js.native
}
object GooglePrivacyDlpV2Proximity {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2Proximity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2Proximity]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2ProximityMutableBuilder[Self <: GooglePrivacyDlpV2Proximity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWindowAfter(value: Double): Self = StObject.set(x, "windowAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowAfterUndefined: Self = StObject.set(x, "windowAfter", js.undefined)
    
    @scala.inline
    def setWindowBefore(value: Double): Self = StObject.set(x, "windowBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowBeforeUndefined: Self = StObject.set(x, "windowBefore", js.undefined)
  }
}
