package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.aboveMarker
import typings.oracleOraclejet.oracleOraclejetStrings.afterMarker
import typings.oracleOraclejet.oracleOraclejetStrings.all
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.beforeMarker
import typings.oracleOraclejet.oracleOraclejetStrings.belowMarker
import typings.oracleOraclejet.oracleOraclejetStrings.center
import typings.oracleOraclejet.oracleOraclejetStrings.centeredSegmented
import typings.oracleOraclejet.oracleOraclejetStrings.centeredStepped
import typings.oracleOraclejet.oracleOraclejetStrings.circle
import typings.oracleOraclejet.oracleOraclejetStrings.color
import typings.oracleOraclejet.oracleOraclejetStrings.curved
import typings.oracleOraclejet.oracleOraclejetStrings.dashed
import typings.oracleOraclejet.oracleOraclejetStrings.diamond
import typings.oracleOraclejet.oracleOraclejetStrings.dotted
import typings.oracleOraclejet.oracleOraclejetStrings.explode
import typings.oracleOraclejet.oracleOraclejetStrings.gradient
import typings.oracleOraclejet.oracleOraclejetStrings.highlight
import typings.oracleOraclejet.oracleOraclejetStrings.highlightAndExplode
import typings.oracleOraclejet.oracleOraclejetStrings.human
import typings.oracleOraclejet.oracleOraclejetStrings.insideBarEdge
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.outsideBarEdge
import typings.oracleOraclejet.oracleOraclejetStrings.outsideSlice
import typings.oracleOraclejet.oracleOraclejetStrings.pattern
import typings.oracleOraclejet.oracleOraclejetStrings.plus
import typings.oracleOraclejet.oracleOraclejetStrings.segmented
import typings.oracleOraclejet.oracleOraclejetStrings.solid
import typings.oracleOraclejet.oracleOraclejetStrings.square
import typings.oracleOraclejet.oracleOraclejetStrings.star
import typings.oracleOraclejet.oracleOraclejetStrings.stepped
import typings.oracleOraclejet.oracleOraclejetStrings.straight
import typings.oracleOraclejet.oracleOraclejetStrings.triangleDown
import typings.oracleOraclejet.oracleOraclejetStrings.triangleUp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationDownColor extends StObject {
  
  var animationDownColor: String
  
  var animationDuration: Double
  
  var animationIndicators: none | all
  
  var animationUpColor: String
  
  var barGapRatio: Double
  
  var borderColor: String
  
  var borderWidth: Double
  
  var boxPlot: MedianSvgClassName
  
  var colors: js.Array[String]
  
  var dataCursor: LineColor
  
  var dataItemGaps: String
  
  var dataLabelPosition: center | outsideSlice | aboveMarker | belowMarker | beforeMarker | afterMarker | insideBarEdge | outsideBarEdge | none | auto
  
  var dataLabelStyle: js.Object | js.Array[js.Object]
  
  var funnelBackgroundColor: String
  
  var groupSeparators: Rendered
  
  var hoverBehaviorDelay: Double
  
  var lineStyle: dotted | dashed | solid
  
  var lineType: straight | curved | stepped | centeredStepped | segmented | centeredSegmented | none | auto
  
  var lineWidth: Double
  
  var markerColor: String
  
  var markerDisplayed: on | off | auto
  
  var markerShape: js.UndefOr[
    auto | circle | diamond | human | plus | square | star | triangleDown | triangleUp | String
  ] = js.undefined
  
  var markerSize: Double
  
  var marqueeBorderColor: String
  
  var marqueeColor: String
  
  var maxBarWidth: Double
  
  var otherColor: String
  
  var patterns: js.Array[String]
  
  var pieFeelerColor: String
  
  var pieInnerRadius: Double
  
  var selectionEffect: explode | highlightAndExplode | highlight
  
  var seriesEffect: color | pattern | gradient
  
  var shapes: js.Array[String]
  
  var stackLabelStyle: js.Object
  
  var stockFallingColor: String
  
  var stockRangeColor: String
  
  var stockRisingColor: String
  
  var stockVolumeColor: String
  
  var threeDEffect: on | off
  
  var tooltipLabelStyle: js.Object
  
  var tooltipValueStyle: js.Object
}
object AnimationDownColor {
  
