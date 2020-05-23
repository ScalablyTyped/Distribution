package typings.oracleOraclejet.ojchartMod

import typings.oracleOraclejet.anon.MedianSvgStyle
import typings.oracleOraclejet.mod.JetSettableProperties
import typings.oracleOraclejet.oracleOraclejetStrings.aboveMarker
import typings.oracleOraclejet.oracleOraclejetStrings.afterMarker
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.beforeMarker
import typings.oracleOraclejet.oracleOraclejetStrings.belowMarker
import typings.oracleOraclejet.oracleOraclejetStrings.center
import typings.oracleOraclejet.oracleOraclejetStrings.circle
import typings.oracleOraclejet.oracleOraclejetStrings.diamond
import typings.oracleOraclejet.oracleOraclejetStrings.human
import typings.oracleOraclejet.oracleOraclejetStrings.inherit
import typings.oracleOraclejet.oracleOraclejetStrings.insideBarEdge
import typings.oracleOraclejet.oracleOraclejetStrings.largeChecker
import typings.oracleOraclejet.oracleOraclejetStrings.largeCrosshatch
import typings.oracleOraclejet.oracleOraclejetStrings.largeDiagonalLeft
import typings.oracleOraclejet.oracleOraclejetStrings.largeDiagonalRight
import typings.oracleOraclejet.oracleOraclejetStrings.largeDiamond
import typings.oracleOraclejet.oracleOraclejetStrings.largeTriangle
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.outsideBarEdge
import typings.oracleOraclejet.oracleOraclejetStrings.outsideSlice
import typings.oracleOraclejet.oracleOraclejetStrings.plus
import typings.oracleOraclejet.oracleOraclejetStrings.smallChecker
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

trait ojChartItemSettableProperties extends JetSettableProperties {
  var borderColor: js.UndefOr[String] = js.undefined
  var borderWidth: js.UndefOr[Double] = js.undefined
  var boxPlot: js.UndefOr[MedianSvgStyle] = js.undefined
  var categories: js.UndefOr[js.Array[String]] = js.undefined
  var close: js.UndefOr[Double] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var drilling: js.UndefOr[on | off | inherit] = js.undefined
  var groupId: js.Array[String | Double]
  var high: js.UndefOr[Double] = js.undefined
  var items: js.UndefOr[js.Array[Double | js.Object]] = js.undefined
  var label: js.UndefOr[String | js.Array[String]] = js.undefined
  var labelPosition: js.UndefOr[
    center | outsideSlice | aboveMarker | belowMarker | beforeMarker | afterMarker | insideBarEdge | outsideBarEdge | none | auto
  ] = js.undefined
  var labelStyle: js.UndefOr[js.Object | js.Array[js.Object]] = js.undefined
  var low: js.UndefOr[Double] = js.undefined
  var markerDisplayed: js.UndefOr[on | off | auto] = js.undefined
  var markerShape: js.UndefOr[
    circle | diamond | human | plus | square | star | triangleDown | triangleUp | auto | String
  ] = js.undefined
  var markerSize: js.UndefOr[Double] = js.undefined
  var open: js.UndefOr[Double] = js.undefined
  var pattern: js.UndefOr[
    smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | auto
  ] = js.undefined
  var q1: js.UndefOr[Double] = js.undefined
  var q2: js.UndefOr[Double] = js.undefined
  var q3: js.UndefOr[Double] = js.undefined
  var seriesId: String | Double
  var shortDesc: js.UndefOr[String] = js.undefined
  var source: js.UndefOr[String] = js.undefined
  var sourceHover: js.UndefOr[String] = js.undefined
  var sourceHoverSelected: js.UndefOr[String] = js.undefined
  var sourceSelected: js.UndefOr[String] = js.undefined
  var svgClassName: js.UndefOr[String] = js.undefined
  var svgStyle: js.UndefOr[js.Object] = js.undefined
  var targetValue: js.UndefOr[Double] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
  var volume: js.UndefOr[Double] = js.undefined
  var x: js.UndefOr[Double | String] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
  var z: js.UndefOr[Double] = js.undefined
}

