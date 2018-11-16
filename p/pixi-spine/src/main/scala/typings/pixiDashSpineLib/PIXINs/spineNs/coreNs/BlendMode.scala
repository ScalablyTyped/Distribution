package typings
package pixiDashSpineLib.PIXINs.spineNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BlendMode extends js.Object

@JSGlobal("PIXI.spine.core.BlendMode")
@js.native
object BlendMode extends js.Object {
  @js.native
  sealed trait Additive
    extends pixiDashSpineLib.PIXINs.spineNs.coreNs.BlendMode
  
  @js.native
  sealed trait Multiply
    extends pixiDashSpineLib.PIXINs.spineNs.coreNs.BlendMode
  
  @js.native
  sealed trait Normal
    extends pixiDashSpineLib.PIXINs.spineNs.coreNs.BlendMode
  
  @js.native
  sealed trait Screen
    extends pixiDashSpineLib.PIXINs.spineNs.coreNs.BlendMode
  
  /* 1 */ val Additive: Additive with scala.Double = js.native
  /* 2 */ val Multiply: Multiply with scala.Double = js.native
  /* 0 */ val Normal: Normal with scala.Double = js.native
  /* 3 */ val Screen: Screen with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[pixiDashSpineLib.PIXINs.spineNs.coreNs.BlendMode with scala.Double] = js.native
}

