package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Area extends js.Object {
  var categories: js.Array[java.lang.String]
  var color: java.lang.String
  var displayInLegend: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
  var high: scala.Double
  var id: java.lang.String
  var lineStyle: atOracleOraclejetLib.atOracleOraclejetLibStrings.dotted | atOracleOraclejetLib.atOracleOraclejetLibStrings.dashed | atOracleOraclejetLib.atOracleOraclejetLibStrings.solid
  var lineType: atOracleOraclejetLib.atOracleOraclejetLibStrings.curved | atOracleOraclejetLib.atOracleOraclejetLibStrings.stepped | atOracleOraclejetLib.atOracleOraclejetLibStrings.centeredStepped | atOracleOraclejetLib.atOracleOraclejetLibStrings.segmented | atOracleOraclejetLib.atOracleOraclejetLibStrings.centeredSegmented | atOracleOraclejetLib.atOracleOraclejetLibStrings.straight
  var lineWidth: scala.Double
  var location: atOracleOraclejetLib.atOracleOraclejetLibStrings.front | atOracleOraclejetLib.atOracleOraclejetLibStrings.back
  var low: scala.Double
  var shortDesc: java.lang.String
  var svgClassName: java.lang.String
  var svgStyle: js.Object
  var text: java.lang.String
  var `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.area | atOracleOraclejetLib.atOracleOraclejetLibStrings.line
  var value: scala.Double
}

object Anon_Area {
  @scala.inline
  def apply(
    categories: js.Array[java.lang.String],
    color: java.lang.String,
    displayInLegend: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off,
    high: scala.Double,
    id: java.lang.String,
    lineStyle: atOracleOraclejetLib.atOracleOraclejetLibStrings.dotted | atOracleOraclejetLib.atOracleOraclejetLibStrings.dashed | atOracleOraclejetLib.atOracleOraclejetLibStrings.solid,
    lineType: atOracleOraclejetLib.atOracleOraclejetLibStrings.curved | atOracleOraclejetLib.atOracleOraclejetLibStrings.stepped | atOracleOraclejetLib.atOracleOraclejetLibStrings.centeredStepped | atOracleOraclejetLib.atOracleOraclejetLibStrings.segmented | atOracleOraclejetLib.atOracleOraclejetLibStrings.centeredSegmented | atOracleOraclejetLib.atOracleOraclejetLibStrings.straight,
    lineWidth: scala.Double,
    location: atOracleOraclejetLib.atOracleOraclejetLibStrings.front | atOracleOraclejetLib.atOracleOraclejetLibStrings.back,
    low: scala.Double,
    shortDesc: java.lang.String,
    svgClassName: java.lang.String,
    svgStyle: js.Object,
    text: java.lang.String,
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.area | atOracleOraclejetLib.atOracleOraclejetLibStrings.line,
    value: scala.Double
  ): Anon_Area = {
    val __obj = js.Dynamic.literal(categories = categories, color = color, displayInLegend = displayInLegend.asInstanceOf[js.Any], high = high, id = id, lineStyle = lineStyle.asInstanceOf[js.Any], lineType = lineType.asInstanceOf[js.Any], lineWidth = lineWidth, location = location.asInstanceOf[js.Any], low = low, shortDesc = shortDesc, svgClassName = svgClassName, svgStyle = svgStyle, text = text, value = value)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Area]
  }
}

