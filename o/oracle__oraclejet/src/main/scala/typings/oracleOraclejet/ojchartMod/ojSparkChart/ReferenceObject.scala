package typings.oracleOraclejet.ojchartMod.ojSparkChart

import typings.oracleOraclejet.oracleOraclejetStrings.area
import typings.oracleOraclejet.oracleOraclejetStrings.back
import typings.oracleOraclejet.oracleOraclejetStrings.dashed
import typings.oracleOraclejet.oracleOraclejetStrings.dotted
import typings.oracleOraclejet.oracleOraclejetStrings.front
import typings.oracleOraclejet.oracleOraclejetStrings.line
import typings.oracleOraclejet.oracleOraclejetStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait ReferenceObject extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var high: js.UndefOr[Double] = js.undefined
  var lineStyle: dotted | dashed | solid
  var lineWidth: js.UndefOr[Double] = js.undefined
  var location: front | back
  var low: js.UndefOr[Double] = js.undefined
  var svgClassName: js.UndefOr[String] = js.undefined
  var svgStyle: js.UndefOr[js.Object] = js.undefined
  var `type`: area | line
  var value: js.UndefOr[Double] = js.undefined
}

object ReferenceObject {
  @scala.inline
  def apply(
    lineStyle: dotted | dashed | solid,
    location: front | back,
    `type`: area | line,
    color: String = null,
    high: js.UndefOr[Double] = js.undefined,
    lineWidth: js.UndefOr[Double] = js.undefined,
    low: js.UndefOr[Double] = js.undefined,
    svgClassName: String = null,
    svgStyle: js.Object = null,
    value: js.UndefOr[Double] = js.undefined
  ): ReferenceObject = {
    val __obj = js.Dynamic.literal(lineStyle = lineStyle.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(high)) __obj.updateDynamic("high")(high.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lineWidth)) __obj.updateDynamic("lineWidth")(lineWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(low)) __obj.updateDynamic("low")(low.get.asInstanceOf[js.Any])
    if (svgClassName != null) __obj.updateDynamic("svgClassName")(svgClassName.asInstanceOf[js.Any])
    if (svgStyle != null) __obj.updateDynamic("svgStyle")(svgStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceObject]
  }
}

