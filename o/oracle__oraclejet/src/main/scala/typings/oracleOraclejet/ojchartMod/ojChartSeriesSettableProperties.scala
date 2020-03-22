package typings.oracleOraclejet.ojchartMod

import typings.oracleOraclejet.AnonQ2Color
import typings.oracleOraclejet.mod.JetSettableProperties
import typings.oracleOraclejet.oracleOraclejetStrings.area
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.bar
import typings.oracleOraclejet.oracleOraclejetStrings.boxPlot
import typings.oracleOraclejet.oracleOraclejetStrings.candlestick
import typings.oracleOraclejet.oracleOraclejetStrings.centeredSegmented
import typings.oracleOraclejet.oracleOraclejetStrings.centeredStepped
import typings.oracleOraclejet.oracleOraclejetStrings.circle
import typings.oracleOraclejet.oracleOraclejetStrings.curved
import typings.oracleOraclejet.oracleOraclejetStrings.dashed
import typings.oracleOraclejet.oracleOraclejetStrings.diamond
import typings.oracleOraclejet.oracleOraclejetStrings.dotted
import typings.oracleOraclejet.oracleOraclejetStrings.human
import typings.oracleOraclejet.oracleOraclejetStrings.inherit
import typings.oracleOraclejet.oracleOraclejetStrings.largeChecker
import typings.oracleOraclejet.oracleOraclejetStrings.largeCrosshatch
import typings.oracleOraclejet.oracleOraclejetStrings.largeDiagonalLeft
import typings.oracleOraclejet.oracleOraclejetStrings.largeDiagonalRight
import typings.oracleOraclejet.oracleOraclejetStrings.largeDiamond
import typings.oracleOraclejet.oracleOraclejetStrings.largeTriangle
import typings.oracleOraclejet.oracleOraclejetStrings.line
import typings.oracleOraclejet.oracleOraclejetStrings.lineWithArea
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.plus
import typings.oracleOraclejet.oracleOraclejetStrings.segmented
import typings.oracleOraclejet.oracleOraclejetStrings.smallChecker
import typings.oracleOraclejet.oracleOraclejetStrings.smallCrosshatch
import typings.oracleOraclejet.oracleOraclejetStrings.smallDiagonalLeft
import typings.oracleOraclejet.oracleOraclejetStrings.smallDiagonalRight
import typings.oracleOraclejet.oracleOraclejetStrings.smallDiamond
import typings.oracleOraclejet.oracleOraclejetStrings.smallTriangle
import typings.oracleOraclejet.oracleOraclejetStrings.solid
import typings.oracleOraclejet.oracleOraclejetStrings.square
import typings.oracleOraclejet.oracleOraclejetStrings.star
import typings.oracleOraclejet.oracleOraclejetStrings.stepped
import typings.oracleOraclejet.oracleOraclejetStrings.straight
import typings.oracleOraclejet.oracleOraclejetStrings.triangleDown
import typings.oracleOraclejet.oracleOraclejetStrings.triangleUp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojChartSeriesSettableProperties extends JetSettableProperties {
  var areaColor: js.UndefOr[String] = js.undefined
  var areaSvgClassName: js.UndefOr[String] = js.undefined
  var areaSvgStyle: js.UndefOr[js.Object] = js.undefined
  var assignedToY2: js.UndefOr[on | off] = js.undefined
  var borderColor: js.UndefOr[String] = js.undefined
  var borderWidth: js.UndefOr[Double] = js.undefined
  var boxPlot: js.UndefOr[AnonQ2Color] = js.undefined
  var categories: js.UndefOr[js.Array[String]] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var displayInLegend: js.UndefOr[on | off | auto] = js.undefined
  var drilling: js.UndefOr[on | off | inherit] = js.undefined
  var lineStyle: js.UndefOr[dotted | dashed | solid] = js.undefined
  var lineType: js.UndefOr[
    straight | curved | stepped | centeredStepped | segmented | centeredSegmented | none | auto
  ] = js.undefined
  var lineWidth: js.UndefOr[Double] = js.undefined
  var markerColor: js.UndefOr[String] = js.undefined
  var markerDisplayed: js.UndefOr[on | off | auto] = js.undefined
  var markerShape: js.UndefOr[
    circle | diamond | human | plus | square | star | triangleDown | triangleUp | auto | String
  ] = js.undefined
  var markerSize: js.UndefOr[Double] = js.undefined
  var markerSvgClassName: js.UndefOr[String] = js.undefined
  var markerSvgStyle: js.UndefOr[js.Object] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var pattern: js.UndefOr[
    smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | auto
  ] = js.undefined
  var pieSliceExplode: js.UndefOr[Double] = js.undefined
  var shortDesc: js.UndefOr[String] = js.undefined
  var source: js.UndefOr[String] = js.undefined
  var sourceHover: js.UndefOr[String] = js.undefined
  var sourceHoverSelected: js.UndefOr[String] = js.undefined
  var sourceSelected: js.UndefOr[String] = js.undefined
  var stackCategory: js.UndefOr[String] = js.undefined
  var svgClassName: js.UndefOr[String] = js.undefined
  var svgStyle: js.UndefOr[js.Object] = js.undefined
  var `type`: js.UndefOr[bar | line | area | lineWithArea | candlestick | boxPlot | auto] = js.undefined
}

