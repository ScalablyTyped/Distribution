package typings
package phaserLib.spineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextureFilter extends js.Object

@JSGlobal("spine.TextureFilter")
@js.native
object TextureFilter extends js.Object {
  @js.native
  sealed trait Linear
    extends phaserLib.spineNs.TextureFilter
  
  @js.native
  sealed trait MipMap
    extends phaserLib.spineNs.TextureFilter
  
  @js.native
  sealed trait MipMapLinearLinear
    extends phaserLib.spineNs.TextureFilter
  
  @js.native
  sealed trait MipMapLinearNearest
    extends phaserLib.spineNs.TextureFilter
  
  @js.native
  sealed trait MipMapNearestLinear
    extends phaserLib.spineNs.TextureFilter
  
  @js.native
  sealed trait MipMapNearestNearest
    extends phaserLib.spineNs.TextureFilter
  
  @js.native
  sealed trait Nearest
    extends phaserLib.spineNs.TextureFilter
  
  /* 9729 */ val Linear: Linear with scala.Double = js.native
  /* 9987 */ val MipMap: MipMap with scala.Double = js.native
  /* 9987 */ val MipMapLinearLinear: MipMapLinearLinear with scala.Double = js.native
  /* 9985 */ val MipMapLinearNearest: MipMapLinearNearest with scala.Double = js.native
  /* 9986 */ val MipMapNearestLinear: MipMapNearestLinear with scala.Double = js.native
  /* 9984 */ val MipMapNearestNearest: MipMapNearestNearest with scala.Double = js.native
  /* 9728 */ val Nearest: Nearest with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[phaserLib.spineNs.TextureFilter with scala.Double] = js.native
}

