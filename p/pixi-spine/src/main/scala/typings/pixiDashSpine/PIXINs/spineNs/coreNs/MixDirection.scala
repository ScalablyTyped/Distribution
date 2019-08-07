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
  sealed trait mixIn extends MixDirection
  
  @js.native
  sealed trait mixOut extends MixDirection
  
  /* 0 */ val mixIn: typings.pixiDashSpine.PIXINs.spineNs.coreNs.MixDirection.mixIn with Double = js.native
  /* 1 */ val mixOut: typings.pixiDashSpine.PIXINs.spineNs.coreNs.MixDirection.mixOut with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MixDirection with Double] = js.native
}

