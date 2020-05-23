package typings.oracleOraclejet.ojchartMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.LabelAndValue
import typings.oracleOraclejet.anon.`0`
import typings.oracleOraclejet.ojchartMod.ojSparkChart.ReferenceObject
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.oracleOraclejetStrings.area
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.bar
import typings.oracleOraclejet.oracleOraclejetStrings.centeredSegmented
import typings.oracleOraclejet.oracleOraclejetStrings.centeredStepped
import typings.oracleOraclejet.oracleOraclejetStrings.circle
import typings.oracleOraclejet.oracleOraclejetStrings.curved
import typings.oracleOraclejet.oracleOraclejetStrings.dashed
import typings.oracleOraclejet.oracleOraclejetStrings.diamond
import typings.oracleOraclejet.oracleOraclejetStrings.dotted
import typings.oracleOraclejet.oracleOraclejetStrings.human
import typings.oracleOraclejet.oracleOraclejetStrings.line
import typings.oracleOraclejet.oracleOraclejetStrings.lineWithArea
import typings.oracleOraclejet.oracleOraclejetStrings.min
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.plus
import typings.oracleOraclejet.oracleOraclejetStrings.segmented
import typings.oracleOraclejet.oracleOraclejetStrings.solid
import typings.oracleOraclejet.oracleOraclejetStrings.square
import typings.oracleOraclejet.oracleOraclejetStrings.star
import typings.oracleOraclejet.oracleOraclejetStrings.stepped
import typings.oracleOraclejet.oracleOraclejetStrings.straight
import typings.oracleOraclejet.oracleOraclejetStrings.triangleDown
import typings.oracleOraclejet.oracleOraclejetStrings.triangleUp
import typings.oracleOraclejet.oracleOraclejetStrings.zero
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojchart.ojSparkChartSettableProperties<K, D>> */
trait ojSparkChartSettablePropertiesLenient[K, D]
  extends /* key */ StringDictionary[js.Any] {
  var animationDuration: js.UndefOr[Double] = js.undefined
  var animationOnDataChange: js.UndefOr[auto | none] = js.undefined
  var animationOnDisplay: js.UndefOr[auto | none] = js.undefined
  var areaColor: js.UndefOr[String] = js.undefined
  var areaSvgClassName: js.UndefOr[String] = js.undefined
  var areaSvgStyle: js.UndefOr[js.Object] = js.undefined
  var as: js.UndefOr[String] = js.undefined
  var barGapRatio: js.UndefOr[Double] = js.undefined
  var baselineScaling: js.UndefOr[zero | min] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[DataProvider[K, D]] = js.undefined
  var firstColor: js.UndefOr[String] = js.undefined
  var highColor: js.UndefOr[String] = js.undefined
  var lastColor: js.UndefOr[String] = js.undefined
  var lineStyle: js.UndefOr[dotted | dashed | solid] = js.undefined
  var lineType: js.UndefOr[
    curved | stepped | centeredStepped | segmented | centeredSegmented | none | straight
  ] = js.undefined
  var lineWidth: js.UndefOr[Double] = js.undefined
  var lowColor: js.UndefOr[String] = js.undefined
  var markerShape: js.UndefOr[
    auto | circle | diamond | human | plus | square | star | triangleDown | triangleUp | String
  ] = js.undefined
  var markerSize: js.UndefOr[Double] = js.undefined
  var referenceObjects: js.UndefOr[js.Array[ReferenceObject]] = js.undefined
  var svgClassName: js.UndefOr[String] = js.undefined
  var svgStyle: js.UndefOr[js.Object] = js.undefined
  var tooltip: js.UndefOr[`0`] = js.undefined
  var trackResize: js.UndefOr[on | off] = js.undefined
  var translations: js.UndefOr[LabelAndValue] = js.undefined
  var `type`: js.UndefOr[area | lineWithArea | bar | line] = js.undefined
  var visualEffects: js.UndefOr[none | auto] = js.undefined
}

