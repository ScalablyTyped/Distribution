package typings
package phaserLib.spineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SpacingMode extends js.Object

@JSGlobal("spine.SpacingMode")
@js.native
object SpacingMode extends js.Object {
  @js.native
  sealed trait Fixed
    extends phaserLib.spineNs.SpacingMode
  
  @js.native
  sealed trait Length
    extends phaserLib.spineNs.SpacingMode
  
  @js.native
  sealed trait Percent
    extends phaserLib.spineNs.SpacingMode
  
  /* 1 */ val Fixed: Fixed with scala.Double = js.native
  /* 0 */ val Length: Length with scala.Double = js.native
  /* 2 */ val Percent: Percent with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[phaserLib.spineNs.SpacingMode with scala.Double] = js.native
}

