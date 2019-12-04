package typings.atOracleOraclejet

import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.bottom
import typings.atOracleOraclejet.atOracleOraclejetStrings.end
import typings.atOracleOraclejet.atOracleOraclejetStrings.linear
import typings.atOracleOraclejet.atOracleOraclejetStrings.log
import typings.atOracleOraclejet.atOracleOraclejetStrings.min
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.on
import typings.atOracleOraclejet.atOracleOraclejetStrings.start
import typings.atOracleOraclejet.atOracleOraclejetStrings.top
import typings.atOracleOraclejet.atOracleOraclejetStrings.zero
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlignTickMarks extends js.Object {
  var alignTickMarks: off | on
  var axisLine: Anon_AutoLineColor
  var baselineScaling: min | zero
  var dataMax: Double
  var dataMin: Double
  var majorTick: Anon_AutoBaselineColor
  var max: Double
  var maxSize: String
  var min: Double
  var minStep: Double
  var minorStep: Double
  var minorTick: Anon_AutoDashed
  var position: start | end | top | bottom | auto
  var referenceObjects: js.Array[Anon_AreaBack]
  var rendered: off | on
  var scale: log | linear
  var size: String
  var step: Double
  var tickLabel: Anon_AutoBillionConverterInside
  var title: String
  var titleStyle: js.Object
}

object Anon_AlignTickMarks {
  @scala.inline
  def apply(
    alignTickMarks: off | on,
    axisLine: Anon_AutoLineColor,
    baselineScaling: min | zero,
    dataMax: Double,
    dataMin: Double,
    majorTick: Anon_AutoBaselineColor,
    max: Double,
    maxSize: String,
    min: Double,
    minStep: Double,
    minorStep: Double,
    minorTick: Anon_AutoDashed,
    position: start | end | top | bottom | auto,
    referenceObjects: js.Array[Anon_AreaBack],
    rendered: off | on,
    scale: log | linear,
    size: String,
    step: Double,
    tickLabel: Anon_AutoBillionConverterInside,
    title: String,
    titleStyle: js.Object
  ): Anon_AlignTickMarks = {
    val __obj = js.Dynamic.literal(alignTickMarks = alignTickMarks.asInstanceOf[js.Any], axisLine = axisLine.asInstanceOf[js.Any], baselineScaling = baselineScaling.asInstanceOf[js.Any], dataMax = dataMax.asInstanceOf[js.Any], dataMin = dataMin.asInstanceOf[js.Any], majorTick = majorTick.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], maxSize = maxSize.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], minStep = minStep.asInstanceOf[js.Any], minorStep = minorStep.asInstanceOf[js.Any], minorTick = minorTick.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], referenceObjects = referenceObjects.asInstanceOf[js.Any], rendered = rendered.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], tickLabel = tickLabel.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleStyle = titleStyle.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AlignTickMarks]
  }
}

