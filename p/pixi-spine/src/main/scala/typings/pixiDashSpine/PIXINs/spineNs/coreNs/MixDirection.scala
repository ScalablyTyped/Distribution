package typings.pixiDashSpine.PIXINs.spineNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MixDirection extends js.Object

@JSGlobal("PIXI.spine.core.MixDirection")
@js.native
object MixDirection extends js.Object {
  @js.native
  sealed trait in extends MixDirection
  
  @js.native
  sealed trait out extends MixDirection
  
  /* 0 */ val in: typings.pixiDashSpine.PIXINs.spineNs.coreNs.MixDirection.in with Double = js.native
  /* 1 */ val out: typings.pixiDashSpine.PIXINs.spineNs.coreNs.MixDirection.out with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MixDirection with Double] = js.native
}

