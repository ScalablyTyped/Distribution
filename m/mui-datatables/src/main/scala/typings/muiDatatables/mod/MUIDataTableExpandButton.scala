package typings.muiDatatables.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MUIDataTableExpandButton extends js.Object {
  
  def areAllRowsExpanded(): Boolean = js.native
  
  var buttonClass: String = js.native
  
  var dataIndex: js.UndefOr[Double] = js.native
  
  var expandableRowsHeader: Boolean = js.native
  
  var expandedRows: js.UndefOr[js.Any] = js.native
  
  var iconClass: String = js.native
  
  var iconIndeterminateClass: String = js.native
  
  var isHeaderCell: Boolean = js.native
  
  var onExpand: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.native
}
object MUIDataTableExpandButton {
  
  @scala.inline
  def apply(
    areAllRowsExpanded: () => Boolean,
    buttonClass: String,
    expandableRowsHeader: Boolean,
    iconClass: String,
    iconIndeterminateClass: String,
    isHeaderCell: Boolean
  ): MUIDataTableExpandButton = {
    val __obj = js.Dynamic.literal(areAllRowsExpanded = js.Any.fromFunction0(areAllRowsExpanded), buttonClass = buttonClass.asInstanceOf[js.Any], expandableRowsHeader = expandableRowsHeader.asInstanceOf[js.Any], iconClass = iconClass.asInstanceOf[js.Any], iconIndeterminateClass = iconIndeterminateClass.asInstanceOf[js.Any], isHeaderCell = isHeaderCell.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableExpandButton]
  }
  
  @scala.inline
  implicit class MUIDataTableExpandButtonOps[Self <: MUIDataTableExpandButton] (val x: Self) extends AnyVal {
    
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
    def setAreAllRowsExpanded(value: () => Boolean): Self = this.set("areAllRowsExpanded", js.Any.fromFunction0(value))
    
    @scala.inline
    def setButtonClass(value: String): Self = this.set("buttonClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandableRowsHeader(value: Boolean): Self = this.set("expandableRowsHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconClass(value: String): Self = this.set("iconClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconIndeterminateClass(value: String): Self = this.set("iconIndeterminateClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHeaderCell(value: Boolean): Self = this.set("isHeaderCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataIndex(value: Double): Self = this.set("dataIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataIndex: Self = this.set("dataIndex", js.undefined)
    
    @scala.inline
    def setExpandedRows(value: js.Any): Self = this.set("expandedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandedRows: Self = this.set("expandedRows", js.undefined)
    
    @scala.inline
    def setOnExpand(value: /* args */ js.Any => _): Self = this.set("onExpand", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnExpand: Self = this.set("onExpand", js.undefined)
  }
}
