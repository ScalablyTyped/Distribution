package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessibleNavigateSkipItems extends js.Object {
  
  var accessibleNavigateSkipItems: js.UndefOr[String] = js.native
  
  var accessibleReorderAfterItem: js.UndefOr[String] = js.native
  
  var accessibleReorderBeforeItem: js.UndefOr[String] = js.native
  
  var accessibleReorderInsideItem: js.UndefOr[String] = js.native
  
  var accessibleReorderTouchInstructionText: js.UndefOr[String] = js.native
  
  var indexerCharacters: js.UndefOr[String] = js.native
  
  var labelCopy: js.UndefOr[String] = js.native
  
  var labelCut: js.UndefOr[String] = js.native
  
  var labelPaste: js.UndefOr[String] = js.native
  
  var labelPasteAfter: js.UndefOr[String] = js.native
  
  var labelPasteBefore: js.UndefOr[String] = js.native
  
  var msgFetchingData: js.UndefOr[String] = js.native
  
  var msgNoData: js.UndefOr[String] = js.native
}
object AccessibleNavigateSkipItems {
  
  @scala.inline
  def apply(): AccessibleNavigateSkipItems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessibleNavigateSkipItems]
  }
  
  @scala.inline
  implicit class AccessibleNavigateSkipItemsOps[Self <: AccessibleNavigateSkipItems] (val x: Self) extends AnyVal {
    
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
    def setAccessibleNavigateSkipItems(value: String): Self = this.set("accessibleNavigateSkipItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibleNavigateSkipItems: Self = this.set("accessibleNavigateSkipItems", js.undefined)
    
    @scala.inline
    def setAccessibleReorderAfterItem(value: String): Self = this.set("accessibleReorderAfterItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibleReorderAfterItem: Self = this.set("accessibleReorderAfterItem", js.undefined)
    
    @scala.inline
    def setAccessibleReorderBeforeItem(value: String): Self = this.set("accessibleReorderBeforeItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibleReorderBeforeItem: Self = this.set("accessibleReorderBeforeItem", js.undefined)
    
    @scala.inline
    def setAccessibleReorderInsideItem(value: String): Self = this.set("accessibleReorderInsideItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibleReorderInsideItem: Self = this.set("accessibleReorderInsideItem", js.undefined)
    
    @scala.inline
    def setAccessibleReorderTouchInstructionText(value: String): Self = this.set("accessibleReorderTouchInstructionText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibleReorderTouchInstructionText: Self = this.set("accessibleReorderTouchInstructionText", js.undefined)
    
    @scala.inline
    def setIndexerCharacters(value: String): Self = this.set("indexerCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexerCharacters: Self = this.set("indexerCharacters", js.undefined)
    
    @scala.inline
    def setLabelCopy(value: String): Self = this.set("labelCopy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelCopy: Self = this.set("labelCopy", js.undefined)
    
    @scala.inline
    def setLabelCut(value: String): Self = this.set("labelCut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelCut: Self = this.set("labelCut", js.undefined)
    
    @scala.inline
    def setLabelPaste(value: String): Self = this.set("labelPaste", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelPaste: Self = this.set("labelPaste", js.undefined)
    
    @scala.inline
    def setLabelPasteAfter(value: String): Self = this.set("labelPasteAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelPasteAfter: Self = this.set("labelPasteAfter", js.undefined)
    
    @scala.inline
    def setLabelPasteBefore(value: String): Self = this.set("labelPasteBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelPasteBefore: Self = this.set("labelPasteBefore", js.undefined)
    
    @scala.inline
    def setMsgFetchingData(value: String): Self = this.set("msgFetchingData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsgFetchingData: Self = this.set("msgFetchingData", js.undefined)
    
    @scala.inline
    def setMsgNoData(value: String): Self = this.set("msgNoData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsgNoData: Self = this.set("msgNoData", js.undefined)
  }
}
