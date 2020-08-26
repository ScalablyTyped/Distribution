package typings.oracleOraclejet.ojchartMod

import typings.oracleOraclejet.anon.LabelAndValue
import typings.oracleOraclejet.anon.`0`
import typings.oracleOraclejet.ojchartMod.ojSparkChart.ReferenceObject
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.ojdvtBaseMod.dvtBaseComponentSettableProperties
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

@js.native
trait ojSparkChartSettableProperties[K, D] extends dvtBaseComponentSettableProperties {
  var animationDuration: Double | Null = js.native
  var animationOnDataChange: auto | none = js.native
  var animationOnDisplay: auto | none = js.native
  var areaColor: String = js.native
  var areaSvgClassName: String = js.native
  var areaSvgStyle: js.Object = js.native
  var as: String = js.native
  var barGapRatio: Double = js.native
  var baselineScaling: zero | min = js.native
  var color: String = js.native
  var data: (DataProvider[K, D]) | Null = js.native
  var firstColor: String = js.native
  var highColor: String = js.native
  var lastColor: String = js.native
  var lineStyle: dotted | dashed | solid = js.native
  var lineType: curved | stepped | centeredStepped | segmented | centeredSegmented | none | straight = js.native
  var lineWidth: Double = js.native
  var lowColor: String = js.native
  var markerShape: auto | circle | diamond | human | plus | square | star | triangleDown | triangleUp | String = js.native
  var markerSize: Double = js.native
  var referenceObjects: js.Array[ReferenceObject] = js.native
  var svgClassName: String = js.native
  var svgStyle: js.Object = js.native
  var tooltip: `0` = js.native
  @JSName("translations")
  var translations_ojSparkChartSettableProperties: LabelAndValue = js.native
  var `type`: area | lineWithArea | bar | line = js.native
  var visualEffects: none | auto = js.native
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
    tooltip: `0`,
    trackResize: on | off,
    translations: LabelAndValue,
    `type`: area | lineWithArea | bar | line,
    visualEffects: none | auto
  ): ojSparkChartSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(animationOnDataChange = animationOnDataChange.asInstanceOf[js.Any], animationOnDisplay = animationOnDisplay.asInstanceOf[js.Any], areaColor = areaColor.asInstanceOf[js.Any], areaSvgClassName = areaSvgClassName.asInstanceOf[js.Any], areaSvgStyle = areaSvgStyle.asInstanceOf[js.Any], as = as.asInstanceOf[js.Any], barGapRatio = barGapRatio.asInstanceOf[js.Any], baselineScaling = baselineScaling.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], firstColor = firstColor.asInstanceOf[js.Any], highColor = highColor.asInstanceOf[js.Any], lastColor = lastColor.asInstanceOf[js.Any], lineStyle = lineStyle.asInstanceOf[js.Any], lineType = lineType.asInstanceOf[js.Any], lineWidth = lineWidth.asInstanceOf[js.Any], lowColor = lowColor.asInstanceOf[js.Any], markerShape = markerShape.asInstanceOf[js.Any], markerSize = markerSize.asInstanceOf[js.Any], referenceObjects = referenceObjects.asInstanceOf[js.Any], svgClassName = svgClassName.asInstanceOf[js.Any], svgStyle = svgStyle.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], visualEffects = visualEffects.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojSparkChartSettableProperties[K, D]]
  }
  @scala.inline
  implicit class ojSparkChartSettablePropertiesOps[Self <: ojSparkChartSettableProperties[_, _], K, D] (val x: Self with (ojSparkChartSettableProperties[K, D])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnimationOnDataChange(value: auto | none): Self = this.set("animationOnDataChange", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimationOnDisplay(value: auto | none): Self = this.set("animationOnDisplay", value.asInstanceOf[js.Any])
    @scala.inline
    def setAreaColor(value: String): Self = this.set("areaColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setAreaSvgClassName(value: String): Self = this.set("areaSvgClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def setAreaSvgStyle(value: js.Object): Self = this.set("areaSvgStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setAs(value: String): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def setBarGapRatio(value: Double): Self = this.set("barGapRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def setBaselineScaling(value: zero | min): Self = this.set("baselineScaling", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirstColor(value: String): Self = this.set("firstColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setHighColor(value: String): Self = this.set("highColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastColor(value: String): Self = this.set("lastColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineStyle(value: dotted | dashed | solid): Self = this.set("lineStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineType(value: curved | stepped | centeredStepped | segmented | centeredSegmented | none | straight): Self = this.set("lineType", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineWidth(value: Double): Self = this.set("lineWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setLowColor(value: String): Self = this.set("lowColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarkerShape(value: auto | circle | diamond | human | plus | square | star | triangleDown | triangleUp | String): Self = this.set("markerShape", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarkerSize(value: Double): Self = this.set("markerSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setReferenceObjectsVarargs(value: ReferenceObject*): Self = this.set("referenceObjects", js.Array(value :_*))
    @scala.inline
    def setReferenceObjects(value: js.Array[ReferenceObject]): Self = this.set("referenceObjects", value.asInstanceOf[js.Any])
    @scala.inline
    def setSvgClassName(value: String): Self = this.set("svgClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSvgStyle(value: js.Object): Self = this.set("svgStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setTooltip(value: `0`): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def setTranslations(value: LabelAndValue): Self = this.set("translations", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: area | lineWithArea | bar | line): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisualEffects(value: none | auto): Self = this.set("visualEffects", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimationDuration(value: Double): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimationDurationNull: Self = this.set("animationDuration", null)
    @scala.inline
    def setData(value: DataProvider[K, D]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataNull: Self = this.set("data", null)
  }
  
}

