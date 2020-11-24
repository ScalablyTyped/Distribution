package typings.perfectScrollbar.mod.PerfectScrollbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var handlers: js.UndefOr[js.Array[String]] = js.native
  
  var maxScrollbarLength: js.UndefOr[Double] = js.native
  
  var minScrollbarLength: js.UndefOr[Double] = js.native
  
  var scrollXMarginOffset: js.UndefOr[Double] = js.native
  
  var scrollYMarginOffset: js.UndefOr[Double] = js.native
  
  var scrollingThreshold: js.UndefOr[Double] = js.native
  
  var suppressScrollX: js.UndefOr[Boolean] = js.native
  
  var suppressScrollY: js.UndefOr[Boolean] = js.native
  
  var swipeEasing: js.UndefOr[Boolean] = js.native
  
  var useBothWheelAxes: js.UndefOr[Boolean] = js.native
  
  var wheelPropagation: js.UndefOr[Boolean] = js.native
  
  var wheelSpeed: js.UndefOr[Double] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setHandlersVarargs(value: String*): Self = this.set("handlers", js.Array(value :_*))
    
    @scala.inline
    def setHandlers(value: js.Array[String]): Self = this.set("handlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandlers: Self = this.set("handlers", js.undefined)
    
    @scala.inline
    def setMaxScrollbarLength(value: Double): Self = this.set("maxScrollbarLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxScrollbarLength: Self = this.set("maxScrollbarLength", js.undefined)
    
    @scala.inline
    def setMinScrollbarLength(value: Double): Self = this.set("minScrollbarLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinScrollbarLength: Self = this.set("minScrollbarLength", js.undefined)
    
    @scala.inline
    def setScrollXMarginOffset(value: Double): Self = this.set("scrollXMarginOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollXMarginOffset: Self = this.set("scrollXMarginOffset", js.undefined)
    
    @scala.inline
    def setScrollYMarginOffset(value: Double): Self = this.set("scrollYMarginOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollYMarginOffset: Self = this.set("scrollYMarginOffset", js.undefined)
    
    @scala.inline
    def setScrollingThreshold(value: Double): Self = this.set("scrollingThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollingThreshold: Self = this.set("scrollingThreshold", js.undefined)
    
    @scala.inline
    def setSuppressScrollX(value: Boolean): Self = this.set("suppressScrollX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressScrollX: Self = this.set("suppressScrollX", js.undefined)
    
    @scala.inline
    def setSuppressScrollY(value: Boolean): Self = this.set("suppressScrollY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressScrollY: Self = this.set("suppressScrollY", js.undefined)
    
    @scala.inline
    def setSwipeEasing(value: Boolean): Self = this.set("swipeEasing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwipeEasing: Self = this.set("swipeEasing", js.undefined)
    
    @scala.inline
    def setUseBothWheelAxes(value: Boolean): Self = this.set("useBothWheelAxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseBothWheelAxes: Self = this.set("useBothWheelAxes", js.undefined)
    
    @scala.inline
    def setWheelPropagation(value: Boolean): Self = this.set("wheelPropagation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWheelPropagation: Self = this.set("wheelPropagation", js.undefined)
    
    @scala.inline
    def setWheelSpeed(value: Double): Self = this.set("wheelSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWheelSpeed: Self = this.set("wheelSpeed", js.undefined)
  }
}
