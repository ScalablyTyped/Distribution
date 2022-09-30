package typings.nukaCarousel

import typings.nukaCarousel.anon.IsAnimating
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useTweenMod {
  
  @JSImport("nuka-carousel/lib/hooks/use-tween", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useTween(
    durationMs: Double,
    easingFunction: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EasingFunction */ Any,
    navigationNum: Double,
    shouldInterrupt: Boolean
  ): IsAnimating = (^.asInstanceOf[js.Dynamic].applyDynamic("useTween")(durationMs.asInstanceOf[js.Any], easingFunction.asInstanceOf[js.Any], navigationNum.asInstanceOf[js.Any], shouldInterrupt.asInstanceOf[js.Any])).asInstanceOf[IsAnimating]
}
