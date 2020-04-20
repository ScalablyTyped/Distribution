package typings.oracleOraclejet.ojthematicmapMod

import typings.oracleOraclejet.mod.JetSettableProperties
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.off
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
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelStyle = labelStyle.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], selectable = selectable.asInstanceOf[js.Any], shortDesc = shortDesc.asInstanceOf[js.Any], svgClassName = svgClassName.asInstanceOf[js.Any], svgStyle = svgStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojThematicMapAreaSettableProperties]
  }
}

