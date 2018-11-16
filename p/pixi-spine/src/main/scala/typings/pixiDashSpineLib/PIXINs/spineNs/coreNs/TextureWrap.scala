package typings
package pixiDashSpineLib.PIXINs.spineNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextureWrap extends js.Object

@JSGlobal("PIXI.spine.core.TextureWrap")
@js.native
object TextureWrap extends js.Object {
  @js.native
  sealed trait ClampToEdge
    extends pixiDashSpineLib.PIXINs.spineNs.coreNs.TextureWrap
  
  @js.native
  sealed trait MirroredRepeat
    extends pixiDashSpineLib.PIXINs.spineNs.coreNs.TextureWrap
  
  @js.native
  sealed trait Repeat
    extends pixiDashSpineLib.PIXINs.spineNs.coreNs.TextureWrap
  
  /* 33071 */ val ClampToEdge: ClampToEdge with scala.Double = js.native
  /* 33648 */ val MirroredRepeat: MirroredRepeat with scala.Double = js.native
  /* 10497 */ val Repeat: Repeat with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[pixiDashSpineLib.PIXINs.spineNs.coreNs.TextureWrap with scala.Double] = js.native
}

