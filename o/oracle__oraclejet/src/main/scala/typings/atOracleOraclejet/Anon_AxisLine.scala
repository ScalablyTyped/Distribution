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
    val __obj = js.Dynamic.literal(axisLine = axisLine.asInstanceOf[js.Any], baselineScaling = baselineScaling.asInstanceOf[js.Any], dataMax = dataMax.asInstanceOf[js.Any], dataMin = dataMin.asInstanceOf[js.Any], majorTick = majorTick.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], maxSize = maxSize.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], minStep = minStep.asInstanceOf[js.Any], minorStep = minorStep.asInstanceOf[js.Any], minorTick = minorTick.asInstanceOf[js.Any], referenceObjects = referenceObjects.asInstanceOf[js.Any], rendered = rendered.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], tickLabel = tickLabel.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleStyle = titleStyle.asInstanceOf[js.Any], viewportEndGroup = viewportEndGroup.asInstanceOf[js.Any], viewportMax = viewportMax.asInstanceOf[js.Any], viewportMin = viewportMin.asInstanceOf[js.Any], viewportStartGroup = viewportStartGroup.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AxisLine]
  }
}

