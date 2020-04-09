package typings.plotlyJs

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
  def apply(line: Partial[GaugeLine] = null, thickness: Int | Double = null, value: Int | Double = null): PartialThresholdLine = {
    val __obj = js.Dynamic.literal()
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (thickness != null) __obj.updateDynamic("thickness")(thickness.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialThresholdLine]
  }
}

