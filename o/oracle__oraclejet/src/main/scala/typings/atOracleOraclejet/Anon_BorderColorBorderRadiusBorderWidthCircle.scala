package typings.atOracleOraclejet

import typings.atOracleOraclejet.atOracleOraclejetStrings.circle
import typings.atOracleOraclejet.atOracleOraclejetStrings.diamond
import typings.atOracleOraclejet.atOracleOraclejetStrings.ellipse
import typings.atOracleOraclejet.atOracleOraclejetStrings.human
import typings.atOracleOraclejet.atOracleOraclejetStrings.largeChecker
import typings.atOracleOraclejet.atOracleOraclejetStrings.largeCrosshatch
import typings.atOracleOraclejet.atOracleOraclejetStrings.largeDiagonalLeft
import typings.atOracleOraclejet.atOracleOraclejetStrings.largeDiagonalRight
import typings.atOracleOraclejet.atOracleOraclejetStrings.largeDiamond
import typings.atOracleOraclejet.atOracleOraclejetStrings.largeTriangle
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.plus
import typings.atOracleOraclejet.atOracleOraclejetStrings.rectangle
import typings.atOracleOraclejet.atOracleOraclejetStrings.smallChecker
import typings.atOracleOraclejet.atOracleOraclejetStrings.smallCrosshatch
import typings.atOracleOraclejet.atOracleOraclejetStrings.smallDiagonalLeft
import typings.atOracleOraclejet.atOracleOraclejetStrings.smallDiagonalRight
import typings.atOracleOraclejet.atOracleOraclejetStrings.smallDiamond
import typings.atOracleOraclejet.atOracleOraclejetStrings.smallTriangle
import typings.atOracleOraclejet.atOracleOraclejetStrings.square
import typings.atOracleOraclejet.atOracleOraclejetStrings.star
import typings.atOracleOraclejet.atOracleOraclejetStrings.triangleDown
import typings.atOracleOraclejet.atOracleOraclejetStrings.triangleUp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BorderColorBorderRadiusBorderWidthCircle extends js.Object {
  var borderColor: String
  var borderRadius: String
  var borderWidth: Double
  var color: String
  var height: Double
  var opacity: Double
  var pattern: smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | none
  var shape: circle | ellipse | square | plus | diamond | triangleUp | triangleDown | human | rectangle | star
  var source: String
  var width: Double
}

object Anon_BorderColorBorderRadiusBorderWidthCircle {
  @scala.inline
  def apply(
    borderColor: String,
    borderRadius: String,
    borderWidth: Double,
    color: String,
    height: Double,
    opacity: Double,
    pattern: smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | none,
    shape: circle | ellipse | square | plus | diamond | triangleUp | triangleDown | human | rectangle | star,
    source: String,
    width: Double
  ): Anon_BorderColorBorderRadiusBorderWidthCircle = {
    val __obj = js.Dynamic.literal(borderColor = borderColor, borderRadius = borderRadius, borderWidth = borderWidth, color = color, height = height, opacity = opacity, pattern = pattern.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], source = source, width = width)
  
    __obj.asInstanceOf[Anon_BorderColorBorderRadiusBorderWidthCircle]
  }
}

