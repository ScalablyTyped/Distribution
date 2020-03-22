package typings.oracleOraclejet.ojchartMod

import typings.oracleOraclejet.AnonMedianSvgStyle
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
  var boxPlot: js.UndefOr[AnonMedianSvgStyle] = js.undefined
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
    borderWidth: Int | Double = null,
    boxPlot: AnonMedianSvgStyle = null,
    categories: js.Array[String] = null,
    close: Int | Double = null,
    color: String = null,
    drilling: on | off | inherit = null,
    high: Int | Double = null,
    items: js.Array[Double | js.Object] = null,
    label: String | js.Array[String] = null,
    labelPosition: center | outsideSlice | aboveMarker | belowMarker | beforeMarker | afterMarker | insideBarEdge | outsideBarEdge | none | auto = null,
    labelStyle: js.Object | js.Array[js.Object] = null,
    low: Int | Double = null,
    markerDisplayed: on | off | auto = null,
    markerShape: circle | diamond | human | plus | square | star | triangleDown | triangleUp | auto | String = null,
    markerSize: Int | Double = null,
    open: Int | Double = null,
    pattern: smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | auto = null,
    q1: Int | Double = null,
    q2: Int | Double = null,
    q3: Int | Double = null,
    shortDesc: String = null,
    source: String = null,
    sourceHover: String = null,
    sourceHoverSelected: String = null,
    sourceSelected: String = null,
    svgClassName: String = null,
    svgStyle: js.Object = null,
    targetValue: Int | Double = null,
    value: Int | Double = null,
    volume: Int | Double = null,
    x: Double | String = null,
    y: Int | Double = null,
    z: Int | Double = null
  ): ojChartItemSettableProperties = {
    val __obj = js.Dynamic.literal(groupId = groupId.asInstanceOf[js.Any], seriesId = seriesId.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (boxPlot != null) __obj.updateDynamic("boxPlot")(boxPlot.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (close != null) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (drilling != null) __obj.updateDynamic("drilling")(drilling.asInstanceOf[js.Any])
    if (high != null) __obj.updateDynamic("high")(high.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelPosition != null) __obj.updateDynamic("labelPosition")(labelPosition.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    if (low != null) __obj.updateDynamic("low")(low.asInstanceOf[js.Any])
    if (markerDisplayed != null) __obj.updateDynamic("markerDisplayed")(markerDisplayed.asInstanceOf[js.Any])
    if (markerShape != null) __obj.updateDynamic("markerShape")(markerShape.asInstanceOf[js.Any])
    if (markerSize != null) __obj.updateDynamic("markerSize")(markerSize.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (q1 != null) __obj.updateDynamic("q1")(q1.asInstanceOf[js.Any])
    if (q2 != null) __obj.updateDynamic("q2")(q2.asInstanceOf[js.Any])
    if (q3 != null) __obj.updateDynamic("q3")(q3.asInstanceOf[js.Any])
    if (shortDesc != null) __obj.updateDynamic("shortDesc")(shortDesc.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (sourceHover != null) __obj.updateDynamic("sourceHover")(sourceHover.asInstanceOf[js.Any])
    if (sourceHoverSelected != null) __obj.updateDynamic("sourceHoverSelected")(sourceHoverSelected.asInstanceOf[js.Any])
    if (sourceSelected != null) __obj.updateDynamic("sourceSelected")(sourceSelected.asInstanceOf[js.Any])
    if (svgClassName != null) __obj.updateDynamic("svgClassName")(svgClassName.asInstanceOf[js.Any])
    if (svgStyle != null) __obj.updateDynamic("svgStyle")(svgStyle.asInstanceOf[js.Any])
    if (targetValue != null) __obj.updateDynamic("targetValue")(targetValue.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (volume != null) __obj.updateDynamic("volume")(volume.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojChartItemSettableProperties]
  }
}

