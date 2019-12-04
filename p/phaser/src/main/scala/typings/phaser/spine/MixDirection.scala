package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MixDirection extends js.Object

@JSGlobal("spine.MixDirection")
@js.native
object MixDirection extends js.Object {
  @js.native
  sealed trait mixIn extends MixDirection
  
  @js.native
  sealed trait mixOut extends MixDirection
  
  /* 0 */ val mixIn: typings.phaser.spine.MixDirection.mixIn with Double = js.native
  /* 1 */ val mixOut: typings.phaser.spine.MixDirection.mixOut with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MixDirection with Double] = js.native
}

