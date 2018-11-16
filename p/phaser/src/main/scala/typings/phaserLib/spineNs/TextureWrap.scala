package typings
package phaserLib.spineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextureWrap extends js.Object

@JSGlobal("spine.TextureWrap")
@js.native
object TextureWrap extends js.Object {
  @js.native
  sealed trait ClampToEdge
    extends phaserLib.spineNs.TextureWrap
  
  @js.native
  sealed trait MirroredRepeat
    extends phaserLib.spineNs.TextureWrap
  
  @js.native
  sealed trait Repeat
    extends phaserLib.spineNs.TextureWrap
  
  /* 33071 */ val ClampToEdge: ClampToEdge with scala.Double = js.native
  /* 33648 */ val MirroredRepeat: MirroredRepeat with scala.Double = js.native
  /* 10497 */ val Repeat: Repeat with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[phaserLib.spineNs.TextureWrap with scala.Double] = js.native
}

