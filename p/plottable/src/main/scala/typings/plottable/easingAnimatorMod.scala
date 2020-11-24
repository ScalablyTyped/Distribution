package typings.plottable

import typings.plottable.animatorMod.IAnimator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("plottable/build/src/animators/easingAnimator", JSImport.Namespace)
@js.native
object easingAnimatorMod extends js.Object {
  
  /* keyof plottable.anon.Back */ /* Rewritten from type alias, can be one of: 
    - typings.plottable.plottableStrings.circle
    - typings.plottable.plottableStrings.linear
    - typings.plottable.plottableStrings.quad
    - typings.plottable.plottableStrings.quadIn
    - typings.plottable.plottableStrings.quadOut
    - typings.plottable.plottableStrings.quadInOut
    - typings.plottable.plottableStrings.cubic
    - typings.plottable.plottableStrings.cubicIn
    - typings.plottable.plottableStrings.cubicOut
    - typings.plottable.plottableStrings.cubicInOut
    - typings.plottable.plottableStrings.poly
    - typings.plottable.plottableStrings.polyIn
    - typings.plottable.plottableStrings.polyOut
    - typings.plottable.plottableStrings.polyInOut
    - typings.plottable.plottableStrings.sin
    - typings.plottable.plottableStrings.sinIn
    - typings.plottable.plottableStrings.sinOut
    - typings.plottable.plottableStrings.sinInOut
    - typings.plottable.plottableStrings.exp
    - typings.plottable.plottableStrings.expIn
    - typings.plottable.plottableStrings.expOut
    - typings.plottable.plottableStrings.expInOut
    - typings.plottable.plottableStrings.circleIn
    - typings.plottable.plottableStrings.circleOut
    - typings.plottable.plottableStrings.circleInOut
    - typings.plottable.plottableStrings.bounce
    - typings.plottable.plottableStrings.bounceIn
    - typings.plottable.plottableStrings.bounceOut
    - typings.plottable.plottableStrings.bounceInOut
    - typings.plottable.plottableStrings.back
    - typings.plottable.plottableStrings.backIn
    - typings.plottable.plottableStrings.backOut
    - typings.plottable.plottableStrings.backInOut
    - typings.plottable.plottableStrings.elastic
    - typings.plottable.plottableStrings.elasticIn
    - typings.plottable.plottableStrings.elasticOut
    - typings.plottable.plottableStrings.elasticInOut
  */
  trait EaseName extends js.Object
  @js.native
  object EaseName extends js.Object {
    
    var back: typings.plottable.plottableStrings.back = js.native
    
    var backIn: typings.plottable.plottableStrings.backIn = js.native
    
    var backInOut: typings.plottable.plottableStrings.backInOut = js.native
    
    var backOut: typings.plottable.plottableStrings.backOut = js.native
    
    var bounce: typings.plottable.plottableStrings.bounce = js.native
    
    var bounceIn: typings.plottable.plottableStrings.bounceIn = js.native
    
    var bounceInOut: typings.plottable.plottableStrings.bounceInOut = js.native
    
    var bounceOut: typings.plottable.plottableStrings.bounceOut = js.native
    
    var circle: typings.plottable.plottableStrings.circle = js.native
    
    var circleIn: typings.plottable.plottableStrings.circleIn = js.native
    
    var circleInOut: typings.plottable.plottableStrings.circleInOut = js.native
    
    var circleOut: typings.plottable.plottableStrings.circleOut = js.native
    
    var cubic: typings.plottable.plottableStrings.cubic = js.native
    
    var cubicIn: typings.plottable.plottableStrings.cubicIn = js.native
    
    var cubicInOut: typings.plottable.plottableStrings.cubicInOut = js.native
    
    var cubicOut: typings.plottable.plottableStrings.cubicOut = js.native
    
    var elastic: typings.plottable.plottableStrings.elastic = js.native
    
    var elasticIn: typings.plottable.plottableStrings.elasticIn = js.native
    
    var elasticInOut: typings.plottable.plottableStrings.elasticInOut = js.native
    
    var elasticOut: typings.plottable.plottableStrings.elasticOut = js.native
    
    var exp: typings.plottable.plottableStrings.exp = js.native
    
    var expIn: typings.plottable.plottableStrings.expIn = js.native
    
    var expInOut: typings.plottable.plottableStrings.expInOut = js.native
    
