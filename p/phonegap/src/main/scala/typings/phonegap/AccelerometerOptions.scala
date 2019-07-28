package typings.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccelerometerOptions extends js.Object {
  var frequency: js.UndefOr[Double] = js.undefined
}

object AccelerometerOptions {
  @scala.inline
  def apply(frequency: Int | Double = null): AccelerometerOptions = {
    val __obj = js.Dynamic.literal()
    if (frequency != null) __obj.updateDynamic("frequency")(frequency.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccelerometerOptions]
  }
}

