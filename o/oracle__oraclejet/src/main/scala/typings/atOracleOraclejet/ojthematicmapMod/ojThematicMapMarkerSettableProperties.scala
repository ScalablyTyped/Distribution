package typings.atOracleOraclejet.ojthematicmapMod

import typings.atOracleOraclejet.atOracleOraclejetMod.JetSettableProperties
import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.bottom
import typings.atOracleOraclejet.atOracleOraclejetStrings.center
import typings.atOracleOraclejet.atOracleOraclejetStrings.circle
import typings.atOracleOraclejet.atOracleOraclejetStrings.diamond
import typings.atOracleOraclejet.atOracleOraclejetStrings.ellipse
import typings.atOracleOraclejet.atOracleOraclejetStrings.human
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.plus
import typings.atOracleOraclejet.atOracleOraclejetStrings.rectangle
import typings.atOracleOraclejet.atOracleOraclejetStrings.solid
import typings.atOracleOraclejet.atOracleOraclejetStrings.square
import typings.atOracleOraclejet.atOracleOraclejetStrings.star
import typings.atOracleOraclejet.atOracleOraclejetStrings.top
import typings.atOracleOraclejet.atOracleOraclejetStrings.triangleDown
import typings.atOracleOraclejet.atOracleOraclejetStrings.triangleUp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojThematicMapMarkerSettableProperties extends JetSettableProperties {
  var borderColor: String
  var borderStyle: solid | none
  var borderWidth: Double
  var categories: js.Array[String]
  var color: String
  var height: Double
  var label: String
  var labelPosition: bottom | center | top
  var labelStyle: js.Object
  var location: String
  var opacity: Double
  var rotation: Double
  var selectable: auto | off
  var shape: js.UndefOr[
    circle | diamond | ellipse | human | plus | rectangle | square | star | triangleDown | triangleUp | String
  ] = js.undefined
  var shortDesc: String
  var source: String
  var sourceHover: String
  var sourceHoverSelected: String
  var sourceSelected: String
  var svgClassName: String
  var svgStyle: js.Object
  var value: Double
  var width: Double
  var x: Double | Null
  var y: Double | Null
}

object ojThematicMapMarkerSettableProperties {
  @scala.inline
  def apply(
    borderColor: String,
    borderStyle: solid | none,
    borderWidth: Double,
    categories: js.Array[String],
    color: String,
    height: Double,
    label: String,
    labelPosition: bottom | center | top,
    labelStyle: js.Object,
    location: String,
    opacity: Double,
    rotation: Double,
    selectable: auto | off,
    shortDesc: String,
    source: String,
    sourceHover: String,
    sourceHoverSelected: String,
    sourceSelected: String,
    svgClassName: String,
    svgStyle: js.Object,
    value: Double,
    width: Double,
    shape: circle | diamond | ellipse | human | plus | rectangle | square | star | triangleDown | triangleUp | String = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): ojThematicMapMarkerSettableProperties = {
    val __obj = js.Dynamic.literal(borderColor = borderColor, borderStyle = borderStyle.asInstanceOf[js.Any], borderWidth = borderWidth, categories = categories, color = color, height = height, label = label, labelPosition = labelPosition.asInstanceOf[js.Any], labelStyle = labelStyle, location = location, opacity = opacity, rotation = rotation, selectable = selectable.asInstanceOf[js.Any], shortDesc = shortDesc, source = source, sourceHover = sourceHover, sourceHoverSelected = sourceHoverSelected, sourceSelected = sourceSelected, svgClassName = svgClassName, svgStyle = svgStyle, value = value, width = width)
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojThematicMapMarkerSettableProperties]
  }
}

