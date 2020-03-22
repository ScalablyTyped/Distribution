package typings.oracleOraclejet.ojlegendMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.oracleOraclejetStrings.circle
import typings.oracleOraclejet.oracleOraclejetStrings.dashed
import typings.oracleOraclejet.oracleOraclejetStrings.diamond
import typings.oracleOraclejet.oracleOraclejetStrings.dotted
import typings.oracleOraclejet.oracleOraclejetStrings.ellipse
import typings.oracleOraclejet.oracleOraclejetStrings.hidden
import typings.oracleOraclejet.oracleOraclejetStrings.human
import typings.oracleOraclejet.oracleOraclejetStrings.image
import typings.oracleOraclejet.oracleOraclejetStrings.inherit
import typings.oracleOraclejet.oracleOraclejetStrings.largeChecker
import typings.oracleOraclejet.oracleOraclejetStrings.largeCrosshatch
import typings.oracleOraclejet.oracleOraclejetStrings.largeDiagonalLeft
import typings.oracleOraclejet.oracleOraclejetStrings.largeDiagonalRight
import typings.oracleOraclejet.oracleOraclejetStrings.largeDiamond
import typings.oracleOraclejet.oracleOraclejetStrings.largeTriangle
import typings.oracleOraclejet.oracleOraclejetStrings.line
import typings.oracleOraclejet.oracleOraclejetStrings.lineWithMarker
import typings.oracleOraclejet.oracleOraclejetStrings.marker
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.plus
import typings.oracleOraclejet.oracleOraclejetStrings.rectangle
import typings.oracleOraclejet.oracleOraclejetStrings.smallChecker
import typings.oracleOraclejet.oracleOraclejetStrings.smallCrosshatch
import typings.oracleOraclejet.oracleOraclejetStrings.smallDiagonalLeft
import typings.oracleOraclejet.oracleOraclejetStrings.smallDiagonalRight
import typings.oracleOraclejet.oracleOraclejetStrings.smallDiamond
import typings.oracleOraclejet.oracleOraclejetStrings.smallTriangle
import typings.oracleOraclejet.oracleOraclejetStrings.solid
import typings.oracleOraclejet.oracleOraclejetStrings.square
import typings.oracleOraclejet.oracleOraclejetStrings.star
import typings.oracleOraclejet.oracleOraclejetStrings.triangleDown
import typings.oracleOraclejet.oracleOraclejetStrings.triangleUp
import typings.oracleOraclejet.oracleOraclejetStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojlegend.ojLegendItemSettableProperties> */
trait ojLegendItemSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var borderColor: js.UndefOr[String] = js.undefined
  var categories: js.UndefOr[js.Array[String]] = js.undefined
  var categoryVisibility: js.UndefOr[hidden | visible] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var drilling: js.UndefOr[on | off | inherit] = js.undefined
  var lineStyle: js.UndefOr[dotted | dashed | solid] = js.undefined
  var lineWidth: js.UndefOr[Double] = js.undefined
  var markerColor: js.UndefOr[String] = js.undefined
  var markerShape: js.UndefOr[
    circle | diamond | ellipse | human | plus | rectangle | square | star | triangleDown | triangleUp | String
  ] = js.undefined
  var markerSvgClassName: js.UndefOr[String] = js.undefined
  var markerSvgStyle: js.UndefOr[js.Object] = js.undefined
  var pattern: js.UndefOr[
    smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | none
  ] = js.undefined
  var shortDesc: js.UndefOr[String] = js.undefined
  var source: js.UndefOr[String] = js.undefined
  var svgClassName: js.UndefOr[String] = js.undefined
  var svgStyle: js.UndefOr[js.Object] = js.undefined
  var symbolType: js.UndefOr[line | lineWithMarker | image | marker] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object ojLegendItemSettablePropertiesLenient {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    borderColor: String = null,
    categories: js.Array[String] = null,
    categoryVisibility: hidden | visible = null,
    color: String = null,
    drilling: on | off | inherit = null,
    lineStyle: dotted | dashed | solid = null,
    lineWidth: Int | Double = null,
    markerColor: String = null,
    markerShape: circle | diamond | ellipse | human | plus | rectangle | square | star | triangleDown | triangleUp | String = null,
    markerSvgClassName: String = null,
    markerSvgStyle: js.Object = null,
    pattern: smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | none = null,
    shortDesc: String = null,
    source: String = null,
    svgClassName: String = null,
    svgStyle: js.Object = null,
    symbolType: line | lineWithMarker | image | marker = null,
    text: String = null
  ): ojLegendItemSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (categoryVisibility != null) __obj.updateDynamic("categoryVisibility")(categoryVisibility.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (drilling != null) __obj.updateDynamic("drilling")(drilling.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (markerColor != null) __obj.updateDynamic("markerColor")(markerColor.asInstanceOf[js.Any])
    if (markerShape != null) __obj.updateDynamic("markerShape")(markerShape.asInstanceOf[js.Any])
    if (markerSvgClassName != null) __obj.updateDynamic("markerSvgClassName")(markerSvgClassName.asInstanceOf[js.Any])
    if (markerSvgStyle != null) __obj.updateDynamic("markerSvgStyle")(markerSvgStyle.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (shortDesc != null) __obj.updateDynamic("shortDesc")(shortDesc.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (svgClassName != null) __obj.updateDynamic("svgClassName")(svgClassName.asInstanceOf[js.Any])
    if (svgStyle != null) __obj.updateDynamic("svgStyle")(svgStyle.asInstanceOf[js.Any])
    if (symbolType != null) __obj.updateDynamic("symbolType")(symbolType.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojLegendItemSettablePropertiesLenient]
  }
}

