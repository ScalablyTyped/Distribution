package typings
package plottableLib.buildSrcDrawersDrawStepMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppliedDrawStep extends js.Object {
  var animator: plottableLib.buildSrcAnimatorsAnimatorMod.IAnimator
  var attrToAppliedProjector: plottableLib.buildSrcCoreInterfacesMod.AttributeToAppliedProjector
}

object AppliedDrawStep {
  @scala.inline
  def apply(
    animator: plottableLib.buildSrcAnimatorsAnimatorMod.IAnimator,
    attrToAppliedProjector: plottableLib.buildSrcCoreInterfacesMod.AttributeToAppliedProjector
  ): AppliedDrawStep = {
    val __obj = js.Dynamic.literal(animator = animator, attrToAppliedProjector = attrToAppliedProjector)
  
    __obj.asInstanceOf[AppliedDrawStep]
  }
}

