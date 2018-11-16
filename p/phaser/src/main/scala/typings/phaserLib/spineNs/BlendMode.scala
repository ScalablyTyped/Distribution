package typings
package phaserLib.spineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BlendMode extends js.Object

@JSGlobal("spine.BlendMode")
@js.native
object BlendMode extends js.Object {
  @js.native
  sealed trait Additive
    extends phaserLib.spineNs.BlendMode
  
  @js.native
  sealed trait Multiply
    extends phaserLib.spineNs.BlendMode
  
  @js.native
  sealed trait Normal
    extends phaserLib.spineNs.BlendMode
  
  @js.native
  sealed trait Screen
    extends phaserLib.spineNs.BlendMode
  
  /* 1 */ val Additive: Additive with scala.Double = js.native
  /* 2 */ val Multiply: Multiply with scala.Double = js.native
  /* 0 */ val Normal: Normal with scala.Double = js.native
  /* 3 */ val Screen: Screen with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[phaserLib.spineNs.BlendMode with scala.Double] = js.native
}

