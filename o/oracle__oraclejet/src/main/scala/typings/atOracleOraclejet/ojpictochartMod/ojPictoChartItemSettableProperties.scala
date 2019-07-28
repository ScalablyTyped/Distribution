package typings.atOracleOraclejet.ojpictochartMod

import typings.atOracleOraclejet.atOracleOraclejetMod.JetSettableProperties
import typings.atOracleOraclejet.atOracleOraclejetStrings.circle
import typings.atOracleOraclejet.atOracleOraclejetStrings.diamond
import typings.atOracleOraclejet.atOracleOraclejetStrings.human
import typings.atOracleOraclejet.atOracleOraclejetStrings.inherit
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.on
import typings.atOracleOraclejet.atOracleOraclejetStrings.plus
import typings.atOracleOraclejet.atOracleOraclejetStrings.rectangle
import typings.atOracleOraclejet.atOracleOraclejetStrings.square
import typings.atOracleOraclejet.atOracleOraclejetStrings.star
import typings.atOracleOraclejet.atOracleOraclejetStrings.triangleDown
import typings.atOracleOraclejet.atOracleOraclejetStrings.triangleUp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojPictoChartItemSettableProperties extends JetSettableProperties {
  var borderColor: String
  var borderWidth: Double
  var categories: js.Array[String]
  var color: String
  var columnSpan: Double
  var count: Double
  var drilling: inherit | off | on
  var name: String
  var rowSpan: Double
  var shape: js.UndefOr[
    circle | diamond | human | plus | rectangle | square | star | triangleDown | triangleUp | none | String
  ] = js.undefined
  var shortDesc: String
  var source: String
  var sourceHover: String
  var sourceHoverSelected: String
  var sourceSelected: String
  var svgClassName: String
  var svgStyle: js.Object
}

object ojPictoChartItemSettableProperties {
  @scala.inline
  def apply(
    borderColor: String,
    borderWidth: Double,
    categories: js.Array[String],
    color: String,
    columnSpan: Double,
    count: Double,
    drilling: inherit | off | on,
    name: String,
    rowSpan: Double,
    shortDesc: String,
    source: String,
    sourceHover: String,
    sourceHoverSelected: String,
    sourceSelected: String,
    svgClassName: String,
    svgStyle: js.Object,
    shape: circle | diamond | human | plus | rectangle | square | star | triangleDown | triangleUp | none | String = null
  ): ojPictoChartItemSettableProperties = {
    val __obj = js.Dynamic.literal(borderColor = borderColor, borderWidth = borderWidth, categories = categories, color = color, columnSpan = columnSpan, count = count, drilling = drilling.asInstanceOf[js.Any], name = name, rowSpan = rowSpan, shortDesc = shortDesc, source = source, sourceHover = sourceHover, sourceHoverSelected = sourceHoverSelected, sourceSelected = sourceSelected, svgClassName = svgClassName, svgStyle = svgStyle)
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojPictoChartItemSettableProperties]
  }
}

