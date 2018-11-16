package typings
package pixiDashSpineLib.PIXINs.spineNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PositionMode extends js.Object

@JSGlobal("PIXI.spine.core.PositionMode")
@js.native
object PositionMode extends js.Object {
  @js.native
  sealed trait Fixed
    extends pixiDashSpineLib.PIXINs.spineNs.coreNs.PositionMode
  
  @js.native
  sealed trait Percent
    extends pixiDashSpineLib.PIXINs.spineNs.coreNs.PositionMode
  
  /* 0 */ val Fixed: Fixed with scala.Double = js.native
  /* 1 */ val Percent: Percent with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[pixiDashSpineLib.PIXINs.spineNs.coreNs.PositionMode with scala.Double] = js.native
}

