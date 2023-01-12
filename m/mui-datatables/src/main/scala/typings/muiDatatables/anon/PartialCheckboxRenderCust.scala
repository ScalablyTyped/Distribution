package typings.muiDatatables.anon

import typings.muiDatatables.mod.MUIDataTableBody
import typings.muiDatatables.mod.MUIDataTableCheckboxProps
import typings.muiDatatables.mod.MUIDataTableExpandButton
import typings.muiDatatables.mod.MUIDataTableFilterList
import typings.muiDatatables.mod.MUIDataTableFooter
import typings.muiDatatables.mod.MUIDataTableHead
import typings.muiDatatables.mod.MUIDataTableResize
import typings.muiDatatables.mod.MUIDataTableToolbar
import typings.muiDatatables.mod.MUIDataTableToolbarSelect
import typings.muiDatatables.mod.MUIDataTableViewCol
import typings.muiDatatables.mod.RenderCustomComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  Checkbox :mui-datatables.mui-datatables.RenderCustomComponent<mui-datatables.mui-datatables.MUIDataTableCheckboxProps> | react.react.ReactNode,   ExpandButton :mui-datatables.mui-datatables.RenderCustomComponent<mui-datatables.mui-datatables.MUIDataTableExpandButton> | react.react.ReactNode,   TableBody :mui-datatables.mui-datatables.RenderCustomComponent<mui-datatables.mui-datatables.MUIDataTableBody> | react.react.ReactNode,   TableViewCol :mui-datatables.mui-datatables.RenderCustomComponent<mui-datatables.mui-datatables.MUIDataTableViewCol> | react.react.ReactNode,   TableFilterList :mui-datatables.mui-datatables.RenderCustomComponent<mui-datatables.mui-datatables.MUIDataTableFilterList> | react.react.ReactNode,   TableFooter :mui-datatables.mui-datatables.RenderCustomComponent<mui-datatables.mui-datatables.MUIDataTableFooter> | react.react.ReactNode,   TableHead :mui-datatables.mui-datatables.RenderCustomComponent<mui-datatables.mui-datatables.MUIDataTableHead> | react.react.ReactNode,   TableResize :mui-datatables.mui-datatables.RenderCustomComponent<mui-datatables.mui-datatables.MUIDataTableResize> | react.react.ReactNode,   TableToolbar :mui-datatables.mui-datatables.RenderCustomComponent<mui-datatables.mui-datatables.MUIDataTableToolbar> | react.react.ReactNode,   TableToolbarSelect :mui-datatables.mui-datatables.RenderCustomComponent<mui-datatables.mui-datatables.MUIDataTableToolbarSelect> | react.react.ReactNode,   Tooltip :react.react.ReactNode,   icons :std.Partial<{  SearchIcon :react.react.ReactNode,   DownloadIcon :react.react.ReactNode,   PrintIcon :react.react.ReactNode,   ViewColumnIcon :react.react.ReactNode,   FilterIcon :react.react.ReactNode}>}> */
trait PartialCheckboxRenderCust extends StObject {
  
  var Checkbox: js.UndefOr[RenderCustomComponent[MUIDataTableCheckboxProps] | ReactNode] = js.undefined
  
  var ExpandButton: js.UndefOr[RenderCustomComponent[MUIDataTableExpandButton] | ReactNode] = js.undefined
  
  var TableBody: js.UndefOr[RenderCustomComponent[MUIDataTableBody] | ReactNode] = js.undefined
  
  var TableFilterList: js.UndefOr[RenderCustomComponent[MUIDataTableFilterList] | ReactNode] = js.undefined
  
  var TableFooter: js.UndefOr[RenderCustomComponent[MUIDataTableFooter] | ReactNode] = js.undefined
  
  var TableHead: js.UndefOr[RenderCustomComponent[MUIDataTableHead] | ReactNode] = js.undefined
  
  var TableResize: js.UndefOr[RenderCustomComponent[MUIDataTableResize] | ReactNode] = js.undefined
  
  var TableToolbar: js.UndefOr[RenderCustomComponent[MUIDataTableToolbar] | ReactNode] = js.undefined
  
  var TableToolbarSelect: js.UndefOr[RenderCustomComponent[MUIDataTableToolbarSelect] | ReactNode] = js.undefined
  
  var TableViewCol: js.UndefOr[RenderCustomComponent[MUIDataTableViewCol] | ReactNode] = js.undefined
  
  var Tooltip: js.UndefOr[ReactNode] = js.undefined
  
  var icons: js.UndefOr[PartialSearchIconReactNod] = js.undefined
}
object PartialCheckboxRenderCust {
  
