package typings.plotlyJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.GaugeBar> */
trait PartialGaugeBar extends js.Object {
  var color: js.UndefOr[typings.plotlyJs.mod.Color] = js.undefined
  var line: js.UndefOr[PartialGaugeLine] = js.undefined
  var thickness: js.UndefOr[Double] = js.undefined
}

object PartialGaugeBar {
  @scala.inline
  def apply(
    color: typings.plotlyJs.mod.Color = null,
    line: PartialGaugeLine = null,
    thickness: js.UndefOr[Double] = js.undefined
  ): PartialGaugeBar = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (!js.isUndefined(thickness)) __obj.updateDynamic("thickness")(thickness.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialGaugeBar]
  }
}

