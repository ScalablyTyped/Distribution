package typings.moment.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait argThresholdOpts extends js.Object {
  var M: js.UndefOr[Double] = js.undefined
  var d: js.UndefOr[Double] = js.undefined
  var h: js.UndefOr[Double] = js.undefined
  var m: js.UndefOr[Double] = js.undefined
  var s: js.UndefOr[Double] = js.undefined
  var ss: js.UndefOr[Double] = js.undefined
  var w: js.UndefOr[Double | Unit] = js.undefined
}

object argThresholdOpts {
  @scala.inline
  def apply(
    M: js.UndefOr[Double] = js.undefined,
    d: js.UndefOr[Double] = js.undefined,
    h: js.UndefOr[Double] = js.undefined,
    m: js.UndefOr[Double] = js.undefined,
    s: js.UndefOr[Double] = js.undefined,
    ss: js.UndefOr[Double] = js.undefined,
    w: Double | Unit = null
  ): argThresholdOpts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(M)) __obj.updateDynamic("M")(M.get.asInstanceOf[js.Any])
    if (!js.isUndefined(d)) __obj.updateDynamic("d")(d.get.asInstanceOf[js.Any])
    if (!js.isUndefined(h)) __obj.updateDynamic("h")(h.get.asInstanceOf[js.Any])
    if (!js.isUndefined(m)) __obj.updateDynamic("m")(m.get.asInstanceOf[js.Any])
    if (!js.isUndefined(s)) __obj.updateDynamic("s")(s.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ss)) __obj.updateDynamic("ss")(ss.get.asInstanceOf[js.Any])
    if (w != null) __obj.updateDynamic("w")(w.asInstanceOf[js.Any])
    __obj.asInstanceOf[argThresholdOpts]
  }
}

