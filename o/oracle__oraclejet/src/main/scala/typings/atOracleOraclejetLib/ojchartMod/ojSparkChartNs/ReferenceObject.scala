package typings
package atOracleOraclejetLib.ojchartMod.ojSparkChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait ReferenceObject extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var high: js.UndefOr[scala.Double] = js.undefined
  var lineStyle: atOracleOraclejetLib.atOracleOraclejetLibStrings.dotted | atOracleOraclejetLib.atOracleOraclejetLibStrings.dashed | atOracleOraclejetLib.atOracleOraclejetLibStrings.solid
  var lineWidth: js.UndefOr[scala.Double] = js.undefined
  var location: atOracleOraclejetLib.atOracleOraclejetLibStrings.front | atOracleOraclejetLib.atOracleOraclejetLibStrings.back
  var low: js.UndefOr[scala.Double] = js.undefined
  var svgClassName: js.UndefOr[java.lang.String] = js.undefined
  var svgStyle: js.UndefOr[js.Object] = js.undefined
  var `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.area | atOracleOraclejetLib.atOracleOraclejetLibStrings.line
  var value: js.UndefOr[scala.Double] = js.undefined
}

object ReferenceObject {
  @scala.inline
  def apply(
    lineStyle: atOracleOraclejetLib.atOracleOraclejetLibStrings.dotted | atOracleOraclejetLib.atOracleOraclejetLibStrings.dashed | atOracleOraclejetLib.atOracleOraclejetLibStrings.solid,
    location: atOracleOraclejetLib.atOracleOraclejetLibStrings.front | atOracleOraclejetLib.atOracleOraclejetLibStrings.back,
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.area | atOracleOraclejetLib.atOracleOraclejetLibStrings.line,
    color: java.lang.String = null,
    high: scala.Int | scala.Double = null,
    lineWidth: scala.Int | scala.Double = null,
    low: scala.Int | scala.Double = null,
    svgClassName: java.lang.String = null,
    svgStyle: js.Object = null,
    value: scala.Int | scala.Double = null
  ): ReferenceObject = {
    val __obj = js.Dynamic.literal(lineStyle = lineStyle.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (high != null) __obj.updateDynamic("high")(high.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (low != null) __obj.updateDynamic("low")(low.asInstanceOf[js.Any])
    if (svgClassName != null) __obj.updateDynamic("svgClassName")(svgClassName)
    if (svgStyle != null) __obj.updateDynamic("svgStyle")(svgStyle)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceObject]
  }
}

