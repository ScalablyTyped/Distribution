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

trait Anon_AutoAxisLine extends js.Object {
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
  var viewportMax: Double
  var viewportMin: Double
}

object Anon_AutoAxisLine {
  @scala.inline
  def apply(
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
    titleStyle: js.Object,
    viewportMax: Double,
    viewportMin: Double
  ): Anon_AutoAxisLine = {
    val __obj = js.Dynamic.literal(axisLine = axisLine, baselineScaling = baselineScaling.asInstanceOf[js.Any], dataMax = dataMax, dataMin = dataMin, majorTick = majorTick, max = max, maxSize = maxSize, min = min, minStep = minStep, minorStep = minorStep, minorTick = minorTick, position = position.asInstanceOf[js.Any], referenceObjects = referenceObjects, rendered = rendered.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], size = size, step = step, tickLabel = tickLabel, title = title, titleStyle = titleStyle, viewportMax = viewportMax, viewportMin = viewportMin)
  
    __obj.asInstanceOf[Anon_AutoAxisLine]
  }
}

