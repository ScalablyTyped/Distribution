package typings
package pixiDashSpineLib.PIXINs.spineNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MixPose extends js.Object

@JSGlobal("PIXI.spine.core.MixPose")
@js.native
object MixPose extends js.Object {
  @js.native
  sealed trait current
    extends pixiDashSpineLib.PIXINs.spineNs.coreNs.MixPose
  
  @js.native
  sealed trait currentLayered
    extends pixiDashSpineLib.PIXINs.spineNs.coreNs.MixPose
  
  @js.native
  sealed trait setup
    extends pixiDashSpineLib.PIXINs.spineNs.coreNs.MixPose
  
  /* 1 */ val current: current with scala.Double = js.native
  /* 2 */ val currentLayered: currentLayered with scala.Double = js.native
  /* 0 */ val setup: setup with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[pixiDashSpineLib.PIXINs.spineNs.coreNs.MixPose with scala.Double] = js.native
}

