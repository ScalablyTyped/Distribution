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
@js.native
trait ojSparkChartSettablePropertiesLenient[K, D]
  extends /* key */ StringDictionary[js.Any] {
  var animationDuration: js.UndefOr[Double | Null] = js.native
  var animationOnDataChange: js.UndefOr[auto | none] = js.native
  var animationOnDisplay: js.UndefOr[auto | none] = js.native
  var areaColor: js.UndefOr[String] = js.native
  var areaSvgClassName: js.UndefOr[String] = js.native
  var areaSvgStyle: js.UndefOr[js.Object] = js.native
  var as: js.UndefOr[String] = js.native
  var barGapRatio: js.UndefOr[Double] = js.native
  var baselineScaling: js.UndefOr[zero | min] = js.native
  var color: js.UndefOr[String] = js.native
  var data: js.UndefOr[(DataProvider[K, D]) | Null] = js.native
  var firstColor: js.UndefOr[String] = js.native
  var highColor: js.UndefOr[String] = js.native
  var lastColor: js.UndefOr[String] = js.native
  var lineStyle: js.UndefOr[dotted | dashed | solid] = js.native
  var lineType: js.UndefOr[
    curved | stepped | centeredStepped | segmented | centeredSegmented | none | straight
  ] = js.native
  var lineWidth: js.UndefOr[Double] = js.native
  var lowColor: js.UndefOr[String] = js.native
  var markerShape: js.UndefOr[
    auto | circle | diamond | human | plus | square | star | triangleDown | triangleUp | String
  ] = js.native
  var markerSize: js.UndefOr[Double] = js.native
  var referenceObjects: js.UndefOr[js.Array[ReferenceObject]] = js.native
  var svgClassName: js.UndefOr[String] = js.native
  var svgStyle: js.UndefOr[js.Object] = js.native
  var tooltip: js.UndefOr[`0`] = js.native
  var trackResize: js.UndefOr[on | off] = js.native
  var translations: js.UndefOr[LabelAndValue] = js.native
  var `type`: js.UndefOr[area | lineWithArea | bar | line] = js.native
  var visualEffects: js.UndefOr[none | auto] = js.native
}

object ojSparkChartSettablePropertiesLenient {
  @scala.inline
  def apply[K, D](): ojSparkChartSettablePropertiesLenient[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojSparkChartSettablePropertiesLenient[K, D]]
  }
  @scala.inline
  implicit class ojSparkChartSettablePropertiesLenientOps[Self <: ojSparkChartSettablePropertiesLenient[_, _], K, D] (val x: Self with (ojSparkChartSettablePropertiesLenient[K, D])) extends AnyVal {
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
    def setAnimationDuration(value: Double): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationDuration: Self = this.set("animationDuration", js.undefined)
    @scala.inline
    def setAnimationDurationNull: Self = this.set("animationDuration", null)
    @scala.inline
    def setAnimationOnDataChange(value: auto | none): Self = this.set("animationOnDataChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationOnDataChange: Self = this.set("animationOnDataChange", js.undefined)
    @scala.inline
    def setAnimationOnDisplay(value: auto | none): Self = this.set("animationOnDisplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationOnDisplay: Self = this.set("animationOnDisplay", js.undefined)
    @scala.inline
    def setAreaColor(value: String): Self = this.set("areaColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAreaColor: Self = this.set("areaColor", js.undefined)
    @scala.inline
    def setAreaSvgClassName(value: String): Self = this.set("areaSvgClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAreaSvgClassName: Self = this.set("areaSvgClassName", js.undefined)
    @scala.inline
    def setAreaSvgStyle(value: js.Object): Self = this.set("areaSvgStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAreaSvgStyle: Self = this.set("areaSvgStyle", js.undefined)
    @scala.inline
    def setAs(value: String): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setBarGapRatio(value: Double): Self = this.set("barGapRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBarGapRatio: Self = this.set("barGapRatio", js.undefined)
    @scala.inline
    def setBaselineScaling(value: zero | min): Self = this.set("baselineScaling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaselineScaling: Self = this.set("baselineScaling", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setData(value: DataProvider[K, D]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDataNull: Self = this.set("data", null)
    @scala.inline
    def setFirstColor(value: String): Self = this.set("firstColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstColor: Self = this.set("firstColor", js.undefined)
    @scala.inline
    def setHighColor(value: String): Self = this.set("highColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighColor: Self = this.set("highColor", js.undefined)
    @scala.inline
    def setLastColor(value: String): Self = this.set("lastColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastColor: Self = this.set("lastColor", js.undefined)
    @scala.inline
    def setLineStyle(value: dotted | dashed | solid): Self = this.set("lineStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineStyle: Self = this.set("lineStyle", js.undefined)
    @scala.inline
    def setLineType(value: curved | stepped | centeredStepped | segmented | centeredSegmented | none | straight): Self = this.set("lineType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineType: Self = this.set("lineType", js.undefined)
    @scala.inline
    def setLineWidth(value: Double): Self = this.set("lineWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineWidth: Self = this.set("lineWidth", js.undefined)
    @scala.inline
    def setLowColor(value: String): Self = this.set("lowColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLowColor: Self = this.set("lowColor", js.undefined)
    @scala.inline
    def setMarkerShape(value: auto | circle | diamond | human | plus | square | star | triangleDown | triangleUp | String): Self = this.set("markerShape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerShape: Self = this.set("markerShape", js.undefined)
    @scala.inline
    def setMarkerSize(value: Double): Self = this.set("markerSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerSize: Self = this.set("markerSize", js.undefined)
    @scala.inline
    def setReferenceObjectsVarargs(value: ReferenceObject*): Self = this.set("referenceObjects", js.Array(value :_*))
    @scala.inline
    def setReferenceObjects(value: js.Array[ReferenceObject]): Self = this.set("referenceObjects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferenceObjects: Self = this.set("referenceObjects", js.undefined)
    @scala.inline
    def setSvgClassName(value: String): Self = this.set("svgClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSvgClassName: Self = this.set("svgClassName", js.undefined)
    @scala.inline
    def setSvgStyle(value: js.Object): Self = this.set("svgStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSvgStyle: Self = this.set("svgStyle", js.undefined)
    @scala.inline
    def setTooltip(value: `0`): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setTrackResize(value: on | off): Self = this.set("trackResize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackResize: Self = this.set("trackResize", js.undefined)
    @scala.inline
    def setTranslations(value: LabelAndValue): Self = this.set("translations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslations: Self = this.set("translations", js.undefined)
    @scala.inline
    def setType(value: area | lineWithArea | bar | line): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setVisualEffects(value: none | auto): Self = this.set("visualEffects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisualEffects: Self = this.set("visualEffects", js.undefined)
  }
  
}

