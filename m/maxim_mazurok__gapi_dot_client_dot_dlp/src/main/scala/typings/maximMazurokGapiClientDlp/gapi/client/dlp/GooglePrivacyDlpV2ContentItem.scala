package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2ContentItem extends js.Object {
  
  /** Content data to inspect or redact. Replaces `type` and `data`. */
  var byteItem: js.UndefOr[GooglePrivacyDlpV2ByteContentItem] = js.native
  
  /** Structured content for inspection. See https://cloud.google.com/dlp/docs/inspecting-text#inspecting_a_table to learn more. */
  var table: js.UndefOr[GooglePrivacyDlpV2Table] = js.native
  
  /** String data to inspect or redact. */
  var value: js.UndefOr[String] = js.native
}
object GooglePrivacyDlpV2ContentItem {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2ContentItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2ContentItem]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2ContentItemOps[Self <: GooglePrivacyDlpV2ContentItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setByteItem(value: GooglePrivacyDlpV2ByteContentItem): Self = this.set("byteItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteByteItem: Self = this.set("byteItem", js.undefined)
    
    @scala.inline
    def setTable(value: GooglePrivacyDlpV2Table): Self = this.set("table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTable: Self = this.set("table", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
