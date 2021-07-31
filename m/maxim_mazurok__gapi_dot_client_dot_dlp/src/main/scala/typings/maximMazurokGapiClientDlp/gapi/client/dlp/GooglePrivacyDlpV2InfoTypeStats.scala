package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2InfoTypeStats extends StObject {
  
  /** Number of findings for this infoType. */
  var count: js.UndefOr[String] = js.undefined
  
  /** The type of finding this stat is for. */
  var infoType: js.UndefOr[GooglePrivacyDlpV2InfoType] = js.undefined
}
object GooglePrivacyDlpV2InfoTypeStats {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2InfoTypeStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2InfoTypeStats]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2InfoTypeStatsMutableBuilder[Self <: GooglePrivacyDlpV2InfoTypeStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setInfoType(value: GooglePrivacyDlpV2InfoType): Self = StObject.set(x, "infoType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoTypeUndefined: Self = StObject.set(x, "infoType", js.undefined)
  }
}
