package typings
package pigpioDashDhtLib.pigpioDashDhtMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pigpio-dht", JSImport.Namespace)
@js.native
object pigpioDashDhtModMembers extends js.Object {
  /**
   * Returns a new DHT object for accessing a DHT11 or DHT22/AM2302 via GPIO.
   * @param gpio      an unsigned integer specifying the GPIO number
   * @param type      11 to initialize for reading a DHT11, 22 for DHT22/AM2302
   */
  def apply(gpio: scala.Double, `type`: scala.Double): pigpioDashDhtLib.pigpioDashDhtMod.dhtNs.Dht = js.native
}

