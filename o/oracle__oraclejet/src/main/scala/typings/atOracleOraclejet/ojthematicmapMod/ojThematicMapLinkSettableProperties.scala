package typings.atOracleOraclejet.ojthematicmapMod

import typings.atOracleOraclejet.Anon_IdLocation
import typings.atOracleOraclejet.atOracleOraclejetMod.JetSettableProperties
import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojThematicMapLinkSettableProperties extends JetSettableProperties {
  var categories: js.Array[String]
  var color: String
  var endLocation: Anon_IdLocation
  var selectable: auto | off
  var shortDesc: String
  var startLocation: Anon_IdLocation
  var svgClassName: String
  var svgStyle: js.Object
  var width: Double
}

object ojThematicMapLinkSettableProperties {
  @scala.inline
  def apply(
    categories: js.Array[String],
    color: String,
    endLocation: Anon_IdLocation,
    selectable: auto | off,
    shortDesc: String,
    startLocation: Anon_IdLocation,
    svgClassName: String,
    svgStyle: js.Object,
    width: Double
  ): ojThematicMapLinkSettableProperties = {
    val __obj = js.Dynamic.literal(categories = categories, color = color, endLocation = endLocation, selectable = selectable.asInstanceOf[js.Any], shortDesc = shortDesc, startLocation = startLocation, svgClassName = svgClassName, svgStyle = svgStyle, width = width)
  
    __obj.asInstanceOf[ojThematicMapLinkSettableProperties]
  }
}

