package typings.plottable.anon

import typings.plottable.plottableStrings.animationFrame
import typings.plottable.plottableStrings.immediate
import typings.plottable.plottableStrings.timeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationFrame extends StObject {
  
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
  implicit class AnimationFrameMutableBuilder[Self <: AnimationFrame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimationFrame(value: animationFrame): Self = StObject.set(x, "animationFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImmediate(value: immediate): Self = StObject.set(x, "immediate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: timeout): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
