package typings.plottable.buildSrcDrawersDrawStepMod

import typings.plottable.buildSrcAnimatorsAnimatorMod.IAnimator
import typings.plottable.buildSrcCoreInterfacesMod.AttributeToProjector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawStep extends js.Object {
  var animator: IAnimator
  var attrToProjector: AttributeToProjector
}

object DrawStep {
  @scala.inline
  def apply(animator: IAnimator, attrToProjector: AttributeToProjector): DrawStep = {
    val __obj = js.Dynamic.literal(animator = animator, attrToProjector = attrToProjector)
  
    __obj.asInstanceOf[DrawStep]
  }
}

