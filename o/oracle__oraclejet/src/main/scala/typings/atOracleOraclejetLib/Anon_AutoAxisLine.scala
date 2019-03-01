package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoAxisLine extends js.Object {
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
  var viewportMax: scala.Double
  var viewportMin: scala.Double
}

object Anon_AutoAxisLine {
  @scala.inline
  def apply(
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
    titleStyle: js.Object,
    viewportMax: scala.Double,
    viewportMin: scala.Double
  ): Anon_AutoAxisLine = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("axisLine")(axisLine)
    __obj.updateDynamic("baselineScaling")(baselineScaling.asInstanceOf[js.Any])
    __obj.updateDynamic("dataMax")(dataMax)
    __obj.updateDynamic("dataMin")(dataMin)
    __obj.updateDynamic("majorTick")(majorTick)
    __obj.updateDynamic("max")(max)
    __obj.updateDynamic("maxSize")(maxSize)
    __obj.updateDynamic("min")(min)
    __obj.updateDynamic("minStep")(minStep)
    __obj.updateDynamic("minorStep")(minorStep)
    __obj.updateDynamic("minorTick")(minorTick)
    __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.updateDynamic("referenceObjects")(referenceObjects)
    __obj.updateDynamic("rendered")(rendered.asInstanceOf[js.Any])
    __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("step")(step)
    __obj.updateDynamic("tickLabel")(tickLabel)
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("titleStyle")(titleStyle)
    __obj.updateDynamic("viewportMax")(viewportMax)
    __obj.updateDynamic("viewportMin")(viewportMin)
    __obj.asInstanceOf[Anon_AutoAxisLine]
  }
}

