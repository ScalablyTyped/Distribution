package typings.plottable

import typings.d3Transition.mod.Transition_
import typings.plottable.animatorMod.IAnimator
import typings.plottable.interfacesMod.AttributeToAppliedProjector
import typings.plottable.interfacesMod.SimpleSelection
import typings.plottable.plottableStrings.back
import typings.plottable.plottableStrings.backIn
import typings.plottable.plottableStrings.backInOut
import typings.plottable.plottableStrings.backOut
import typings.plottable.plottableStrings.bounce
import typings.plottable.plottableStrings.bounceIn
import typings.plottable.plottableStrings.bounceInOut
import typings.plottable.plottableStrings.bounceOut
import typings.plottable.plottableStrings.circle
import typings.plottable.plottableStrings.circleIn
import typings.plottable.plottableStrings.circleInOut
import typings.plottable.plottableStrings.circleOut
import typings.plottable.plottableStrings.cubic
import typings.plottable.plottableStrings.cubicIn
import typings.plottable.plottableStrings.cubicInOut
import typings.plottable.plottableStrings.cubicOut
import typings.plottable.plottableStrings.elastic
import typings.plottable.plottableStrings.elasticIn
import typings.plottable.plottableStrings.elasticInOut
import typings.plottable.plottableStrings.elasticOut
import typings.plottable.plottableStrings.exp
import typings.plottable.plottableStrings.expIn
import typings.plottable.plottableStrings.expInOut
import typings.plottable.plottableStrings.expOut
import typings.plottable.plottableStrings.linear
import typings.plottable.plottableStrings.poly
import typings.plottable.plottableStrings.polyIn
import typings.plottable.plottableStrings.polyInOut
import typings.plottable.plottableStrings.polyOut
import typings.plottable.plottableStrings.quad
import typings.plottable.plottableStrings.quadIn
import typings.plottable.plottableStrings.quadInOut
import typings.plottable.plottableStrings.quadOut
import typings.plottable.plottableStrings.sin
import typings.plottable.plottableStrings.sinIn
import typings.plottable.plottableStrings.sinInOut
import typings.plottable.plottableStrings.sinOut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object easingAnimatorMod {
  
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
  trait EaseName extends StObject
  object EaseName {
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.back")
    @js.native
    def back: typings.plottable.plottableStrings.back = js.native
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.backIn")
    @js.native
    def backIn: typings.plottable.plottableStrings.backIn = js.native
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.backInOut")
    @js.native
    def backInOut: typings.plottable.plottableStrings.backInOut = js.native
    @scala.inline
    def backInOut_=(x: backInOut): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("backInOut")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def backIn_=(x: backIn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("backIn")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.backOut")
    @js.native
    def backOut: typings.plottable.plottableStrings.backOut = js.native
    @scala.inline
    def backOut_=(x: backOut): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("backOut")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def back_=(x: back): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("back")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.bounce")
    @js.native
    def bounce: typings.plottable.plottableStrings.bounce = js.native
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.bounceIn")
    @js.native
    def bounceIn: typings.plottable.plottableStrings.bounceIn = js.native
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.bounceInOut")
    @js.native
    def bounceInOut: typings.plottable.plottableStrings.bounceInOut = js.native
    @scala.inline
    def bounceInOut_=(x: bounceInOut): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bounceInOut")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def bounceIn_=(x: bounceIn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bounceIn")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.bounceOut")
    @js.native
    def bounceOut: typings.plottable.plottableStrings.bounceOut = js.native
    @scala.inline
    def bounceOut_=(x: bounceOut): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bounceOut")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def bounce_=(x: bounce): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bounce")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.circle")
    @js.native
    def circle: typings.plottable.plottableStrings.circle = js.native
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.circleIn")
    @js.native
    def circleIn: typings.plottable.plottableStrings.circleIn = js.native
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.circleInOut")
    @js.native
    def circleInOut: typings.plottable.plottableStrings.circleInOut = js.native
    @scala.inline
    def circleInOut_=(x: circleInOut): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("circleInOut")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def circleIn_=(x: circleIn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("circleIn")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.circleOut")
    @js.native
    def circleOut: typings.plottable.plottableStrings.circleOut = js.native
    @scala.inline
    def circleOut_=(x: circleOut): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("circleOut")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def circle_=(x: circle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("circle")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.cubic")
    @js.native
    def cubic: typings.plottable.plottableStrings.cubic = js.native
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.cubicIn")
    @js.native
    def cubicIn: typings.plottable.plottableStrings.cubicIn = js.native
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.cubicInOut")
    @js.native
    def cubicInOut: typings.plottable.plottableStrings.cubicInOut = js.native
    @scala.inline
    def cubicInOut_=(x: cubicInOut): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cubicInOut")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def cubicIn_=(x: cubicIn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cubicIn")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.cubicOut")
    @js.native
    def cubicOut: typings.plottable.plottableStrings.cubicOut = js.native
    @scala.inline
    def cubicOut_=(x: cubicOut): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cubicOut")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def cubic_=(x: cubic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cubic")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.elastic")
    @js.native
    def elastic: typings.plottable.plottableStrings.elastic = js.native
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.elasticIn")
    @js.native
    def elasticIn: typings.plottable.plottableStrings.elasticIn = js.native
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.elasticInOut")
    @js.native
    def elasticInOut: typings.plottable.plottableStrings.elasticInOut = js.native
    @scala.inline
    def elasticInOut_=(x: elasticInOut): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("elasticInOut")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def elasticIn_=(x: elasticIn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("elasticIn")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.elasticOut")
    @js.native
    def elasticOut: typings.plottable.plottableStrings.elasticOut = js.native
    @scala.inline
    def elasticOut_=(x: elasticOut): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("elasticOut")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def elastic_=(x: elastic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("elastic")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.exp")
    @js.native
    def exp: typings.plottable.plottableStrings.exp = js.native
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.expIn")
    @js.native
    def expIn: typings.plottable.plottableStrings.expIn = js.native
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.expInOut")
    @js.native
    def expInOut: typings.plottable.plottableStrings.expInOut = js.native
    @scala.inline
    def expInOut_=(x: expInOut): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("expInOut")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def expIn_=(x: expIn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("expIn")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.expOut")
    @js.native
    def expOut: typings.plottable.plottableStrings.expOut = js.native
    @scala.inline
    def expOut_=(x: expOut): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("expOut")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def exp_=(x: exp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exp")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.linear")
    @js.native
    def linear: typings.plottable.plottableStrings.linear = js.native
    @scala.inline
    def linear_=(x: linear): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("linear")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.poly")
    @js.native
    def poly: typings.plottable.plottableStrings.poly = js.native
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.polyIn")
    @js.native
    def polyIn: typings.plottable.plottableStrings.polyIn = js.native
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.polyInOut")
    @js.native
    def polyInOut: typings.plottable.plottableStrings.polyInOut = js.native
    @scala.inline
    def polyInOut_=(x: polyInOut): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("polyInOut")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def polyIn_=(x: polyIn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("polyIn")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.polyOut")
    @js.native
    def polyOut: typings.plottable.plottableStrings.polyOut = js.native
    @scala.inline
    def polyOut_=(x: polyOut): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("polyOut")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def poly_=(x: poly): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("poly")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.quad")
    @js.native
    def quad: typings.plottable.plottableStrings.quad = js.native
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.quadIn")
    @js.native
    def quadIn: typings.plottable.plottableStrings.quadIn = js.native
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.quadInOut")
    @js.native
    def quadInOut: typings.plottable.plottableStrings.quadInOut = js.native
    @scala.inline
    def quadInOut_=(x: quadInOut): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("quadInOut")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def quadIn_=(x: quadIn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("quadIn")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.quadOut")
    @js.native
    def quadOut: typings.plottable.plottableStrings.quadOut = js.native
    @scala.inline
    def quadOut_=(x: quadOut): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("quadOut")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def quad_=(x: quad): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("quad")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.sin")
    @js.native
    def sin: typings.plottable.plottableStrings.sin = js.native
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.sinIn")
    @js.native
    def sinIn: typings.plottable.plottableStrings.sinIn = js.native
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.sinInOut")
    @js.native
    def sinInOut: typings.plottable.plottableStrings.sinInOut = js.native
    @scala.inline
    def sinInOut_=(x: sinInOut): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sinInOut")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def sinIn_=(x: sinIn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sinIn")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/animators/easingAnimator", "EaseName.sinOut")
    @js.native
    def sinOut: typings.plottable.plottableStrings.sinOut = js.native
    @scala.inline
    def sinOut_=(x: sinOut): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sinOut")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def sin_=(x: sin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sin")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("plottable/build/src/animators/easingAnimator", "Easing")
  @js.native
  /**
    * Constructs the default animator
    *
    * @constructor
    */
  class Easing ()
    extends StObject
       with IAnimator {
    
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
      * Applies the supplied attributes to a d3.Selection with some animation.
      *
      * @param {d3.Selection} selection The update selection or transition selection that we wish to animate.
      * @param {AttributeToAppliedProjector} attrToAppliedProjector The set of
      *     AppliedProjectors that we will use to set attributes on the selection.
      * @return {any} Animators should return the selection or
      *     transition object so that plots may chain the transitions between
      *     animators.
      */
    /* CompleteClass */
    override def animate(selection: SimpleSelection[js.Any], attrToAppliedProjector: AttributeToAppliedProjector): SimpleSelection[js.Any] | (Transition_[js.Any, js.Any, js.Any, js.Any]) = js.native
    
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
    
    /**
      * Given the number of elements, return the total time the animation requires
      *
      * @param {number} numberofIterations The number of elements that will be drawn
      * @returns {number}
      */
    /* CompleteClass */
    override def totalTime(numberOfIterations: Double): Double = js.native
  }
  /* static members */
  object Easing {
    
    @JSImport("plottable/build/src/animators/easingAnimator", "Easing")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The default easing of the animation
      */
    @JSImport("plottable/build/src/animators/easingAnimator", "Easing._DEFAULT_EASING_MODE")
    @js.native
    def _DEFAULT_EASING_MODE: js.Any = js.native
    @scala.inline
    def _DEFAULT_EASING_MODE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DEFAULT_EASING_MODE")(x.asInstanceOf[js.Any])
    
    /**
      * The default maximum start delay between each step of an animation
      */
    @JSImport("plottable/build/src/animators/easingAnimator", "Easing._DEFAULT_ITERATIVE_DELAY_MILLISECONDS")
    @js.native
    def _DEFAULT_ITERATIVE_DELAY_MILLISECONDS: js.Any = js.native
    @scala.inline
    def _DEFAULT_ITERATIVE_DELAY_MILLISECONDS_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DEFAULT_ITERATIVE_DELAY_MILLISECONDS")(x.asInstanceOf[js.Any])
    
    /**
      * The default maximum total animation duration
      */
    @JSImport("plottable/build/src/animators/easingAnimator", "Easing._DEFAULT_MAX_TOTAL_DURATION_MILLISECONDS")
    @js.native
    def _DEFAULT_MAX_TOTAL_DURATION_MILLISECONDS: js.Any = js.native
    @scala.inline
    def _DEFAULT_MAX_TOTAL_DURATION_MILLISECONDS_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DEFAULT_MAX_TOTAL_DURATION_MILLISECONDS")(x.asInstanceOf[js.Any])
    
    /**
      * The default starting delay of the animation in milliseconds
      */
    @JSImport("plottable/build/src/animators/easingAnimator", "Easing._DEFAULT_START_DELAY_MILLISECONDS")
    @js.native
    def _DEFAULT_START_DELAY_MILLISECONDS: js.Any = js.native
    @scala.inline
    def _DEFAULT_START_DELAY_MILLISECONDS_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DEFAULT_START_DELAY_MILLISECONDS")(x.asInstanceOf[js.Any])
    
    /**
      * The default duration of one animation step in milliseconds
      */
    @JSImport("plottable/build/src/animators/easingAnimator", "Easing._DEFAULT_STEP_DURATION_MILLISECONDS")
    @js.native
    def _DEFAULT_STEP_DURATION_MILLISECONDS: js.Any = js.native
    @scala.inline
    def _DEFAULT_STEP_DURATION_MILLISECONDS_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DEFAULT_STEP_DURATION_MILLISECONDS")(x.asInstanceOf[js.Any])
  }
  
  type EaseFn = js.Function1[/* normalizedTime */ Double, Double]
}
