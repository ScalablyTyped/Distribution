package typings.oracleOraclejet

import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.bottom
import typings.oracleOraclejet.oracleOraclejetStrings.end
import typings.oracleOraclejet.oracleOraclejetStrings.linear
import typings.oracleOraclejet.oracleOraclejetStrings.log
import typings.oracleOraclejet.oracleOraclejetStrings.min
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.start
import typings.oracleOraclejet.oracleOraclejetStrings.top
import typings.oracleOraclejet.oracleOraclejetStrings.zero
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlignTickMarks extends js.Object {
  var alignTickMarks: off | on
  var axisLine: AnonAutoLineColor
  var baselineScaling: min | zero
  var dataMax: Double
  var dataMin: Double
  var majorTick: AnonAutoBaselineColor
  var max: Double
  var maxSize: String
  var min: Double
  var minStep: Double
  var minorStep: Double
  var minorTick: AnonAutoDashed
  var position: start | end | top | bottom | auto
  var referenceObjects: js.Array[AnonAreaBack]
  var rendered: off | on
  var scale: log | linear
  var size: String
  var step: Double
  var tickLabel: AnonAutoBillionConverterInside
  var title: String
  var titleStyle: js.Object
}

object AnonAlignTickMarks {
  @scala.inline
  def apply(
    alignTickMarks: off | on,
    axisLine: AnonAutoLineColor,
    baselineScaling: min | zero,
    dataMax: Double,
    dataMin: Double,
    majorTick: AnonAutoBaselineColor,
    max: Double,
    maxSize: String,
    min: Double,
    minStep: Double,
    minorStep: Double,
    minorTick: AnonAutoDashed,
    position: start | end | top | bottom | auto,
    referenceObjects: js.Array[AnonAreaBack],
    rendered: off | on,
    scale: log | linear,
    size: String,
    step: Double,
    tickLabel: AnonAutoBillionConverterInside,
    title: String,
    titleStyle: js.Object
  ): AnonAlignTickMarks = {
    val __obj = js.Dynamic.literal(alignTickMarks = alignTickMarks.asInstanceOf[js.Any], axisLine = axisLine.asInstanceOf[js.Any], baselineScaling = baselineScaling.asInstanceOf[js.Any], dataMax = dataMax.asInstanceOf[js.Any], dataMin = dataMin.asInstanceOf[js.Any], majorTick = majorTick.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], maxSize = maxSize.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], minStep = minStep.asInstanceOf[js.Any], minorStep = minorStep.asInstanceOf[js.Any], minorTick = minorTick.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], referenceObjects = referenceObjects.asInstanceOf[js.Any], rendered = rendered.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], tickLabel = tickLabel.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleStyle = titleStyle.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAlignTickMarks]
  }
}

