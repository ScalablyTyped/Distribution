package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2HybridContentItem extends js.Object {
  
  /** Supplementary information that will be added to each finding. */
  var findingDetails: js.UndefOr[GooglePrivacyDlpV2HybridFindingDetails] = js.native
  
  /** The item to inspect. */
  var item: js.UndefOr[GooglePrivacyDlpV2ContentItem] = js.native
}
object GooglePrivacyDlpV2HybridContentItem {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2HybridContentItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2HybridContentItem]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2HybridContentItemOps[Self <: GooglePrivacyDlpV2HybridContentItem] (val x: Self) extends AnyVal {
    
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
    def setFindingDetails(value: GooglePrivacyDlpV2HybridFindingDetails): Self = this.set("findingDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFindingDetails: Self = this.set("findingDetails", js.undefined)
    
    @scala.inline
    def setItem(value: GooglePrivacyDlpV2ContentItem): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
  }
}
