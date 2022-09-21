package typings.openrct2.mod.global

import typings.openrct2.openrct2Strings.listview
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListView
  extends StObject
     with WidgetBase
     with Widget {
  
  var canSelect: js.UndefOr[Boolean] = js.undefined
  
  var columns: js.UndefOr[js.Array[ListViewColumn]] = js.undefined
  
  val highlightedCell: js.UndefOr[RowColumn] = js.undefined
  
  var isStriped: js.UndefOr[Boolean] = js.undefined
  
  var items: js.UndefOr[js.Array[ListViewItem | String]] = js.undefined
  
  var onClick: js.UndefOr[js.Function2[/* item */ Double, /* column */ Double, Unit]] = js.undefined
  
  var onHighlight: js.UndefOr[js.Function2[/* item */ Double, /* column */ Double, Unit]] = js.undefined
  
  var scrollbars: js.UndefOr[ScrollbarType] = js.undefined
  
  var selectedCell: js.UndefOr[RowColumn] = js.undefined
  
  var showColumnHeaders: js.UndefOr[Boolean] = js.undefined
  
  var `type`: listview
}
object ListView {
  
  inline def apply(height: Double, width: Double, x: Double, y: Double): ListView = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("listview")
    __obj.asInstanceOf[ListView]
  }
  
  extension [Self <: ListView](x: Self) {
    
    inline def setCanSelect(value: Boolean): Self = StObject.set(x, "canSelect", value.asInstanceOf[js.Any])
    
    inline def setCanSelectUndefined: Self = StObject.set(x, "canSelect", js.undefined)
    
    inline def setColumns(value: js.Array[ListViewColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: ListViewColumn*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setHighlightedCell(value: RowColumn): Self = StObject.set(x, "highlightedCell", value.asInstanceOf[js.Any])
    
    inline def setHighlightedCellUndefined: Self = StObject.set(x, "highlightedCell", js.undefined)
    
    inline def setIsStriped(value: Boolean): Self = StObject.set(x, "isStriped", value.asInstanceOf[js.Any])
    
    inline def setIsStripedUndefined: Self = StObject.set(x, "isStriped", js.undefined)
    
    inline def setItems(value: js.Array[ListViewItem | String]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: (ListViewItem | String)*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setOnClick(value: (/* item */ Double, /* column */ Double) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnHighlight(value: (/* item */ Double, /* column */ Double) => Unit): Self = StObject.set(x, "onHighlight", js.Any.fromFunction2(value))
    
    inline def setOnHighlightUndefined: Self = StObject.set(x, "onHighlight", js.undefined)
    
    inline def setScrollbars(value: ScrollbarType): Self = StObject.set(x, "scrollbars", value.asInstanceOf[js.Any])
    
    inline def setScrollbarsUndefined: Self = StObject.set(x, "scrollbars", js.undefined)
    
    inline def setSelectedCell(value: RowColumn): Self = StObject.set(x, "selectedCell", value.asInstanceOf[js.Any])
    
    inline def setSelectedCellUndefined: Self = StObject.set(x, "selectedCell", js.undefined)
    
    inline def setShowColumnHeaders(value: Boolean): Self = StObject.set(x, "showColumnHeaders", value.asInstanceOf[js.Any])
    
    inline def setShowColumnHeadersUndefined: Self = StObject.set(x, "showColumnHeaders", js.undefined)
    
    inline def setType(value: listview): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
