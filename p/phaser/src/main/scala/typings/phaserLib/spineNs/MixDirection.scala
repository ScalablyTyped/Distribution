package typings
package phaserLib.spineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MixDirection extends js.Object

@JSGlobal("spine.MixDirection")
@js.native
object MixDirection extends js.Object {
  @js.native
  sealed trait in
    extends phaserLib.spineNs.MixDirection
  
  @js.native
  sealed trait out
    extends phaserLib.spineNs.MixDirection
  
  /* 0 */ val in: in with scala.Double = js.native
  /* 1 */ val out: out with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[phaserLib.spineNs.MixDirection with scala.Double] = js.native
}

