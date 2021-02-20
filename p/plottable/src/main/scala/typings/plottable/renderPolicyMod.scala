package typings.plottable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderPolicyMod {
  
  @JSImport("plottable/build/src/core/renderPolicy", "AnimationFrame")
  @js.native
  class AnimationFrame () extends IRenderPolicy
  
  @JSImport("plottable/build/src/core/renderPolicy", "Immediate")
  @js.native
  class Immediate () extends IRenderPolicy
  
  @JSImport("plottable/build/src/core/renderPolicy", "Timeout")
  @js.native
  class Timeout () extends IRenderPolicy {
    
    var _timeoutMsec: js.Any = js.native
  }
  
  @js.native
  trait IRenderPolicy extends StObject {
    
    def render(): js.Any = js.native
  }
  object IRenderPolicy {
    
    @scala.inline
    def apply(render: () => js.Any): IRenderPolicy = {
      val __obj = js.Dynamic.literal(render = js.Any.fromFunction0(render))
      __obj.asInstanceOf[IRenderPolicy]
    }
    
    @scala.inline
    implicit class IRenderPolicyMutableBuilder[Self <: IRenderPolicy] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRender(value: () => js.Any): Self = StObject.set(x, "render", js.Any.fromFunction0(value))
    }
  }
}
