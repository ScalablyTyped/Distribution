package typings.pigpioDht.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Result from a successful sensor read.
  */
trait DhtResult extends js.Object {
  /** The humidity value in percentage points. */
  var humidity: Double
  /** The temperature value in degrees Celsius. */
  var temperature: Double
}

object DhtResult {
  @scala.inline
  def apply(humidity: Double, temperature: Double): DhtResult = {
    val __obj = js.Dynamic.literal(humidity = humidity.asInstanceOf[js.Any], temperature = temperature.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DhtResult]
  }
}

