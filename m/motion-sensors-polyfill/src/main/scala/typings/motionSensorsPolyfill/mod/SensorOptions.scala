package typings.motionSensorsPolyfill.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SensorOptions extends js.Object {
  var frequency: js.UndefOr[Double] = js.undefined
}

object SensorOptions {
  @scala.inline
  def apply(frequency: js.UndefOr[Double] = js.undefined): SensorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(frequency)) __obj.updateDynamic("frequency")(frequency.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SensorOptions]
  }
}

