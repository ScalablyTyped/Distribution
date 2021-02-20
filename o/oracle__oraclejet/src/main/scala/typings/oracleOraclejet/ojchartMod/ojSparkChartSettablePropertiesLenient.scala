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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class ojSparkChartSettablePropertiesLenientMutableBuilder[Self <: ojSparkChartSettablePropertiesLenient[_, _], K, D] (val x: Self with (ojSparkChartSettablePropertiesLenient[K, D])) extends AnyVal {
    
    @scala.inline
    def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationDurationNull: Self = StObject.set(x, "animationDuration", null)
    
    @scala.inline
    def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
    
    @scala.inline
    def setAnimationOnDataChange(value: auto | none): Self = StObject.set(x, "animationOnDataChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationOnDataChangeUndefined: Self = StObject.set(x, "animationOnDataChange", js.undefined)
    
    @scala.inline
    def setAnimationOnDisplay(value: auto | none): Self = StObject.set(x, "animationOnDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationOnDisplayUndefined: Self = StObject.set(x, "animationOnDisplay", js.undefined)
    
    @scala.inline
    def setAreaColor(value: String): Self = StObject.set(x, "areaColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAreaColorUndefined: Self = StObject.set(x, "areaColor", js.undefined)
    
    @scala.inline
    def setAreaSvgClassName(value: String): Self = StObject.set(x, "areaSvgClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAreaSvgClassNameUndefined: Self = StObject.set(x, "areaSvgClassName", js.undefined)
    
    @scala.inline
    def setAreaSvgStyle(value: js.Object): Self = StObject.set(x, "areaSvgStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAreaSvgStyleUndefined: Self = StObject.set(x, "areaSvgStyle", js.undefined)
    
    @scala.inline
    def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    @scala.inline
    def setBarGapRatio(value: Double): Self = StObject.set(x, "barGapRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarGapRatioUndefined: Self = StObject.set(x, "barGapRatio", js.undefined)
    
    @scala.inline
    def setBaselineScaling(value: zero | min): Self = StObject.set(x, "baselineScaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaselineScalingUndefined: Self = StObject.set(x, "baselineScaling", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setData(value: DataProvider[K, D]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataNull: Self = StObject.set(x, "data", null)
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setFirstColor(value: String): Self = StObject.set(x, "firstColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstColorUndefined: Self = StObject.set(x, "firstColor", js.undefined)
    
    @scala.inline
    def setHighColor(value: String): Self = StObject.set(x, "highColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighColorUndefined: Self = StObject.set(x, "highColor", js.undefined)
    
    @scala.inline
    def setLastColor(value: String): Self = StObject.set(x, "lastColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastColorUndefined: Self = StObject.set(x, "lastColor", js.undefined)
    
    @scala.inline
    def setLineStyle(value: dotted | dashed | solid): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineStyleUndefined: Self = StObject.set(x, "lineStyle", js.undefined)
    
    @scala.inline
    def setLineType(value: curved | stepped | centeredStepped | segmented | centeredSegmented | none | straight): Self = StObject.set(x, "lineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineTypeUndefined: Self = StObject.set(x, "lineType", js.undefined)
    
    @scala.inline
    def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
    
    @scala.inline
    def setLowColor(value: String): Self = StObject.set(x, "lowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowColorUndefined: Self = StObject.set(x, "lowColor", js.undefined)
    
    @scala.inline
    def setMarkerShape(value: auto | circle | diamond | human | plus | square | star | triangleDown | triangleUp | String): Self = StObject.set(x, "markerShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerShapeUndefined: Self = StObject.set(x, "markerShape", js.undefined)
    
    @scala.inline
    def setMarkerSize(value: Double): Self = StObject.set(x, "markerSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerSizeUndefined: Self = StObject.set(x, "markerSize", js.undefined)
    
    @scala.inline
    def setReferenceObjects(value: js.Array[ReferenceObject]): Self = StObject.set(x, "referenceObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceObjectsUndefined: Self = StObject.set(x, "referenceObjects", js.undefined)
    
    @scala.inline
    def setReferenceObjectsVarargs(value: ReferenceObject*): Self = StObject.set(x, "referenceObjects", js.Array(value :_*))
    
    @scala.inline
    def setSvgClassName(value: String): Self = StObject.set(x, "svgClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSvgClassNameUndefined: Self = StObject.set(x, "svgClassName", js.undefined)
    
    @scala.inline
    def setSvgStyle(value: js.Object): Self = StObject.set(x, "svgStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSvgStyleUndefined: Self = StObject.set(x, "svgStyle", js.undefined)
    
    @scala.inline
    def setTooltip(value: `0`): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    @scala.inline
    def setTrackResize(value: on | off): Self = StObject.set(x, "trackResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackResizeUndefined: Self = StObject.set(x, "trackResize", js.undefined)
    
    @scala.inline
    def setTranslations(value: LabelAndValue): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    
    @scala.inline
    def setType(value: area | lineWithArea | bar | line): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setVisualEffects(value: none | auto): Self = StObject.set(x, "visualEffects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisualEffectsUndefined: Self = StObject.set(x, "visualEffects", js.undefined)
  }
}
