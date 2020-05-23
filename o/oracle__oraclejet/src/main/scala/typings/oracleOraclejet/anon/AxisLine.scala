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

trait AxisLine extends js.Object {
  var axisLine: LineWidth
  var baselineScaling: min | zero
  var dataMax: Double
  var dataMin: Double
  var majorTick: BaselineColor
  var max: Double | String
  var maxSize: String
  var min: Double | String
  var minStep: Double
  var minorStep: Double
  var minorTick: LineStyle
  var referenceObjects: js.Array[Categories]
  var rendered: off | on
  var scale: log | linear
  var size: String
  var step: Double
  var tickLabel: Rotation
  var title: String
  var titleStyle: js.Object
  var viewportEndGroup: Double | String
  var viewportMax: Double | String
  var viewportMin: Double | String
  var viewportStartGroup: Double | String
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
}

