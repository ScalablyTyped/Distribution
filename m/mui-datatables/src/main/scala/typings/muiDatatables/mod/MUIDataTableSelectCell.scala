package typings.muiDatatables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MUIDataTableSelectCell extends StObject {
  
  var checked: Boolean
  
  var classes: js.UndefOr[js.Object] = js.undefined
  
  var expandableOn: js.UndefOr[Boolean] = js.undefined
  
  var fixedHeader: Boolean
  
  var isHeaderCell: js.UndefOr[Boolean] = js.undefined
  
  var isRowExpanded: js.UndefOr[Boolean] = js.undefined
  
  var isRowSelectable: js.UndefOr[Boolean] = js.undefined
  
  var onChange: js.UndefOr[js.Function1[/* args */ js.Any, js.Any]] = js.undefined
  
  var onExpand: js.UndefOr[js.Function1[/* args */ js.Any, js.Any]] = js.undefined
  
  var otherProps: js.UndefOr[js.Any] = js.undefined
  
  var selectableOn: js.UndefOr[Boolean] = js.undefined
}
object MUIDataTableSelectCell {
  
  inline def apply(checked: Boolean, fixedHeader: Boolean): MUIDataTableSelectCell = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], fixedHeader = fixedHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableSelectCell]
  }
  
  extension [Self <: MUIDataTableSelectCell](x: Self) {
    
    inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setClasses(value: js.Object): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setExpandableOn(value: Boolean): Self = StObject.set(x, "expandableOn", value.asInstanceOf[js.Any])
    
    inline def setExpandableOnUndefined: Self = StObject.set(x, "expandableOn", js.undefined)
    
    inline def setFixedHeader(value: Boolean): Self = StObject.set(x, "fixedHeader", value.asInstanceOf[js.Any])
    
    inline def setIsHeaderCell(value: Boolean): Self = StObject.set(x, "isHeaderCell", value.asInstanceOf[js.Any])
    
    inline def setIsHeaderCellUndefined: Self = StObject.set(x, "isHeaderCell", js.undefined)
    
    inline def setIsRowExpanded(value: Boolean): Self = StObject.set(x, "isRowExpanded", value.asInstanceOf[js.Any])
    
    inline def setIsRowExpandedUndefined: Self = StObject.set(x, "isRowExpanded", js.undefined)
    
    inline def setIsRowSelectable(value: Boolean): Self = StObject.set(x, "isRowSelectable", value.asInstanceOf[js.Any])
    
    inline def setIsRowSelectableUndefined: Self = StObject.set(x, "isRowSelectable", js.undefined)
    
    inline def setOnChange(value: /* args */ js.Any => js.Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnExpand(value: /* args */ js.Any => js.Any): Self = StObject.set(x, "onExpand", js.Any.fromFunction1(value))
    
    inline def setOnExpandUndefined: Self = StObject.set(x, "onExpand", js.undefined)
    
    inline def setOtherProps(value: js.Any): Self = StObject.set(x, "otherProps", value.asInstanceOf[js.Any])
    
    inline def setOtherPropsUndefined: Self = StObject.set(x, "otherProps", js.undefined)
    
    inline def setSelectableOn(value: Boolean): Self = StObject.set(x, "selectableOn", value.asInstanceOf[js.Any])
    
    inline def setSelectableOnUndefined: Self = StObject.set(x, "selectableOn", js.undefined)
  }
}
