package typings.mcustomscrollbar.MCustomScrollbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollToParameterOptions extends js.Object {
  
  /**
    * Trigger user defined callback after scroll-to completes, value: true, false
    */
  var callbacks: js.UndefOr[Boolean] = js.native
  
  /**
    * Scroll scrollbar dragger (instead of content) to a number of pixels, values: true, false
    */
  var moveDragger: js.UndefOr[Boolean] = js.native
  
  /**
    * Scroll-to animation easing, values: "linear", "easeOut", "easeInOut".
    */
  var scrollEasing: js.UndefOr[String] = js.native
  
  /**
    * Scroll-to animation speed, value in milliseconds
    */
  var scrollInertia: js.UndefOr[Double] = js.native
  
  /**
    * Set a timeout for the method (the default timeout is 60 ms in order to work with automatic scrollbar update), value in milliseconds.
    */
  var timeout: js.UndefOr[Double] = js.native
}
object ScrollToParameterOptions {
  
  @scala.inline
  def apply(): ScrollToParameterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollToParameterOptions]
  }
  
  @scala.inline
  implicit class ScrollToParameterOptionsOps[Self <: ScrollToParameterOptions] (val x: Self) extends AnyVal {
    
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
    def setCallbacks(value: Boolean): Self = this.set("callbacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallbacks: Self = this.set("callbacks", js.undefined)
    
    @scala.inline
    def setMoveDragger(value: Boolean): Self = this.set("moveDragger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMoveDragger: Self = this.set("moveDragger", js.undefined)
    
    @scala.inline
    def setScrollEasing(value: String): Self = this.set("scrollEasing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollEasing: Self = this.set("scrollEasing", js.undefined)
    
    @scala.inline
    def setScrollInertia(value: Double): Self = this.set("scrollInertia", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollInertia: Self = this.set("scrollInertia", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
