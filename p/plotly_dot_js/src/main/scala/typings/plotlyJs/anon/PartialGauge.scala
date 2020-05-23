package typings.plotlyJs.anon

import typings.plotlyJs.plotlyJsStrings.angular
import typings.plotlyJs.plotlyJsStrings.bullet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.Gauge> */
trait PartialGauge extends js.Object {
  var axis: js.UndefOr[PartialAxisAutorange] = js.undefined
  var bar: js.UndefOr[PartialGaugeBar] = js.undefined
  var bgcolor: js.UndefOr[typings.plotlyJs.mod.Color] = js.undefined
  var bordercolor: js.UndefOr[typings.plotlyJs.mod.Color] = js.undefined
  var borderwidth: js.UndefOr[Double] = js.undefined
  var shape: js.UndefOr[angular | bullet] = js.undefined
  var steps: js.UndefOr[js.Array[Color]] = js.undefined
  var threshold: js.UndefOr[PartialThreshold] = js.undefined
}

object PartialGauge {
  @scala.inline
  def apply(
    axis: PartialAxisAutorange = null,
    bar: PartialGaugeBar = null,
    bgcolor: typings.plotlyJs.mod.Color = null,
    bordercolor: typings.plotlyJs.mod.Color = null,
    borderwidth: js.UndefOr[Double] = js.undefined,
    shape: angular | bullet = null,
    steps: js.Array[Color] = null,
    threshold: PartialThreshold = null
  ): PartialGauge = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (bar != null) __obj.updateDynamic("bar")(bar.asInstanceOf[js.Any])
    if (bgcolor != null) __obj.updateDynamic("bgcolor")(bgcolor.asInstanceOf[js.Any])
    if (bordercolor != null) __obj.updateDynamic("bordercolor")(bordercolor.asInstanceOf[js.Any])
    if (!js.isUndefined(borderwidth)) __obj.updateDynamic("borderwidth")(borderwidth.get.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (steps != null) __obj.updateDynamic("steps")(steps.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialGauge]
  }
}

