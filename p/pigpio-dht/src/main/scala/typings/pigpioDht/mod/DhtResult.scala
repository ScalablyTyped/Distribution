package typings.pigpioDht.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Result from a successful sensor read.
  */
@js.native
trait DhtResult extends js.Object {
  /** The humidity value in percentage points. */
  var humidity: Double = js.native
  /** The temperature value in degrees Celsius. */
  var temperature: Double = js.native
}

object DhtResult {
  @scala.inline
  def apply(humidity: Double, temperature: Double): DhtResult = {
    val __obj = js.Dynamic.literal(humidity = humidity.asInstanceOf[js.Any], temperature = temperature.asInstanceOf[js.Any])
    __obj.asInstanceOf[DhtResult]
  }
  @scala.inline
  implicit class DhtResultOps[Self <: DhtResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHumidity(value: Double): Self = this.set("humidity", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemperature(value: Double): Self = this.set("temperature", value.asInstanceOf[js.Any])
  }
  
}

