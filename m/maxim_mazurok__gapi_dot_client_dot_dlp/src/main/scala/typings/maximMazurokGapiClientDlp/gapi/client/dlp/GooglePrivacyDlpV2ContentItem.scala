package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2ContentItem extends StObject {
  
  /** Content data to inspect or redact. Replaces `type` and `data`. */
  var byteItem: js.UndefOr[GooglePrivacyDlpV2ByteContentItem] = js.undefined
  
  /** Structured content for inspection. See https://cloud.google.com/dlp/docs/inspecting-text#inspecting_a_table to learn more. */
  var table: js.UndefOr[GooglePrivacyDlpV2Table] = js.undefined
  
  /** String data to inspect or redact. */
  var value: js.UndefOr[String] = js.undefined
}
object GooglePrivacyDlpV2ContentItem {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2ContentItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2ContentItem]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2ContentItemMutableBuilder[Self <: GooglePrivacyDlpV2ContentItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setByteItem(value: GooglePrivacyDlpV2ByteContentItem): Self = StObject.set(x, "byteItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByteItemUndefined: Self = StObject.set(x, "byteItem", js.undefined)
    
    @scala.inline
    def setTable(value: GooglePrivacyDlpV2Table): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
