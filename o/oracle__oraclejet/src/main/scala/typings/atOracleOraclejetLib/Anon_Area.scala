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
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("categories")(categories)
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("displayInLegend")(displayInLegend.asInstanceOf[js.Any])
    __obj.updateDynamic("high")(high)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    __obj.updateDynamic("lineType")(lineType.asInstanceOf[js.Any])
    __obj.updateDynamic("lineWidth")(lineWidth)
    __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.updateDynamic("low")(low)
    __obj.updateDynamic("shortDesc")(shortDesc)
    __obj.updateDynamic("svgClassName")(svgClassName)
    __obj.updateDynamic("svgStyle")(svgStyle)
    __obj.updateDynamic("text")(text)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_Area]
  }
}

