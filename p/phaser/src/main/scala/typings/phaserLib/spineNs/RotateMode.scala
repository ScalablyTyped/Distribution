package typings
package phaserLib.spineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RotateMode extends js.Object

@JSGlobal("spine.RotateMode")
@js.native
object RotateMode extends js.Object {
  @js.native
  sealed trait Chain
    extends phaserLib.spineNs.RotateMode
  
  @js.native
  sealed trait ChainScale
    extends phaserLib.spineNs.RotateMode
  
  @js.native
  sealed trait Tangent
    extends phaserLib.spineNs.RotateMode
  
  /* 1 */ val Chain: Chain with scala.Double = js.native
  /* 2 */ val ChainScale: ChainScale with scala.Double = js.native
  /* 0 */ val Tangent: Tangent with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[phaserLib.spineNs.RotateMode with scala.Double] = js.native
}

