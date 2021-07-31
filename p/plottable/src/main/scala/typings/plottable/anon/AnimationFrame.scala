package typings.plottable.anon

import typings.plottable.plottableStrings.animationFrame
import typings.plottable.plottableStrings.immediate
import typings.plottable.plottableStrings.timeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationFrame extends StObject {
  
  var animationFrame: typings.plottable.plottableStrings.animationFrame
  
  var immediate: typings.plottable.plottableStrings.immediate
  
  var timeout: typings.plottable.plottableStrings.timeout
}
object AnimationFrame {
  
  @scala.inline
  def apply(): AnimationFrame = {
    val __obj = js.Dynamic.literal(animationFrame = "animationFrame", immediate = "immediate", timeout = "timeout")
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
