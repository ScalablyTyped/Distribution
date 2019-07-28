package typings.atOracleOraclejet

import typings.atOracleOraclejet.atOracleOraclejetStrings.area
import typings.atOracleOraclejet.atOracleOraclejetStrings.back
import typings.atOracleOraclejet.atOracleOraclejetStrings.centeredSegmented
import typings.atOracleOraclejet.atOracleOraclejetStrings.centeredStepped
import typings.atOracleOraclejet.atOracleOraclejetStrings.curved
import typings.atOracleOraclejet.atOracleOraclejetStrings.dashed
import typings.atOracleOraclejet.atOracleOraclejetStrings.dotted
import typings.atOracleOraclejet.atOracleOraclejetStrings.front
import typings.atOracleOraclejet.atOracleOraclejetStrings.line
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.on
import typings.atOracleOraclejet.atOracleOraclejetStrings.segmented
import typings.atOracleOraclejet.atOracleOraclejetStrings.solid
import typings.atOracleOraclejet.atOracleOraclejetStrings.stepped
import typings.atOracleOraclejet.atOracleOraclejetStrings.straight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Area extends js.Object {
  var categories: js.Array[String]
  var color: String
  var displayInLegend: on | off
  var high: Double
  var id: String
  var lineStyle: dotted | dashed | solid
  var lineType: curved | stepped | centeredStepped | segmented | centeredSegmented | straight
  var lineWidth: Double
  var location: front | back
  var low: Double
  var shortDesc: String
  var svgClassName: String
  var svgStyle: js.Object
  var text: String
  var `type`: area | line
  var value: Double
}

object Anon_Area {
  @scala.inline
  def apply(
    categories: js.Array[String],
    color: String,
    displayInLegend: on | off,
    high: Double,
    id: String,
    lineStyle: dotted | dashed | solid,
    lineType: curved | stepped | centeredStepped | segmented | centeredSegmented | straight,
    lineWidth: Double,
    location: front | back,
    low: Double,
    shortDesc: String,
    svgClassName: String,
    svgStyle: js.Object,
    text: String,
    `type`: area | line,
    value: Double
  ): Anon_Area = {
    val __obj = js.Dynamic.literal(categories = categories, color = color, displayInLegend = displayInLegend.asInstanceOf[js.Any], high = high, id = id, lineStyle = lineStyle.asInstanceOf[js.Any], lineType = lineType.asInstanceOf[js.Any], lineWidth = lineWidth, location = location.asInstanceOf[js.Any], low = low, shortDesc = shortDesc, svgClassName = svgClassName, svgStyle = svgStyle, text = text, value = value)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Area]
  }
}

