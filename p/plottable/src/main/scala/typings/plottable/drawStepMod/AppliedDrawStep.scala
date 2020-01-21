package typings.plottable.drawStepMod

import typings.plottable.animatorMod.IAnimator
import typings.plottable.interfacesMod.AttributeToAppliedProjector
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
    val __obj = js.Dynamic.literal(animator = animator.asInstanceOf[js.Any], attrToAppliedProjector = attrToAppliedProjector.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AppliedDrawStep]
  }
}

