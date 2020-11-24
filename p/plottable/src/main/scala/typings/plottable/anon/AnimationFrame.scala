package typings.plottable.anon

import typings.plottable.plottableStrings.animationFrame
import typings.plottable.plottableStrings.immediate
import typings.plottable.plottableStrings.timeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationFrame extends js.Object {
  
  var animationFrame: typings.plottable.plottableStrings.animationFrame = js.native
  
  var immediate: typings.plottable.plottableStrings.immediate = js.native
  
  var timeout: typings.plottable.plottableStrings.timeout = js.native
}
object AnimationFrame {
  
  @scala.inline
  def apply(animationFrame: animationFrame, immediate: immediate, timeout: timeout): AnimationFrame = {
    val __obj = js.Dynamic.literal(animationFrame = animationFrame.asInstanceOf[js.Any], immediate = immediate.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationFrame]
  }
  
  @scala.inline
  implicit class AnimationFrameOps[Self <: AnimationFrame] (val x: Self) extends AnyVal {
    
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
    def setAnimationFrame(value: animationFrame): Self = this.set("animationFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImmediate(value: immediate): Self = this.set("immediate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: timeout): Self = this.set("timeout", value.asInstanceOf[js.Any])
  }
}
