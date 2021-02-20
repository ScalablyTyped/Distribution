package typings.popmotionPopcorn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepsMod {
  
  @JSImport("@popmotion/popcorn/lib/easing/steps", JSImport.Default)
  @js.native
  def default(steps: Double): js.Function1[/* progress */ Double, _] = js.native
  @JSImport("@popmotion/popcorn/lib/easing/steps", JSImport.Default)
  @js.native
  def default(steps: Double, direction: Direction): js.Function1[/* progress */ Double, _] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.popmotionPopcorn.popmotionPopcornStrings.start
    - typings.popmotionPopcorn.popmotionPopcornStrings.end
  */
  trait Direction extends StObject
  object Direction {
    
    @scala.inline
    def end: typings.popmotionPopcorn.popmotionPopcornStrings.end = "end".asInstanceOf[typings.popmotionPopcorn.popmotionPopcornStrings.end]
    
    @scala.inline
    def start: typings.popmotionPopcorn.popmotionPopcornStrings.start = "start".asInstanceOf[typings.popmotionPopcorn.popmotionPopcornStrings.start]
  }
}
