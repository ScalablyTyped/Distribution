package typings
package pixiDashSpineLib.PIXINs.spineNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SpacingMode extends js.Object

@JSGlobal("PIXI.spine.core.SpacingMode")
@js.native
object SpacingMode extends js.Object {
  @js.native
  sealed trait Fixed
    extends pixiDashSpineLib.PIXINs.spineNs.coreNs.SpacingMode
  
  @js.native
  sealed trait Length
    extends pixiDashSpineLib.PIXINs.spineNs.coreNs.SpacingMode
  
  @js.native
  sealed trait Percent
    extends pixiDashSpineLib.PIXINs.spineNs.coreNs.SpacingMode
  
  /* 1 */ val Fixed: Fixed with scala.Double = js.native
  /* 0 */ val Length: Length with scala.Double = js.native
  /* 2 */ val Percent: Percent with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[pixiDashSpineLib.PIXINs.spineNs.coreNs.SpacingMode with scala.Double] = js.native
}

