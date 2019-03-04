package typings
package atOracleOraclejetLib.ojlegendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojLegendItemSettableProperties
  extends atOracleOraclejetLib.atOracleOraclejetMod.JetSettableProperties {
  var borderColor: js.UndefOr[java.lang.String] = js.undefined
  var categories: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var categoryVisibility: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.hidden | atOracleOraclejetLib.atOracleOraclejetLibStrings.visible
  ] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var drilling: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.inherit
  ] = js.undefined
  var lineStyle: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.dotted | atOracleOraclejetLib.atOracleOraclejetLibStrings.dashed | atOracleOraclejetLib.atOracleOraclejetLibStrings.solid
  ] = js.undefined
  var lineWidth: js.UndefOr[scala.Double] = js.undefined
  var markerColor: js.UndefOr[java.lang.String] = js.undefined
  var markerShape: atOracleOraclejetLib.atOracleOraclejetLibStrings.circle | atOracleOraclejetLib.atOracleOraclejetLibStrings.diamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.ellipse | atOracleOraclejetLib.atOracleOraclejetLibStrings.human | atOracleOraclejetLib.atOracleOraclejetLibStrings.plus | atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.square | atOracleOraclejetLib.atOracleOraclejetLibStrings.star | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleDown | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleUp | java.lang.String
  var markerSvgClassName: js.UndefOr[java.lang.String] = js.undefined
  var markerSvgStyle: js.UndefOr[js.Object] = js.undefined
  var pattern: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.smallChecker | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallCrosshatch | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiagonalLeft | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiagonalRight | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallTriangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeChecker | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeCrosshatch | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiagonalLeft | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiagonalRight | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeTriangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ] = js.undefined
  var shortDesc: js.UndefOr[java.lang.String] = js.undefined
  var source: js.UndefOr[java.lang.String] = js.undefined
  var svgClassName: js.UndefOr[java.lang.String] = js.undefined
  var svgStyle: js.UndefOr[js.Object] = js.undefined
  var symbolType: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.line | atOracleOraclejetLib.atOracleOraclejetLibStrings.lineWithMarker | atOracleOraclejetLib.atOracleOraclejetLibStrings.image | atOracleOraclejetLib.atOracleOraclejetLibStrings.marker
  ] = js.undefined
  var text: java.lang.String
}

object ojLegendItemSettableProperties {
  @scala.inline
  def apply(
    markerShape: atOracleOraclejetLib.atOracleOraclejetLibStrings.circle | atOracleOraclejetLib.atOracleOraclejetLibStrings.diamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.ellipse | atOracleOraclejetLib.atOracleOraclejetLibStrings.human | atOracleOraclejetLib.atOracleOraclejetLibStrings.plus | atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.square | atOracleOraclejetLib.atOracleOraclejetLibStrings.star | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleDown | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleUp | java.lang.String,
    text: java.lang.String,
    borderColor: java.lang.String = null,
    categories: js.Array[java.lang.String] = null,
    categoryVisibility: atOracleOraclejetLib.atOracleOraclejetLibStrings.hidden | atOracleOraclejetLib.atOracleOraclejetLibStrings.visible = null,
    color: java.lang.String = null,
    drilling: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.inherit = null,
    lineStyle: atOracleOraclejetLib.atOracleOraclejetLibStrings.dotted | atOracleOraclejetLib.atOracleOraclejetLibStrings.dashed | atOracleOraclejetLib.atOracleOraclejetLibStrings.solid = null,
    lineWidth: scala.Int | scala.Double = null,
    markerColor: java.lang.String = null,
    markerSvgClassName: java.lang.String = null,
    markerSvgStyle: js.Object = null,
    pattern: atOracleOraclejetLib.atOracleOraclejetLibStrings.smallChecker | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallCrosshatch | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiagonalLeft | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiagonalRight | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallTriangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeChecker | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeCrosshatch | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiagonalLeft | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiagonalRight | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeTriangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = null,
    shortDesc: java.lang.String = null,
    source: java.lang.String = null,
    svgClassName: java.lang.String = null,
    svgStyle: js.Object = null,
    symbolType: atOracleOraclejetLib.atOracleOraclejetLibStrings.line | atOracleOraclejetLib.atOracleOraclejetLibStrings.lineWithMarker | atOracleOraclejetLib.atOracleOraclejetLibStrings.image | atOracleOraclejetLib.atOracleOraclejetLibStrings.marker = null
  ): ojLegendItemSettableProperties = {
    val __obj = js.Dynamic.literal(markerShape = markerShape.asInstanceOf[js.Any], text = text)
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor)
    if (categories != null) __obj.updateDynamic("categories")(categories)
    if (categoryVisibility != null) __obj.updateDynamic("categoryVisibility")(categoryVisibility.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (drilling != null) __obj.updateDynamic("drilling")(drilling.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (markerColor != null) __obj.updateDynamic("markerColor")(markerColor)
    if (markerSvgClassName != null) __obj.updateDynamic("markerSvgClassName")(markerSvgClassName)
    if (markerSvgStyle != null) __obj.updateDynamic("markerSvgStyle")(markerSvgStyle)
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (shortDesc != null) __obj.updateDynamic("shortDesc")(shortDesc)
    if (source != null) __obj.updateDynamic("source")(source)
    if (svgClassName != null) __obj.updateDynamic("svgClassName")(svgClassName)
    if (svgStyle != null) __obj.updateDynamic("svgStyle")(svgStyle)
    if (symbolType != null) __obj.updateDynamic("symbolType")(symbolType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojLegendItemSettableProperties]
  }
}

