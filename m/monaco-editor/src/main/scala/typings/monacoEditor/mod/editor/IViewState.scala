package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.IPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IViewState extends StObject {
  
  var firstPosition: IPosition
  
  var firstPositionDeltaTop: Double
  
  var scrollLeft: Double
  
  /** written by previous versions */
  var scrollTop: js.UndefOr[Double] = js.undefined
  
  /** written by previous versions */
  var scrollTopWithoutViewZones: js.UndefOr[Double] = js.undefined
}
object IViewState {
  
  inline def apply(firstPosition: IPosition, firstPositionDeltaTop: Double, scrollLeft: Double): IViewState = {
    val __obj = js.Dynamic.literal(firstPosition = firstPosition.asInstanceOf[js.Any], firstPositionDeltaTop = firstPositionDeltaTop.asInstanceOf[js.Any], scrollLeft = scrollLeft.asInstanceOf[js.Any])
    __obj.asInstanceOf[IViewState]
  }
  
  extension [Self <: IViewState](x: Self) {
    
    inline def setFirstPosition(value: IPosition): Self = StObject.set(x, "firstPosition", value.asInstanceOf[js.Any])
    
    inline def setFirstPositionDeltaTop(value: Double): Self = StObject.set(x, "firstPositionDeltaTop", value.asInstanceOf[js.Any])
    
    inline def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
    
    inline def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
    
    inline def setScrollTopUndefined: Self = StObject.set(x, "scrollTop", js.undefined)
    
    inline def setScrollTopWithoutViewZones(value: Double): Self = StObject.set(x, "scrollTopWithoutViewZones", value.asInstanceOf[js.Any])
    
    inline def setScrollTopWithoutViewZonesUndefined: Self = StObject.set(x, "scrollTopWithoutViewZones", js.undefined)
  }
}
