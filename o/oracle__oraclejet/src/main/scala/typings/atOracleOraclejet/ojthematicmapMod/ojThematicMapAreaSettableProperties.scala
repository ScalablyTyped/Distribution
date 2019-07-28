package typings.atOracleOraclejet.ojthematicmapMod

import typings.atOracleOraclejet.atOracleOraclejetMod.JetSettableProperties
import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojThematicMapAreaSettableProperties extends JetSettableProperties {
  var categories: js.Array[String]
  var color: String
  var label: String
  var labelStyle: js.Object
  var location: String
  var opacity: Double
  var selectable: auto | off
  var shortDesc: String
  var svgClassName: String
  var svgStyle: js.Object
}

object ojThematicMapAreaSettableProperties {
  @scala.inline
  def apply(
    categories: js.Array[String],
    color: String,
    label: String,
    labelStyle: js.Object,
    location: String,
    opacity: Double,
    selectable: auto | off,
    shortDesc: String,
    svgClassName: String,
    svgStyle: js.Object
  ): ojThematicMapAreaSettableProperties = {
    val __obj = js.Dynamic.literal(categories = categories, color = color, label = label, labelStyle = labelStyle, location = location, opacity = opacity, selectable = selectable.asInstanceOf[js.Any], shortDesc = shortDesc, svgClassName = svgClassName, svgStyle = svgStyle)
  
    __obj.asInstanceOf[ojThematicMapAreaSettableProperties]
  }
}

