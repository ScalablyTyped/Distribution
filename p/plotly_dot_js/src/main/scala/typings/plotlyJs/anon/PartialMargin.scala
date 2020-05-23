package typings.plotlyJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.Margin> */
trait PartialMargin extends js.Object {
  var b: js.UndefOr[Double] = js.undefined
  var l: js.UndefOr[Double] = js.undefined
  var pad: js.UndefOr[Double] = js.undefined
  var r: js.UndefOr[Double] = js.undefined
  var t: js.UndefOr[Double] = js.undefined
}

object PartialMargin {
  @scala.inline
  def apply(
    b: js.UndefOr[Double] = js.undefined,
    l: js.UndefOr[Double] = js.undefined,
    pad: js.UndefOr[Double] = js.undefined,
    r: js.UndefOr[Double] = js.undefined,
    t: js.UndefOr[Double] = js.undefined
  ): PartialMargin = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(b)) __obj.updateDynamic("b")(b.get.asInstanceOf[js.Any])
    if (!js.isUndefined(l)) __obj.updateDynamic("l")(l.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pad)) __obj.updateDynamic("pad")(pad.get.asInstanceOf[js.Any])
    if (!js.isUndefined(r)) __obj.updateDynamic("r")(r.get.asInstanceOf[js.Any])
    if (!js.isUndefined(t)) __obj.updateDynamic("t")(t.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialMargin]
  }
}

