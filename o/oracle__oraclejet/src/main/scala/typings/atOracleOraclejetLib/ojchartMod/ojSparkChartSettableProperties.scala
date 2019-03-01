package typings
package atOracleOraclejetLib.ojchartMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojSparkChartSettableProperties[K, D]
  extends atOracleOraclejetLib.ojdvtDashBaseMod.dvtBaseComponentSettableProperties {
  var animationDuration: scala.Double | scala.Null
  var animationOnDataChange: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  var animationOnDisplay: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  var areaColor: java.lang.String
  var areaSvgClassName: java.lang.String
  var areaSvgStyle: js.Object
  var as: java.lang.String
  var barGapRatio: scala.Double
  var baselineScaling: atOracleOraclejetLib.atOracleOraclejetLibStrings.zero | atOracleOraclejetLib.atOracleOraclejetLibStrings.min
  var color: java.lang.String
  var data: (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null
  var firstColor: java.lang.String
  var highColor: java.lang.String
  var lastColor: java.lang.String
  var lineStyle: atOracleOraclejetLib.atOracleOraclejetLibStrings.dotted | atOracleOraclejetLib.atOracleOraclejetLibStrings.dashed | atOracleOraclejetLib.atOracleOraclejetLibStrings.solid
  var lineType: atOracleOraclejetLib.atOracleOraclejetLibStrings.curved | atOracleOraclejetLib.atOracleOraclejetLibStrings.stepped | atOracleOraclejetLib.atOracleOraclejetLibStrings.centeredStepped | atOracleOraclejetLib.atOracleOraclejetLibStrings.segmented | atOracleOraclejetLib.atOracleOraclejetLibStrings.centeredSegmented | atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.straight
  var lineWidth: scala.Double
  var lowColor: java.lang.String
  var markerShape: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.circle | atOracleOraclejetLib.atOracleOraclejetLibStrings.diamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.human | atOracleOraclejetLib.atOracleOraclejetLibStrings.plus | atOracleOraclejetLib.atOracleOraclejetLibStrings.square | atOracleOraclejetLib.atOracleOraclejetLibStrings.star | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleDown | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleUp | java.lang.String
  var markerSize: scala.Double
  var referenceObjects: js.Array[atOracleOraclejetLib.ojchartMod.ojSparkChartNs.ReferenceObject]
  var svgClassName: java.lang.String
  var svgStyle: js.Object
  var tooltip: atOracleOraclejetLib.Anon_ContextRenderer
  @JSName("translations")
  var translations_ojSparkChartSettableProperties: atOracleOraclejetLib.Anon_ComponentNameLabelAndValue
  var `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.area | atOracleOraclejetLib.atOracleOraclejetLibStrings.lineWithArea | atOracleOraclejetLib.atOracleOraclejetLibStrings.bar | atOracleOraclejetLib.atOracleOraclejetLibStrings.line
  var visualEffects: atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
}

object ojSparkChartSettableProperties {
  @scala.inline
  def apply[K, D](
    animationOnDataChange: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none,
    animationOnDisplay: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none,
    areaColor: java.lang.String,
    areaSvgClassName: java.lang.String,
    areaSvgStyle: js.Object,
    as: java.lang.String,
    barGapRatio: scala.Double,
    baselineScaling: atOracleOraclejetLib.atOracleOraclejetLibStrings.zero | atOracleOraclejetLib.atOracleOraclejetLibStrings.min,
    color: java.lang.String,
    firstColor: java.lang.String,
    highColor: java.lang.String,
    lastColor: java.lang.String,
    lineStyle: atOracleOraclejetLib.atOracleOraclejetLibStrings.dotted | atOracleOraclejetLib.atOracleOraclejetLibStrings.dashed | atOracleOraclejetLib.atOracleOraclejetLibStrings.solid,
    lineType: atOracleOraclejetLib.atOracleOraclejetLibStrings.curved | atOracleOraclejetLib.atOracleOraclejetLibStrings.stepped | atOracleOraclejetLib.atOracleOraclejetLibStrings.centeredStepped | atOracleOraclejetLib.atOracleOraclejetLibStrings.segmented | atOracleOraclejetLib.atOracleOraclejetLibStrings.centeredSegmented | atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.straight,
    lineWidth: scala.Double,
    lowColor: java.lang.String,
    markerShape: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.circle | atOracleOraclejetLib.atOracleOraclejetLibStrings.diamond | atOracleOraclejetLib.atOracleOraclejetLibStrings.human | atOracleOraclejetLib.atOracleOraclejetLibStrings.plus | atOracleOraclejetLib.atOracleOraclejetLibStrings.square | atOracleOraclejetLib.atOracleOraclejetLibStrings.star | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleDown | atOracleOraclejetLib.atOracleOraclejetLibStrings.triangleUp | java.lang.String,
    markerSize: scala.Double,
    referenceObjects: js.Array[atOracleOraclejetLib.ojchartMod.ojSparkChartNs.ReferenceObject],
    svgClassName: java.lang.String,
    svgStyle: js.Object,
    tooltip: atOracleOraclejetLib.Anon_ContextRenderer,
    trackResize: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off,
    translations: atOracleOraclejetLib.Anon_ComponentNameLabelAndValue,
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.area | atOracleOraclejetLib.atOracleOraclejetLibStrings.lineWithArea | atOracleOraclejetLib.atOracleOraclejetLibStrings.bar | atOracleOraclejetLib.atOracleOraclejetLibStrings.line,
    visualEffects: atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto,
    animationDuration: scala.Int | scala.Double = null,
    data: atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D] = null
  ): ojSparkChartSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("animationOnDataChange")(animationOnDataChange.asInstanceOf[js.Any])
    __obj.updateDynamic("animationOnDisplay")(animationOnDisplay.asInstanceOf[js.Any])
    __obj.updateDynamic("areaColor")(areaColor)
    __obj.updateDynamic("areaSvgClassName")(areaSvgClassName)
    __obj.updateDynamic("areaSvgStyle")(areaSvgStyle)
    __obj.updateDynamic("as")(as)
    __obj.updateDynamic("barGapRatio")(barGapRatio)
    __obj.updateDynamic("baselineScaling")(baselineScaling.asInstanceOf[js.Any])
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("firstColor")(firstColor)
    __obj.updateDynamic("highColor")(highColor)
    __obj.updateDynamic("lastColor")(lastColor)
    __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    __obj.updateDynamic("lineType")(lineType.asInstanceOf[js.Any])
    __obj.updateDynamic("lineWidth")(lineWidth)
    __obj.updateDynamic("lowColor")(lowColor)
    __obj.updateDynamic("markerShape")(markerShape.asInstanceOf[js.Any])
    __obj.updateDynamic("markerSize")(markerSize)
    __obj.updateDynamic("referenceObjects")(referenceObjects)
    __obj.updateDynamic("svgClassName")(svgClassName)
    __obj.updateDynamic("svgStyle")(svgStyle)
    __obj.updateDynamic("tooltip")(tooltip)
    __obj.updateDynamic("trackResize")(trackResize.asInstanceOf[js.Any])
    __obj.updateDynamic("translations")(translations)
    __obj.updateDynamic("visualEffects")(visualEffects.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[ojSparkChartSettableProperties[K, D]]
  }
}

