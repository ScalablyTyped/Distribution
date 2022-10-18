package typings.popmotion

import typings.popmotion.libEasingTypesMod.Easing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEasingStepsMod {
  
  @JSImport("popmotion/lib/easing/steps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def steps(steps: Double): Easing = ^.asInstanceOf[js.Dynamic].applyDynamic("steps")(steps.asInstanceOf[js.Any]).asInstanceOf[Easing]
  inline def steps(steps: Double, direction: Direction): Easing = (^.asInstanceOf[js.Dynamic].applyDynamic("steps")(steps.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[Easing]
  
  /* Rewritten from type alias, can be one of: 
    - typings.popmotion.popmotionStrings.start
    - typings.popmotion.popmotionStrings.end
  */
  trait Direction extends StObject
  object Direction {
    
    inline def end: typings.popmotion.popmotionStrings.end = "end".asInstanceOf[typings.popmotion.popmotionStrings.end]
    
    inline def start: typings.popmotion.popmotionStrings.start = "start".asInstanceOf[typings.popmotion.popmotionStrings.start]
  }
}
