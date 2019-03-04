package typings
package atOracleOraclejetLib.ojthematicmapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojThematicMapAreaSettableProperties
  extends atOracleOraclejetLib.atOracleOraclejetMod.JetSettableProperties {
  var categories: js.Array[java.lang.String]
  var color: java.lang.String
  var label: java.lang.String
  var labelStyle: js.Object
  var location: java.lang.String
  var opacity: scala.Double
  var selectable: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
  var shortDesc: java.lang.String
  var svgClassName: java.lang.String
  var svgStyle: js.Object
}

object ojThematicMapAreaSettableProperties {
  @scala.inline
  def apply(
    categories: js.Array[java.lang.String],
    color: java.lang.String,
    label: java.lang.String,
    labelStyle: js.Object,
    location: java.lang.String,
    opacity: scala.Double,
    selectable: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.off,
    shortDesc: java.lang.String,
    svgClassName: java.lang.String,
    svgStyle: js.Object
  ): ojThematicMapAreaSettableProperties = {
    val __obj = js.Dynamic.literal(categories = categories, color = color, label = label, labelStyle = labelStyle, location = location, opacity = opacity, selectable = selectable.asInstanceOf[js.Any], shortDesc = shortDesc, svgClassName = svgClassName, svgStyle = svgStyle)
  
    __obj.asInstanceOf[ojThematicMapAreaSettableProperties]
  }
}

