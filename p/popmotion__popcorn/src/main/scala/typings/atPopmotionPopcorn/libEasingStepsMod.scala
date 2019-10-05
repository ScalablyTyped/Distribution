package typings.atPopmotionPopcorn

import typings.atPopmotionPopcorn.libEasingStepsMod.Direction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@popmotion/popcorn/lib/easing/steps", JSImport.Namespace)
@js.native
object libEasingStepsMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.atPopmotionPopcorn.atPopmotionPopcornStrings.start
    - typings.atPopmotionPopcorn.atPopmotionPopcornStrings.end
  */
  trait Direction extends js.Object
  
  def default(steps: Double): js.Function1[/* progress */ Double, _] = js.native
  def default(steps: Double, direction: Direction): js.Function1[/* progress */ Double, _] = js.native
}

