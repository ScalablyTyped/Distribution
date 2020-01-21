package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonThreshold extends js.Object {
  var threshold: js.UndefOr[Double] = js.undefined
}

object AnonThreshold {
  @scala.inline
  def apply(threshold: Int | Double = null): AnonThreshold = {
    val __obj = js.Dynamic.literal()
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonThreshold]
  }
}