object ojSparkChartSettablePropertiesLenient {
  @scala.inline
  def apply[K, D](
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    animationDuration: js.UndefOr[Double] = js.undefined,
    animationOnDataChange: auto | none = null,
    animationOnDisplay: auto | none = null,
    areaColor: String = null,
    areaSvgClassName: String = null,
    areaSvgStyle: js.Object = null,
    as: String = null,
    barGapRatio: js.UndefOr[Double] = js.undefined,
    baselineScaling: zero | min = null,
    color: String = null,
    data: DataProvider[K, D] = null,
    firstColor: String = null,
    highColor: String = null,
    lastColor: String = null,
    lineStyle: dotted | dashed | solid = null,
    lineType: curved | stepped | centeredStepped | segmented | centeredSegmented | none | straight = null,
    lineWidth: js.UndefOr[Double] = js.undefined,
    lowColor: String = null,
    markerShape: auto | circle | diamond | human | plus | square | star | triangleDown | triangleUp | String = null,
    markerSize: js.UndefOr[Double] = js.undefined,
    referenceObjects: js.Array[ReferenceObject] = null,
    svgClassName: String = null,
    svgStyle: js.Object = null,
    tooltip: `0` = null,
    trackResize: on | off = null,
    translations: LabelAndValue = null,
    `type`: area | lineWithArea | bar | line = null,
    visualEffects: none | auto = null
  ): ojSparkChartSettablePropertiesLenient[K, D] = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(animationDuration)) __obj.updateDynamic("animationDuration")(animationDuration.get.asInstanceOf[js.Any])
    if (animationOnDataChange != null) __obj.updateDynamic("animationOnDataChange")(animationOnDataChange.asInstanceOf[js.Any])
    if (animationOnDisplay != null) __obj.updateDynamic("animationOnDisplay")(animationOnDisplay.asInstanceOf[js.Any])
    if (areaColor != null) __obj.updateDynamic("areaColor")(areaColor.asInstanceOf[js.Any])
    if (areaSvgClassName != null) __obj.updateDynamic("areaSvgClassName")(areaSvgClassName.asInstanceOf[js.Any])
    if (areaSvgStyle != null) __obj.updateDynamic("areaSvgStyle")(areaSvgStyle.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (!js.isUndefined(barGapRatio)) __obj.updateDynamic("barGapRatio")(barGapRatio.get.asInstanceOf[js.Any])
    if (baselineScaling != null) __obj.updateDynamic("baselineScaling")(baselineScaling.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (firstColor != null) __obj.updateDynamic("firstColor")(firstColor.asInstanceOf[js.Any])
    if (highColor != null) __obj.updateDynamic("highColor")(highColor.asInstanceOf[js.Any])
    if (lastColor != null) __obj.updateDynamic("lastColor")(lastColor.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    if (lineType != null) __obj.updateDynamic("lineType")(lineType.asInstanceOf[js.Any])
    if (!js.isUndefined(lineWidth)) __obj.updateDynamic("lineWidth")(lineWidth.get.asInstanceOf[js.Any])
    if (lowColor != null) __obj.updateDynamic("lowColor")(lowColor.asInstanceOf[js.Any])
    if (markerShape != null) __obj.updateDynamic("markerShape")(markerShape.asInstanceOf[js.Any])
    if (!js.isUndefined(markerSize)) __obj.updateDynamic("markerSize")(markerSize.get.asInstanceOf[js.Any])
    if (referenceObjects != null) __obj.updateDynamic("referenceObjects")(referenceObjects.asInstanceOf[js.Any])
    if (svgClassName != null) __obj.updateDynamic("svgClassName")(svgClassName.asInstanceOf[js.Any])
    if (svgStyle != null) __obj.updateDynamic("svgStyle")(svgStyle.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (trackResize != null) __obj.updateDynamic("trackResize")(trackResize.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (visualEffects != null) __obj.updateDynamic("visualEffects")(visualEffects.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojSparkChartSettablePropertiesLenient[K, D]]
  }
}

