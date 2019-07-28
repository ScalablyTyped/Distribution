package typings.atOracleOraclejet

import typings.atOracleOraclejet.atOracleOraclejetStrings.linear
import typings.atOracleOraclejet.atOracleOraclejetStrings.log
import typings.atOracleOraclejet.atOracleOraclejetStrings.min
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.on
import typings.atOracleOraclejet.atOracleOraclejetStrings.zero
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AxisLine extends js.Object {
  var axisLine: Anon_LineColor
  var baselineScaling: min | zero
  var dataMax: Double
  var dataMin: Double
  var majorTick: Anon_AutoBaselineColor
  var max: Double | String
  var maxSize: String
  var min: Double | String
  var minStep: Double
  var minorStep: Double
  var minorTick: Anon_AutoDashed
  var referenceObjects: js.Array[Anon_Area]
  var rendered: off | on
  var scale: log | linear
  var size: String
  var step: Double
  var tickLabel: Anon_AutoBillionConverterMillion
  var title: String
  var titleStyle: js.Object
  var viewportEndGroup: Double | String
  var viewportMax: Double | String
  var viewportMin: Double | String
  var viewportStartGroup: Double | String
}

object Anon_AxisLine {
  @scala.inline
  def apply(
    axisLine: Anon_LineColor,
    baselineScaling: min | zero,
    dataMax: Double,
    dataMin: Double,
    majorTick: Anon_AutoBaselineColor,
    max: Double | String,
    maxSize: String,
    min: Double | String,
    minStep: Double,
    minorStep: Double,
    minorTick: Anon_AutoDashed,
    referenceObjects: js.Array[Anon_Area],
    rendered: off | on,
    scale: log | linear,
    size: String,
    step: Double,
    tickLabel: Anon_AutoBillionConverterMillion,
    title: String,
    titleStyle: js.Object,
    viewportEndGroup: Double | String,
    viewportMax: Double | String,
    viewportMin: Double | String,
    viewportStartGroup: Double | String
  ): Anon_AxisLine = {
    val __obj = js.Dynamic.literal(axisLine = axisLine, baselineScaling = baselineScaling.asInstanceOf[js.Any], dataMax = dataMax, dataMin = dataMin, majorTick = majorTick, max = max.asInstanceOf[js.Any], maxSize = maxSize, min = min.asInstanceOf[js.Any], minStep = minStep, minorStep = minorStep, minorTick = minorTick, referenceObjects = referenceObjects, rendered = rendered.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], size = size, step = step, tickLabel = tickLabel, title = title, titleStyle = titleStyle, viewportEndGroup = viewportEndGroup.asInstanceOf[js.Any], viewportMax = viewportMax.asInstanceOf[js.Any], viewportMin = viewportMin.asInstanceOf[js.Any], viewportStartGroup = viewportStartGroup.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AxisLine]
  }
}

