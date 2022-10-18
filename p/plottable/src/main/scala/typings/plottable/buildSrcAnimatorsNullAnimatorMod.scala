package typings.plottable

import typings.d3Transition.mod.Transition_
import typings.plottable.buildSrcAnimatorsAnimatorMod.IAnimator
import typings.plottable.buildSrcCoreInterfacesMod.AttributeToAppliedProjector
import typings.plottable.buildSrcCoreInterfacesMod.SimpleSelection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcAnimatorsNullAnimatorMod {
  
  @JSImport("plottable/build/src/animators/nullAnimator", "Null")
  @js.native
  open class Null ()
    extends StObject
       with IAnimator {
    
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
    override def animate(selection: SimpleSelection[Any], attrToAppliedProjector: AttributeToAppliedProjector): SimpleSelection[Any] | (Transition_[Any, Any, Any, Any]) = js.native
    
    /**
      * Given the number of elements, return the total time the animation requires
      *
      * @param {number} numberofIterations The number of elements that will be drawn
      * @returns {number}
      */
    /* CompleteClass */
    override def totalTime(numberOfIterations: Double): Double = js.native
    def totalTime(selection: Any): Double = js.native
  }
}
