package typings
package atOracleOraclejetLib.ojchartMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojChartItemSettableProperties
  extends atOracleOraclejetLib.atOracleOraclejetMod.JetSettableProperties {
  var borderColor: js.UndefOr[java.lang.String] = js.undefined
  var borderWidth: js.UndefOr[scala.Double] = js.undefined
  var boxPlot: js.UndefOr[atOracleOraclejetLib.Anon_MedianSvgClassNameMedianSvgStyle] = js.undefined
  var categories: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var close: js.UndefOr[scala.Double] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var drilling: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.inherit
  ] = js.undefined
  var groupId: js.Array[java.lang.String | scala.Double]
  var high: js.UndefOr[scala.Double] = js.undefined
  var items: js.UndefOr[js.Array[js.Object] | js.Array[scala.Double]] = js.undefined
  var label: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var labelPosition: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.center | atOracleOraclejetLib.atOracleOraclejetLibStrings.outsideSlice | atOracleOraclejetLib.atOracleOraclejetLibStrings.aboveMarker | atOracleOraclejetLib.atOracleOraclejetLibStrings.belowMarker | atOracleOraclejetLib.atOracleOraclejetLibStrings.beforeMarker | atOracleOraclejetLib.atOracleOraclejetLibStrings.afterMarker | atOracleOraclejetLib.atOracleOraclejetLibStrings.insideBarEdge | atOracleOraclejetLib.atOracleOraclejetLibStrings.outsideBarEdge | atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ] = js.undefined
  var labelStyle: js.UndefOr[js.Object | js.Array[js.Object]] = js.undefined
  var low: js.UndefOr[scala.Double] = js.undefined
  var markerDisplayed: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ] = js.undefined
  var markerShape: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.circle | atOracleOraclejetLib.atOracleOraclejetLibStrings.diamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.human | atOracleOraclejetLib.atOracleOraclejetLibStrings.plus | atOracleOraclejetLib.atOracleOraclejetLibStrings.square | atOracleOraclejetLib.atOracleOraclejetLibStrings.star | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleDown | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleUp | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | java.lang.String
  ] = js.undefined
  var markerSize: js.UndefOr[scala.Double] = js.undefined
  var open: js.UndefOr[scala.Double] = js.undefined
  var pattern: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.smallChecker | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallCrosshatch | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiagonalLeft | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiagonalRight | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallTriangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeChecker | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeCrosshatch | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiagonalLeft | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiagonalRight | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeTriangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ] = js.undefined
  var q1: js.UndefOr[scala.Double] = js.undefined
  var q2: js.UndefOr[scala.Double] = js.undefined
  var q3: js.UndefOr[scala.Double] = js.undefined
  var seriesId: java.lang.String | scala.Double
  var shortDesc: js.UndefOr[java.lang.String] = js.undefined
  var source: js.UndefOr[java.lang.String] = js.undefined
  var sourceHover: js.UndefOr[java.lang.String] = js.undefined
  var sourceHoverSelected: js.UndefOr[java.lang.String] = js.undefined
  var sourceSelected: js.UndefOr[java.lang.String] = js.undefined
  var svgClassName: js.UndefOr[java.lang.String] = js.undefined
  var svgStyle: js.UndefOr[js.Object] = js.undefined
  var targetValue: js.UndefOr[scala.Double] = js.undefined
  var value: js.UndefOr[scala.Double] = js.undefined
  var volume: js.UndefOr[scala.Double] = js.undefined
  var x: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var y: js.UndefOr[scala.Double] = js.undefined
  var z: js.UndefOr[scala.Double] = js.undefined
}

