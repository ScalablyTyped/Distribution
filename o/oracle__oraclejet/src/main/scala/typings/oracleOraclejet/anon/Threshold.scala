package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Threshold extends js.Object {
  var threshold: js.UndefOr[Double] = js.undefined
}

object Threshold {
  @scala.inline
  def apply(threshold: js.UndefOr[Double] = js.undefined): Threshold = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(threshold)) __obj.updateDynamic("threshold")(threshold.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Threshold]
  }
}

