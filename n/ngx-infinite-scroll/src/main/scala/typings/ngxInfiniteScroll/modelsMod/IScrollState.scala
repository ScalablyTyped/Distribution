package typings.ngxInfiniteScroll.modelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IScrollState extends js.Object {
  
  var lastScrollPosition: Double = js.native
  
  var lastTotalToScroll: Double = js.native
  
  var totalToScroll: Double = js.native
  
  var triggered: IScrollerDistance = js.native
}
object IScrollState {
  
  @scala.inline
  def apply(
    lastScrollPosition: Double,
    lastTotalToScroll: Double,
    totalToScroll: Double,
    triggered: IScrollerDistance
  ): IScrollState = {
    val __obj = js.Dynamic.literal(lastScrollPosition = lastScrollPosition.asInstanceOf[js.Any], lastTotalToScroll = lastTotalToScroll.asInstanceOf[js.Any], totalToScroll = totalToScroll.asInstanceOf[js.Any], triggered = triggered.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScrollState]
  }
  
  @scala.inline
  implicit class IScrollStateOps[Self <: IScrollState] (val x: Self) extends AnyVal {
    
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
    def setLastScrollPosition(value: Double): Self = this.set("lastScrollPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastTotalToScroll(value: Double): Self = this.set("lastTotalToScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalToScroll(value: Double): Self = this.set("totalToScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggered(value: IScrollerDistance): Self = this.set("triggered", value.asInstanceOf[js.Any])
  }
}
