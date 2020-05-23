package typings.plotlyJs.anon

import typings.plotlyJs.mod.GaugeLine
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.GaugeBar> */
trait PartialGaugeBarColor extends js.Object {
  var color: js.UndefOr[typings.plotlyJs.mod.Color] = js.undefined
  var line: js.UndefOr[Partial[GaugeLine]] = js.undefined
  var thickness: js.UndefOr[Double] = js.undefined
}

object PartialGaugeBarColor {
  @scala.inline
  def apply(
    color: typings.plotlyJs.mod.Color = null,
    line: Partial[GaugeLine] = null,
    thickness: js.UndefOr[Double] = js.undefined
  ): PartialGaugeBarColor = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (!js.isUndefined(thickness)) __obj.updateDynamic("thickness")(thickness.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialGaugeBarColor]
  }
}

