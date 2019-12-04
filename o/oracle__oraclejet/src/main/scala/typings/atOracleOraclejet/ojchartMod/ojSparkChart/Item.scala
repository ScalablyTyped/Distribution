package typings.atOracleOraclejet.ojchartMod.ojSparkChart

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
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait Item extends js.Object {
  var borderColor: String
  var color: String
  var date: Date
  var high: Double
  var low: Double
  var markerDisplayed: on | off
  var markerShape: square | circle | diamond | plus | triangleDown | triangleUp | human | star | auto | String
  var markerSize: Double
  var svgClassName: String
  var svgStyle: js.Object
  var value: Double
}

object Item {
  @scala.inline
  def apply(
    borderColor: String,
    color: String,
    date: Date,
    high: Double,
    low: Double,
    markerDisplayed: on | off,
    markerShape: square | circle | diamond | plus | triangleDown | triangleUp | human | star | auto | String,
    markerSize: Double,
    svgClassName: String,
    svgStyle: js.Object,
    value: Double
  ): Item = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], high = high.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any], markerDisplayed = markerDisplayed.asInstanceOf[js.Any], markerShape = markerShape.asInstanceOf[js.Any], markerSize = markerSize.asInstanceOf[js.Any], svgClassName = svgClassName.asInstanceOf[js.Any], svgStyle = svgStyle.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Item]
  }
}

