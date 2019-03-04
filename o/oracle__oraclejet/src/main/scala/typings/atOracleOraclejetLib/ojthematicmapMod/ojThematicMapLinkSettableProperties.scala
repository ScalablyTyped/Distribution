package typings
package atOracleOraclejetLib.ojthematicmapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojThematicMapLinkSettableProperties
  extends atOracleOraclejetLib.atOracleOraclejetMod.JetSettableProperties {
  var categories: js.Array[java.lang.String]
  var color: java.lang.String
  var endLocation: atOracleOraclejetLib.Anon_IdLocation
  var selectable: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
  var shortDesc: java.lang.String
  var startLocation: atOracleOraclejetLib.Anon_IdLocation
  var svgClassName: java.lang.String
  var svgStyle: js.Object
  var width: scala.Double
}

object ojThematicMapLinkSettableProperties {
  @scala.inline
  def apply(
    categories: js.Array[java.lang.String],
    color: java.lang.String,
    endLocation: atOracleOraclejetLib.Anon_IdLocation,
    selectable: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.off,
    shortDesc: java.lang.String,
    startLocation: atOracleOraclejetLib.Anon_IdLocation,
    svgClassName: java.lang.String,
    svgStyle: js.Object,
    width: scala.Double
  ): ojThematicMapLinkSettableProperties = {
    val __obj = js.Dynamic.literal(categories = categories, color = color, endLocation = endLocation, selectable = selectable.asInstanceOf[js.Any], shortDesc = shortDesc, startLocation = startLocation, svgClassName = svgClassName, svgStyle = svgStyle, width = width)
  
    __obj.asInstanceOf[ojThematicMapLinkSettableProperties]
  }
}