object ojChartItemSettableProperties {
  @scala.inline
  def apply(
    groupId: js.Array[java.lang.String | scala.Double],
    seriesId: java.lang.String | scala.Double,
    borderColor: java.lang.String = null,
    borderWidth: scala.Int | scala.Double = null,
    boxPlot: atOracleOraclejetLib.Anon_MedianSvgClassNameMedianSvgStyle = null,
    categories: js.Array[java.lang.String] = null,
    close: scala.Int | scala.Double = null,
    color: java.lang.String = null,
    drilling: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.inherit = null,
    high: scala.Int | scala.Double = null,
    items: js.Array[js.Object] | js.Array[scala.Double] = null,
    label: java.lang.String | js.Array[java.lang.String] = null,
    labelPosition: atOracleOraclejetLib.atOracleOraclejetLibStrings.center | atOracleOraclejetLib.atOracleOraclejetLibStrings.outsideSlice | atOracleOraclejetLib.atOracleOraclejetLibStrings.aboveMarker | atOracleOraclejetLib.atOracleOraclejetLibStrings.belowMarker | atOracleOraclejetLib.atOracleOraclejetLibStrings.beforeMarker | atOracleOraclejetLib.atOracleOraclejetLibStrings.afterMarker | atOracleOraclejetLib.atOracleOraclejetLibStrings.insideBarEdge | atOracleOraclejetLib.atOracleOraclejetLibStrings.outsideBarEdge | atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto = null,
    labelStyle: js.Object | js.Array[js.Object] = null,
    low: scala.Int | scala.Double = null,
    markerDisplayed: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto = null,
    markerShape: atOracleOraclejetLib.atOracleOraclejetLibStrings.circle | atOracleOraclejetLib.atOracleOraclejetLibStrings.diamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.human | atOracleOraclejetLib.atOracleOraclejetLibStrings.plus | atOracleOraclejetLib.atOracleOraclejetLibStrings.square | atOracleOraclejetLib.atOracleOraclejetLibStrings.star | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleDown | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleUp | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | java.lang.String = null,
    markerSize: scala.Int | scala.Double = null,
    open: scala.Int | scala.Double = null,
    pattern: atOracleOraclejetLib.atOracleOraclejetLibStrings.smallChecker | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallCrosshatch | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiagonalLeft | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiagonalRight | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallDiamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.smallTriangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeChecker | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeCrosshatch | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiagonalLeft | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiagonalRight | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeDiamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.largeTriangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto = null,
    q1: scala.Int | scala.Double = null,
    q2: scala.Int | scala.Double = null,
    q3: scala.Int | scala.Double = null,
    shortDesc: java.lang.String = null,
    source: java.lang.String = null,
    sourceHover: java.lang.String = null,
    sourceHoverSelected: java.lang.String = null,
    sourceSelected: java.lang.String = null,
    svgClassName: java.lang.String = null,
    svgStyle: js.Object = null,
    targetValue: scala.Int | scala.Double = null,
    value: scala.Int | scala.Double = null,
    volume: scala.Int | scala.Double = null,
    x: scala.Double | java.lang.String = null,
    y: scala.Int | scala.Double = null,
    z: scala.Int | scala.Double = null
  ): ojChartItemSettableProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("groupId")(groupId)
    __obj.updateDynamic("seriesId")(seriesId.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor)
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (boxPlot != null) __obj.updateDynamic("boxPlot")(boxPlot)
    if (categories != null) __obj.updateDynamic("categories")(categories)
    if (close != null) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
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
    if (shortDesc != null) __obj.updateDynamic("shortDesc")(shortDesc)
    if (source != null) __obj.updateDynamic("source")(source)
    if (sourceHover != null) __obj.updateDynamic("sourceHover")(sourceHover)
    if (sourceHoverSelected != null) __obj.updateDynamic("sourceHoverSelected")(sourceHoverSelected)
    if (sourceSelected != null) __obj.updateDynamic("sourceSelected")(sourceSelected)
    if (svgClassName != null) __obj.updateDynamic("svgClassName")(svgClassName)
    if (svgStyle != null) __obj.updateDynamic("svgStyle")(svgStyle)
    if (targetValue != null) __obj.updateDynamic("targetValue")(targetValue.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (volume != null) __obj.updateDynamic("volume")(volume.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojChartItemSettableProperties]
  }
}

