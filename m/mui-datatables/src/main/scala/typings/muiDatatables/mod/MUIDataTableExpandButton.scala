package typings.muiDatatables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MUIDataTableExpandButton extends StObject {
  
  def areAllRowsExpanded(): Boolean
  
  var buttonClass: String
  
  var dataIndex: js.UndefOr[Double] = js.undefined
  
  var expandableRowsHeader: Boolean
  
  var expandedRows: js.UndefOr[Any] = js.undefined
  
  var iconClass: String
  
  var iconIndeterminateClass: String
  
  var isHeaderCell: Boolean
  
  var onExpand: js.UndefOr[js.Function1[/* args */ Any, Any]] = js.undefined
}
object MUIDataTableExpandButton {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: MUIDataTableExpandButton] (val x: Self) extends AnyVal {
    
    inline def setAreAllRowsExpanded(value: () => Boolean): Self = StObject.set(x, "areAllRowsExpanded", js.Any.fromFunction0(value))
    
    inline def setButtonClass(value: String): Self = StObject.set(x, "buttonClass", value.asInstanceOf[js.Any])
    
    inline def setDataIndex(value: Double): Self = StObject.set(x, "dataIndex", value.asInstanceOf[js.Any])
    
    inline def setDataIndexUndefined: Self = StObject.set(x, "dataIndex", js.undefined)
    
    inline def setExpandableRowsHeader(value: Boolean): Self = StObject.set(x, "expandableRowsHeader", value.asInstanceOf[js.Any])
    
    inline def setExpandedRows(value: Any): Self = StObject.set(x, "expandedRows", value.asInstanceOf[js.Any])
    
    inline def setExpandedRowsUndefined: Self = StObject.set(x, "expandedRows", js.undefined)
    
    inline def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    inline def setIconIndeterminateClass(value: String): Self = StObject.set(x, "iconIndeterminateClass", value.asInstanceOf[js.Any])
    
    inline def setIsHeaderCell(value: Boolean): Self = StObject.set(x, "isHeaderCell", value.asInstanceOf[js.Any])
    
    inline def setOnExpand(value: /* args */ Any => Any): Self = StObject.set(x, "onExpand", js.Any.fromFunction1(value))
    
    inline def setOnExpandUndefined: Self = StObject.set(x, "onExpand", js.undefined)
  }
}
