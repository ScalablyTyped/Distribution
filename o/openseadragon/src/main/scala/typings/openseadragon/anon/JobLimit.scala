package typings.openseadragon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobLimit extends js.Object {
  var jobLimit: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object JobLimit {
  @scala.inline
  def apply(jobLimit: js.UndefOr[Double] = js.undefined, timeout: js.UndefOr[Double] = js.undefined): JobLimit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(jobLimit)) __obj.updateDynamic("jobLimit")(jobLimit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobLimit]
  }
}

