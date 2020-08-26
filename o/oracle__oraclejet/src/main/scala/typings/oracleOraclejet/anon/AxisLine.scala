package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.linear
import typings.oracleOraclejet.oracleOraclejetStrings.log
import typings.oracleOraclejet.oracleOraclejetStrings.min
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.zero
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AxisLine extends js.Object {
  var axisLine: LineWidth = js.native
  var baselineScaling: min | zero = js.native
  var dataMax: Double = js.native
  var dataMin: Double = js.native
  var majorTick: BaselineColor = js.native
  var max: Double | String = js.native
  var maxSize: String = js.native
  var min: Double | String = js.native
  var minStep: Double = js.native
  var minorStep: Double = js.native
  var minorTick: LineStyle = js.native
  var referenceObjects: js.Array[Categories] = js.native
  var rendered: off | on = js.native
  var scale: log | linear = js.native
  var size: String = js.native
  var step: Double = js.native
  var tickLabel: Rotation = js.native
  var title: String = js.native
  var titleStyle: js.Object = js.native
  var viewportEndGroup: Double | String = js.native
  var viewportMax: Double | String = js.native
  var viewportMin: Double | String = js.native
  var viewportStartGroup: Double | String = js.native
}

object AxisLine {
  @scala.inline
  def apply(
    axisLine: LineWidth,
    baselineScaling: min | zero,
    dataMax: Double,
    dataMin: Double,
    majorTick: BaselineColor,
    max: Double | String,
    maxSize: String,
    min: Double | String,
    minStep: Double,
    minorStep: Double,
    minorTick: LineStyle,
    referenceObjects: js.Array[Categories],
    rendered: off | on,
    scale: log | linear,
    size: String,
    step: Double,
    tickLabel: Rotation,
    title: String,
    titleStyle: js.Object,
    viewportEndGroup: Double | String,
    viewportMax: Double | String,
    viewportMin: Double | String,
    viewportStartGroup: Double | String
  ): AxisLine = {
    val __obj = js.Dynamic.literal(axisLine = axisLine.asInstanceOf[js.Any], baselineScaling = baselineScaling.asInstanceOf[js.Any], dataMax = dataMax.asInstanceOf[js.Any], dataMin = dataMin.asInstanceOf[js.Any], majorTick = majorTick.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], maxSize = maxSize.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], minStep = minStep.asInstanceOf[js.Any], minorStep = minorStep.asInstanceOf[js.Any], minorTick = minorTick.asInstanceOf[js.Any], referenceObjects = referenceObjects.asInstanceOf[js.Any], rendered = rendered.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], tickLabel = tickLabel.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleStyle = titleStyle.asInstanceOf[js.Any], viewportEndGroup = viewportEndGroup.asInstanceOf[js.Any], viewportMax = viewportMax.asInstanceOf[js.Any], viewportMin = viewportMin.asInstanceOf[js.Any], viewportStartGroup = viewportStartGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisLine]
  }
  @scala.inline
  implicit class AxisLineOps[Self <: AxisLine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAxisLine(value: LineWidth): Self = this.set("axisLine", value.asInstanceOf[js.Any])
    @scala.inline
    def setBaselineScaling(value: min | zero): Self = this.set("baselineScaling", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataMax(value: Double): Self = this.set("dataMax", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataMin(value: Double): Self = this.set("dataMin", value.asInstanceOf[js.Any])
    @scala.inline
    def setMajorTick(value: BaselineColor): Self = this.set("majorTick", value.asInstanceOf[js.Any])
    @scala.inline
    def setMax(value: Double | String): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxSize(value: String): Self = this.set("maxSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setMin(value: Double | String): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinStep(value: Double): Self = this.set("minStep", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinorStep(value: Double): Self = this.set("minorStep", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinorTick(value: LineStyle): Self = this.set("minorTick", value.asInstanceOf[js.Any])
    @scala.inline
    def setReferenceObjectsVarargs(value: Categories*): Self = this.set("referenceObjects", js.Array(value :_*))
    @scala.inline
    def setReferenceObjects(value: js.Array[Categories]): Self = this.set("referenceObjects", value.asInstanceOf[js.Any])
    @scala.inline
    def setRendered(value: off | on): Self = this.set("rendered", value.asInstanceOf[js.Any])
    @scala.inline
    def setScale(value: log | linear): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def setTickLabel(value: Rotation): Self = this.set("tickLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitleStyle(value: js.Object): Self = this.set("titleStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewportEndGroup(value: Double | String): Self = this.set("viewportEndGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewportMax(value: Double | String): Self = this.set("viewportMax", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewportMin(value: Double | String): Self = this.set("viewportMin", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewportStartGroup(value: Double | String): Self = this.set("viewportStartGroup", value.asInstanceOf[js.Any])
  }
  
}

