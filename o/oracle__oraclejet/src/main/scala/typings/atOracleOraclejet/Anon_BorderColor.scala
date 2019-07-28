package typings.atOracleOraclejet

import typings.atOracleOraclejet.atOracleOraclejetStrings.circle
import typings.atOracleOraclejet.atOracleOraclejetStrings.dashed
import typings.atOracleOraclejet.atOracleOraclejetStrings.diamond
import typings.atOracleOraclejet.atOracleOraclejetStrings.dotted
import typings.atOracleOraclejet.atOracleOraclejetStrings.hidden
import typings.atOracleOraclejet.atOracleOraclejetStrings.human
import typings.atOracleOraclejet.atOracleOraclejetStrings.image
import typings.atOracleOraclejet.atOracleOraclejetStrings.largeChecker
import typings.atOracleOraclejet.atOracleOraclejetStrings.largeCrosshatch
import typings.atOracleOraclejet.atOracleOraclejetStrings.largeDiagonalLeft
import typings.atOracleOraclejet.atOracleOraclejetStrings.largeDiagonalRight
import typings.atOracleOraclejet.atOracleOraclejetStrings.largeDiamond
import typings.atOracleOraclejet.atOracleOraclejetStrings.largeTriangle
import typings.atOracleOraclejet.atOracleOraclejetStrings.line
import typings.atOracleOraclejet.atOracleOraclejetStrings.lineWithMarker
import typings.atOracleOraclejet.atOracleOraclejetStrings.marker
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.plus
import typings.atOracleOraclejet.atOracleOraclejetStrings.rectangle
import typings.atOracleOraclejet.atOracleOraclejetStrings.smallChecker
import typings.atOracleOraclejet.atOracleOraclejetStrings.smallCrosshatch
import typings.atOracleOraclejet.atOracleOraclejetStrings.smallDiagonalLeft
import typings.atOracleOraclejet.atOracleOraclejetStrings.smallDiagonalRight
import typings.atOracleOraclejet.atOracleOraclejetStrings.smallDiamond
import typings.atOracleOraclejet.atOracleOraclejetStrings.smallTriangle
import typings.atOracleOraclejet.atOracleOraclejetStrings.solid
import typings.atOracleOraclejet.atOracleOraclejetStrings.square
import typings.atOracleOraclejet.atOracleOraclejetStrings.star
import typings.atOracleOraclejet.atOracleOraclejetStrings.triangleDown
import typings.atOracleOraclejet.atOracleOraclejetStrings.triangleUp
import typings.atOracleOraclejet.atOracleOraclejetStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BorderColor extends js.Object {
  var borderColor: String
  var categories: js.Array[String]
  var categoryVisibility: hidden | visible
  var color: String
  var id: String
  var lineStyle: dotted | dashed | solid
  var lineWidth: Double
  var markerColor: String
  var markerShape: js.UndefOr[
    circle | diamond | human | plus | rectangle | square | star | triangleDown | triangleUp | String
  ] = js.undefined
  var pattern: smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | none
  var shortDesc: String
  var source: String
  var symbolType: line | lineWithMarker | image | marker
  var text: String
}

object Anon_BorderColor {
  @scala.inline
  def apply(
    borderColor: String,
    categories: js.Array[String],
    categoryVisibility: hidden | visible,
    color: String,
    id: String,
    lineStyle: dotted | dashed | solid,
    lineWidth: Double,
    markerColor: String,
    pattern: smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | none,
    shortDesc: String,
    source: String,
    symbolType: line | lineWithMarker | image | marker,
    text: String,
    markerShape: circle | diamond | human | plus | rectangle | square | star | triangleDown | triangleUp | String = null
  ): Anon_BorderColor = {
    val __obj = js.Dynamic.literal(borderColor = borderColor, categories = categories, categoryVisibility = categoryVisibility.asInstanceOf[js.Any], color = color, id = id, lineStyle = lineStyle.asInstanceOf[js.Any], lineWidth = lineWidth, markerColor = markerColor, pattern = pattern.asInstanceOf[js.Any], shortDesc = shortDesc, source = source, symbolType = symbolType.asInstanceOf[js.Any], text = text)
    if (markerShape != null) __obj.updateDynamic("markerShape")(markerShape.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BorderColor]
  }
}