object ojChartItemSettableProperties {
  @scala.inline
  def apply(
    groupId: js.Array[String | Double],
    seriesId: String | Double,
    borderColor: String = null,
    borderWidth: js.UndefOr[Double] = js.undefined,
    boxPlot: MedianSvgStyle = null,
    categories: js.Array[String] = null,
    close: js.UndefOr[Double] = js.undefined,
    color: String = null,
    drilling: on | off | inherit = null,
    high: js.UndefOr[Double] = js.undefined,
    items: js.Array[Double | js.Object] = null,
    label: String | js.Array[String] = null,
    labelPosition: center | outsideSlice | aboveMarker | belowMarker | beforeMarker | afterMarker | insideBarEdge | outsideBarEdge | none | auto = null,
    labelStyle: js.Object | js.Array[js.Object] = null,
    low: js.UndefOr[Double] = js.undefined,
    markerDisplayed: on | off | auto = null,
    markerShape: circle | diamond | human | plus | square | star | triangleDown | triangleUp | auto | String = null,
    markerSize: js.UndefOr[Double] = js.undefined,
    open: js.UndefOr[Double] = js.undefined,
    pattern: smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | auto = null,
    q1: js.UndefOr[Double] = js.undefined,
    q2: js.UndefOr[Double] = js.undefined,
    q3: js.UndefOr[Double] = js.undefined,
    shortDesc: String = null,
    source: String = null,
    sourceHover: String = null,
    sourceHoverSelected: String = null,
    sourceSelected: String = null,
    svgClassName: String = null,
    svgStyle: js.Object = null,
    targetValue: js.UndefOr[Double] = js.undefined,
    value: js.UndefOr[Double] = js.undefined,
    volume: js.UndefOr[Double] = js.undefined,
    x: Double | String = null,
    y: js.UndefOr[Double] = js.undefined,
    z: js.UndefOr[Double] = js.undefined
  ): ojChartItemSettableProperties = {
    val __obj = js.Dynamic.literal(groupId = groupId.asInstanceOf[js.Any], seriesId = seriesId.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(borderWidth)) __obj.updateDynamic("borderWidth")(borderWidth.get.asInstanceOf[js.Any])
    if (boxPlot != null) __obj.updateDynamic("boxPlot")(boxPlot.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (!js.isUndefined(close)) __obj.updateDynamic("close")(close.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (drilling != null) __obj.updateDynamic("drilling")(drilling.asInstanceOf[js.Any])
    if (!js.isUndefined(high)) __obj.updateDynamic("high")(high.get.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelPosition != null) __obj.updateDynamic("labelPosition")(labelPosition.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(low)) __obj.updateDynamic("low")(low.get.asInstanceOf[js.Any])
    if (markerDisplayed != null) __obj.updateDynamic("markerDisplayed")(markerDisplayed.asInstanceOf[js.Any])
    if (markerShape != null) __obj.updateDynamic("markerShape")(markerShape.asInstanceOf[js.Any])
    if (!js.isUndefined(markerSize)) __obj.updateDynamic("markerSize")(markerSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.get.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (!js.isUndefined(q1)) __obj.updateDynamic("q1")(q1.get.asInstanceOf[js.Any])
    if (!js.isUndefined(q2)) __obj.updateDynamic("q2")(q2.get.asInstanceOf[js.Any])
    if (!js.isUndefined(q3)) __obj.updateDynamic("q3")(q3.get.asInstanceOf[js.Any])
    if (shortDesc != null) __obj.updateDynamic("shortDesc")(shortDesc.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (sourceHover != null) __obj.updateDynamic("sourceHover")(sourceHover.asInstanceOf[js.Any])
    if (sourceHoverSelected != null) __obj.updateDynamic("sourceHoverSelected")(sourceHoverSelected.asInstanceOf[js.Any])
    if (sourceSelected != null) __obj.updateDynamic("sourceSelected")(sourceSelected.asInstanceOf[js.Any])
    if (svgClassName != null) __obj.updateDynamic("svgClassName")(svgClassName.asInstanceOf[js.Any])
    if (svgStyle != null) __obj.updateDynamic("svgStyle")(svgStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(targetValue)) __obj.updateDynamic("targetValue")(targetValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    if (!js.isUndefined(volume)) __obj.updateDynamic("volume")(volume.get.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    if (!js.isUndefined(z)) __obj.updateDynamic("z")(z.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojChartItemSettableProperties]
  }
}

