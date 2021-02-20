package typings.plottable

import typings.d3Transition.mod.Transition_
import typings.plottable.interfacesMod.AttributeToAppliedProjector
import typings.plottable.interfacesMod.SimpleSelection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animatorMod {
  
  @js.native
  trait IAnimator extends StObject {
    
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
    def animate(selection: SimpleSelection[_], attrToAppliedProjector: AttributeToAppliedProjector): SimpleSelection[_] | (Transition_[_, _, _, _]) = js.native
    
    /**
      * Given the number of elements, return the total time the animation requires
      *
      * @param {number} numberofIterations The number of elements that will be drawn
      * @returns {number}
      */
    def totalTime(numberOfIterations: Double): Double = js.native
  }
  object IAnimator {
    
    @scala.inline
    def apply(
      animate: (SimpleSelection[_], AttributeToAppliedProjector) => SimpleSelection[_] | (Transition_[_, _, _, _]),
      totalTime: Double => Double
    ): IAnimator = {
      val __obj = js.Dynamic.literal(animate = js.Any.fromFunction2(animate), totalTime = js.Any.fromFunction1(totalTime))
      __obj.asInstanceOf[IAnimator]
    }
    
    @scala.inline
    implicit class IAnimatorMutableBuilder[Self <: IAnimator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimate(
        value: (SimpleSelection[_], AttributeToAppliedProjector) => SimpleSelection[_] | (Transition_[_, _, _, _])
      ): Self = StObject.set(x, "animate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTotalTime(value: Double => Double): Self = StObject.set(x, "totalTime", js.Any.fromFunction1(value))
    }
  }
}
