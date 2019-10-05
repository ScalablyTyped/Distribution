package typings.pixiDashSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextureWrap extends js.Object

@JSGlobal("PIXI.spine.core.TextureWrap")
@js.native
object TextureWrap extends js.Object {
  @js.native
  sealed trait ClampToEdge extends TextureWrap
  
  @js.native
  sealed trait MirroredRepeat extends TextureWrap
  
  @js.native
  sealed trait Repeat extends TextureWrap
  
  /* 33071 */ val ClampToEdge: typings.pixiDashSpine.PIXI.spine.core.TextureWrap.ClampToEdge with Double = js.native
  /* 33648 */ val MirroredRepeat: typings.pixiDashSpine.PIXI.spine.core.TextureWrap.MirroredRepeat with Double = js.native
  /* 10497 */ val Repeat: typings.pixiDashSpine.PIXI.spine.core.TextureWrap.Repeat with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextureWrap with Double] = js.native
}

