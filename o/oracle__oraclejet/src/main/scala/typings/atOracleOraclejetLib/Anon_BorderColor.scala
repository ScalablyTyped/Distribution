package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BorderColor extends js.Object {
  var borderColor: java.lang.String
  var categories: js.Array[java.lang.String]
  var categoryVisibility: atOracleOraclejetLib.atOracleOraclejetLibStrings.hidden | atOracleOraclejetLib.atOracleOraclejetLibStrings.visible
  var color: java.lang.String
  var id: java.lang.String
  var lineStyle: atOracleOraclejetLib.atOracleOraclejetLibStrings.dotted | atOracleOraclejetLib.atOracleOraclejetLibStrings.dashed | atOracleOraclejetLib.atOracleOraclejetLibStrings.solid
  var lineWidth: scala.Double
  var markerColor: java.lang.String
  var markerShape: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.circle | atOracleOraclejetLib.atOracleOraclejetLibStrings.diamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.human | atOracleOraclejetLib.atOracleOraclejetLibStrings.plus | atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.square | atOracleOraclejetLib.atOracleOraclejetLibStrings.star | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleDown | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleUp | java.lang.String
  ] = js.undefined
  var pattern: atOracleOraclejetLib.atOracleOraclejetLibStrings.smallChecker | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallCrosshatch | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiagonalLeft | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiagonalRight | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallTriangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeChecker | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeCrosshatch | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiagonalLeft | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiagonalRight | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeTriangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  var shortDesc: java.lang.String
  var source: java.lang.String
  var symbolType: atOracleOraclejetLib.atOracleOraclejetLibStrings.line | atOracleOraclejetLib.atOracleOraclejetLibStrings.lineWithMarker | atOracleOraclejetLib.atOracleOraclejetLibStrings.image | atOracleOraclejetLib.atOracleOraclejetLibStrings.marker
  var text: java.lang.String
}

object Anon_BorderColor {
  @scala.inline
  def apply(
    borderColor: java.lang.String,
    categories: js.Array[java.lang.String],
    categoryVisibility: atOracleOraclejetLib.atOracleOraclejetLibStrings.hidden | atOracleOraclejetLib.atOracleOraclejetLibStrings.visible,
    color: java.lang.String,
    id: java.lang.String,
    lineStyle: atOracleOraclejetLib.atOracleOraclejetLibStrings.dotted | atOracleOraclejetLib.atOracleOraclejetLibStrings.dashed | atOracleOraclejetLib.atOracleOraclejetLibStrings.solid,
    lineWidth: scala.Double,
    markerColor: java.lang.String,
    pattern: atOracleOraclejetLib.atOracleOraclejetLibStrings.smallChecker | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallCrosshatch | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiagonalLeft | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiagonalRight | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallTriangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeChecker | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeCrosshatch | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiagonalLeft | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiagonalRight | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeTriangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.none,
    shortDesc: java.lang.String,
    source: java.lang.String,
    symbolType: atOracleOraclejetLib.atOracleOraclejetLibStrings.line | atOracleOraclejetLib.atOracleOraclejetLibStrings.lineWithMarker | atOracleOraclejetLib.atOracleOraclejetLibStrings.image | atOracleOraclejetLib.atOracleOraclejetLibStrings.marker,
    text: java.lang.String,
    markerShape: atOracleOraclejetLib.atOracleOraclejetLibStrings.circle | atOracleOraclejetLib.atOracleOraclejetLibStrings.diamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.human | atOracleOraclejetLib.atOracleOraclejetLibStrings.plus | atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.square | atOracleOraclejetLib.atOracleOraclejetLibStrings.star | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleDown | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleUp | java.lang.String = null
  ): Anon_BorderColor = {
    val __obj = js.Dynamic.literal(borderColor = borderColor, categories = categories, categoryVisibility = categoryVisibility.asInstanceOf[js.Any], color = color, id = id, lineStyle = lineStyle.asInstanceOf[js.Any], lineWidth = lineWidth, markerColor = markerColor, pattern = pattern.asInstanceOf[js.Any], shortDesc = shortDesc, source = source, symbolType = symbolType.asInstanceOf[js.Any], text = text)
    if (markerShape != null) __obj.updateDynamic("markerShape")(markerShape.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BorderColor]
  }
}

