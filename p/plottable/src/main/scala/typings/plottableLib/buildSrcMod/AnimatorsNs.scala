package typings
package plottableLib.buildSrcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src", "Animators")
@js.native
object AnimatorsNs extends js.Object {
  @js.native
  class Easing ()
    extends plottableLib.buildSrcAnimatorsMod.Easing
  
  @js.native
  class Null ()
    extends plottableLib.buildSrcAnimatorsMod.Null
  
  val EaseName: plottableLib.Anon_SinInOut = js.native
  @js.native
  object Easing extends js.Object {
    /**
         * The default easing of the animation
         */
    var _DEFAULT_EASING_MODE: js.Any = js.native
    /**
         * The default maximum start delay between each step of an animation
         */
    var _DEFAULT_ITERATIVE_DELAY_MILLISECONDS: js.Any = js.native
    /**
         * The default maximum total animation duration
         */
    var _DEFAULT_MAX_TOTAL_DURATION_MILLISECONDS: js.Any = js.native
    /**
         * The default starting delay of the animation in milliseconds
         */
    var _DEFAULT_START_DELAY_MILLISECONDS: js.Any = js.native
    /**
         * The default duration of one animation step in milliseconds
         */
    var _DEFAULT_STEP_DURATION_MILLISECONDS: js.Any = js.native
  }
  
}

