package typings
package pigpioDashDhtLib.pigpioDashDhtMod.dhtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Result from a successful sensor read.
  */
trait DhtResult extends js.Object {
  /** The humidity value in percentage points. */
  var humidity: scala.Double
  /** The temperature value in degrees Celsius. */
  var temperature: scala.Double
}

object DhtResult {
  @scala.inline
  def apply(humidity: scala.Double, temperature: scala.Double): DhtResult = {
    val __obj = js.Dynamic.literal(humidity = humidity, temperature = temperature)
  
    __obj.asInstanceOf[DhtResult]
  }
}

