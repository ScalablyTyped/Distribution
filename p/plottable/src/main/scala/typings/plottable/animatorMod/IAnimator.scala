package typings.plottable.animatorMod

import typings.d3Transition.mod.Transition_
import typings.plottable.interfacesMod.AttributeToAppliedProjector
import typings.plottable.interfacesMod.SimpleSelection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
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
  implicit class IAnimatorOps[Self <: IAnimator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnimate(
      value: (SimpleSelection[_], AttributeToAppliedProjector) => SimpleSelection[_] | (Transition_[_, _, _, _])
    ): Self = this.set("animate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTotalTime(value: Double => Double): Self = this.set("totalTime", js.Any.fromFunction1(value))
  }
}
