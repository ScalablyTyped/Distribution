package typings.openrct2.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListViewColumn extends StObject {
  
  var canSort: js.UndefOr[Boolean] = js.undefined
  
  var header: js.UndefOr[String] = js.undefined
  
  var headerTooltip: js.UndefOr[String] = js.undefined
  
  var maxWidth: js.UndefOr[Double] = js.undefined
  
  var minWidth: js.UndefOr[Double] = js.undefined
  
  var ratioWidth: js.UndefOr[Double] = js.undefined
  
  var sortOrder: js.UndefOr[SortOrder] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object ListViewColumn {
  
  inline def apply(): ListViewColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListViewColumn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListViewColumn] (val x: Self) extends AnyVal {
    
    inline def setCanSort(value: Boolean): Self = StObject.set(x, "canSort", value.asInstanceOf[js.Any])
    
    inline def setCanSortUndefined: Self = StObject.set(x, "canSort", js.undefined)
    
    inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderTooltip(value: String): Self = StObject.set(x, "headerTooltip", value.asInstanceOf[js.Any])
    
    inline def setHeaderTooltipUndefined: Self = StObject.set(x, "headerTooltip", js.undefined)
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    inline def setRatioWidth(value: Double): Self = StObject.set(x, "ratioWidth", value.asInstanceOf[js.Any])
    
    inline def setRatioWidthUndefined: Self = StObject.set(x, "ratioWidth", js.undefined)
    
    inline def setSortOrder(value: SortOrder): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
