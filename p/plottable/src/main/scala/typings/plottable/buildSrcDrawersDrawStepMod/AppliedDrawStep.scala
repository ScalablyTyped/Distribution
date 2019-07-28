package typings.plottable.buildSrcDrawersDrawStepMod

import typings.plottable.buildSrcAnimatorsAnimatorMod.IAnimator
import typings.plottable.buildSrcCoreInterfacesMod.AttributeToAppliedProjector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppliedDrawStep extends js.Object {
  var animator: IAnimator
  var attrToAppliedProjector: AttributeToAppliedProjector
}

object AppliedDrawStep {
  @scala.inline
  def apply(animator: IAnimator, attrToAppliedProjector: AttributeToAppliedProjector): AppliedDrawStep = {
    val __obj = js.Dynamic.literal(animator = animator, attrToAppliedProjector = attrToAppliedProjector)
  
    __obj.asInstanceOf[AppliedDrawStep]
  }
}

