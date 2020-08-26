package typings.phaser.global.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.AnimationState")
@js.native
class AnimationState protected ()
  extends typings.phaser.spine.AnimationState {
  def this(data: typings.phaser.spine.AnimationStateData) = this()
}

/* static members */
@JSGlobal("spine.AnimationState")
@js.native
object AnimationState extends js.Object {
  var FIRST: Double = js.native
  var HOLD: Double = js.native
  var HOLD_MIX: Double = js.native
  var NOT_LAST: Double = js.native
  var SUBSEQUENT: Double = js.native
  var emptyAnimation: typings.phaser.spine.Animation = js.native
}

