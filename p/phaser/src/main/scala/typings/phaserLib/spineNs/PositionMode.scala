package typings
package phaserLib.spineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PositionMode extends js.Object

@JSGlobal("spine.PositionMode")
@js.native
object PositionMode extends js.Object {
  @js.native
  sealed trait Fixed
    extends phaserLib.spineNs.PositionMode
  
  @js.native
  sealed trait Percent
    extends phaserLib.spineNs.PositionMode
  
  /* 0 */ val Fixed: Fixed with scala.Double = js.native
  /* 1 */ val Percent: Percent with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[phaserLib.spineNs.PositionMode with scala.Double] = js.native
}

