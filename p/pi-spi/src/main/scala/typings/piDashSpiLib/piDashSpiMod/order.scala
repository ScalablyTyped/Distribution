package typings
package piDashSpiLib.piDashSpiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait order extends js.Object

@JSImport("pi-spi", "order")
@js.native
object order extends js.Object {
  @js.native
  sealed trait LSB_FIRST
    extends piDashSpiLib.piDashSpiMod.order
  
  @js.native
  sealed trait MSB_FIRST
    extends piDashSpiLib.piDashSpiMod.order
  
  /* 1 */ val LSB_FIRST: LSB_FIRST with scala.Double = js.native
  /* 0 */ val MSB_FIRST: MSB_FIRST with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[piDashSpiLib.piDashSpiMod.order with scala.Double] = js.native
}

