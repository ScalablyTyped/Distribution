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
  
  inline def apply(): AnimationFrame = {
    val __obj = js.Dynamic.literal(animationFrame = "animationFrame", immediate = "immediate", timeout = "timeout")
    __obj.asInstanceOf[AnimationFrame]
  }
  
  extension [Self <: AnimationFrame](x: Self) {
    
    inline def setAnimationFrame(value: animationFrame): Self = StObject.set(x, "animationFrame", value.asInstanceOf[js.Any])
    
    inline def setImmediate(value: immediate): Self = StObject.set(x, "immediate", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: timeout): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
