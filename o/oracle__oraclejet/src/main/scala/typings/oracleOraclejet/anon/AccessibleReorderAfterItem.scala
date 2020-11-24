package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessibleReorderAfterItem extends js.Object {
  
  var accessibleReorderAfterItem: js.UndefOr[String] = js.native
  
  var accessibleReorderBeforeItem: js.UndefOr[String] = js.native
  
  var accessibleReorderTouchInstructionText: js.UndefOr[String] = js.native
  
  var labelCut: js.UndefOr[String] = js.native
  
  var labelPasteAfter: js.UndefOr[String] = js.native
  
  var labelPasteBefore: js.UndefOr[String] = js.native
  
  var labelRemove: js.UndefOr[String] = js.native
  
  var msgFetchingData: js.UndefOr[String] = js.native
  
  var msgNoData: js.UndefOr[String] = js.native
  
  var overflowItemLabel: js.UndefOr[String] = js.native
  
  var removeCueText: js.UndefOr[String] = js.native
  
  var selectedLabel: js.UndefOr[String] = js.native
}
object AccessibleReorderAfterItem {
  
  @scala.inline
  def apply(): AccessibleReorderAfterItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessibleReorderAfterItem]
  }
  
  @scala.inline
  implicit class AccessibleReorderAfterItemOps[Self <: AccessibleReorderAfterItem] (val x: Self) extends AnyVal {
    
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
    def setAccessibleReorderAfterItem(value: String): Self = this.set("accessibleReorderAfterItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibleReorderAfterItem: Self = this.set("accessibleReorderAfterItem", js.undefined)
    
    @scala.inline
    def setAccessibleReorderBeforeItem(value: String): Self = this.set("accessibleReorderBeforeItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibleReorderBeforeItem: Self = this.set("accessibleReorderBeforeItem", js.undefined)
    
    @scala.inline
    def setAccessibleReorderTouchInstructionText(value: String): Self = this.set("accessibleReorderTouchInstructionText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibleReorderTouchInstructionText: Self = this.set("accessibleReorderTouchInstructionText", js.undefined)
    
    @scala.inline
    def setLabelCut(value: String): Self = this.set("labelCut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelCut: Self = this.set("labelCut", js.undefined)
    
    @scala.inline
    def setLabelPasteAfter(value: String): Self = this.set("labelPasteAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelPasteAfter: Self = this.set("labelPasteAfter", js.undefined)
    
    @scala.inline
    def setLabelPasteBefore(value: String): Self = this.set("labelPasteBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelPasteBefore: Self = this.set("labelPasteBefore", js.undefined)
    
    @scala.inline
    def setLabelRemove(value: String): Self = this.set("labelRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelRemove: Self = this.set("labelRemove", js.undefined)
    
    @scala.inline
    def setMsgFetchingData(value: String): Self = this.set("msgFetchingData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsgFetchingData: Self = this.set("msgFetchingData", js.undefined)
    
    @scala.inline
    def setMsgNoData(value: String): Self = this.set("msgNoData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsgNoData: Self = this.set("msgNoData", js.undefined)
    
    @scala.inline
    def setOverflowItemLabel(value: String): Self = this.set("overflowItemLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverflowItemLabel: Self = this.set("overflowItemLabel", js.undefined)
    
    @scala.inline
    def setRemoveCueText(value: String): Self = this.set("removeCueText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveCueText: Self = this.set("removeCueText", js.undefined)
    
    @scala.inline
    def setSelectedLabel(value: String): Self = this.set("selectedLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedLabel: Self = this.set("selectedLabel", js.undefined)
  }
}
