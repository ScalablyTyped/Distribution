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
  
}

