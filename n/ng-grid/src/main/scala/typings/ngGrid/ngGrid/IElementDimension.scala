package typings.ngGrid.ngGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IElementDimension extends StObject {
  
  var rootMaxH: js.UndefOr[Double] = js.native
  
  var rootMaxW: js.UndefOr[Double] = js.native
  
  var rowIndexCellW: js.UndefOr[Double] = js.native
  
  var rowSelectedCellW: js.UndefOr[Double] = js.native
  
  var scrollH: js.UndefOr[Double] = js.native
  
  var scrollW: js.UndefOr[Double] = js.native
}
object IElementDimension {
  
  @scala.inline
  def apply(): IElementDimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IElementDimension]
  }
  
  @scala.inline
  implicit class IElementDimensionMutableBuilder[Self <: IElementDimension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRootMaxH(value: Double): Self = StObject.set(x, "rootMaxH", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootMaxHUndefined: Self = StObject.set(x, "rootMaxH", js.undefined)
    
    @scala.inline
    def setRootMaxW(value: Double): Self = StObject.set(x, "rootMaxW", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootMaxWUndefined: Self = StObject.set(x, "rootMaxW", js.undefined)
    
    @scala.inline
    def setRowIndexCellW(value: Double): Self = StObject.set(x, "rowIndexCellW", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIndexCellWUndefined: Self = StObject.set(x, "rowIndexCellW", js.undefined)
    
    @scala.inline
    def setRowSelectedCellW(value: Double): Self = StObject.set(x, "rowSelectedCellW", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowSelectedCellWUndefined: Self = StObject.set(x, "rowSelectedCellW", js.undefined)
    
    @scala.inline
    def setScrollH(value: Double): Self = StObject.set(x, "scrollH", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollHUndefined: Self = StObject.set(x, "scrollH", js.undefined)
    
    @scala.inline
    def setScrollW(value: Double): Self = StObject.set(x, "scrollW", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollWUndefined: Self = StObject.set(x, "scrollW", js.undefined)
  }
}
