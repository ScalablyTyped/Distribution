package typings.ngGrid.ngGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IElementDimension extends StObject {
  
  var rootMaxH: js.UndefOr[Double] = js.undefined
  
  var rootMaxW: js.UndefOr[Double] = js.undefined
  
  var rowIndexCellW: js.UndefOr[Double] = js.undefined
  
  var rowSelectedCellW: js.UndefOr[Double] = js.undefined
  
  var scrollH: js.UndefOr[Double] = js.undefined
  
  var scrollW: js.UndefOr[Double] = js.undefined
}
object IElementDimension {
  
  inline def apply(): IElementDimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IElementDimension]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IElementDimension] (val x: Self) extends AnyVal {
    
    inline def setRootMaxH(value: Double): Self = StObject.set(x, "rootMaxH", value.asInstanceOf[js.Any])
    
    inline def setRootMaxHUndefined: Self = StObject.set(x, "rootMaxH", js.undefined)
    
    inline def setRootMaxW(value: Double): Self = StObject.set(x, "rootMaxW", value.asInstanceOf[js.Any])
    
    inline def setRootMaxWUndefined: Self = StObject.set(x, "rootMaxW", js.undefined)
    
    inline def setRowIndexCellW(value: Double): Self = StObject.set(x, "rowIndexCellW", value.asInstanceOf[js.Any])
    
    inline def setRowIndexCellWUndefined: Self = StObject.set(x, "rowIndexCellW", js.undefined)
    
    inline def setRowSelectedCellW(value: Double): Self = StObject.set(x, "rowSelectedCellW", value.asInstanceOf[js.Any])
    
    inline def setRowSelectedCellWUndefined: Self = StObject.set(x, "rowSelectedCellW", js.undefined)
    
    inline def setScrollH(value: Double): Self = StObject.set(x, "scrollH", value.asInstanceOf[js.Any])
    
    inline def setScrollHUndefined: Self = StObject.set(x, "scrollH", js.undefined)
    
    inline def setScrollW(value: Double): Self = StObject.set(x, "scrollW", value.asInstanceOf[js.Any])
    
    inline def setScrollWUndefined: Self = StObject.set(x, "scrollW", js.undefined)
  }
}
