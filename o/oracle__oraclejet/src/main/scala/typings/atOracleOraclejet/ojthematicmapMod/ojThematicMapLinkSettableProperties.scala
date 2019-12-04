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
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], endLocation = endLocation.asInstanceOf[js.Any], selectable = selectable.asInstanceOf[js.Any], shortDesc = shortDesc.asInstanceOf[js.Any], startLocation = startLocation.asInstanceOf[js.Any], svgClassName = svgClassName.asInstanceOf[js.Any], svgStyle = svgStyle.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ojThematicMapLinkSettableProperties]
  }
}

