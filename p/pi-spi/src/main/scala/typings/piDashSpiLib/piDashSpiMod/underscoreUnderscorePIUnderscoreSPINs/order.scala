package typings
package piDashSpiLib.piDashSpiMod.underscoreUnderscorePIUnderscoreSPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait order extends js.Object

@JSImport("pi-spi/__PI_SPI", "order")
@js.native
object order extends js.Object {
  @js.native
  sealed trait LSB_FIRST
    extends piDashSpiLib.piDashSpiMod.underscoreUnderscorePIUnderscoreSPINs.order
  
  @js.native
  sealed trait MSB_FIRST
    extends piDashSpiLib.piDashSpiMod.underscoreUnderscorePIUnderscoreSPINs.order
  
}

