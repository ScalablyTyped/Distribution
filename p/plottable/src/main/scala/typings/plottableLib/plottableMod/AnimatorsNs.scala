package typings
package plottableLib.plottableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable", "Animators")
@js.native
object AnimatorsNs extends js.Object {
  @js.native
  /**
    * Constructs the default animator
    *
    * @constructor
    */
  class Easing ()
    extends plottableLib.buildSrcAnimatorsMod.Easing
  
  @js.native
  class Null ()
    extends plottableLib.buildSrcAnimatorsMod.Null
  
  @js.native
  object EaseName extends js.Object {
    var back: plottableLib.plottableLibStrings.back = js.native
    var backIn: plottableLib.plottableLibStrings.backIn = js.native
    var backInOut: plottableLib.plottableLibStrings.backInOut = js.native
    var backOut: plottableLib.plottableLibStrings.backOut = js.native
    var bounce: plottableLib.plottableLibStrings.bounce = js.native
    var bounceIn: plottableLib.plottableLibStrings.bounceIn = js.native
    var bounceInOut: plottableLib.plottableLibStrings.bounceInOut = js.native
    var bounceOut: plottableLib.plottableLibStrings.bounceOut = js.native
    var circle: plottableLib.plottableLibStrings.circle = js.native
    var circleIn: plottableLib.plottableLibStrings.circleIn = js.native
    var circleInOut: plottableLib.plottableLibStrings.circleInOut = js.native
    var circleOut: plottableLib.plottableLibStrings.circleOut = js.native
    var cubic: plottableLib.plottableLibStrings.cubic = js.native
    var cubicIn: plottableLib.plottableLibStrings.cubicIn = js.native
    var cubicInOut: plottableLib.plottableLibStrings.cubicInOut = js.native
    var cubicOut: plottableLib.plottableLibStrings.cubicOut = js.native
    var elastic: plottableLib.plottableLibStrings.elastic = js.native
    var elasticIn: plottableLib.plottableLibStrings.elasticIn = js.native
    var elasticInOut: plottableLib.plottableLibStrings.elasticInOut = js.native
    var elasticOut: plottableLib.plottableLibStrings.elasticOut = js.native
    var exp: plottableLib.plottableLibStrings.exp = js.native
    var expIn: plottableLib.plottableLibStrings.expIn = js.native
    var expInOut: plottableLib.plottableLibStrings.expInOut = js.native
    var expOut: plottableLib.plottableLibStrings.expOut = js.native
    var linear: plottableLib.plottableLibStrings.linear = js.native
    var poly: plottableLib.plottableLibStrings.poly = js.native
    var polyIn: plottableLib.plottableLibStrings.polyIn = js.native
    var polyInOut: plottableLib.plottableLibStrings.polyInOut = js.native
    var polyOut: plottableLib.plottableLibStrings.polyOut = js.native
    var quad: plottableLib.plottableLibStrings.quad = js.native
    var quadIn: plottableLib.plottableLibStrings.quadIn = js.native
    var quadInOut: plottableLib.plottableLibStrings.quadInOut = js.native
    var quadOut: plottableLib.plottableLibStrings.quadOut = js.native
    var sin: plottableLib.plottableLibStrings.sin = js.native
    var sinIn: plottableLib.plottableLibStrings.sinIn = js.native
    var sinInOut: plottableLib.plottableLibStrings.sinInOut = js.native
    var sinOut: plottableLib.plottableLibStrings.sinOut = js.native
  }
  
  /* static members */
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

