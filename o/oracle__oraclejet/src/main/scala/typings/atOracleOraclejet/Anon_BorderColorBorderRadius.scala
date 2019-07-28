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

trait Anon_BorderColorBorderRadius extends js.Object {
  var borderColor: String
  var borderRadius: String
  var borderWidth: Double
  var color: String
  var height: Double
  var pattern: smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | none
  var shape: js.UndefOr[
    circle | diamond | ellipse | human | plus | rectangle | square | star | triangleDown | triangleUp | String
  ] = js.undefined
  var source: String
  var sourceHover: String
  var sourceHoverSelected: String
  var sourceSelected: String
  var svgClassName: String
  var svgStyle: js.Object
  var width: Double
}

object Anon_BorderColorBorderRadius {
  @scala.inline
  def apply(
    borderColor: String,
    borderRadius: String,
    borderWidth: Double,
    color: String,
    height: Double,
    pattern: smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | none,
    source: String,
    sourceHover: String,
    sourceHoverSelected: String,
    sourceSelected: String,
    svgClassName: String,
    svgStyle: js.Object,
    width: Double,
    shape: circle | diamond | ellipse | human | plus | rectangle | square | star | triangleDown | triangleUp | String = null
  ): Anon_BorderColorBorderRadius = {
    val __obj = js.Dynamic.literal(borderColor = borderColor, borderRadius = borderRadius, borderWidth = borderWidth, color = color, height = height, pattern = pattern.asInstanceOf[js.Any], source = source, sourceHover = sourceHover, sourceHoverSelected = sourceHoverSelected, sourceSelected = sourceSelected, svgClassName = svgClassName, svgStyle = svgStyle, width = width)
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BorderColorBorderRadius]
  }
}

