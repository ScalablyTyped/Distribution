package typings.muiDatatables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MUIDataTableSelectCell extends StObject {
  
  var checked: Boolean = js.native
  
  var classes: js.UndefOr[js.Object] = js.native
  
  var expandableOn: js.UndefOr[Boolean] = js.native
  
  var fixedHeader: Boolean = js.native
  
  var isHeaderCell: js.UndefOr[Boolean] = js.native
  
  var isRowExpanded: js.UndefOr[Boolean] = js.native
  
  var isRowSelectable: js.UndefOr[Boolean] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.native
  
  var onExpand: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.native
  
  var otherProps: js.UndefOr[js.Any] = js.native
  
  var selectableOn: js.UndefOr[Boolean] = js.native
}
object MUIDataTableSelectCell {
  
  @scala.inline
  def apply(checked: Boolean, fixedHeader: Boolean): MUIDataTableSelectCell = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], fixedHeader = fixedHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableSelectCell]
  }
  
  @scala.inline
  implicit class MUIDataTableSelectCellMutableBuilder[Self <: MUIDataTableSelectCell] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClasses(value: js.Object): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    @scala.inline
    def setExpandableOn(value: Boolean): Self = StObject.set(x, "expandableOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandableOnUndefined: Self = StObject.set(x, "expandableOn", js.undefined)
    
    @scala.inline
    def setFixedHeader(value: Boolean): Self = StObject.set(x, "fixedHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHeaderCell(value: Boolean): Self = StObject.set(x, "isHeaderCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHeaderCellUndefined: Self = StObject.set(x, "isHeaderCell", js.undefined)
    
    @scala.inline
    def setIsRowExpanded(value: Boolean): Self = StObject.set(x, "isRowExpanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRowExpandedUndefined: Self = StObject.set(x, "isRowExpanded", js.undefined)
    
    @scala.inline
    def setIsRowSelectable(value: Boolean): Self = StObject.set(x, "isRowSelectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRowSelectableUndefined: Self = StObject.set(x, "isRowSelectable", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* args */ js.Any => _): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setOnExpand(value: /* args */ js.Any => _): Self = StObject.set(x, "onExpand", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnExpandUndefined: Self = StObject.set(x, "onExpand", js.undefined)
    
    @scala.inline
    def setOtherProps(value: js.Any): Self = StObject.set(x, "otherProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtherPropsUndefined: Self = StObject.set(x, "otherProps", js.undefined)
    
    @scala.inline
    def setSelectableOn(value: Boolean): Self = StObject.set(x, "selectableOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectableOnUndefined: Self = StObject.set(x, "selectableOn", js.undefined)
  }
}
