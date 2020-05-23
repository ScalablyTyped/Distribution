package typings.plotlyJs.anon

import typings.plotlyJs.mod.GaugeLine
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.Threshold> */
trait PartialThresholdLine extends js.Object {
  var line: js.UndefOr[Partial[GaugeLine]] = js.undefined
  var thickness: js.UndefOr[Double] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object PartialThresholdLine {
  @scala.inline
  def apply(
    line: Partial[GaugeLine] = null,
    thickness: js.UndefOr[Double] = js.undefined,
    value: js.UndefOr[Double] = js.undefined
  ): PartialThresholdLine = {
    val __obj = js.Dynamic.literal()
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (!js.isUndefined(thickness)) __obj.updateDynamic("thickness")(thickness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialThresholdLine]
  }
}