    var expOut: typings.plottable.plottableStrings.expOut = js.native
    
    var linear: typings.plottable.plottableStrings.linear = js.native
    
    var poly: typings.plottable.plottableStrings.poly = js.native
    
    var polyIn: typings.plottable.plottableStrings.polyIn = js.native
    
    var polyInOut: typings.plottable.plottableStrings.polyInOut = js.native
    
    var polyOut: typings.plottable.plottableStrings.polyOut = js.native
    
    var quad: typings.plottable.plottableStrings.quad = js.native
    
    var quadIn: typings.plottable.plottableStrings.quadIn = js.native
    
    var quadInOut: typings.plottable.plottableStrings.quadInOut = js.native
    
    var quadOut: typings.plottable.plottableStrings.quadOut = js.native
    
    var sin: typings.plottable.plottableStrings.sin = js.native
    
    var sinIn: typings.plottable.plottableStrings.sinIn = js.native
    
    var sinInOut: typings.plottable.plottableStrings.sinInOut = js.native
    
    var sinOut: typings.plottable.plottableStrings.sinOut = js.native
  }
  
  @js.native
  /**
    * Constructs the default animator
    *
    * @constructor
    */
  class Easing () extends IAnimator {
    
    var _easingMode: js.Any = js.native
    
    /**
      * Adjust the iterative delay, such that it takes into account the maxTotalDuration constraint
      */
    /* private */ def _getAdjustedIterativeDelay(numberOfSteps: js.Any): js.Any = js.native
    
    /* protected */ def _getEaseFactory(): EaseFn = js.native
    
    var _maxTotalDuration: js.Any = js.native
    
    var _startDelay: js.Any = js.native
    
    var _stepDelay: js.Any = js.native
    
    var _stepDuration: js.Any = js.native
    
    /**
      * Gets the current easing mode of the animation.
      *
      * @returns {string} the current easing mode.
      */
    def easingMode(): EaseName | EaseFn = js.native
    def easingMode(easingMode: EaseFn): this.type = js.native
    /**
      * Sets the easing mode of the animation.
      *
      * @param {string} easingMode The desired easing mode.
      * @returns {Easing} The calling Easing Animator.
      */
    def easingMode(easingMode: EaseName): this.type = js.native
    
    /**
      * Gets the maximum total animation duration constraint in milliseconds.
      *
      * If the animation time would exceed the specified time, the duration of each step
      * and the delay between each step will be reduced until the animation fits within
      * the specified time.
      *
      * @returns {number} The current maximum total animation duration.
      */
    def maxTotalDuration(): Double = js.native
    /**
      * Sets the maximum total animation duration constraint in miliseconds.
      *
      * If the animation time would exceed the specified time, the duration of each step
      * and the delay between each step will be reduced until the animation fits within
      * the specified time.
      *
      * @param {number} maxTotalDuration The maximum total animation duration in milliseconds.
      * @returns {Easing} The calling Easing Animator.
      */
    def maxTotalDuration(maxTotalDuration: Double): this.type = js.native
    
    /**
      * Gets the start delay of the animation in milliseconds.
      *
      * @returns {number} The current start delay.
      */
    def startDelay(): Double = js.native
    /**
      * Sets the start delay of the animation in milliseconds.
      *
      * @param {number} startDelay The start delay in milliseconds.
      * @returns {Easing} The calling Easing Animator.
      */
    def startDelay(startDelay: Double): this.type = js.native
    
    /**
      * Gets the maximum start delay between animation steps in milliseconds.
      *
      * @returns {number} The current maximum iterative delay.
      */
    def stepDelay(): Double = js.native
    /**
      * Sets the maximum start delay between animation steps in milliseconds.
      *
      * @param {number} stepDelay The maximum iterative delay in milliseconds.
      * @returns {Easing} The calling Easing Animator.
      */
    def stepDelay(stepDelay: Double): this.type = js.native
    
    /**
      * Gets the duration of one animation step in milliseconds.
      *
      * @returns {number} The current duration.
      */
    def stepDuration(): Double = js.native
    /**
      * Sets the duration of one animation step in milliseconds.
      *
      * @param {number} stepDuration The duration in milliseconds.
      * @returns {Easing} The calling Easing Animator.
      */
    def stepDuration(stepDuration: Double): this.type = js.native
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
  
  type EaseFn = js.Function1[/* normalizedTime */ Double, Double]
}