  inline def apply(
    animationDownColor: String,
    animationDuration: Double,
    animationIndicators: none | all,
    animationUpColor: String,
    barGapRatio: Double,
    borderColor: String,
    borderWidth: Double,
    boxPlot: MedianSvgClassName,
    colors: js.Array[String],
    dataCursor: LineColor,
    dataItemGaps: String,
    dataLabelPosition: center | outsideSlice | aboveMarker | belowMarker | beforeMarker | afterMarker | insideBarEdge | outsideBarEdge | none | auto,
    dataLabelStyle: js.Object | js.Array[js.Object],
    funnelBackgroundColor: String,
    groupSeparators: Rendered,
    hoverBehaviorDelay: Double,
    lineStyle: dotted | dashed | solid,
    lineType: straight | curved | stepped | centeredStepped | segmented | centeredSegmented | none | auto,
    lineWidth: Double,
    markerColor: String,
    markerDisplayed: on | off | auto,
    markerSize: Double,
    marqueeBorderColor: String,
    marqueeColor: String,
    maxBarWidth: Double,
    otherColor: String,
    patterns: js.Array[String],
    pieFeelerColor: String,
    pieInnerRadius: Double,
    selectionEffect: explode | highlightAndExplode | highlight,
    seriesEffect: color | pattern | gradient,
    shapes: js.Array[String],
    stackLabelStyle: js.Object,
    stockFallingColor: String,
    stockRangeColor: String,
    stockRisingColor: String,
    stockVolumeColor: String,
    threeDEffect: on | off,
    tooltipLabelStyle: js.Object,
    tooltipValueStyle: js.Object
  ): AnimationDownColor = {
    val __obj = js.Dynamic.literal(animationDownColor = animationDownColor.asInstanceOf[js.Any], animationDuration = animationDuration.asInstanceOf[js.Any], animationIndicators = animationIndicators.asInstanceOf[js.Any], animationUpColor = animationUpColor.asInstanceOf[js.Any], barGapRatio = barGapRatio.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], boxPlot = boxPlot.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], dataCursor = dataCursor.asInstanceOf[js.Any], dataItemGaps = dataItemGaps.asInstanceOf[js.Any], dataLabelPosition = dataLabelPosition.asInstanceOf[js.Any], dataLabelStyle = dataLabelStyle.asInstanceOf[js.Any], funnelBackgroundColor = funnelBackgroundColor.asInstanceOf[js.Any], groupSeparators = groupSeparators.asInstanceOf[js.Any], hoverBehaviorDelay = hoverBehaviorDelay.asInstanceOf[js.Any], lineStyle = lineStyle.asInstanceOf[js.Any], lineType = lineType.asInstanceOf[js.Any], lineWidth = lineWidth.asInstanceOf[js.Any], markerColor = markerColor.asInstanceOf[js.Any], markerDisplayed = markerDisplayed.asInstanceOf[js.Any], markerSize = markerSize.asInstanceOf[js.Any], marqueeBorderColor = marqueeBorderColor.asInstanceOf[js.Any], marqueeColor = marqueeColor.asInstanceOf[js.Any], maxBarWidth = maxBarWidth.asInstanceOf[js.Any], otherColor = otherColor.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any], pieFeelerColor = pieFeelerColor.asInstanceOf[js.Any], pieInnerRadius = pieInnerRadius.asInstanceOf[js.Any], selectionEffect = selectionEffect.asInstanceOf[js.Any], seriesEffect = seriesEffect.asInstanceOf[js.Any], shapes = shapes.asInstanceOf[js.Any], stackLabelStyle = stackLabelStyle.asInstanceOf[js.Any], stockFallingColor = stockFallingColor.asInstanceOf[js.Any], stockRangeColor = stockRangeColor.asInstanceOf[js.Any], stockRisingColor = stockRisingColor.asInstanceOf[js.Any], stockVolumeColor = stockVolumeColor.asInstanceOf[js.Any], threeDEffect = threeDEffect.asInstanceOf[js.Any], tooltipLabelStyle = tooltipLabelStyle.asInstanceOf[js.Any], tooltipValueStyle = tooltipValueStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationDownColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnimationDownColor] (val x: Self) extends AnyVal {
    
    inline def setAnimationDownColor(value: String): Self = StObject.set(x, "animationDownColor", value.asInstanceOf[js.Any])
    
    inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    inline def setAnimationIndicators(value: none | all): Self = StObject.set(x, "animationIndicators", value.asInstanceOf[js.Any])
    
    inline def setAnimationUpColor(value: String): Self = StObject.set(x, "animationUpColor", value.asInstanceOf[js.Any])
    
    inline def setBarGapRatio(value: Double): Self = StObject.set(x, "barGapRatio", value.asInstanceOf[js.Any])
    
    inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBoxPlot(value: MedianSvgClassName): Self = StObject.set(x, "boxPlot", value.asInstanceOf[js.Any])
    
    inline def setColors(value: js.Array[String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setDataCursor(value: LineColor): Self = StObject.set(x, "dataCursor", value.asInstanceOf[js.Any])
    
    inline def setDataItemGaps(value: String): Self = StObject.set(x, "dataItemGaps", value.asInstanceOf[js.Any])
    
    inline def setDataLabelPosition(
      value: center | outsideSlice | aboveMarker | belowMarker | beforeMarker | afterMarker | insideBarEdge | outsideBarEdge | none | auto
    ): Self = StObject.set(x, "dataLabelPosition", value.asInstanceOf[js.Any])
    
    inline def setDataLabelStyle(value: js.Object | js.Array[js.Object]): Self = StObject.set(x, "dataLabelStyle", value.asInstanceOf[js.Any])
    
    inline def setDataLabelStyleVarargs(value: js.Object*): Self = StObject.set(x, "dataLabelStyle", js.Array(value*))
    
    inline def setFunnelBackgroundColor(value: String): Self = StObject.set(x, "funnelBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setGroupSeparators(value: Rendered): Self = StObject.set(x, "groupSeparators", value.asInstanceOf[js.Any])
    
    inline def setHoverBehaviorDelay(value: Double): Self = StObject.set(x, "hoverBehaviorDelay", value.asInstanceOf[js.Any])
    
    inline def setLineStyle(value: dotted | dashed | solid): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
    
    inline def setLineType(value: straight | curved | stepped | centeredStepped | segmented | centeredSegmented | none | auto): Self = StObject.set(x, "lineType", value.asInstanceOf[js.Any])
    
    inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    inline def setMarkerColor(value: String): Self = StObject.set(x, "markerColor", value.asInstanceOf[js.Any])
    
    inline def setMarkerDisplayed(value: on | off | auto): Self = StObject.set(x, "markerDisplayed", value.asInstanceOf[js.Any])
    
    inline def setMarkerShape(value: auto | circle | diamond | human | plus | square | star | triangleDown | triangleUp | String): Self = StObject.set(x, "markerShape", value.asInstanceOf[js.Any])
    
    inline def setMarkerShapeUndefined: Self = StObject.set(x, "markerShape", js.undefined)
    
    inline def setMarkerSize(value: Double): Self = StObject.set(x, "markerSize", value.asInstanceOf[js.Any])
    
    inline def setMarqueeBorderColor(value: String): Self = StObject.set(x, "marqueeBorderColor", value.asInstanceOf[js.Any])
    
    inline def setMarqueeColor(value: String): Self = StObject.set(x, "marqueeColor", value.asInstanceOf[js.Any])
    
    inline def setMaxBarWidth(value: Double): Self = StObject.set(x, "maxBarWidth", value.asInstanceOf[js.Any])
    
    inline def setOtherColor(value: String): Self = StObject.set(x, "otherColor", value.asInstanceOf[js.Any])
    
    inline def setPatterns(value: js.Array[String]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
    
    inline def setPatternsVarargs(value: String*): Self = StObject.set(x, "patterns", js.Array(value*))
    
    inline def setPieFeelerColor(value: String): Self = StObject.set(x, "pieFeelerColor", value.asInstanceOf[js.Any])
    
    inline def setPieInnerRadius(value: Double): Self = StObject.set(x, "pieInnerRadius", value.asInstanceOf[js.Any])
    
    inline def setSelectionEffect(value: explode | highlightAndExplode | highlight): Self = StObject.set(x, "selectionEffect", value.asInstanceOf[js.Any])
    
    inline def setSeriesEffect(value: color | pattern | gradient): Self = StObject.set(x, "seriesEffect", value.asInstanceOf[js.Any])
    
    inline def setShapes(value: js.Array[String]): Self = StObject.set(x, "shapes", value.asInstanceOf[js.Any])
    
    inline def setShapesVarargs(value: String*): Self = StObject.set(x, "shapes", js.Array(value*))
    
    inline def setStackLabelStyle(value: js.Object): Self = StObject.set(x, "stackLabelStyle", value.asInstanceOf[js.Any])
    
    inline def setStockFallingColor(value: String): Self = StObject.set(x, "stockFallingColor", value.asInstanceOf[js.Any])
    
    inline def setStockRangeColor(value: String): Self = StObject.set(x, "stockRangeColor", value.asInstanceOf[js.Any])
    
    inline def setStockRisingColor(value: String): Self = StObject.set(x, "stockRisingColor", value.asInstanceOf[js.Any])
    
    inline def setStockVolumeColor(value: String): Self = StObject.set(x, "stockVolumeColor", value.asInstanceOf[js.Any])
    
    inline def setThreeDEffect(value: on | off): Self = StObject.set(x, "threeDEffect", value.asInstanceOf[js.Any])
    
    inline def setTooltipLabelStyle(value: js.Object): Self = StObject.set(x, "tooltipLabelStyle", value.asInstanceOf[js.Any])
    
    inline def setTooltipValueStyle(value: js.Object): Self = StObject.set(x, "tooltipValueStyle", value.asInstanceOf[js.Any])
  }
}
