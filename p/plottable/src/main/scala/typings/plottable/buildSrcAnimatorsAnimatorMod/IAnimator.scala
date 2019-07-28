package typings.plottable.buildSrcAnimatorsAnimatorMod

import typings.d3DashTransition.d3DashTransitionMod.Transition
import typings.plottable.buildSrcCoreInterfacesMod.AttributeToAppliedProjector
import typings.plottable.buildSrcCoreInterfacesMod.SimpleSelection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAnimator extends js.Object {
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
  def animate(selection: SimpleSelection[_], attrToAppliedProjector: AttributeToAppliedProjector): SimpleSelection[_] | (Transition[_, _, _, _])
  /**
    * Given the number of elements, return the total time the animation requires
    *
    * @param {number} numberofIterations The number of elements that will be drawn
    * @returns {number}
    */
  def totalTime(numberOfIterations: Double): Double
}

object IAnimator {
  @scala.inline
  def apply(
    animate: (SimpleSelection[_], AttributeToAppliedProjector) => SimpleSelection[_] | (Transition[_, _, _, _]),
    totalTime: Double => Double
  ): IAnimator = {
    val __obj = js.Dynamic.literal(animate = js.Any.fromFunction2(animate), totalTime = js.Any.fromFunction1(totalTime))
  
    __obj.asInstanceOf[IAnimator]
  }
}

