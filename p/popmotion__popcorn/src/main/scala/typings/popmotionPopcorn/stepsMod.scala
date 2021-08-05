package typings.popmotionPopcorn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepsMod {
  
  @JSImport("@popmotion/popcorn/lib/easing/steps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(steps: Double): js.Function1[/* progress */ Double, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(steps.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* progress */ Double, js.Any]]
  inline def default(steps: Double, direction: Direction): js.Function1[/* progress */ Double, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(steps.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* progress */ Double, js.Any]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.popmotionPopcorn.popmotionPopcornStrings.start
    - typings.popmotionPopcorn.popmotionPopcornStrings.end
  */
  trait Direction extends StObject
  object Direction {
    
    inline def end: typings.popmotionPopcorn.popmotionPopcornStrings.end = "end".asInstanceOf[typings.popmotionPopcorn.popmotionPopcornStrings.end]
    
    inline def start: typings.popmotionPopcorn.popmotionPopcornStrings.start = "start".asInstanceOf[typings.popmotionPopcorn.popmotionPopcornStrings.start]
  }
}
