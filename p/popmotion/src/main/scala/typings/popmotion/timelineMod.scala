package typings.popmotion

import typings.popmotion.actionMod.Action
import typings.popmotion.timelineTypesMod.Instruction
import typings.popmotion.tweenTypesMod.TweenInterface
import typings.popmotion.tweenTypesMod.TweenProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion/lib/animations/timeline", JSImport.Namespace)
@js.native
object timelineMod extends js.Object {
  def default[V](instructions: js.Array[Instruction]): Action[TweenInterface[V]] = js.native
  def default[V](instructions: js.Array[Instruction], hasDurationElapsedEaseLoopFlipYoyo: TweenProps): Action[TweenInterface[V]] = js.native
}

