package typings
package pixiDashSpineLib.PIXINs.spineNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MixDirection extends js.Object

@JSGlobal("PIXI.spine.core.MixDirection")
@js.native
object MixDirection extends js.Object {
  @js.native
  sealed trait in
    extends pixiDashSpineLib.PIXINs.spineNs.coreNs.MixDirection
  
  @js.native
  sealed trait out
    extends pixiDashSpineLib.PIXINs.spineNs.coreNs.MixDirection
  
  /* 0 */ val in: in with scala.Double = js.native
  /* 1 */ val out: out with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[pixiDashSpineLib.PIXINs.spineNs.coreNs.MixDirection with scala.Double] = js.native
}

