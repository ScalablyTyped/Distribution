package typings
package plottableLib.buildSrcAnimatorsAnimatorMod

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
  def animate(
    selection: plottableLib.buildSrcCoreInterfacesMod.SimpleSelection[_],
    attrToAppliedProjector: plottableLib.buildSrcCoreInterfacesMod.AttributeToAppliedProjector
  ): plottableLib.buildSrcCoreInterfacesMod.SimpleSelection[_] | (d3DashTransitionLib.d3DashTransitionMod.Transition[_, _, _, _])
  /**
    * Given the number of elements, return the total time the animation requires
    *
    * @param {number} numberofIterations The number of elements that will be drawn
    * @returns {number}
    */
  def totalTime(numberOfIterations: scala.Double): scala.Double
}

object IAnimator {
  @scala.inline
  def apply(
    animate: js.Function2[
      plottableLib.buildSrcCoreInterfacesMod.SimpleSelection[_], 
      plottableLib.buildSrcCoreInterfacesMod.AttributeToAppliedProjector, 
      plottableLib.buildSrcCoreInterfacesMod.SimpleSelection[_] | (d3DashTransitionLib.d3DashTransitionMod.Transition[_, _, _, _])
    ],
    totalTime: js.Function1[scala.Double, scala.Double]
  ): IAnimator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("animate")(animate)
    __obj.updateDynamic("totalTime")(totalTime)
    __obj.asInstanceOf[IAnimator]
  }
}

