package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.IPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IViewState extends StObject {
  
  var firstPosition: IPosition = js.native
  
  var firstPositionDeltaTop: Double = js.native
  
  var scrollLeft: Double = js.native
  
  /** written by previous versions */
  var scrollTop: js.UndefOr[Double] = js.native
  
  /** written by previous versions */
  var scrollTopWithoutViewZones: js.UndefOr[Double] = js.native
}
object IViewState {
  
  @scala.inline
  def apply(firstPosition: IPosition, firstPositionDeltaTop: Double, scrollLeft: Double): IViewState = {
    val __obj = js.Dynamic.literal(firstPosition = firstPosition.asInstanceOf[js.Any], firstPositionDeltaTop = firstPositionDeltaTop.asInstanceOf[js.Any], scrollLeft = scrollLeft.asInstanceOf[js.Any])
    __obj.asInstanceOf[IViewState]
  }
  
  @scala.inline
  implicit class IViewStateMutableBuilder[Self <: IViewState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirstPosition(value: IPosition): Self = StObject.set(x, "firstPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstPositionDeltaTop(value: Double): Self = StObject.set(x, "firstPositionDeltaTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollTopUndefined: Self = StObject.set(x, "scrollTop", js.undefined)
    
    @scala.inline
    def setScrollTopWithoutViewZones(value: Double): Self = StObject.set(x, "scrollTopWithoutViewZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollTopWithoutViewZonesUndefined: Self = StObject.set(x, "scrollTopWithoutViewZones", js.undefined)
  }
}
