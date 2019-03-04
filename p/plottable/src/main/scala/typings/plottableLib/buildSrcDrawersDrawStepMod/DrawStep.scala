package typings
package plottableLib.buildSrcDrawersDrawStepMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawStep extends js.Object {
  var animator: plottableLib.buildSrcAnimatorsAnimatorMod.IAnimator
  var attrToProjector: plottableLib.buildSrcCoreInterfacesMod.AttributeToProjector
}

object DrawStep {
  @scala.inline
  def apply(
    animator: plottableLib.buildSrcAnimatorsAnimatorMod.IAnimator,
    attrToProjector: plottableLib.buildSrcCoreInterfacesMod.AttributeToProjector
  ): DrawStep = {
    val __obj = js.Dynamic.literal(animator = animator, attrToProjector = attrToProjector)
  
    __obj.asInstanceOf[DrawStep]
  }
}

