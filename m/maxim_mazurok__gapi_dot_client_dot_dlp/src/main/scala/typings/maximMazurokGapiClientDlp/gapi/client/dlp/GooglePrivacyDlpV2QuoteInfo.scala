package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2QuoteInfo extends StObject {
  
  /** The date time indicated by the quote. */
  var dateTime: js.UndefOr[GooglePrivacyDlpV2DateTime] = js.native
}
object GooglePrivacyDlpV2QuoteInfo {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2QuoteInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2QuoteInfo]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2QuoteInfoMutableBuilder[Self <: GooglePrivacyDlpV2QuoteInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDateTime(value: GooglePrivacyDlpV2DateTime): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateTimeUndefined: Self = StObject.set(x, "dateTime", js.undefined)
  }
}
