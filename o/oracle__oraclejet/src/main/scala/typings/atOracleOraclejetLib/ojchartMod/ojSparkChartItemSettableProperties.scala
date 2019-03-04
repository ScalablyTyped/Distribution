package typings
package atOracleOraclejetLib.ojchartMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojSparkChartItemSettableProperties
  extends atOracleOraclejetLib.atOracleOraclejetMod.JetSettableProperties {
  var borderColor: java.lang.String
  var color: java.lang.String
  var date: java.lang.String
  var high: scala.Double | scala.Null
  var low: scala.Double | scala.Null
  var markerDisplayed: atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.on
  var markerShape: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.circle | atOracleOraclejetLib.atOracleOraclejetLibStrings.diamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.human | atOracleOraclejetLib.atOracleOraclejetLibStrings.plus | atOracleOraclejetLib.atOracleOraclejetLibStrings.square | atOracleOraclejetLib.atOracleOraclejetLibStrings.star | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleDown | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleUp | java.lang.String
  ] = js.undefined
  var markerSize: scala.Double
  var svgClassName: java.lang.String
  var svgStyle: js.Object
  var value: scala.Double | scala.Null
}

object ojSparkChartItemSettableProperties {
  @scala.inline
  def apply(
    borderColor: java.lang.String,
    color: java.lang.String,
    date: java.lang.String,
    markerDisplayed: atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.on,
    markerSize: scala.Double,
    svgClassName: java.lang.String,
    svgStyle: js.Object,
    high: scala.Int | scala.Double = null,
    low: scala.Int | scala.Double = null,
    markerShape: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.circle | atOracleOraclejetLib.atOracleOraclejetLibStrings.diamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.human | atOracleOraclejetLib.atOracleOraclejetLibStrings.plus | atOracleOraclejetLib.atOracleOraclejetLibStrings.square | atOracleOraclejetLib.atOracleOraclejetLibStrings.star | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleDown | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleUp | java.lang.String = null,
    value: scala.Int | scala.Double = null
  ): ojSparkChartItemSettableProperties = {
    val __obj = js.Dynamic.literal(borderColor = borderColor, color = color, date = date, markerDisplayed = markerDisplayed.asInstanceOf[js.Any], markerSize = markerSize, svgClassName = svgClassName, svgStyle = svgStyle)
    if (high != null) __obj.updateDynamic("high")(high.asInstanceOf[js.Any])
    if (low != null) __obj.updateDynamic("low")(low.asInstanceOf[js.Any])
    if (markerShape != null) __obj.updateDynamic("markerShape")(markerShape.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojSparkChartItemSettableProperties]
  }
}

