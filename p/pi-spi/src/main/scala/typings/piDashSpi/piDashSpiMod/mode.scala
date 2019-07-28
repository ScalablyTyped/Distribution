package typings.piDashSpi.piDashSpiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait mode extends js.Object

@JSImport("pi-spi", "mode")
@js.native
object mode extends js.Object {
  @js.native
  sealed trait CPHA extends mode
  
  @js.native
  sealed trait CPOL extends mode
  
  /* 0x01 */ val CPHA: typings.piDashSpi.piDashSpiMod.mode.CPHA with Double = js.native
  /* 0x02 */ val CPOL: typings.piDashSpi.piDashSpiMod.mode.CPOL with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[mode with Double] = js.native
}

