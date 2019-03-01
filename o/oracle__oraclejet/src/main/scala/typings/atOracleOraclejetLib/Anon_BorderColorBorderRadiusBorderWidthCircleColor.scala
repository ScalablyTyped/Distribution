package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BorderColorBorderRadiusBorderWidthCircleColor extends js.Object {
  var borderColor: js.UndefOr[java.lang.String] = js.undefined
  var borderRadius: js.UndefOr[java.lang.String] = js.undefined
  var borderWidth: scala.Double
  var color: js.UndefOr[java.lang.String] = js.undefined
  var height: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var opacity: scala.Double
  var pattern: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.largeChecker | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeCrosshatch | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiagonalLeft | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiagonalRight | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeTriangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.mallChecker | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallCrosshatch | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiagonalLeft | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiagonalRight | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallTriangle
  ] = js.undefined
  var shape: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.circle | atOracleOraclejetLib.atOracleOraclejetLibStrings.diamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.ellipse | atOracleOraclejetLib.atOracleOraclejetLibStrings.human | atOracleOraclejetLib.atOracleOraclejetLibStrings.plus | atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.square | atOracleOraclejetLib.atOracleOraclejetLibStrings.star | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleDown | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleUp | java.lang.String
  ] = js.undefined
  var source: js.UndefOr[java.lang.String] = js.undefined
  var svgClassName: java.lang.String
  var svgStyle: js.UndefOr[js.Object] = js.undefined
  var width: js.UndefOr[scala.Double | scala.Null] = js.undefined
}

object Anon_BorderColorBorderRadiusBorderWidthCircleColor {
  @scala.inline
  def apply(
    borderWidth: scala.Double,
    opacity: scala.Double,
    svgClassName: java.lang.String,
    borderColor: java.lang.String = null,
    borderRadius: java.lang.String = null,
    color: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    pattern: atOracleOraclejetLib.atOracleOraclejetLibStrings.largeChecker | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeCrosshatch | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiagonalLeft | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiagonalRight | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeTriangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.mallChecker | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallCrosshatch | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiagonalLeft | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiagonalRight | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallTriangle = null,
    shape: atOracleOraclejetLib.atOracleOraclejetLibStrings.circle | atOracleOraclejetLib.atOracleOraclejetLibStrings.diamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.ellipse | atOracleOraclejetLib.atOracleOraclejetLibStrings.human | atOracleOraclejetLib.atOracleOraclejetLibStrings.plus | atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.square | atOracleOraclejetLib.atOracleOraclejetLibStrings.star | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleDown | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleUp | java.lang.String = null,
    source: java.lang.String = null,
    svgStyle: js.Object = null,
    width: scala.Int | scala.Double = null
  ): Anon_BorderColorBorderRadiusBorderWidthCircleColor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("borderWidth")(borderWidth)
    __obj.updateDynamic("opacity")(opacity)
    __obj.updateDynamic("svgClassName")(svgClassName)
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor)
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius)
    if (color != null) __obj.updateDynamic("color")(color)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source)
    if (svgStyle != null) __obj.updateDynamic("svgStyle")(svgStyle)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BorderColorBorderRadiusBorderWidthCircleColor]
  }
}

