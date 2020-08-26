package typings.plottable

import typings.plottable.animatorMod.IAnimator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/animators/nullAnimator", JSImport.Namespace)
@js.native
object nullAnimatorMod extends js.Object {
  @js.native
  class Null () extends IAnimator {
    def totalTime(selection: js.Any): Double = js.native
  }
  
}

