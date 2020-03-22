package typings.oracleOraclejet

import typings.oracleOraclejet.oracleOraclejetStrings.circle
import typings.oracleOraclejet.oracleOraclejetStrings.diamond
import typings.oracleOraclejet.oracleOraclejetStrings.ellipse
import typings.oracleOraclejet.oracleOraclejetStrings.human
import typings.oracleOraclejet.oracleOraclejetStrings.largeChecker
import typings.oracleOraclejet.oracleOraclejetStrings.largeCrosshatch
import typings.oracleOraclejet.oracleOraclejetStrings.largeDiagonalLeft
import typings.oracleOraclejet.oracleOraclejetStrings.largeDiagonalRight
import typings.oracleOraclejet.oracleOraclejetStrings.largeDiamond
import typings.oracleOraclejet.oracleOraclejetStrings.largeTriangle
import typings.oracleOraclejet.oracleOraclejetStrings.mallChecker
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.plus
import typings.oracleOraclejet.oracleOraclejetStrings.rectangle
import typings.oracleOraclejet.oracleOraclejetStrings.smallCrosshatch
import typings.oracleOraclejet.oracleOraclejetStrings.smallDiagonalLeft
import typings.oracleOraclejet.oracleOraclejetStrings.smallDiagonalRight
import typings.oracleOraclejet.oracleOraclejetStrings.smallDiamond
import typings.oracleOraclejet.oracleOraclejetStrings.smallTriangle
import typings.oracleOraclejet.oracleOraclejetStrings.square
import typings.oracleOraclejet.oracleOraclejetStrings.star
import typings.oracleOraclejet.oracleOraclejetStrings.triangleDown
import typings.oracleOraclejet.oracleOraclejetStrings.triangleUp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBorderRadiusBorderWidth extends js.Object {
  var borderColor: js.UndefOr[String] = js.undefined
  var borderRadius: js.UndefOr[String] = js.undefined
  var borderWidth: Double
  var color: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double | Null] = js.undefined
  var opacity: Double
  var pattern: js.UndefOr[
    largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | none | mallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle
  ] = js.undefined
  var shape: js.UndefOr[
    circle | diamond | ellipse | human | plus | rectangle | square | star | triangleDown | triangleUp | String
  ] = js.undefined
  var source: js.UndefOr[String] = js.undefined
  var svgClassName: String
  var svgStyle: js.UndefOr[js.Object] = js.undefined
  var width: js.UndefOr[Double | Null] = js.undefined
}

object AnonBorderRadiusBorderWidth {
  @scala.inline
  def apply(
    borderWidth: Double,
    opacity: Double,
    svgClassName: String,
    borderColor: String = null,
    borderRadius: String = null,
    color: String = null,
    height: Int | Double = null,
    pattern: largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | none | mallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle = null,
    shape: circle | diamond | ellipse | human | plus | rectangle | square | star | triangleDown | triangleUp | String = null,
    source: String = null,
    svgStyle: js.Object = null,
    width: Int | Double = null
  ): AnonBorderRadiusBorderWidth = {
    val __obj = js.Dynamic.literal(borderWidth = borderWidth.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], svgClassName = svgClassName.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (svgStyle != null) __obj.updateDynamic("svgStyle")(svgStyle.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBorderRadiusBorderWidth]
  }
}

