package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlignTickMarks extends js.Object {
  var alignTickMarks: atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.on
  var axisLine: Anon_AutoLineColor
  var baselineScaling: atOracleOraclejetLib.atOracleOraclejetLibStrings.min | atOracleOraclejetLib.atOracleOraclejetLibStrings.zero
  var dataMax: scala.Double
  var dataMin: scala.Double
  var majorTick: Anon_AutoBaselineColor
  var max: scala.Double
  var maxSize: java.lang.String
  var min: scala.Double
  var minStep: scala.Double
  var minorStep: scala.Double
  var minorTick: Anon_AutoDashed
  var position: atOracleOraclejetLib.atOracleOraclejetLibStrings.start | atOracleOraclejetLib.atOracleOraclejetLibStrings.end | atOracleOraclejetLib.atOracleOraclejetLibStrings.top | atOracleOraclejetLib.atOracleOraclejetLibStrings.bottom | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  var referenceObjects: js.Array[Anon_AreaBack]
  var rendered: atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.on
  var scale: atOracleOraclejetLib.atOracleOraclejetLibStrings.log | atOracleOraclejetLib.atOracleOraclejetLibStrings.linear
  var size: java.lang.String
  var step: scala.Double
  var tickLabel: Anon_AutoBillionConverterInside
  var title: java.lang.String
  var titleStyle: js.Object
}

object Anon_AlignTickMarks {
  @scala.inline
  def apply(
    alignTickMarks: atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.on,
    axisLine: Anon_AutoLineColor,
    baselineScaling: atOracleOraclejetLib.atOracleOraclejetLibStrings.min | atOracleOraclejetLib.atOracleOraclejetLibStrings.zero,
    dataMax: scala.Double,
    dataMin: scala.Double,
    majorTick: Anon_AutoBaselineColor,
    max: scala.Double,
    maxSize: java.lang.String,
    min: scala.Double,
    minStep: scala.Double,
    minorStep: scala.Double,
    minorTick: Anon_AutoDashed,
    position: atOracleOraclejetLib.atOracleOraclejetLibStrings.start | atOracleOraclejetLib.atOracleOraclejetLibStrings.end | atOracleOraclejetLib.atOracleOraclejetLibStrings.top | atOracleOraclejetLib.atOracleOraclejetLibStrings.bottom | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto,
    referenceObjects: js.Array[Anon_AreaBack],
    rendered: atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.on,
    scale: atOracleOraclejetLib.atOracleOraclejetLibStrings.log | atOracleOraclejetLib.atOracleOraclejetLibStrings.linear,
    size: java.lang.String,
    step: scala.Double,
    tickLabel: Anon_AutoBillionConverterInside,
    title: java.lang.String,
    titleStyle: js.Object
  ): Anon_AlignTickMarks = {
    val __obj = js.Dynamic.literal(alignTickMarks = alignTickMarks.asInstanceOf[js.Any], axisLine = axisLine, baselineScaling = baselineScaling.asInstanceOf[js.Any], dataMax = dataMax, dataMin = dataMin, majorTick = majorTick, max = max, maxSize = maxSize, min = min, minStep = minStep, minorStep = minorStep, minorTick = minorTick, position = position.asInstanceOf[js.Any], referenceObjects = referenceObjects, rendered = rendered.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], size = size, step = step, tickLabel = tickLabel, title = title, titleStyle = titleStyle)
  
    __obj.asInstanceOf[Anon_AlignTickMarks]
  }
}

