package typings.popmotion.mod

import typings.popmotion.actionMod.Action
import typings.popmotion.timelineTypesMod.Instruction
import typings.popmotion.tweenTypesMod.TweenInterface
import typings.popmotion.tweenTypesMod.TweenProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion", "timeline")
@js.native
object timeline extends js.Object {
  def apply[V](instructions: js.Array[Instruction]): Action[TweenInterface[V]] = js.native
  def apply[V](instructions: js.Array[Instruction], hasDurationElapsedEaseLoopFlipYoyo: TweenProps): Action[TweenInterface[V]] = js.native
}

