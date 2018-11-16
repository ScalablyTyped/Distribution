package typings
package plottableLib.buildSrcAnimatorsNullAnimatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/animators/nullAnimator", "Null")
@js.native
class Null ()
  extends plottableLib.buildSrcAnimatorsAnimatorMod.IAnimator {
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
  override def animate(
    selection: plottableLib.buildSrcCoreInterfacesMod.SimpleSelection[_],
    attrToAppliedProjector: plottableLib.buildSrcCoreInterfacesMod.AttributeToAppliedProjector
  ): plottableLib.buildSrcCoreInterfacesMod.SimpleSelection[_] | (d3DashTransitionLib.d3DashTransitionMod.Transition[_, _, _, _]) = js.native
  /**
       * Given the number of elements, return the total time the animation requires
       *
       * @param {number} numberofIterations The number of elements that will be drawn
       * @returns {number}
       */
  /* CompleteClass */
  override def totalTime(numberOfIterations: scala.Double): scala.Double = js.native
  def totalTime(selection: js.Any): scala.Double = js.native
}

