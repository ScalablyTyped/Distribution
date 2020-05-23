package typings.pixiSpine.PIXI.spine.core

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
  
}

