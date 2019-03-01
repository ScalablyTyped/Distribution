package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AxisLine extends js.Object {
  var axisLine: Anon_LineColor
  var baselineScaling: atOracleOraclejetLib.atOracleOraclejetLibStrings.min | atOracleOraclejetLib.atOracleOraclejetLibStrings.zero
  var dataMax: scala.Double
  var dataMin: scala.Double
  var majorTick: Anon_AutoBaselineColor
  var max: scala.Double | java.lang.String
  var maxSize: java.lang.String
  var min: scala.Double | java.lang.String
  var minStep: scala.Double
  var minorStep: scala.Double
  var minorTick: Anon_AutoDashed
  var referenceObjects: js.Array[Anon_Area]
  var rendered: atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.on
  var scale: atOracleOraclejetLib.atOracleOraclejetLibStrings.log | atOracleOraclejetLib.atOracleOraclejetLibStrings.linear
  var size: java.lang.String
  var step: scala.Double
  var tickLabel: Anon_AutoBillionConverterMillion
  var title: java.lang.String
  var titleStyle: js.Object
  var viewportEndGroup: scala.Double | java.lang.String
  var viewportMax: scala.Double | java.lang.String
  var viewportMin: scala.Double | java.lang.String
  var viewportStartGroup: scala.Double | java.lang.String
}

object Anon_AxisLine {
  @scala.inline
  def apply(
    axisLine: Anon_LineColor,
    baselineScaling: atOracleOraclejetLib.atOracleOraclejetLibStrings.min | atOracleOraclejetLib.atOracleOraclejetLibStrings.zero,
    dataMax: scala.Double,
    dataMin: scala.Double,
    majorTick: Anon_AutoBaselineColor,
    max: scala.Double | java.lang.String,
    maxSize: java.lang.String,
    min: scala.Double | java.lang.String,
    minStep: scala.Double,
    minorStep: scala.Double,
    minorTick: Anon_AutoDashed,
    referenceObjects: js.Array[Anon_Area],
    rendered: atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.on,
    scale: atOracleOraclejetLib.atOracleOraclejetLibStrings.log | atOracleOraclejetLib.atOracleOraclejetLibStrings.linear,
    size: java.lang.String,
    step: scala.Double,
    tickLabel: Anon_AutoBillionConverterMillion,
    title: java.lang.String,
    titleStyle: js.Object,
    viewportEndGroup: scala.Double | java.lang.String,
    viewportMax: scala.Double | java.lang.String,
    viewportMin: scala.Double | java.lang.String,
    viewportStartGroup: scala.Double | java.lang.String
  ): Anon_AxisLine = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("axisLine")(axisLine)
    __obj.updateDynamic("baselineScaling")(baselineScaling.asInstanceOf[js.Any])
    __obj.updateDynamic("dataMax")(dataMax)
    __obj.updateDynamic("dataMin")(dataMin)
    __obj.updateDynamic("majorTick")(majorTick)
    __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    __obj.updateDynamic("maxSize")(maxSize)
    __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.updateDynamic("minStep")(minStep)
    __obj.updateDynamic("minorStep")(minorStep)
    __obj.updateDynamic("minorTick")(minorTick)
    __obj.updateDynamic("referenceObjects")(referenceObjects)
    __obj.updateDynamic("rendered")(rendered.asInstanceOf[js.Any])
    __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("step")(step)
    __obj.updateDynamic("tickLabel")(tickLabel)
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("titleStyle")(titleStyle)
    __obj.updateDynamic("viewportEndGroup")(viewportEndGroup.asInstanceOf[js.Any])
    __obj.updateDynamic("viewportMax")(viewportMax.asInstanceOf[js.Any])
    __obj.updateDynamic("viewportMin")(viewportMin.asInstanceOf[js.Any])
    __obj.updateDynamic("viewportStartGroup")(viewportStartGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AxisLine]
  }
}

