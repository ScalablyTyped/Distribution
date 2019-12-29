package typings.pixiDashSpine.PIXI.spine.core

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextureWrap with Double] = js.native
  /* 33071 */ @js.native
  object ClampToEdge extends TopLevel[ClampToEdge with Double]
  
  /* 33648 */ @js.native
  object MirroredRepeat extends TopLevel[MirroredRepeat with Double]
  
  /* 10497 */ @js.native
  object Repeat extends TopLevel[Repeat with Double]
  
}

