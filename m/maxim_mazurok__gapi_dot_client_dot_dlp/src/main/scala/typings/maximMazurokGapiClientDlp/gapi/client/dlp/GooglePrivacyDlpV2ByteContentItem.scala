package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2ByteContentItem extends StObject {
  
  /** Content data to inspect or redact. */
  var data: js.UndefOr[String] = js.undefined
  
  /** The type of data stored in the bytes string. Default will be TEXT_UTF8. */
  var `type`: js.UndefOr[String] = js.undefined
}
object GooglePrivacyDlpV2ByteContentItem {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2ByteContentItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2ByteContentItem]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2ByteContentItemMutableBuilder[Self <: GooglePrivacyDlpV2ByteContentItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
