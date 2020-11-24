package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.IPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IViewState extends js.Object {
  
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
  implicit class IViewStateOps[Self <: IViewState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFirstPosition(value: IPosition): Self = this.set("firstPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstPositionDeltaTop(value: Double): Self = this.set("firstPositionDeltaTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollLeft(value: Double): Self = this.set("scrollLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollTop(value: Double): Self = this.set("scrollTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollTop: Self = this.set("scrollTop", js.undefined)
    
    @scala.inline
    def setScrollTopWithoutViewZones(value: Double): Self = this.set("scrollTopWithoutViewZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollTopWithoutViewZones: Self = this.set("scrollTopWithoutViewZones", js.undefined)
  }
}
