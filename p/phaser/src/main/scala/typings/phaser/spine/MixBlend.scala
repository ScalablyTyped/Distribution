package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MixBlend extends js.Object

@JSGlobal("spine.MixBlend")
@js.native
object MixBlend extends js.Object {
  @js.native
  sealed trait add extends MixBlend
  
  @js.native
  sealed trait first extends MixBlend
  
  @js.native
  sealed trait replace extends MixBlend
  
  @js.native
  sealed trait setup extends MixBlend
  
  /* 3 */ val add: typings.phaser.spine.MixBlend.add with Double = js.native
  /* 1 */ val first: typings.phaser.spine.MixBlend.first with Double = js.native
  /* 2 */ val replace: typings.phaser.spine.MixBlend.replace with Double = js.native
  /* 0 */ val setup: typings.phaser.spine.MixBlend.setup with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MixBlend with Double] = js.native
}

