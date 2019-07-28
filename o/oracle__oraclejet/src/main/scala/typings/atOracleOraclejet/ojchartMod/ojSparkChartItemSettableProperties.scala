package typings.atOracleOraclejet.ojchartMod

import typings.atOracleOraclejet.atOracleOraclejetMod.JetSettableProperties
import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.circle
import typings.atOracleOraclejet.atOracleOraclejetStrings.diamond
import typings.atOracleOraclejet.atOracleOraclejetStrings.human
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.on
import typings.atOracleOraclejet.atOracleOraclejetStrings.plus
import typings.atOracleOraclejet.atOracleOraclejetStrings.square
import typings.atOracleOraclejet.atOracleOraclejetStrings.star
import typings.atOracleOraclejet.atOracleOraclejetStrings.triangleDown
import typings.atOracleOraclejet.atOracleOraclejetStrings.triangleUp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojSparkChartItemSettableProperties extends JetSettableProperties {
  var borderColor: String
  var color: String
  var date: String
  var high: Double | Null
  var low: Double | Null
  var markerDisplayed: off | on
  var markerShape: js.UndefOr[
    auto | circle | diamond | human | plus | square | star | triangleDown | triangleUp | String
  ] = js.undefined
  var markerSize: Double
  var svgClassName: String
  var svgStyle: js.Object
  var value: Double | Null
}

object ojSparkChartItemSettableProperties {
  @scala.inline
  def apply(
    borderColor: String,
    color: String,
    date: String,
    markerDisplayed: off | on,
    markerSize: Double,
    svgClassName: String,
    svgStyle: js.Object,
    high: Int | Double = null,
    low: Int | Double = null,
    markerShape: auto | circle | diamond | human | plus | square | star | triangleDown | triangleUp | String = null,
    value: Int | Double = null
  ): ojSparkChartItemSettableProperties = {
    val __obj = js.Dynamic.literal(borderColor = borderColor, color = color, date = date, markerDisplayed = markerDisplayed.asInstanceOf[js.Any], markerSize = markerSize, svgClassName = svgClassName, svgStyle = svgStyle)
    if (high != null) __obj.updateDynamic("high")(high.asInstanceOf[js.Any])
    if (low != null) __obj.updateDynamic("low")(low.asInstanceOf[js.Any])
    if (markerShape != null) __obj.updateDynamic("markerShape")(markerShape.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojSparkChartItemSettableProperties]
  }
}

