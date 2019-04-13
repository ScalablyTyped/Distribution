package typings
package piDashSpiLib.piDashSpiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait mode extends js.Object

@JSImport("pi-spi", "mode")
@js.native
object mode extends js.Object {
  @js.native
  sealed trait CPHA
    extends piDashSpiLib.piDashSpiMod.mode
  
  @js.native
  sealed trait CPOL
    extends piDashSpiLib.piDashSpiMod.mode
  
  /* 0x01 */ val CPHA: CPHA with scala.Double = js.native
  /* 0x02 */ val CPOL: CPOL with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[piDashSpiLib.piDashSpiMod.mode with scala.Double] = js.native
}

