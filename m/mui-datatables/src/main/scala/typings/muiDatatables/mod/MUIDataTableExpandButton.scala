package typings.muiDatatables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MUIDataTableExpandButton extends StObject {
  
  def areAllRowsExpanded(): Boolean
  
  var buttonClass: String
  
  var dataIndex: js.UndefOr[Double] = js.undefined
  
  var expandableRowsHeader: Boolean
  
  var expandedRows: js.UndefOr[js.Any] = js.undefined
  
  var iconClass: String
  
  var iconIndeterminateClass: String
  
  var isHeaderCell: Boolean
  
  var onExpand: js.UndefOr[js.Function1[/* args */ js.Any, js.Any]] = js.undefined
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
  implicit class MUIDataTableExpandButtonMutableBuilder[Self <: MUIDataTableExpandButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAreAllRowsExpanded(value: () => Boolean): Self = StObject.set(x, "areAllRowsExpanded", js.Any.fromFunction0(value))
    
    @scala.inline
    def setButtonClass(value: String): Self = StObject.set(x, "buttonClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataIndex(value: Double): Self = StObject.set(x, "dataIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataIndexUndefined: Self = StObject.set(x, "dataIndex", js.undefined)
    
    @scala.inline
    def setExpandableRowsHeader(value: Boolean): Self = StObject.set(x, "expandableRowsHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedRows(value: js.Any): Self = StObject.set(x, "expandedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedRowsUndefined: Self = StObject.set(x, "expandedRows", js.undefined)
    
    @scala.inline
    def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconIndeterminateClass(value: String): Self = StObject.set(x, "iconIndeterminateClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHeaderCell(value: Boolean): Self = StObject.set(x, "isHeaderCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnExpand(value: /* args */ js.Any => js.Any): Self = StObject.set(x, "onExpand", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnExpandUndefined: Self = StObject.set(x, "onExpand", js.undefined)
  }
}
