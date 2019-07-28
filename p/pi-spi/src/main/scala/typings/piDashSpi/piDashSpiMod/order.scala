package typings.piDashSpi.piDashSpiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait order extends js.Object

@JSImport("pi-spi", "order")
@js.native
object order extends js.Object {
  @js.native
  sealed trait LSB_FIRST extends order
  
  @js.native
  sealed trait MSB_FIRST extends order
  
  /* 1 */ val LSB_FIRST: typings.piDashSpi.piDashSpiMod.order.LSB_FIRST with Double = js.native
  /* 0 */ val MSB_FIRST: typings.piDashSpi.piDashSpiMod.order.MSB_FIRST with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[order with Double] = js.native
}

