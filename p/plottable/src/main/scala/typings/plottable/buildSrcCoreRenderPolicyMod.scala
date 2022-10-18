package typings.plottable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCoreRenderPolicyMod {
  
  @JSImport("plottable/build/src/core/renderPolicy", "AnimationFrame")
  @js.native
  open class AnimationFrame ()
    extends StObject
       with IRenderPolicy {
    
    /* CompleteClass */
    override def render(): Any = js.native
  }
  
  @JSImport("plottable/build/src/core/renderPolicy", "Immediate")
  @js.native
  open class Immediate ()
    extends StObject
       with IRenderPolicy {
    
    /* CompleteClass */
    override def render(): Any = js.native
  }
  
  @JSImport("plottable/build/src/core/renderPolicy", "Timeout")
  @js.native
  open class Timeout ()
    extends StObject
       with IRenderPolicy {
    
    /* private */ var _timeoutMsec: Any = js.native
    
    /* CompleteClass */
    override def render(): Any = js.native
  }
  
  trait IRenderPolicy extends StObject {
    
    def render(): Any
  }
  object IRenderPolicy {
    
    inline def apply(render: () => Any): IRenderPolicy = {
      val __obj = js.Dynamic.literal(render = js.Any.fromFunction0(render))
      __obj.asInstanceOf[IRenderPolicy]
    }
    
    extension [Self <: IRenderPolicy](x: Self) {
      
      inline def setRender(value: () => Any): Self = StObject.set(x, "render", js.Any.fromFunction0(value))
    }
  }
}
