package typings.popmotion

import typings.popmotion.libActionMod.Action
import typings.popmotion.libAnimationsTimelineTypesMod.Instruction
import typings.popmotion.libAnimationsTweenTypesMod.TweenProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion/lib/animations/timeline", JSImport.Namespace)
@js.native
object libAnimationsTimelineMod extends js.Object {
  def default(instructions: js.Array[Instruction]): Action = js.native
  def default(instructions: js.Array[Instruction], hasDurationElapsedEaseLoopFlipYoyo: TweenProps): Action = js.native
}