  inline def apply(): PartialCheckboxRenderCust = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCheckboxRenderCust]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialCheckboxRenderCust] (val x: Self) extends AnyVal {
    
    inline def setCheckbox(value: RenderCustomComponent[MUIDataTableCheckboxProps] | ReactNode): Self = StObject.set(x, "Checkbox", value.asInstanceOf[js.Any])
    
    inline def setCheckboxFunction1(value: MUIDataTableCheckboxProps => ReactNode): Self = StObject.set(x, "Checkbox", js.Any.fromFunction1(value))
    
    inline def setCheckboxUndefined: Self = StObject.set(x, "Checkbox", js.undefined)
    
    inline def setExpandButton(value: RenderCustomComponent[MUIDataTableExpandButton] | ReactNode): Self = StObject.set(x, "ExpandButton", value.asInstanceOf[js.Any])
    
    inline def setExpandButtonFunction1(value: MUIDataTableExpandButton => ReactNode): Self = StObject.set(x, "ExpandButton", js.Any.fromFunction1(value))
    
    inline def setExpandButtonUndefined: Self = StObject.set(x, "ExpandButton", js.undefined)
    
    inline def setIcons(value: PartialSearchIconReactNod): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    inline def setTableBody(value: RenderCustomComponent[MUIDataTableBody] | ReactNode): Self = StObject.set(x, "TableBody", value.asInstanceOf[js.Any])
    
    inline def setTableBodyFunction1(value: MUIDataTableBody => ReactNode): Self = StObject.set(x, "TableBody", js.Any.fromFunction1(value))
    
    inline def setTableBodyUndefined: Self = StObject.set(x, "TableBody", js.undefined)
    
    inline def setTableFilterList(value: RenderCustomComponent[MUIDataTableFilterList] | ReactNode): Self = StObject.set(x, "TableFilterList", value.asInstanceOf[js.Any])
    
    inline def setTableFilterListFunction1(value: MUIDataTableFilterList => ReactNode): Self = StObject.set(x, "TableFilterList", js.Any.fromFunction1(value))
    
    inline def setTableFilterListUndefined: Self = StObject.set(x, "TableFilterList", js.undefined)
    
    inline def setTableFooter(value: RenderCustomComponent[MUIDataTableFooter] | ReactNode): Self = StObject.set(x, "TableFooter", value.asInstanceOf[js.Any])
    
    inline def setTableFooterFunction1(value: MUIDataTableFooter => ReactNode): Self = StObject.set(x, "TableFooter", js.Any.fromFunction1(value))
    
    inline def setTableFooterUndefined: Self = StObject.set(x, "TableFooter", js.undefined)
    
    inline def setTableHead(value: RenderCustomComponent[MUIDataTableHead] | ReactNode): Self = StObject.set(x, "TableHead", value.asInstanceOf[js.Any])
    
    inline def setTableHeadFunction1(value: MUIDataTableHead => ReactNode): Self = StObject.set(x, "TableHead", js.Any.fromFunction1(value))
    
    inline def setTableHeadUndefined: Self = StObject.set(x, "TableHead", js.undefined)
    
    inline def setTableResize(value: RenderCustomComponent[MUIDataTableResize] | ReactNode): Self = StObject.set(x, "TableResize", value.asInstanceOf[js.Any])
    
    inline def setTableResizeFunction1(value: MUIDataTableResize => ReactNode): Self = StObject.set(x, "TableResize", js.Any.fromFunction1(value))
    
    inline def setTableResizeUndefined: Self = StObject.set(x, "TableResize", js.undefined)
    
    inline def setTableToolbar(value: RenderCustomComponent[MUIDataTableToolbar] | ReactNode): Self = StObject.set(x, "TableToolbar", value.asInstanceOf[js.Any])
    
    inline def setTableToolbarFunction1(value: MUIDataTableToolbar => ReactNode): Self = StObject.set(x, "TableToolbar", js.Any.fromFunction1(value))
    
    inline def setTableToolbarSelect(value: RenderCustomComponent[MUIDataTableToolbarSelect] | ReactNode): Self = StObject.set(x, "TableToolbarSelect", value.asInstanceOf[js.Any])
    
    inline def setTableToolbarSelectFunction1(value: MUIDataTableToolbarSelect => ReactNode): Self = StObject.set(x, "TableToolbarSelect", js.Any.fromFunction1(value))
    
    inline def setTableToolbarSelectUndefined: Self = StObject.set(x, "TableToolbarSelect", js.undefined)
    
    inline def setTableToolbarUndefined: Self = StObject.set(x, "TableToolbar", js.undefined)
    
    inline def setTableViewCol(value: RenderCustomComponent[MUIDataTableViewCol] | ReactNode): Self = StObject.set(x, "TableViewCol", value.asInstanceOf[js.Any])
    
    inline def setTableViewColFunction1(value: MUIDataTableViewCol => ReactNode): Self = StObject.set(x, "TableViewCol", js.Any.fromFunction1(value))
    
    inline def setTableViewColUndefined: Self = StObject.set(x, "TableViewCol", js.undefined)
    
    inline def setTooltip(value: ReactNode): Self = StObject.set(x, "Tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "Tooltip", js.undefined)
  }
}
