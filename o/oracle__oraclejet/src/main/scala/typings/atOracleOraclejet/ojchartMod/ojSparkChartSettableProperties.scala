package typings.atOracleOraclejet.ojchartMod

import typings.atOracleOraclejet.Anon_ComponentNameLabelAndValue
import typings.atOracleOraclejet.Anon_ContextRenderer
import typings.atOracleOraclejet.atOracleOraclejetStrings.area
import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.bar
import typings.atOracleOraclejet.atOracleOraclejetStrings.centeredSegmented
import typings.atOracleOraclejet.atOracleOraclejetStrings.centeredStepped
import typings.atOracleOraclejet.atOracleOraclejetStrings.circle
import typings.atOracleOraclejet.atOracleOraclejetStrings.curved
import typings.atOracleOraclejet.atOracleOraclejetStrings.dashed
import typings.atOracleOraclejet.atOracleOraclejetStrings.diamond
import typings.atOracleOraclejet.atOracleOraclejetStrings.dotted
import typings.atOracleOraclejet.atOracleOraclejetStrings.human
import typings.atOracleOraclejet.atOracleOraclejetStrings.line
import typings.atOracleOraclejet.atOracleOraclejetStrings.lineWithArea
import typings.atOracleOraclejet.atOracleOraclejetStrings.min
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.on
import typings.atOracleOraclejet.atOracleOraclejetStrings.plus
import typings.atOracleOraclejet.atOracleOraclejetStrings.segmented
import typings.atOracleOraclejet.atOracleOraclejetStrings.solid
import typings.atOracleOraclejet.atOracleOraclejetStrings.square
import typings.atOracleOraclejet.atOracleOraclejetStrings.star
import typings.atOracleOraclejet.atOracleOraclejetStrings.stepped
import typings.atOracleOraclejet.atOracleOraclejetStrings.straight
import typings.atOracleOraclejet.atOracleOraclejetStrings.triangleDown
import typings.atOracleOraclejet.atOracleOraclejetStrings.triangleUp
import typings.atOracleOraclejet.atOracleOraclejetStrings.zero
import typings.atOracleOraclejet.ojchartMod.ojSparkChart.ReferenceObject
import typings.atOracleOraclejet.ojdataproviderMod.DataProvider
import typings.atOracleOraclejet.ojdvtDashBaseMod.dvtBaseComponentSettableProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojSparkChartSettableProperties[K, D] extends dvtBaseComponentSettableProperties {
  var animationDuration: Double | Null
  var animationOnDataChange: auto | none
  var animationOnDisplay: auto | none
  var areaColor: String
  var areaSvgClassName: String
  var areaSvgStyle: js.Object
  var as: String
  var barGapRatio: Double
  var baselineScaling: zero | min
  var color: String
  var data: (DataProvider[K, D]) | Null
  var firstColor: String
  var highColor: String
  var lastColor: String
  var lineStyle: dotted | dashed | solid
  var lineType: curved | stepped | centeredStepped | segmented | centeredSegmented | none | straight
  var lineWidth: Double
  var lowColor: String
  var markerShape: auto | circle | diamond | human | plus | square | star | triangleDown | triangleUp | String
  var markerSize: Double
  var referenceObjects: js.Array[ReferenceObject]
  var svgClassName: String
  var svgStyle: js.Object
  var tooltip: Anon_ContextRenderer
  @JSName("translations")
  var translations_ojSparkChartSettableProperties: Anon_ComponentNameLabelAndValue
  var `type`: area | lineWithArea | bar | line
  var visualEffects: none | auto
}

object ojSparkChartSettableProperties {
  @scala.inline
  def apply[K, D](
    animationOnDataChange: auto | none,
    animationOnDisplay: auto | none,
    areaColor: String,
    areaSvgClassName: String,
    areaSvgStyle: js.Object,
    as: String,
    barGapRatio: Double,
    baselineScaling: zero | min,
    color: String,
    firstColor: String,
    highColor: String,
    lastColor: String,
    lineStyle: dotted | dashed | solid,
    lineType: curved | stepped | centeredStepped | segmented | centeredSegmented | none | straight,
    lineWidth: Double,
    lowColor: String,
    markerShape: auto | circle | diamond | human | plus | square | star | triangleDown | triangleUp | String,
    markerSize: Double,
    referenceObjects: js.Array[ReferenceObject],
    svgClassName: String,
    svgStyle: js.Object,
    tooltip: Anon_ContextRenderer,
    trackResize: on | off,
    translations: Anon_ComponentNameLabelAndValue,
    `type`: area | lineWithArea | bar | line,
    visualEffects: none | auto,
    animationDuration: Int | Double = null,
    data: DataProvider[K, D] = null
  ): ojSparkChartSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(animationOnDataChange = animationOnDataChange.asInstanceOf[js.Any], animationOnDisplay = animationOnDisplay.asInstanceOf[js.Any], areaColor = areaColor.asInstanceOf[js.Any], areaSvgClassName = areaSvgClassName.asInstanceOf[js.Any], areaSvgStyle = areaSvgStyle.asInstanceOf[js.Any], as = as.asInstanceOf[js.Any], barGapRatio = barGapRatio.asInstanceOf[js.Any], baselineScaling = baselineScaling.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], firstColor = firstColor.asInstanceOf[js.Any], highColor = highColor.asInstanceOf[js.Any], lastColor = lastColor.asInstanceOf[js.Any], lineStyle = lineStyle.asInstanceOf[js.Any], lineType = lineType.asInstanceOf[js.Any], lineWidth = lineWidth.asInstanceOf[js.Any], lowColor = lowColor.asInstanceOf[js.Any], markerShape = markerShape.asInstanceOf[js.Any], markerSize = markerSize.asInstanceOf[js.Any], referenceObjects = referenceObjects.asInstanceOf[js.Any], svgClassName = svgClassName.asInstanceOf[js.Any], svgStyle = svgStyle.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], visualEffects = visualEffects.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojSparkChartSettableProperties[K, D]]
  }
}

