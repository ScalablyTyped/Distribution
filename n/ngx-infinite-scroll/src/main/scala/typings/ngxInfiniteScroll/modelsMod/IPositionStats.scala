package typings.ngxInfiniteScroll.modelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPositionStats extends js.Object {
  
  var height: Double = js.native
  
  var isWindow: js.UndefOr[Boolean] = js.native
  
  var scrolled: Double = js.native
  
  var totalToScroll: Double = js.native
}
object IPositionStats {
  
  @scala.inline
  def apply(height: Double, scrolled: Double, totalToScroll: Double): IPositionStats = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], scrolled = scrolled.asInstanceOf[js.Any], totalToScroll = totalToScroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPositionStats]
  }
  
  @scala.inline
  implicit class IPositionStatsOps[Self <: IPositionStats] (val x: Self) extends AnyVal {
    
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrolled(value: Double): Self = this.set("scrolled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalToScroll(value: Double): Self = this.set("totalToScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsWindow(value: Boolean): Self = this.set("isWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsWindow: Self = this.set("isWindow", js.undefined)
  }
}
