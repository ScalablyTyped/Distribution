package typings
package pixiDashSpineLib.PIXINs.spineNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MixBlend extends js.Object

@JSGlobal("PIXI.spine.core.MixBlend")
@js.native
object MixBlend extends js.Object {
  @js.native
  sealed trait add
    extends pixiDashSpineLib.PIXINs.spineNs.coreNs.MixBlend
  
  @js.native
  sealed trait first
    extends pixiDashSpineLib.PIXINs.spineNs.coreNs.MixBlend
  
  @js.native
  sealed trait replace
    extends pixiDashSpineLib.PIXINs.spineNs.coreNs.MixBlend
  
  @js.native
  sealed trait setup
    extends pixiDashSpineLib.PIXINs.spineNs.coreNs.MixBlend
  
  /* 3 */ val add: add with scala.Double = js.native
  /* 1 */ val first: first with scala.Double = js.native
  /* 2 */ val replace: replace with scala.Double = js.native
  /* 0 */ val setup: setup with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[pixiDashSpineLib.PIXINs.spineNs.coreNs.MixBlend with scala.Double] = js.native
}