object ojChartSeriesSettableProperties {
  @scala.inline
  def apply(
    areaColor: String = null,
    areaSvgClassName: String = null,
    areaSvgStyle: js.Object = null,
    assignedToY2: on | off = null,
    borderColor: String = null,
    borderWidth: Int | Double = null,
    boxPlot: AnonQ2Color = null,
    categories: js.Array[String] = null,
    color: String = null,
    displayInLegend: on | off | auto = null,
    drilling: on | off | inherit = null,
    lineStyle: dotted | dashed | solid = null,
    lineType: straight | curved | stepped | centeredStepped | segmented | centeredSegmented | none | auto = null,
    lineWidth: Int | Double = null,
    markerColor: String = null,
    markerDisplayed: on | off | auto = null,
    markerShape: circle | diamond | human | plus | square | star | triangleDown | triangleUp | auto | String = null,
    markerSize: Int | Double = null,
    markerSvgClassName: String = null,
    markerSvgStyle: js.Object = null,
    name: String = null,
    pattern: smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | auto = null,
    pieSliceExplode: Int | Double = null,
    shortDesc: String = null,
    source: String = null,
    sourceHover: String = null,
    sourceHoverSelected: String = null,
    sourceSelected: String = null,
    stackCategory: String = null,
    svgClassName: String = null,
    svgStyle: js.Object = null,
    `type`: bar | line | area | lineWithArea | candlestick | boxPlot | auto = null
  ): ojChartSeriesSettableProperties = {
    val __obj = js.Dynamic.literal()
    if (areaColor != null) __obj.updateDynamic("areaColor")(areaColor.asInstanceOf[js.Any])
    if (areaSvgClassName != null) __obj.updateDynamic("areaSvgClassName")(areaSvgClassName.asInstanceOf[js.Any])
    if (areaSvgStyle != null) __obj.updateDynamic("areaSvgStyle")(areaSvgStyle.asInstanceOf[js.Any])
    if (assignedToY2 != null) __obj.updateDynamic("assignedToY2")(assignedToY2.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (boxPlot != null) __obj.updateDynamic("boxPlot")(boxPlot.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (displayInLegend != null) __obj.updateDynamic("displayInLegend")(displayInLegend.asInstanceOf[js.Any])
    if (drilling != null) __obj.updateDynamic("drilling")(drilling.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    if (lineType != null) __obj.updateDynamic("lineType")(lineType.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (markerColor != null) __obj.updateDynamic("markerColor")(markerColor.asInstanceOf[js.Any])
    if (markerDisplayed != null) __obj.updateDynamic("markerDisplayed")(markerDisplayed.asInstanceOf[js.Any])
    if (markerShape != null) __obj.updateDynamic("markerShape")(markerShape.asInstanceOf[js.Any])
    if (markerSize != null) __obj.updateDynamic("markerSize")(markerSize.asInstanceOf[js.Any])
    if (markerSvgClassName != null) __obj.updateDynamic("markerSvgClassName")(markerSvgClassName.asInstanceOf[js.Any])
    if (markerSvgStyle != null) __obj.updateDynamic("markerSvgStyle")(markerSvgStyle.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (pieSliceExplode != null) __obj.updateDynamic("pieSliceExplode")(pieSliceExplode.asInstanceOf[js.Any])
    if (shortDesc != null) __obj.updateDynamic("shortDesc")(shortDesc.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (sourceHover != null) __obj.updateDynamic("sourceHover")(sourceHover.asInstanceOf[js.Any])
    if (sourceHoverSelected != null) __obj.updateDynamic("sourceHoverSelected")(sourceHoverSelected.asInstanceOf[js.Any])
    if (sourceSelected != null) __obj.updateDynamic("sourceSelected")(sourceSelected.asInstanceOf[js.Any])
    if (stackCategory != null) __obj.updateDynamic("stackCategory")(stackCategory.asInstanceOf[js.Any])
    if (svgClassName != null) __obj.updateDynamic("svgClassName")(svgClassName.asInstanceOf[js.Any])
    if (svgStyle != null) __obj.updateDynamic("svgStyle")(svgStyle.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojChartSeriesSettableProperties]
  }
}

