package typings.pixiDashSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MixBlend extends js.Object

@JSGlobal("PIXI.spine.core.MixBlend")
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
  
  /* 3 */ val add: typings.pixiDashSpine.PIXI.spine.core.MixBlend.add with Double = js.native
  /* 1 */ val first: typings.pixiDashSpine.PIXI.spine.core.MixBlend.first with Double = js.native
  /* 2 */ val replace: typings.pixiDashSpine.PIXI.spine.core.MixBlend.replace with Double = js.native
  /* 0 */ val setup: typings.pixiDashSpine.PIXI.spine.core.MixBlend.setup with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MixBlend with Double] = js.native
}

