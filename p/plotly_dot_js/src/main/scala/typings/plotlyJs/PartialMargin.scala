package typings.plotlyJs

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
    b: Int | Double = null,
    l: Int | Double = null,
    pad: Int | Double = null,
    r: Int | Double = null,
    t: Int | Double = null
  ): PartialMargin = {
    val __obj = js.Dynamic.literal()
    if (b != null) __obj.updateDynamic("b")(b.asInstanceOf[js.Any])
    if (l != null) __obj.updateDynamic("l")(l.asInstanceOf[js.Any])
    if (pad != null) __obj.updateDynamic("pad")(pad.asInstanceOf[js.Any])
    if (r != null) __obj.updateDynamic("r")(r.asInstanceOf[js.Any])
    if (t != null) __obj.updateDynamic("t")(t.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialMargin]
  }
}

