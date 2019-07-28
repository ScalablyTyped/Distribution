package typings.pixiDashSpine.PIXINs.spineNs.coreNs

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
  
  /* 3 */ val add: typings.pixiDashSpine.PIXINs.spineNs.coreNs.MixBlend.add with Double = js.native
  /* 1 */ val first: typings.pixiDashSpine.PIXINs.spineNs.coreNs.MixBlend.first with Double = js.native
  /* 2 */ val replace: typings.pixiDashSpine.PIXINs.spineNs.coreNs.MixBlend.replace with Double = js.native
  /* 0 */ val setup: typings.pixiDashSpine.PIXINs.spineNs.coreNs.MixBlend.setup with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MixBlend with Double] = js.native
}

