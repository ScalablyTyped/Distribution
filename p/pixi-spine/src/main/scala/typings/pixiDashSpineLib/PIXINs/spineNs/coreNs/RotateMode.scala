package typings
package pixiDashSpineLib.PIXINs.spineNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RotateMode extends js.Object

@JSGlobal("PIXI.spine.core.RotateMode")
@js.native
object RotateMode extends js.Object {
  @js.native
  sealed trait Chain
    extends pixiDashSpineLib.PIXINs.spineNs.coreNs.RotateMode
  
  @js.native
  sealed trait ChainScale
    extends pixiDashSpineLib.PIXINs.spineNs.coreNs.RotateMode
  
  @js.native
  sealed trait Tangent
    extends pixiDashSpineLib.PIXINs.spineNs.coreNs.RotateMode
  
  /* 1 */ val Chain: Chain with scala.Double = js.native
  /* 2 */ val ChainScale: ChainScale with scala.Double = js.native
  /* 0 */ val Tangent: Tangent with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[pixiDashSpineLib.PIXINs.spineNs.coreNs.RotateMode with scala.Double] = js.native
}

